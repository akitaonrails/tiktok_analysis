package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C909303gx {
    public static final C909303gx LIZ = new C909303gx();

    public static String LIZ() {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        ILocationDependencyService iLocationDependencyService = (ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        String priorityRegion = iLocationDependencyService.getPriorityRegion();
        if (a0.LJJJIL(priorityRegion)) {
            priorityRegion = iLocationDependencyService.getCurrentRegionCode();
        }
        if (a0.LJJJIL(priorityRegion)) {
            return null;
        }
        return priorityRegion;
    }
}
