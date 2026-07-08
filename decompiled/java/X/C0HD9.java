package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HD9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HD9 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C0HD9() {
        this(false, 0, null, null, false, false, false, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HD9)) {
            return false;
        }
        C0HD9 c0hd9 = (C0HD9) obj;
        return this.LIZ == c0hd9.LIZ && this.LIZIZ == c0hd9.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0hd9.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0hd9.LIZLLL) && this.LJ == c0hd9.LJ && this.LJFF == c0hd9.LJFF && this.LJI == c0hd9.LJI;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentRepostInfo(hasMyRepost=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalRepostCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", myRepostId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstOtherReposterNickname=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasNote=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isFakeFromNotice=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isPrePublish=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HD9(boolean z, int i, String str, String str2, boolean z2, boolean z3, boolean z4, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        i = (i2 & 2) != 0 ? 0 : i;
        str = (i2 & 4) != 0 ? null : str;
        str2 = (i2 & 8) != 0 ? null : str2;
        z2 = (i2 & 16) != 0 ? false : z2;
        z3 = (i2 & 32) != 0 ? false : z3;
        z4 = (i2 & 64) != 0 ? false : z4;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
    }
}
