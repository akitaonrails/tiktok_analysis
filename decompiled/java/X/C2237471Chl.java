package X;

import Y.ARunnableS134S0100000_34;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.experiment.TouchIntentClassStats;
import com.ss.android.ugc.aweme.experiment.TouchIntentModelSnapshot;
import java.util.Collections;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.1Chl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237471Chl implements InterfaceC1593160rYo {
    public static final Set<String> LJFF = Collections.singleton("PUBLISH");
    public final C2237481Chm LIZ;
    public final double LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public C224200tk LJ;

    @Override // X.InterfaceC1593160rYo
    public final void LIZLLL(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC1593160rYo
    public final void LIZ() {
        LJ(EnumC240800wQ.CLICK);
        this.LIZLLL.invoke();
    }

    @Override // X.InterfaceC1593160rYo
    public final void LIZIZ() {
        LJ(EnumC240800wQ.SWIPE);
    }

    public final void LJ(EnumC240800wQ enumC240800wQ) {
        TouchIntentClassStats touchIntentClassStatsLIZJ;
        TouchIntentClassStats touchIntentClassStatsLIZJ2;
        C224200tk c224200tk = this.LJ;
        if (c224200tk == null) {
            return;
        }
        C2237481Chm c2237481Chm = this.LIZ;
        double d = c224200tk.LIZ;
        double d2 = c224200tk.LIZIZ;
        c2237481Chm.getClass();
        if (enumC240800wQ == EnumC240800wQ.CLICK) {
            touchIntentClassStatsLIZJ = c2237481Chm.LIZJ(c2237481Chm.LIZ.click, c2237481Chm.LIZIZ, d, d2);
        } else {
            touchIntentClassStatsLIZJ = c2237481Chm.LIZ.click;
        }
        if (enumC240800wQ == EnumC240800wQ.SWIPE) {
            touchIntentClassStatsLIZJ2 = c2237481Chm.LIZJ(c2237481Chm.LIZ.swipe, c2237481Chm.LIZJ, d, d2);
        } else {
            touchIntentClassStatsLIZJ2 = c2237481Chm.LIZ.swipe;
        }
        int i = touchIntentClassStatsLIZJ.count;
        int i2 = touchIntentClassStatsLIZJ2.count + i;
        TouchIntentModelSnapshot touchIntentModelSnapshot = c2237481Chm.LIZ;
        double d3 = i;
        double d4 = i2;
        c2237481Chm.LIZ = new TouchIntentModelSnapshot(TouchIntentClassStats.LIZ(touchIntentClassStatsLIZJ, 0, d3 / d4, 0.0d, 0.0d, 0.0d, 0.0d, 61), TouchIntentClassStats.LIZ(touchIntentClassStatsLIZJ2, 0, ((double) touchIntentClassStatsLIZJ2.count) / d4, 0.0d, 0.0d, 0.0d, 0.0d, 61), i2, touchIntentModelSnapshot.minVariance, touchIntentModelSnapshot.varSmoothing, touchIntentModelSnapshot.version);
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS134S0100000_34(this.LIZ.LIZ, 41));
        this.LJ = null;
    }

    @Override // X.InterfaceC1593160rYo
    public final void LIZJ(int i, int i2, MotionEvent motionEvent) {
        boolean z;
        double dLIZJ;
        double d;
        EnumC240800wQ enumC240800wQ;
        if (i > 0 && i2 > 0) {
            Pair pair = new Pair(Double.valueOf(C13LZ.LIZJ(((double) motionEvent.getX()) / ((double) i), 0.0d, 1.0d)), Double.valueOf(C13LZ.LIZJ(((double) motionEvent.getY()) / ((double) i2), 0.0d, 1.0d)));
            C2237481Chm c2237481Chm = this.LIZ;
            double dDoubleValue = ((Number) pair.getFirst()).doubleValue();
            double dDoubleValue2 = ((Number) pair.getSecond()).doubleValue();
            double d2 = c2237481Chm.LIZ.click.prior;
            double d3 = 1.0E-12d;
            if (d2 < 1.0E-12d) {
                d2 = 1.0E-12d;
            }
            double dLog = Math.log(d2);
            TouchIntentClassStats touchIntentClassStats = c2237481Chm.LIZ.click;
            double dLIZ = dLog + c2237481Chm.LIZ(dDoubleValue, touchIntentClassStats.meanX, touchIntentClassStats.varX);
            TouchIntentClassStats touchIntentClassStats2 = c2237481Chm.LIZ.click;
            double dLIZ2 = dLIZ + c2237481Chm.LIZ(dDoubleValue2, touchIntentClassStats2.meanY, touchIntentClassStats2.varY);
            double d4 = c2237481Chm.LIZ.swipe.prior;
            if (d4 >= 1.0E-12d) {
                d3 = d4;
            }
            double dLog2 = Math.log(d3);
            TouchIntentClassStats touchIntentClassStats3 = c2237481Chm.LIZ.swipe;
            double dLIZ3 = dLog2 + c2237481Chm.LIZ(dDoubleValue, touchIntentClassStats3.meanX, touchIntentClassStats3.varX);
            TouchIntentClassStats touchIntentClassStats4 = c2237481Chm.LIZ.swipe;
            double dLIZ4 = dLIZ3 + c2237481Chm.LIZ(dDoubleValue2, touchIntentClassStats4.meanY, touchIntentClassStats4.varY);
            double dMax = Math.max(dLIZ2, dLIZ4);
            double dExp = Math.exp(dLIZ2 - dMax);
            double dExp2 = Math.exp(dLIZ4 - dMax);
            double d5 = dExp + dExp2;
            if (Math.abs(d5) <= Double.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            if (z && d5 > 0.0d) {
                dLIZJ = dExp / d5;
            } else {
                dLIZJ = C13LZ.LIZJ(c2237481Chm.LIZ.click.prior, 0.0d, 1.0d);
            }
            if (Math.abs(d5) <= Double.MAX_VALUE && d5 > 0.0d) {
                d = dExp2 / d5;
            } else {
                d = 1.0d - dLIZJ;
            }
            if (dLIZJ >= d) {
                enumC240800wQ = EnumC240800wQ.CLICK;
            } else {
                enumC240800wQ = EnumC240800wQ.SWIPE;
            }
            this.LJ = new C224200tk(((Number) pair.getFirst()).doubleValue(), ((Number) pair.getSecond()).doubleValue(), dLIZJ, d, enumC240800wQ);
            if (dLIZJ > this.LIZIZ) {
                ((Number) pair.getFirst()).doubleValue();
                ((Number) pair.getSecond()).doubleValue();
                this.LIZJ.invoke();
                return;
            }
            return;
        }
        this.LJ = null;
    }

    public C2237471Chl(C2237481Chm c2237481Chm, double d, AwS568S0100000_24 awS568S0100000_24, AwS568S0100000_24 awS568S0100000_242) {
        this.LIZ = c2237481Chm;
        this.LIZIZ = d;
        this.LIZJ = awS568S0100000_24;
        this.LIZLLL = awS568S0100000_242;
    }
}
