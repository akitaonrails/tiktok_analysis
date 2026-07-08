package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vGW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1735580vGW {
    public static final EnumC1735580vGW BACK_TO_PREVIOUS_PAGE;
    public static final EnumC1735580vGW DIALOG_POPUP_GET;
    public static final /* synthetic */ EnumC1735580vGW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1735580vGW MALL_CART_BASE_TOOLTIP;
    public static final EnumC1735580vGW MALL_DIVERSION_PARAMS_INFO;
    public static final EnumC1735580vGW MALL_ORDERS_BASE_TOOLTIP;
    public static final EnumC1735580vGW MALL_SPARKVIEW;
    public static final EnumC1735580vGW MALL_VOUCHER_BLOCK;
    public static final EnumC1735580vGW MALL_VOUCHER_DIALOG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1735580vGW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1735580vGW enumC1735580vGW = new EnumC1735580vGW("BACK_TO_PREVIOUS_PAGE", 0, "back_to_previous_page");
        BACK_TO_PREVIOUS_PAGE = enumC1735580vGW;
        EnumC1735580vGW enumC1735580vGW2 = new EnumC1735580vGW("MALL_CART_BASE_TOOLTIP", 1, "mall_cart_base_tooltip");
        MALL_CART_BASE_TOOLTIP = enumC1735580vGW2;
        EnumC1735580vGW enumC1735580vGW3 = new EnumC1735580vGW("MALL_ORDERS_BASE_TOOLTIP", 2, "mall_orders_base_tooltip");
        MALL_ORDERS_BASE_TOOLTIP = enumC1735580vGW3;
        EnumC1735580vGW enumC1735580vGW4 = new EnumC1735580vGW("MALL_VOUCHER_DIALOG", 3, "mall_voucher_dialog");
        MALL_VOUCHER_DIALOG = enumC1735580vGW4;
        EnumC1735580vGW enumC1735580vGW5 = new EnumC1735580vGW("MALL_VOUCHER_BLOCK", 4, "mall_voucher_block");
        MALL_VOUCHER_BLOCK = enumC1735580vGW5;
        EnumC1735580vGW enumC1735580vGW6 = new EnumC1735580vGW("MALL_SPARKVIEW", 5, "mall_sparkview");
        MALL_SPARKVIEW = enumC1735580vGW6;
        EnumC1735580vGW enumC1735580vGW7 = new EnumC1735580vGW("MALL_DIVERSION_PARAMS_INFO", 6, "mall_diversion_params_info");
        MALL_DIVERSION_PARAMS_INFO = enumC1735580vGW7;
        EnumC1735580vGW enumC1735580vGW8 = new EnumC1735580vGW("DIALOG_POPUP_GET", 7, "dialog_popup_get");
        DIALOG_POPUP_GET = enumC1735580vGW8;
        EnumC1735580vGW[] enumC1735580vGWArr = {enumC1735580vGW, enumC1735580vGW2, enumC1735580vGW3, enumC1735580vGW4, enumC1735580vGW5, enumC1735580vGW6, enumC1735580vGW7, enumC1735580vGW8};
        LLILLJJLI = enumC1735580vGWArr;
        LLILLL = new C2254308sP(enumC1735580vGWArr);
    }

    public static EnumC1735580vGW[] values() {
        return (EnumC1735580vGW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1735580vGW valueOf(String str) {
        return (EnumC1735580vGW) C08FF.LIZ(EnumC1735580vGW.class, str);
    }

    public EnumC1735580vGW(String str, int i, String str2) {
        this.LL = str2;
    }
}
