package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145800fvG {
    public final long LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1145800fvG)) {
            return false;
        }
        C1145800fvG c1145800fvG = (C1145800fvG) obj;
        return this.LIZ == c1145800fvG.LIZ && Intrinsics.LJFF(this.LIZIZ, c1145800fvG.LIZIZ) && this.LIZJ == c1145800fvG.LIZJ && this.LIZLLL == c1145800fvG.LIZLLL && Intrinsics.LJFF(this.LJ, c1145800fvG.LJ) && Intrinsics.LJFF(this.LJFF, c1145800fvG.LJFF);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        Integer num = this.LJ;
        int iHashCode = (iY2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJFF;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardItemStatus(itemId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resourceDownloadTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resourceErrorCode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", imageSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1145800fvG(long j, String str, int i, int i2, Integer num, Integer num2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = num;
        this.LJFF = num2;
    }
}
