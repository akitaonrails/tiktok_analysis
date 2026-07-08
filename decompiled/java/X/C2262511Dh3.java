package X;

/* JADX INFO: renamed from: X.1Dh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262511Dh3 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final long LJFF;
    public final boolean LJI;

    public C2262511Dh3(float f, float f2, int i) {
        long j;
        long j2;
        boolean z;
        if ((i & 1) != 0) {
            j = 150;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 500;
        } else {
            j2 = 0;
        }
        long j3 = (i & 4) == 0 ? 0L : 150L;
        f = (i & 8) != 0 ? 0.9f : f;
        f2 = (i & 16) != 0 ? 1.2f : f2;
        long j4 = (i & 32) != 0 ? 50L : 0L;
        if ((i & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = j4;
        this.LJI = z;
    }
}
