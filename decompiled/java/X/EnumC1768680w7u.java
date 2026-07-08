package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768680w7u {
    public static final EnumC1768680w7u FYP_ECOM_VIDEO_GUIDE_MASK;
    public static final /* synthetic */ EnumC1768680w7u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768680w7u NO_CART_FEED_ECOM_VIDEO_GUIDE_MASK;
    public static final EnumC1768680w7u SHOP_TAB_BASE_TOOLTIP;
    public static final EnumC1768680w7u SHOP_TAB_VOUCHER_TOOLTIP;
    public static final EnumC1768680w7u SHOP_TAB_VOUCHER_TOOLTIP_PRO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1768680w7u> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768680w7u enumC1768680w7u = new EnumC1768680w7u("SHOP_TAB_BASE_TOOLTIP", 0, "shop_tab_base_tooltip");
        SHOP_TAB_BASE_TOOLTIP = enumC1768680w7u;
        EnumC1768680w7u enumC1768680w7u2 = new EnumC1768680w7u("SHOP_TAB_VOUCHER_TOOLTIP", 1, "shop_tab_voucher_tooltip");
        SHOP_TAB_VOUCHER_TOOLTIP = enumC1768680w7u2;
        EnumC1768680w7u enumC1768680w7u3 = new EnumC1768680w7u("SHOP_TAB_VOUCHER_TOOLTIP_PRO", 2, "shop_tab_voucher_tooltip_pro");
        SHOP_TAB_VOUCHER_TOOLTIP_PRO = enumC1768680w7u3;
        EnumC1768680w7u enumC1768680w7u4 = new EnumC1768680w7u("FYP_ECOM_VIDEO_GUIDE_MASK", 3, "feed_ecom_video_guide_mask");
        FYP_ECOM_VIDEO_GUIDE_MASK = enumC1768680w7u4;
        EnumC1768680w7u enumC1768680w7u5 = new EnumC1768680w7u("NO_CART_FEED_ECOM_VIDEO_GUIDE_MASK", 4, "no_cart_feed_ecom_video_guide_mask");
        NO_CART_FEED_ECOM_VIDEO_GUIDE_MASK = enumC1768680w7u5;
        EnumC1768680w7u[] enumC1768680w7uArr = {enumC1768680w7u, enumC1768680w7u2, enumC1768680w7u3, enumC1768680w7u4, enumC1768680w7u5};
        LLILLJJLI = enumC1768680w7uArr;
        LLILLL = new C2254308sP(enumC1768680w7uArr);
    }

    public static EnumC1768680w7u[] values() {
        return (EnumC1768680w7u[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1768680w7u valueOf(String str) {
        return (EnumC1768680w7u) C08FF.LIZ(EnumC1768680w7u.class, str);
    }

    public EnumC1768680w7u(String str, int i, String str2) {
        this.LL = str2;
    }
}
