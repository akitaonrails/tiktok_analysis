package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14Wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20278314Wf {
    public Keva LIZ;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;

    public final void LIZ(long j) {
        synchronized (this) {
            try {
                Keva keva = this.LIZ;
                if (keva != null) {
                    this.LIZIZ = j;
                    keva.storeLong("disk_total", j);
                } else {
                    this.LIZJ = j;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
