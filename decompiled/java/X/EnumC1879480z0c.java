package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0z0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1879480z0c {
    public static final C1879490z0d Companion;
    public static final EnumC1879480z0c DAILY_SCREEN_TIME;
    public static final EnumC1879480z0c DAILY_SCREEN_TIME_MISSION;
    public static final EnumC1879480z0c EDUCATION_VIDEO_TASK;
    public static final EnumC1879480z0c FAMILY_PAIRING_INTRO;
    public static final /* synthetic */ EnumC1879480z0c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1879480z0c SAFETY_TOOL_ARTICLE;
    public static final EnumC1879480z0c SCHEDULE_TIME_AWAY;
    public static final EnumC1879480z0c SCREEN_TIME_CARD;
    public static final EnumC1879480z0c SLEEP_HOUR;
    public static final EnumC1879480z0c SLEEP_HOUR_QUIZ;
    public static final EnumC1879480z0c SLEEP_HOUR_STREAK;
    public static final EnumC1879480z0c STEM_FEED_TASK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1879480z0c> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0z0d] */
    static {
        EnumC1879480z0c enumC1879480z0c = new EnumC1879480z0c("DAILY_SCREEN_TIME", 0, "daily_screen_time");
        DAILY_SCREEN_TIME = enumC1879480z0c;
        EnumC1879480z0c enumC1879480z0c2 = new EnumC1879480z0c("SLEEP_HOUR_QUIZ", 1, "sleep_hour_quiz");
        SLEEP_HOUR_QUIZ = enumC1879480z0c2;
        EnumC1879480z0c enumC1879480z0c3 = new EnumC1879480z0c("SCREEN_TIME_CARD", 2, "screen_time_card");
        SCREEN_TIME_CARD = enumC1879480z0c3;
        EnumC1879480z0c enumC1879480z0c4 = new EnumC1879480z0c("SAFETY_TOOL_ARTICLE", 3, "safety_article_tool");
        SAFETY_TOOL_ARTICLE = enumC1879480z0c4;
        EnumC1879480z0c enumC1879480z0c5 = new EnumC1879480z0c("FAMILY_PAIRING_INTRO", 4, "family_pairing_intro");
        FAMILY_PAIRING_INTRO = enumC1879480z0c5;
        EnumC1879480z0c enumC1879480z0c6 = new EnumC1879480z0c("EDUCATION_VIDEO_TASK", 5, "education_video_task");
        EDUCATION_VIDEO_TASK = enumC1879480z0c6;
        EnumC1879480z0c enumC1879480z0c7 = new EnumC1879480z0c("STEM_FEED_TASK", 6, "stem_feed_task");
        STEM_FEED_TASK = enumC1879480z0c7;
        EnumC1879480z0c enumC1879480z0c8 = new EnumC1879480z0c("SLEEP_HOUR", 7, "sleep_hour");
        SLEEP_HOUR = enumC1879480z0c8;
        EnumC1879480z0c enumC1879480z0c9 = new EnumC1879480z0c("DAILY_SCREEN_TIME_MISSION", 8, "screen_time_set_task");
        DAILY_SCREEN_TIME_MISSION = enumC1879480z0c9;
        EnumC1879480z0c enumC1879480z0c10 = new EnumC1879480z0c("SCHEDULE_TIME_AWAY", 9, "schedule_time_away");
        SCHEDULE_TIME_AWAY = enumC1879480z0c10;
        EnumC1879480z0c enumC1879480z0c11 = new EnumC1879480z0c("SLEEP_HOUR_STREAK", 10, "sleep_streak_task");
        SLEEP_HOUR_STREAK = enumC1879480z0c11;
        EnumC1879480z0c[] enumC1879480z0cArr = {enumC1879480z0c, enumC1879480z0c2, enumC1879480z0c3, enumC1879480z0c4, enumC1879480z0c5, enumC1879480z0c6, enumC1879480z0c7, enumC1879480z0c8, enumC1879480z0c9, enumC1879480z0c10, enumC1879480z0c11};
        LLILLJJLI = enumC1879480z0cArr;
        LLILLL = new C2254308sP(enumC1879480z0cArr);
        Companion = new Object() { // from class: X.0z0d
        };
    }

    public static EnumC1879480z0c[] values() {
        return (EnumC1879480z0c[]) LLILLJJLI.clone();
    }

    public final String getS() {
        return this.LL;
    }

    public static EnumC1879480z0c valueOf(String str) {
        return (EnumC1879480z0c) C08FF.LIZ(EnumC1879480z0c.class, str);
    }

    public EnumC1879480z0c(String str, int i, String str2) {
        this.LL = str2;
    }
}
