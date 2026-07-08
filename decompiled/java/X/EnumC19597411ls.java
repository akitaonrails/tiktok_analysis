package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19597411ls {
    public static final EnumC19597411ls CAPTION_MODE;
    public static final C19597311lr Companion;
    public static final /* synthetic */ EnumC19597411ls[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19597411ls POST_BACKWARDS_MENTION;
    public static final EnumC19597411ls STICKER;
    public static final EnumC19597411ls STORY_ANNIVERSARY_MENTION;
    public static final EnumC19597411ls STORY_BACKWARDS_MENTION;
    public static final EnumC19597411ls STREAK_PET_TO_STORY;
    public static final EnumC19597411ls TEXT_MODE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19597411ls> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19597411ls enumC19597411ls = new EnumC19597411ls("STICKER", 0, "sticker");
        STICKER = enumC19597411ls;
        EnumC19597411ls enumC19597411ls2 = new EnumC19597411ls("CAPTION_MODE", 1, "caption_mode");
        CAPTION_MODE = enumC19597411ls2;
        EnumC19597411ls enumC19597411ls3 = new EnumC19597411ls("TEXT_MODE", 2, "text_mode");
        TEXT_MODE = enumC19597411ls3;
        EnumC19597411ls enumC19597411ls4 = new EnumC19597411ls("STORY_BACKWARDS_MENTION", 3, "story_to_story_backward_mention");
        STORY_BACKWARDS_MENTION = enumC19597411ls4;
        EnumC19597411ls enumC19597411ls5 = new EnumC19597411ls("POST_BACKWARDS_MENTION", 4, "post_to_story_backward_mention");
        POST_BACKWARDS_MENTION = enumC19597411ls5;
        EnumC19597411ls enumC19597411ls6 = new EnumC19597411ls("STORY_ANNIVERSARY_MENTION", 5, "anniversary_to_story");
        STORY_ANNIVERSARY_MENTION = enumC19597411ls6;
        EnumC19597411ls enumC19597411ls7 = new EnumC19597411ls("STREAK_PET_TO_STORY", 6, "streakpets_to_story");
        STREAK_PET_TO_STORY = enumC19597411ls7;
        EnumC19597411ls[] enumC19597411lsArr = {enumC19597411ls, enumC19597411ls2, enumC19597411ls3, enumC19597411ls4, enumC19597411ls5, enumC19597411ls6, enumC19597411ls7};
        LLILLJJLI = enumC19597411lsArr;
        LLILLL = new C2254308sP(enumC19597411lsArr);
        Companion = new C19597311lr();
    }

    public static EnumC19597411ls[] values() {
        return (EnumC19597411ls[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC19597411ls valueOf(String str) {
        return (EnumC19597411ls) C08FF.LIZ(EnumC19597411ls.class, str);
    }

    public EnumC19597411ls(String str, int i, String str2) {
        this.LL = str2;
    }
}
