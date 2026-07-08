package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0wZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1786050wZv implements InterfaceC197023126r {
    public static long LIZIZ;
    public final long LIZ;

    public abstract void LIZIZ();

    @Override // X.InterfaceC197023126r
    public final void LIZ() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - LIZIZ > this.LIZ) {
            LIZIZ = jUptimeMillis;
            LIZIZ();
        }
    }

    public AbstractC1786050wZv(long j) {
        this.LIZ = j;
    }
}
