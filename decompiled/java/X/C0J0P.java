package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J0P, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0P {
    public static final C0J0P ANCHOR;
    public static final C0J0P APP;
    public static final C0J0P LIVE;
    public static final /* synthetic */ C0J0P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0J0P ROOM;

    public static InterfaceC2044707zh<C0J0P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0J0P c0j0p = new C0J0P("APP", 0);
        APP = c0j0p;
        C0J0P c0j0p2 = new C0J0P("LIVE", 1);
        LIVE = c0j0p2;
        C0J0P c0j0p3 = new C0J0P("ROOM", 2);
        ROOM = c0j0p3;
        C0J0P c0j0p4 = new C0J0P("ANCHOR", 3);
        ANCHOR = c0j0p4;
        C0J0P[] c0j0pArr = {c0j0p, c0j0p2, c0j0p3, c0j0p4};
        LL = c0j0pArr;
        LLILLJJLI = new C2254308sP(c0j0pArr);
    }

    public static C0J0P[] values() {
        return (C0J0P[]) LL.clone();
    }

    public static C0J0P valueOf(String str) {
        return (C0J0P) C08FF.LIZ(C0J0P.class, str);
    }

    public C0J0P(String str, int i) {
    }
}
