package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04zJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1277904zJ {
    public static final void LIZ(JSONObject jSONObject, C1360330lVH c1360330lVH) {
        try {
            for (Map.Entry<String, String> entry : c1360330lVH.LIZIZ().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
