package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906210Zgp {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C906210Zgp)) {
            return false;
        }
        C906210Zgp c906210Zgp = (C906210Zgp) obj;
        return Intrinsics.LJFF(this.LIZ, c906210Zgp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c906210Zgp.LIZIZ) && this.LIZJ == c906210Zgp.LIZJ && this.LIZLLL == c906210Zgp.LIZLLL && Intrinsics.LJFF(this.LJ, c906210Zgp.LJ) && Intrinsics.LJFF(this.LJFF, c906210Zgp.LJFF) && Intrinsics.LJFF(this.LJI, c906210Zgp.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJFF;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LJI;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamingRequestData(businessType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyClientMessageId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startSeqId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sendClientMessageId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sendServerMessageId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C906210Zgp(int i, long j, Long l, String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = j;
        this.LJ = str3;
        this.LJFF = l;
        this.LJI = str4;
    }
}
