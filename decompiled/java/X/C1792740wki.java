package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792740wki {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final List LJIIIIZZ;
    public final List LJIIIZ;

    public final C1792660wka LIZ() {
        List list = this.LJIIIZ;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return null;
        }
        return (C1792660wka) ListProtector.get(list, 0);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        List list = this.LJIIIIZZ;
        String string = this.LIZIZ.toString();
        String strValueOf = String.valueOf(list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductDetails{jsonString='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', parsedJson=");
        sbLIZ.append(string);
        sbLIZ.append(", productId='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', productType='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("', title='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', productDetailsToken='");
        sbLIZ.append(this.LJI);
        sbLIZ.append("', subscriptionOfferDetails=");
        sbLIZ.append(strValueOf);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1792740wki(String str) {
        ArrayList arrayList;
        this.LIZ = str;
        JSONObject jSONObject = new JSONObject(str);
        this.LIZIZ = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.LIZJ = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.LIZLLL = strOptString2;
        if (!TextUtils.isEmpty(strOptString)) {
            if (!TextUtils.isEmpty(strOptString2)) {
                this.LJ = jSONObject.optString("title");
                jSONObject.optString("name");
                this.LJFF = jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.LJI = jSONObject.optString("skuDetailsToken");
                this.LJII = jSONObject.optString("serializedDocid");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList2.add(new C1792640wkY(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i)));
                    }
                    this.LJIIIIZZ = arrayList2;
                } else {
                    if (!strOptString2.equals("subs") && !strOptString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.LJIIIIZZ = arrayList;
                }
                JSONObject jSONObjectOptJSONObject = this.LIZIZ.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray jSONArrayOptJSONArray2 = this.LIZIZ.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (jSONArrayOptJSONArray2 == null) {
                    if (jSONObjectOptJSONObject != null) {
                        arrayList3.add(new C1792660wka(jSONObjectOptJSONObject));
                        this.LJIIIZ = arrayList3;
                        return;
                    } else {
                        this.LJIIIZ = null;
                        return;
                    }
                }
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    arrayList3.add(new C1792660wka(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray2, i2)));
                }
                this.LJIIIZ = arrayList3;
                return;
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1792740wki)) {
            return false;
        }
        return TextUtils.equals(this.LIZ, ((C1792740wki) obj).LIZ);
    }
}
