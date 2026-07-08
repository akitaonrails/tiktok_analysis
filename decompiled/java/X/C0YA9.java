package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YA9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YA9 {
    public final Double LIZ;
    public final Double LIZIZ;
    public final boolean LIZJ;
    public final Double LIZLLL;
    public final boolean LJ;
    public final Boolean LJFF;

    public C0YA9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YA9)) {
            return false;
        }
        C0YA9 c0ya9 = (C0YA9) obj;
        return Intrinsics.LJFF(this.LIZ, c0ya9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ya9.LIZIZ) && this.LIZJ == c0ya9.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0ya9.LIZLLL) && this.LJ == c0ya9.LJ && Intrinsics.LJFF(this.LJFF, c0ya9.LJFF);
    }

    public final int hashCode() {
        Double d = this.LIZ;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Double d3 = this.LIZLLL;
        int iHashCode3 = (((iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Boolean bool = this.LJFF;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DoubleNumberFilter(equals=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", greaterThan=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", greaterThanInclusive=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lessThan=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lessThanInclusive=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isNotNull=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return (this.LIZ == null && this.LIZIZ == null && this.LIZLLL == null && this.LJFF == null) ? false : true;
    }

    public C0YA9(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = null;
        this.LJ = false;
        this.LJFF = null;
    }
}
