package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493310oxl {
    public static InterfaceC1493350oxp LIZ = null;
    public static volatile boolean LIZIZ = true;

    public static void LIZ(int i, String str, JSONObject jSONObject) {
        if (LIZ != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", str);
                jSONObject2.put("value", i);
                jSONObject2.put("ext_value", 0);
                jSONObject2.put("extraObject", jSONObject);
                TTNetInit.getTTNetDepend().LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
