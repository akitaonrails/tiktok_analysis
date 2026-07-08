package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12d8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19798012d8 {
    ADD(0),
    AND(1),
    APPLY(2),
    ASSIGN(3),
    BITWISE_AND(56),
    BITWISE_LEFT_SHIFT(57),
    BITWISE_NOT(58),
    BITWISE_OR(59),
    BITWISE_RIGHT_SHIFT(60),
    BITWISE_UNSIGNED_RIGHT_SHIFT(61),
    BITWISE_XOR(62),
    BLOCK(53),
    BREAK(4),
    CASE(5),
    CONST(52),
    CONTINUE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL(49),
    CREATE_ARRAY(7),
    CREATE_OBJECT(8),
    DEFAULT(9),
    DEFINE_FUNCTION(50),
    DIVIDE(10),
    /* JADX INFO: Fake field, exist only in values array */
    DO(11),
    EQUALS(12),
    EXPRESSION_LIST(13),
    FN(51),
    FOR_IN(47),
    FOR_IN_CONST(54),
    FOR_IN_LET(55),
    FOR_LET(63),
    FOR_OF(64),
    FOR_OF_CONST(65),
    FOR_OF_LET(66),
    GET(15),
    /* JADX INFO: Fake field, exist only in values array */
    GET_CONTAINER_VARIABLE(48),
    GET_INDEX(16),
    GET_PROPERTY(17),
    GREATER_THAN(18),
    GREATER_THAN_EQUALS(19),
    IDENTITY_EQUALS(20),
    IDENTITY_NOT_EQUALS(21),
    IF(22),
    LESS_THAN(23),
    LESS_THAN_EQUALS(24),
    MODULUS(25),
    MULTIPLY(26),
    NEGATE(27),
    NOT(28),
    NOT_EQUALS(29),
    NULL(45),
    OR(30),
    /* JADX INFO: Fake field, exist only in values array */
    PLUS_EQUALS(31),
    POST_DECREMENT(32),
    POST_INCREMENT(33),
    QUOTE(46),
    PRE_DECREMENT(34),
    PRE_INCREMENT(35),
    RETURN(36),
    SET_PROPERTY(43),
    SUBTRACT(37),
    SWITCH(38),
    TERNARY(39),
    TYPEOF(40),
    UNDEFINED(44),
    VAR(41),
    WHILE(42);

    public static final Map<Integer, EnumC19798012d8> LLILLJJLI = new HashMap();
    public final int LL;

    static {
        for (EnumC19798012d8 enumC19798012d8 : values()) {
            ((HashMap) LLILLJJLI).put(Integer.valueOf(enumC19798012d8.LL), enumC19798012d8);
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.LL).toString();
    }

    public static EnumC19798012d8 zza(int i) {
        return (EnumC19798012d8) ((HashMap) LLILLJJLI).get(Integer.valueOf(i));
    }

    EnumC19798012d8(int i) {
        if (i <= 100) {
            this.LL = i;
            return;
        }
        throw new AssertionError("Native functions over 100 are reserved for runtime implementations.");
    }
}
