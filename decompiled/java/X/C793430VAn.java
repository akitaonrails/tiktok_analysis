package X;

import android.text.TextUtils;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793430VAn {
    public static final AtomicInteger LIZ = new AtomicInteger(0);

    public static void LIZLLL(C793730VBr c793730VBr) {
        for (JSONObject jSONObject : (ArrayList) LJ(c793730VBr)) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("DATA_DOCTOR");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.put("DATA_SEND_RESULT", 200);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZIZ("DATA_SEND_SUCCESS", jSONObject);
            LIZIZ("DATA_SEND_END", jSONObject);
        }
    }

    public static List<JSONObject> LJ(C793730VBr c793730VBr) {
        JSONArray jSONArrayOptJSONArray;
        if (c793730VBr.LIZ()) {
            return null;
        }
        String str = new String(c793730VBr.LIZ, 0, c793730VBr.LIZIZ);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("list")) {
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("list");
                if (jSONArrayOptJSONArray2 == null) {
                    return null;
                }
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray2, i);
                    if (jSONObject2 != null && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("data")) != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            arrayList.add(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i2));
                        }
                    }
                }
            } else {
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("data");
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    arrayList.add(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray3, i3));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return arrayList;
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            DoctorManager.getInstance().LIZ(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(C793730VBr c793730VBr, JSONObject jSONObject) {
        for (JSONObject jSONObject2 : (ArrayList) LJ(c793730VBr)) {
            try {
                JSONObject jSONObject3 = new JSONObject(C786410Ut5.J3(jSONObject));
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("DATA_DOCTOR");
                if (jSONObjectOptJSONObject != null) {
                    jSONObject3.put("DATA_DOCTOR", jSONObjectOptJSONObject);
                }
                LIZIZ("DATA_SEND_RESPONSE", jSONObject3);
                LIZIZ("DATA_SEND_RESPONSE_NEW", jSONObject2.put("response", jSONObject3));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZ(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("DATA_DOCTOR");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        try {
            if (jSONObjectOptJSONObject.optInt("DATA_ID", -1) == -1) {
                jSONObjectOptJSONObject.put("DATA_ID", LIZ.incrementAndGet());
            }
            jSONObjectOptJSONObject.put("DATA_PROCESS", C2162308dZ.LIZ(C792190V5t.LIZIZ));
            jSONObjectOptJSONObject.put("DATA_TYPE", str);
            jSONObjectOptJSONObject.put("DATA_SAMPLE", z);
            jSONObjectOptJSONObject.put("DATA_AID", C792420V6q.LIZIZ());
            jSONObject.put("DATA_DOCTOR", jSONObjectOptJSONObject);
            JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
            DoctorManager.getInstance().LIZ("DATA_RECEIVE", jSONObject2);
            DoctorManager.getInstance().LIZ("DATA_CACHE", jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
