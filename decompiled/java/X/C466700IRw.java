package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466700IRw {
    public static boolean LIZ;

    public static void LIZ(String str) {
        if (LIZ) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getApplicationInitTime();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cost_time", jUptimeMillis);
            jSONObject.put("invoke_resource", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC2.LJIIL(0, "ttlive_cold_start_to_enter_room_all", jSONObject);
        LIZ = true;
    }
}
