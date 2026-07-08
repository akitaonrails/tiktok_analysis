package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Prd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC658110Prd {
    public static final EnumC658110Prd CAROUSEL_ADS;
    public static final EnumC658110Prd HYBRID_AD;
    public static final EnumC658110Prd LIVE_AD;
    public static final /* synthetic */ EnumC658110Prd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC658110Prd MIXED_CREATIVE_SUB_VIDEO;
    public static final EnumC658110Prd NORMAL_VIDEO_AD;
    public static final EnumC658110Prd OLE_PAC_SUB_VIDEO;
    public static final EnumC658110Prd PRECISE_AD;
    public static final EnumC658110Prd PRODUCT_PHOTO;
    public static final EnumC658110Prd TOP_SINGLE_CARD_LIVE;
    public static final EnumC658110Prd TOP_SINGLE_CARD_PHOTO;
    public static final EnumC658110Prd TOP_SINGLE_CARD_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC658110Prd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC658110Prd enumC658110Prd = new EnumC658110Prd("NORMAL_VIDEO_AD", 0, "normal_video_ad");
        NORMAL_VIDEO_AD = enumC658110Prd;
        EnumC658110Prd enumC658110Prd2 = new EnumC658110Prd("PRECISE_AD", 1, "precise_ad");
        PRECISE_AD = enumC658110Prd2;
        EnumC658110Prd enumC658110Prd3 = new EnumC658110Prd("LIVE_AD", 2, "live_ad");
        LIVE_AD = enumC658110Prd3;
        EnumC658110Prd enumC658110Prd4 = new EnumC658110Prd("PRODUCT_PHOTO", 3, "product_photo");
        PRODUCT_PHOTO = enumC658110Prd4;
        EnumC658110Prd enumC658110Prd5 = new EnumC658110Prd("CAROUSEL_ADS", 4, "carousel_ads");
        CAROUSEL_ADS = enumC658110Prd5;
        EnumC658110Prd enumC658110Prd6 = new EnumC658110Prd("HYBRID_AD", 5, "hybrid_ad");
        HYBRID_AD = enumC658110Prd6;
        EnumC658110Prd enumC658110Prd7 = new EnumC658110Prd("TOP_SINGLE_CARD_VIDEO", 6, "top_single_card_video");
        TOP_SINGLE_CARD_VIDEO = enumC658110Prd7;
        EnumC658110Prd enumC658110Prd8 = new EnumC658110Prd("TOP_SINGLE_CARD_PHOTO", 7, "top_single_card_photo");
        TOP_SINGLE_CARD_PHOTO = enumC658110Prd8;
        EnumC658110Prd enumC658110Prd9 = new EnumC658110Prd("TOP_SINGLE_CARD_LIVE", 8, "top_single_card_live");
        TOP_SINGLE_CARD_LIVE = enumC658110Prd9;
        EnumC658110Prd enumC658110Prd10 = new EnumC658110Prd("MIXED_CREATIVE_SUB_VIDEO", 9, "mixed_creative_sub_video");
        MIXED_CREATIVE_SUB_VIDEO = enumC658110Prd10;
        EnumC658110Prd enumC658110Prd11 = new EnumC658110Prd("OLE_PAC_SUB_VIDEO", 10, "ole_pac_sub_video");
        OLE_PAC_SUB_VIDEO = enumC658110Prd11;
        EnumC658110Prd[] enumC658110PrdArr = {enumC658110Prd, enumC658110Prd2, enumC658110Prd3, enumC658110Prd4, enumC658110Prd5, enumC658110Prd6, enumC658110Prd7, enumC658110Prd8, enumC658110Prd9, enumC658110Prd10, enumC658110Prd11};
        LLILLJJLI = enumC658110PrdArr;
        LLILLL = new C2254308sP(enumC658110PrdArr);
    }

    public static EnumC658110Prd[] values() {
        return (EnumC658110Prd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC658110Prd valueOf(String str) {
        return (EnumC658110Prd) C08FF.LIZ(EnumC658110Prd.class, str);
    }

    public EnumC658110Prd(String str, int i, String str2) {
        this.LL = str2;
    }
}
