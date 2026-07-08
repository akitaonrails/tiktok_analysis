package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0db3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1056390db3 {
    public static final EnumC1056390db3 EMAIL;
    public static final EnumC1056390db3 EXP_UNSTABLE;
    public static final /* synthetic */ EnumC1056390db3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1056390db3 NOT_FOUND;
    public static final EnumC1056390db3 NO_GRANT;
    public static final EnumC1056390db3 ON_PROCESSING;
    public static final EnumC1056390db3 PHONE_FILTER;
    public static final EnumC1056390db3 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1056390db3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1056390db3 enumC1056390db3 = new EnumC1056390db3("UNKNOWN", 0, 4);
        UNKNOWN = enumC1056390db3;
        EnumC1056390db3 enumC1056390db32 = new EnumC1056390db3("EXP_UNSTABLE", 1, -3);
        EXP_UNSTABLE = enumC1056390db32;
        EnumC1056390db3 enumC1056390db33 = new EnumC1056390db3("NO_GRANT", 2, -1);
        NO_GRANT = enumC1056390db33;
        EnumC1056390db3 enumC1056390db34 = new EnumC1056390db3("NOT_FOUND", 3, 0);
        NOT_FOUND = enumC1056390db34;
        EnumC1056390db3 enumC1056390db35 = new EnumC1056390db3("ON_PROCESSING", 4, 1);
        ON_PROCESSING = enumC1056390db35;
        EnumC1056390db3 enumC1056390db36 = new EnumC1056390db3("PHONE_FILTER", 5, 2);
        PHONE_FILTER = enumC1056390db36;
        EnumC1056390db3 enumC1056390db37 = new EnumC1056390db3("EMAIL", 6, 3);
        EMAIL = enumC1056390db37;
        EnumC1056390db3[] enumC1056390db3Arr = {enumC1056390db3, enumC1056390db32, enumC1056390db33, enumC1056390db34, enumC1056390db35, enumC1056390db36, enumC1056390db37};
        LLILLJJLI = enumC1056390db3Arr;
        LLILLL = new C2254308sP(enumC1056390db3Arr);
    }

    public static EnumC1056390db3[] values() {
        return (EnumC1056390db3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1056390db3 valueOf(String str) {
        return (EnumC1056390db3) C08FF.LIZ(EnumC1056390db3.class, str);
    }

    public EnumC1056390db3(String str, int i, int i2) {
        this.LL = i2;
    }
}
