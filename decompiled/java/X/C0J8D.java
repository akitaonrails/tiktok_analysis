package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J8D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J8D {
    public static final C0J8D CANCEL;
    public static final C0J8D DIRECT_UPDATE;
    public static final C0J8D IDLE;
    public static final /* synthetic */ C0J8D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0J8D WAIT_CACHE;

    public static InterfaceC2044707zh<C0J8D> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0J8D c0j8d = new C0J8D("IDLE", 0);
        IDLE = c0j8d;
        C0J8D c0j8d2 = new C0J8D("WAIT_CACHE", 1);
        WAIT_CACHE = c0j8d2;
        C0J8D c0j8d3 = new C0J8D("DIRECT_UPDATE", 2);
        DIRECT_UPDATE = c0j8d3;
        C0J8D c0j8d4 = new C0J8D("CANCEL", 3);
        CANCEL = c0j8d4;
        C0J8D[] c0j8dArr = {c0j8d, c0j8d2, c0j8d3, c0j8d4};
        LL = c0j8dArr;
        LLILLJJLI = new C2254308sP(c0j8dArr);
    }

    public static C0J8D[] values() {
        return (C0J8D[]) LL.clone();
    }

    public static C0J8D valueOf(String str) {
        return (C0J8D) C08FF.LIZ(C0J8D.class, str);
    }

    public C0J8D(String str, int i) {
    }
}
