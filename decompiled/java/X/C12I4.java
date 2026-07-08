package X;

/* JADX INFO: renamed from: X.12I4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12I4 {
    public final boolean LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public int LJFF;
    public boolean LJI;

    public C12I4(boolean z, int i, int i2, float f, int i3, float f2, int i4) {
        int i5;
        z = (i4 & 1) != 0 ? false : z;
        if ((i4 & 4) != 0) {
            i5 = 100;
        } else {
            i5 = 0;
        }
        i = (i4 & 16) != 0 ? 100 : i;
        i2 = (i4 & 32) != 0 ? 0 : i2;
        f = (i4 & 64) != 0 ? 0.0f : f;
        i3 = (i4 & 128) != 0 ? 0 : i3;
        this.LIZ = z;
        this.LIZIZ = i5;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = f;
        this.LJFF = i3;
        this.LJI = false;
    }
}
