package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3K, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3K {
    public static final C1D3K COMPLETED;
    public static final C1D3K EXECUTING_DEPENDENCY_READY;
    public static final C1D3K EXECUTING_IMMEDIATE;
    public static final C1D3K FAILED;
    public static final /* synthetic */ C1D3K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1D3K NOT_STARTED;
    public static final C1D3K WAITING_DEPENDENCIES;

    public static InterfaceC2044707zh<C1D3K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1D3K c1d3k = new C1D3K("NOT_STARTED", 0);
        NOT_STARTED = c1d3k;
        C1D3K c1d3k2 = new C1D3K("EXECUTING_IMMEDIATE", 1);
        EXECUTING_IMMEDIATE = c1d3k2;
        C1D3K c1d3k3 = new C1D3K("WAITING_DEPENDENCIES", 2);
        WAITING_DEPENDENCIES = c1d3k3;
        C1D3K c1d3k4 = new C1D3K("EXECUTING_DEPENDENCY_READY", 3);
        EXECUTING_DEPENDENCY_READY = c1d3k4;
        C1D3K c1d3k5 = new C1D3K("COMPLETED", 4);
        COMPLETED = c1d3k5;
        C1D3K c1d3k6 = new C1D3K("FAILED", 5);
        FAILED = c1d3k6;
        C1D3K[] c1d3kArr = {c1d3k, c1d3k2, c1d3k3, c1d3k4, c1d3k5, c1d3k6};
        LL = c1d3kArr;
        LLILLJJLI = new C2254308sP(c1d3kArr);
    }

    public static C1D3K[] values() {
        return (C1D3K[]) LL.clone();
    }

    public static C1D3K valueOf(String str) {
        return (C1D3K) C08FF.LIZ(C1D3K.class, str);
    }

    public C1D3K(String str, int i) {
    }
}
