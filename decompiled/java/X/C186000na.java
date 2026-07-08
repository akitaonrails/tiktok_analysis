package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C186000na {
    public static final void LIZ(int i, String str) throws JSONException {
        C185100nR c185100nR = C185100nR.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str);
        C185100nR.LIZIZ(c185100nR, "sensor_status", jSONObject, null, 12);
    }
}
