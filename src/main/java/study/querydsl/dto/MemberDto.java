package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {

    private String username;
    private int age;

    @QueryProjection // DTO도 Q 파일로 생성됨. -> 문제점은 Querydsl에 의존하게 되는 점
    public MemberDto(String username, int age){
        this.username = username;
        this.age = age;
    }
}
