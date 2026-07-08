package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P9H, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9H {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P9H)) {
            return false;
        }
        C0P9H c0p9h = (C0P9H) obj;
        return Intrinsics.LJFF(this.LIZ, c0p9h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0p9h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0p9h.LIZJ) && this.LIZLLL == c0p9h.LIZLLL && this.LJ == c0p9h.LJ && Intrinsics.LJFF(this.LJFF, c0p9h.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        String str2 = this.LJFF;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAdAttributionContext(searchSessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickRefer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastCreativeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clickTimestamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", searchStartTimestamp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", prefetchType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0P9H(long j, long j2, String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = str4;
    }
}
