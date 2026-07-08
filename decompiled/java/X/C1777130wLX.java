package X;

/* JADX INFO: renamed from: X.0wLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777130wLX implements InterfaceC1785530wZ5 {
    public final int LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777130wLX)) {
            return false;
        }
        C1777130wLX c1777130wLX = (C1777130wLX) obj;
        return this.LIZ == c1777130wLX.LIZ && this.LIZIZ == c1777130wLX.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowMatchRecommendPrivacyConfirm(rankType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777130wLX(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
