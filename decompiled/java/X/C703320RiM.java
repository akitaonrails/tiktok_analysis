package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703320RiM {
    public final Map<String, List<C703410RiV>> LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final Map<String, List<C703450RiZ>> LJFF;
    public final C1200104ml LJI;
    public final int LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703320RiM)) {
            return false;
        }
        C703320RiM c703320RiM = (C703320RiM) obj;
        return Intrinsics.LJFF(this.LIZ, c703320RiM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c703320RiM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c703320RiM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c703320RiM.LIZLLL) && Intrinsics.LJFF(this.LJ, c703320RiM.LJ) && Intrinsics.LJFF(this.LJFF, c703320RiM.LJFF) && Intrinsics.LJFF(this.LJI, c703320RiM.LJI) && this.LJII == c703320RiM.LJII;
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecuteSchedulingPlan(operationsBySlot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", touchedSlotIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", relevantSlots=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", slotIdsToRestart=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", slotIdsToCancelOnly=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nextSignaturesBySlot=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", diagnostics=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", scheduledOperationCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C703320RiM(Map<String, ? extends List<C703410RiV>> map, List<String> list, List<String> list2, List<String> list3, List<String> list4, Map<String, ? extends List<C703450RiZ>> map2, C1200104ml c1200104ml, int i) {
        this.LIZ = map;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = list4;
        this.LJFF = map2;
        this.LJI = c1200104ml;
        this.LJII = i;
    }
}
