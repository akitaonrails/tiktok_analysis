package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1179480gna {
    public static final C1179490gnb Companion;
    public static final /* synthetic */ EnumC1179480gna[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1179480gna POI_DETAIL_TAG_CONTENT_TYPE_DEAL_CNT;
    public static final EnumC1179480gna POI_DETAIL_TAG_CONTENT_TYPE_FAV_CNT;
    public static final EnumC1179480gna POI_DETAIL_TAG_CONTENT_TYPE_NEW_MERCHANT;
    public static final EnumC1179480gna POI_DETAIL_TAG_CONTENT_TYPE_POST_CNT;
    public static final EnumC1179480gna POI_DETAIL_TAG_OPENING_STATUS;
    public static final EnumC1179480gna POI_DETAIL_TAG_TYPE_CATEGORY;
    public static final EnumC1179480gna POI_DETAIL_TAG_TYPE_CHARTS;
    public static final EnumC1179480gna POI_DETAIL_TAG_TYPE_COMMON;
    public static final EnumC1179480gna POI_DETAIL_TAG_TYPE_HOTEL_RATING;
    public static final EnumC1179480gna POI_DETAIL_TAG_TYPE_OPENING_TIME;
    public static final EnumC1179480gna POI_DETAIL_TAG_TYPE_PRICE;
    public static final EnumC1179480gna POI_DETAIL_TAG_TYPE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1179480gna> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0gnb] */
    static {
        EnumC1179480gna enumC1179480gna = new EnumC1179480gna("POI_DETAIL_TAG_TYPE_UNKNOWN", 0, 0);
        POI_DETAIL_TAG_TYPE_UNKNOWN = enumC1179480gna;
        EnumC1179480gna enumC1179480gna2 = new EnumC1179480gna("POI_DETAIL_TAG_TYPE_COMMON", 1, 1);
        POI_DETAIL_TAG_TYPE_COMMON = enumC1179480gna2;
        EnumC1179480gna enumC1179480gna3 = new EnumC1179480gna("POI_DETAIL_TAG_TYPE_PRICE", 2, 2);
        POI_DETAIL_TAG_TYPE_PRICE = enumC1179480gna3;
        EnumC1179480gna enumC1179480gna4 = new EnumC1179480gna("POI_DETAIL_TAG_TYPE_HOTEL_RATING", 3, 3);
        POI_DETAIL_TAG_TYPE_HOTEL_RATING = enumC1179480gna4;
        EnumC1179480gna enumC1179480gna5 = new EnumC1179480gna("POI_DETAIL_TAG_TYPE_OPENING_TIME", 4, 4);
        POI_DETAIL_TAG_TYPE_OPENING_TIME = enumC1179480gna5;
        EnumC1179480gna enumC1179480gna6 = new EnumC1179480gna("POI_DETAIL_TAG_TYPE_CATEGORY", 5, 5);
        POI_DETAIL_TAG_TYPE_CATEGORY = enumC1179480gna6;
        EnumC1179480gna enumC1179480gna7 = new EnumC1179480gna("POI_DETAIL_TAG_TYPE_CHARTS", 6, 6);
        POI_DETAIL_TAG_TYPE_CHARTS = enumC1179480gna7;
        EnumC1179480gna enumC1179480gna8 = new EnumC1179480gna("POI_DETAIL_TAG_CONTENT_TYPE_FAV_CNT", 7, 9);
        POI_DETAIL_TAG_CONTENT_TYPE_FAV_CNT = enumC1179480gna8;
        EnumC1179480gna enumC1179480gna9 = new EnumC1179480gna("POI_DETAIL_TAG_CONTENT_TYPE_POST_CNT", 8, 10);
        POI_DETAIL_TAG_CONTENT_TYPE_POST_CNT = enumC1179480gna9;
        EnumC1179480gna enumC1179480gna10 = new EnumC1179480gna("POI_DETAIL_TAG_CONTENT_TYPE_DEAL_CNT", 9, 11);
        POI_DETAIL_TAG_CONTENT_TYPE_DEAL_CNT = enumC1179480gna10;
        EnumC1179480gna enumC1179480gna11 = new EnumC1179480gna("POI_DETAIL_TAG_OPENING_STATUS", 10, 15);
        POI_DETAIL_TAG_OPENING_STATUS = enumC1179480gna11;
        EnumC1179480gna enumC1179480gna12 = new EnumC1179480gna("POI_DETAIL_TAG_CONTENT_TYPE_NEW_MERCHANT", 11, 16);
        POI_DETAIL_TAG_CONTENT_TYPE_NEW_MERCHANT = enumC1179480gna12;
        EnumC1179480gna[] enumC1179480gnaArr = {enumC1179480gna, enumC1179480gna2, enumC1179480gna3, enumC1179480gna4, enumC1179480gna5, enumC1179480gna6, enumC1179480gna7, enumC1179480gna8, enumC1179480gna9, enumC1179480gna10, enumC1179480gna11, enumC1179480gna12};
        LLILLJJLI = enumC1179480gnaArr;
        LLILLL = new C2254308sP(enumC1179480gnaArr);
        Companion = new Object() { // from class: X.0gnb
        };
    }

    public static EnumC1179480gna[] values() {
        return (EnumC1179480gna[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1179480gna valueOf(String str) {
        return (EnumC1179480gna) C08FF.LIZ(EnumC1179480gna.class, str);
    }

    public EnumC1179480gna(String str, int i, int i2) {
        this.LL = i2;
    }
}
