package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0y39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842610y39 {
    public final C1842460y2u LIZ(DataChannel dataChannel) {
        C1842460y2u c1842460y2u = C1842460y2u.LJ;
        if (c1842460y2u == null) {
            synchronized (this) {
                try {
                    c1842460y2u = C1842460y2u.LJ;
                    if (c1842460y2u == null) {
                        c1842460y2u = new C1842460y2u(dataChannel);
                        C1842460y2u.LJ = c1842460y2u;
                        C20441214yg.LIZIZ("RankingServiceRegistryImpl", "Created new singleton instance");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1842460y2u;
    }
}
