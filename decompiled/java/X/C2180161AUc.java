package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180161AUc {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final Integer LJFF;
    public final String LJI;
    public Long LJII = null;
    public boolean LJIIIIZZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2180161AUc)) {
            return false;
        }
        C2180161AUc c2180161AUc = (C2180161AUc) obj;
        return this.LIZ == c2180161AUc.LIZ && Intrinsics.LJFF(this.LIZIZ, c2180161AUc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2180161AUc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2180161AUc.LIZLLL) && this.LJ == c2180161AUc.LJ && Intrinsics.LJFF(this.LJFF, c2180161AUc.LJFF) && Intrinsics.LJFF(this.LJI, c2180161AUc.LJI) && Intrinsics.LJFF(this.LJII, c2180161AUc.LJII) && this.LJIIIIZZ == c2180161AUc.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        Integer num = this.LJFF;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJI;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LJII;
        return ((iHashCode4 + (l != null ? l.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageEntry(pageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", expectedParentId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", expectedParentName=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", stateSavedTime=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isBackPressTriggered=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2180161AUc(int i, String str, String str2, String str3, long j, Integer num, String str4) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = j;
        this.LJFF = num;
        this.LJI = str4;
    }
}
