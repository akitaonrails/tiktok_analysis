package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.065O, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C065O {
    public final String LIZ;
    public final Double LIZIZ;
    public final Long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C065O)) {
            return false;
        }
        C065O c065o = (C065O) obj;
        return Intrinsics.LJFF(this.LIZ, c065o.LIZ) && Intrinsics.LJFF(this.LIZIZ, c065o.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c065o.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.LIZIZ;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.LIZJ;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RateRecord(itemId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        String str = this.LIZ;
        return (str == null || str.length() == 0 || this.LIZIZ == null || this.LIZJ == null) ? false : true;
    }

    public C065O(String str, Long l, Double d) {
        this.LIZ = str;
        this.LIZIZ = d;
        this.LIZJ = l;
    }
}
