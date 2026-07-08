package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.03M2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03M2 {
    public static final C03M2 LIZ = new C03M2();

    public static MiniOspActivity LIZ() {
        IECommerceHostService iECommerceHostService;
        C928103jz c928103jzLIZJ;
        Context context;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            Activity activityLIZ = (rootPageMonitor == null || (c928103jzLIZJ = rootPageMonitor.LIZJ()) == null || (context = c928103jzLIZJ.LIZ) == null) ? null : C1388190mED.LIZ(context);
            if ((activityLIZ instanceof MiniOspActivity) && !((MiniOspActivity) activityLIZ).isFinishing()) {
                return (MiniOspActivity) activityLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }
}
