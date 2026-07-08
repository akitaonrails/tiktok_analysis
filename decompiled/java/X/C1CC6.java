package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.1CC6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1CC6 extends C0K04 {
    public long LIZ;
    public long LIZIZ;

    public void LJIIL(int i, String str) {
    }

    public void LJIILIIL() {
    }

    public void LJIILJJIL(int i, String str) {
    }

    public void LJIILL() {
    }

    public final long LJIIJ() {
        long jUptimeMillis = this.LIZIZ > 0 ? SystemClock.uptimeMillis() - this.LIZIZ : 0L;
        this.LIZIZ = 0L;
        return jUptimeMillis;
    }

    public final long LJIIJJI() {
        long jUptimeMillis = this.LIZ > 0 ? SystemClock.uptimeMillis() - this.LIZ : 0L;
        this.LIZ = 0L;
        return jUptimeMillis;
    }
}
