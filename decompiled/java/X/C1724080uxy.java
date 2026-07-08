package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724080uxy implements InterfaceC1724070uxx {
    public static JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            C1723470uwz versionInfo = C1717770unn.LIZJ().getVersionInfo();
            jSONObject.put("sdk_version_name", versionInfo.LIZ);
            jSONObject.put("sdk_version_code", versionInfo.LIZIZ);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    public final void LIZIZ(String str) {
        JSONObject jSONObjectLIZ = LIZ();
        try {
            jSONObjectLIZ.put("rd_pipo_sdk_init_debug", str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        onEventV3("payment_sdk_init_debug_info", jSONObjectLIZ);
    }

    @Override // X.InterfaceC1724090uxz
    public final void onEventV3(String str, JSONObject jSONObject) {
        C1724150uy5.LJIIL.LIZ.LJIIJJI.onEventV3(str, jSONObject);
    }
}
