package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1741440vPy {
    public static final EnumC1741440vPy DIVERSION_BACK_BUTTON;
    public static final /* synthetic */ EnumC1741440vPy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1741440vPy MALL_AUTO_JUMP;
    public static final EnumC1741440vPy MALL_CART;
    public static final EnumC1741440vPy MALL_SEARCH_MIDDLE_PAGE;
    public static final EnumC1741440vPy SHOP_TAB;
    public static final EnumC1741440vPy SHOP_TAB_BUBBLE;
    public static final EnumC1741440vPy VIDEO_GUIDE_BUTTON;
    public static final EnumC1741440vPy VIDEO_GUIDE_PRODUCT;
    public static final EnumC1741440vPy VSA_CARD_PRODUCT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1741440vPy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1741440vPy enumC1741440vPy = new EnumC1741440vPy("MALL_CART", 0, "mall_cart");
        MALL_CART = enumC1741440vPy;
        EnumC1741440vPy enumC1741440vPy2 = new EnumC1741440vPy("MALL_AUTO_JUMP", 1, "mall_auto_jump");
        MALL_AUTO_JUMP = enumC1741440vPy2;
        EnumC1741440vPy enumC1741440vPy3 = new EnumC1741440vPy("MALL_SEARCH_MIDDLE_PAGE", 2, "mall_search_middle_page");
        MALL_SEARCH_MIDDLE_PAGE = enumC1741440vPy3;
        EnumC1741440vPy enumC1741440vPy4 = new EnumC1741440vPy("SHOP_TAB", 3, "shop_tab");
        SHOP_TAB = enumC1741440vPy4;
        EnumC1741440vPy enumC1741440vPy5 = new EnumC1741440vPy("VIDEO_GUIDE_BUTTON", 4, "video_guide_button");
        VIDEO_GUIDE_BUTTON = enumC1741440vPy5;
        EnumC1741440vPy enumC1741440vPy6 = new EnumC1741440vPy("VIDEO_GUIDE_PRODUCT", 5, "video_guide_product");
        VIDEO_GUIDE_PRODUCT = enumC1741440vPy6;
        EnumC1741440vPy enumC1741440vPy7 = new EnumC1741440vPy("VSA_CARD_PRODUCT", 6, "vsa_card_product");
        VSA_CARD_PRODUCT = enumC1741440vPy7;
        EnumC1741440vPy enumC1741440vPy8 = new EnumC1741440vPy("DIVERSION_BACK_BUTTON", 7, "diversion_back_button");
        DIVERSION_BACK_BUTTON = enumC1741440vPy8;
        EnumC1741440vPy enumC1741440vPy9 = new EnumC1741440vPy("SHOP_TAB_BUBBLE", 8, "shop_tab_bubble");
        SHOP_TAB_BUBBLE = enumC1741440vPy9;
        EnumC1741440vPy[] enumC1741440vPyArr = {enumC1741440vPy, enumC1741440vPy2, enumC1741440vPy3, enumC1741440vPy4, enumC1741440vPy5, enumC1741440vPy6, enumC1741440vPy7, enumC1741440vPy8, enumC1741440vPy9};
        LLILLJJLI = enumC1741440vPyArr;
        LLILLL = new C2254308sP(enumC1741440vPyArr);
    }

    public static EnumC1741440vPy[] values() {
        return (EnumC1741440vPy[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1741440vPy valueOf(String str) {
        return (EnumC1741440vPy) C08FF.LIZ(EnumC1741440vPy.class, str);
    }

    public EnumC1741440vPy(String str, int i, String str2) {
        this.LL = str2;
    }
}
