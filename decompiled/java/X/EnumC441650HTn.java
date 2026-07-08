package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441650HTn {
    public static final EnumC441650HTn AI_SELF_STICKER_PANEL;
    public static final EnumC441650HTn DM_ACTION_BAR;
    public static final EnumC441650HTn DM_STICKER_CREATION_PAGE;
    public static final EnumC441650HTn DM_STICKER_DETAIL_PAGE;
    public static final EnumC441650HTn DM_STICKER_LONG_PRESS;
    public static final EnumC441650HTn FAIL_STATE_STICKER_PANEL;
    public static final /* synthetic */ EnumC441650HTn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC441650HTn REMIX_BUTTON;
    public static final EnumC441650HTn SOCIAL_AVATAR_STICKER_PANEL;
    public static final EnumC441650HTn STORY_REMIX_BUTTON;
    public static final EnumC441650HTn STUDIO_ID_DROPDOWN;
    public static final EnumC441650HTn TYPING_BOX_ICON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC441650HTn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC441650HTn enumC441650HTn = new EnumC441650HTn("SOCIAL_AVATAR_STICKER_PANEL", 0, "social_avatar_sticker_panel");
        SOCIAL_AVATAR_STICKER_PANEL = enumC441650HTn;
        EnumC441650HTn enumC441650HTn2 = new EnumC441650HTn("AI_SELF_STICKER_PANEL", 1, "ai_self_sticker_panel");
        AI_SELF_STICKER_PANEL = enumC441650HTn2;
        EnumC441650HTn enumC441650HTn3 = new EnumC441650HTn("TYPING_BOX_ICON", 2, "typing_box_icon");
        TYPING_BOX_ICON = enumC441650HTn3;
        EnumC441650HTn enumC441650HTn4 = new EnumC441650HTn("DM_STICKER_DETAIL_PAGE", 3, "dm_sticker_detail_page");
        DM_STICKER_DETAIL_PAGE = enumC441650HTn4;
        EnumC441650HTn enumC441650HTn5 = new EnumC441650HTn("DM_STICKER_LONG_PRESS", 4, "dm_sticker_long_press");
        DM_STICKER_LONG_PRESS = enumC441650HTn5;
        EnumC441650HTn enumC441650HTn6 = new EnumC441650HTn("DM_ACTION_BAR", 5, "dm_action_bar");
        DM_ACTION_BAR = enumC441650HTn6;
        EnumC441650HTn enumC441650HTn7 = new EnumC441650HTn("REMIX_BUTTON", 6, "remix_button");
        REMIX_BUTTON = enumC441650HTn7;
        EnumC441650HTn enumC441650HTn8 = new EnumC441650HTn("FAIL_STATE_STICKER_PANEL", 7, "social_avatar_fail_state_sticker_panel");
        FAIL_STATE_STICKER_PANEL = enumC441650HTn8;
        EnumC441650HTn enumC441650HTn9 = new EnumC441650HTn("STORY_REMIX_BUTTON", 8, "story_remix_button");
        STORY_REMIX_BUTTON = enumC441650HTn9;
        EnumC441650HTn enumC441650HTn10 = new EnumC441650HTn("STUDIO_ID_DROPDOWN", 9, "studio_id_dropdown");
        STUDIO_ID_DROPDOWN = enumC441650HTn10;
        EnumC441650HTn enumC441650HTn11 = new EnumC441650HTn("DM_STICKER_CREATION_PAGE", 10, "dm_sticker_creation_page");
        DM_STICKER_CREATION_PAGE = enumC441650HTn11;
        EnumC441650HTn[] enumC441650HTnArr = {enumC441650HTn, enumC441650HTn2, enumC441650HTn3, enumC441650HTn4, enumC441650HTn5, enumC441650HTn6, enumC441650HTn7, enumC441650HTn8, enumC441650HTn9, enumC441650HTn10, enumC441650HTn11};
        LLILLJJLI = enumC441650HTnArr;
        LLILLL = new C2254308sP(enumC441650HTnArr);
    }

    public static EnumC441650HTn[] values() {
        return (EnumC441650HTn[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC441650HTn valueOf(String str) {
        return (EnumC441650HTn) C08FF.LIZ(EnumC441650HTn.class, str);
    }

    public EnumC441650HTn(String str, int i, String str2) {
        this.LL = str2;
    }
}
