package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889207ac {
    public final int LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final boolean LJFF;
    public final int LJI;
    public final String LJII;
    public final Integer LJIIIIZZ;

    public C1889207ac() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889207ac)) {
            return false;
        }
        C1889207ac c1889207ac = (C1889207ac) obj;
        return this.LIZ == c1889207ac.LIZ && this.LIZIZ == c1889207ac.LIZIZ && this.LIZJ == c1889207ac.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1889207ac.LIZLLL) && Intrinsics.LJFF(this.LJ, c1889207ac.LJ) && this.LJFF == c1889207ac.LJFF && this.LJI == c1889207ac.LJI && Intrinsics.LJFF(this.LJII, c1889207ac.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1889207ac.LJIIIIZZ);
    }

    public final int hashCode() {
        int iZ2 = ((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        Integer num = this.LIZLLL;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        int iHashCode2 = (((((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI) * 31;
        String str = this.LJII;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.LJIIIIZZ;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmbQualificationState(optInStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasQualification=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", activeSkuCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", kybVerificationStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", kycVerificationStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", inBlockIndustryCoolingDown=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", revokeReason=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", inferredIndustryType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", selectedIndustryType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1889207ac(int i) {
        this(0, false, 0L, null, null, false, 0, null, null);
    }

    public static C1889207ac LIZ(C1889207ac c1889207ac, int i, long j, int i2) {
        boolean z;
        Integer num;
        Integer num2;
        boolean z2;
        int i3;
        String str;
        long j2 = j;
        int i4 = i;
        if ((i2 & 1) != 0) {
            i4 = c1889207ac.LIZ;
        }
        if ((i2 & 2) != 0) {
            z = c1889207ac.LIZIZ;
        } else {
            z = false;
        }
        if ((i2 & 4) != 0) {
            j2 = c1889207ac.LIZJ;
        }
        Integer num3 = null;
        if ((i2 & 8) != 0) {
            num = c1889207ac.LIZLLL;
        } else {
            num = null;
        }
        if ((i2 & 16) != 0) {
            num2 = c1889207ac.LJ;
        } else {
            num2 = null;
        }
        if ((i2 & 32) != 0) {
            z2 = c1889207ac.LJFF;
        } else {
            z2 = false;
        }
        if ((i2 & 64) != 0) {
            i3 = c1889207ac.LJI;
        } else {
            i3 = 0;
        }
        if ((i2 & 128) != 0) {
            str = c1889207ac.LJII;
        } else {
            str = null;
        }
        if ((i2 & 256) != 0) {
            num3 = c1889207ac.LJIIIIZZ;
        }
        return new C1889207ac(i4, z, j2, num, num2, z2, i3, str, num3);
    }

    public C1889207ac(int i, boolean z, long j, Integer num, Integer num2, boolean z2, int i2, String str, Integer num3) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = z2;
        this.LJI = i2;
        this.LJII = str;
        this.LJIIIIZZ = num3;
    }
}
