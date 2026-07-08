package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC645610PTz {
    public static final EnumC645610PTz GENERAL_REFACTOR;
    public static final EnumC645610PTz LIVE_FEED;
    public static final EnumC645610PTz LIVE_IN_MIX_FEED;
    public static final EnumC645610PTz LIVE_IN_PRODUCT_CARD;
    public static final /* synthetic */ EnumC645610PTz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC645610PTz PHOTO_IN_MIX_FEED;
    public static final EnumC645610PTz PRODUCT_IN_PRODUCT_CARD;
    public static final EnumC645610PTz SEARCH_LIVE_FEED;
    public static final EnumC645610PTz SEARCH_LIVE_IN_MIX_FEED;
    public static final EnumC645610PTz USER_DETAIL;
    public static final EnumC645610PTz USER_LIVE;
    public static final EnumC645610PTz USER_SUB_CARD;
    public static final EnumC645610PTz VIDEO_IN_MIX_FEED;
    public static final EnumC645610PTz VIDEO_IN_PRODUCT_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC645610PTz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC645610PTz enumC645610PTz = new EnumC645610PTz("VIDEO_IN_MIX_FEED", 0, "video_in_mix_feed");
        VIDEO_IN_MIX_FEED = enumC645610PTz;
        EnumC645610PTz enumC645610PTz2 = new EnumC645610PTz("LIVE_IN_MIX_FEED", 1, "live_in_mix_feed");
        LIVE_IN_MIX_FEED = enumC645610PTz2;
        EnumC645610PTz enumC645610PTz3 = new EnumC645610PTz("SEARCH_LIVE_IN_MIX_FEED", 2, "search_live_in_mix_feed");
        SEARCH_LIVE_IN_MIX_FEED = enumC645610PTz3;
        EnumC645610PTz enumC645610PTz4 = new EnumC645610PTz("PHOTO_IN_MIX_FEED", 3, "photo_in_mix_feed");
        PHOTO_IN_MIX_FEED = enumC645610PTz4;
        EnumC645610PTz enumC645610PTz5 = new EnumC645610PTz("LIVE_FEED", 4, "live_feed");
        LIVE_FEED = enumC645610PTz5;
        EnumC645610PTz enumC645610PTz6 = new EnumC645610PTz("SEARCH_LIVE_FEED", 5, "search_live_feed");
        SEARCH_LIVE_FEED = enumC645610PTz6;
        EnumC645610PTz enumC645610PTz7 = new EnumC645610PTz("PRODUCT_IN_PRODUCT_CARD", 6, "product_in_product_card");
        PRODUCT_IN_PRODUCT_CARD = enumC645610PTz7;
        EnumC645610PTz enumC645610PTz8 = new EnumC645610PTz("VIDEO_IN_PRODUCT_CARD", 7, "video_in_product_card");
        VIDEO_IN_PRODUCT_CARD = enumC645610PTz8;
        EnumC645610PTz enumC645610PTz9 = new EnumC645610PTz("LIVE_IN_PRODUCT_CARD", 8, "live_in_product_card");
        LIVE_IN_PRODUCT_CARD = enumC645610PTz9;
        EnumC645610PTz enumC645610PTz10 = new EnumC645610PTz("GENERAL_REFACTOR", 9, "general_refactor");
        GENERAL_REFACTOR = enumC645610PTz10;
        EnumC645610PTz enumC645610PTz11 = new EnumC645610PTz("USER_DETAIL", 10, "user_detail");
        USER_DETAIL = enumC645610PTz11;
        EnumC645610PTz enumC645610PTz12 = new EnumC645610PTz("USER_LIVE", 11, "user_live");
        USER_LIVE = enumC645610PTz12;
        EnumC645610PTz enumC645610PTz13 = new EnumC645610PTz("USER_SUB_CARD", 12, "user_sub_card");
        USER_SUB_CARD = enumC645610PTz13;
        EnumC645610PTz[] enumC645610PTzArr = {enumC645610PTz, enumC645610PTz2, enumC645610PTz3, enumC645610PTz4, enumC645610PTz5, enumC645610PTz6, enumC645610PTz7, enumC645610PTz8, enumC645610PTz9, enumC645610PTz10, enumC645610PTz11, enumC645610PTz12, enumC645610PTz13};
        LLILLJJLI = enumC645610PTzArr;
        LLILLL = new C2254308sP(enumC645610PTzArr);
    }

    public static EnumC645610PTz[] values() {
        return (EnumC645610PTz[]) LLILLJJLI.clone();
    }

    public final String getSceneName() {
        return this.LL;
    }

    public static EnumC645610PTz valueOf(String str) {
        return (EnumC645610PTz) C08FF.LIZ(EnumC645610PTz.class, str);
    }

    public EnumC645610PTz(String str, int i, String str2) {
        this.LL = str2;
    }
}
