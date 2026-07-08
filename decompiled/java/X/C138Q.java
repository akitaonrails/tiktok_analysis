package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.138Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C138Q {
    public final C1BFT LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public final void LIZ() {
        if (!(!this.LIZIZ)) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.LIZIZ = true;
        this.LIZLLL = this.LIZ.LIZ();
    }

    public final String toString() {
        String str;
        long jLIZ = this.LIZIZ ? (this.LIZ.LIZ() - this.LIZLLL) + this.LIZJ : this.LIZJ;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jLIZ, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jLIZ, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jLIZ, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jLIZ, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jLIZ, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jLIZ, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String strK4 = C786410Ut5.k4(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(jLIZ / timeUnit2.convert(1L, timeUnit))});
        switch (C757870To9.LIZ[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return strK4 + " " + str;
    }

    public C138Q(C1BFT c1bft) {
        C19863812nk.LIZJ(c1bft, "ticker");
        this.LIZ = c1bft;
    }
}
