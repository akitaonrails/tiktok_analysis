package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1707350uWz {
    public static final /* synthetic */ EnumC1707350uWz[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1707350uWz PAY_RESULT_CLIENT_ERROR_API_RESPONSE_FORMAT_ERROR;
    public static final EnumC1707350uWz PAY_RESULT_CLIENT_ERROR_DEFAULT;
    public static final EnumC1707350uWz PAY_RESULT_CLIENT_ERROR_LAUNCH_APP_FAIL;
    public static final EnumC1707350uWz PAY_RESULT_CLIENT_ERROR_PARAM_ERROR;
    public static final EnumC1707350uWz PAY_RESULT_NETWORK_ERROR;
    public static final EnumC1707350uWz PAY_RESULT_QUERY_PENDING;
    public static final EnumC1707350uWz PAY_RESULT_SERVER_ERROR_API_ERROR;
    public static final EnumC1707350uWz PAY_RESULT_SERVER_ERROR_REDIRECT_DETAIL_INVALID;
    public static final EnumC1707350uWz PAY_RESULT_SERVER_ERROR_UNSUPPORTED_COMMUTE_TYPE;
    public static final EnumC1707350uWz PAY_RESULT_SERVER_ERROR_UNSUPPORTED_PAY_CASHIER_ACTION;
    public static final EnumC1707350uWz PAY_RESULT_WEB_ERROR;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1707350uWz> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1707350uWz enumC1707350uWz = new EnumC1707350uWz("PAY_RESULT_NETWORK_ERROR", 0, 1001, C1949107kH.LIZ(2131857118));
        PAY_RESULT_NETWORK_ERROR = enumC1707350uWz;
        EnumC1707350uWz enumC1707350uWz2 = new EnumC1707350uWz("PAY_RESULT_CLIENT_ERROR_PARAM_ERROR", 1, 2001, C1949107kH.LIZ(2131857118));
        PAY_RESULT_CLIENT_ERROR_PARAM_ERROR = enumC1707350uWz2;
        EnumC1707350uWz enumC1707350uWz3 = new EnumC1707350uWz("PAY_RESULT_CLIENT_ERROR_API_RESPONSE_FORMAT_ERROR", 2, 2002, C1949107kH.LIZ(2131857118));
        PAY_RESULT_CLIENT_ERROR_API_RESPONSE_FORMAT_ERROR = enumC1707350uWz3;
        EnumC1707350uWz enumC1707350uWz4 = new EnumC1707350uWz("PAY_RESULT_CLIENT_ERROR_LAUNCH_APP_FAIL", 3, 2003, C1949107kH.LIZ(2131857116));
        PAY_RESULT_CLIENT_ERROR_LAUNCH_APP_FAIL = enumC1707350uWz4;
        EnumC1707350uWz enumC1707350uWz5 = new EnumC1707350uWz("PAY_RESULT_CLIENT_ERROR_DEFAULT", 4, 2004, C1949107kH.LIZ(2131857118));
        PAY_RESULT_CLIENT_ERROR_DEFAULT = enumC1707350uWz5;
        EnumC1707350uWz enumC1707350uWz6 = new EnumC1707350uWz("PAY_RESULT_SERVER_ERROR_API_ERROR", 5, 3001, C1949107kH.LIZ(2131857118));
        PAY_RESULT_SERVER_ERROR_API_ERROR = enumC1707350uWz6;
        EnumC1707350uWz enumC1707350uWz7 = new EnumC1707350uWz("PAY_RESULT_SERVER_ERROR_UNSUPPORTED_PAY_CASHIER_ACTION", 6, 3002, C1949107kH.LIZ(2131857118));
        PAY_RESULT_SERVER_ERROR_UNSUPPORTED_PAY_CASHIER_ACTION = enumC1707350uWz7;
        EnumC1707350uWz enumC1707350uWz8 = new EnumC1707350uWz("PAY_RESULT_SERVER_ERROR_REDIRECT_DETAIL_INVALID", 7, 3004, C1949107kH.LIZ(2131857118));
        PAY_RESULT_SERVER_ERROR_REDIRECT_DETAIL_INVALID = enumC1707350uWz8;
        EnumC1707350uWz enumC1707350uWz9 = new EnumC1707350uWz("PAY_RESULT_SERVER_ERROR_UNSUPPORTED_COMMUTE_TYPE", 8, 3005, C1949107kH.LIZ(2131857118));
        PAY_RESULT_SERVER_ERROR_UNSUPPORTED_COMMUTE_TYPE = enumC1707350uWz9;
        EnumC1707350uWz enumC1707350uWz10 = new EnumC1707350uWz("PAY_RESULT_QUERY_PENDING", 9, 3007, C1949107kH.LIZ(2131857118));
        PAY_RESULT_QUERY_PENDING = enumC1707350uWz10;
        EnumC1707350uWz enumC1707350uWz11 = new EnumC1707350uWz("PAY_RESULT_WEB_ERROR", 10, 4001, "");
        PAY_RESULT_WEB_ERROR = enumC1707350uWz11;
        EnumC1707350uWz[] enumC1707350uWzArr = {enumC1707350uWz, enumC1707350uWz2, enumC1707350uWz3, enumC1707350uWz4, enumC1707350uWz5, enumC1707350uWz6, enumC1707350uWz7, enumC1707350uWz8, enumC1707350uWz9, enumC1707350uWz10, enumC1707350uWz11};
        LLILLL = enumC1707350uWzArr;
        LLILZ = new C2254308sP(enumC1707350uWzArr);
    }

    public static EnumC1707350uWz[] values() {
        return (EnumC1707350uWz[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC1707350uWz valueOf(String str) {
        return (EnumC1707350uWz) C08FF.LIZ(EnumC1707350uWz.class, str);
    }

    public EnumC1707350uWz(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
