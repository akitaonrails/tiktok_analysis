package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699410Rc3 {
    public final String LIZ;
    public final EnumC699470Rc9 LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C699410Rc3)) {
            return false;
        }
        C699410Rc3 c699410Rc3 = (C699410Rc3) obj;
        return Intrinsics.LJFF(this.LIZ, c699410Rc3.LIZ) && this.LIZIZ == c699410Rc3.LIZIZ && this.LIZJ == c699410Rc3.LIZJ && Intrinsics.LJFF(this.LIZLLL, c699410Rc3.LIZLLL) && Intrinsics.LJFF(this.LJ, c699410Rc3.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotStrategyState(slotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", availabilityState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", revision=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", latestCandidateComponentId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timingKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C699410Rc3(String str, EnumC699470Rc9 enumC699470Rc9, long j, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = enumC699470Rc9;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
