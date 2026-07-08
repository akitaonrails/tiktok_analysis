package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J09, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J09 {
    public static final C0J09 AI_SUMMARY_CARD;
    public static final C0J09 EC_AD_CARD;
    public static final C0J09 EC_LIVE_FEED_CARD;
    public static final C0J09 EC_LIVE_INFO;
    public static final C0J09 EC_PREVIEW_CARD_INFO;
    public static final C0J09 GO_LIVE_CARD;
    public static final C0J09 LIVE_SURVEY_CARD;
    public static final /* synthetic */ C0J09[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0J09 PROGRAMMED_LIVE_INFO;
    public static final C0J09 UNDEFINED;
    public final String LL;

    public static InterfaceC2044707zh<C0J09> getEntries() {
        return LLILLL;
    }

    static {
        C0J09 c0j09 = new C0J09("UNDEFINED", 0, "undefined");
        UNDEFINED = c0j09;
        C0J09 c0j092 = new C0J09("EC_LIVE_FEED_CARD", 1, "ec_live_feed_card");
        EC_LIVE_FEED_CARD = c0j092;
        C0J09 c0j093 = new C0J09("EC_PREVIEW_CARD_INFO", 2, "ec_preview_card_info");
        EC_PREVIEW_CARD_INFO = c0j093;
        C0J09 c0j094 = new C0J09("EC_LIVE_INFO", 3, "ec_live_info");
        EC_LIVE_INFO = c0j094;
        C0J09 c0j095 = new C0J09("EC_AD_CARD", 4, "ec_ad_card");
        EC_AD_CARD = c0j095;
        C0J09 c0j096 = new C0J09("PROGRAMMED_LIVE_INFO", 5, "programmed_live_info");
        PROGRAMMED_LIVE_INFO = c0j096;
        C0J09 c0j097 = new C0J09("GO_LIVE_CARD", 6, "go_live_card");
        GO_LIVE_CARD = c0j097;
        C0J09 c0j098 = new C0J09("AI_SUMMARY_CARD", 7, "ai_summary_card");
        AI_SUMMARY_CARD = c0j098;
        C0J09 c0j099 = new C0J09("LIVE_SURVEY_CARD", 8, "live_survey_card");
        LIVE_SURVEY_CARD = c0j099;
        C0J09[] c0j09Arr = {c0j09, c0j092, c0j093, c0j094, c0j095, c0j096, c0j097, c0j098, c0j099};
        LLILLJJLI = c0j09Arr;
        LLILLL = new C2254308sP(c0j09Arr);
    }

    public static C0J09[] values() {
        return (C0J09[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0J09 valueOf(String str) {
        return (C0J09) C08FF.LIZ(C0J09.class, str);
    }

    public C0J09(String str, int i, String str2) {
        this.LL = str2;
    }
}
