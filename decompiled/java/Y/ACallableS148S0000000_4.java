package Y;

import X.C0BIB;
import X.C0BIC;
import X.C0C64;
import X.C15O7;
import X.C1781506yL;
import X.C1C7U;
import X.C302480BtO;
import X.C303210BuZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.experiment.IPlayerExperimentService;
import com.ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public class ACallableS148S0000000_4 implements Callable {
    public final int $t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public ACallableS148S0000000_4(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS148S0000000_4 aCallableS148S0000000_4) {
        C1C7U.LIZ("AbTestManager@3c64.prefetchABAsync$1L");
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ab_call_opt", true, false);
        if (zLJIIIZ != C0BIB.LIZ) {
            C0BIB.LIZ = zLJIIIZ;
            C1781506yL.LIZ = C0BIB.LIZ;
        }
        if (zLJIIIZ) {
            C15O7.LIZJ(new ACallableS148S0000000_4(1));
        }
        C1C7U.LIZIZ("AbTestManager@3c64.prefetchABAsync$1L");
        return null;
    }

    public static final Object call$1(ACallableS148S0000000_4 aCallableS148S0000000_4) {
        C1C7U.LIZ("ABCacheOptConfigUpdateUtils@54a9.onConfigChanged$1L");
        System.currentTimeMillis();
        try {
            C303210BuZ.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 1, "share_guide", true);
            C302480BtO.LIZ = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ies_route", true, true));
            int i = 0;
            PreloaderExperiment.videoNetworkSpeedAlgorithmExperimentValue = C0C64.LJIILLIIL().LJIJ(31744, 0, "video_network_speed_algorithm", true);
            IPlayerExperimentService iPlayerExperimentService = (IPlayerExperimentService) PluggableExtentionKt.pluggableSpi(IPlayerExperimentService.class);
            if (iPlayerExperimentService != null) {
                iPlayerExperimentService.LIZ();
            }
            ArrayList<C0BIC> arrayList = C0BIB.LIZIZ;
            int size = arrayList.size();
            if (size > 0) {
                synchronized (arrayList) {
                    do {
                        try {
                            C0BIC c0bic = C0BIB.LIZIZ.get(i);
                            if (c0bic != null) {
                                c0bic.LIZ();
                            }
                            i++;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } while (i < size);
                }
            }
        } catch (Throwable th) {
        }
        C1C7U.LIZIZ("ABCacheOptConfigUpdateUtils@54a9.onConfigChanged$1L");
        return null;
    }
}
