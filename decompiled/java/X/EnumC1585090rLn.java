package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1585090rLn {
    public static final EnumC1585090rLn ACTIVITY_TAB_UPDATE;
    public static final EnumC1585090rLn COIN_TOUCH_POINT_UPDATE;
    public static final EnumC1585090rLn COLD_LAUNCH;
    public static final EnumC1585090rLn COLD_LAUNCH_AFTER_LOGOUT;
    public static final EnumC1585090rLn LIVE_TAB_UPDATE;
    public static final /* synthetic */ EnumC1585090rLn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1585090rLn LOGIN;
    public static final EnumC1585090rLn LOGIN_END;
    public static final EnumC1585090rLn LOGOUT;
    public static final EnumC1585090rLn NUJ;
    public static final EnumC1585090rLn NUJ_END;
    public static final EnumC1585090rLn STEM_TAB_UPDATE;
    public static final EnumC1585090rLn SWITCH_ACCOUNT;
    public static final EnumC1585090rLn TAKO_ICON_UPDATE;
    public static final EnumC1585090rLn UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1585090rLn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1585090rLn enumC1585090rLn = new EnumC1585090rLn("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1585090rLn;
        EnumC1585090rLn enumC1585090rLn2 = new EnumC1585090rLn("COLD_LAUNCH", 1, "cold_launch");
        COLD_LAUNCH = enumC1585090rLn2;
        EnumC1585090rLn enumC1585090rLn3 = new EnumC1585090rLn("COLD_LAUNCH_AFTER_LOGOUT", 2, "cold_launch_after_logout");
        COLD_LAUNCH_AFTER_LOGOUT = enumC1585090rLn3;
        EnumC1585090rLn enumC1585090rLn4 = new EnumC1585090rLn("NUJ", 3, "nuj");
        NUJ = enumC1585090rLn4;
        EnumC1585090rLn enumC1585090rLn5 = new EnumC1585090rLn("NUJ_END", 4, "nuj");
        NUJ_END = enumC1585090rLn5;
        EnumC1585090rLn enumC1585090rLn6 = new EnumC1585090rLn("LOGIN", 5, "login");
        LOGIN = enumC1585090rLn6;
        EnumC1585090rLn enumC1585090rLn7 = new EnumC1585090rLn("LOGOUT", 6, "logout");
        LOGOUT = enumC1585090rLn7;
        EnumC1585090rLn enumC1585090rLn8 = new EnumC1585090rLn("SWITCH_ACCOUNT", 7, "switch_account");
        SWITCH_ACCOUNT = enumC1585090rLn8;
        EnumC1585090rLn enumC1585090rLn9 = new EnumC1585090rLn("LOGIN_END", 8, "login_end");
        LOGIN_END = enumC1585090rLn9;
        EnumC1585090rLn enumC1585090rLn10 = new EnumC1585090rLn("STEM_TAB_UPDATE", 9, "stem");
        STEM_TAB_UPDATE = enumC1585090rLn10;
        EnumC1585090rLn enumC1585090rLn11 = new EnumC1585090rLn("ACTIVITY_TAB_UPDATE", 10, "activity");
        ACTIVITY_TAB_UPDATE = enumC1585090rLn11;
        EnumC1585090rLn enumC1585090rLn12 = new EnumC1585090rLn("LIVE_TAB_UPDATE", 11, "live");
        LIVE_TAB_UPDATE = enumC1585090rLn12;
        EnumC1585090rLn enumC1585090rLn13 = new EnumC1585090rLn("TAKO_ICON_UPDATE", 12, "tako");
        TAKO_ICON_UPDATE = enumC1585090rLn13;
        EnumC1585090rLn enumC1585090rLn14 = new EnumC1585090rLn("COIN_TOUCH_POINT_UPDATE", 13, "touch_point");
        COIN_TOUCH_POINT_UPDATE = enumC1585090rLn14;
        EnumC1585090rLn[] enumC1585090rLnArr = {enumC1585090rLn, enumC1585090rLn2, enumC1585090rLn3, enumC1585090rLn4, enumC1585090rLn5, enumC1585090rLn6, enumC1585090rLn7, enumC1585090rLn8, enumC1585090rLn9, enumC1585090rLn10, enumC1585090rLn11, enumC1585090rLn12, enumC1585090rLn13, enumC1585090rLn14};
        LLILLJJLI = enumC1585090rLnArr;
        LLILLL = new C2254308sP(enumC1585090rLnArr);
    }

    public static EnumC1585090rLn[] values() {
        return (EnumC1585090rLn[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1585090rLn valueOf(String str) {
        return (EnumC1585090rLn) C08FF.LIZ(EnumC1585090rLn.class, str);
    }

    public EnumC1585090rLn(String str, int i, String str2) {
        this.LL = str2;
    }
}
