package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.06Si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1610606Si implements InterfaceC2188711AlJ {
    public static final C1610606Si LIZ = new C1610606Si();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static long LIZJ;

    public static void LIZIZ() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService).isDebug();
    }

    @Override // X.InterfaceC2188711AlJ
    public final void LIZ(C1768270w7F c1768270w7F) {
        if (c1768270w7F == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - LIZJ >= C1610406Sg.LIZ().minNotifyInterval) {
            LIZJ = jCurrentTimeMillis;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZLLL), null, null, new C1610806Sk(c1768270w7F, null), 3);
        }
    }
}
