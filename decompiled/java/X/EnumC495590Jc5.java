package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC495590Jc5 {
    public static final EnumC495590Jc5 AT_REPLY;
    public static final EnumC495590Jc5 DISCONNECT_GUEST;
    public static final EnumC495590Jc5 FOLLOW;
    public static final EnumC495590Jc5 INVITE_GUEST;
    public static final EnumC495590Jc5 INVITE_HOST;
    public static final /* synthetic */ EnumC495590Jc5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC495590Jc5 NOTIFICATION;
    public static final EnumC495590Jc5 SUBSCRIBE;
    public static final EnumC495590Jc5 UNABLE_INVITE_GUEST;
    public static final EnumC495590Jc5 UNABLE_INVITE_HOST;
    public static final EnumC495590Jc5 UNBLOCK;
    public static final EnumC495590Jc5 UNFOLLOW;
    public static final EnumC495590Jc5 UNSUBSCRIBE;
    public static final EnumC495590Jc5 WATCH_LIVE_BUTTON;

    public static InterfaceC2044707zh<EnumC495590Jc5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC495590Jc5 enumC495590Jc5 = new EnumC495590Jc5("UNBLOCK", 0);
        UNBLOCK = enumC495590Jc5;
        EnumC495590Jc5 enumC495590Jc52 = new EnumC495590Jc5("FOLLOW", 1);
        FOLLOW = enumC495590Jc52;
        EnumC495590Jc5 enumC495590Jc53 = new EnumC495590Jc5("UNFOLLOW", 2);
        UNFOLLOW = enumC495590Jc53;
        EnumC495590Jc5 enumC495590Jc54 = new EnumC495590Jc5("NOTIFICATION", 3);
        NOTIFICATION = enumC495590Jc54;
        EnumC495590Jc5 enumC495590Jc55 = new EnumC495590Jc5("AT_REPLY", 4);
        AT_REPLY = enumC495590Jc55;
        EnumC495590Jc5 enumC495590Jc56 = new EnumC495590Jc5("SUBSCRIBE", 5);
        SUBSCRIBE = enumC495590Jc56;
        EnumC495590Jc5 enumC495590Jc57 = new EnumC495590Jc5("UNSUBSCRIBE", 6);
        UNSUBSCRIBE = enumC495590Jc57;
        EnumC495590Jc5 enumC495590Jc58 = new EnumC495590Jc5("INVITE_HOST", 7);
        INVITE_HOST = enumC495590Jc58;
        EnumC495590Jc5 enumC495590Jc59 = new EnumC495590Jc5("UNABLE_INVITE_HOST", 8);
        UNABLE_INVITE_HOST = enumC495590Jc59;
        EnumC495590Jc5 enumC495590Jc510 = new EnumC495590Jc5("INVITE_GUEST", 9);
        INVITE_GUEST = enumC495590Jc510;
        EnumC495590Jc5 enumC495590Jc511 = new EnumC495590Jc5("UNABLE_INVITE_GUEST", 10);
        UNABLE_INVITE_GUEST = enumC495590Jc511;
        EnumC495590Jc5 enumC495590Jc512 = new EnumC495590Jc5("DISCONNECT_GUEST", 11);
        DISCONNECT_GUEST = enumC495590Jc512;
        EnumC495590Jc5 enumC495590Jc513 = new EnumC495590Jc5("WATCH_LIVE_BUTTON", 12);
        WATCH_LIVE_BUTTON = enumC495590Jc513;
        EnumC495590Jc5[] enumC495590Jc5Arr = {enumC495590Jc5, enumC495590Jc52, enumC495590Jc53, enumC495590Jc54, enumC495590Jc55, enumC495590Jc56, enumC495590Jc57, enumC495590Jc58, enumC495590Jc59, enumC495590Jc510, enumC495590Jc511, enumC495590Jc512, enumC495590Jc513};
        LL = enumC495590Jc5Arr;
        LLILLJJLI = new C2254308sP(enumC495590Jc5Arr);
    }

    public static EnumC495590Jc5[] values() {
        return (EnumC495590Jc5[]) LL.clone();
    }

    public static EnumC495590Jc5 valueOf(String str) {
        return (EnumC495590Jc5) C08FF.LIZ(EnumC495590Jc5.class, str);
    }

    public EnumC495590Jc5(String str, int i) {
    }
}
