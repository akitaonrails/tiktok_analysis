package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D90, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D90 {
    public static final C1D90 ALL;
    public static final C1D90 HALF_END;
    public static final C1D90 HALF_START;
    public static final /* synthetic */ C1D90[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1D90 QUARTER_BOTTOM_END;
    public static final C1D90 QUARTER_BOTTOM_START;
    public static final C1D90 QUARTER_TOP_END;
    public static final C1D90 QUARTER_TOP_START;

    public static InterfaceC2044707zh<C1D90> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1D90 c1d90 = new C1D90("ALL", 0);
        ALL = c1d90;
        C1D90 c1d902 = new C1D90("QUARTER_TOP_START", 1);
        QUARTER_TOP_START = c1d902;
        C1D90 c1d903 = new C1D90("QUARTER_TOP_END", 2);
        QUARTER_TOP_END = c1d903;
        C1D90 c1d904 = new C1D90("QUARTER_BOTTOM_START", 3);
        QUARTER_BOTTOM_START = c1d904;
        C1D90 c1d905 = new C1D90("QUARTER_BOTTOM_END", 4);
        QUARTER_BOTTOM_END = c1d905;
        C1D90 c1d906 = new C1D90("HALF_START", 5);
        HALF_START = c1d906;
        C1D90 c1d907 = new C1D90("HALF_END", 6);
        HALF_END = c1d907;
        C1D90[] c1d90Arr = {c1d90, c1d902, c1d903, c1d904, c1d905, c1d906, c1d907};
        LL = c1d90Arr;
        LLILLJJLI = new C2254308sP(c1d90Arr);
    }

    public static C1D90[] values() {
        return (C1D90[]) LL.clone();
    }

    public static C1D90 valueOf(String str) {
        return (C1D90) C08FF.LIZ(C1D90.class, str);
    }

    public C1D90(String str, int i) {
    }
}
