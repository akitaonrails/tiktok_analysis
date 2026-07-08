package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703360RiQ {
    public final String LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public final List<C703310RiL> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703360RiQ)) {
            return false;
        }
        C703360RiQ c703360RiQ = (C703360RiQ) obj;
        return Intrinsics.LJFF(this.LIZ, c703360RiQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c703360RiQ.LIZIZ) && this.LIZJ == c703360RiQ.LIZJ && this.LIZLLL == c703360RiQ.LIZLLL && this.LJ == c703360RiQ.LJ && Intrinsics.LJFF(this.LJFF, c703360RiQ.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutableSlotPlanDiagnostic(slotId=");
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

    public C703360RiQ(String str) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = arrayList;
    }
}
