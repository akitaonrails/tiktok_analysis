package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PP4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PP4 {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PP4)) {
            return false;
        }
        C0PP4 c0pp4 = (C0PP4) obj;
        return this.LIZ == c0pp4.LIZ && Intrinsics.LJFF(this.LIZIZ, c0pp4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0pp4.LIZJ) && this.LIZLLL == c0pp4.LIZLLL && Intrinsics.LJFF(this.LJ, c0pp4.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLatestRequestRecord(requestTimestamp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", query=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resultCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PP4(int i, String str, String str2, long j, String str3) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = str3;
    }
}
