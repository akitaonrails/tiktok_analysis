package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS32S2000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508250pLr {
    public static final void LIZ() {
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
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Intrinsics.LJFF(((IApplicationDependencyService) iECommerceHostService2).getChannel(), "local_test");
    }

    public static final void LIZIZ(final String str, final String str2, final Function0<Unit> function0) {
        new AwS32S2000000_23(str, str2, 0);
        LIZ();
        int i = 1;
        try {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_pdp_lynx_preload_control_enable", true) != 0) {
                InterfaceC1508110pLd interfaceC1508110pLd = new InterfaceC1508110pLd() { // from class: X.0pLs
                    @Override // X.InterfaceC1508110pLd
                    public final InterfaceC1508150pLh LIZ(C1508120pLe c1508120pLe) {
                        new C020P(str, str2, 3);
                        C1508250pLr.LIZ();
                        try {
                            function0.invoke();
                            c1508120pLe.onSuccess();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            c1508120pLe.LIZ(message);
                        }
                        return C1508270pLt.LIZ;
                    }
                };
                Map mapLJ = C2097608Jq.LJ();
                if (!C08L8.LIZ()) {
                    i = 2;
                }
                C1507990pLR c1507990pLR = new C1507990pLR(str, str2, "view", 2, 0, interfaceC1508110pLd, mapLJ, Integer.valueOf(i), null, null, null, null, null, 7184);
                C1507890pLH c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ();
                if (c1507890pLHLIZ != null) {
                    c1507890pLHLIZ.LIZIZ(c1507990pLR);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        new AwS32S2000000_23(str, str2, 1);
        LIZ();
        function0.invoke();
    }
}
