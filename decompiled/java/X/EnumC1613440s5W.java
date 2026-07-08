package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1613440s5W {
    public static final EnumC1613440s5W CLICK_PURCHASE;
    public static final EnumC1613440s5W CONFIRM_PURCHASE_FAILED;
    public static final EnumC1613440s5W CONFIRM_PURCHASE_START;
    public static final EnumC1613440s5W CONFIRM_PURCHASE_SUCCESS;
    public static final EnumC1613440s5W CREATE_ORDER;
    public static final EnumC1613440s5W CREATE_ORDER_FAILED;
    public static final EnumC1613440s5W CREATE_ORDER_SUCCESS;
    public static final EnumC1613440s5W FIRST_FRAME_RENDER;
    public static final /* synthetic */ EnumC1613440s5W[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1613440s5W MP_PAYMENT_FAILED;
    public static final EnumC1613440s5W MP_PAYMENT_START;
    public static final EnumC1613440s5W MP_PAYMENT_SUCCESS;
    public static final EnumC1613440s5W URL_LESS_REQUEST_FAILED;
    public static final EnumC1613440s5W URL_LESS_REQUEST_START;
    public static final EnumC1613440s5W URL_LESS_REQUEST_SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1613440s5W> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1613440s5W enumC1613440s5W = new EnumC1613440s5W("CLICK_PURCHASE", 0, "click_purchase");
        CLICK_PURCHASE = enumC1613440s5W;
        EnumC1613440s5W enumC1613440s5W2 = new EnumC1613440s5W("CREATE_ORDER", 1, "create_order");
        CREATE_ORDER = enumC1613440s5W2;
        EnumC1613440s5W enumC1613440s5W3 = new EnumC1613440s5W("CREATE_ORDER_SUCCESS", 2, "create_order_success");
        CREATE_ORDER_SUCCESS = enumC1613440s5W3;
        EnumC1613440s5W enumC1613440s5W4 = new EnumC1613440s5W("CREATE_ORDER_FAILED", 3, "create_order_failed");
        CREATE_ORDER_FAILED = enumC1613440s5W4;
        EnumC1613440s5W enumC1613440s5W5 = new EnumC1613440s5W("MP_PAYMENT_START", 4, "mp_payment_start");
        MP_PAYMENT_START = enumC1613440s5W5;
        EnumC1613440s5W enumC1613440s5W6 = new EnumC1613440s5W("MP_PAYMENT_SUCCESS", 5, "mp_payment_success");
        MP_PAYMENT_SUCCESS = enumC1613440s5W6;
        EnumC1613440s5W enumC1613440s5W7 = new EnumC1613440s5W("MP_PAYMENT_FAILED", 6, "mp_payment_failed");
        MP_PAYMENT_FAILED = enumC1613440s5W7;
        EnumC1613440s5W enumC1613440s5W8 = new EnumC1613440s5W("CONFIRM_PURCHASE_START", 7, "confirm_purchase_start");
        CONFIRM_PURCHASE_START = enumC1613440s5W8;
        EnumC1613440s5W enumC1613440s5W9 = new EnumC1613440s5W("CONFIRM_PURCHASE_SUCCESS", 8, "confirm_purchase_success");
        CONFIRM_PURCHASE_SUCCESS = enumC1613440s5W9;
        EnumC1613440s5W enumC1613440s5W10 = new EnumC1613440s5W("CONFIRM_PURCHASE_FAILED", 9, "confirm_purchase_failed");
        CONFIRM_PURCHASE_FAILED = enumC1613440s5W10;
        EnumC1613440s5W enumC1613440s5W11 = new EnumC1613440s5W("URL_LESS_REQUEST_START", 10, "url_less_request_start");
        URL_LESS_REQUEST_START = enumC1613440s5W11;
        EnumC1613440s5W enumC1613440s5W12 = new EnumC1613440s5W("URL_LESS_REQUEST_SUCCESS", 11, "url_less_request_success");
        URL_LESS_REQUEST_SUCCESS = enumC1613440s5W12;
        EnumC1613440s5W enumC1613440s5W13 = new EnumC1613440s5W("URL_LESS_REQUEST_FAILED", 12, "url_less_request_failed");
        URL_LESS_REQUEST_FAILED = enumC1613440s5W13;
        EnumC1613440s5W enumC1613440s5W14 = new EnumC1613440s5W("FIRST_FRAME_RENDER", 13, "first_frame_render");
        FIRST_FRAME_RENDER = enumC1613440s5W14;
        EnumC1613440s5W[] enumC1613440s5WArr = {enumC1613440s5W, enumC1613440s5W2, enumC1613440s5W3, enumC1613440s5W4, enumC1613440s5W5, enumC1613440s5W6, enumC1613440s5W7, enumC1613440s5W8, enumC1613440s5W9, enumC1613440s5W10, enumC1613440s5W11, enumC1613440s5W12, enumC1613440s5W13, enumC1613440s5W14};
        LLILLJJLI = enumC1613440s5WArr;
        LLILLL = new C2254308sP(enumC1613440s5WArr);
    }

    public static EnumC1613440s5W[] values() {
        return (EnumC1613440s5W[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1613440s5W valueOf(String str) {
        return (EnumC1613440s5W) C08FF.LIZ(EnumC1613440s5W.class, str);
    }

    public EnumC1613440s5W(String str, int i, String str2) {
        this.LL = str2;
    }
}
