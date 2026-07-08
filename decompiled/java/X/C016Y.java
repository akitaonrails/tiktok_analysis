package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016Y, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016Y {
    public static final C016Y CAPTION_SETTING;
    public static final C016Y CLICK_ICON;
    public static final C016Y CLICK_SUBTITLE;
    public static final C016Y FEED_LOWER_BUTTON;
    public static final /* synthetic */ C016Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C016Y LONG_PRESS;
    public static final C016Y SHARE_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<C016Y> getEntries() {
        return LLILLL;
    }

    static {
        C016Y c016y = new C016Y("FEED_LOWER_BUTTON", 0, "feed_lower_button");
        FEED_LOWER_BUTTON = c016y;
        C016Y c016y2 = new C016Y("CAPTION_SETTING", 1, "caption_setting");
        CAPTION_SETTING = c016y2;
        C016Y c016y3 = new C016Y("CLICK_ICON", 2, "click_icon");
        CLICK_ICON = c016y3;
        C016Y c016y4 = new C016Y("CLICK_SUBTITLE", 3, "click_subtitle");
        CLICK_SUBTITLE = c016y4;
        C016Y c016y5 = new C016Y("LONG_PRESS", 4, "long_press");
        LONG_PRESS = c016y5;
        C016Y c016y6 = new C016Y("SHARE_PANEL", 5, "share_panel");
        SHARE_PANEL = c016y6;
        C016Y[] c016yArr = {c016y, c016y2, c016y3, c016y4, c016y5, c016y6};
        LLILLJJLI = c016yArr;
        LLILLL = new C2254308sP(c016yArr);
    }

    public static C016Y[] values() {
        return (C016Y[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016Y valueOf(String str) {
        return (C016Y) C08FF.LIZ(C016Y.class, str);
    }

    public C016Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
