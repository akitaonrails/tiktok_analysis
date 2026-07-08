package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04QH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04QH {
    public static final int LIZ;

    static {
        int iLJIJ = 5000;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 5000, "background_playback_monitor_delay_ms", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iLJIJ;
    }
}
