package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530050pv1 implements InterfaceC1529450pu3 {
    public static final C1530050pv1 LIZ = new C1530050pv1();
    public static final ConcurrentHashMap<String, AbstractC1538620q8q> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1529450pu3
    public final void LIZ(Context context, final String str, final C1537480q70 c1537480q70) {
        String strApplyGlobalLoadUrl;
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("hybrid_lynx_prefetch");
            if (config != null && (jSONArrayOptJSONArray = config.optJSONArray("denyList")) != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (a0.LJJIIZI(str, jSONArrayOptJSONArray.get(i).toString(), false)) {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("hybrid_lynx_prefetch");
            if (config2 != null) {
                if (config2.optInt("enable", 1) != 1) {
                    return;
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v != null && (strApplyGlobalLoadUrl = c1538050q7v.applyGlobalLoadUrl(str)) != null) {
            str = strApplyGlobalLoadUrl;
        }
        C1522300piW.LIZIZ("hybrid_prefetch_start", c1537480q70, str, null);
        C786410Ut5.LJJZZIII(C20544083a.LIZ, new Runnable() { // from class: X.0pv0
            public final void LIZ() {
                Object c098200Yq;
                String str2 = str;
                C1537480q70 c1537480q702 = c1537480q70;
                C1531220pwu c1531220pwu = new C1531220pwu(c1537480q702, str2);
                try {
                    C1520360pfO c1520360pfO = new C1520360pfO("bd_hybrid_monitor_infra_service");
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hybrid_module", "lynxprefetch");
                    jSONObject.put("infra_service", "vmsdk");
                    c1520360pfO.LIZLLL = jSONObject;
                    c1520360pfO.LJIIIIZZ = c1537480q702.containerId;
                    C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                    C1520200pf8.LIZ.getClass();
                    C1520200pf8.LIZ(c1520350pfNLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("report usage failed ");
                    sbLIZ.append(th.getMessage());
                    c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "PREFETCH");
                }
                Intrinsics.LJFF(C20544083a.LIZ.getLooper(), Looper.myLooper());
                c1531220pwu.LIZIZ.LJJ(C1531220pwu.class, c1531220pwu);
                String str3 = c1531220pwu.LIZ;
                SparkSecurityLynxService sparkSecurityLynxService = (SparkSecurityLynxService) SparkSecurityServiceCenter.INSTANCE.protocol();
                C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointLynx, C1E6B.SparkSecuritySolutionChannelHybridLoad);
                c828420Wee.LJFF.put("URL", str3);
                C821850WLv c821850WLvHandleWillLoadLynxTemplateWithEvent = sparkSecurityLynxService.handleWillLoadLynxTemplateWithEvent(c828420Wee);
                if (c821850WLvHandleWillLoadLynxTemplateWithEvent != null) {
                    Map<?, ?> map = c821850WLvHandleWillLoadLynxTemplateWithEvent.LIZIZ;
                    Object obj = map != null ? map.get("URL") : null;
                    if (!(obj instanceof String) || (str3 = (String) obj) == null) {
                        str3 = "";
                    }
                }
                if (str3.length() == 0) {
                    C1490740otc.LIZIZ(C1490740otc.LIZ, "intercepted by third party cdn resource", null, null, 6);
                    return;
                }
                try {
                    C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1531220pwu.LIZIZ, false, null, 3);
                    if (c1533020pzoLJIILJJIL != null) {
                        c1531220pwu.LJI(c1533020pzoLJIILJJIL, c1531220pwu.LIZ, c1531220pwu.LIZIZ);
                    } else if (c1531220pwu.LJ != null) {
                        c1531220pwu.LIZLLL(c1531220pwu.LIZIZ, c1531220pwu.LJ, c1531220pwu.LIZ);
                    } else {
                        C1522300piW.LIZIZ("hybrid_prefetch_file_load_state", c1531220pwu.LIZIZ, c1531220pwu.LIZ, new JSONObject().put("success", 0).put("errorCode", -997).put("errorMsg", "ResourceLoader prefetch load error, no resource service"));
                        c1531220pwu.LJIIIZ(null, "resource service is not as expected", -997);
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1531220pwu.LJIIJ(c1531220pwu, -994, null, thM5exceptionOrNullimpl, 2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("exception happened in Prefetch Runtime, ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PrefetchManager@828d.prefetch$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PrefetchManager@828d.prefetch$1");
            }
        });
    }
}
