package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672000QXm {
    public static final /* synthetic */ EnumC672000QXm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC672000QXm SOURCE_ANCHOR_MIDDLE;
    public static final EnumC672000QXm SOURCE_COMMENT_TOP_ANCHOR_MIDDLE;
    public static final EnumC672000QXm SOURCE_FEED_BOTTOM_BAR_MIDDLE;
    public static final EnumC672000QXm SOURCE_FROM_AFTER_SALE;
    public static final EnumC672000QXm SOURCE_FROM_HALF_SHOP;
    public static final EnumC672000QXm SOURCE_FROM_TT_LIVE_BAG;
    public static final EnumC672000QXm SOURCE_MALL_MIDDLE;
    public static final EnumC672000QXm SOURCE_PDP_MIDDLE;
    public static final EnumC672000QXm SOURCE_VIDEO_VISION_MIDDLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC672000QXm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC672000QXm enumC672000QXm = new EnumC672000QXm("SOURCE_MALL_MIDDLE", 0, "mall_middle_page");
        SOURCE_MALL_MIDDLE = enumC672000QXm;
        EnumC672000QXm enumC672000QXm2 = new EnumC672000QXm("SOURCE_PDP_MIDDLE", 1, "product_detail_middle_page");
        SOURCE_PDP_MIDDLE = enumC672000QXm2;
        EnumC672000QXm enumC672000QXm3 = new EnumC672000QXm("SOURCE_COMMENT_TOP_ANCHOR_MIDDLE", 2, "comment_product_middle_page");
        SOURCE_COMMENT_TOP_ANCHOR_MIDDLE = enumC672000QXm3;
        EnumC672000QXm enumC672000QXm4 = new EnumC672000QXm("SOURCE_FEED_BOTTOM_BAR_MIDDLE", 3, "video_product_middle_page");
        SOURCE_FEED_BOTTOM_BAR_MIDDLE = enumC672000QXm4;
        EnumC672000QXm enumC672000QXm5 = new EnumC672000QXm("SOURCE_ANCHOR_MIDDLE", 4, "anchor_product_middle_page");
        SOURCE_ANCHOR_MIDDLE = enumC672000QXm5;
        EnumC672000QXm enumC672000QXm6 = new EnumC672000QXm("SOURCE_FROM_HALF_SHOP", 5, "mall_middle_page");
        SOURCE_FROM_HALF_SHOP = enumC672000QXm6;
        EnumC672000QXm enumC672000QXm7 = new EnumC672000QXm("SOURCE_FROM_TT_LIVE_BAG", 6, "live_bag");
        SOURCE_FROM_TT_LIVE_BAG = enumC672000QXm7;
        EnumC672000QXm enumC672000QXm8 = new EnumC672000QXm("SOURCE_FROM_AFTER_SALE", 7, "after_sale_middle_page");
        SOURCE_FROM_AFTER_SALE = enumC672000QXm8;
        EnumC672000QXm enumC672000QXm9 = new EnumC672000QXm("SOURCE_VIDEO_VISION_MIDDLE", 8, "feed_pause_photo_middle_page");
        SOURCE_VIDEO_VISION_MIDDLE = enumC672000QXm9;
        EnumC672000QXm[] enumC672000QXmArr = {enumC672000QXm, enumC672000QXm2, enumC672000QXm3, enumC672000QXm4, enumC672000QXm5, enumC672000QXm6, enumC672000QXm7, enumC672000QXm8, enumC672000QXm9};
        LLILLJJLI = enumC672000QXmArr;
        LLILLL = new C2254308sP(enumC672000QXmArr);
    }

    public static EnumC672000QXm[] values() {
        return (EnumC672000QXm[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC672000QXm valueOf(String str) {
        return (EnumC672000QXm) C08FF.LIZ(EnumC672000QXm.class, str);
    }

    public EnumC672000QXm(String str, int i, String str2) {
        this.LL = str2;
    }
}
