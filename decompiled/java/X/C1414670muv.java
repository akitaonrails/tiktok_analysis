package X;

/* JADX INFO: renamed from: X.0muv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414670muv {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C1412860ms0 LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C1412800mru LJII;

    public C1414670muv(int i, int i2, int i3, C1412860ms0 c1412860ms0, boolean z, C1412800mru c1412800mru, int i4) {
        boolean z2;
        if ((i4 & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1412800mru = (i4 & 128) != 0 ? null : c1412800mru;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = c1412860ms0;
        this.LJ = z;
        this.LJFF = false;
        this.LJI = z2;
        this.LJII = c1412800mru;
    }
}
