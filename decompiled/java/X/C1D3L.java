package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3L, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3L {
    public static final C1D3L BOTH;
    public static final /* synthetic */ C1D3L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1D3L NULL;
    public static final C1D3L ONLY_CLIENT;
    public static final C1D3L ONLY_SERVER;

    public static InterfaceC2044707zh<C1D3L> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1D3L c1d3l = new C1D3L("NULL", 0);
        NULL = c1d3l;
        C1D3L c1d3l2 = new C1D3L("ONLY_CLIENT", 1);
        ONLY_CLIENT = c1d3l2;
        C1D3L c1d3l3 = new C1D3L("ONLY_SERVER", 2);
        ONLY_SERVER = c1d3l3;
        C1D3L c1d3l4 = new C1D3L("BOTH", 3);
        BOTH = c1d3l4;
        C1D3L[] c1d3lArr = {c1d3l, c1d3l2, c1d3l3, c1d3l4};
        LL = c1d3lArr;
        LLILLJJLI = new C2254308sP(c1d3lArr);
    }

    public static C1D3L[] values() {
        return (C1D3L[]) LL.clone();
    }

    public static C1D3L valueOf(String str) {
        return (C1D3L) C08FF.LIZ(C1D3L.class, str);
    }

    public C1D3L(String str, int i) {
    }
}
