package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K5G, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5G {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public long LJ;
    public final long LJFF;
    public long LJI;
    public long LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final String LJIIJ;

    public C0K5G() {
        this(null, 0L, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K5G)) {
            return false;
        }
        C0K5G c0k5g = (C0K5G) obj;
        return Intrinsics.LJFF(this.LIZ, c0k5g.LIZ) && this.LIZIZ == c0k5g.LIZIZ && this.LIZJ == c0k5g.LIZJ && this.LIZLLL == c0k5g.LIZLLL && this.LJ == c0k5g.LJ && this.LJFF == c0k5g.LJFF && this.LJI == c0k5g.LJI && this.LJII == c0k5g.LJII && this.LJIIIIZZ == c0k5g.LJIIIIZZ && this.LJIIIZ == c0k5g.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c0k5g.LJIIJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "PageShowTime(path=" + this.LIZ + ", startTs=" + this.LIZIZ + ", fcpTs=" + this.LIZJ + ", fmpTs=" + this.LIZLLL + ", ttiTs=" + this.LJ + ", fcpDuration=" + this.LJFF + ", fmpDuration=" + this.LJI + ", ttiDuration=" + this.LJII + ", fmpErrorCode=" + this.LJIIIIZZ + ", ttiErrorCode=" + this.LJIIIZ + ", showEntrance=" + this.LJIIJ + ')';
    }

    public C0K5G(String str, long j, String str2, int i) {
        str = (i & 1) != 0 ? "" : str;
        j = (i & 2) != 0 ? 0L : j;
        str2 = (i & 1024) != 0 ? "" : str2;
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIJ = str2;
    }
}
