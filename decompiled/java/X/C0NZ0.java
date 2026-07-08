package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NZ0 {
    public static final /* synthetic */ C0NZ0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NZ0 LOGIN;
    public static final C0NZ0 LOGOUT;

    public static InterfaceC2044707zh<C0NZ0> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NZ0 c0nz0 = new C0NZ0("LOGIN", 0);
        LOGIN = c0nz0;
        C0NZ0 c0nz02 = new C0NZ0("LOGOUT", 1);
        LOGOUT = c0nz02;
        C0NZ0[] c0nz0Arr = {c0nz0, c0nz02};
        LL = c0nz0Arr;
        LLILLJJLI = new C2254308sP(c0nz0Arr);
    }

    public static C0NZ0[] values() {
        return (C0NZ0[]) LL.clone();
    }

    public static C0NZ0 valueOf(String str) {
        return (C0NZ0) C08FF.LIZ(C0NZ0.class, str);
    }

    public C0NZ0(String str, int i) {
    }
}
