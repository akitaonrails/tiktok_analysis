package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0nKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430790nKv {
    public int LIZ;

    public final boolean LIZ() {
        boolean z;
        synchronized (this) {
            try {
                if (this.LIZ == 0) {
                    this.LIZ = 2;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LIZIZ() {
        synchronized (this) {
            try {
                this.LIZ = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
