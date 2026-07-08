package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CP {
    public static final C00CP CANCELLED_BY_CALLER;
    public static final C00CP LAUNCH_UCP_FAILED;
    public static final /* synthetic */ C00CP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00CP LOGIN_FAILED;

    public static InterfaceC2044707zh<C00CP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00CP c00cp = new C00CP("LOGIN_FAILED", 0);
        LOGIN_FAILED = c00cp;
        C00CP c00cp2 = new C00CP("LAUNCH_UCP_FAILED", 1);
        LAUNCH_UCP_FAILED = c00cp2;
        C00CP c00cp3 = new C00CP("CANCELLED_BY_CALLER", 2);
        CANCELLED_BY_CALLER = c00cp3;
        C00CP[] c00cpArr = {c00cp, c00cp2, c00cp3};
        LL = c00cpArr;
        LLILLJJLI = new C2254308sP(c00cpArr);
    }

    public static C00CP[] values() {
        return (C00CP[]) LL.clone();
    }

    public static C00CP valueOf(String str) {
        return (C00CP) C08FF.LIZ(C00CP.class, str);
    }

    public C00CP(String str, int i) {
    }
}
