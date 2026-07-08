package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0K04, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0K04 {
    public static void LIZJ(double d, String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, d);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LIZLLL(int i, String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJ(String str, long j, JSONObject jSONObject) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJFF(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJI(String str, JSONArray jSONArray, JSONObject jSONObject) {
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJII(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJIIIIZZ(JSONObject jSONObject, String str, float f) {
        try {
            jSONObject.put(str, f);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJIIIZ(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("BaseMonitor", "", e);
        }
    }
}
