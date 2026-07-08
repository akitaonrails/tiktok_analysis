package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3W, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3W {
    public static final C1D3W BROADER_SETTING;
    public static final C1D3W DISABLED;
    public static final /* synthetic */ C1D3W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1D3W PRECISE_SETTING;

    public static InterfaceC2044707zh<C1D3W> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1D3W c1d3w = new C1D3W("DISABLED", 0);
        DISABLED = c1d3w;
        C1D3W c1d3w2 = new C1D3W("BROADER_SETTING", 1);
        BROADER_SETTING = c1d3w2;
        C1D3W c1d3w3 = new C1D3W("PRECISE_SETTING", 2);
        PRECISE_SETTING = c1d3w3;
        C1D3W[] c1d3wArr = {c1d3w, c1d3w2, c1d3w3};
        LL = c1d3wArr;
        LLILLJJLI = new C2254308sP(c1d3wArr);
    }

    public static C1D3W[] values() {
        return (C1D3W[]) LL.clone();
    }

    public static C1D3W valueOf(String str) {
        return (C1D3W) C08FF.LIZ(C1D3W.class, str);
    }

    public C1D3W(String str, int i) {
    }
}
