package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221920hu2 {
    public static final EnumC1221920hu2 AI_AVATAR_CHOOSE_AVATAR_PAGE;
    public static final EnumC1221920hu2 AI_AVATAR_CREATING_PAGE;
    public static final EnumC1221920hu2 CHAT;
    public static final EnumC1221920hu2 EDIT_PROFILE_PAGE;
    public static final EnumC1221920hu2 HOMEPAGE_FOLLOW;
    public static final EnumC1221920hu2 HOMEPAGE_FRIENDS;
    public static final EnumC1221920hu2 HOMEPAGE_HOT;
    public static final /* synthetic */ EnumC1221920hu2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1221920hu2 NOTIFICATION_PAGE;
    public static final EnumC1221920hu2 OTHERS_HOMEPAGE;
    public static final EnumC1221920hu2 PERSONAL_HOMEPAGE;
    public static final EnumC1221920hu2 UNKNOWN;

    public static InterfaceC2044707zh<EnumC1221920hu2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221920hu2 enumC1221920hu2 = new EnumC1221920hu2("PERSONAL_HOMEPAGE", 0);
        PERSONAL_HOMEPAGE = enumC1221920hu2;
        EnumC1221920hu2 enumC1221920hu22 = new EnumC1221920hu2("HOMEPAGE_FOLLOW", 1);
        HOMEPAGE_FOLLOW = enumC1221920hu22;
        EnumC1221920hu2 enumC1221920hu23 = new EnumC1221920hu2("HOMEPAGE_HOT", 2);
        HOMEPAGE_HOT = enumC1221920hu23;
        EnumC1221920hu2 enumC1221920hu24 = new EnumC1221920hu2("HOMEPAGE_FRIENDS", 3);
        HOMEPAGE_FRIENDS = enumC1221920hu24;
        EnumC1221920hu2 enumC1221920hu25 = new EnumC1221920hu2("NOTIFICATION_PAGE", 4);
        NOTIFICATION_PAGE = enumC1221920hu25;
        EnumC1221920hu2 enumC1221920hu26 = new EnumC1221920hu2("OTHERS_HOMEPAGE", 5);
        OTHERS_HOMEPAGE = enumC1221920hu26;
        EnumC1221920hu2 enumC1221920hu27 = new EnumC1221920hu2("CHAT", 6);
        CHAT = enumC1221920hu27;
        EnumC1221920hu2 enumC1221920hu28 = new EnumC1221920hu2("AI_AVATAR_CHOOSE_AVATAR_PAGE", 7);
        AI_AVATAR_CHOOSE_AVATAR_PAGE = enumC1221920hu28;
        EnumC1221920hu2 enumC1221920hu29 = new EnumC1221920hu2("AI_AVATAR_CREATING_PAGE", 8);
        AI_AVATAR_CREATING_PAGE = enumC1221920hu29;
        EnumC1221920hu2 enumC1221920hu210 = new EnumC1221920hu2("EDIT_PROFILE_PAGE", 9);
        EDIT_PROFILE_PAGE = enumC1221920hu210;
        EnumC1221920hu2 enumC1221920hu211 = new EnumC1221920hu2("UNKNOWN", 10);
        UNKNOWN = enumC1221920hu211;
        EnumC1221920hu2[] enumC1221920hu2Arr = {enumC1221920hu2, enumC1221920hu22, enumC1221920hu23, enumC1221920hu24, enumC1221920hu25, enumC1221920hu26, enumC1221920hu27, enumC1221920hu28, enumC1221920hu29, enumC1221920hu210, enumC1221920hu211};
        LL = enumC1221920hu2Arr;
        LLILLJJLI = new C2254308sP(enumC1221920hu2Arr);
    }

    public static EnumC1221920hu2[] values() {
        return (EnumC1221920hu2[]) LL.clone();
    }

    public static EnumC1221920hu2 valueOf(String str) {
        return (EnumC1221920hu2) C08FF.LIZ(EnumC1221920hu2.class, str);
    }

    public EnumC1221920hu2(String str, int i) {
    }
}
