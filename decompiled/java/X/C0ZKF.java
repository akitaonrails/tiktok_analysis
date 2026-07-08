package X;

/* JADX INFO: renamed from: X.0ZKF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZKF {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final C0ZK1 LJFF;
    public final boolean LJI;

    public static C0ZKF LIZ(C0ZKF c0zkf, C0ZK1 c0zk1) {
        return new C0ZKF(c0zkf.LIZ, c0zkf.LIZIZ, c0zkf.LIZJ, c0zkf.LIZLLL, c0zkf.LJ, c0zk1, c0zkf.LJI);
    }

    public /* synthetic */ C0ZKF(int i, int i2, int i3, int i4, int i5, C0ZK1 c0zk1, int i6) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? null : c0zk1, false);
    }

    public C0ZKF(int i, int i2, int i3, int i4, int i5, C0ZK1 c0zk1, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = c0zk1;
        this.LJI = z;
    }
}
