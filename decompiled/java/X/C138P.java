package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.138P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C138P {
    public final C138F LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public static C138P LIZ() {
        C138P c138p = new C138P();
        c138p.LIZLLL();
        return c138p;
    }

    public final void LIZJ() {
        this.LIZJ = 0L;
        this.LIZIZ = false;
    }

    public final void LIZLLL() {
        C19864312np.LJIILIIL("This stopwatch is already running.", !this.LIZIZ);
        this.LIZIZ = true;
        this.LIZLLL = this.LIZ.LIZ();
    }

    public final void LJ() {
        long jLIZ = this.LIZ.LIZ();
        C19864312np.LJIILIIL("This stopwatch is already stopped.", this.LIZIZ);
        this.LIZIZ = false;
        this.LIZJ += jLIZ - this.LIZLLL;
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
        switch (C757880ToA.LIZ[timeUnit.ordinal()]) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(strK4).length() + 1 + str.length());
        sb.append(strK4);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }

    public C138P() {
        this.LIZ = C138F.LIZ;
    }

    public C138P(C1411880mqQ c1411880mqQ) {
        C19864312np.LJI(c1411880mqQ, "ticker");
        this.LIZ = c1411880mqQ;
    }

    public final long LIZIZ(TimeUnit timeUnit) {
        long jLIZ;
        if (this.LIZIZ) {
            jLIZ = (this.LIZ.LIZ() - this.LIZLLL) + this.LIZJ;
        } else {
            jLIZ = this.LIZJ;
        }
        return timeUnit.convert(jLIZ, TimeUnit.NANOSECONDS);
    }
}
