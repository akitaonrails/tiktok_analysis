package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993130bx1 {
    public static final EnumC993130bx1 INVALID_TAB_ID;
    public static final /* synthetic */ EnumC993130bx1[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC993130bx1 NOT_IN_LIST;
    public static final EnumC993130bx1 WITHOUT_MULTI_TAB;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993130bx1> getEntries() {
        return LLILZ;
    }

    static {
        EnumC993130bx1 enumC993130bx1 = new EnumC993130bx1("NOT_IN_LIST", 0, 1, "not in list");
        NOT_IN_LIST = enumC993130bx1;
        EnumC993130bx1 enumC993130bx12 = new EnumC993130bx1("INVALID_TAB_ID", 1, 2, "invalid tab id");
        INVALID_TAB_ID = enumC993130bx12;
        EnumC993130bx1 enumC993130bx13 = new EnumC993130bx1("WITHOUT_MULTI_TAB", 2, 3, "without multi tab");
        WITHOUT_MULTI_TAB = enumC993130bx13;
        EnumC993130bx1[] enumC993130bx1Arr = {enumC993130bx1, enumC993130bx12, enumC993130bx13};
        LLILLL = enumC993130bx1Arr;
        LLILZ = new C2254308sP(enumC993130bx1Arr);
    }

    public static EnumC993130bx1[] values() {
        return (EnumC993130bx1[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC993130bx1 valueOf(String str) {
        return (EnumC993130bx1) C08FF.LIZ(EnumC993130bx1.class, str);
    }

    public EnumC993130bx1(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
