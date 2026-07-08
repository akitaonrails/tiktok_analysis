package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0O0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612410O0h {
    public static void LIZ(int i, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1B9C c1b9c = C612400O0g.LIZ;
            jSONObject.put("netWorkQuality", c1b9c.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c1b9c.LIZJ());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put("errorUrl", str2);
            jSONObject.put("from", str3);
            C794420VEi.LIZIZ("aweme_movie_download_log", "", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1B9C c1b9c = C612400O0g.LIZ;
            jSONObject.put("netWorkQuality", c1b9c.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c1b9c.LIZJ());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorUrl", str4);
            C794420VEi.LIZIZ(str, str2, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
