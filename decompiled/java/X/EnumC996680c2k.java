package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC996680c2k {
    public static final EnumC996680c2k COMMENT_CLICK;
    public static final EnumC996680c2k COMMENT_PANEL_DISMISS;
    public static final EnumC996680c2k FAVORITE_CLICK;
    public static final EnumC996680c2k LIKE_CLICK;
    public static final /* synthetic */ EnumC996680c2k[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC996680c2k MUSIC_CLICK;
    public static final EnumC996680c2k SHARE_CLICK;
    public static final EnumC996680c2k SHARE_PANEL_DISMISS;
    public static final EnumC996680c2k SKIP_CLICK;
    public static final EnumC996680c2k SLIDE_DOWN;
    public static final EnumC996680c2k SLIDE_UP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC996680c2k> getEntries() {
        return LLILLL;
    }

    static {
        EnumC996680c2k enumC996680c2k = new EnumC996680c2k("LIKE_CLICK", 0, "like_click");
        LIKE_CLICK = enumC996680c2k;
        EnumC996680c2k enumC996680c2k2 = new EnumC996680c2k("COMMENT_CLICK", 1, "comment_click");
        COMMENT_CLICK = enumC996680c2k2;
        EnumC996680c2k enumC996680c2k3 = new EnumC996680c2k("COMMENT_PANEL_DISMISS", 2, "comment_panel_dismiss");
        COMMENT_PANEL_DISMISS = enumC996680c2k3;
        EnumC996680c2k enumC996680c2k4 = new EnumC996680c2k("FAVORITE_CLICK", 3, "favorite_click");
        FAVORITE_CLICK = enumC996680c2k4;
        EnumC996680c2k enumC996680c2k5 = new EnumC996680c2k("SHARE_CLICK", 4, "share_click");
        SHARE_CLICK = enumC996680c2k5;
        EnumC996680c2k enumC996680c2k6 = new EnumC996680c2k("SHARE_PANEL_DISMISS", 5, "share_panel_dismiss");
        SHARE_PANEL_DISMISS = enumC996680c2k6;
        EnumC996680c2k enumC996680c2k7 = new EnumC996680c2k("MUSIC_CLICK", 6, "music_click");
        MUSIC_CLICK = enumC996680c2k7;
        EnumC996680c2k enumC996680c2k8 = new EnumC996680c2k("SKIP_CLICK", 7, "skip_click");
        SKIP_CLICK = enumC996680c2k8;
        EnumC996680c2k enumC996680c2k9 = new EnumC996680c2k("SLIDE_UP", 8, "slide_up");
        SLIDE_UP = enumC996680c2k9;
        EnumC996680c2k enumC996680c2k10 = new EnumC996680c2k("SLIDE_DOWN", 9, "slide_down");
        SLIDE_DOWN = enumC996680c2k10;
        EnumC996680c2k[] enumC996680c2kArr = {enumC996680c2k, enumC996680c2k2, enumC996680c2k3, enumC996680c2k4, enumC996680c2k5, enumC996680c2k6, enumC996680c2k7, enumC996680c2k8, enumC996680c2k9, enumC996680c2k10};
        LLILLJJLI = enumC996680c2kArr;
        LLILLL = new C2254308sP(enumC996680c2kArr);
    }

    public static EnumC996680c2k[] values() {
        return (EnumC996680c2k[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC996680c2k valueOf(String str) {
        return (EnumC996680c2k) C08FF.LIZ(EnumC996680c2k.class, str);
    }

    public EnumC996680c2k(String str, int i, String str2) {
        this.LL = str2;
    }
}
