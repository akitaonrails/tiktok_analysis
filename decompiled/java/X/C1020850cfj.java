package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020850cfj {
    public final int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public Boolean LIZLLL;
    public String LJ;
    public Long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020850cfj)) {
            return false;
        }
        C1020850cfj c1020850cfj = (C1020850cfj) obj;
        return this.LIZ == c1020850cfj.LIZ && Intrinsics.LJFF(this.LIZIZ, c1020850cfj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1020850cfj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1020850cfj.LIZLLL) && Intrinsics.LJFF(this.LJ, c1020850cfj.LJ) && Intrinsics.LJFF(this.LJFF, c1020850cfj.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Boolean bool = this.LIZLLL;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJFF;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgenOneBigThreeSmallSlotReportState(imageIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reportedCycleId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1020850cfj(int i) {
        this(i, "", "", null, null, null);
    }

    public C1020850cfj(int i, String str, String str2, Boolean bool, String str3, Long l) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = bool;
        this.LJ = str3;
        this.LJFF = l;
    }
}
