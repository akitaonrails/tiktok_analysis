package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00YP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YP {
    public static final C00YP DELETE_ONLY;
    public static final C00YP HOT_REFRESH;
    public static final /* synthetic */ C00YP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00YP SKIP;

    public static InterfaceC2044707zh<C00YP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00YP c00yp = new C00YP("HOT_REFRESH", 0);
        HOT_REFRESH = c00yp;
        C00YP c00yp2 = new C00YP("DELETE_ONLY", 1);
        DELETE_ONLY = c00yp2;
        C00YP c00yp3 = new C00YP("SKIP", 2);
        SKIP = c00yp3;
        C00YP[] c00ypArr = {c00yp, c00yp2, c00yp3};
        LL = c00ypArr;
        LLILLJJLI = new C2254308sP(c00ypArr);
    }

    public static C00YP[] values() {
        return (C00YP[]) LL.clone();
    }

    public static C00YP valueOf(String str) {
        return (C00YP) C08FF.LIZ(C00YP.class, str);
    }

    public C00YP(String str, int i) {
    }
}
