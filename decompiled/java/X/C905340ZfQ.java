package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905340ZfQ {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final InterfaceC905380ZfU LIZLLL;
    public final Long LJ = null;
    public final String LJFF = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C905340ZfQ)) {
            return false;
        }
        C905340ZfQ c905340ZfQ = (C905340ZfQ) obj;
        return Intrinsics.LJFF(this.LIZ, c905340ZfQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c905340ZfQ.LIZIZ) && this.LIZJ == c905340ZfQ.LIZJ && Intrinsics.LJFF(this.LIZLLL, c905340ZfQ.LIZLLL) && Intrinsics.LJFF(this.LJ, c905340ZfQ.LJ) && Intrinsics.LJFF(this.LJFF, c905340ZfQ.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31;
        Long l = this.LJ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LJFF;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendAndStreamConfig(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyClientMessageUuid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sendMessageRequest=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C905340ZfQ(String str, String str2, long j, InterfaceC905380ZfU interfaceC905380ZfU) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = interfaceC905380ZfU;
    }
}
