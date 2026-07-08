package X;

import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;

/* JADX INFO: renamed from: X.0pQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511100pQS {
    public final String LIZ;
    public final OnePlaytimePredictConfig LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(scene='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', isRunning=");
        sbLIZ.append(false);
        sbLIZ.append(", runCount:");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", skipFeedCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", skipTimes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastRunTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", config:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1511100pQS(String str, OnePlaytimePredictConfig onePlaytimePredictConfig) {
        this.LIZ = str;
        this.LIZIZ = onePlaytimePredictConfig;
    }
}
