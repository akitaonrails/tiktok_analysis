package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1908370zlD {
    public static final EnumC1908370zlD ACTION_BAR;
    public static final EnumC1908370zlD ACTIVITY_PAGE;
    public static final EnumC1908370zlD CELL;
    public static final EnumC1908370zlD FAVOURITE_NOTIFICATION_SUBPAGE;
    public static final EnumC1908370zlD INBOX;
    public static final EnumC1908370zlD INNER_PUSH_PROFILE_VIEWER;
    public static final EnumC1908370zlD INNER_PUSH_STORY_LIKE;
    public static final EnumC1908370zlD INNER_PUSH_VIDEO_LIKE;
    public static final EnumC1908370zlD LIKE_LIST;
    public static final EnumC1908370zlD LIKE_NOTIFICATION_SUBPAGE;
    public static final /* synthetic */ EnumC1908370zlD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1908370zlD PROFILE_VISITOR_LIST;
    public static final EnumC1908370zlD REPOST_NOTIFICATION_SUBPAGE;
    public static final EnumC1908370zlD STREAK_COUNTDOWN_REMINDER;
    public static final EnumC1908370zlD VIEW_LIST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1908370zlD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1908370zlD enumC1908370zlD = new EnumC1908370zlD("VIEW_LIST", 0, "view_list");
        VIEW_LIST = enumC1908370zlD;
        EnumC1908370zlD enumC1908370zlD2 = new EnumC1908370zlD("LIKE_LIST", 1, "like_list");
        LIKE_LIST = enumC1908370zlD2;
        EnumC1908370zlD enumC1908370zlD3 = new EnumC1908370zlD("LIKE_NOTIFICATION_SUBPAGE", 2, "like_notification_subpage");
        LIKE_NOTIFICATION_SUBPAGE = enumC1908370zlD3;
        EnumC1908370zlD enumC1908370zlD4 = new EnumC1908370zlD("FAVOURITE_NOTIFICATION_SUBPAGE", 3, "favourite_notification_subpage");
        FAVOURITE_NOTIFICATION_SUBPAGE = enumC1908370zlD4;
        EnumC1908370zlD enumC1908370zlD5 = new EnumC1908370zlD("REPOST_NOTIFICATION_SUBPAGE", 4, "repost_notification_subpage");
        REPOST_NOTIFICATION_SUBPAGE = enumC1908370zlD5;
        EnumC1908370zlD enumC1908370zlD6 = new EnumC1908370zlD("CELL", 5, "cell");
        CELL = enumC1908370zlD6;
        EnumC1908370zlD enumC1908370zlD7 = new EnumC1908370zlD("PROFILE_VISITOR_LIST", 6, "profile_visitor_list");
        PROFILE_VISITOR_LIST = enumC1908370zlD7;
        EnumC1908370zlD enumC1908370zlD8 = new EnumC1908370zlD("INNER_PUSH_VIDEO_LIKE", 7, "inner_push_video_like");
        INNER_PUSH_VIDEO_LIKE = enumC1908370zlD8;
        EnumC1908370zlD enumC1908370zlD9 = new EnumC1908370zlD("INNER_PUSH_STORY_LIKE", 8, "inner_push_story_like");
        INNER_PUSH_STORY_LIKE = enumC1908370zlD9;
        EnumC1908370zlD enumC1908370zlD10 = new EnumC1908370zlD("INNER_PUSH_PROFILE_VIEWER", 9, "inner_push_profile_viewer");
        INNER_PUSH_PROFILE_VIEWER = enumC1908370zlD10;
        EnumC1908370zlD enumC1908370zlD11 = new EnumC1908370zlD("INBOX", 10, "notification_page");
        INBOX = enumC1908370zlD11;
        EnumC1908370zlD enumC1908370zlD12 = new EnumC1908370zlD("ACTION_BAR", 11, "quick_interaction_bar");
        ACTION_BAR = enumC1908370zlD12;
        EnumC1908370zlD enumC1908370zlD13 = new EnumC1908370zlD("STREAK_COUNTDOWN_REMINDER", 12, "inner_streak_countdown_reminder");
        STREAK_COUNTDOWN_REMINDER = enumC1908370zlD13;
        EnumC1908370zlD enumC1908370zlD14 = new EnumC1908370zlD("ACTIVITY_PAGE", 13, "activity_page");
        ACTIVITY_PAGE = enumC1908370zlD14;
        EnumC1908370zlD[] enumC1908370zlDArr = {enumC1908370zlD, enumC1908370zlD2, enumC1908370zlD3, enumC1908370zlD4, enumC1908370zlD5, enumC1908370zlD6, enumC1908370zlD7, enumC1908370zlD8, enumC1908370zlD9, enumC1908370zlD10, enumC1908370zlD11, enumC1908370zlD12, enumC1908370zlD13, enumC1908370zlD14};
        LLILLJJLI = enumC1908370zlDArr;
        LLILLL = new C2254308sP(enumC1908370zlDArr);
    }

    public static EnumC1908370zlD[] values() {
        return (EnumC1908370zlD[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1908370zlD valueOf(String str) {
        return (EnumC1908370zlD) C08FF.LIZ(EnumC1908370zlD.class, str);
    }

    public EnumC1908370zlD(String str, int i, String str2) {
        this.LL = str2;
    }
}
