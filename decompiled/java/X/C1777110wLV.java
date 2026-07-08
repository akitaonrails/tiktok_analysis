package X;

/* JADX INFO: renamed from: X.0wLV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777110wLV implements InterfaceC1785520wZ4 {
    public final int LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777110wLV)) {
            return false;
        }
        C1777110wLV c1777110wLV = (C1777110wLV) obj;
        return this.LIZ == c1777110wLV.LIZ && this.LIZIZ == c1777110wLV.LIZIZ && this.LIZJ == c1777110wLV.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchRecommendPrivacyConfirmed(rankType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dontShowAgain=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777110wLV(int i, long j, boolean z) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = z;
    }
}
