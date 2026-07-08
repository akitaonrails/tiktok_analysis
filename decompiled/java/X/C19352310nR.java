package X;

/* JADX INFO: renamed from: X.10nR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19352310nR {
    public String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public long LIZLLL;

    public C19352310nR() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisIaaAdsCountData(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", adClosedCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", adTotalClosedCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", adRecentClosedTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19352310nR(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = null;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = jCurrentTimeMillis;
    }
}
