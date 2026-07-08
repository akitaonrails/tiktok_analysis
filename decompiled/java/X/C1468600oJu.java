package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468600oJu {
    public final String LIZ = "";
    public final Map<Integer, Object> LIZIZ = Collections.synchronizedMap(new HashMap());
    public final Map<String, String> LIZJ = new HashMap();
    public String LIZLLL;

    public final void LIZLLL() {
        float f;
        JSONObject jSONObjectOptJSONObject = null;
        String strLIZJ = LIZJ(3, null, false);
        if (TextUtils.isEmpty(strLIZJ)) {
            return;
        }
        synchronized (C1468600oJu.class) {
            try {
                C1468600oJu c1468600oJu = C1468590oJt.LIZ;
                if (strLIZJ != null && TextUtils.equals(strLIZJ, c1468600oJu.LIZLLL)) {
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("TTVideoEngine.GearStrategy", "global parsed already");
                    return;
                }
                if (TextUtils.equals(this.LIZLLL, strLIZJ)) {
                    int i2 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("TTVideoEngine.GearStrategy", "parsed already");
                    return;
                }
                this.LIZLLL = strLIZJ;
                try {
                    jSONObjectOptJSONObject = new JSONObject(strLIZJ).optJSONObject("vod_strategy_select_bitrate");
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parse success ");
                    sbLIZ.append(strLIZJ);
                    TTVideoEngineLog.d("TTVideoEngine.GearStrategy", C2188811AlT.LIZIZ(sbLIZ));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("parse error ");
                    sbLIZ2.append(strLIZJ);
                    TTVideoEngineLog.d("TTVideoEngine.GearStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                if (jSONObjectOptJSONObject.has("strategy_type")) {
                    LJFF(1, jSONObjectOptJSONObject.optInt("strategy_type", -1));
                }
                if (jSONObjectOptJSONObject.has("strategy_module")) {
                    LJFF(2, jSONObjectOptJSONObject.optInt("strategy_module", -1));
                }
                if (jSONObjectOptJSONObject.has("startup_bandwidth_parameter")) {
                    String strOptString = jSONObjectOptJSONObject.optString("startup_bandwidth_parameter");
                    if (TextUtils.isEmpty(strOptString)) {
                        f = 0.9f;
                        this.LIZIZ.put(47, Float.valueOf(f));
                    } else {
                        try {
                            f = CastFloatProtector.parseFloat(strOptString);
                        } catch (NumberFormatException e2) {
                            f = 0.9f;
                        }
                        this.LIZIZ.put(47, Float.valueOf(f));
                    }
                }
                if (jSONObjectOptJSONObject.has("startup_first_param_str")) {
                    LJ(C795730VJj.LJIILJJIL(0.0d, "startup_first_param_str", jSONObjectOptJSONObject), 48);
                }
                if (jSONObjectOptJSONObject.has("startup_second_param_str")) {
                    LJ(C795730VJj.LJIILJJIL(2.67952228E-5d, "startup_second_param_str", jSONObjectOptJSONObject), 49);
                }
                if (jSONObjectOptJSONObject.has("startup_third_param_str")) {
                    LJ(C795730VJj.LJIILJJIL(0.151840652d, "startup_third_param_str", jSONObjectOptJSONObject), 50);
                }
                if (jSONObjectOptJSONObject.has("startup_fourth_param_str")) {
                    LJ(C795730VJj.LJIILJJIL(69.0106422d, "startup_fourth_param_str", jSONObjectOptJSONObject), 51);
                }
                if (jSONObjectOptJSONObject.has("startup_use_cache")) {
                    LJFF(52, jSONObjectOptJSONObject.optInt("startup_use_cache", 0));
                }
                if (jSONObjectOptJSONObject.has("flow_json")) {
                    LJII(53, jSONObjectOptJSONObject.optString("flow_json"));
                }
                if (jSONObjectOptJSONObject.has("preload_json")) {
                    LJII(54, jSONObjectOptJSONObject.optString("preload_json"));
                }
                if (jSONObjectOptJSONObject.has("startup_json")) {
                    LJII(55, jSONObjectOptJSONObject.optString("startup_json"));
                }
                if (jSONObjectOptJSONObject.has("abr_pool_enable")) {
                    LJFF(56, jSONObjectOptJSONObject.optInt("abr_pool_enable", 0));
                }
                if (jSONObjectOptJSONObject.has("wifi_default_resolution_index")) {
                    LJFF(17, jSONObjectOptJSONObject.optInt("wifi_default_resolution_index", -1));
                }
                if (jSONObjectOptJSONObject.has("wifi_max_resolution_index")) {
                    LJFF(21, jSONObjectOptJSONObject.optInt("wifi_max_resolution_index", -1));
                }
                if (jSONObjectOptJSONObject.has("cellular_max_resolution_index")) {
                    LJFF(19, jSONObjectOptJSONObject.optInt("cellular_max_resolution_index", -1));
                }
                if (jSONObjectOptJSONObject.has("wifi_default_resolution_quality")) {
                    LJII(18, jSONObjectOptJSONObject.optString("wifi_default_resolution_quality"));
                }
                if (jSONObjectOptJSONObject.has("wifi_max_resolution_quality")) {
                    LJII(22, jSONObjectOptJSONObject.optString("wifi_max_resolution_quality"));
                }
                if (jSONObjectOptJSONObject.has("cellular_max_resolution_quality")) {
                    LJII(20, jSONObjectOptJSONObject.optString("cellular_max_resolution_quality"));
                }
                if (jSONObjectOptJSONObject.has("startup_narrow_screen_use_width")) {
                    LJFF(31, jSONObjectOptJSONObject.optInt("startup_narrow_screen_use_width", 0));
                }
            } finally {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public final Object LIZIZ(int i, boolean z) {
        C1468600oJu c1468600oJu;
        Object obj = this.LIZIZ.get(Integer.valueOf(i));
        if (obj != null) {
            return obj;
        }
        if (!z || (c1468600oJu = C1468590oJt.LIZ) == this) {
            return null;
        }
        return c1468600oJu.LIZIZ(i, false);
    }

    public final void LJ(double d, int i) {
        this.LIZIZ.put(Integer.valueOf(i), Double.valueOf(d));
    }

    public final void LJFF(int i, int i2) {
        this.LIZIZ.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void LJI(int i, int i2) {
        if (!this.LIZIZ.containsKey(Integer.valueOf(i))) {
            this.LIZIZ.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void LJII(int i, String str) {
        this.LIZIZ.put(Integer.valueOf(i), str);
    }

    public final int LIZ(int i, int i2, boolean z) {
        C1468600oJu c1468600oJu;
        Object obj = this.LIZIZ.get(Integer.valueOf(i));
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!z || (c1468600oJu = C1468590oJt.LIZ) == this) {
            return i2;
        }
        return c1468600oJu.LIZ(i, i2, false);
    }

    public final String LIZJ(int i, String str, boolean z) {
        C1468600oJu c1468600oJu;
        Object obj = this.LIZIZ.get(Integer.valueOf(i));
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!z || (c1468600oJu = C1468590oJt.LIZ) == this) {
            return str;
        }
        return c1468600oJu.LIZJ(i, str, false);
    }
}
