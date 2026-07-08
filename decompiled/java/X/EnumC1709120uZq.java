package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709120uZq {
    public static final /* synthetic */ EnumC1709120uZq[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1709120uZq REFUND_RESULT_CLIENT_ERROR_DEFAULT;
    public static final EnumC1709120uZq REFUND_RESULT_CLIENT_ERROR_PARAM_ERROR;
    public static final EnumC1709120uZq REFUND_RESULT_NETWORK_ERROR;
    public static final EnumC1709120uZq REFUND_RESULT_SERVER_ERROR_API_ERROR;
    public static final EnumC1709120uZq REFUND_RESULT_SERVER_ERROR_CBI_INVALID;
    public static final EnumC1709120uZq REFUND_RESULT_SERVER_ERROR_DEFAULT;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1709120uZq> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1709120uZq enumC1709120uZq = new EnumC1709120uZq("REFUND_RESULT_NETWORK_ERROR", 0, 10001, C1949007kG.LIZ());
        REFUND_RESULT_NETWORK_ERROR = enumC1709120uZq;
        EnumC1709120uZq enumC1709120uZq2 = new EnumC1709120uZq("REFUND_RESULT_CLIENT_ERROR_PARAM_ERROR", 1, 20001, C1949007kG.LIZ());
        REFUND_RESULT_CLIENT_ERROR_PARAM_ERROR = enumC1709120uZq2;
        EnumC1709120uZq enumC1709120uZq3 = new EnumC1709120uZq("REFUND_RESULT_CLIENT_ERROR_DEFAULT", 2, 20002, C1949007kG.LIZ());
        REFUND_RESULT_CLIENT_ERROR_DEFAULT = enumC1709120uZq3;
        EnumC1709120uZq enumC1709120uZq4 = new EnumC1709120uZq("REFUND_RESULT_SERVER_ERROR_API_ERROR", 3, 30001, C1949007kG.LIZ());
        REFUND_RESULT_SERVER_ERROR_API_ERROR = enumC1709120uZq4;
        EnumC1709120uZq enumC1709120uZq5 = new EnumC1709120uZq("REFUND_RESULT_SERVER_ERROR_DEFAULT", 4, 30002, C1949007kG.LIZ());
        REFUND_RESULT_SERVER_ERROR_DEFAULT = enumC1709120uZq5;
        EnumC1709120uZq enumC1709120uZq6 = new EnumC1709120uZq("REFUND_RESULT_SERVER_ERROR_CBI_INVALID", 5, 30003, C1949007kG.LIZ());
        REFUND_RESULT_SERVER_ERROR_CBI_INVALID = enumC1709120uZq6;
        EnumC1709120uZq[] enumC1709120uZqArr = {enumC1709120uZq, enumC1709120uZq2, enumC1709120uZq3, enumC1709120uZq4, enumC1709120uZq5, enumC1709120uZq6};
        LLILLL = enumC1709120uZqArr;
        LLILZ = new C2254308sP(enumC1709120uZqArr);
    }

    public static EnumC1709120uZq[] values() {
        return (EnumC1709120uZq[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC1709120uZq valueOf(String str) {
        return (EnumC1709120uZq) C08FF.LIZ(EnumC1709120uZq.class, str);
    }

    public EnumC1709120uZq(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
