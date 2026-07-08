package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738700vLY {
    public final Double LIZ;
    public final Double LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1738700vLY)) {
            return false;
        }
        C1738700vLY c1738700vLY = (C1738700vLY) obj;
        return Intrinsics.LJFF(this.LIZ, c1738700vLY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1738700vLY.LIZIZ);
    }

    public final int hashCode() {
        Double d = this.LIZ;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.LIZIZ;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECLocationInfo(longitude=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", latitude=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1738700vLY(Double d, Double d2) {
        this.LIZ = d;
        this.LIZIZ = d2;
    }
}
