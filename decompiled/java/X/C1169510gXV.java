package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gXV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169510gXV implements InterfaceC447510Hgj {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final Integer LJFF;

    public C1169510gXV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1169510gXV)) {
            return false;
        }
        C1169510gXV c1169510gXV = (C1169510gXV) obj;
        return this.LIZ == c1169510gXV.LIZ && Intrinsics.LJFF(this.LIZIZ, c1169510gXV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1169510gXV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1169510gXV.LIZLLL) && this.LJ == c1169510gXV.LJ && Intrinsics.LJFF(this.LJFF, c1169510gXV.LJFF);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LJ) * 31;
        Integer num = this.LJFF;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPlayListNameFragmentData(openFragmentType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mixId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", defaultName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mixLabel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", playlistPostCnt=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1169510gXV(int i) {
        this(null, 1, null, null, null, 0);
    }

    public C1169510gXV(String str, int i, Integer num, String str2, String str3, int i2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i2;
        this.LJFF = num;
    }
}
