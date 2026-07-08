package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXW {
    public static final /* synthetic */ C0QXW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QXW SOURCE_ANCHOR;
    public static final C0QXW SOURCE_COMMENT_PRODUCT_ANCHOR;
    public static final C0QXW SOURCE_COUPON_ORDER_CENTER;
    public static final C0QXW SOURCE_COUPON_ORDER_LIST;
    public static final C0QXW SOURCE_FEED_BOTTOM_BAR;
    public static final C0QXW SOURCE_FROM_AFTER_SALE;
    public static final C0QXW SOURCE_FROM_HALF_SHOP;
    public static final C0QXW SOURCE_PDP;
    public static final C0QXW SOURCE_SHOP;
    public static final C0QXW SOURCE_VIDEO_VISION_SUG;
    public final String LL;

    public static InterfaceC2044707zh<C0QXW> getEntries() {
        return LLILLL;
    }

    static {
        C0QXW c0qxw = new C0QXW("SOURCE_SHOP", 0, "shop");
        SOURCE_SHOP = c0qxw;
        C0QXW c0qxw2 = new C0QXW("SOURCE_PDP", 1, "product_detail");
        SOURCE_PDP = c0qxw2;
        C0QXW c0qxw3 = new C0QXW("SOURCE_COMMENT_PRODUCT_ANCHOR", 2, "comment_product_search");
        SOURCE_COMMENT_PRODUCT_ANCHOR = c0qxw3;
        C0QXW c0qxw4 = new C0QXW("SOURCE_FEED_BOTTOM_BAR", 3, "video_product_search");
        SOURCE_FEED_BOTTOM_BAR = c0qxw4;
        C0QXW c0qxw5 = new C0QXW("SOURCE_ANCHOR", 4, "anchor_product");
        SOURCE_ANCHOR = c0qxw5;
        C0QXW c0qxw6 = new C0QXW("SOURCE_FROM_HALF_SHOP", 5, "shop");
        SOURCE_FROM_HALF_SHOP = c0qxw6;
        C0QXW c0qxw7 = new C0QXW("SOURCE_FROM_AFTER_SALE", 6, "after_sale");
        SOURCE_FROM_AFTER_SALE = c0qxw7;
        C0QXW c0qxw8 = new C0QXW("SOURCE_VIDEO_VISION_SUG", 7, "feed_pause_photo");
        SOURCE_VIDEO_VISION_SUG = c0qxw8;
        C0QXW c0qxw9 = new C0QXW("SOURCE_COUPON_ORDER_LIST", 8, "search_coupon_attract_order_list");
        SOURCE_COUPON_ORDER_LIST = c0qxw9;
        C0QXW c0qxw10 = new C0QXW("SOURCE_COUPON_ORDER_CENTER", 9, "search_coupon_attract_order_center");
        SOURCE_COUPON_ORDER_CENTER = c0qxw10;
        C0QXW[] c0qxwArr = {c0qxw, c0qxw2, c0qxw3, c0qxw4, c0qxw5, c0qxw6, c0qxw7, c0qxw8, c0qxw9, c0qxw10};
        LLILLJJLI = c0qxwArr;
        LLILLL = new C2254308sP(c0qxwArr);
    }

    public static C0QXW[] values() {
        return (C0QXW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0QXW valueOf(String str) {
        return (C0QXW) C08FF.LIZ(C0QXW.class, str);
    }

    public C0QXW(String str, int i, String str2) {
        this.LL = str2;
    }
}
