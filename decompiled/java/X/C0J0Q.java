package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0Q {
    public static final C0J0Q ANCHOR;
    public static final C0J0Q APP;
    public static final C0J0S Companion;
    public static final C0J0Q LIVE;
    public static final /* synthetic */ C0J0Q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0J0Q ROOM;

    public static InterfaceC2044707zh<C0J0Q> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0J0S] */
    static {
        C0J0Q c0j0q = new C0J0Q("APP", 0);
        APP = c0j0q;
        C0J0Q c0j0q2 = new C0J0Q("LIVE", 1);
        LIVE = c0j0q2;
        C0J0Q c0j0q3 = new C0J0Q("ROOM", 2);
        ROOM = c0j0q3;
        C0J0Q c0j0q4 = new C0J0Q("ANCHOR", 3);
        ANCHOR = c0j0q4;
        C0J0Q[] c0j0qArr = {c0j0q, c0j0q2, c0j0q3, c0j0q4};
        LL = c0j0qArr;
        LLILLJJLI = new C2254308sP(c0j0qArr);
        Companion = new Object() { // from class: X.0J0S
        };
    }

    public static C0J0Q[] values() {
        return (C0J0Q[]) LL.clone();
    }

    public static C0J0Q valueOf(String str) {
        return (C0J0Q) C08FF.LIZ(C0J0Q.class, str);
    }

    public C0J0Q(String str, int i) {
    }
}
