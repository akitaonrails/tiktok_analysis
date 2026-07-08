package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: X.04nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1205404nc {
    public static final /* synthetic */ C1205404nc LIZ = new C1205404nc();

    public static void LIZIZ(boolean z, int i, String str, long j, Throwable th) {
        try {
            Iterator it2 = ServiceManager.get().getServices(IEcomAsyncInflateMonitor.class).iterator();
            while (it2.hasNext()) {
                ((IEcomAsyncInflateMonitor) it2.next()).LIZ(z, i, str, j, th);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public static void LIZ(boolean z, int i, String str, String str2, long j, Throwable th) {
        try {
            Iterator it2 = ServiceManager.get().getServices(IEcomAsyncInflateMonitor.class).iterator();
            while (it2.hasNext()) {
                ((IEcomAsyncInflateMonitor) it2.next()).LIZIZ(z, i, str, str2, j, th);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
