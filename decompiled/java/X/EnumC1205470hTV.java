package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hTV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1205470hTV {
    public static final EnumC1205470hTV BLOCKED_CERT;
    public static final EnumC1205470hTV HIT_CERT_FREQUENCY;
    public static final EnumC1205470hTV INVALID_CERT;
    public static final EnumC1205470hTV INVALID_PERMISSION;
    public static final /* synthetic */ EnumC1205470hTV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1205470hTV NOT_ALLOW_LOCATION;
    public static final EnumC1205470hTV NOT_MET_EXP;
    public static final EnumC1205470hTV SUCCESS;
    public static final EnumC1205470hTV UNKOWN_ERROR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1205470hTV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1205470hTV enumC1205470hTV = new EnumC1205470hTV("SUCCESS", 0, 0);
        SUCCESS = enumC1205470hTV;
        EnumC1205470hTV enumC1205470hTV2 = new EnumC1205470hTV("INVALID_PERMISSION", 1, 1001);
        INVALID_PERMISSION = enumC1205470hTV2;
        EnumC1205470hTV enumC1205470hTV3 = new EnumC1205470hTV("INVALID_CERT", 2, 1002);
        INVALID_CERT = enumC1205470hTV3;
        EnumC1205470hTV enumC1205470hTV4 = new EnumC1205470hTV("HIT_CERT_FREQUENCY", 3, 1003);
        HIT_CERT_FREQUENCY = enumC1205470hTV4;
        EnumC1205470hTV enumC1205470hTV5 = new EnumC1205470hTV("BLOCKED_CERT", 4, 1004);
        BLOCKED_CERT = enumC1205470hTV5;
        EnumC1205470hTV enumC1205470hTV6 = new EnumC1205470hTV("NOT_MET_EXP", 5, 1005);
        NOT_MET_EXP = enumC1205470hTV6;
        EnumC1205470hTV enumC1205470hTV7 = new EnumC1205470hTV("NOT_ALLOW_LOCATION", 6, 1006);
        NOT_ALLOW_LOCATION = enumC1205470hTV7;
        EnumC1205470hTV enumC1205470hTV8 = new EnumC1205470hTV("UNKOWN_ERROR", 7, 9999);
        UNKOWN_ERROR = enumC1205470hTV8;
        EnumC1205470hTV[] enumC1205470hTVArr = {enumC1205470hTV, enumC1205470hTV2, enumC1205470hTV3, enumC1205470hTV4, enumC1205470hTV5, enumC1205470hTV6, enumC1205470hTV7, enumC1205470hTV8};
        LLILLJJLI = enumC1205470hTVArr;
        LLILLL = new C2254308sP(enumC1205470hTVArr);
    }

    public static EnumC1205470hTV[] values() {
        return (EnumC1205470hTV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1205470hTV valueOf(String str) {
        return (EnumC1205470hTV) C08FF.LIZ(EnumC1205470hTV.class, str);
    }

    public EnumC1205470hTV(String str, int i, int i2) {
        this.LL = i2;
    }
}
