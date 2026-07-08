package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703370RiR {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final List<C703310RiL> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703370RiR)) {
            return false;
        }
        C703370RiR c703370RiR = (C703370RiR) obj;
        return Intrinsics.LJFF(this.LIZ, c703370RiR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c703370RiR.LIZIZ) && this.LIZJ == c703370RiR.LIZJ && this.LIZLLL == c703370RiR.LIZLLL && this.LJ == c703370RiR.LJ && Intrinsics.LJFF(this.LJFF, c703370RiR.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotPlanDiagnostic(slotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", summaryReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", blockedByAncestorRule=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timingFilteredRuleCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", triggeredRuleCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ruleEvaluations=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703370RiR(int i, int i2, List list, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = list;
    }
}
