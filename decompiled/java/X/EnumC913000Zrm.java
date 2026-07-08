package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zrm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC913000Zrm {
    public static final EnumC913000Zrm CLICK_REPOST_PANEL_DM_BTN;
    public static final EnumC913000Zrm CLICK_STORY_BOTTOM_INPUT_BOX;
    public static final EnumC913000Zrm CLICK_VIDEO_BOTTOM_INPUT_BOX;
    public static final /* synthetic */ EnumC913000Zrm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC913000Zrm MESSAGE_CELL;
    public static final EnumC913000Zrm SHARE_EDIT_CONTENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC913000Zrm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC913000Zrm enumC913000Zrm = new EnumC913000Zrm("CLICK_VIDEO_BOTTOM_INPUT_BOX", 0, "click_video_bottom_input_box");
        CLICK_VIDEO_BOTTOM_INPUT_BOX = enumC913000Zrm;
        EnumC913000Zrm enumC913000Zrm2 = new EnumC913000Zrm("CLICK_STORY_BOTTOM_INPUT_BOX", 1, "click_story_bottom_input_box");
        CLICK_STORY_BOTTOM_INPUT_BOX = enumC913000Zrm2;
        EnumC913000Zrm enumC913000Zrm3 = new EnumC913000Zrm("SHARE_EDIT_CONTENT", 2, "share_edit_content");
        SHARE_EDIT_CONTENT = enumC913000Zrm3;
        EnumC913000Zrm enumC913000Zrm4 = new EnumC913000Zrm("MESSAGE_CELL", 3, "message_cell");
        MESSAGE_CELL = enumC913000Zrm4;
        EnumC913000Zrm enumC913000Zrm5 = new EnumC913000Zrm("CLICK_REPOST_PANEL_DM_BTN", 4, "click_repost_panel_dm_btn");
        CLICK_REPOST_PANEL_DM_BTN = enumC913000Zrm5;
        EnumC913000Zrm[] enumC913000ZrmArr = {enumC913000Zrm, enumC913000Zrm2, enumC913000Zrm3, enumC913000Zrm4, enumC913000Zrm5};
        LLILLJJLI = enumC913000ZrmArr;
        LLILLL = new C2254308sP(enumC913000ZrmArr);
    }

    public static EnumC913000Zrm[] values() {
        return (EnumC913000Zrm[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC913000Zrm valueOf(String str) {
        return (EnumC913000Zrm) C08FF.LIZ(EnumC913000Zrm.class, str);
    }

    public EnumC913000Zrm(String str, int i, String str2) {
        this.LL = str2;
    }
}
