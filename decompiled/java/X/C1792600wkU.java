package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792600wkU {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C1792600wkU(JSONObject jSONObject) {
        this.LIZLLL = jSONObject.optString("billingPeriod");
        this.LIZJ = jSONObject.optString("priceCurrencyCode");
        this.LIZ = jSONObject.optString("formattedPrice");
        this.LIZIZ = jSONObject.optLong("priceAmountMicros");
        this.LJFF = jSONObject.optInt("recurrenceMode");
        this.LJ = jSONObject.optInt("billingCycleCount");
    }
}
