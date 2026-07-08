package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0BE5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BE5 {
    public static final boolean LIZ;

    static {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_disable_auto_play_when_memory_low", true, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = zLJIIIZ;
    }
}
