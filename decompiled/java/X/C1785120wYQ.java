package X;

/* JADX INFO: renamed from: X.0wYQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785120wYQ {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;

    public /* synthetic */ C1785120wYQ(String str) {
        this(0, 0, str, false, false, false);
    }

    public C1785120wYQ(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = z3;
    }

    public static C1785120wYQ LIZ(C1785120wYQ c1785120wYQ, boolean z, boolean z2, int i, int i2, boolean z3, int i3) {
        String str;
        boolean z4 = z3;
        int i4 = i2;
        int i5 = i;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i3 & 1) != 0) {
            str = c1785120wYQ.LIZ;
        } else {
            str = null;
        }
        if ((i3 & 2) != 0) {
            z6 = c1785120wYQ.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            z5 = c1785120wYQ.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i5 = c1785120wYQ.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i4 = c1785120wYQ.LJ;
        }
        if ((i3 & 32) != 0) {
            z4 = c1785120wYQ.LJFF;
        }
        return new C1785120wYQ(i5, i4, str, z6, z5, z4);
    }
}
