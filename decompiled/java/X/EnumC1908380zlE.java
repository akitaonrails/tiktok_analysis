package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zlE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1908380zlE {
    public static final EnumC1908380zlE ACTIVITY_NOTIFICATION_PAGE;
    public static final EnumC1908380zlE CHAT;
    public static final EnumC1908380zlE FAVOURITE_NOTIFICATION_SUBPAGE;
    public static final EnumC1908380zlE INBOX;
    public static final EnumC1908380zlE INNER_PUSH;
    public static final EnumC1908380zlE LIKE_NOTIFICATION_SUBPAGE;
    public static final /* synthetic */ EnumC1908380zlE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1908380zlE PERSONAL_HOMEPAGE;
    public static final EnumC1908380zlE PROFILE_VISITOR_LIST;
    public static final EnumC1908380zlE REPOST_NOTIFICATION_SUBPAGE;
    public static final EnumC1908380zlE UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1908380zlE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1908380zlE enumC1908380zlE = new EnumC1908380zlE("UNKNOWN", 0, "");
        UNKNOWN = enumC1908380zlE;
        EnumC1908380zlE enumC1908380zlE2 = new EnumC1908380zlE("PERSONAL_HOMEPAGE", 1, "personal_homepage");
        PERSONAL_HOMEPAGE = enumC1908380zlE2;
        EnumC1908380zlE enumC1908380zlE3 = new EnumC1908380zlE("LIKE_NOTIFICATION_SUBPAGE", 2, "like_notification_subpage");
        LIKE_NOTIFICATION_SUBPAGE = enumC1908380zlE3;
        EnumC1908380zlE enumC1908380zlE4 = new EnumC1908380zlE("FAVOURITE_NOTIFICATION_SUBPAGE", 3, "favourite_notification_subpage");
        FAVOURITE_NOTIFICATION_SUBPAGE = enumC1908380zlE4;
        EnumC1908380zlE enumC1908380zlE5 = new EnumC1908380zlE("REPOST_NOTIFICATION_SUBPAGE", 4, "repost_notification_subpage");
        REPOST_NOTIFICATION_SUBPAGE = enumC1908380zlE5;
        EnumC1908380zlE enumC1908380zlE6 = new EnumC1908380zlE("INNER_PUSH", 5, "inner_push");
        INNER_PUSH = enumC1908380zlE6;
        EnumC1908380zlE enumC1908380zlE7 = new EnumC1908380zlE("CHAT", 6, "chat");
        CHAT = enumC1908380zlE7;
        EnumC1908380zlE enumC1908380zlE8 = new EnumC1908380zlE("PROFILE_VISITOR_LIST", 7, "profile_visitor_list");
        PROFILE_VISITOR_LIST = enumC1908380zlE8;
        EnumC1908380zlE enumC1908380zlE9 = new EnumC1908380zlE("ACTIVITY_NOTIFICATION_PAGE", 8, "activity_notification_page");
        ACTIVITY_NOTIFICATION_PAGE = enumC1908380zlE9;
        EnumC1908380zlE enumC1908380zlE10 = new EnumC1908380zlE("INBOX", 9, "notification_page");
        INBOX = enumC1908380zlE10;
        EnumC1908380zlE[] enumC1908380zlEArr = {enumC1908380zlE, enumC1908380zlE2, enumC1908380zlE3, enumC1908380zlE4, enumC1908380zlE5, enumC1908380zlE6, enumC1908380zlE7, enumC1908380zlE8, enumC1908380zlE9, enumC1908380zlE10};
        LLILLJJLI = enumC1908380zlEArr;
        LLILLL = new C2254308sP(enumC1908380zlEArr);
    }

    public static EnumC1908380zlE[] values() {
        return (EnumC1908380zlE[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1908380zlE valueOf(String str) {
        return (EnumC1908380zlE) C08FF.LIZ(EnumC1908380zlE.class, str);
    }

    public EnumC1908380zlE(String str, int i, String str2) {
        this.LL = str2;
    }
}
