package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U56, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U56 {
    public static final C0U56 DEFAULT;
    public static final /* synthetic */ C0U56[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0U56 PANEL_BEAUTY_FILTER;
    public static final C0U56 PANEL_EFFECT_VOICE;
    public static final C0U56 PANEL_GIFT;
    public static final C0U56 PANEL_HASHTAG_ANCHOR;
    public static final C0U56 PANEL_HASHTAG_AUDIENCE;
    public static final C0U56 PANEL_HOURLY;
    public static final C0U56 PANEL_LINK;
    public static final C0U56 PANEL_MUSIC;
    public static final C0U56 PANEL_ONLINE_AUDIENCE_RANK;
    public static final C0U56 PANEL_PROFILE;
    public static final C0U56 PANEL_QA;
    public static final C0U56 PANEL_STICKER;
    public static final C0U56 PANEL_STICKER_PLAYBOOK;
    public final String LL;

    public static InterfaceC2044707zh<C0U56> getEntries() {
        return LLILLL;
    }

    static {
        C0U56 c0u56 = new C0U56("PANEL_GIFT", 0, "gift");
        PANEL_GIFT = c0u56;
        C0U56 c0u562 = new C0U56("PANEL_PROFILE", 1, "profile");
        PANEL_PROFILE = c0u562;
        C0U56 c0u563 = new C0U56("PANEL_HOURLY", 2, "hourly");
        PANEL_HOURLY = c0u563;
        C0U56 c0u564 = new C0U56("PANEL_QA", 3, "qa");
        PANEL_QA = c0u564;
        C0U56 c0u565 = new C0U56("PANEL_LINK", 4, "link");
        PANEL_LINK = c0u565;
        C0U56 c0u566 = new C0U56("PANEL_HASHTAG_ANCHOR", 5, "panel_hashtag_anchor");
        PANEL_HASHTAG_ANCHOR = c0u566;
        C0U56 c0u567 = new C0U56("PANEL_HASHTAG_AUDIENCE", 6, "panel_hashtag_audience");
        PANEL_HASHTAG_AUDIENCE = c0u567;
        C0U56 c0u568 = new C0U56("PANEL_BEAUTY_FILTER", 7, "panel_beauty_filter");
        PANEL_BEAUTY_FILTER = c0u568;
        C0U56 c0u569 = new C0U56("PANEL_STICKER", 8, "panel_sticker");
        PANEL_STICKER = c0u569;
        C0U56 c0u5610 = new C0U56("PANEL_STICKER_PLAYBOOK", 9, "panel_sticker_playbook");
        PANEL_STICKER_PLAYBOOK = c0u5610;
        C0U56 c0u5611 = new C0U56("PANEL_ONLINE_AUDIENCE_RANK", 10, "panel_online_audience_rank");
        PANEL_ONLINE_AUDIENCE_RANK = c0u5611;
        C0U56 c0u5612 = new C0U56("PANEL_EFFECT_VOICE", 11, "panel_effect_sound");
        PANEL_EFFECT_VOICE = c0u5612;
        C0U56 c0u5613 = new C0U56("PANEL_MUSIC", 12, "panel_music");
        PANEL_MUSIC = c0u5613;
        C0U56 c0u5614 = new C0U56(LivePreviewCTASmartDisplayManager.DEFAULT, 13, "default");
        DEFAULT = c0u5614;
        C0U56[] c0u56Arr = {c0u56, c0u562, c0u563, c0u564, c0u565, c0u566, c0u567, c0u568, c0u569, c0u5610, c0u5611, c0u5612, c0u5613, c0u5614};
        LLILLJJLI = c0u56Arr;
        LLILLL = new C2254308sP(c0u56Arr);
    }

    public static C0U56[] values() {
        return (C0U56[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0U56 valueOf(String str) {
        return (C0U56) C08FF.LIZ(C0U56.class, str);
    }

    public C0U56(String str, int i, String str2) {
        this.LL = str2;
    }
}
