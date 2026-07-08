package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351430lGv {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1351430lGv)) {
            return false;
        }
        C1351430lGv c1351430lGv = (C1351430lGv) obj;
        return Intrinsics.LJFF(this.LIZ, c1351430lGv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1351430lGv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1351430lGv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1351430lGv.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickGuideMobParams(actionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAtTako=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1351430lGv(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
