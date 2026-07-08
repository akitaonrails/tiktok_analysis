package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689590R3d {
    public Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;

    public C689590R3d() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C689590R3d)) {
            return false;
        }
        C689590R3d c689590R3d = (C689590R3d) obj;
        return Intrinsics.LJFF(this.LIZ, c689590R3d.LIZ) && Intrinsics.LJFF(this.LIZIZ, c689590R3d.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c689590R3d.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPlaceholderSourceLocateInfo(indexOfSameComponent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", indexOfMixComponent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", prefixCharCountOfComponent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C689590R3d(Integer num, Integer num2, Integer num3, int i) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        num3 = (i & 4) != 0 ? null : num3;
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
    }
}
