package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2Q {
    public long LIZ;

    public final void LIZ() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LIZ <= 0) {
                this.LIZ = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - this.LIZ >= 1000) {
                this.LIZ = jCurrentTimeMillis;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C0V2Q(boolean z) {
    }
}
