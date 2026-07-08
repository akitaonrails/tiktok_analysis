package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056U {
    public static final C056V Companion;
    public static final /* synthetic */ C056U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C056U MORE_HOST;
    public static final C056U MORE_WATCH;
    public static final C056U SHARE_HOST;
    public static final C056U SHARE_WATCH;

    public static InterfaceC2044707zh<C056U> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.056V] */
    static {
        C056U c056u = new C056U("SHARE_WATCH", 0);
        SHARE_WATCH = c056u;
        C056U c056u2 = new C056U("SHARE_HOST", 1);
        SHARE_HOST = c056u2;
        C056U c056u3 = new C056U("MORE_WATCH", 2);
        MORE_WATCH = c056u3;
        C056U c056u4 = new C056U("MORE_HOST", 3);
        MORE_HOST = c056u4;
        C056U[] c056uArr = {c056u, c056u2, c056u3, c056u4};
        LL = c056uArr;
        LLILLJJLI = new C2254308sP(c056uArr);
        Companion = new Object() { // from class: X.056V
        };
    }

    public static C056U[] values() {
        return (C056U[]) LL.clone();
    }

    public static final C056U turnInt2Scene(int i) {
        Companion.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return SHARE_WATCH;
                    }
                    return MORE_HOST;
                }
                return MORE_WATCH;
            }
            return SHARE_HOST;
        }
        return SHARE_WATCH;
    }

    public static C056U valueOf(String str) {
        return (C056U) C08FF.LIZ(C056U.class, str);
    }

    public C056U(String str, int i) {
    }
}
