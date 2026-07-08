package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0URF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0URF {
    public static final C0URF EMPTY;
    public static final C0URF HIGH;
    public static final C0URF HIGHEST;
    public static final /* synthetic */ C0URF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0URF LOW;
    public static final C0URF MIDDLE;
    public int LL;

    public static InterfaceC2044707zh<C0URF> getEntries() {
        return LLILLL;
    }

    static {
        C0URF c0urf = new C0URF("EMPTY", 0, 0);
        EMPTY = c0urf;
        C0URF c0urf2 = new C0URF("LOW", 1, 1);
        LOW = c0urf2;
        C0URF c0urf3 = new C0URF("MIDDLE", 2, 5);
        MIDDLE = c0urf3;
        C0URF c0urf4 = new C0URF("HIGH", 3, 9);
        HIGH = c0urf4;
        C0URF c0urf5 = new C0URF("HIGHEST", 4, 10);
        HIGHEST = c0urf5;
        C0URF[] c0urfArr = {c0urf, c0urf2, c0urf3, c0urf4, c0urf5};
        LLILLJJLI = c0urfArr;
        LLILLL = new C2254308sP(c0urfArr);
    }

    public static C0URF[] values() {
        return (C0URF[]) LLILLJJLI.clone();
    }

    public final int getPriorityInt() {
        return this.LL;
    }

    public static C0URF valueOf(String str) {
        return (C0URF) C08FF.LIZ(C0URF.class, str);
    }

    public final void setPriorityInt(int i) {
        this.LL = i;
    }

    public C0URF(String str, int i, int i2) {
        this.LL = i2;
    }
}
