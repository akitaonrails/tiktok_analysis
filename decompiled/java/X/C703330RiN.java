package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703330RiN {
    public final Map<String, List<C703410RiV>> LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final Map<String, List<C703450RiZ>> LIZLLL;
    public final C1200104ml LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703330RiN)) {
            return false;
        }
        C703330RiN c703330RiN = (C703330RiN) obj;
        return Intrinsics.LJFF(this.LIZ, c703330RiN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c703330RiN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c703330RiN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c703330RiN.LIZLLL) && Intrinsics.LJFF(this.LJ, c703330RiN.LJ) && this.LJFF == c703330RiN.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecutionOperationsPlan(operationsBySlot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", touchedSlotIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", relevantSlots=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextSignaturesBySlot=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", diagnostics=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scheduledOperationCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C703330RiN(Map<String, ? extends List<C703410RiV>> map, List<String> list, List<String> list2, Map<String, ? extends List<C703450RiZ>> map2, C1200104ml c1200104ml, int i) {
        this.LIZ = map;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = map2;
        this.LJ = c1200104ml;
        this.LJFF = i;
    }
}
