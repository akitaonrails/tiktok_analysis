package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03OV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OV {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C03OV() {
        this(null, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03OV)) {
            return false;
        }
        C03OV c03ov = (C03OV) obj;
        return Intrinsics.LJFF(this.LIZ, c03ov.LIZ) && this.LIZIZ == c03ov.LIZIZ && Intrinsics.LJFF(this.LIZJ, c03ov.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c03ov.LIZLLL) && Intrinsics.LJFF(this.LJ, c03ov.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelfCollectionTrackingParam(shippingAddressL1=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasPickupAddress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", method=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pickupDistance=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C03OV(String str, boolean z, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, null, null, null);
    }

    public C03OV(String str, boolean z, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }

    public static C03OV LIZ(C03OV c03ov, String str, String str2, String str3, int i) {
        String str4;
        boolean z;
        String str5 = str3;
        String str6 = str2;
        String str7 = str;
        if ((i & 1) != 0) {
            str4 = c03ov.LIZ;
        } else {
            str4 = null;
        }
        if ((i & 2) != 0) {
            z = c03ov.LIZIZ;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            str7 = c03ov.LIZJ;
        }
        if ((i & 8) != 0) {
            str6 = c03ov.LIZLLL;
        }
        if ((i & 16) != 0) {
            str5 = c03ov.LJ;
        }
        return new C03OV(str4, z, str7, str6, str5);
    }
}
