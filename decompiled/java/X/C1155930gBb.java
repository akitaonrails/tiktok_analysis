package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155930gBb extends AbstractC1155920gBa {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final C1613010s4p LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155930gBb)) {
            return false;
        }
        C1155930gBb c1155930gBb = (C1155930gBb) obj;
        return this.LIZ == c1155930gBb.LIZ && this.LIZIZ == c1155930gBb.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1155930gBb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1155930gBb.LIZLLL) && Intrinsics.LJFF(this.LJ, c1155930gBb.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        C1613010s4p c1613010s4p = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c1613010s4p == null ? 0 : c1613010s4p.hashCode())) * 31;
        Integer num = this.LJ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapError(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", detailCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", episodePurchaseParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resultStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1155930gBb(int i, int i2, String str, Integer num, int i3) {
        this(i, i2, str, (C1613010s4p) null, (i3 & 16) != 0 ? null : num);
    }

    public C1155930gBb(int i, int i2, String str, C1613010s4p c1613010s4p, Integer num) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = c1613010s4p;
        this.LJ = num;
    }
}
