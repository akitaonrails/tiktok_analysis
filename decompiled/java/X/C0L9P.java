package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9P, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9P {
    public static final C0L9P ALL_DIMENSION;
    public static final C0L9P ANY_DIMENSION;
    public static final /* synthetic */ C0L9P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0L9P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L9P c0l9p = new C0L9P("ALL_DIMENSION", 0);
        ALL_DIMENSION = c0l9p;
        C0L9P c0l9p2 = new C0L9P("ANY_DIMENSION", 1);
        ANY_DIMENSION = c0l9p2;
        C0L9P[] c0l9pArr = {c0l9p, c0l9p2};
        LL = c0l9pArr;
        LLILLJJLI = new C2254308sP(c0l9pArr);
    }

    public static C0L9P[] values() {
        return (C0L9P[]) LL.clone();
    }

    public static C0L9P valueOf(String str) {
        return (C0L9P) C08FF.LIZ(C0L9P.class, str);
    }

    public C0L9P(String str, int i) {
    }
}
