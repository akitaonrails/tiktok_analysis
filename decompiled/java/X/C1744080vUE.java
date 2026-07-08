package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744080vUE {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1744080vUE)) {
            return false;
        }
        C1744080vUE c1744080vUE = (C1744080vUE) obj;
        return Intrinsics.LJFF(this.LIZ, c1744080vUE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1744080vUE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1744080vUE.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UseMyLocationPayload(encryptedLongitude=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", encryptedLatitude=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", gpsAccuracyLevel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1744080vUE(String str, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
    }
}
