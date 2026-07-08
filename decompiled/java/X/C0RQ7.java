package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQ7 {
    public static final C0RQ7 ANOLE_FEED_COMMENT_TOP;
    public static final C0RQ7 ANOLE_INTERACTIVE_BOTTOM_BANNER_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_BOTTOM_BANNER_UNDER_WATER_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_BOTTOM_LABEL_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_BOTTOM_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_LEFT_BELOW_DESC_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_LEFT_BOTTOM_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_LEFT_MID_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_LEFT_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_LEFT_TOP_SLOT;
    public static final C0RQ7 ANOLE_INTERACTIVE_RIGHT_SLOT;
    public static final C0RQ7 ANOLE_LIVE_PREVIEW_ABOVE_INTERACTIVE;
    public static final C0RQ7 ANOLE_LIVE_PREVIEW_ABOVE_SPONSOR;
    public static final C0RQ7 ANOLE_TITLE_PANEL_COMMERCE_BOTTOM_SLOT;
    public static final C0RQ7 ANOLE_TITLE_PANEL_COMMERCE_TOP_SLOT;
    public static final /* synthetic */ C0RQ7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0RQ7> getEntries() {
        return LLILLL;
    }

    static {
        C0RQ7 c0rq7 = new C0RQ7("ANOLE_INTERACTIVE_LEFT_SLOT", 0, "tt_feed_interactive_left");
        ANOLE_INTERACTIVE_LEFT_SLOT = c0rq7;
        C0RQ7 c0rq72 = new C0RQ7("ANOLE_INTERACTIVE_LEFT_BELOW_DESC_SLOT", 1, "tt_feed_left_below_desc_interactive");
        ANOLE_INTERACTIVE_LEFT_BELOW_DESC_SLOT = c0rq72;
        C0RQ7 c0rq73 = new C0RQ7("ANOLE_INTERACTIVE_LEFT_TOP_SLOT", 2, "tt_feed_left_top_interactive");
        ANOLE_INTERACTIVE_LEFT_TOP_SLOT = c0rq73;
        C0RQ7 c0rq74 = new C0RQ7("ANOLE_INTERACTIVE_LEFT_BOTTOM_SLOT", 3, "tt_feed_left_bottom_interactive");
        ANOLE_INTERACTIVE_LEFT_BOTTOM_SLOT = c0rq74;
        C0RQ7 c0rq75 = new C0RQ7("ANOLE_INTERACTIVE_RIGHT_SLOT", 4, "tt_feed_interactive_right");
        ANOLE_INTERACTIVE_RIGHT_SLOT = c0rq75;
        C0RQ7 c0rq76 = new C0RQ7("ANOLE_INTERACTIVE_BOTTOM_SLOT", 5, "tt_feed_interactive_bottom");
        ANOLE_INTERACTIVE_BOTTOM_SLOT = c0rq76;
        C0RQ7 c0rq77 = new C0RQ7("ANOLE_INTERACTIVE_LEFT_MID_SLOT", 6, "tt_feed_left_middle_interactive");
        ANOLE_INTERACTIVE_LEFT_MID_SLOT = c0rq77;
        C0RQ7 c0rq78 = new C0RQ7("ANOLE_INTERACTIVE_BOTTOM_LABEL_SLOT", 7, "tt_feed_interactive_bottom_label");
        ANOLE_INTERACTIVE_BOTTOM_LABEL_SLOT = c0rq78;
        C0RQ7 c0rq79 = new C0RQ7("ANOLE_INTERACTIVE_BOTTOM_BANNER_SLOT", 8, "tt_feed_bottom_banner");
        ANOLE_INTERACTIVE_BOTTOM_BANNER_SLOT = c0rq79;
        C0RQ7 c0rq710 = new C0RQ7("ANOLE_INTERACTIVE_BOTTOM_BANNER_UNDER_WATER_SLOT", 9, "tt_feed_bottom_banner_under_water");
        ANOLE_INTERACTIVE_BOTTOM_BANNER_UNDER_WATER_SLOT = c0rq710;
        C0RQ7 c0rq711 = new C0RQ7("ANOLE_LIVE_PREVIEW_ABOVE_SPONSOR", 10, "tt_live_preview_above_sponsor");
        ANOLE_LIVE_PREVIEW_ABOVE_SPONSOR = c0rq711;
        C0RQ7 c0rq712 = new C0RQ7("ANOLE_LIVE_PREVIEW_ABOVE_INTERACTIVE", 11, "tt_live_preview_above_interactive");
        ANOLE_LIVE_PREVIEW_ABOVE_INTERACTIVE = c0rq712;
        C0RQ7 c0rq713 = new C0RQ7("ANOLE_TITLE_PANEL_COMMERCE_TOP_SLOT", 12, "title_panel_commerce_top_slot");
        ANOLE_TITLE_PANEL_COMMERCE_TOP_SLOT = c0rq713;
        C0RQ7 c0rq714 = new C0RQ7("ANOLE_TITLE_PANEL_COMMERCE_BOTTOM_SLOT", 13, "title_panel_commerce_bottom_slot");
        ANOLE_TITLE_PANEL_COMMERCE_BOTTOM_SLOT = c0rq714;
        C0RQ7 c0rq715 = new C0RQ7("ANOLE_FEED_COMMENT_TOP", 14, "tt_feed_comment_top");
        ANOLE_FEED_COMMENT_TOP = c0rq715;
        C0RQ7[] c0rq7Arr = {c0rq7, c0rq72, c0rq73, c0rq74, c0rq75, c0rq76, c0rq77, c0rq78, c0rq79, c0rq710, c0rq711, c0rq712, c0rq713, c0rq714, c0rq715};
        LLILLJJLI = c0rq7Arr;
        LLILLL = new C2254308sP(c0rq7Arr);
    }

    public static C0RQ7[] values() {
        return (C0RQ7[]) LLILLJJLI.clone();
    }

    public final String getSlotName() {
        return this.LL;
    }

    public static C0RQ7 valueOf(String str) {
        return (C0RQ7) C08FF.LIZ(C0RQ7.class, str);
    }

    public C0RQ7(String str, int i, String str2) {
        this.LL = str2;
    }
}
