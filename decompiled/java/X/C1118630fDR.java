package X;

/* JADX INFO: renamed from: X.0fDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118630fDR {
    public final int LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1118630fDR)) {
            return false;
        }
        C1118630fDR c1118630fDR = (C1118630fDR) obj;
        return this.LIZ == c1118630fDR.LIZ && this.LIZIZ == c1118630fDR.LIZIZ && this.LIZJ == c1118630fDR.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsRankingSuggestMatchFreqState(seenLaunchCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickedWithinFirst3=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastRoomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1118630fDR(int i, long j, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = j;
    }
}
