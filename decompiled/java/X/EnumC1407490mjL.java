package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1407490mjL {
    public static final EnumC1407490mjL EDIT_ON_DESTROY;
    public static final EnumC1407490mjL ENTER_SECOND_PAGE;
    public static final EnumC1407490mjL EXP_CLOSE;
    public static final /* synthetic */ EnumC1407490mjL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1407490mjL MUSIC_PANEL_CHANGE_VOLUME;
    public static final EnumC1407490mjL MUSIC_PANEL_CLEAN_MUSIC;
    public static final EnumC1407490mjL MUSIC_PANEL_CUT_MUSIC;
    public static final EnumC1407490mjL MUSIC_PANEL_RESET_ORIGIN_SOUND;
    public static final EnumC1407490mjL REMIX_ANOTHER_MUSIC;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1407490mjL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1407490mjL enumC1407490mjL = new EnumC1407490mjL("ENTER_SECOND_PAGE", 0, "enter_second_page");
        ENTER_SECOND_PAGE = enumC1407490mjL;
        EnumC1407490mjL enumC1407490mjL2 = new EnumC1407490mjL("MUSIC_PANEL_RESET_ORIGIN_SOUND", 1, "music_panel_reset_origin_sound");
        MUSIC_PANEL_RESET_ORIGIN_SOUND = enumC1407490mjL2;
        EnumC1407490mjL enumC1407490mjL3 = new EnumC1407490mjL("MUSIC_PANEL_CUT_MUSIC", 2, "music_panel_cu_music");
        MUSIC_PANEL_CUT_MUSIC = enumC1407490mjL3;
        EnumC1407490mjL enumC1407490mjL4 = new EnumC1407490mjL("MUSIC_PANEL_CLEAN_MUSIC", 3, "music_panel_clean_music");
        MUSIC_PANEL_CLEAN_MUSIC = enumC1407490mjL4;
        EnumC1407490mjL enumC1407490mjL5 = new EnumC1407490mjL("MUSIC_PANEL_CHANGE_VOLUME", 4, "music_panel_change_volume");
        MUSIC_PANEL_CHANGE_VOLUME = enumC1407490mjL5;
        EnumC1407490mjL enumC1407490mjL6 = new EnumC1407490mjL("REMIX_ANOTHER_MUSIC", 5, "remix_another_music");
        REMIX_ANOTHER_MUSIC = enumC1407490mjL6;
        EnumC1407490mjL enumC1407490mjL7 = new EnumC1407490mjL("EXP_CLOSE", 6, "experiment_close");
        EXP_CLOSE = enumC1407490mjL7;
        EnumC1407490mjL enumC1407490mjL8 = new EnumC1407490mjL("EDIT_ON_DESTROY", 7, "edit_on_destroy");
        EDIT_ON_DESTROY = enumC1407490mjL8;
        EnumC1407490mjL[] enumC1407490mjLArr = {enumC1407490mjL, enumC1407490mjL2, enumC1407490mjL3, enumC1407490mjL4, enumC1407490mjL5, enumC1407490mjL6, enumC1407490mjL7, enumC1407490mjL8};
        LLILLJJLI = enumC1407490mjLArr;
        LLILLL = new C2254308sP(enumC1407490mjLArr);
    }

    public static EnumC1407490mjL[] values() {
        return (EnumC1407490mjL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1407490mjL valueOf(String str) {
        return (EnumC1407490mjL) C08FF.LIZ(EnumC1407490mjL.class, str);
    }

    public EnumC1407490mjL(String str, int i, String str2) {
        this.LL = str2;
    }
}
