package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510580pPc {
    public static final C1510580pPc LIZ = new C1510580pPc();
    public static volatile int LIZIZ;
    public static volatile int LIZJ;

    public final synchronized void LIZIZ() {
        LIZIZ = 0;
        LIZJ = 0;
    }

    public static Number LIZ(String str, JSONObject jSONObject) {
        Object c098200Yq;
        Object obj = null;
        try {
            ReturnCode returnCode = new ReturnCode(-1, -1);
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_client_ai", 0, 2, null);
            if (producer$default != null) {
                c098200Yq = producer$default.getNumericFeature(str, jSONObject, "idle_detection", returnCode);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Number) obj;
    }
}
