package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1914810zvb {
    public static final EnumC1914810zvb ENABLE_ALGO_REFRESH_ENTRANCE;
    public static final EnumC1914810zvb ENABLE_ENGAGEMENT_COUNT_ENTRANCE;
    public static final EnumC1914810zvb ENABLE_FILTER_KEYWORDS_ENTRANCE;
    public static final EnumC1914810zvb ENABLE_HIDE_ACCOUNT_ENTRANCE;
    public static final EnumC1914810zvb ENABLE_MANAGE_TOPICS_ENTRANCE;
    public static final EnumC1914810zvb ENABLE_PERSONALIZED_FEEDS_ENTRANCE;
    public static final EnumC1914810zvb ENABLE_PERSONALIZED_SEARCH_ENTRANCE;
    public static final EnumC1914810zvb ENABLE_RESTRICTED_MODE_ENTRANCE;
    public static final EnumC1914810zvb ENABLE_STEM_FEED_ENTRANCE;
    public static final /* synthetic */ EnumC1914810zvb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1914810zvb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1914810zvb enumC1914810zvb = new EnumC1914810zvb("ENABLE_FILTER_KEYWORDS_ENTRANCE", 0, "enableFilterKeywordsEntrance");
        ENABLE_FILTER_KEYWORDS_ENTRANCE = enumC1914810zvb;
        EnumC1914810zvb enumC1914810zvb2 = new EnumC1914810zvb("ENABLE_RESTRICTED_MODE_ENTRANCE", 1, "enableRestrictedModeEntrance");
        ENABLE_RESTRICTED_MODE_ENTRANCE = enumC1914810zvb2;
        EnumC1914810zvb enumC1914810zvb3 = new EnumC1914810zvb("ENABLE_PERSONALIZED_FEEDS_ENTRANCE", 2, "enablePersonalizedFeedsEntrance");
        ENABLE_PERSONALIZED_FEEDS_ENTRANCE = enumC1914810zvb3;
        EnumC1914810zvb enumC1914810zvb4 = new EnumC1914810zvb("ENABLE_PERSONALIZED_SEARCH_ENTRANCE", 3, "enablePersonalizedSearchEntrance");
        ENABLE_PERSONALIZED_SEARCH_ENTRANCE = enumC1914810zvb4;
        EnumC1914810zvb enumC1914810zvb5 = new EnumC1914810zvb("ENABLE_MANAGE_TOPICS_ENTRANCE", 4, "enableManageTopicsEntrance");
        ENABLE_MANAGE_TOPICS_ENTRANCE = enumC1914810zvb5;
        EnumC1914810zvb enumC1914810zvb6 = new EnumC1914810zvb("ENABLE_ALGO_REFRESH_ENTRANCE", 5, "enableAlgoRefreshEntrance");
        ENABLE_ALGO_REFRESH_ENTRANCE = enumC1914810zvb6;
        EnumC1914810zvb enumC1914810zvb7 = new EnumC1914810zvb("ENABLE_HIDE_ACCOUNT_ENTRANCE", 6, "enableHideAccountEntrance");
        ENABLE_HIDE_ACCOUNT_ENTRANCE = enumC1914810zvb7;
        EnumC1914810zvb enumC1914810zvb8 = new EnumC1914810zvb("ENABLE_ENGAGEMENT_COUNT_ENTRANCE", 7, "enableEngagementCountEntrance");
        ENABLE_ENGAGEMENT_COUNT_ENTRANCE = enumC1914810zvb8;
        EnumC1914810zvb enumC1914810zvb9 = new EnumC1914810zvb("ENABLE_STEM_FEED_ENTRANCE", 8, "enableSTEMFeedEntrance");
        ENABLE_STEM_FEED_ENTRANCE = enumC1914810zvb9;
        EnumC1914810zvb[] enumC1914810zvbArr = {enumC1914810zvb, enumC1914810zvb2, enumC1914810zvb3, enumC1914810zvb4, enumC1914810zvb5, enumC1914810zvb6, enumC1914810zvb7, enumC1914810zvb8, enumC1914810zvb9};
        LLILLJJLI = enumC1914810zvbArr;
        LLILLL = new C2254308sP(enumC1914810zvbArr);
    }

    public static EnumC1914810zvb[] values() {
        return (EnumC1914810zvb[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1914810zvb valueOf(String str) {
        return (EnumC1914810zvb) C08FF.LIZ(EnumC1914810zvb.class, str);
    }

    public EnumC1914810zvb(String str, int i, String str2) {
        this.LL = str2;
    }
}
