package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792660wka {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List LJI;
    public final String LJII;
    public final C1792690wkd LJIIIIZZ;
    public final C1792620wkW LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1792660wka(JSONObject jSONObject) {
        C1792690wkd c1792690wkd;
        this.LIZ = jSONObject.optString("formattedPrice");
        this.LIZIZ = jSONObject.optLong("priceAmountMicros");
        this.LIZJ = jSONObject.optString("priceCurrencyCode");
        String strOptString = jSONObject.optString("offerIdToken");
        this.LIZLLL = true == strOptString.isEmpty() ? null : strOptString;
        String strOptString2 = jSONObject.optString("offerId");
        this.LJ = true == strOptString2.isEmpty() ? null : strOptString2;
        String strOptString3 = jSONObject.optString("purchaseOptionId");
        this.LJFF = true == strOptString3.isEmpty() ? null : strOptString3;
        jSONObject.optInt("offerType");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        this.LJI = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                this.LJI.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i));
            }
        }
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (jSONObjectOptJSONObject != null) {
            new Object(jSONObjectOptJSONObject) { // from class: X.0wkb
                {
                    if (jSONObjectOptJSONObject.has("percentageDiscount")) {
                        jSONObjectOptJSONObject.optInt("percentageDiscount");
                    }
                    final JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("discountAmount");
                    if (jSONObjectOptJSONObject2 != null) {
                        new Object(jSONObjectOptJSONObject2) { // from class: X.0wke
                            {
                                jSONObjectOptJSONObject2.optString("formattedDiscountAmount");
                                jSONObjectOptJSONObject2.optLong("discountAmountMicros");
                                jSONObjectOptJSONObject2.optString("discountAmountCurrencyCode");
                            }
                        };
                    }
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
        if (jSONObjectOptJSONObject2 != null) {
            new Object(jSONObjectOptJSONObject2) { // from class: X.0wkg
                {
                    if (jSONObjectOptJSONObject2.has("startTimeMillis")) {
                        jSONObjectOptJSONObject2.optLong("startTimeMillis");
                    }
                    if (jSONObjectOptJSONObject2.has("endTimeMillis")) {
                        jSONObjectOptJSONObject2.optLong("endTimeMillis");
                    }
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (jSONObjectOptJSONObject3 != null) {
            new Object(jSONObjectOptJSONObject3) { // from class: X.0wkf
                {
                    JSONObjectProtectorUtils.getInt(jSONObjectOptJSONObject3, "maximumQuantity");
                    JSONObjectProtectorUtils.getInt(jSONObjectOptJSONObject3, "remainingQuantity");
                }
            };
        }
        this.LJII = jSONObject.optString("serializedDocid");
        final JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
        if (jSONObjectOptJSONObject4 != null) {
            new Object(jSONObjectOptJSONObject4) { // from class: X.0wkh
                {
                    JSONObjectProtectorUtils.getLong(jSONObjectOptJSONObject4, "preorderReleaseTimeMillis");
                    JSONObjectProtectorUtils.getLong(jSONObjectOptJSONObject4, "preorderPresaleEndTimeMillis");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
        if (jSONObjectOptJSONObject5 != null) {
            new Object(jSONObjectOptJSONObject5) { // from class: X.0wkc
                {
                    JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject5, "rentalPeriod");
                    jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
        if (jSONObjectOptJSONObject6 == null) {
            c1792690wkd = 0;
        } else {
            c1792690wkd = new Object(jSONObjectOptJSONObject6) { // from class: X.0wkd
                {
                    JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject6, "type");
                }
            };
        }
        this.LJIIIIZZ = c1792690wkd;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
        this.LJIIIZ = jSONArrayOptJSONArray2 != null ? new C1792620wkW(jSONArrayOptJSONArray2) : null;
    }
}
