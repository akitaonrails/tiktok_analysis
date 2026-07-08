package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC896030ZDd {
    public static final EnumC896030ZDd ACTION_BAR;
    public static final EnumC896030ZDd ACTIVITY_AGGREGATED_FAVOURITE_LIST;
    public static final EnumC896030ZDd ACTIVITY_AGGREGATED_LIKE_LIST;
    public static final EnumC896030ZDd ACTIVITY_AGGREGATED_REPOST_LIST;
    public static final EnumC896030ZDd IN_APP_PUSH;
    public static final /* synthetic */ EnumC896030ZDd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC896030ZDd NEW_ACTIVITIES;
    public static final EnumC896030ZDd PROFILE_VIEW_LIST;
    public static final EnumC896030ZDd RECOMMEND_PANEL;
    public static final EnumC896030ZDd SOCIAL_AVATAR_LIKE_LIST;
    public static final EnumC896030ZDd STREAK_INBOX;
    public static final EnumC896030ZDd VIDEO_LIKE_LIST;
    public static final EnumC896030ZDd VIDEO_VIEW_LIST;

    public static InterfaceC2044707zh<EnumC896030ZDd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC896030ZDd enumC896030ZDd = new EnumC896030ZDd("VIDEO_LIKE_LIST", 0);
        VIDEO_LIKE_LIST = enumC896030ZDd;
        EnumC896030ZDd enumC896030ZDd2 = new EnumC896030ZDd("VIDEO_VIEW_LIST", 1);
        VIDEO_VIEW_LIST = enumC896030ZDd2;
        EnumC896030ZDd enumC896030ZDd3 = new EnumC896030ZDd("ACTIVITY_AGGREGATED_LIKE_LIST", 2);
        ACTIVITY_AGGREGATED_LIKE_LIST = enumC896030ZDd3;
        EnumC896030ZDd enumC896030ZDd4 = new EnumC896030ZDd("ACTIVITY_AGGREGATED_FAVOURITE_LIST", 3);
        ACTIVITY_AGGREGATED_FAVOURITE_LIST = enumC896030ZDd4;
        EnumC896030ZDd enumC896030ZDd5 = new EnumC896030ZDd("PROFILE_VIEW_LIST", 4);
        PROFILE_VIEW_LIST = enumC896030ZDd5;
        EnumC896030ZDd enumC896030ZDd6 = new EnumC896030ZDd("IN_APP_PUSH", 5);
        IN_APP_PUSH = enumC896030ZDd6;
        EnumC896030ZDd enumC896030ZDd7 = new EnumC896030ZDd("ACTION_BAR", 6);
        ACTION_BAR = enumC896030ZDd7;
        EnumC896030ZDd enumC896030ZDd8 = new EnumC896030ZDd("RECOMMEND_PANEL", 7);
        RECOMMEND_PANEL = enumC896030ZDd8;
        EnumC896030ZDd enumC896030ZDd9 = new EnumC896030ZDd("ACTIVITY_AGGREGATED_REPOST_LIST", 8);
        ACTIVITY_AGGREGATED_REPOST_LIST = enumC896030ZDd9;
        EnumC896030ZDd enumC896030ZDd10 = new EnumC896030ZDd("NEW_ACTIVITIES", 9);
        NEW_ACTIVITIES = enumC896030ZDd10;
        EnumC896030ZDd enumC896030ZDd11 = new EnumC896030ZDd("STREAK_INBOX", 10);
        STREAK_INBOX = enumC896030ZDd11;
        EnumC896030ZDd enumC896030ZDd12 = new EnumC896030ZDd("SOCIAL_AVATAR_LIKE_LIST", 11);
        SOCIAL_AVATAR_LIKE_LIST = enumC896030ZDd12;
        EnumC896030ZDd[] enumC896030ZDdArr = {enumC896030ZDd, enumC896030ZDd2, enumC896030ZDd3, enumC896030ZDd4, enumC896030ZDd5, enumC896030ZDd6, enumC896030ZDd7, enumC896030ZDd8, enumC896030ZDd9, enumC896030ZDd10, enumC896030ZDd11, enumC896030ZDd12};
        LL = enumC896030ZDdArr;
        LLILLJJLI = new C2254308sP(enumC896030ZDdArr);
    }

    public static EnumC896030ZDd[] values() {
        return (EnumC896030ZDd[]) LL.clone();
    }

    public static EnumC896030ZDd valueOf(String str) {
        return (EnumC896030ZDd) C08FF.LIZ(EnumC896030ZDd.class, str);
    }

    public EnumC896030ZDd(String str, int i) {
    }
}
