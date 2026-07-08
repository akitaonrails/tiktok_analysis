package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hometab.base.spi.ITabProcessManager;
import com.ss.android.ugc.aweme.main.spi.HomePageTabCompatServiceImpl;
import com.ss.android.ugc.aweme.spi.HomePageTabCompatService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0rLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585140rLs implements C1BL2 {
    public static C1585230rM1 LIZIZ;
    public final HomePageTabCompatService LIZ;

    @Override // X.C1BL2
    public final void LIZIZ() {
    }

    @Override // X.C1BL2
    public final void LIZ() {
        C1585200rLy c1585200rLyLJIIIZ;
        C1585230rM1 c1585230rM1 = LIZIZ;
        if (c1585230rM1 != null) {
            c1585230rM1.LJIIJ();
            C1585230rM1 c1585230rM12 = LIZIZ;
            if (c1585230rM12 == null || (c1585200rLyLJIIIZ = c1585230rM12.LJIIIZ()) == null) {
                return;
            }
            c1585200rLyLJIIIZ.LJFF();
        }
    }

    public C1585140rLs() {
        new AtomicBoolean(false);
        HomePageTabCompatService homePageTabCompatServiceLJI = HomePageTabCompatServiceImpl.LJI();
        this.LIZ = homePageTabCompatServiceLJI;
        ITabProcessManager iTabProcessManager = (ITabProcessManager) PluggableExtentionKt.pluggableSpi$default(ITabProcessManager.class, false, false, false, 14, null);
        LIZIZ = iTabProcessManager != null ? iTabProcessManager.LIZIZ() : null;
        homePageTabCompatServiceLJI.LIZIZ();
    }
}
