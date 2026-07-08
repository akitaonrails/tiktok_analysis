package com.android.billingclient.api;

import X.C1794980woK;
import X.C1795180woe;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class Purchase {
    public final String LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.LIZ));
    }

    public final C1795180woe LIZ() {
        JSONObject jSONObject = this.LIZJ;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new C1795180woe(strOptString2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0woK] */
    public final C1794980woK LIZIZ() {
        if (this.LIZJ.optJSONObject("autoPayDetails") == null) {
            return null;
        }
        return new Object() { // from class: X.0woK
        };
    }

    public final List<String> LIZJ() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final int LIZLLL() {
        return this.LIZJ.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public final String LJ() {
        JSONObject jSONObject = this.LIZJ;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.LIZ, purchase.LIZ) && TextUtils.equals(this.LIZIZ, purchase.LIZIZ)) {
            return true;
        }
        return false;
    }

    public Purchase(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = new JSONObject(str);
    }
}
