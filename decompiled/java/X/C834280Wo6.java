package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wo6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834280Wo6 {
    public static final JSONObject LJFF;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final List<String> LJ;

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiVersion", 2);
        jSONObject.put("apiVersionMinor", 0);
        LJFF = jSONObject;
    }

    public static JSONObject LIZIZ(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "BANK_ACCOUNT");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "PIX");
        JSONObject jSONObject3 = new JSONObject();
        if (str != null) {
            jSONObject3.put("dynamicQrCode", str);
        }
        jSONObject2.put("parameters", jSONObject3);
        jSONObject.put("processingSpecification", jSONObject2);
        return jSONObject;
    }

    public final JSONObject LIZ(List<String> list, boolean z) throws JSONException {
        JSONArray jSONArray;
        List<String> list2;
        JSONArray jSONArray2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (this.LJ != null && (!r0.isEmpty())) {
            jSONArray = new JSONArray((Collection) this.LJ);
        } else {
            jSONArray = new JSONArray((Collection) C834310Wo9.LIZJ);
        }
        jSONObject2.put("allowedAuthMethods", jSONArray);
        if (Intrinsics.LJFF(this.LIZJ.toLowerCase(Locale.ROOT), "br")) {
            list2 = C834310Wo9.LIZIZ;
        } else {
            list2 = C834310Wo9.LIZ;
        }
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (list.contains(str)) {
                    arrayList.add(str);
                }
            }
            jSONArray2 = new JSONArray((Collection) arrayList);
        } else {
            jSONArray2 = new JSONArray((Collection) list2);
        }
        jSONObject2.put("allowedCardNetworks", jSONArray2);
        jSONObject2.put("assuranceDetailsRequired", true);
        if (z) {
            jSONObject2.put("allowPrepaidCards", false);
        }
        jSONObject.put("type", "CARD");
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public C834280Wo6(String str, String str2, boolean z, String str3, List list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = list;
    }
}
