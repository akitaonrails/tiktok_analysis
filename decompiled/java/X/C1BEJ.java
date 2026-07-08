package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEJ {
    public static void onEventExpired(C1BEK c1bek) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url_list", new JSONArray((Collection) c1bek.LJFF)).put("is_retry", c1bek.LJIIIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ("track_url_expired", c1bek, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r10, X.C1BEK r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BEJ.LIZ(java.lang.String, X.1BEK, org.json.JSONObject):void");
    }

    public static boolean LIZIZ(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject.has(str)) {
            return false;
        }
        try {
            jSONObject.putOpt(str, obj);
            return true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
