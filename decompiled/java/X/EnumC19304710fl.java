package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19304710fl {
    public static final EnumC19304710fl DID_IID_UPDATE;
    public static final EnumC19304710fl FEED_READY;
    public static final /* synthetic */ EnumC19304710fl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19304710fl LOGIN;
    public static final EnumC19304710fl LOGIN_DONE;
    public static final EnumC19304710fl LOGOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19304710fl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19304710fl enumC19304710fl = new EnumC19304710fl("FEED_READY", 0, "feed-ready");
        FEED_READY = enumC19304710fl;
        EnumC19304710fl enumC19304710fl2 = new EnumC19304710fl("DID_IID_UPDATE", 1, "did-iid-update");
        DID_IID_UPDATE = enumC19304710fl2;
        EnumC19304710fl enumC19304710fl3 = new EnumC19304710fl("LOGIN", 2, "login");
        LOGIN = enumC19304710fl3;
        EnumC19304710fl enumC19304710fl4 = new EnumC19304710fl("LOGIN_DONE", 3, "login-done");
        LOGIN_DONE = enumC19304710fl4;
        EnumC19304710fl enumC19304710fl5 = new EnumC19304710fl("LOGOUT", 4, "logout");
        LOGOUT = enumC19304710fl5;
        EnumC19304710fl[] enumC19304710flArr = {enumC19304710fl, enumC19304710fl2, enumC19304710fl3, enumC19304710fl4, enumC19304710fl5};
        LLILLJJLI = enumC19304710flArr;
        LLILLL = new C2254308sP(enumC19304710flArr);
    }

    public static EnumC19304710fl[] values() {
        return (EnumC19304710fl[]) LLILLJJLI.clone();
    }

    public final String getReportName() {
        return this.LL;
    }

    public static EnumC19304710fl valueOf(String str) {
        return (EnumC19304710fl) C08FF.LIZ(EnumC19304710fl.class, str);
    }

    public EnumC19304710fl(String str, int i, String str2) {
        this.LL = str2;
    }
}
