package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520400pfS implements InterfaceC1520860pgC {
    @Override // X.InterfaceC1520860pgC
    public final void LIZ(int i, JSONObject jSONObject) {
        try {
            C793770VBv.LJII("bd_hybrid_monitor_service_all_in_one", null, null, jSONObject);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("apm upload: ");
            sbLIZ.append("bd_hybrid_monitor_service_all_in_one");
            C1521730phb.LJFF("WebViewMonitorDefault", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }
}
