package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.goda.v2.model.dto.GodaV2Facade;
import com.bytedance.goda.v2.model.vo.ClientScreen;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: renamed from: X.044r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10395044r {
    public final ClientScreen LIZ;
    public GodaV2Facade LIZIZ;
    public String LIZJ;
    public Map<String, ? extends Object> LIZLLL;

    public C10395044r() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        Float fValueOf = Float.valueOf(C1336100ksC.LIZJ(applicationContext));
        Float fValueOf2 = Float.valueOf(C1336100ksC.LIZIZ(applicationContext));
        Float fValueOf3 = Float.valueOf(1.0f);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        this.LIZ = new ClientScreen(fValueOf, fValueOf2, fValueOf3, Boolean.valueOf(((IApplicationDependencyService) iECommerceHostService2).isPad()));
    }
}
