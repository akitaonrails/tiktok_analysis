package X;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129280fUc {
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZ;
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZIZ;
    public final List<Long> LIZJ;
    public final List<Long> LIZLLL;
    public final List<Long> LJ;
    public final List<Long> LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129280fUc)) {
            return false;
        }
        C1129280fUc c1129280fUc = (C1129280fUc) obj;
        return Intrinsics.LJFF(this.LIZ, c1129280fUc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1129280fUc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1129280fUc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1129280fUc.LIZLLL) && Intrinsics.LJFF(this.LJ, c1129280fUc.LJ) && Intrinsics.LJFF(this.LJFF, c1129280fUc.LJFF) && this.LJI == c1129280fUc.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RealTimePanelInsertParams(pageGiftList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", interactiveGiftList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", frequentlyUsedGifts=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", favGifts=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", favGiftAutoFillIds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", matchGifts=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", selectedGiftId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1129280fUc(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList2, List<Long> list, List<Long> list2, List<Long> list3, List<Long> list4, long j) {
        this.LIZ = linkedList;
        this.LIZIZ = linkedList2;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = list3;
        this.LJFF = list4;
        this.LJI = j;
    }
}
