package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.saas.ECLiveDependencyService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04AL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04AL {
    public static final C04AL LIZ = new C04AL();

    public static Object LIZ(IPdpStarter.PdpEnterParam pdpEnterParam, int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        Map<String, Object> map;
        Object obj;
        AnonymousClass0317 anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin;
        String name;
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null && (obj = map.get("source_page_type")) != null && Intrinsics.LJFF("live", obj)) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin = ECLiveDependencyService.createIECLiveDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IECLiveDependencyService.class.getName();
                if (anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECLiveDependencyService.class);
            }
            Object objReportAction = ((IECLiveDependencyService) anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin).reportAction((String) pdpEnterParam.trackParams.get("lineup_room_id"), (String) pdpEnterParam.trackParams.get("lineup_author_id"), pdpEnterParam.getProductId(), i, interfaceC1364105Vn);
            if (objReportAction == C099R.LJFF()) {
                return objReportAction;
            }
        }
        return Unit.LIZ;
    }
}
