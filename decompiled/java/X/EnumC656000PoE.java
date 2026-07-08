package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PoE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656000PoE {
    public static final /* synthetic */ EnumC656000PoE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC656000PoE SEARCH_AD_AI_SUMMARY_ANOLE;
    public static final EnumC656000PoE SEARCH_AD_HYBRID_ABOVE_LAYER;
    public static final EnumC656000PoE SEARCH_AD_HYBRID_CARD;
    public static final EnumC656000PoE SEARCH_AD_NORMAL_VIDEO_DESC;
    public static final EnumC656000PoE SEARCH_AD_TOP_SINGLE_CARD_FOOTER;
    public static final EnumC656000PoE SEARCH_AD_TOP_SINGLE_CARD_HEADER;
    public static final EnumC656000PoE SEARCH_AD_TWO_COLUMN_CARD_BOTTOM;
    public static final EnumC656000PoE SEARCH_SINGLE_CARD_LOWER_FOOTER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC656000PoE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC656000PoE enumC656000PoE = new EnumC656000PoE("SEARCH_AD_HYBRID_CARD", 0, "tt_search_ad_hybrid_card");
        SEARCH_AD_HYBRID_CARD = enumC656000PoE;
        EnumC656000PoE enumC656000PoE2 = new EnumC656000PoE("SEARCH_AD_TOP_SINGLE_CARD_FOOTER", 1, "tt_search_single_card_footer");
        SEARCH_AD_TOP_SINGLE_CARD_FOOTER = enumC656000PoE2;
        EnumC656000PoE enumC656000PoE3 = new EnumC656000PoE("SEARCH_SINGLE_CARD_LOWER_FOOTER", 2, "tt_search_single_card_lower_footer");
        SEARCH_SINGLE_CARD_LOWER_FOOTER = enumC656000PoE3;
        EnumC656000PoE enumC656000PoE4 = new EnumC656000PoE("SEARCH_AD_TOP_SINGLE_CARD_HEADER", 3, "tt_search_single_card_header");
        SEARCH_AD_TOP_SINGLE_CARD_HEADER = enumC656000PoE4;
        EnumC656000PoE enumC656000PoE5 = new EnumC656000PoE("SEARCH_AD_TWO_COLUMN_CARD_BOTTOM", 4, "tt_search_bottom_slot");
        SEARCH_AD_TWO_COLUMN_CARD_BOTTOM = enumC656000PoE5;
        EnumC656000PoE enumC656000PoE6 = new EnumC656000PoE("SEARCH_AD_NORMAL_VIDEO_DESC", 5, "tt_search_normal_card_desc_slot");
        SEARCH_AD_NORMAL_VIDEO_DESC = enumC656000PoE6;
        EnumC656000PoE enumC656000PoE7 = new EnumC656000PoE("SEARCH_AD_HYBRID_ABOVE_LAYER", 6, "search_hybrid_anole_above_layer");
        SEARCH_AD_HYBRID_ABOVE_LAYER = enumC656000PoE7;
        EnumC656000PoE enumC656000PoE8 = new EnumC656000PoE("SEARCH_AD_AI_SUMMARY_ANOLE", 7, "search_ai_template_card_slot");
        SEARCH_AD_AI_SUMMARY_ANOLE = enumC656000PoE8;
        EnumC656000PoE[] enumC656000PoEArr = {enumC656000PoE, enumC656000PoE2, enumC656000PoE3, enumC656000PoE4, enumC656000PoE5, enumC656000PoE6, enumC656000PoE7, enumC656000PoE8};
        LLILLJJLI = enumC656000PoEArr;
        LLILLL = new C2254308sP(enumC656000PoEArr);
    }

    public static EnumC656000PoE[] values() {
        return (EnumC656000PoE[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC656000PoE valueOf(String str) {
        return (EnumC656000PoE) C08FF.LIZ(EnumC656000PoE.class, str);
    }

    public EnumC656000PoE(String str, int i, String str2) {
        this.LL = str2;
    }
}
