package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.140H, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C140H {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C140S LIZ;

    public C140H(C140S c140s) {
        this.LIZ = c140s;
    }

    public static void LIZ(C140S c140s, List list) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String strOptString;
        String strOptString2;
        ArrayList arrayList = (ArrayList) list;
        boolean z = true;
        if (!arrayList.isEmpty()) {
            return;
        }
        if (c140s.LIZJ == null) {
            JSONArray jSONArrayOptJSONArray2 = c140s.LIZ.optJSONArray("assertions");
            if (jSONArrayOptJSONArray2 != null) {
                int length = jSONArrayOptJSONArray2.length();
                loop0: for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null && Intrinsics.LJFF("c2pa.actions.v2", jSONObjectOptJSONObject2.optString("label")) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("data")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("actions")) != null) {
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject3 != null && (strOptString = jSONObjectOptJSONObject3.optString("action")) != null && (strOptString2 = jSONObjectOptJSONObject3.optString("digitalSourceType")) != null && Intrinsics.LJFF(strOptString, "c2pa.created") && (Intrinsics.LJFF(strOptString2, "http://cv.iptc.org/newscodes/digitalsourcetype/trainedAlgorithmicMedia") || Intrinsics.LJFF(strOptString2, "https://cv.iptc.org/newscodes/digitalsourcetype/trainedAlgorithmicMedia"))) {
                                break loop0;
                            }
                        }
                    }
                }
                z = false;
                c140s.LIZJ = Boolean.valueOf(z);
            } else {
                z = false;
                c140s.LIZJ = Boolean.valueOf(z);
            }
        }
        if (Intrinsics.LJFF(c140s.LIZJ, Boolean.TRUE)) {
            return;
        }
        if (c140s.LIZIZ.isEmpty()) {
            arrayList.add(c140s);
            return;
        }
        Iterator<C140S> it2 = c140s.LIZIZ.iterator();
        while (it2.hasNext()) {
            LIZ(it2.next(), list);
        }
    }
}
