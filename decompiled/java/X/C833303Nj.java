package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C833303Nj {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;

    public C833303Nj() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C833303Nj)) {
            return false;
        }
        C833303Nj c833303Nj = (C833303Nj) obj;
        return Intrinsics.LJFF(this.LIZ, c833303Nj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c833303Nj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c833303Nj.LIZJ);
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
        sbLIZ.append("BackgroundVO(backgroundAttrColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dividerAttrColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dividerWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C833303Nj(Integer num, Integer num2, Integer num3) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
    }
}
