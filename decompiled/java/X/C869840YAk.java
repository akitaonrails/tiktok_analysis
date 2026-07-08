package X;

/* JADX INFO: renamed from: X.0YAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869840YAk {
    public final int LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MsgSegment(rowId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", convId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", minRegionId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", maxIndex=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxRegionId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", prevIndex=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C869840YAk LIZ(C869840YAk c869840YAk, long j, long j2, long j3, int i) {
        int i2;
        String str;
        long j4;
        long j5;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        if ((i & 1) != 0) {
            i2 = c869840YAk.LIZ;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            str = c869840YAk.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            j8 = c869840YAk.LIZJ;
        }
        if ((i & 8) != 0) {
            j4 = c869840YAk.LIZLLL;
        } else {
            j4 = 0;
        }
        if ((i & 16) != 0) {
            j7 = c869840YAk.LJ;
        }
        if ((i & 32) != 0) {
            j5 = c869840YAk.LJFF;
        } else {
            j5 = 0;
        }
        if ((i & 64) != 0) {
            j6 = c869840YAk.LJI;
        }
        return new C869840YAk(j8, j4, i2, j7, j5, j6, str);
    }

    public C869840YAk(long j, long j2, int i, long j3, long j4, long j5, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = j5;
    }
}
