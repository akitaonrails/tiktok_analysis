package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795850wpj implements InterfaceC1794230wn7 {
    public C0VCC LIZ;
    public final C1795480wp8 LIZIZ = new C1795480wp8();

    public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.LIZ == null) {
            C1795480wp8 c1795480wp8 = this.LIZIZ;
            if (c1795480wp8.LIZ == null) {
                synchronized (c1795480wp8) {
                    try {
                        if (c1795480wp8.LIZ == null) {
                            c1795480wp8.LIZ = C1795480wp8.LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            this.LIZ = c1795480wp8.LIZ;
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        C0VCC c0vcc = this.LIZ;
        if (c0vcc != null) {
            c0vcc.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
