package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zTS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1897360zTS {
    public static final /* synthetic */ EnumC1897360zTS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1897360zTS RISK_TOKEN_V_UG_REFER_CLC;
    public static final EnumC1897360zTS RISK_TOKEN_V_UG_REFER_EC;
    public static final EnumC1897360zTS RISK_TOKEN_V_UG_REFER_FEED;
    public static final EnumC1897360zTS RISK_TOKEN_V_UG_REFER_INCENTIVE;
    public static final EnumC1897360zTS RISK_TOKEN_V_UG_REFER_LYNX;
    public static final EnumC1897360zTS RISK_TOKEN_V_UG_REFER_SECURITY;
    public static final EnumC1897360zTS RISK_TOKEN_V_UG_REFER_SPECIAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1897360zTS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1897360zTS enumC1897360zTS = new EnumC1897360zTS("RISK_TOKEN_V_UG_REFER_CLC", 0, 1);
        RISK_TOKEN_V_UG_REFER_CLC = enumC1897360zTS;
        EnumC1897360zTS enumC1897360zTS2 = new EnumC1897360zTS("RISK_TOKEN_V_UG_REFER_EC", 1, 2);
        RISK_TOKEN_V_UG_REFER_EC = enumC1897360zTS2;
        EnumC1897360zTS enumC1897360zTS3 = new EnumC1897360zTS("RISK_TOKEN_V_UG_REFER_INCENTIVE", 2, 3);
        RISK_TOKEN_V_UG_REFER_INCENTIVE = enumC1897360zTS3;
        EnumC1897360zTS enumC1897360zTS4 = new EnumC1897360zTS("RISK_TOKEN_V_UG_REFER_FEED", 3, 4);
        RISK_TOKEN_V_UG_REFER_FEED = enumC1897360zTS4;
        EnumC1897360zTS enumC1897360zTS5 = new EnumC1897360zTS("RISK_TOKEN_V_UG_REFER_SPECIAL", 4, 5);
        RISK_TOKEN_V_UG_REFER_SPECIAL = enumC1897360zTS5;
        EnumC1897360zTS enumC1897360zTS6 = new EnumC1897360zTS("RISK_TOKEN_V_UG_REFER_SECURITY", 5, 6);
        RISK_TOKEN_V_UG_REFER_SECURITY = enumC1897360zTS6;
        EnumC1897360zTS enumC1897360zTS7 = new EnumC1897360zTS("RISK_TOKEN_V_UG_REFER_LYNX", 6, 7);
        RISK_TOKEN_V_UG_REFER_LYNX = enumC1897360zTS7;
        EnumC1897360zTS[] enumC1897360zTSArr = {enumC1897360zTS, enumC1897360zTS2, enumC1897360zTS3, enumC1897360zTS4, enumC1897360zTS5, enumC1897360zTS6, enumC1897360zTS7};
        LLILLJJLI = enumC1897360zTSArr;
        LLILLL = new C2254308sP(enumC1897360zTSArr);
    }

    public static EnumC1897360zTS[] values() {
        return (EnumC1897360zTS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1897360zTS valueOf(String str) {
        return (EnumC1897360zTS) C08FF.LIZ(EnumC1897360zTS.class, str);
    }

    public EnumC1897360zTS(String str, int i, int i2) {
        this.LL = i2;
    }
}
