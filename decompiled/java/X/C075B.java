package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.075B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C075B {
    public static final long LIZ;

    static {
        long jLJFF = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            jLJFF = SettingsManager.LJFF("ec_sea_pdp_cart_preload_delay", 0L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ = jLJFF;
    }
}
