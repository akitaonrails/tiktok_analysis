package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2172611A1b {
    public static final EnumC2172611A1b CHAT;
    public static final C0S2S Companion;
    public static final EnumC2172611A1b GENERAL_SEARCH;
    public static final EnumC2172611A1b HOMEPAGE_FRIENDS;
    public static final EnumC2172611A1b HOMEPAGE_HOT;
    public static final /* synthetic */ EnumC2172611A1b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2172611A1b NOTIFICATION_PAGE;
    public static final EnumC2172611A1b OTHERS_HOMEPAGE;
    public static final EnumC2172611A1b PERSONAL_HOMEPAGE;
    public static final EnumC2172611A1b PROFILE_REPOSTTAB;
    public static final EnumC2172611A1b REPOST_FEED;
    public static final EnumC2172611A1b REPOST_TIMELINE;
    public static final EnumC2172611A1b SHARED_FEED;
    public static final EnumC2172611A1b SHARED_FEED_LIKE_HISTORY;
    public static final EnumC2172611A1b SOCIAL_AVATAR_STICKER;
    public static final EnumC2172611A1b UNKNOWN;
    public static final EnumC2172611A1b VIDEO_EDIT_PAGE;
    public static final EnumC2172611A1b VIDEO_RECORD_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2172611A1b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2172611A1b enumC2172611A1b = new EnumC2172611A1b("CHAT", 0, "chat");
        CHAT = enumC2172611A1b;
        EnumC2172611A1b enumC2172611A1b2 = new EnumC2172611A1b("NOTIFICATION_PAGE", 1, "notification_page");
        NOTIFICATION_PAGE = enumC2172611A1b2;
        EnumC2172611A1b enumC2172611A1b3 = new EnumC2172611A1b("HOMEPAGE_FRIENDS", 2, "homepage_friends");
        HOMEPAGE_FRIENDS = enumC2172611A1b3;
        EnumC2172611A1b enumC2172611A1b4 = new EnumC2172611A1b("PERSONAL_HOMEPAGE", 3, "personal_homepage");
        PERSONAL_HOMEPAGE = enumC2172611A1b4;
        EnumC2172611A1b enumC2172611A1b5 = new EnumC2172611A1b("OTHERS_HOMEPAGE", 4, "others_homepage");
        OTHERS_HOMEPAGE = enumC2172611A1b5;
        EnumC2172611A1b enumC2172611A1b6 = new EnumC2172611A1b("PROFILE_REPOSTTAB", 5, "profile_reposttab");
        PROFILE_REPOSTTAB = enumC2172611A1b6;
        EnumC2172611A1b enumC2172611A1b7 = new EnumC2172611A1b("HOMEPAGE_HOT", 6, "homepage_hot");
        HOMEPAGE_HOT = enumC2172611A1b7;
        EnumC2172611A1b enumC2172611A1b8 = new EnumC2172611A1b("REPOST_FEED", 7, "repost_feed");
        REPOST_FEED = enumC2172611A1b8;
        EnumC2172611A1b enumC2172611A1b9 = new EnumC2172611A1b("VIDEO_EDIT_PAGE", 8, "video_edit_page");
        VIDEO_EDIT_PAGE = enumC2172611A1b9;
        EnumC2172611A1b enumC2172611A1b10 = new EnumC2172611A1b("VIDEO_RECORD_PAGE", 9, "video_record_page");
        VIDEO_RECORD_PAGE = enumC2172611A1b10;
        EnumC2172611A1b enumC2172611A1b11 = new EnumC2172611A1b("SOCIAL_AVATAR_STICKER", 10, "social_avatar_sticker");
        SOCIAL_AVATAR_STICKER = enumC2172611A1b11;
        EnumC2172611A1b enumC2172611A1b12 = new EnumC2172611A1b("REPOST_TIMELINE", 11, "repost_timeline");
        REPOST_TIMELINE = enumC2172611A1b12;
        EnumC2172611A1b enumC2172611A1b13 = new EnumC2172611A1b("GENERAL_SEARCH", 12, "general_search");
        GENERAL_SEARCH = enumC2172611A1b13;
        EnumC2172611A1b enumC2172611A1b14 = new EnumC2172611A1b("SHARED_FEED", 13, "shared_feed");
        SHARED_FEED = enumC2172611A1b14;
        EnumC2172611A1b enumC2172611A1b15 = new EnumC2172611A1b("SHARED_FEED_LIKE_HISTORY", 14, "shared_feed_like_history");
        SHARED_FEED_LIKE_HISTORY = enumC2172611A1b15;
        EnumC2172611A1b enumC2172611A1b16 = new EnumC2172611A1b("UNKNOWN", 15, "unknown");
        UNKNOWN = enumC2172611A1b16;
        EnumC2172611A1b[] enumC2172611A1bArr = {enumC2172611A1b, enumC2172611A1b2, enumC2172611A1b3, enumC2172611A1b4, enumC2172611A1b5, enumC2172611A1b6, enumC2172611A1b7, enumC2172611A1b8, enumC2172611A1b9, enumC2172611A1b10, enumC2172611A1b11, enumC2172611A1b12, enumC2172611A1b13, enumC2172611A1b14, enumC2172611A1b15, enumC2172611A1b16};
        LLILLJJLI = enumC2172611A1bArr;
        LLILLL = new C2254308sP(enumC2172611A1bArr);
        Companion = new C0S2S();
    }

    public static EnumC2172611A1b[] values() {
        return (EnumC2172611A1b[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC2172611A1b valueOf(String str) {
        return (EnumC2172611A1b) C08FF.LIZ(EnumC2172611A1b.class, str);
    }

    public EnumC2172611A1b(String str, int i, String str2) {
        this.LL = str2;
    }
}
