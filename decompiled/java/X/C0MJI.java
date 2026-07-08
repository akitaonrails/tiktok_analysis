package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJI {
    public static final C0MJI AUTO_CUT;
    public static final /* synthetic */ C0MJI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MJI NLE;
    public static final C0MJI NONE;
    public static final C0MJI ORIGIN;

    public static InterfaceC2044707zh<C0MJI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MJI c0mji = new C0MJI("NONE", 0);
        NONE = c0mji;
        C0MJI c0mji2 = new C0MJI("AUTO_CUT", 1);
        AUTO_CUT = c0mji2;
        C0MJI c0mji3 = new C0MJI("NLE", 2);
        NLE = c0mji3;
        C0MJI c0mji4 = new C0MJI("ORIGIN", 3);
        ORIGIN = c0mji4;
        C0MJI[] c0mjiArr = {c0mji, c0mji2, c0mji3, c0mji4};
        LL = c0mjiArr;
        LLILLJJLI = new C2254308sP(c0mjiArr);
    }

    public static C0MJI[] values() {
        return (C0MJI[]) LL.clone();
    }

    public static C0MJI valueOf(String str) {
        return (C0MJI) C08FF.LIZ(C0MJI.class, str);
    }

    public C0MJI(String str, int i) {
    }
}
