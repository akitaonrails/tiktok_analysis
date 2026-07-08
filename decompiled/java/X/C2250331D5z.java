package X;

/* JADX INFO: renamed from: X.1D5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250331D5z {
    public final C1D61 LIZ;
    public final C1D3H LIZIZ;
    public final C006Y LIZJ;

    public C2250331D5z(C1D61 c1d61, C1D3H c1d3h, C006Y c006y, int i) {
        c1d3h = (i & 2) != 0 ? C1D3H.EXEC_ON_MAIN : c1d3h;
        if ((i & 4) != 0) {
            System.currentTimeMillis();
        }
        c006y = (i & 8) != 0 ? null : c006y;
        this.LIZ = c1d61;
        this.LIZIZ = c1d3h;
        this.LIZJ = c006y;
    }
}
