package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04y3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1270104y3 {
    public static final /* synthetic */ int LJI = 0;
    public final Long LIZ;
    public final Long LIZIZ;
    public final boolean LIZJ;
    public final Long LIZLLL;
    public final boolean LJ;
    public final Boolean LJFF;

    public C1270104y3() {
        this(null, false, null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1270104y3)) {
            return false;
        }
        C1270104y3 c1270104y3 = (C1270104y3) obj;
        return Intrinsics.LJFF(this.LIZ, c1270104y3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1270104y3.LIZIZ) && this.LIZJ == c1270104y3.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1270104y3.LIZLLL) && this.LJ == c1270104y3.LJ && Intrinsics.LJFF(this.LJFF, c1270104y3.LJFF);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Long l3 = this.LIZLLL;
        int iHashCode3 = (((iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Boolean bool = this.LJFF;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LongNumberFilter(equals=");
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

    public C1270104y3(Long l, boolean z, Long l2, boolean z2, int i) {
        l = (i & 2) != 0 ? null : l;
        z = (i & 4) != 0 ? false : z;
        l2 = (i & 8) != 0 ? null : l2;
        z2 = (i & 16) != 0 ? false : z2;
        this.LIZ = null;
        this.LIZIZ = l;
        this.LIZJ = z;
        this.LIZLLL = l2;
        this.LJ = z2;
        this.LJFF = null;
    }
}
