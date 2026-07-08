package X;

import a17.a0;
import com.bytedance.hybrid.interaction.motion.api.IHybridInteractionMotionService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonApp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NMF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMF extends a0 {
    public static void LIZ(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result_code", i);
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.onEventV3("spark_motion_plugin_bind_result", jSONObject);
        }
    }

    @Override // a17.a0
    public final void onBootstrap(KryptonApp kryptonApp) throws JSONException {
        Object c098200Yq;
        super.onBootstrap(kryptonApp);
        long j = kryptonApp.LJIIIIZZ;
        try {
            c098200Yq = (IHybridInteractionMotionService) PluggableExtentionKt.pluggableSpi$default(IHybridInteractionMotionService.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        IHybridInteractionMotionService iHybridInteractionMotionService = (IHybridInteractionMotionService) c098200Yq;
        if (iHybridInteractionMotionService != null) {
            iHybridInteractionMotionService.LIZ(j);
            LIZ(1);
        } else if (!((Boolean) C0AJ7.LIZ.getValue()).booleanValue()) {
            LIZ(2);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NME(j, this, null), 3);
        }
    }
}
