package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1589910rTZ {
    public static final EnumC1589910rTZ CLICK_BOTTOM_ICON;
    public static final EnumC1589910rTZ CLICK_SUB_TAB_LIST;
    public static final EnumC1589910rTZ CLICK_TOP_BACK_ICON;
    public static final EnumC1589910rTZ CLICK_TOP_ICON;
    public static final EnumC1589910rTZ DIRECT;
    public static final EnumC1589910rTZ GOBACK_ICON;
    public static final EnumC1589910rTZ HOME_SCREEN_ICON;
    public static final /* synthetic */ EnumC1589910rTZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1589910rTZ OPEN_APP;
    public static final EnumC1589910rTZ PLAYMODE_EXIT_BUTTON;
    public static final EnumC1589910rTZ SLIDE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1589910rTZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1589910rTZ enumC1589910rTZ = new EnumC1589910rTZ("SLIDE", 0, "slide");
        SLIDE = enumC1589910rTZ;
        EnumC1589910rTZ enumC1589910rTZ2 = new EnumC1589910rTZ("CLICK_TOP_ICON", 1, "click_top_icon");
        CLICK_TOP_ICON = enumC1589910rTZ2;
        EnumC1589910rTZ enumC1589910rTZ3 = new EnumC1589910rTZ("CLICK_BOTTOM_ICON", 2, "click_bottom_icon");
        CLICK_BOTTOM_ICON = enumC1589910rTZ3;
        EnumC1589910rTZ enumC1589910rTZ4 = new EnumC1589910rTZ("GOBACK_ICON", 3, "goback_icon");
        GOBACK_ICON = enumC1589910rTZ4;
        EnumC1589910rTZ enumC1589910rTZ5 = new EnumC1589910rTZ("OPEN_APP", 4, "open_app");
        OPEN_APP = enumC1589910rTZ5;
        EnumC1589910rTZ enumC1589910rTZ6 = new EnumC1589910rTZ("HOME_SCREEN_ICON", 5, "home_screen_icon");
        HOME_SCREEN_ICON = enumC1589910rTZ6;
        EnumC1589910rTZ enumC1589910rTZ7 = new EnumC1589910rTZ("CLICK_SUB_TAB_LIST", 6, "click_sub_tab_list");
        CLICK_SUB_TAB_LIST = enumC1589910rTZ7;
        EnumC1589910rTZ enumC1589910rTZ8 = new EnumC1589910rTZ("PLAYMODE_EXIT_BUTTON", 7, "playmode_exit_button");
        PLAYMODE_EXIT_BUTTON = enumC1589910rTZ8;
        EnumC1589910rTZ enumC1589910rTZ9 = new EnumC1589910rTZ("CLICK_TOP_BACK_ICON", 8, "click_top_fastback_icon");
        CLICK_TOP_BACK_ICON = enumC1589910rTZ9;
        EnumC1589910rTZ enumC1589910rTZ10 = new EnumC1589910rTZ("DIRECT", 9, "direct");
        DIRECT = enumC1589910rTZ10;
        EnumC1589910rTZ[] enumC1589910rTZArr = {enumC1589910rTZ, enumC1589910rTZ2, enumC1589910rTZ3, enumC1589910rTZ4, enumC1589910rTZ5, enumC1589910rTZ6, enumC1589910rTZ7, enumC1589910rTZ8, enumC1589910rTZ9, enumC1589910rTZ10};
        LLILLJJLI = enumC1589910rTZArr;
        LLILLL = new C2254308sP(enumC1589910rTZArr);
    }

    public static EnumC1589910rTZ[] values() {
        return (EnumC1589910rTZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1589910rTZ valueOf(String str) {
        return (EnumC1589910rTZ) C08FF.LIZ(EnumC1589910rTZ.class, str);
    }

    public EnumC1589910rTZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
