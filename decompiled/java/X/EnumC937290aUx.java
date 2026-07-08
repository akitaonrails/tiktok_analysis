package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC937290aUx {
    public static final EnumC937290aUx AUTO_APPLY;
    public static final EnumC937290aUx BOARD;
    public static final EnumC937290aUx DESIGN_PAGE;
    public static final EnumC937290aUx HEAD_LINE;
    public static final EnumC937290aUx LIVE_SETTING;
    public static final /* synthetic */ EnumC937290aUx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC937290aUx MULTI_SETTING;
    public static final EnumC937290aUx MULTI_TOOL;
    public static final EnumC937290aUx NOTICEBOARD_CLICK;
    public static final EnumC937290aUx PLAYBOOK;
    public static final EnumC937290aUx SETTING_PLAYBOOK;
    public static final EnumC937290aUx UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC937290aUx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC937290aUx enumC937290aUx = new EnumC937290aUx("LIVE_SETTING", 0, "live_setting");
        LIVE_SETTING = enumC937290aUx;
        EnumC937290aUx enumC937290aUx2 = new EnumC937290aUx("MULTI_SETTING", 1, "multi_setting");
        MULTI_SETTING = enumC937290aUx2;
        EnumC937290aUx enumC937290aUx3 = new EnumC937290aUx("MULTI_TOOL", 2, "multi_tool");
        MULTI_TOOL = enumC937290aUx3;
        EnumC937290aUx enumC937290aUx4 = new EnumC937290aUx("NOTICEBOARD_CLICK", 3, "noticeboard_click");
        NOTICEBOARD_CLICK = enumC937290aUx4;
        EnumC937290aUx enumC937290aUx5 = new EnumC937290aUx("BOARD", 4, "board");
        BOARD = enumC937290aUx5;
        EnumC937290aUx enumC937290aUx6 = new EnumC937290aUx("PLAYBOOK", 5, "playbook");
        PLAYBOOK = enumC937290aUx6;
        EnumC937290aUx enumC937290aUx7 = new EnumC937290aUx("SETTING_PLAYBOOK", 6, "setting_playbook");
        SETTING_PLAYBOOK = enumC937290aUx7;
        EnumC937290aUx enumC937290aUx8 = new EnumC937290aUx("AUTO_APPLY", 7, "auto_apply");
        AUTO_APPLY = enumC937290aUx8;
        EnumC937290aUx enumC937290aUx9 = new EnumC937290aUx("HEAD_LINE", 8, "head_line");
        HEAD_LINE = enumC937290aUx9;
        EnumC937290aUx enumC937290aUx10 = new EnumC937290aUx("DESIGN_PAGE", 9, "design_page");
        DESIGN_PAGE = enumC937290aUx10;
        EnumC937290aUx enumC937290aUx11 = new EnumC937290aUx("UNKNOWN", 10, "unknown");
        UNKNOWN = enumC937290aUx11;
        EnumC937290aUx[] enumC937290aUxArr = {enumC937290aUx, enumC937290aUx2, enumC937290aUx3, enumC937290aUx4, enumC937290aUx5, enumC937290aUx6, enumC937290aUx7, enumC937290aUx8, enumC937290aUx9, enumC937290aUx10, enumC937290aUx11};
        LLILLJJLI = enumC937290aUxArr;
        LLILLL = new C2254308sP(enumC937290aUxArr);
    }

    public static EnumC937290aUx[] values() {
        return (EnumC937290aUx[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC937290aUx valueOf(String str) {
        return (EnumC937290aUx) C08FF.LIZ(EnumC937290aUx.class, str);
    }

    public EnumC937290aUx(String str, int i, String str2) {
        this.LL = str2;
    }
}
