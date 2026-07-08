package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import j27.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316420kMS {
    public static JSONObject LIZ(s sVar, String str, boolean z, boolean z2, long j, long j2, long j3, long j4, int i, JSONObject jSONObject) {
        int i2;
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("fetchTime", j2 / 1000.0d);
            jSONObject3.put("completeTime", j3 / 1000.0d);
            jSONObject3.put("fetchTimeStamp", j);
            jSONObject3.put("finishTimeStamp", j4);
            jSONObject2.put("timeMetrics", jSONObject3);
            if (sVar != null && sVar.LJIILJJIL() != null) {
                String templateUrl = sVar.LJIILJJIL().getTemplateUrl();
                if (TextUtils.isEmpty(templateUrl)) {
                    templateUrl = "";
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", templateUrl);
                if (jSONObject != null) {
                    long jOptLong = jSONObject.optLong("viewWidth");
                    long jOptLong2 = jSONObject.optLong("viewHeight");
                    long jOptLong3 = jSONObject.optLong("width");
                    long jOptLong4 = jSONObject.optLong("height");
                    int iOptInt = jSONObject.optInt("isFlattenAnim");
                    String strOptString = jSONObject.optString("config");
                    if (jOptLong <= 0) {
                        jOptLong = -1;
                    }
                    jSONObject4.put("viewWidth", jOptLong);
                    if (jOptLong2 <= 0) {
                        jOptLong2 = -1;
                    }
                    jSONObject4.put("viewHeight", jOptLong2);
                    if (jOptLong3 <= 0) {
                        jOptLong3 = -1;
                    }
                    jSONObject4.put("width", jOptLong3);
                    if (jOptLong4 <= 0) {
                        jOptLong4 = -1;
                    }
                    jSONObject4.put("height", jOptLong4);
                    jSONObject4.put("flattenAnim", iOptInt);
                    jSONObject4.put("config", strOptString);
                }
                jSONObject2.put("metric", jSONObject4);
            }
            jSONObject2.put("image_url", str);
            int i3 = 1;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put("successRate", i2);
            jSONObject2.put("memoryCost", i);
            if (!z2) {
                i3 = 0;
            }
            jSONObject2.put("resourceFromMemoryCache", i3);
            return jSONObject2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
