package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P2N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P2N {
    public static final C0P2N CENTER;
    public static final /* synthetic */ C0P2N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0P2N START;

    public static InterfaceC2044707zh<C0P2N> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0P2N c0p2n = new C0P2N("CENTER", 0);
        CENTER = c0p2n;
        C0P2N c0p2n2 = new C0P2N("START", 1);
        START = c0p2n2;
        C0P2N[] c0p2nArr = {c0p2n, c0p2n2};
        LL = c0p2nArr;
        LLILLJJLI = new C2254308sP(c0p2nArr);
    }

    public static C0P2N[] values() {
        return (C0P2N[]) LL.clone();
    }

    public static C0P2N valueOf(String str) {
        return (C0P2N) C08FF.LIZ(C0P2N.class, str);
    }

    public C0P2N(String str, int i) {
    }
}
