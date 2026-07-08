package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792640wkY {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C1792620wkW LIZLLL;
    public final List LJ;

    public C1792640wkY(JSONObject jSONObject) {
        this.LIZ = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.LIZIZ = true == strOptString.isEmpty() ? null : strOptString;
        this.LIZJ = JSONObjectProtectorUtils.getString(jSONObject, "offerIdToken");
        this.LIZLLL = new C1792620wkW(JSONObjectProtectorUtils.getJSONArray(jSONObject, "pricingPhases"));
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject != null) {
            new Object(jSONObjectOptJSONObject) { // from class: X.0wkZ
                {
                    JSONObjectProtectorUtils.getInt(jSONObjectOptJSONObject, "commitmentPaymentsCount");
                    jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            new Object(jSONObjectOptJSONObject2) { // from class: X.0wkX
                {
                    JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject2, "productId");
                    jSONObjectOptJSONObject2.optString("title");
                    jSONObjectOptJSONObject2.optString("name");
                    jSONObjectOptJSONObject2.optString("description");
                    jSONObjectOptJSONObject2.optString("basePlanId");
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                    if (jSONObjectOptJSONObject3 != null) {
                        new C1792600wkU(jSONObjectOptJSONObject3);
                    }
                }
            };
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i));
            }
        }
        this.LJ = arrayList;
    }
}
