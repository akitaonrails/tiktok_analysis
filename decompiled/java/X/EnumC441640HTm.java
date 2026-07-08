package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC441640HTm {
    public static final EnumC441640HTm AI_SELF_STICKER_PANEL;
    public static final EnumC441640HTm DM_ACTION_BAR;
    public static final EnumC441640HTm DM_STICKER_CREATION_PAGE;
    public static final EnumC441640HTm FAIL_STATE_STICKER_PANEL;
    public static final /* synthetic */ EnumC441640HTm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC441640HTm REMIX_BUTTON;
    public static final EnumC441640HTm SOCIAL_AVATAR_STICKER_PANEL;
    public static final EnumC441640HTm STICKER_DETAIL_PAGE;
    public static final EnumC441640HTm STICKER_LONG_PRESS;
    public static final EnumC441640HTm STORY_REMIX_BUTTON;
    public static final EnumC441640HTm STUDIO_ID_DROPDOWN;
    public static final EnumC441640HTm TYPING_BOX;

    public static InterfaceC2044707zh<EnumC441640HTm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC441640HTm enumC441640HTm = new EnumC441640HTm("STUDIO_ID_DROPDOWN", 0);
        STUDIO_ID_DROPDOWN = enumC441640HTm;
        EnumC441640HTm enumC441640HTm2 = new EnumC441640HTm("TYPING_BOX", 1);
        TYPING_BOX = enumC441640HTm2;
        EnumC441640HTm enumC441640HTm3 = new EnumC441640HTm("SOCIAL_AVATAR_STICKER_PANEL", 2);
        SOCIAL_AVATAR_STICKER_PANEL = enumC441640HTm3;
        EnumC441640HTm enumC441640HTm4 = new EnumC441640HTm("AI_SELF_STICKER_PANEL", 3);
        AI_SELF_STICKER_PANEL = enumC441640HTm4;
        EnumC441640HTm enumC441640HTm5 = new EnumC441640HTm("STICKER_DETAIL_PAGE", 4);
        STICKER_DETAIL_PAGE = enumC441640HTm5;
        EnumC441640HTm enumC441640HTm6 = new EnumC441640HTm("STICKER_LONG_PRESS", 5);
        STICKER_LONG_PRESS = enumC441640HTm6;
        EnumC441640HTm enumC441640HTm7 = new EnumC441640HTm("REMIX_BUTTON", 6);
        REMIX_BUTTON = enumC441640HTm7;
        EnumC441640HTm enumC441640HTm8 = new EnumC441640HTm("FAIL_STATE_STICKER_PANEL", 7);
        FAIL_STATE_STICKER_PANEL = enumC441640HTm8;
        EnumC441640HTm enumC441640HTm9 = new EnumC441640HTm("STORY_REMIX_BUTTON", 8);
        STORY_REMIX_BUTTON = enumC441640HTm9;
        EnumC441640HTm enumC441640HTm10 = new EnumC441640HTm("DM_ACTION_BAR", 9);
        DM_ACTION_BAR = enumC441640HTm10;
        EnumC441640HTm enumC441640HTm11 = new EnumC441640HTm("DM_STICKER_CREATION_PAGE", 10);
        DM_STICKER_CREATION_PAGE = enumC441640HTm11;
        EnumC441640HTm[] enumC441640HTmArr = {enumC441640HTm, enumC441640HTm2, enumC441640HTm3, enumC441640HTm4, enumC441640HTm5, enumC441640HTm6, enumC441640HTm7, enumC441640HTm8, enumC441640HTm9, enumC441640HTm10, enumC441640HTm11};
        LL = enumC441640HTmArr;
        LLILLJJLI = new C2254308sP(enumC441640HTmArr);
    }

    public static EnumC441640HTm[] values() {
        return (EnumC441640HTm[]) LL.clone();
    }

    public final boolean isDMNonRemix() {
        return this == TYPING_BOX || this == FAIL_STATE_STICKER_PANEL || this == SOCIAL_AVATAR_STICKER_PANEL || this == AI_SELF_STICKER_PANEL;
    }

    public final boolean isDMRemix() {
        return this == REMIX_BUTTON || this == STICKER_DETAIL_PAGE || this == STICKER_LONG_PRESS;
    }

    public final boolean isDMStickerPanel() {
        return this == FAIL_STATE_STICKER_PANEL || this == SOCIAL_AVATAR_STICKER_PANEL || this == AI_SELF_STICKER_PANEL;
    }

    public final boolean isFromStory() {
        return this == STORY_REMIX_BUTTON;
    }

    public final boolean isInDM() {
        return this != STORY_REMIX_BUTTON;
    }

    public static EnumC441640HTm valueOf(String str) {
        return (EnumC441640HTm) C08FF.LIZ(EnumC441640HTm.class, str);
    }

    public EnumC441640HTm(String str, int i) {
    }
}
