package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBV {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static boolean LJIIJ;

    public static JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportMemStartTime", LIZ);
            jSONObject.put("reportMemEndTime", LIZIZ);
            jSONObject.put("reportFileStartTime", LIZJ);
            jSONObject.put("reportFileEndTime", LIZLLL);
            jSONObject.put("retryMemStartTime", LJ);
            jSONObject.put("retryMemEndTime", LJFF);
            jSONObject.put("retryFileStartTime", LJI);
            jSONObject.put("retryFileEndTime", LJII);
            jSONObject.put("clearDataStartTime", LJIIIIZZ);
            jSONObject.put("clearDataEndTime", LJIIIZ);
            jSONObject.put("clearDataError", LJIIJ ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
