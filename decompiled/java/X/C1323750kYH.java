package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0kYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323750kYH {
    public static final String LIZ() {
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin2;
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
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = NetworkUtilDependencyService.createINetworkUtilDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, INetworkUtilDependencyService.class.getName(), anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkUtilDependencyService.class);
        }
        if (!((INetworkUtilDependencyService) anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin).isNetworkAvailable(applicationContext)) {
            return EnumC1323760kYI.NO_NETWORK.getValue();
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin2 = NetworkUtilDependencyService.createINetworkUtilDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime3, 1, INetworkUtilDependencyService.class.getName(), anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkUtilDependencyService.class);
        }
        return ((INetworkUtilDependencyService) anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin2).isWifi(applicationContext) ? EnumC1323760kYI.WIFI.getValue() : EnumC1323760kYI.OTHER.getValue();
    }
}
