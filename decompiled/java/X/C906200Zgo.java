package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906200Zgo {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final Long LJ = null;
    public final String LJFF;
    public final Long LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C906200Zgo)) {
            return false;
        }
        C906200Zgo c906200Zgo = (C906200Zgo) obj;
        return Intrinsics.LJFF(this.LIZ, c906200Zgo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c906200Zgo.LIZIZ) && this.LIZJ == c906200Zgo.LIZJ && this.LIZLLL == c906200Zgo.LIZLLL && Intrinsics.LJFF(this.LJ, c906200Zgo.LJ) && Intrinsics.LJFF(this.LJFF, c906200Zgo.LJFF) && Intrinsics.LJFF(this.LJI, c906200Zgo.LJI) && Intrinsics.LJFF(this.LJII, c906200Zgo.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31;
        Long l = this.LJ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.LJI;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.LJII;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamingInterruptRequestData(businessType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyClientMessageId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", interruptedSeqId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", replyServerMessageId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sendClientMessageId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", sendServerMessageId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C906200Zgo(String str, String str2, long j, int i, String str3, Long l, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJFF = str3;
        this.LJI = l;
        this.LJII = str4;
    }
}
