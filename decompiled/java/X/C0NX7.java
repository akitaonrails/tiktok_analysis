package X;

/* JADX INFO: renamed from: X.0NX7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NX7 {
    public final int LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final C0NX5 LIZLLL;
    public final C0NXK LJ;
    public final C595220NWe LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0NX7(int i, long j, C0NXK c0nxk, int i2) {
        C0NX5 c0nx5;
        C0NXK c0nxk2 = c0nxk;
        long j2 = (i2 & 2) != 0 ? 0L : j;
        if ((i2 & 8) != 0) {
            c0nx5 = C0NX5.STATE_DEFAULT;
        } else {
            c0nx5 = null;
        }
        this(i, j2, null, c0nx5, (i2 & 16) != 0 ? null : c0nxk2, null);
    }

    public C0NX7(int i, long j, String str, C0NX5 c0nx5, C0NXK c0nxk, C595220NWe c595220NWe) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = c0nx5;
        this.LJ = c0nxk;
        this.LJFF = c595220NWe;
    }

    public static C0NX7 LIZ(C0NX7 c0nx7, int i, long j, String str, C0NX5 c0nx5, C0NXK c0nxk, C595220NWe c595220NWe, int i2) {
        C595220NWe c595220NWe2 = c595220NWe;
        C0NX5 c0nx52 = c0nx5;
        String str2 = str;
        long j2 = j;
        C0NXK c0nxk2 = c0nxk;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c0nx7.LIZ;
        }
        if ((i2 & 2) != 0) {
            j2 = c0nx7.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str2 = c0nx7.LIZJ;
        }
        if ((i2 & 8) != 0) {
            c0nx52 = c0nx7.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c0nxk2 = c0nx7.LJ;
        }
        if ((i2 & 32) != 0) {
            c595220NWe2 = c0nx7.LJFF;
        }
        return new C0NX7(i3, j2, str2, c0nx52, c0nxk2, c595220NWe2);
    }
}
