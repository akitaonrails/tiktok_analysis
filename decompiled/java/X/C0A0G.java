package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0A0G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0A0G {
    public static long LIZ() {
        try {
            return C0C64.LJIILLIIL().LJIJJLI(31744, 1500L, "tt_share_link_delay_time", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 1500L;
        }
    }
}
