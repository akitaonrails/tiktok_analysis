package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wV1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783010wV1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL = null;
    public boolean LJ = false;
    public int LJFF = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1783010wV1)) {
            return false;
        }
        C1783010wV1 c1783010wV1 = (C1783010wV1) obj;
        return Intrinsics.LJFF(this.LIZ, c1783010wV1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1783010wV1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1783010wV1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1783010wV1.LIZLLL) && this.LJ == c1783010wV1.LJ && this.LJFF == c1783010wV1.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsOnboardingIdentityOption(imagePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", benefit=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1783010wV1(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
