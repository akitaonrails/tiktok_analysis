package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905350ZfR {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final Long LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C905350ZfR)) {
            return false;
        }
        C905350ZfR c905350ZfR = (C905350ZfR) obj;
        return Intrinsics.LJFF(this.LIZ, c905350ZfR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c905350ZfR.LIZIZ) && this.LIZJ == c905350ZfR.LIZJ && Intrinsics.LJFF(this.LIZLLL, c905350ZfR.LIZLLL) && Intrinsics.LJFF(this.LJ, c905350ZfR.LJ) && Intrinsics.LJFF(this.LJFF, c905350ZfR.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJ;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LJFF;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertAndStreamConfig(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyClientMessageUuid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sendClientMessageId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sendServerMessageId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C905350ZfR(String str, String str2, long j, String str3, Long l, String str4, int i) {
        str3 = (i & 8) != 0 ? null : str3;
        l = (i & 16) != 0 ? null : l;
        str4 = (i & 32) != 0 ? null : str4;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = str3;
        this.LJ = l;
        this.LJFF = str4;
    }
}
