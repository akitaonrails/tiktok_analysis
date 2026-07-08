package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1660706er {
    public static final EnumC1660706er B2C_ACTION_BAR;
    public static final EnumC1660706er B2C_AUTO_REPLY;
    public static final EnumC1660706er EVENT_TRACKING;
    public static final EnumC1660706er LANDING_MESSAGE;
    public static final /* synthetic */ EnumC1660706er[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1660706er PRE_SHOWN_STICKER;
    public static final EnumC1660706er REPLY_TO_STICKER;
    public static final EnumC1660706er SHOW_AVATAR_GUIDE_CARD;
    public static final EnumC1660706er SHOW_AVATAR_INLINE_MESSAGE;
    public static final EnumC1660706er SOCIAL_ACTION_BAR;
    public static final EnumC1660706er SOCIAL_AI_GROUP_SHOT;
    public static final EnumC1660706er SOCIAL_AVATAR;
    public static final EnumC1660706er SOCIAL_GAME_CHALLENGE;
    public static final EnumC1660706er SOCIAL_PHOTO_SWAP;
    public static final EnumC1660706er SUGGEST_REPLY;
    public static final EnumC1660706er TYPING_INDICATOR;
    public static final EnumC1660706er TYPING_RECOMMEND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1660706er> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1660706er enumC1660706er = new EnumC1660706er("SOCIAL_AVATAR", 0, "social_avatar");
        SOCIAL_AVATAR = enumC1660706er;
        EnumC1660706er enumC1660706er2 = new EnumC1660706er("SHOW_AVATAR_GUIDE_CARD", 1, "should_show_guide_card");
        SHOW_AVATAR_GUIDE_CARD = enumC1660706er2;
        EnumC1660706er enumC1660706er3 = new EnumC1660706er("SHOW_AVATAR_INLINE_MESSAGE", 2, "should_show_inline_message");
        SHOW_AVATAR_INLINE_MESSAGE = enumC1660706er3;
        EnumC1660706er enumC1660706er4 = new EnumC1660706er("PRE_SHOWN_STICKER", 3, "pre_shown_sticker");
        PRE_SHOWN_STICKER = enumC1660706er4;
        EnumC1660706er enumC1660706er5 = new EnumC1660706er("TYPING_RECOMMEND", 4, "typing_reco");
        TYPING_RECOMMEND = enumC1660706er5;
        EnumC1660706er enumC1660706er6 = new EnumC1660706er("SUGGEST_REPLY", 5, "suggested_replies");
        SUGGEST_REPLY = enumC1660706er6;
        EnumC1660706er enumC1660706er7 = new EnumC1660706er("REPLY_TO_STICKER", 6, "reply_to_stickers");
        REPLY_TO_STICKER = enumC1660706er7;
        EnumC1660706er enumC1660706er8 = new EnumC1660706er("SOCIAL_ACTION_BAR", 7, "social_action_bar");
        SOCIAL_ACTION_BAR = enumC1660706er8;
        EnumC1660706er enumC1660706er9 = new EnumC1660706er("SOCIAL_PHOTO_SWAP", 8, "photo_swap");
        SOCIAL_PHOTO_SWAP = enumC1660706er9;
        EnumC1660706er enumC1660706er10 = new EnumC1660706er("SOCIAL_AI_GROUP_SHOT", 9, "ai_group_shot");
        SOCIAL_AI_GROUP_SHOT = enumC1660706er10;
        EnumC1660706er enumC1660706er11 = new EnumC1660706er("TYPING_INDICATOR", 10, "typing_indicator");
        TYPING_INDICATOR = enumC1660706er11;
        EnumC1660706er enumC1660706er12 = new EnumC1660706er("SOCIAL_GAME_CHALLENGE", 11, "game_challenge");
        SOCIAL_GAME_CHALLENGE = enumC1660706er12;
        EnumC1660706er enumC1660706er13 = new EnumC1660706er("B2C_ACTION_BAR", 12, "dynamic_action_bar");
        B2C_ACTION_BAR = enumC1660706er13;
        EnumC1660706er enumC1660706er14 = new EnumC1660706er("EVENT_TRACKING", 13, "b2c_event_tracking");
        EVENT_TRACKING = enumC1660706er14;
        EnumC1660706er enumC1660706er15 = new EnumC1660706er("LANDING_MESSAGE", 14, "landing_message");
        LANDING_MESSAGE = enumC1660706er15;
        EnumC1660706er enumC1660706er16 = new EnumC1660706er("B2C_AUTO_REPLY", 15, "b2c_auto_reply");
        B2C_AUTO_REPLY = enumC1660706er16;
        EnumC1660706er[] enumC1660706erArr = {enumC1660706er, enumC1660706er2, enumC1660706er3, enumC1660706er4, enumC1660706er5, enumC1660706er6, enumC1660706er7, enumC1660706er8, enumC1660706er9, enumC1660706er10, enumC1660706er11, enumC1660706er12, enumC1660706er13, enumC1660706er14, enumC1660706er15, enumC1660706er16};
        LLILLJJLI = enumC1660706erArr;
        LLILLL = new C2254308sP(enumC1660706erArr);
    }

    public static EnumC1660706er[] values() {
        return (EnumC1660706er[]) LLILLJJLI.clone();
    }

    public final String getId() {
        return this.LL;
    }

    public static EnumC1660706er valueOf(String str) {
        return (EnumC1660706er) C08FF.LIZ(EnumC1660706er.class, str);
    }

    public EnumC1660706er(String str, int i, String str2) {
        this.LL = str2;
    }
}
