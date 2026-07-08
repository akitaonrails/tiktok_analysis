package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.090P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C090P {
    public static final C090P BIND_DATA;
    public static final /* synthetic */ C090P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C090P START_SCROLL;

    public static InterfaceC2044707zh<C090P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C090P c090p = new C090P("START_SCROLL", 0);
        START_SCROLL = c090p;
        C090P c090p2 = new C090P("BIND_DATA", 1);
        BIND_DATA = c090p2;
        C090P[] c090pArr = {c090p, c090p2};
        LL = c090pArr;
        LLILLJJLI = new C2254308sP(c090pArr);
    }

    public static C090P[] values() {
        return (C090P[]) LL.clone();
    }

    public static C090P valueOf(String str) {
        return (C090P) C08FF.LIZ(C090P.class, str);
    }

    public C090P(String str, int i) {
    }
}
