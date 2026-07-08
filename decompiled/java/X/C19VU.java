package X;

/* JADX INFO: renamed from: X.19VU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19VU {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ = Integer.MIN_VALUE;
    public int LIZLLL = Integer.MIN_VALUE;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII;

    public final void LIZ(int i, int i2) {
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJII = true;
        if (this.LJI) {
            if (i2 != Integer.MIN_VALUE) {
                this.LIZ = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.LIZIZ = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.LIZ = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.LIZIZ = i2;
    }
}
