package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9Y {
    public static final C0W9Y ACCOUNT_LOGIN;
    public static final C0W9Y ACCOUNT_LOGIN_END;
    public static final C0W9Y ACCOUNT_LOGOUT;
    public static final C0W9Y ACCOUNT_SWITCH;
    public static final /* synthetic */ C0W9Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0W9Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0W9Y c0w9y = new C0W9Y("ACCOUNT_LOGIN", 0);
        ACCOUNT_LOGIN = c0w9y;
        C0W9Y c0w9y2 = new C0W9Y("ACCOUNT_SWITCH", 1);
        ACCOUNT_SWITCH = c0w9y2;
        C0W9Y c0w9y3 = new C0W9Y("ACCOUNT_LOGOUT", 2);
        ACCOUNT_LOGOUT = c0w9y3;
        C0W9Y c0w9y4 = new C0W9Y("ACCOUNT_LOGIN_END", 3);
        ACCOUNT_LOGIN_END = c0w9y4;
        C0W9Y[] c0w9yArr = {c0w9y, c0w9y2, c0w9y3, c0w9y4};
        LL = c0w9yArr;
        LLILLJJLI = new C2254308sP(c0w9yArr);
    }

    public static C0W9Y[] values() {
        return (C0W9Y[]) LL.clone();
    }

    public static C0W9Y valueOf(String str) {
        return (C0W9Y) C08FF.LIZ(C0W9Y.class, str);
    }

    public C0W9Y(String str, int i) {
    }
}
