package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YT0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YT0 {
    public final C861890XrX LIZ;
    public final C1785380wYq LIZIZ;
    public final boolean LIZJ;
    public final AbstractC874970YUd LIZLLL;
    public final C874670YSz LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YT0)) {
            return false;
        }
        C0YT0 c0yt0 = (C0YT0) obj;
        return Intrinsics.LJFF(this.LIZ, c0yt0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yt0.LIZIZ) && this.LIZJ == c0yt0.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0yt0.LIZLLL) && Intrinsics.LJFF(this.LJ, c0yt0.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1785380wYq c1785380wYq = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (c1785380wYq == null ? 0 : c1785380wYq.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        AbstractC874970YUd abstractC874970YUd = this.LIZLLL;
        return ((iHashCode2 + (abstractC874970YUd != null ? abstractC874970YUd.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankingPageResult(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", debugInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YT0(C861890XrX c861890XrX, C1785380wYq c1785380wYq, boolean z, AbstractC874970YUd abstractC874970YUd, C874670YSz c874670YSz) {
        this.LIZ = c861890XrX;
        this.LIZIZ = c1785380wYq;
        this.LIZJ = z;
        this.LIZLLL = abstractC874970YUd;
        this.LJ = c874670YSz;
    }
}
