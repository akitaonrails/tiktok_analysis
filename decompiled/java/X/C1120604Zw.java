package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.init.EcomInitService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECBusinessInitService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECHostInitService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.IECSaaSCoreMonitorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;

/* JADX INFO: renamed from: X.04Zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1120604Zw {
    public static volatile boolean LIZIZ;
    public static final C1120604Zw LIZ = new C1120604Zw();
    public static final C1126204aq LIZJ = new C1126204aq();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1120504Zv());

    public static C1121904a9 LIZIZ() {
        return (C1121904a9) LIZLLL.getValue();
    }

    public final void LIZ() {
        if (LIZIZ) {
            return;
        }
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (LIZIZ) {
                return;
            }
            LIZIZ = true;
            if (C034S.LIZ()) {
                EcomInitService.createIECHostInitServicebyMonsterPlugin(false).init();
            } else {
                ((IECHostInitService) LIZJ.LIZLLL(IECHostInitService.class)).init();
            }
            Iterator it2 = ServiceManager.get().getServices(IECBusinessInitService.class).iterator();
            while (it2.hasNext()) {
                ((IECBusinessInitService) it2.next()).init();
            }
            IECSaaSCoreMonitorService iECSaaSCoreMonitorService = (IECSaaSCoreMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSaaSCoreMonitorService.class, false, false, false, 14, null);
            if (iECSaaSCoreMonitorService != null) {
                iECSaaSCoreMonitorService.LIZ(jElapsedRealtime);
            }
        }
    }

    public final C1126204aq LIZJ() {
        LIZ();
        return LIZJ;
    }
}
