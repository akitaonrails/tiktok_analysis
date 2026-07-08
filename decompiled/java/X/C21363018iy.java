package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS214S0000000_25;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18iy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21363018iy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(449));

    public static final String LIZLLL(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_state", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interface", "SWITCH_APP_STATE");
        jSONObject2.put("body", jSONObject);
        return C786410Ut5.J3(jSONObject2);
    }

    public static final String LJ(Effect effect) {
        String strLIZIZ;
        if (effect != null) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1017903yT.LIZ());
                sbLIZ.append("_0_0.mp4");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZIZ = "";
            }
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return "";
    }

    public static final boolean LJI(Effect effect) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_new_video_picker_pipeline", true) != 1 || !C1624200sMs.LIZ(effect, "video_picker")) {
            return false;
        }
        return true;
    }

    public static String LIZJ(String str, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("name", str);
            jSONObject.put("orientation", 0);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("videos", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("interface", "VIDEO_PROCESS_RESULT");
        jSONObject3.put("body", jSONObject2);
        return C786410Ut5.J3(jSONObject3);
    }

    public static final String LIZIZ(int i, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("name", str);
            jSONObject.put("orientation", i);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("images", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("interface", "VIDEO_PROCESS_RESULT");
        jSONObject3.put("body", jSONObject2);
        return C786410Ut5.J3(jSONObject3);
    }

    public static final String LJFF(Effect effect, String str, String str2) {
        String strLIZIZ;
        String strOptString;
        JSONObject jSONObject;
        if (effect != null) {
            try {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
                if (jSONObjectLJIIIZ != null && (jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObjectLJIIIZ, str)) != null) {
                    strOptString = jSONObject.optString(str2);
                } else {
                    strOptString = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effect.getUnzipPath());
                sbLIZ.append('/');
                sbLIZ.append(strOptString);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZIZ = "";
            }
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return "";
    }

    public static final String LIZ(int i, int i2, String str, String str2, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("name", str);
            jSONObject.put("orientation", i2);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            jSONObject2.put("name", str2);
            jSONObject2.put("orientation", i);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("video", jSONObject);
        jSONObject3.put("static_photo", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("live_photos", jSONArray);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("interface", "VIDEO_PROCESS_RESULT");
        jSONObject5.put("body", jSONObject4);
        return C786410Ut5.J3(jSONObject5);
    }
}
