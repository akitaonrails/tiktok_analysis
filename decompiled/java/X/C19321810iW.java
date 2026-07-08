package X;

import com.bytedance.router.monitor.Constants;
import com.bytedance.router.monitor.RouterMonitorListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.legoImpl.task.InitRouter;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10iW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19321810iW extends C09AY implements Function0<C21507819Fc> {
    public C19321810iW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19Fc] */
    @Override // kotlin.jvm.functions.Function0
    public final C21507819Fc invoke() {
        return new RouterMonitorListener() { // from class: X.19Fc
            @Override // com.bytedance.router.monitor.RouterMonitorListener
            public final void onReportPageJump(boolean z, String str, String str2) {
                if (C793770VBv.LIZJ("app_page_jump_classify")) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("target_class", str);
                        jSONObject.put("route_host_path", str2);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C793770VBv.LJIIJ("app_page_jump_classify", z ? 1 : 0, jSONObject, null, null);
                }
            }

            @Override // com.bytedance.router.monitor.RouterMonitorListener
            public final void onReport(int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
                Constants.Companion companion = Constants.Companion;
                jSONObject3.put(companion.getKEY_PARAMS(), (Object) null);
                if (C793770VBv.LIZJ("app_router_monitor")) {
                    C793770VBv.LJIIJ("app_router_monitor", i, jSONObject, jSONObject2, jSONObject3);
                }
                if (i == companion.getSTATUS_FAIL() && C793770VBv.LIZJ("app_router_error")) {
                    C793770VBv.LJII("app_router_error", jSONObject, jSONObject2, jSONObject3);
                }
                JSONObject jSONObject4 = new JSONObject();
                InitRouter.LIZ(jSONObject, jSONObject4);
                InitRouter.LIZ(jSONObject2, jSONObject4);
                try {
                    jSONObject4.put("route_url", jSONObject3.optString("route_url"));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                AppLogNewUtils.onEventV3("app_router_monitor", jSONObject4);
            }
        };
    }
}
