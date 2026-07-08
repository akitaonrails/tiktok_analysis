package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235150iFN {
    public static final EnumC1235150iFN EMAIL;
    public static final /* synthetic */ EnumC1235150iFN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235150iFN PHONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235150iFN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235150iFN enumC1235150iFN = new EnumC1235150iFN("EMAIL", 0, "email");
        EMAIL = enumC1235150iFN;
        EnumC1235150iFN enumC1235150iFN2 = new EnumC1235150iFN("PHONE", 1, "phone");
        PHONE = enumC1235150iFN2;
        EnumC1235150iFN[] enumC1235150iFNArr = {enumC1235150iFN, enumC1235150iFN2};
        LLILLJJLI = enumC1235150iFNArr;
        LLILLL = new C2254308sP(enumC1235150iFNArr);
    }

    public static EnumC1235150iFN[] values() {
        return (EnumC1235150iFN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235150iFN valueOf(String str) {
        return (EnumC1235150iFN) C08FF.LIZ(EnumC1235150iFN.class, str);
    }

    public EnumC1235150iFN(String str, int i, String str2) {
        this.LL = str2;
    }
}
