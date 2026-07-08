package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180171AUd {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final Long LJFF;
    public final Integer LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2180171AUd)) {
            return false;
        }
        C2180171AUd c2180171AUd = (C2180171AUd) obj;
        return this.LIZ == c2180171AUd.LIZ && Intrinsics.LJFF(this.LIZIZ, c2180171AUd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2180171AUd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2180171AUd.LIZLLL) && this.LJ == c2180171AUd.LJ && Intrinsics.LJFF(this.LJFF, c2180171AUd.LJFF) && Intrinsics.LJFF(this.LJI, c2180171AUd.LJI) && Intrinsics.LJFF(this.LJII, c2180171AUd.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        Long l = this.LJFF;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LJI;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJII;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReclaimedRecord(pageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reclaimTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stateSavedTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", expectedParentId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", expectedParentName=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2180171AUd(int i, String str, String str2, String str3, long j, Long l, Integer num, String str4) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = j;
        this.LJFF = l;
        this.LJI = num;
        this.LJII = str4;
    }
}
