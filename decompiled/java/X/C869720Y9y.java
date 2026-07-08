package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869720Y9y {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;
    public final Boolean LJFF;
    public final List<Integer> LJI;
    public final List<Integer> LJII;

    public C869720Y9y() {
        this(null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869720Y9y)) {
            return false;
        }
        C869720Y9y c869720Y9y = (C869720Y9y) obj;
        return Intrinsics.LJFF(this.LIZ, c869720Y9y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c869720Y9y.LIZIZ) && this.LIZJ == c869720Y9y.LIZJ && Intrinsics.LJFF(this.LIZLLL, c869720Y9y.LIZLLL) && this.LJ == c869720Y9y.LJ && Intrinsics.LJFF(this.LJFF, c869720Y9y.LJFF) && Intrinsics.LJFF(this.LJI, c869720Y9y.LJI) && Intrinsics.LJFF(this.LJII, c869720Y9y.LJII);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Integer num3 = this.LIZLLL;
        int iHashCode3 = (((iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Boolean bool = this.LJFF;
        return ((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntNumberFilter(equals=");
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
        sbLIZ.append(", anyOf=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", noneOf=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return (this.LIZ == null && this.LIZIZ == null && this.LIZLLL == null && this.LJFF == null && !(this.LJI.isEmpty() ^ true) && !(this.LJII.isEmpty() ^ true)) ? false : true;
    }

    public C869720Y9y(Integer num, List list, int i) {
        this((i & 1) != 0 ? null : num, null, false, null, false, null, (i & 64) != 0 ? C13BV.INSTANCE : null, (i & 128) != 0 ? C13BV.INSTANCE : list);
    }

    public C869720Y9y(Integer num, Integer num2, boolean z, Integer num3, boolean z2, Boolean bool, List<Integer> list, List<Integer> list2) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = z;
        this.LIZLLL = num3;
        this.LJ = z2;
        this.LJFF = bool;
        this.LJI = list;
        this.LJII = list2;
    }
}
