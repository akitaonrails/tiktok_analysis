package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3V, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3V {
    public static final C1D3V BROADER_SETTING;
    public static final C1D3V DISABLED;
    public static final /* synthetic */ C1D3V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1D3V PRECISE_SETTING;

    public static InterfaceC2044707zh<C1D3V> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1D3V c1d3v = new C1D3V("DISABLED", 0);
        DISABLED = c1d3v;
        C1D3V c1d3v2 = new C1D3V("BROADER_SETTING", 1);
        BROADER_SETTING = c1d3v2;
        C1D3V c1d3v3 = new C1D3V("PRECISE_SETTING", 2);
        PRECISE_SETTING = c1d3v3;
        C1D3V[] c1d3vArr = {c1d3v, c1d3v2, c1d3v3};
        LL = c1d3vArr;
        LLILLJJLI = new C2254308sP(c1d3vArr);
    }

    public static C1D3V[] values() {
        return (C1D3V[]) LL.clone();
    }

    public static C1D3V valueOf(String str) {
        return (C1D3V) C08FF.LIZ(C1D3V.class, str);
    }

    public C1D3V(String str, int i) {
    }
}
