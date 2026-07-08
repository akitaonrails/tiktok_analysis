package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1641806bo implements InterfaceC1677406hY {
    public static final EnumC1641806bo GROUP_SHARE_POST_BANNER;
    public static final /* synthetic */ EnumC1641806bo[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1641806bo RECENT_ACTIVITY;
    public static final EnumC1641806bo SAY_HI_NEW_CHAT;
    public static final EnumC1641806bo SA_POST_GENERATION_INLINE_MESSAGE;
    public static final EnumC1641806bo SA_POST_GENERATION_STICKERS;
    public static final EnumC1641806bo STREAK_BADGE;
    public static final EnumC1641806bo STREAK_COUNTDOWN;
    public static final EnumC1641806bo STREAK_EDUCATION;
    public static final EnumC1641806bo STREAK_LOST;
    public final String LL;
    public final EnumC1641906bp LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public EnumC1641806bo() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1641806bo> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1641906bp enumC1641906bp = EnumC1641906bp.CHAT_NOTICE;
        EnumC1641806bo enumC1641806bo = new EnumC1641806bo("SAY_HI_NEW_CHAT", 0, "pre_shown_stickers_say_hi", enumC1641906bp, "stickers");
        SAY_HI_NEW_CHAT = enumC1641806bo;
        EnumC1641906bp enumC1641906bp2 = EnumC1641906bp.MESSAGE;
        EnumC1641806bo enumC1641806bo2 = new EnumC1641806bo("STREAK_COUNTDOWN", 1, "streak_countdown_reminder", enumC1641906bp2, "inline_message");
        STREAK_COUNTDOWN = enumC1641806bo2;
        EnumC1641806bo enumC1641806bo3 = new EnumC1641806bo("STREAK_LOST", 2, "streak_lost_restore_streak", enumC1641906bp2, "inline_message");
        STREAK_LOST = enumC1641806bo3;
        EnumC1641806bo enumC1641806bo4 = new EnumC1641806bo("STREAK_EDUCATION", 3, "streak_education", enumC1641906bp2, "inline_message");
        STREAK_EDUCATION = enumC1641806bo4;
        EnumC1641806bo enumC1641806bo5 = new EnumC1641806bo("STREAK_BADGE", 4, "streak_badge", enumC1641906bp2, "inline_message");
        STREAK_BADGE = enumC1641806bo5;
        EnumC1641806bo enumC1641806bo6 = new EnumC1641806bo("SA_POST_GENERATION_STICKERS", 5, "ai_moji_social_avatar_post_generation", enumC1641906bp, "stickers");
        SA_POST_GENERATION_STICKERS = enumC1641806bo6;
        EnumC1641806bo enumC1641806bo7 = new EnumC1641806bo("SA_POST_GENERATION_INLINE_MESSAGE", 6, "ai_moji_social_avatar_post_generation", enumC1641906bp2, "inline_message");
        SA_POST_GENERATION_INLINE_MESSAGE = enumC1641806bo7;
        EnumC1641806bo enumC1641806bo8 = new EnumC1641806bo("GROUP_SHARE_POST_BANNER", 7, "group_share_post_banner", enumC1641906bp, "banner");
        GROUP_SHARE_POST_BANNER = enumC1641806bo8;
        EnumC1641806bo enumC1641806bo9 = new EnumC1641806bo("RECENT_ACTIVITY", 8, "recent_activity", enumC1641906bp, "activity");
        RECENT_ACTIVITY = enumC1641806bo9;
        EnumC1641806bo[] enumC1641806boArr = {enumC1641806bo, enumC1641806bo2, enumC1641806bo3, enumC1641806bo4, enumC1641806bo5, enumC1641806bo6, enumC1641806bo7, enumC1641806bo8, enumC1641806bo9};
        LLILZIL = enumC1641806boArr;
        LLILZLL = new C2254308sP(enumC1641806boArr);
    }

    public static EnumC1641806bo[] values() {
        return (EnumC1641806bo[]) LLILZIL.clone();
    }

    @Override // X.InterfaceC1677406hY
    public String getEventPromptType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1677406hY
    public String getPromptId() {
        return this.LL;
    }

    @Override // X.InterfaceC1677406hY
    public EnumC1641906bp getPromptType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1677406hY
    public String getUiType() {
        return this.LLILLL;
    }

    public static EnumC1641806bo valueOf(String str) {
        return (EnumC1641806bo) C08FF.LIZ(EnumC1641806bo.class, str);
    }

    public EnumC1641806bo(String str, int i, String str2, EnumC1641906bp enumC1641906bp, String str3) {
        this.LL = str2;
        this.LLILLJJLI = enumC1641906bp;
        this.LLILLL = str3;
        this.LLILZ = "platform_triggered_time_sensitive";
    }
}
