package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXU {
    public static final C0QXU CHANNEL_COMMENT_TOP_ANCHOR;
    public static final C0QXU CHANNEL_ECOM_UNKNOWN;
    public static final C0QXU CHANNEL_FASHION;
    public static final C0QXU CHANNEL_FEED_BOTTOM_BAR;
    public static final C0QXU CHANNEL_FEED_MALL_SEARCH_CARD;
    public static final C0QXU CHANNEL_FROM_HALF_SHOP;
    public static final C0QXU CHANNEL_HALF_SHOP;
    public static final C0QXU CHANNEL_MALL;
    public static final C0QXU CHANNEL_NEW_USER;
    public static final C0QXU CHANNEL_PDP;
    public static final C0QXU CHANNEL_SHOP;
    public static final C0QXU CHANNEL_VIDEO_ANCHOR;
    public static final C0QXU CHANNEL_VIDEO_VISION;
    public static final /* synthetic */ C0QXU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0QXU> getEntries() {
        return LLILLL;
    }

    static {
        C0QXU c0qxu = new C0QXU("CHANNEL_ECOM_UNKNOWN", 0, "tiktok_ecom_unknown");
        CHANNEL_ECOM_UNKNOWN = c0qxu;
        C0QXU c0qxu2 = new C0QXU("CHANNEL_SHOP", 1, "tiktok_ecom");
        CHANNEL_SHOP = c0qxu2;
        C0QXU c0qxu3 = new C0QXU("CHANNEL_MALL", 2, "tiktok_mall");
        CHANNEL_MALL = c0qxu3;
        C0QXU c0qxu4 = new C0QXU("CHANNEL_PDP", 3, "tiktok_product_detail");
        CHANNEL_PDP = c0qxu4;
        C0QXU c0qxu5 = new C0QXU("CHANNEL_FASHION", 4, "tiktok_fashion");
        CHANNEL_FASHION = c0qxu5;
        C0QXU c0qxu6 = new C0QXU("CHANNEL_COMMENT_TOP_ANCHOR", 5, "tiktok_product");
        CHANNEL_COMMENT_TOP_ANCHOR = c0qxu6;
        C0QXU c0qxu7 = new C0QXU("CHANNEL_FEED_BOTTOM_BAR", 6, "tiktok_product");
        CHANNEL_FEED_BOTTOM_BAR = c0qxu7;
        C0QXU c0qxu8 = new C0QXU("CHANNEL_VIDEO_ANCHOR", 7, "tiktok_product");
        CHANNEL_VIDEO_ANCHOR = c0qxu8;
        C0QXU c0qxu9 = new C0QXU("CHANNEL_HALF_SHOP", 8, "mall_seven_half_page");
        CHANNEL_HALF_SHOP = c0qxu9;
        C0QXU c0qxu10 = new C0QXU("CHANNEL_FROM_HALF_SHOP", 9, "tiktok_mall");
        CHANNEL_FROM_HALF_SHOP = c0qxu10;
        C0QXU c0qxu11 = new C0QXU("CHANNEL_VIDEO_VISION", 10, "tiktok_mall_photo_search");
        CHANNEL_VIDEO_VISION = c0qxu11;
        C0QXU c0qxu12 = new C0QXU("CHANNEL_NEW_USER", 11, "tiktok_ecom_new_user");
        CHANNEL_NEW_USER = c0qxu12;
        C0QXU c0qxu13 = new C0QXU("CHANNEL_FEED_MALL_SEARCH_CARD", 12, "tiktok_mall_channel_page");
        CHANNEL_FEED_MALL_SEARCH_CARD = c0qxu13;
        C0QXU[] c0qxuArr = {c0qxu, c0qxu2, c0qxu3, c0qxu4, c0qxu5, c0qxu6, c0qxu7, c0qxu8, c0qxu9, c0qxu10, c0qxu11, c0qxu12, c0qxu13};
        LLILLJJLI = c0qxuArr;
        LLILLL = new C2254308sP(c0qxuArr);
    }

    public static C0QXU[] values() {
        return (C0QXU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0QXU valueOf(String str) {
        return (C0QXU) C08FF.LIZ(C0QXU.class, str);
    }

    public C0QXU(String str, int i, String str2) {
        this.LL = str2;
    }
}
