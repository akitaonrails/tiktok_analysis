package X;

/* JADX INFO: renamed from: X.0Hjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449490Hjv {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public C449490Hjv(boolean z, int i, int i2) {
        boolean z2;
        int i3;
        z = (i2 & 2) != 0 ? false : z;
        if ((i2 & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 128) != 0) {
            i3 = 7;
        } else {
            i3 = 2;
        }
        i = (i2 & 256) != 0 ? 0 : i;
        this.LIZ = false;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = i3;
        this.LJ = i;
    }
}
