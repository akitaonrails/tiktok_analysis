package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J1Y {
    public static final C0J1Y CREATE;
    public static final C0J1Y DESTROY;
    public static final /* synthetic */ C0J1Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0J1Y PAUSE;
    public static final C0J1Y RESUME;
    public final int LL;

    public static InterfaceC2044707zh<C0J1Y> getEntries() {
        return LLILLL;
    }

    static {
        C0J1Y c0j1y = new C0J1Y("CREATE", 0, 0);
        CREATE = c0j1y;
        C0J1Y c0j1y2 = new C0J1Y("RESUME", 1, 1);
        RESUME = c0j1y2;
        C0J1Y c0j1y3 = new C0J1Y("PAUSE", 2, 2);
        PAUSE = c0j1y3;
        C0J1Y c0j1y4 = new C0J1Y("DESTROY", 3, -1);
        DESTROY = c0j1y4;
        C0J1Y[] c0j1yArr = {c0j1y, c0j1y2, c0j1y3, c0j1y4};
        LLILLJJLI = c0j1yArr;
        LLILLL = new C2254308sP(c0j1yArr);
    }

    public static C0J1Y[] values() {
        return (C0J1Y[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static C0J1Y valueOf(String str) {
        return (C0J1Y) C08FF.LIZ(C0J1Y.class, str);
    }

    public C0J1Y(String str, int i, int i2) {
        this.LL = i2;
    }
}
