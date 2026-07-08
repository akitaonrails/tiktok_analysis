package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.net.PreConnectStrategy;

/* JADX INFO: renamed from: X.0CD4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CD4 {
    public static final PreConnectStrategy LIZ = new PreConnectStrategy(0, null, 0, 7, null);

    public static PreConnectStrategy LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PreConnectStrategy preConnectStrategy = LIZ;
            PreConnectStrategy preConnectStrategy2 = (PreConnectStrategy) c0c64LJIILLIIL.LJJII(PreConnectStrategy.class, preConnectStrategy, "net_pre_connect_opt", true);
            return preConnectStrategy2 != null ? preConnectStrategy2 : preConnectStrategy;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
