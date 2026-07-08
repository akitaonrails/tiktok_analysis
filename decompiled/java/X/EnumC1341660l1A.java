package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341660l1A {
    public static final EnumC1341660l1A AU16_COMMENT_BAN;
    public static final EnumC1341660l1A AVAILABLE;
    public static final EnumC1341660l1A COMMENT_CLOSE;
    public static final EnumC1341660l1A COMMENT_LIMIT;
    public static final EnumC1341660l1A FUNCTION_BAN;
    public static final EnumC1341660l1A HISTORY_NO_PERMISSION;
    public static final /* synthetic */ EnumC1341660l1A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1341660l1A MANAGE_MODE;
    public static final EnumC1341660l1A STORY_EXPIRED;

    public static InterfaceC2044707zh<EnumC1341660l1A> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1341660l1A enumC1341660l1A = new EnumC1341660l1A("AVAILABLE", 0);
        AVAILABLE = enumC1341660l1A;
        EnumC1341660l1A enumC1341660l1A2 = new EnumC1341660l1A("COMMENT_CLOSE", 1);
        COMMENT_CLOSE = enumC1341660l1A2;
        EnumC1341660l1A enumC1341660l1A3 = new EnumC1341660l1A("COMMENT_LIMIT", 2);
        COMMENT_LIMIT = enumC1341660l1A3;
        EnumC1341660l1A enumC1341660l1A4 = new EnumC1341660l1A("MANAGE_MODE", 3);
        MANAGE_MODE = enumC1341660l1A4;
        EnumC1341660l1A enumC1341660l1A5 = new EnumC1341660l1A("HISTORY_NO_PERMISSION", 4);
        HISTORY_NO_PERMISSION = enumC1341660l1A5;
        EnumC1341660l1A enumC1341660l1A6 = new EnumC1341660l1A("FUNCTION_BAN", 5);
        FUNCTION_BAN = enumC1341660l1A6;
        EnumC1341660l1A enumC1341660l1A7 = new EnumC1341660l1A("AU16_COMMENT_BAN", 6);
        AU16_COMMENT_BAN = enumC1341660l1A7;
        EnumC1341660l1A enumC1341660l1A8 = new EnumC1341660l1A("STORY_EXPIRED", 7);
        STORY_EXPIRED = enumC1341660l1A8;
        EnumC1341660l1A[] enumC1341660l1AArr = {enumC1341660l1A, enumC1341660l1A2, enumC1341660l1A3, enumC1341660l1A4, enumC1341660l1A5, enumC1341660l1A6, enumC1341660l1A7, enumC1341660l1A8};
        LL = enumC1341660l1AArr;
        LLILLJJLI = new C2254308sP(enumC1341660l1AArr);
    }

    public static EnumC1341660l1A[] values() {
        return (EnumC1341660l1A[]) LL.clone();
    }

    public static EnumC1341660l1A valueOf(String str) {
        return (EnumC1341660l1A) C08FF.LIZ(EnumC1341660l1A.class, str);
    }

    public EnumC1341660l1A(String str, int i) {
    }
}
