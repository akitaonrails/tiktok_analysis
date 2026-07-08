package X;

/* JADX INFO: renamed from: X.1A1I, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A1I {
    public final C1A1W LIZ;
    public final C1A1O LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1A1I(C1A1W c1a1w, int i) {
        C1A1Q c1a1q;
        c1a1w = (i & 1) != 0 ? C2172601A1a.LIZ : c1a1w;
        if ((i & 2) != 0) {
            c1a1q = new C1A1O() { // from class: X.1A1Q
            };
        } else {
            c1a1q = null;
        }
        this(c1a1w, c1a1q);
    }

    public C1A1I(C1A1W c1a1w, C1A1O c1a1o) {
        this.LIZ = c1a1w;
        this.LIZIZ = c1a1o;
    }
}
