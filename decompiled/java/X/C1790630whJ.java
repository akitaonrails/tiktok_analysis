package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0whJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790630whJ extends AbstractC1780830wRV {
    public final long LIZJ;
    public long LIZLLL;
    public final long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public String LJIILIIL;

    public C1790630whJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1790630whJ)) {
            return false;
        }
        C1790630whJ c1790630whJ = (C1790630whJ) obj;
        return this.LIZJ == c1790630whJ.LIZJ && this.LIZLLL == c1790630whJ.LIZLLL && this.LJ == c1790630whJ.LJ && this.LJFF == c1790630whJ.LJFF && this.LJI == c1790630whJ.LJI && this.LJII == c1790630whJ.LJII && this.LJIIIIZZ == c1790630whJ.LJIIIIZZ && this.LJIIIZ == c1790630whJ.LJIIIZ && this.LJIIJ == c1790630whJ.LJIIJ && this.LJIIJJI == c1790630whJ.LJIIJJI && this.LJIIL == c1790630whJ.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1790630whJ.LJIILIIL);
    }

    public final int hashCode() {
        int iY2 = ((((((((((((((((((((C786410Ut5.Y2(this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31) + C786410Ut5.Y2(this.LJIIL)) * 31;
        String str = this.LJIILIIL;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BoardEditMetrics(boardInitialPreviewStartTs=" + this.LIZJ + ", boardInitialPreviewReadyTs=" + this.LIZLLL + ", boardEditItemStartTs=" + this.LJ + ", boardEditItemReadyTs=" + this.LJFF + ", boardEditItemUpsertStartedTs=" + this.LJI + ", boardItemUpsertFinishedTs=" + this.LJII + ", boardPreviewReadyTs=" + this.LJIIIIZZ + ", boardItemUpsertCount=" + this.LJIIIZ + ", totalBoardItemUpsertReadyDuration=" + this.LJIIJ + ", boardUpsertStartTs=" + this.LJIIJJI + ", boardUpsertFinishedTs=" + this.LJIIL + ", boardEditError=" + this.LJIILIIL + ')';
    }

    public C1790630whJ(int i) {
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = 0;
        this.LJIIJ = 0L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = null;
    }
}
