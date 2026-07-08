package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IUH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IUH {
    public static final C0IUH FETCHING;
    public static final C0IUH IDLE;
    public static final /* synthetic */ C0IUH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IUH PAUSE;
    public static final C0IUH RUNNING;

    public static InterfaceC2044707zh<C0IUH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IUH c0iuh = new C0IUH("IDLE", 0);
        IDLE = c0iuh;
        C0IUH c0iuh2 = new C0IUH("PAUSE", 1);
        PAUSE = c0iuh2;
        C0IUH c0iuh3 = new C0IUH("RUNNING", 2);
        RUNNING = c0iuh3;
        C0IUH c0iuh4 = new C0IUH("FETCHING", 3);
        FETCHING = c0iuh4;
        C0IUH[] c0iuhArr = {c0iuh, c0iuh2, c0iuh3, c0iuh4};
        LL = c0iuhArr;
        LLILLJJLI = new C2254308sP(c0iuhArr);
    }

    public static C0IUH[] values() {
        return (C0IUH[]) LL.clone();
    }

    public static C0IUH valueOf(String str) {
        return (C0IUH) C08FF.LIZ(C0IUH.class, str);
    }

    public C0IUH(String str, int i) {
    }
}
