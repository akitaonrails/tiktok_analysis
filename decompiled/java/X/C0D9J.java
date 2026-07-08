package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D9J, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9J {
    public static final /* synthetic */ C0D9J[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D9J PAYMENT_ACTION_REQUIRED;
    public static final C0D9J REQUEST_FAILED;
    public static final C0D9J USER_ACTION_BLOCKED;

    public static InterfaceC2044707zh<C0D9J> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D9J c0d9j = new C0D9J("USER_ACTION_BLOCKED", 0);
        USER_ACTION_BLOCKED = c0d9j;
        C0D9J c0d9j2 = new C0D9J("REQUEST_FAILED", 1);
        REQUEST_FAILED = c0d9j2;
        C0D9J c0d9j3 = new C0D9J("PAYMENT_ACTION_REQUIRED", 2);
        PAYMENT_ACTION_REQUIRED = c0d9j3;
        C0D9J[] c0d9jArr = {c0d9j, c0d9j2, c0d9j3};
        LL = c0d9jArr;
        LLILLJJLI = new C2254308sP(c0d9jArr);
    }

    public static C0D9J[] values() {
        return (C0D9J[]) LL.clone();
    }

    public static C0D9J valueOf(String str) {
        return (C0D9J) C08FF.LIZ(C0D9J.class, str);
    }

    public C0D9J(String str, int i) {
    }
}
