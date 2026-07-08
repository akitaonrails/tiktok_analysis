package X;

import com.ss.android.ugc.aweme.experiment.TouchIntentClassStats;
import com.ss.android.ugc.aweme.experiment.TouchIntentClassStatsParams;

/* JADX INFO: renamed from: X.1Cho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237501Cho {
    public static final TouchIntentClassStats LIZ(TouchIntentClassStatsParams touchIntentClassStatsParams) {
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6 = touchIntentClassStatsParams.prior;
        if (d6 != null) {
            double dDoubleValue = d6.doubleValue();
            Double d7 = touchIntentClassStatsParams.meanX;
            if (d7 != null) {
                double dDoubleValue2 = d7.doubleValue();
                Double d8 = touchIntentClassStatsParams.meanY;
                if (d8 != null) {
                    double dDoubleValue3 = d8.doubleValue();
                    Double d9 = touchIntentClassStatsParams.varX;
                    if (d9 != null) {
                        double dDoubleValue4 = d9.doubleValue();
                        Double d10 = touchIntentClassStatsParams.varY;
                        if (d10 != null) {
                            double dDoubleValue5 = d10.doubleValue();
                            if (touchIntentClassStatsParams.count <= 0 || (d = touchIntentClassStatsParams.prior) == null || !TouchIntentClassStatsParams.LIZ(d.doubleValue()) || (d2 = touchIntentClassStatsParams.meanX) == null || !TouchIntentClassStatsParams.LIZ(d2.doubleValue()) || (d3 = touchIntentClassStatsParams.meanY) == null || !TouchIntentClassStatsParams.LIZ(d3.doubleValue()) || (d4 = touchIntentClassStatsParams.varX) == null || !TouchIntentClassStatsParams.LIZ(d4.doubleValue()) || (d5 = touchIntentClassStatsParams.varY) == null || !TouchIntentClassStatsParams.LIZ(d5.doubleValue()) || touchIntentClassStatsParams.prior.doubleValue() < 0.0d || touchIntentClassStatsParams.varX.doubleValue() <= 0.0d || touchIntentClassStatsParams.varY.doubleValue() <= 0.0d) {
                                return null;
                            }
                            return new TouchIntentClassStats(touchIntentClassStatsParams.count, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5);
                        }
                    }
                }
            }
        }
        return null;
    }
}
