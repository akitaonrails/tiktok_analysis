package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0NXG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NXG {
    public final C595330NWp LIZ;
    public final C0NXT LIZIZ;
    public final C595680NXy LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C0NXI(this));

    public final boolean LIZ(C0NXK c0nxk) {
        long j;
        if (c0nxk == null) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(c0nxk.LIZJ);
        long millis2 = timeUnit.toMillis(c0nxk.LIZIZ);
        if (C595320NWo.LIZ(this.LIZ).LJIIIIZZ && millis > millis2) {
            j = C595320NWo.LIZ(this.LIZ).LJII;
        } else {
            millis = millis2;
            j = C595320NWo.LIZ(this.LIZ).LJI;
        }
        long jLIZ = ((C0NXF) this.LIZLLL.getValue()).LIZ();
        if (millis > jLIZ || jLIZ > millis + j) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(C0NXK c0nxk, Long l) {
        if (l == null) {
            return true;
        }
        long jLIZ = ((C0NXF) this.LIZLLL.getValue()).LIZ();
        if (jLIZ < l.longValue()) {
            return false;
        }
        if (LIZ(c0nxk)) {
            if (jLIZ - l.longValue() > C595320NWo.LIZ(this.LIZ).LIZJ) {
                return true;
            }
            return false;
        }
        if (jLIZ - l.longValue() > C595320NWo.LIZ(this.LIZ).LIZLLL) {
            return true;
        }
        return false;
    }

    public C0NXG(C595330NWp c595330NWp, C0NXT c0nxt, C595680NXy c595680NXy) {
        this.LIZ = c595330NWp;
        this.LIZIZ = c0nxt;
        this.LIZJ = c595680NXy;
    }
}
