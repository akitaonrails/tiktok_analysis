package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PQG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQG {
    public static final C0PQG AWEME_HAS_ANCHOR;
    public static final C0PQG CLICK_PRODUCT_NEXT_LINE;
    public static final C0PQG HIT_COUNT_THRESHOLD_IN_SINGLE_SEARCH;
    public static final C0PQG ID_TOGGLE;
    public static final C0PQG INSERT_FAIL;
    public static final C0PQG INVALID_FE_SCHEMA;
    public static final /* synthetic */ C0PQG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PQG MULTI_CARDS_IN_SINGLE_TOP_TAB;
    public static final C0PQG NETWORK_FAIL;
    public static final C0PQG PRODUCT_NEXT_LINE;
    public static final C0PQG QUERY_HAS_NO_ECOM_INTENT;
    public static final C0PQG RELATED_PRODUCT_TOO_FEW;
    public static final C0PQG RS_NEXT_LINE;
    public static final C0PQG VIDEO_DO_NOT_HAS_ECOM_INTENT;
    public static final C0PQG WATCH_DURATION_LESS_THAN_THRESHOLD;
    public final String LL;

    public static InterfaceC2044707zh<C0PQG> getEntries() {
        return LLILLL;
    }

    static {
        C0PQG c0pqg = new C0PQG("AWEME_HAS_ANCHOR", 0, "video_has_anchor");
        AWEME_HAS_ANCHOR = c0pqg;
        C0PQG c0pqg2 = new C0PQG("WATCH_DURATION_LESS_THAN_THRESHOLD", 1, "watch_duration_less_than_threshold");
        WATCH_DURATION_LESS_THAN_THRESHOLD = c0pqg2;
        C0PQG c0pqg3 = new C0PQG("RS_NEXT_LINE", 2, "rs_in_next_line");
        RS_NEXT_LINE = c0pqg3;
        C0PQG c0pqg4 = new C0PQG("PRODUCT_NEXT_LINE", 3, "product_in_next_line");
        PRODUCT_NEXT_LINE = c0pqg4;
        C0PQG c0pqg5 = new C0PQG("CLICK_PRODUCT_NEXT_LINE", 4, "product_in_next_line");
        CLICK_PRODUCT_NEXT_LINE = c0pqg5;
        C0PQG c0pqg6 = new C0PQG("QUERY_HAS_NO_ECOM_INTENT", 5, "query_has_no_ecom_intent");
        QUERY_HAS_NO_ECOM_INTENT = c0pqg6;
        C0PQG c0pqg7 = new C0PQG("VIDEO_DO_NOT_HAS_ECOM_INTENT", 6, "video_has_no_ecom_intent");
        VIDEO_DO_NOT_HAS_ECOM_INTENT = c0pqg7;
        C0PQG c0pqg8 = new C0PQG("HIT_COUNT_THRESHOLD_IN_SINGLE_SEARCH", 7, "related_product_check_frequency");
        HIT_COUNT_THRESHOLD_IN_SINGLE_SEARCH = c0pqg8;
        C0PQG c0pqg9 = new C0PQG("ID_TOGGLE", 8, "related_product_check_user_toggle");
        ID_TOGGLE = c0pqg9;
        C0PQG c0pqg10 = new C0PQG("MULTI_CARDS_IN_SINGLE_TOP_TAB", 9, "multi_cards_in_single_top_tab");
        MULTI_CARDS_IN_SINGLE_TOP_TAB = c0pqg10;
        C0PQG c0pqg11 = new C0PQG("INVALID_FE_SCHEMA", 10, "invalid_fe_schema");
        INVALID_FE_SCHEMA = c0pqg11;
        C0PQG c0pqg12 = new C0PQG("NETWORK_FAIL", 11, "network_fail");
        NETWORK_FAIL = c0pqg12;
        C0PQG c0pqg13 = new C0PQG("INSERT_FAIL", 12, "insert_fail");
        INSERT_FAIL = c0pqg13;
        C0PQG c0pqg14 = new C0PQG("RELATED_PRODUCT_TOO_FEW", 13, "related_product_too_few");
        RELATED_PRODUCT_TOO_FEW = c0pqg14;
        C0PQG[] c0pqgArr = {c0pqg, c0pqg2, c0pqg3, c0pqg4, c0pqg5, c0pqg6, c0pqg7, c0pqg8, c0pqg9, c0pqg10, c0pqg11, c0pqg12, c0pqg13, c0pqg14};
        LLILLJJLI = c0pqgArr;
        LLILLL = new C2254308sP(c0pqgArr);
    }

    public static C0PQG[] values() {
        return (C0PQG[]) LLILLJJLI.clone();
    }

    public final String getMessage() {
        return this.LL;
    }

    public static C0PQG valueOf(String str) {
        return (C0PQG) C08FF.LIZ(C0PQG.class, str);
    }

    public C0PQG(String str, int i, String str2) {
        this.LL = str2;
    }
}
