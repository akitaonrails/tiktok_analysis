package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K5H, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5H {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public long LJ;
    public long LJFF;
    public final String LJI;
    public int LJII;
    public int LJIIIIZZ;

    public C0K5H() {
        this(null, 0L, 0L, null, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K5H)) {
            return false;
        }
        C0K5H c0k5h = (C0K5H) obj;
        return Intrinsics.LJFF(this.LIZ, c0k5h.LIZ) && this.LIZIZ == c0k5h.LIZIZ && this.LIZJ == c0k5h.LIZJ && this.LIZLLL == c0k5h.LIZLLL && this.LJ == c0k5h.LJ && this.LJFF == c0k5h.LJFF && Intrinsics.LJFF(this.LJI, c0k5h.LJI) && this.LJII == c0k5h.LJII && this.LJIIIIZZ == c0k5h.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageMemory(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startMemory=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fcpMemoryIncrease=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fmpMemoryIncrease=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ttiMemoryIncrease=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", fmpMemoryErrorCode=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", ttiMemoryErrorCode=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K5H(String str, long j, long j2, String str2, int i) {
        str = (i & 1) != 0 ? "" : str;
        j = (i & 2) != 0 ? 0L : j;
        j2 = (i & 4) != 0 ? 0L : j2;
        str2 = (i & 64) != 0 ? "" : str2;
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LJI = str2;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
    }
}
