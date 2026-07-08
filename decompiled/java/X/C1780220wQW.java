package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780220wQW extends AbstractC1780830wRV {
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public String LJII;
    public Integer LJIIIIZZ;
    public long LJIIIZ;

    public C1780220wQW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780220wQW)) {
            return false;
        }
        C1780220wQW c1780220wQW = (C1780220wQW) obj;
        return this.LIZJ == c1780220wQW.LIZJ && this.LIZLLL == c1780220wQW.LIZLLL && this.LJ == c1780220wQW.LJ && this.LJFF == c1780220wQW.LJFF && this.LJI == c1780220wQW.LJI && Intrinsics.LJFF(this.LJII, c1780220wQW.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1780220wQW.LJIIIIZZ) && this.LJIIIZ == c1780220wQW.LJIIIZ;
    }

    public final int hashCode() {
        int iY2 = ((((((((this.LIZJ * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31;
        String str = this.LJII;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJIIIIZZ;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardApplyMetrics(boardApplicationType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", boardApplyStartTs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", boardCancelFinishedTs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", boardApplyReadyTs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", boardApplyFinishedTs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", boardApplyError=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", boardApplyErrorCode=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", boardFetchTime=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780220wQW(int i) {
        this.LIZJ = EnumC1779720wPi.AUTO_APPLY_LAST_USED_BOARD.getValue();
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = 0L;
    }
}
