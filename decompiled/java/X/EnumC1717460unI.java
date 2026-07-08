package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0unI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1717460unI {
    public static final EnumC1717460unI CHANGE;
    public static final EnumC1717460unI CREATE_PIN;
    public static final EnumC1717460unI FORGOT;
    public static final /* synthetic */ EnumC1717460unI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1717460unI REGISTER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1717460unI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1717460unI enumC1717460unI = new EnumC1717460unI("CHANGE", 0, "CHANGE_PIN");
        CHANGE = enumC1717460unI;
        EnumC1717460unI enumC1717460unI2 = new EnumC1717460unI("FORGOT", 1, "FORGOT_PIN");
        FORGOT = enumC1717460unI2;
        EnumC1717460unI enumC1717460unI3 = new EnumC1717460unI("REGISTER", 2, "REGISTER_PIN");
        REGISTER = enumC1717460unI3;
        EnumC1717460unI enumC1717460unI4 = new EnumC1717460unI("CREATE_PIN", 3, "CREATE_PIN");
        CREATE_PIN = enumC1717460unI4;
        EnumC1717460unI[] enumC1717460unIArr = {enumC1717460unI, enumC1717460unI2, enumC1717460unI3, enumC1717460unI4};
        LLILLJJLI = enumC1717460unIArr;
        LLILLL = new C2254308sP(enumC1717460unIArr);
    }

    public static EnumC1717460unI[] values() {
        return (EnumC1717460unI[]) LLILLJJLI.clone();
    }

    public final String getMode() {
        return this.LL;
    }

    public static EnumC1717460unI valueOf(String str) {
        return (EnumC1717460unI) C08FF.LIZ(EnumC1717460unI.class, str);
    }

    public EnumC1717460unI(String str, int i, String str2) {
        this.LL = str2;
    }
}
