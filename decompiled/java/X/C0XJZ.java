package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0XJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJZ {
    public static final String LIZJ() {
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
        return ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode();
    }

    public static final void LIZ(Map<String, Object> map) {
        String strLIZJ = LIZJ();
        Locale locale = Locale.ROOT;
        map.put("priority_region", strLIZJ.toLowerCase(locale));
        map.put("store_region", C0X2A.LIZJ.toLowerCase(locale));
    }

    public static final void LIZIZ(C957403oi c957403oi) {
        String strLIZJ = LIZJ();
        Locale locale = Locale.ROOT;
        c957403oi.LIZLLL("priority_region", strLIZJ.toLowerCase(locale));
        c957403oi.LIZLLL("store_region", C0X2A.LIZJ.toLowerCase(locale));
    }
}
