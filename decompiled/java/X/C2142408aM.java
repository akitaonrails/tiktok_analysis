package X;

import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2142408aM {
    public static final boolean LIZ = C2367709Pn.LJIIIZ();

    public static void LIZ(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            jSONObject.put("heap", LIZ);
            jSONObject.put("level", i);
            boolean z = true;
            jSONObject.put("ewma", true);
            if (ActivityLifeObserver.getInstance().isForeground()) {
                z = false;
            }
            jSONObject.put("background", z);
            C793770VBv.LJII("memory_pressure_stat", jSONObject, null, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
