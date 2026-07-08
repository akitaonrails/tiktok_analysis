package X;

/* JADX INFO: renamed from: X.0eRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088750eRF {
    public final int LIZ = 7;
    public final int LIZIZ = 73;
    public final int LIZJ = 269;
    public final long LIZLLL = 2900;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1088750eRF)) {
            return false;
        }
        C1088750eRF c1088750eRF = (C1088750eRF) obj;
        return this.LIZ == c1088750eRF.LIZ && this.LIZIZ == c1088750eRF.LIZIZ && this.LIZJ == c1088750eRF.LIZJ && this.LIZLLL == c1088750eRF.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudienceRankBuyerGuideNotifyInfo(component=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", biz=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
