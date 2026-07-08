package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351340lGm {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1351340lGm)) {
            return false;
        }
        C1351340lGm c1351340lGm = (C1351340lGm) obj;
        return Intrinsics.LJFF(this.LIZ, c1351340lGm.LIZ) && this.LIZIZ == c1351340lGm.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1351340lGm.LIZJ) && this.LIZLLL == c1351340lGm.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickCommentFollowGateFailureDetail(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", zeroCommentExemptHit=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exemptSecondaryReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", exemptBothLanesFailed=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1351340lGm(String str) {
        this(str, false, null, false);
    }

    public C1351340lGm(String str, boolean z, String str2, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = z2;
    }
}
