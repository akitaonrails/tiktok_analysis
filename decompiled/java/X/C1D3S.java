package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3S, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3S {
    public static final /* synthetic */ C1D3S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1D3S NORMAL;
    public static final C1D3S PRELOAD;
    public static final C1D3S PRE_DECODE;
    public static final C1D3S PRE_LAYOUT;
    public static final C1D3S SSR;

    public static InterfaceC2044707zh<C1D3S> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1D3S c1d3s = new C1D3S("NORMAL", 0);
        NORMAL = c1d3s;
        C1D3S c1d3s2 = new C1D3S("PRELOAD", 1);
        PRELOAD = c1d3s2;
        C1D3S c1d3s3 = new C1D3S("PRE_LAYOUT", 2);
        PRE_LAYOUT = c1d3s3;
        C1D3S c1d3s4 = new C1D3S("PRE_DECODE", 3);
        PRE_DECODE = c1d3s4;
        C1D3S c1d3s5 = new C1D3S("SSR", 4);
        SSR = c1d3s5;
        C1D3S[] c1d3sArr = {c1d3s, c1d3s2, c1d3s3, c1d3s4, c1d3s5};
        LL = c1d3sArr;
        LLILLJJLI = new C2254308sP(c1d3sArr);
    }

    public static C1D3S[] values() {
        return (C1D3S[]) LL.clone();
    }

    public static C1D3S valueOf(String str) {
        return (C1D3S) C08FF.LIZ(C1D3S.class, str);
    }

    public C1D3S(String str, int i) {
    }
}
