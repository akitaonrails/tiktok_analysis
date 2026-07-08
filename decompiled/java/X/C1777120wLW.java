package X;

/* JADX INFO: renamed from: X.0wLW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777120wLW implements InterfaceC1785520wZ4 {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777120wLW)) {
            return false;
        }
        C1777120wLW c1777120wLW = (C1777120wLW) obj;
        return this.LIZ == c1777120wLW.LIZ && this.LIZIZ == c1777120wLW.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchRecommendClicked(rankType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777120wLW(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
