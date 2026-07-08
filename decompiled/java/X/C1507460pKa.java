package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.network.EcLynxNetReuseHandler;
import com.ss.android.ugc.aweme.ecommerce.network.config.EcLynxNetReuseConfig;

/* JADX INFO: renamed from: X.0pKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507460pKa {
    public static void LIZ() {
        C23250099c.LIZLLL(EcLynxNetReuseHandler.LIZJ, null, null, new C1507450pKZ(null), 3);
    }

    public static void LIZIZ(String str) {
        try {
            EcLynxNetReuseConfig.LIZ.getClass();
            EcLynxNetReuseConfig.EcLynxNetReuseConfigModel ecLynxNetReuseConfigModelLIZIZ = EcLynxNetReuseConfig.LIZIZ(str);
            if (ecLynxNetReuseConfigModelLIZIZ != null && ecLynxNetReuseConfigModelLIZIZ.useOnlyOnce) {
                EcLynxNetReuseHandler.LIZLLL.LIZ.LIZLLL(str);
            }
            LIZ();
            EcLynxNetReuseHandler.LJ.LJ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ();
            EcLynxNetReuseHandler.LJ.LJ(str);
            throw th;
        }
    }
}
