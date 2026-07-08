package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ram, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1594380ram implements C0QF8 {
    public static final EnumC1594380ram AUTOSCROLL_ICON;
    public static final EnumC1594380ram CHANGE_FIRST_ITEM;
    public static final EnumC1594380ram CHANGE_NEXT_PAGE;
    public static final EnumC1594380ram CLEAR_SCREEN;
    public static final EnumC1594380ram COMMENT_PANEL_SHOW;
    public static final EnumC1594380ram COMPLIANCE_IAP;
    public static final EnumC1594380ram DESTROY;
    public static final EnumC1594380ram HAVE_XTAB;
    public static final EnumC1594380ram HIDE_TOP_TAB;
    public static final EnumC1594380ram HIDE_TOP_TAB_ALPHA;
    public static final EnumC1594380ram LAUNCH_30S;
    public static final /* synthetic */ EnumC1594380ram[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1594380ram OTHER;
    public static final EnumC1594380ram PAUSE_PANEL_SHOW;
    public static final EnumC1594380ram PHOTO_INDICATOR_SHOW;
    public static final EnumC1594380ram SKYLIGHT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1594380ram> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1594380ram enumC1594380ram = new EnumC1594380ram("COMPLIANCE_IAP", 0, null);
        COMPLIANCE_IAP = enumC1594380ram;
        EnumC1594380ram enumC1594380ram2 = new EnumC1594380ram("AUTOSCROLL_ICON", 1, "autoscroll_icon");
        AUTOSCROLL_ICON = enumC1594380ram2;
        EnumC1594380ram enumC1594380ram3 = new EnumC1594380ram("LAUNCH_30S", 2, "launch_30s");
        LAUNCH_30S = enumC1594380ram3;
        EnumC1594380ram enumC1594380ram4 = new EnumC1594380ram("CHANGE_FIRST_ITEM", 3, "change_first_item");
        CHANGE_FIRST_ITEM = enumC1594380ram4;
        EnumC1594380ram enumC1594380ram5 = new EnumC1594380ram("CHANGE_NEXT_PAGE", 4, "change_next_page");
        CHANGE_NEXT_PAGE = enumC1594380ram5;
        EnumC1594380ram enumC1594380ram6 = new EnumC1594380ram("COMMENT_PANEL_SHOW", 5, "comment_panel_show");
        COMMENT_PANEL_SHOW = enumC1594380ram6;
        EnumC1594380ram enumC1594380ram7 = new EnumC1594380ram("HIDE_TOP_TAB", 6, null);
        HIDE_TOP_TAB = enumC1594380ram7;
        EnumC1594380ram enumC1594380ram8 = new EnumC1594380ram("HIDE_TOP_TAB_ALPHA", 7, null);
        HIDE_TOP_TAB_ALPHA = enumC1594380ram8;
        EnumC1594380ram enumC1594380ram9 = new EnumC1594380ram("SKYLIGHT", 8, "skylight");
        SKYLIGHT = enumC1594380ram9;
        EnumC1594380ram enumC1594380ram10 = new EnumC1594380ram("PAUSE_PANEL_SHOW", 9, "pause_panel_show");
        PAUSE_PANEL_SHOW = enumC1594380ram10;
        EnumC1594380ram enumC1594380ram11 = new EnumC1594380ram("HAVE_XTAB", 10, "have_xtab");
        HAVE_XTAB = enumC1594380ram11;
        EnumC1594380ram enumC1594380ram12 = new EnumC1594380ram("CLEAR_SCREEN", 11, "clear_screen");
        CLEAR_SCREEN = enumC1594380ram12;
        EnumC1594380ram enumC1594380ram13 = new EnumC1594380ram("PHOTO_INDICATOR_SHOW", 12, "photo_indicator_show");
        PHOTO_INDICATOR_SHOW = enumC1594380ram13;
        EnumC1594380ram enumC1594380ram14 = new EnumC1594380ram("DESTROY", 13, null);
        DESTROY = enumC1594380ram14;
        EnumC1594380ram enumC1594380ram15 = new EnumC1594380ram("OTHER", 14, "other");
        OTHER = enumC1594380ram15;
        EnumC1594380ram[] enumC1594380ramArr = {enumC1594380ram, enumC1594380ram2, enumC1594380ram3, enumC1594380ram4, enumC1594380ram5, enumC1594380ram6, enumC1594380ram7, enumC1594380ram8, enumC1594380ram9, enumC1594380ram10, enumC1594380ram11, enumC1594380ram12, enumC1594380ram13, enumC1594380ram14, enumC1594380ram15};
        LLILLJJLI = enumC1594380ramArr;
        LLILLL = new C2254308sP(enumC1594380ramArr);
    }

    public static EnumC1594380ram[] values() {
        return (EnumC1594380ram[]) LLILLJJLI.clone();
    }

    public final String getMobString() {
        return this.LL;
    }

    public static EnumC1594380ram valueOf(String str) {
        return (EnumC1594380ram) C08FF.LIZ(EnumC1594380ram.class, str);
    }

    public EnumC1594380ram(String str, int i, String str2) {
        this.LL = str2;
    }
}
