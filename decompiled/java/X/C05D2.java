package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSlardarReportWhiteList;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05D2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05D2 extends C09AY implements Function0<C189200o6<? extends Unit>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05D2(String str, JSONObject jSONObject) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C189200o6<? extends Unit> invoke() throws JSONException {
        Object c098200Yq;
        Iterator<String> itKeys;
        JSONObject jSONObject;
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        if (C1751590vgL.LIZ.contains(this.LL) && (jSONObject = this.LLILLJJLI) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IApmDependencyService.class.getName(), anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
            }
            jSONObject.put("traceparent", ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).newTrackingTraceparent());
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        String str = this.LL;
        JSONObject jSONObject2 = this.LLILLJJLI;
        c1507790pL7.getClass();
        C1507790pL7.LJI(str, jSONObject2);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C13045058p(this.LL, null, this.LLILLJJLI), 2);
        String str2 = this.LL;
        JSONObject jSONObject3 = this.LLILLJJLI;
        try {
            C01GW c01gw = EcomSlardarReportWhiteList.LIZIZ;
            if (((Map) c01gw.getValue()).containsKey(str2)) {
                EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem ecomSlardarReportWhiteItem = (EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem) ((Map) c01gw.getValue()).get(str2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                if (jSONObject3 != null && (itKeys = jSONObject3.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj = jSONObject3.get(next);
                        if (ecomSlardarReportWhiteItem != null) {
                            List<String> list = ecomSlardarReportWhiteItem.category;
                            if (list != null && list.contains(next)) {
                                jSONObject5.put(next, obj);
                                if (ecomSlardarReportWhiteItem != null) {
                                }
                            }
                            List<String> list2 = ecomSlardarReportWhiteItem.metric;
                            if (list2 != null && list2.contains(next)) {
                                jSONObject4.put(next, obj);
                            }
                        }
                    }
                }
                C05A8.LIZ.getClass();
                C05A8.LIZ(str2, jSONObject5, jSONObject4, null);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return C189200o6.m1boximpl(c098200Yq);
    }
}
