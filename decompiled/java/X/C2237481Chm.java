package X;

import com.ss.android.ugc.aweme.experiment.TouchIntentClassStats;
import com.ss.android.ugc.aweme.experiment.TouchIntentModelSnapshot;

/* JADX INFO: renamed from: X.1Chm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237481Chm {
    public static final /* synthetic */ int LIZLLL = 0;
    public TouchIntentModelSnapshot LIZ;
    public final C1910907e7 LIZIZ;
    public final C1910907e7 LIZJ;

    public C2237481Chm(TouchIntentModelSnapshot touchIntentModelSnapshot) {
        this.LIZ = touchIntentModelSnapshot;
        this.LIZIZ = LIZIZ(touchIntentModelSnapshot.click);
        this.LIZJ = LIZIZ(this.LIZ.swipe);
    }

    public final C1910907e7 LIZIZ(TouchIntentClassStats touchIntentClassStats) {
        return new C1910907e7(Math.max(touchIntentClassStats.varX, this.LIZ.minVariance) * ((double) touchIntentClassStats.count), Math.max(touchIntentClassStats.varY, this.LIZ.minVariance) * ((double) touchIntentClassStats.count));
    }

    public final double LIZ(double d, double d2, double d3) {
        double dMax = Math.max(d3, this.LIZ.minVariance) + this.LIZ.varSmoothing;
        double d4 = d - d2;
        return (Math.log(6.283185307179586d * dMax) * (-0.5d)) - ((d4 * d4) / (((double) 2) * dMax));
    }

    public final TouchIntentClassStats LIZJ(TouchIntentClassStats touchIntentClassStats, C1910907e7 c1910907e7, double d, double d2) {
        double dMax;
        double dMax2;
        int i = touchIntentClassStats.count + 1;
        double d3 = touchIntentClassStats.meanX;
        double d4 = d - d3;
        double d5 = i;
        double d6 = (d4 / d5) + d3;
        double d7 = c1910907e7.LIZ + (d4 * (d - d6));
        c1910907e7.LIZ = d7;
        double d8 = touchIntentClassStats.meanY;
        double d9 = d2 - d8;
        double d10 = (d9 / d5) + d8;
        c1910907e7.LIZIZ += d9 * (d2 - d10);
        if (i <= 0) {
            dMax = this.LIZ.minVariance;
        } else {
            dMax = Math.max(d7 / d5, this.LIZ.minVariance);
        }
        double d11 = c1910907e7.LIZIZ;
        if (i <= 0) {
            dMax2 = this.LIZ.minVariance;
        } else {
            dMax2 = Math.max(d11 / d5, this.LIZ.minVariance);
        }
        return TouchIntentClassStats.LIZ(touchIntentClassStats, i, 0.0d, d6, d10, dMax, dMax2, 2);
    }
}
