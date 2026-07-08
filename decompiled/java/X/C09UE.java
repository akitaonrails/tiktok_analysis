package X;

import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09UE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UE extends C09AY implements Function0<JSONObject> {
    public C09UE() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() {
        ?? r2;
        try {
            JSONObject jSONObject = new JSONObject(LiveMtPbRequestsSetting.INSTANCE.getValue().getSwitches());
            C189200o6.m2constructorimpl(jSONObject);
            r2 = jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            r2 = c098200Yq;
        }
        return C189200o6.m7isFailureimpl(r2) ? new JSONObject() : r2;
    }
}
