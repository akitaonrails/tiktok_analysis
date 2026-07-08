package X;

import com.lynx.base.log.LynxLog;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290940jhM {
    public final String LIZ;
    public final HashMap<String, Long> LIZIZ;

    public C1290940jhM(String str) {
        this.LIZ = str;
        new HashMap();
        this.LIZIZ = new HashMap<>();
    }

    public final void LIZ(String str) throws JSONException {
        if (str != null && this.LIZIZ.containsKey(str)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = this.LIZIZ.get(str);
            if (l != null) {
                long jLongValue = jCurrentTimeMillis - l.longValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resource_url", str);
                jSONObject.put("lottie_url", str);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cost", jLongValue);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("virtual_aid", this.LIZ);
                C1520380pfQ.LIZ.getClass();
                C1520380pfQ.LIZIZ(str, "lottie_fetch_total_cost", jSONObject, jSONObject2, jSONObject3);
            }
        }
    }

    public final void LIZIZ(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "1");
        jSONObject.put("resource_url", str2);
        jSONObject.put("lottie_url", str);
        jSONObject.put("message", str3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", this.LIZ);
        C1520380pfQ.LIZ.getClass();
        C1520380pfQ.LIZIZ(str, "lottie_fetch_error", jSONObject, null, jSONObject2);
    }

    public final void LIZJ(String str, String str2, Float f, Float f2, Float f3, Float f4, Boolean bool) throws JSONException {
        if (!Intrinsics.LIZLLL(f, 0.0f)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bid", str2);
            jSONObject.put("lottie_src", str);
            jSONObject.put("loop", String.valueOf(bool));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("frame_rate", f2);
            jSONObject2.put("frame_num", f3);
            jSONObject2.put("real_frame", f);
            jSONObject2.put("ideal_time", f4);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("virtual_aid", this.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lottieUrl is ");
            sbLIZ.append(str);
            sbLIZ.append(", bid is ");
            sbLIZ.append(str2);
            sbLIZ.append(", realFrame is ");
            sbLIZ.append(f);
            LynxLog.d("byted-lottie", C2188811AlT.LIZIZ(sbLIZ));
            C1520380pfQ.LIZ.getClass();
            C1520380pfQ.LIZIZ(str, "lottie_animation_performance", jSONObject, jSONObject2, jSONObject3);
        }
    }
}
