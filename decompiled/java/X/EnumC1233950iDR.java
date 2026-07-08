package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1233950iDR {
    public static final EnumC1233950iDR EMAIL;
    public static final /* synthetic */ EnumC1233950iDR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1233950iDR PASSWORD;
    public static final EnumC1233950iDR SMS;
    public static final EnumC1233950iDR TRUSTED_ENVIRONMENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1233950iDR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1233950iDR enumC1233950iDR = new EnumC1233950iDR("EMAIL", 0, "email");
        EMAIL = enumC1233950iDR;
        EnumC1233950iDR enumC1233950iDR2 = new EnumC1233950iDR("PASSWORD", 1, "password");
        PASSWORD = enumC1233950iDR2;
        EnumC1233950iDR enumC1233950iDR3 = new EnumC1233950iDR("SMS", 2, "sms");
        SMS = enumC1233950iDR3;
        EnumC1233950iDR enumC1233950iDR4 = new EnumC1233950iDR("TRUSTED_ENVIRONMENT", 3, "trusted_environment");
        TRUSTED_ENVIRONMENT = enumC1233950iDR4;
        EnumC1233950iDR[] enumC1233950iDRArr = {enumC1233950iDR, enumC1233950iDR2, enumC1233950iDR3, enumC1233950iDR4};
        LLILLJJLI = enumC1233950iDRArr;
        LLILLL = new C2254308sP(enumC1233950iDRArr);
    }

    public static EnumC1233950iDR[] values() {
        return (EnumC1233950iDR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1233950iDR valueOf(String str) {
        return (EnumC1233950iDR) C08FF.LIZ(EnumC1233950iDR.class, str);
    }

    public EnumC1233950iDR(String str, int i, String str2) {
        this.LL = str2;
    }
}
