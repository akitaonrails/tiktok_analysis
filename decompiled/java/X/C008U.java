package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008U {
    public static final /* synthetic */ C008U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008U WORDIMAGESTYLE_CIRCLE;
    public static final C008U WORDIMAGESTYLE_DEFAULT;
    public static final C008U WORDIMAGESTYLE_SQUARE;

    public static InterfaceC2044707zh<C008U> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008U c008u = new C008U("WORDIMAGESTYLE_DEFAULT", 0);
        WORDIMAGESTYLE_DEFAULT = c008u;
        C008U c008u2 = new C008U("WORDIMAGESTYLE_CIRCLE", 1);
        WORDIMAGESTYLE_CIRCLE = c008u2;
        C008U c008u3 = new C008U("WORDIMAGESTYLE_SQUARE", 2);
        WORDIMAGESTYLE_SQUARE = c008u3;
        C008U[] c008uArr = {c008u, c008u2, c008u3};
        LL = c008uArr;
        LLILLJJLI = new C2254308sP(c008uArr);
    }

    public static C008U[] values() {
        return (C008U[]) LL.clone();
    }

    public static C008U valueOf(String str) {
        return (C008U) C08FF.LIZ(C008U.class, str);
    }

    public C008U(String str, int i) {
    }
}
