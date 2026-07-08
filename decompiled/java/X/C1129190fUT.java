package X;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129190fUT {
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZ;
    public final List<Long> LIZIZ;
    public final List<Long> LIZJ;
    public final List<Long> LIZLLL;
    public final List<Long> LJ;
    public final long LJFF;
    public final boolean LJI;
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129190fUT)) {
            return false;
        }
        C1129190fUT c1129190fUT = (C1129190fUT) obj;
        return Intrinsics.LJFF(this.LIZ, c1129190fUT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1129190fUT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1129190fUT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1129190fUT.LIZLLL) && Intrinsics.LJFF(this.LJ, c1129190fUT.LJ) && this.LJFF == c1129190fUT.LJFF && this.LJI == c1129190fUT.LJI && Intrinsics.LJFF(this.LJII, c1129190fUT.LJII);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelBuildResult(panels=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", frequentlyUsedGiftIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", favGiftIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", favGiftAutoFillIds=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", matchGameGiftIds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", liveGoalGiftId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", needUgPointsDecoration=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", interactivePanels=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1129190fUT(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, List<Long> list, List<Long> list2, List<Long> list3, List<Long> list4, long j, boolean z, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList2) {
        this.LIZ = linkedList;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = list4;
        this.LJFF = j;
        this.LJI = z;
        this.LJII = linkedList2;
    }
}
