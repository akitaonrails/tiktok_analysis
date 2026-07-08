package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CO {
    public static final /* synthetic */ C00CO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00CO SEARCH_PROP;
    public static final C00CO SEARCH_PROP_RECOMMEND_LIST;
    public static final C00CO SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL;
    public final String LL;

    public static InterfaceC2044707zh<C00CO> getEntries() {
        return LLILLL;
    }

    static {
        C00CO c00co = new C00CO("SEARCH_PROP_RECOMMEND_LIST", 0, "search_prop_recommendation_list_shown_success_rate");
        SEARCH_PROP_RECOMMEND_LIST = c00co;
        C00CO c00co2 = new C00CO("SEARCH_PROP", 1, "search_prop_success_rate");
        SEARCH_PROP = c00co2;
        C00CO c00co3 = new C00CO("SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL", 2, "service_creative_record_segments_delete_illegal");
        SERVICE_RECORD_SEGMENTS_DELETE_ILLEGAL = c00co3;
        C00CO[] c00coArr = {c00co, c00co2, c00co3};
        LLILLJJLI = c00coArr;
        LLILLL = new C2254308sP(c00coArr);
    }

    public static C00CO[] values() {
        return (C00CO[]) LLILLJJLI.clone();
    }

    public final String getServiceName() {
        return this.LL;
    }

    public static C00CO valueOf(String str) {
        return (C00CO) C08FF.LIZ(C00CO.class, str);
    }

    public C00CO(String str, int i, String str2) {
        this.LL = str2;
    }
}
