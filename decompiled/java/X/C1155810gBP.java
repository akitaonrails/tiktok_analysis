package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155810gBP {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155810gBP)) {
            return false;
        }
        C1155810gBP c1155810gBP = (C1155810gBP) obj;
        return Intrinsics.LJFF(this.LIZ, c1155810gBP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1155810gBP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1155810gBP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1155810gBP.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RawCoverEntry(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resizeWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resizeHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155810gBP(String str, String str2, Integer num, Integer num2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = num2;
    }
}
