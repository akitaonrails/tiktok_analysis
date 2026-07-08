package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XVK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVK {
    public static final /* synthetic */ C0XVK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0XVK LOGIN;
    public static final C0XVK LOGOUT;
    public static final C0XVK SWITCH_ACCOUNT;

    public static InterfaceC2044707zh<C0XVK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0XVK c0xvk = new C0XVK("LOGIN", 0);
        LOGIN = c0xvk;
        C0XVK c0xvk2 = new C0XVK("SWITCH_ACCOUNT", 1);
        SWITCH_ACCOUNT = c0xvk2;
        C0XVK c0xvk3 = new C0XVK("LOGOUT", 2);
        LOGOUT = c0xvk3;
        C0XVK[] c0xvkArr = {c0xvk, c0xvk2, c0xvk3};
        LL = c0xvkArr;
        LLILLJJLI = new C2254308sP(c0xvkArr);
    }

    public static C0XVK[] values() {
        return (C0XVK[]) LL.clone();
    }

    public static C0XVK valueOf(String str) {
        return (C0XVK) C08FF.LIZ(C0XVK.class, str);
    }

    public C0XVK(String str, int i) {
    }
}
