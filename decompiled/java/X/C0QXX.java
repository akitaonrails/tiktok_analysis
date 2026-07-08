package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXX {
    public static final /* synthetic */ C0QXX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QXX TYPE_ALIEN_SHOP;
    public static final C0QXX TYPE_ANCHOR;
    public static final C0QXX TYPE_COMMENT_TOP_ANCHOR;
    public static final C0QXX TYPE_FASHION;
    public static final C0QXX TYPE_FEED_BOTTOM_BAR;
    public static final C0QXX TYPE_FROM_ALIEN_SHOP;
    public static final C0QXX TYPE_FROM_HALF_SHOP;
    public static final C0QXX TYPE_HALF_SHOP;
    public static final C0QXX TYPE_MALL;
    public static final C0QXX TYPE_PDP;
    public static final C0QXX TYPE_SHOP;
    public final String LL;

    public static InterfaceC2044707zh<C0QXX> getEntries() {
        return LLILLL;
    }

    static {
        C0QXX c0qxx = new C0QXX("TYPE_SHOP", 0, "shop");
        TYPE_SHOP = c0qxx;
        C0QXX c0qxx2 = new C0QXX("TYPE_MALL", 1, "mall");
        TYPE_MALL = c0qxx2;
        C0QXX c0qxx3 = new C0QXX("TYPE_PDP", 2, "product_detail");
        TYPE_PDP = c0qxx3;
        C0QXX c0qxx4 = new C0QXX("TYPE_COMMENT_TOP_ANCHOR", 3, "comment_product_search");
        TYPE_COMMENT_TOP_ANCHOR = c0qxx4;
        C0QXX c0qxx5 = new C0QXX("TYPE_FEED_BOTTOM_BAR", 4, "video_product_search");
        TYPE_FEED_BOTTOM_BAR = c0qxx5;
        C0QXX c0qxx6 = new C0QXX("TYPE_ANCHOR", 5, "anchor_product");
        TYPE_ANCHOR = c0qxx6;
        C0QXX c0qxx7 = new C0QXX("TYPE_FASHION", 6, "tiktok_fashion");
        TYPE_FASHION = c0qxx7;
        C0QXX c0qxx8 = new C0QXX("TYPE_HALF_SHOP", 7, "half_shop");
        TYPE_HALF_SHOP = c0qxx8;
        C0QXX c0qxx9 = new C0QXX("TYPE_FROM_HALF_SHOP", 8, "from_half_shop");
        TYPE_FROM_HALF_SHOP = c0qxx9;
        C0QXX c0qxx10 = new C0QXX("TYPE_ALIEN_SHOP", 9, "nine_search");
        TYPE_ALIEN_SHOP = c0qxx10;
        C0QXX c0qxx11 = new C0QXX("TYPE_FROM_ALIEN_SHOP", 10, "from_nine_search");
        TYPE_FROM_ALIEN_SHOP = c0qxx11;
        C0QXX[] c0qxxArr = {c0qxx, c0qxx2, c0qxx3, c0qxx4, c0qxx5, c0qxx6, c0qxx7, c0qxx8, c0qxx9, c0qxx10, c0qxx11};
        LLILLJJLI = c0qxxArr;
        LLILLL = new C2254308sP(c0qxxArr);
    }

    public static C0QXX[] values() {
        return (C0QXX[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0QXX valueOf(String str) {
        return (C0QXX) C08FF.LIZ(C0QXX.class, str);
    }

    public C0QXX(String str, int i, String str2) {
        this.LL = str2;
    }
}
