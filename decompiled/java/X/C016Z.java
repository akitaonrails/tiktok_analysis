package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016Z, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016Z {
    public static final C016Z BOTTOM_BAR;
    public static final C016Z CAPTION_SETTING;
    public static final C016Z CLICK_ICON;
    public static final C016Z CLICK_SUBTITLE;
    public static final C016Z FEED_LOWER_BUTTON;
    public static final /* synthetic */ C016Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C016Z LONG_PRESS;
    public static final C016Z SHARE_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<C016Z> getEntries() {
        return LLILLL;
    }

    static {
        C016Z c016z = new C016Z("BOTTOM_BAR", 0, "bottom_bar");
        BOTTOM_BAR = c016z;
        C016Z c016z2 = new C016Z("FEED_LOWER_BUTTON", 1, "feed_lower_button");
        FEED_LOWER_BUTTON = c016z2;
        C016Z c016z3 = new C016Z("CAPTION_SETTING", 2, "caption_setting");
        CAPTION_SETTING = c016z3;
        C016Z c016z4 = new C016Z("CLICK_ICON", 3, "click_icon");
        CLICK_ICON = c016z4;
        C016Z c016z5 = new C016Z("CLICK_SUBTITLE", 4, "click_subtitle");
        CLICK_SUBTITLE = c016z5;
        C016Z c016z6 = new C016Z("LONG_PRESS", 5, "long_press");
        LONG_PRESS = c016z6;
        C016Z c016z7 = new C016Z("SHARE_PANEL", 6, "share_panel");
        SHARE_PANEL = c016z7;
        C016Z[] c016zArr = {c016z, c016z2, c016z3, c016z4, c016z5, c016z6, c016z7};
        LLILLJJLI = c016zArr;
        LLILLL = new C2254308sP(c016zArr);
    }

    public static C016Z[] values() {
        return (C016Z[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C016Z valueOf(String str) {
        return (C016Z) C08FF.LIZ(C016Z.class, str);
    }

    public C016Z(String str, int i, String str2) {
        this.LL = str2;
    }
}
