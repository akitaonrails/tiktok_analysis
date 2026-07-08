package X;

import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomPreloadPauseConfig;

/* JADX INFO: renamed from: X.0pLL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507930pLL {
    public static final EcomPreloadPauseConfig LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;

    static {
        EcomPreloadPauseConfig ecomPreloadPauseConfig = new EcomPreloadPauseConfig(false, false, 0, 0, false, false);
        EcomPreloadPauseConfig ecomPreloadPauseConfig2 = (EcomPreloadPauseConfig) C0C64.LJIILLIIL().LJJII(EcomPreloadPauseConfig.class, ecomPreloadPauseConfig, "ec_preload_pause_exp", true);
        if (ecomPreloadPauseConfig2 != null) {
            ecomPreloadPauseConfig = ecomPreloadPauseConfig2;
        }
        LIZ = ecomPreloadPauseConfig;
        boolean z = ecomPreloadPauseConfig.enable;
        LIZIZ = z;
        LIZJ = z && ecomPreloadPauseConfig.cancelExecuteTaskWhenDestroyed;
        LIZLLL = z && ecomPreloadPauseConfig.rePrioritizeTasks;
        LJ = z && ecomPreloadPauseConfig.requeueTask;
    }
}
