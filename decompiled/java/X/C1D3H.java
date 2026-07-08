package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3H, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3H {
    public static final C1D3H ALL_ON_ONE;
    public static final C1D3H EXEC_ON_MAIN;
    public static final /* synthetic */ C1D3H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1D3H MULTI_THREAD;

    public static InterfaceC2044707zh<C1D3H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1D3H c1d3h = new C1D3H("ALL_ON_ONE", 0);
        ALL_ON_ONE = c1d3h;
        C1D3H c1d3h2 = new C1D3H("EXEC_ON_MAIN", 1);
        EXEC_ON_MAIN = c1d3h2;
        C1D3H c1d3h3 = new C1D3H("MULTI_THREAD", 2);
        MULTI_THREAD = c1d3h3;
        C1D3H[] c1d3hArr = {c1d3h, c1d3h2, c1d3h3};
        LL = c1d3hArr;
        LLILLJJLI = new C2254308sP(c1d3hArr);
    }

    public static C1D3H[] values() {
        return (C1D3H[]) LL.clone();
    }

    public static C1D3H valueOf(String str) {
        return (C1D3H) C08FF.LIZ(C1D3H.class, str);
    }

    public C1D3H(String str, int i) {
    }
}
