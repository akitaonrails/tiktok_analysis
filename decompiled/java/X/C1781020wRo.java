package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781020wRo {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final C861890XrX LIZJ;
    public final boolean LIZLLL = true;
    public final Map<Integer, Integer> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781020wRo)) {
            return false;
        }
        C1781020wRo c1781020wRo = (C1781020wRo) obj;
        return Intrinsics.LJFF(this.LIZ, c1781020wRo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781020wRo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781020wRo.LIZJ) && this.LIZLLL == c1781020wRo.LIZLLL && Intrinsics.LJFF(this.LJ, c1781020wRo.LJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        C861890XrX c861890XrX = this.LIZJ;
        return ((((iHashCode2 + (c861890XrX != null ? c861890XrX.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorResolution(forcedFirstIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", forcedSubIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pendingSwitchKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isInitialAnchorHandled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lastSelectedSubRankTypeByFirstRankType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781020wRo(Integer num, Integer num2, C861890XrX c861890XrX, Map map) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = c861890XrX;
        this.LJ = map;
    }
}
