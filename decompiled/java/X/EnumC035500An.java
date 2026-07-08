package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00An, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035500An {
    public static final EnumC035500An CLIENT_EXCEPTION_CREATE_SHEET_FAIL;
    public static final EnumC035500An ERROR_COMMON_INTERNAL_ERROR;
    public static final EnumC035500An ERROR_COMMON_NETWORK_ERROR;
    public static final EnumC035500An ERROR_IAP_ENV_CHECK_FAIL_DEVICE;
    public static final EnumC035500An ERROR_IAP_ENV_CHECK_FAIL_STORE;
    public static final EnumC035500An ERROR_IAP_ENV_CHECK_FAIL_TIMEOUT;
    public static final EnumC035500An ERROR_IAP_PAY_FAIL;
    public static final EnumC035500An ERROR_IAP_PAY_PENDING;
    public static final EnumC035500An ERROR_SERVER_LOADING_TIER_FAIL_INVALID;
    public static final EnumC035500An ERROR_SERVER_QUERY_ORDER_CANCEL;
    public static final EnumC035500An ERROR_SERVER_QUERY_ORDER_INVALID_ORDER_CONTENT;
    public static final EnumC035500An ERROR_SERVER_QUERY_ORDER_INVALID_ORDER_STATUS;
    public static final EnumC035500An ERROR_SERVER_QUERY_ORDER_TIMEOUT;
    public static final EnumC035500An ERROR_USER_CLOSE_PANEL;
    public static final /* synthetic */ EnumC035500An[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035500An> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035500An enumC035500An = new EnumC035500An("ERROR_IAP_ENV_CHECK_FAIL_STORE", 0, LivePreCreateNextRoomPlayer.ENABLE);
        ERROR_IAP_ENV_CHECK_FAIL_STORE = enumC035500An;
        EnumC035500An enumC035500An2 = new EnumC035500An("ERROR_IAP_ENV_CHECK_FAIL_TIMEOUT", 1, 3001);
        ERROR_IAP_ENV_CHECK_FAIL_TIMEOUT = enumC035500An2;
        EnumC035500An enumC035500An3 = new EnumC035500An("ERROR_IAP_ENV_CHECK_FAIL_DEVICE", 2, 3002);
        ERROR_IAP_ENV_CHECK_FAIL_DEVICE = enumC035500An3;
        EnumC035500An enumC035500An4 = new EnumC035500An("ERROR_SERVER_LOADING_TIER_FAIL_INVALID", 3, 3003);
        ERROR_SERVER_LOADING_TIER_FAIL_INVALID = enumC035500An4;
        EnumC035500An enumC035500An5 = new EnumC035500An("CLIENT_EXCEPTION_CREATE_SHEET_FAIL", 4, 3004);
        CLIENT_EXCEPTION_CREATE_SHEET_FAIL = enumC035500An5;
        EnumC035500An enumC035500An6 = new EnumC035500An("ERROR_USER_CLOSE_PANEL", 5, 3005);
        ERROR_USER_CLOSE_PANEL = enumC035500An6;
        EnumC035500An enumC035500An7 = new EnumC035500An("ERROR_SERVER_QUERY_ORDER_TIMEOUT", 6, 3006);
        ERROR_SERVER_QUERY_ORDER_TIMEOUT = enumC035500An7;
        EnumC035500An enumC035500An8 = new EnumC035500An("ERROR_SERVER_QUERY_ORDER_INVALID_ORDER_STATUS", 7, 3007);
        ERROR_SERVER_QUERY_ORDER_INVALID_ORDER_STATUS = enumC035500An8;
        EnumC035500An enumC035500An9 = new EnumC035500An("ERROR_SERVER_QUERY_ORDER_INVALID_ORDER_CONTENT", 8, 3008);
        ERROR_SERVER_QUERY_ORDER_INVALID_ORDER_CONTENT = enumC035500An9;
        EnumC035500An enumC035500An10 = new EnumC035500An("ERROR_IAP_PAY_PENDING", 9, 3011);
        ERROR_IAP_PAY_PENDING = enumC035500An10;
        EnumC035500An enumC035500An11 = new EnumC035500An("ERROR_SERVER_QUERY_ORDER_CANCEL", 10, 3012);
        ERROR_SERVER_QUERY_ORDER_CANCEL = enumC035500An11;
        EnumC035500An enumC035500An12 = new EnumC035500An("ERROR_IAP_PAY_FAIL", 11, 3013);
        ERROR_IAP_PAY_FAIL = enumC035500An12;
        EnumC035500An enumC035500An13 = new EnumC035500An("ERROR_COMMON_NETWORK_ERROR", 12, 4000);
        ERROR_COMMON_NETWORK_ERROR = enumC035500An13;
        EnumC035500An enumC035500An14 = new EnumC035500An("ERROR_COMMON_INTERNAL_ERROR", 13, 5000);
        ERROR_COMMON_INTERNAL_ERROR = enumC035500An14;
        EnumC035500An[] enumC035500AnArr = {enumC035500An, enumC035500An2, enumC035500An3, enumC035500An4, enumC035500An5, enumC035500An6, enumC035500An7, enumC035500An8, enumC035500An9, enumC035500An10, enumC035500An11, enumC035500An12, enumC035500An13, enumC035500An14};
        LLILLJJLI = enumC035500AnArr;
        LLILLL = new C2254308sP(enumC035500AnArr);
    }

    public static EnumC035500An[] values() {
        return (EnumC035500An[]) LLILLJJLI.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public static EnumC035500An valueOf(String str) {
        return (EnumC035500An) C08FF.LIZ(EnumC035500An.class, str);
    }

    public EnumC035500An(String str, int i, int i2) {
        this.LL = i2;
    }
}
