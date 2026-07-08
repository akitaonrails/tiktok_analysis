package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568780qvU {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1568780qvU)) {
            return false;
        }
        C1568780qvU c1568780qvU = (C1568780qvU) obj;
        return Intrinsics.LJFF(this.LIZ, c1568780qvU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1568780qvU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1568780qvU.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1568780qvU.LIZLLL) && Intrinsics.LJFF(this.LJ, c1568780qvU.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplayParams(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", orderCreateTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(C1568780qvU c1568780qvU) {
        if (Intrinsics.LJFF(this.LIZIZ, c1568780qvU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1568780qvU.LIZJ)) {
            return true;
        }
        return false;
    }

    public C1568780qvU(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
