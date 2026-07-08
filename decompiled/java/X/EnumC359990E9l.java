package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC359990E9l {
    public static final /* synthetic */ EnumC359990E9l[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC359990E9l OPEN_EDITOR_PRO_CAPTION;
    public static final EnumC359990E9l OPEN_EDITOR_PRO_RETOUCH_PANEL;
    public static final EnumC359990E9l OPEN_FILTER_PANEL_FROM_FILTER_ICON;
    public static final EnumC359990E9l OPEN_FILTER_PANEL_FROM_SLIDE;
    public static final EnumC359990E9l OPEN_MUSIC_FROM_EDITOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC359990E9l> getEntries() {
        return LLILLL;
    }

    static {
        EnumC359990E9l enumC359990E9l = new EnumC359990E9l("OPEN_FILTER_PANEL_FROM_FILTER_ICON", 0, "editorpro_main_edit_icon");
        OPEN_FILTER_PANEL_FROM_FILTER_ICON = enumC359990E9l;
        EnumC359990E9l enumC359990E9l2 = new EnumC359990E9l("OPEN_FILTER_PANEL_FROM_SLIDE", 1, "editorpro_main_edit_slide");
        OPEN_FILTER_PANEL_FROM_SLIDE = enumC359990E9l2;
        EnumC359990E9l enumC359990E9l3 = new EnumC359990E9l("OPEN_EDITOR_PRO_CAPTION", 2, "editorpro_main_edit_caption");
        OPEN_EDITOR_PRO_CAPTION = enumC359990E9l3;
        EnumC359990E9l enumC359990E9l4 = new EnumC359990E9l("OPEN_MUSIC_FROM_EDITOR", 3, "editorpro_main_edit_music");
        OPEN_MUSIC_FROM_EDITOR = enumC359990E9l4;
        EnumC359990E9l enumC359990E9l5 = new EnumC359990E9l("OPEN_EDITOR_PRO_RETOUCH_PANEL", 4, "editor2ep_retouch_panel");
        OPEN_EDITOR_PRO_RETOUCH_PANEL = enumC359990E9l5;
        EnumC359990E9l[] enumC359990E9lArr = {enumC359990E9l, enumC359990E9l2, enumC359990E9l3, enumC359990E9l4, enumC359990E9l5};
        LLILLJJLI = enumC359990E9lArr;
        LLILLL = new C2254308sP(enumC359990E9lArr);
    }

    public static EnumC359990E9l[] values() {
        return (EnumC359990E9l[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC359990E9l valueOf(String str) {
        return (EnumC359990E9l) C08FF.LIZ(EnumC359990E9l.class, str);
    }

    public EnumC359990E9l(String str, int i, String str2) {
        this.LL = str2;
    }
}
