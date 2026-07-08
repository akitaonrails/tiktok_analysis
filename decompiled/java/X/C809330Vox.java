package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809330Vox {
    public static void LIZIZ(String str, JSONObject... jSONObjectArr) {
        if (jSONObjectArr.length > 0) {
            LIZ("event_v1", "red_badge", str, 0L, 0L, jSONObjectArr[0]);
        } else {
            LIZ("event_v1", "red_badge", str, 0L, 0L, null);
        }
    }

    public static void LIZJ(String str, Bundle bundle) {
        Object obj;
        if (C2093608Ic.LJ(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_event_v3", 1);
            for (String str2 : bundle.keySet()) {
                try {
                    obj = bundle.get(str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                jSONObject.put(str2, obj);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ("event_v3", str, null, 0L, 0L, jSONObject);
    }

    public static void LIZ(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushLog#onEvent, we just send\n");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        sbLIZ.append(": label: ");
        sbLIZ.append(str3);
        sbLIZ.append(", json: ");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        if ("event_v3".equals(str)) {
            C20684815ws.LJIJ(str2, jSONObject);
        } else {
            if (!"event_v1".equals(str)) {
                return;
            }
            C20684815ws.LJIIIZ(j, j2, str2, str3);
        }
    }
}
