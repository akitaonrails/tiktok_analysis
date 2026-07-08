package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1225180hzI {
    public static final EnumC1225180hzI CLICK_REVEAL_DM_CARD;
    public static final EnumC1225180hzI CLICK_REVEAL_FOMO;
    public static final EnumC1225180hzI CLICK_REVEAL_FRIENDS_POPUP;
    public static final EnumC1225180hzI CLICK_REVEAL_INBOX_POPUP;
    public static final EnumC1225180hzI CLICK_REVEAL_INTRO;
    public static final EnumC1225180hzI CLICK_REVEAL_MARKETING_POST_CREATE;
    public static final EnumC1225180hzI CLICK_REVEAL_MARKETING_POST_HEAD;
    public static final EnumC1225180hzI CLICK_REVEAL_STORY_UNLOCK;
    public static final EnumC1225180hzI CLICK_REVEAL_TAG;
    public static final /* synthetic */ EnumC1225180hzI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1225180hzI STORY_REVEAL_DAILY_PUSH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1225180hzI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1225180hzI enumC1225180hzI = new EnumC1225180hzI("CLICK_REVEAL_INTRO", 0, "click_reveal_intro");
        CLICK_REVEAL_INTRO = enumC1225180hzI;
        EnumC1225180hzI enumC1225180hzI2 = new EnumC1225180hzI("CLICK_REVEAL_STORY_UNLOCK", 1, "click_reveal_story_unlock");
        CLICK_REVEAL_STORY_UNLOCK = enumC1225180hzI2;
        EnumC1225180hzI enumC1225180hzI3 = new EnumC1225180hzI("CLICK_REVEAL_INBOX_POPUP", 2, "click_reveal_inbox_popup");
        CLICK_REVEAL_INBOX_POPUP = enumC1225180hzI3;
        EnumC1225180hzI enumC1225180hzI4 = new EnumC1225180hzI("CLICK_REVEAL_MARKETING_POST_CREATE", 3, "click_reveal_marketing_post_create");
        CLICK_REVEAL_MARKETING_POST_CREATE = enumC1225180hzI4;
        EnumC1225180hzI enumC1225180hzI5 = new EnumC1225180hzI("CLICK_REVEAL_MARKETING_POST_HEAD", 4, "click_reveal_marketing_post_head");
        CLICK_REVEAL_MARKETING_POST_HEAD = enumC1225180hzI5;
        EnumC1225180hzI enumC1225180hzI6 = new EnumC1225180hzI("CLICK_REVEAL_FRIENDS_POPUP", 5, "click_reveal_friends_popup");
        CLICK_REVEAL_FRIENDS_POPUP = enumC1225180hzI6;
        EnumC1225180hzI enumC1225180hzI7 = new EnumC1225180hzI("CLICK_REVEAL_DM_CARD", 6, "click_reveal_dm_card");
        CLICK_REVEAL_DM_CARD = enumC1225180hzI7;
        EnumC1225180hzI enumC1225180hzI8 = new EnumC1225180hzI("CLICK_REVEAL_TAG", 7, "click_reveal_tag");
        CLICK_REVEAL_TAG = enumC1225180hzI8;
        EnumC1225180hzI enumC1225180hzI9 = new EnumC1225180hzI("CLICK_REVEAL_FOMO", 8, "click_reveal_fomo");
        CLICK_REVEAL_FOMO = enumC1225180hzI9;
        EnumC1225180hzI enumC1225180hzI10 = new EnumC1225180hzI("STORY_REVEAL_DAILY_PUSH", 9, "story_reveal_daily_push");
        STORY_REVEAL_DAILY_PUSH = enumC1225180hzI10;
        EnumC1225180hzI[] enumC1225180hzIArr = {enumC1225180hzI, enumC1225180hzI2, enumC1225180hzI3, enumC1225180hzI4, enumC1225180hzI5, enumC1225180hzI6, enumC1225180hzI7, enumC1225180hzI8, enumC1225180hzI9, enumC1225180hzI10};
        LLILLJJLI = enumC1225180hzIArr;
        LLILLL = new C2254308sP(enumC1225180hzIArr);
    }

    public static EnumC1225180hzI[] values() {
        return (EnumC1225180hzI[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC1225180hzI valueOf(String str) {
        return (EnumC1225180hzI) C08FF.LIZ(EnumC1225180hzI.class, str);
    }

    public EnumC1225180hzI(String str, int i, String str2) {
        this.LL = str2;
    }
}
