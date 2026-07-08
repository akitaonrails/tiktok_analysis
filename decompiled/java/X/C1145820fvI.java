package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145820fvI {
    public final long LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final Long LJI;
    public final Long LJII;
    public final Integer LJIIIIZZ;
    public final String LJIIIZ;
    public final List<C1145800fvG> LJIIJ;
    public final double LJIIJJI;
    public final double LJIIL;
    public final double LJIILIIL;
    public final Long LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1145820fvI)) {
            return false;
        }
        C1145820fvI c1145820fvI = (C1145820fvI) obj;
        return this.LIZ == c1145820fvI.LIZ && this.LIZIZ == c1145820fvI.LIZIZ && this.LIZJ == c1145820fvI.LIZJ && this.LIZLLL == c1145820fvI.LIZLLL && Intrinsics.LJFF(this.LJ, c1145820fvI.LJ) && this.LJFF == c1145820fvI.LJFF && Intrinsics.LJFF(this.LJI, c1145820fvI.LJI) && Intrinsics.LJFF(this.LJII, c1145820fvI.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1145820fvI.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1145820fvI.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1145820fvI.LJIIJ) && Double.compare(this.LJIIJJI, c1145820fvI.LJIIJJI) == 0 && Double.compare(this.LJIIL, c1145820fvI.LJIIL) == 0 && Double.compare(this.LJIILIIL, c1145820fvI.LJIILIIL) == 0 && Intrinsics.LJFF(this.LJIILJJIL, c1145820fvI.LJIILJJIL);
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31;
        Long l = this.LJI;
        int iHashCode = (iY2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJII;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJIIIZ;
        int iHashCode4 = (((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.X2(this.LJIIJJI)) * 31) + C786410Ut5.X2(this.LJIIL)) * 31) + C786410Ut5.X2(this.LJIILIIL)) * 31;
        Long l3 = this.LJIILJJIL;
        return iHashCode4 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "AudienceBoardRenderSnapshot(boardId=" + this.LIZ + ", boardVersion=" + this.LIZIZ + ", anchorId=" + this.LIZJ + ", roomId=" + this.LIZLLL + ", location=" + this.LJ + ", applicationResult=" + this.LJFF + ", initialRenderDurationMs=" + this.LJI + ", totalRenderDurationMs=" + this.LJII + ", firstErrorCode=" + this.LJIIIIZZ + ", errorDetails=" + this.LJIIIZ + ", boardItemStatuses=" + this.LJIIJ + ", imageFetchSuccessRatio=" + this.LJIIJJI + ", fontFetchSuccessRatio=" + this.LJIIL + ", textItemRenderSuccessRatio=" + this.LJIILIIL + ", earlyExitBoardLoadTimeMs=" + this.LJIILJJIL + ')';
    }

    public C1145820fvI(long j, int i, long j2, long j3, String str, int i2, Long l, Long l2, Integer num, String str2, List<C1145800fvG> list, double d, double d2, double d3, Long l3) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = str;
        this.LJFF = i2;
        this.LJI = l;
        this.LJII = l2;
        this.LJIIIIZZ = num;
        this.LJIIIZ = str2;
        this.LJIIJ = list;
        this.LJIIJJI = d;
        this.LJIIL = d2;
        this.LJIILIIL = d3;
        this.LJIILJJIL = l3;
    }
}
