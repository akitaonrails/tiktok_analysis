package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703310RiL {
    public final EnumC703190Ri9 LIZ;
    public final List<String> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;
    public final EnumC699470Rc9 LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703310RiL)) {
            return false;
        }
        C703310RiL c703310RiL = (C703310RiL) obj;
        return this.LIZ == c703310RiL.LIZ && Intrinsics.LJFF(this.LIZIZ, c703310RiL.LIZIZ) && this.LIZJ == c703310RiL.LIZJ && this.LIZLLL == c703310RiL.LIZLLL && Intrinsics.LJFF(this.LJ, c703310RiL.LJ) && Intrinsics.LJFF(this.LJFF, c703310RiL.LJFF) && this.LJI == c703310RiL.LJI && this.LJII == c703310RiL.LJII && this.LJIIIIZZ == c703310RiL.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<String> list = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return ((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotRuleEvaluationDiagnostic(actionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timingKeys=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timingMatched=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canApply=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", failureReason=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", matchedTimingKey=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", effectiveDelayMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", availabilityState=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", usedDefaultAvailability=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703310RiL(EnumC703190Ri9 enumC703190Ri9, List<String> list, boolean z, boolean z2, String str, String str2, long j, EnumC699470Rc9 enumC699470Rc9, boolean z3) {
        this.LIZ = enumC703190Ri9;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = j;
        this.LJII = enumC699470Rc9;
        this.LJIIIIZZ = z3;
    }
}
