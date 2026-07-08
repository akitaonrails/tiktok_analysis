package X;

import android.os.Debug;
import android.os.SystemClock;

/* JADX INFO: renamed from: X.0WS6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WS6 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public final void LIZ() {
        if (this.LIZ == 0) {
            return;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long jThreadCpuTimeNanos = Debug.threadCpuTimeNanos();
        this.LIZIZ += jElapsedRealtimeNanos - this.LIZ;
        this.LIZLLL += jThreadCpuTimeNanos - this.LIZJ;
        this.LIZ = 0L;
        this.LIZJ = 0L;
    }
}
