package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hrm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC454360Hrm {
    public static final EnumC454360Hrm COMMENT_LONG_PRESS_PANEL;
    public static final /* synthetic */ EnumC454360Hrm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC454360Hrm MULTI_GENRE_QUICK_MENU;
    public static final EnumC454360Hrm STICKER_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC454360Hrm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC454360Hrm enumC454360Hrm = new EnumC454360Hrm("COMMENT_LONG_PRESS_PANEL", 0, "comment_long_press_panel");
        COMMENT_LONG_PRESS_PANEL = enumC454360Hrm;
        EnumC454360Hrm enumC454360Hrm2 = new EnumC454360Hrm("MULTI_GENRE_QUICK_MENU", 1, "multi_genre_quick_menu");
        MULTI_GENRE_QUICK_MENU = enumC454360Hrm2;
        EnumC454360Hrm enumC454360Hrm3 = new EnumC454360Hrm("STICKER_PANEL", 2, "sticker_panel");
        STICKER_PANEL = enumC454360Hrm3;
        EnumC454360Hrm[] enumC454360HrmArr = {enumC454360Hrm, enumC454360Hrm2, enumC454360Hrm3};
        LLILLJJLI = enumC454360HrmArr;
        LLILLL = new C2254308sP(enumC454360HrmArr);
    }

    public static EnumC454360Hrm[] values() {
        return (EnumC454360Hrm[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC454360Hrm valueOf(String str) {
        return (EnumC454360Hrm) C08FF.LIZ(EnumC454360Hrm.class, str);
    }

    public EnumC454360Hrm(String str, int i, String str2) {
        this.LL = str2;
    }
}
