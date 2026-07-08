package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21186417va {
    public static final EnumC21186417va COMMON_ERROR;
    public static final EnumC21186417va CONDITION_NOT_SATISFIED;
    public static final EnumC21186417va EMPTY;
    public static final /* synthetic */ EnumC21186417va[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21186417va MISSING;
    public static final EnumC21186417va NOT_EQUAL_TO_TARGET;
    public static final EnumC21186417va OUT_OF_RANGE;
    public static final EnumC21186417va REDUNDANT;
    public static final EnumC21186417va REGEX_ERROR;
    public static final EnumC21186417va SUCCESS;
    public static final EnumC21186417va SYNTAX_ERROR;
    public static final EnumC21186417va WRONG_TYPE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC21186417va> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21186417va enumC21186417va = new EnumC21186417va("SUCCESS", 0, 100);
        SUCCESS = enumC21186417va;
        EnumC21186417va enumC21186417va2 = new EnumC21186417va("MISSING", 1, 101);
        MISSING = enumC21186417va2;
        EnumC21186417va enumC21186417va3 = new EnumC21186417va("WRONG_TYPE", 2, 102);
        WRONG_TYPE = enumC21186417va3;
        EnumC21186417va enumC21186417va4 = new EnumC21186417va("REDUNDANT", 3, 103);
        REDUNDANT = enumC21186417va4;
        EnumC21186417va enumC21186417va5 = new EnumC21186417va("OUT_OF_RANGE", 4, 104);
        OUT_OF_RANGE = enumC21186417va5;
        EnumC21186417va enumC21186417va6 = new EnumC21186417va("COMMON_ERROR", 5, 200);
        COMMON_ERROR = enumC21186417va6;
        EnumC21186417va enumC21186417va7 = new EnumC21186417va("CONDITION_NOT_SATISFIED", 6, 207);
        CONDITION_NOT_SATISFIED = enumC21186417va7;
        EnumC21186417va enumC21186417va8 = new EnumC21186417va("NOT_EQUAL_TO_TARGET", 7, 208);
        NOT_EQUAL_TO_TARGET = enumC21186417va8;
        EnumC21186417va enumC21186417va9 = new EnumC21186417va("REGEX_ERROR", 8, 209);
        REGEX_ERROR = enumC21186417va9;
        EnumC21186417va enumC21186417va10 = new EnumC21186417va("EMPTY", 9, 210);
        EMPTY = enumC21186417va10;
        EnumC21186417va enumC21186417va11 = new EnumC21186417va("SYNTAX_ERROR", 10, 211);
        SYNTAX_ERROR = enumC21186417va11;
        EnumC21186417va[] enumC21186417vaArr = {enumC21186417va, enumC21186417va2, enumC21186417va3, enumC21186417va4, enumC21186417va5, enumC21186417va6, enumC21186417va7, enumC21186417va8, enumC21186417va9, enumC21186417va10, enumC21186417va11};
        LLILLJJLI = enumC21186417vaArr;
        LLILLL = new C2254308sP(enumC21186417vaArr);
    }

    public static EnumC21186417va[] values() {
        return (EnumC21186417va[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC21186417va valueOf(String str) {
        return (EnumC21186417va) C08FF.LIZ(EnumC21186417va.class, str);
    }

    public EnumC21186417va(String str, int i, int i2) {
        this.LL = i2;
    }
}
