package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335740DEe {
    public static final JSONObject LIZ(C335760DEg c335760DEg, C334300D8q c334300D8q) throws JSONException {
        String str;
        String str2;
        Object obj = c335760DEg.LIZ;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(FollowStatusChangeMethod.PARAM_UID, c335760DEg.LIZ);
        EnumC335980DFc enumC335980DFc = c335760DEg.LIZIZ;
        int[] iArr = C335970DFb.LIZ;
        int i = iArr[enumC335980DFc.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "gpay";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "shopify.card";
        }
        jSONObject4.put("handler_id", str);
        int i2 = iArr[c335760DEg.LIZIZ.ordinal()];
        String lowerCase = "google_pay";
        if (i2 != 1) {
            if (i2 == 2) {
                str2 = "google_pay";
            } else {
                throw new C1954807lC();
            }
        } else {
            str2 = "card";
        }
        jSONObject4.put("type", str2);
        jSONObject4.put("selected", true);
        JSONObject jSONObject5 = new JSONObject();
        int i3 = iArr[c335760DEg.LIZIZ.ordinal()];
        String str3 = "";
        if (i3 != 1) {
            if (i3 != 2) {
                throw new C1954807lC();
            }
        } else {
            String str4 = c335760DEg.LIZJ;
            if (str4 == null || (lowerCase = str4.toLowerCase(Locale.ROOT)) == null) {
                lowerCase = "";
            }
        }
        jSONObject5.put("brand", lowerCase);
        int i4 = iArr[c335760DEg.LIZIZ.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                str3 = "0000";
            } else {
                throw new C1954807lC();
            }
        } else {
            String str5 = c335760DEg.LIZLLL;
            if (str5 != null) {
                str3 = str5;
            }
        }
        jSONObject5.put("last_digits", str3);
        jSONObject4.put("display", jSONObject5);
        if (c334300D8q != null) {
            jSONObject4.put("billing_address", c334300D8q.LIZ());
        }
        jSONArray.put(jSONObject4);
        jSONObject3.put("instruments", jSONArray);
        jSONObject3.put("selected_instrument_id", obj);
        jSONObject2.put("payment", jSONObject3);
        jSONObject.put("checkout", jSONObject2);
        return jSONObject;
    }
}
