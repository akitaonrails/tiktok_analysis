package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624950OfF {
    public static final EnumC624950OfF AUTO_POPUP_MANAGE;
    public static final EnumC624950OfF CLICK_DOWNLOAD_ENTER;
    public static final EnumC624950OfF CLICK_DOWNLOAD_OFFLINE_VIDEO;
    public static final EnumC624950OfF CLICK_FIRST_TOAST;
    public static final EnumC624950OfF CLICK_FYP_MANAGE;
    public static final EnumC624950OfF CLICK_LAST_TOAST;
    public static final EnumC624950OfF CLICK_REACH_BOTTOM_GUIDE;
    public static final EnumC624950OfF CLICK_SETTINGS_ICON;
    public static final EnumC624950OfF CLICK_VIDEO_BANNER;
    public static final EnumC624950OfF CLICK_VIDEO_BANNER_MANAGE;
    public static final EnumC624950OfF FIRST_ENTER;
    public static final /* synthetic */ EnumC624950OfF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC624950OfF LONG_PRESS;
    public static final EnumC624950OfF NO_OFFLINE_VIDEO;
    public static final EnumC624950OfF OFFLINE_MODE_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC624950OfF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC624950OfF enumC624950OfF = new EnumC624950OfF("FIRST_ENTER", 0, "first_enter");
        FIRST_ENTER = enumC624950OfF;
        EnumC624950OfF enumC624950OfF2 = new EnumC624950OfF("NO_OFFLINE_VIDEO", 1, "no_offline_video");
        NO_OFFLINE_VIDEO = enumC624950OfF2;
        EnumC624950OfF enumC624950OfF3 = new EnumC624950OfF("CLICK_DOWNLOAD_OFFLINE_VIDEO", 2, "click_download_offline_video");
        CLICK_DOWNLOAD_OFFLINE_VIDEO = enumC624950OfF3;
        EnumC624950OfF enumC624950OfF4 = new EnumC624950OfF("OFFLINE_MODE_PANEL", 3, "offline_mode_panel");
        OFFLINE_MODE_PANEL = enumC624950OfF4;
        EnumC624950OfF enumC624950OfF5 = new EnumC624950OfF("LONG_PRESS", 4, "long_press");
        LONG_PRESS = enumC624950OfF5;
        EnumC624950OfF enumC624950OfF6 = new EnumC624950OfF("CLICK_DOWNLOAD_ENTER", 5, "enter");
        CLICK_DOWNLOAD_ENTER = enumC624950OfF6;
        EnumC624950OfF enumC624950OfF7 = new EnumC624950OfF("CLICK_FYP_MANAGE", 6, "click_fyp_manage");
        CLICK_FYP_MANAGE = enumC624950OfF7;
        EnumC624950OfF enumC624950OfF8 = new EnumC624950OfF("CLICK_SETTINGS_ICON", 7, "click_settings_icon");
        CLICK_SETTINGS_ICON = enumC624950OfF8;
        EnumC624950OfF enumC624950OfF9 = new EnumC624950OfF("AUTO_POPUP_MANAGE", 8, "auto_popup_manage");
        AUTO_POPUP_MANAGE = enumC624950OfF9;
        EnumC624950OfF enumC624950OfF10 = new EnumC624950OfF("CLICK_FIRST_TOAST", 9, "bottom_toast_first");
        CLICK_FIRST_TOAST = enumC624950OfF10;
        EnumC624950OfF enumC624950OfF11 = new EnumC624950OfF("CLICK_LAST_TOAST", 10, "bottom_toast_swipeup");
        CLICK_LAST_TOAST = enumC624950OfF11;
        EnumC624950OfF enumC624950OfF12 = new EnumC624950OfF("CLICK_VIDEO_BANNER", 11, "offline_video_banner");
        CLICK_VIDEO_BANNER = enumC624950OfF12;
        EnumC624950OfF enumC624950OfF13 = new EnumC624950OfF("CLICK_VIDEO_BANNER_MANAGE", 12, "offline_mode_manage");
        CLICK_VIDEO_BANNER_MANAGE = enumC624950OfF13;
        EnumC624950OfF enumC624950OfF14 = new EnumC624950OfF("CLICK_REACH_BOTTOM_GUIDE", 13, "offline_mode_manage");
        CLICK_REACH_BOTTOM_GUIDE = enumC624950OfF14;
        EnumC624950OfF[] enumC624950OfFArr = {enumC624950OfF, enumC624950OfF2, enumC624950OfF3, enumC624950OfF4, enumC624950OfF5, enumC624950OfF6, enumC624950OfF7, enumC624950OfF8, enumC624950OfF9, enumC624950OfF10, enumC624950OfF11, enumC624950OfF12, enumC624950OfF13, enumC624950OfF14};
        LLILLJJLI = enumC624950OfFArr;
        LLILLL = new C2254308sP(enumC624950OfFArr);
    }

    public static EnumC624950OfF[] values() {
        return (EnumC624950OfF[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC624950OfF valueOf(String str) {
        return (EnumC624950OfF) C08FF.LIZ(EnumC624950OfF.class, str);
    }

    public EnumC624950OfF(String str, int i, String str2) {
        this.LL = str2;
    }
}
