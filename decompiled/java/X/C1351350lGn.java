package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351350lGn {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1351350lGn)) {
            return false;
        }
        C1351350lGn c1351350lGn = (C1351350lGn) obj;
        return this.LIZ == c1351350lGn.LIZ && Intrinsics.LJFF(this.LIZIZ, c1351350lGn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1351350lGn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1351350lGn.LIZLLL) && this.LJ == c1351350lGn.LJ && Intrinsics.LJFF(this.LJFF, c1351350lGn.LJFF) && this.LJI == c1351350lGn.LJI;
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return ((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickCommentGateResult(isIntercepted=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", interceptReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", surfaceState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", gateBranch=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", zeroCommentExemptHit=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", exemptSecondaryReason=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", exemptBothLanesFailed=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1351350lGn(String str, String str2) {
        this("none", str, str2, false, null, false, false);
    }

    public C1351350lGn(String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z2;
        this.LJFF = str4;
        this.LJI = z3;
    }
}
