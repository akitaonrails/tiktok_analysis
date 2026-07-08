package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.util.Map;

/* JADX INFO: renamed from: X.03bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C878003bu {
    public static EnterParams LIZ(Map map, String str) {
        String str2;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        String str3;
        String str4;
        String str5;
        boolean z;
        String name;
        String str6 = null;
        if (map == null || (str2 = (String) C7726030a.LIZ("oec_user_id", map)) == null) {
            C914303hl.LIZ.getClass();
            Cashier cashier = C914303hl.LIZIZ;
            if (cashier != null) {
                str2 = cashier.merchantUserId;
            } else {
                str2 = null;
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        String priorityRegion = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getPriorityRegion();
        if (map != null) {
            str6 = (String) C7726030a.LIZ("currency", map);
            str3 = (String) C7726030a.LIZ("amount", map);
            str4 = (String) C7726030a.LIZ("agreement_id", map);
            str5 = (String) C7726030a.LIZ("seller_id", map);
        } else {
            str3 = null;
            str4 = null;
            str5 = null;
        }
        C887503dR c887503dR = new C887503dR(str2, priorityRegion, str6, str3, str4, "bidding", str5, str, null, null, null, null, null, null, null, null, 261696);
        EnterParams enterParams = new EnterParams(null, null, null, null, null, false, null, null, null, null, null, null, null, "bind_not_pay", null, null, null, "bidding", null, null, false, null, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, true);
        enterParams.LJJIJL = c887503dR;
        enterParams.LJJIJLIJ = true;
        return enterParams;
    }
}
