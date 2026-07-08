package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0scD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633710scD {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633710scD)) {
            return false;
        }
        C1633710scD c1633710scD = (C1633710scD) obj;
        return C19990113Jj.LJII(this.LIZ, c1633710scD.LIZ) && C19990113Jj.LJII(this.LIZIZ, c1633710scD.LIZIZ) && C19990113Jj.LJII(this.LIZJ, c1633710scD.LIZJ) && C19990113Jj.LJII(this.LIZLLL, c1633710scD.LIZLLL) && Intrinsics.LJFF(this.LJ, c1633710scD.LJ) && this.LJFF == c1633710scD.LJFF && this.LJI == c1633710scD.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkMetrics(networkRead=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LIZ));
        sbLIZ.append(", parse=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LIZIZ));
        sbLIZ.append(", modify=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LIZJ));
        sbLIZ.append(", chunkTotal=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LIZLLL));
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", chunkBytes=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", totalBytesSoFar=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str = this.LJ;
        return ((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final C1633710scD LIZ(C1633710scD c1633710scD) {
        long jLJIJ = C19990113Jj.LJIJ(this.LIZ, c1633710scD.LIZ);
        long jLJIJ2 = C19990113Jj.LJIJ(this.LIZIZ, c1633710scD.LIZIZ);
        long jLJIJ3 = C19990113Jj.LJIJ(this.LIZJ, c1633710scD.LIZJ);
        long jLJIJ4 = C19990113Jj.LJIJ(this.LIZLLL, c1633710scD.LIZLLL);
        long j = this.LJFF;
        long j2 = c1633710scD.LJFF;
        long j3 = j + j2;
        long j4 = this.LJI + j2;
        String str = this.LJ;
        if (str == null) {
            str = c1633710scD.LJ;
        }
        return new C1633710scD(jLJIJ, jLJIJ2, jLJIJ3, jLJIJ4, str, j3, j4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1633710scD(String str, int i) {
        String str2 = str;
        if ((i & 1) != 0) {
            C19990113Jj.LLILLJJLI.getClass();
        }
        if ((i & 2) != 0) {
            C19990113Jj.LLILLJJLI.getClass();
        }
        if ((i & 4) != 0) {
            C19990113Jj.LLILLJJLI.getClass();
        }
        if ((i & 8) != 0) {
            C19990113Jj.LLILLJJLI.getClass();
        }
        this(0L, 0L, 0L, 0L, (i & 16) != 0 ? null : str2, 0L, 0L);
    }

    public C1633710scD(long j, long j2, long j3, long j4, String str, long j5, long j6) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = str;
        this.LJFF = j5;
        this.LJI = j6;
    }
}
