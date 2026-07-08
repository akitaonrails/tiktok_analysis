package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020890cfn {
    public static final String LIZ(JSONObject jSONObject) {
        String strOptString;
        boolean z;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("carouselUpdateInfo");
        JSONObject jSONObjectOptJSONObject3 = null;
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("carousel_label_info")) != null) {
            jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("status_info");
        }
        StringBuilder sb = new StringBuilder("s=");
        sb.append(jSONObject.optBoolean("carouselSelected"));
        sb.append("|e=");
        sb.append(jSONObject.optBoolean("enable_label"));
        sb.append("|a=");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("current_product");
        if (jSONObjectOptJSONObject4 == null || (strOptString = jSONObjectOptJSONObject4.optString("anchor_title")) == null) {
            strOptString = "";
        }
        sb.append(strOptString);
        sb.append("|d=");
        sb.append(jSONObject.optBoolean("disable_label"));
        sb.append("|show=");
        boolean z2 = true;
        if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optBoolean("isShow")) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append("|ani=");
        if (jSONObjectOptJSONObject3 == null || !jSONObjectOptJSONObject3.optBoolean("animation")) {
            z2 = false;
        }
        sb.append(z2);
        return sb.toString();
    }

    public static final List<C1020880cfm> LIZIZ(JSONObject jSONObject) {
        int length;
        int length2;
        int length3;
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image_url_list");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("products_id_list");
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("slot_jump_model_list");
        if (jSONArrayOptJSONArray != null) {
            length = jSONArrayOptJSONArray.length();
        } else {
            length = 0;
        }
        if (jSONArrayOptJSONArray2 != null) {
            length2 = jSONArrayOptJSONArray2.length();
        } else {
            length2 = 0;
        }
        if (jSONArrayOptJSONArray3 != null) {
            length3 = jSONArrayOptJSONArray3.length();
        } else {
            length3 = 0;
        }
        int iMax = Math.max(length, Math.max(length2, length3));
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        for (int i = 0; i < iMax; i++) {
            String strOptString2 = null;
            if (jSONArrayOptJSONArray != null) {
                strOptString2 = jSONArrayOptJSONArray.optString(i);
            }
            String str = "";
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            if (jSONArrayOptJSONArray2 != null && (strOptString = jSONArrayOptJSONArray2.optString(i)) != null) {
                str = strOptString;
            }
            if (jSONArrayOptJSONArray3 != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray3.optJSONObject(i)) != null) {
                jSONObject2 = LJ(jSONObjectOptJSONObject);
            } else {
                jSONObject2 = new JSONObject();
            }
            c13dvLIZIZ.add(new C1020880cfm(strOptString2, jSONObject2, str, i));
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    public static final String LIZJ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        String strOptString;
        String strOptString2;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        int iOptInt;
        int iOptInt2;
        int iOptInt3;
        int iOptInt4;
        List<String> listLJIIIZ;
        String strLJJLIIIJ3;
        List<String> listLJIIIZ2;
        List<String> listLJIIIZ3;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("current_product");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("carouselUpdateInfo");
        if (jSONObjectOptJSONObject4 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("jigsaw_data")) == null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("jigsaw_data");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("jigsaw_layout");
        } else {
            jSONObjectOptJSONObject2 = null;
        }
        StringBuilder sb = new StringBuilder("i=");
        sb.append(jSONObject.optInt("current_index"));
        sb.append("|pid=");
        if (jSONObjectOptJSONObject3 != null) {
            strOptString = jSONObjectOptJSONObject3.optString("product_id");
        } else {
            strOptString = null;
        }
        String str = "";
        if (strOptString == null) {
            strOptString = "";
        }
        sb.append(strOptString);
        sb.append("|aid=");
        if (jSONObjectOptJSONObject3 == null || (strOptString2 = jSONObjectOptJSONObject3.optString("anchor_title")) == null) {
            strOptString2 = "";
        }
        sb.append(strOptString2);
        sb.append("|m=");
        sb.append(jSONObject.optString("main_image_url"));
        sb.append("|s=");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sub_image_list");
        if (jSONArrayOptJSONArray == null || (listLJIIIZ3 = LJIIIZ(jSONArrayOptJSONArray)) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(listLJIIIZ3, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        sb.append(strLJJLIIIJ);
        sb.append("|il=");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("image_url_list");
        if (jSONArrayOptJSONArray2 == null || (listLJIIIZ2 = LJIIIZ(jSONArrayOptJSONArray2)) == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(listLJIIIZ2, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ2 = "";
        }
        sb.append(strLJJLIIIJ2);
        sb.append("|pids=");
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("products_id_list");
        if (jSONArrayOptJSONArray3 != null && (listLJIIIZ = LJIIIZ(jSONArrayOptJSONArray3)) != null && (strLJJLIIIJ3 = C13LP.LJJLIIIJ(listLJIIIZ, ",", null, null, 0, null, null, 62)) != null) {
            str = strLJJLIIIJ3;
        }
        sb.append(str);
        sb.append("|jl=");
        int iOptInt5 = -1;
        if (jSONObjectOptJSONObject2 != null) {
            iOptInt = jSONObjectOptJSONObject2.optInt("width", -1);
        } else {
            iOptInt = -1;
        }
        sb.append(iOptInt);
        sb.append(',');
        if (jSONObjectOptJSONObject2 != null) {
            iOptInt2 = jSONObjectOptJSONObject2.optInt("height", -1);
        } else {
            iOptInt2 = -1;
        }
        sb.append(iOptInt2);
        sb.append(',');
        if (jSONObjectOptJSONObject2 != null) {
            iOptInt3 = jSONObjectOptJSONObject2.optInt("main_height", -1);
        } else {
            iOptInt3 = -1;
        }
        sb.append(iOptInt3);
        sb.append(',');
        if (jSONObjectOptJSONObject2 != null) {
            iOptInt4 = jSONObjectOptJSONObject2.optInt("sub_height", -1);
        } else {
            iOptInt4 = -1;
        }
        sb.append(iOptInt4);
        sb.append(',');
        if (jSONObjectOptJSONObject2 != null) {
            iOptInt5 = jSONObjectOptJSONObject2.optInt("sub_width", -1);
        }
        sb.append(iOptInt5);
        sb.append("|el=");
        sb.append(jSONObject.optBoolean("enable_label"));
        sb.append("|dl=");
        sb.append(jSONObject.optBoolean("disable_label"));
        sb.append("|sl=");
        sb.append(jSONObject.optBoolean("show_label"));
        sb.append("|lst=");
        sb.append(jSONObject.optInt("label_show_time"));
        sb.append("|ubl=");
        sb.append(jSONObject.optBoolean("use_backup_layout"));
        sb.append("|utb=");
        sb.append(jSONObject.optBoolean("use_text_backup"));
        return sb.toString();
    }

    public static final JSONArray LIZLLL(JSONArray jSONArray) {
        return new JSONArray(jSONArray.toString());
    }

    public static final JSONObject LJ(JSONObject jSONObject) {
        return new JSONObject(C786410Ut5.J3(jSONObject));
    }

    public static final JSONObject LJFF(Object obj) {
        Object c098200Yq;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        Object obj2 = null;
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            c098200Yq = new JSONObject((String) obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (JSONObject) obj2;
    }

    public static final Object LJII(Object obj) {
        if (obj instanceof JSONObject) {
            return LJIIIIZZ((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object objLJII = LJII(jSONArray.opt(i));
                if (objLJII != null) {
                    c13dvLIZIZ.add(objLJII);
                }
            }
            return C1697820uHc.LIZ(c13dvLIZIZ);
        }
        if (!Intrinsics.LJFF(obj, JSONObject.NULL)) {
            return obj;
        }
        return null;
    }

    public static final Map<String, Object> LJIIIIZZ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objLJII = LJII(jSONObject.opt(next));
            if (objLJII != null) {
                linkedHashMap.put(next, objLJII);
            }
        }
        return linkedHashMap;
    }

    public static final List<String> LJIIIZ(JSONArray jSONArray) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String strOptString = jSONArray.optString(i);
            if ((!a0.LJJJIL(strOptString)) && strOptString != null) {
                c13dvLIZIZ.add(strOptString);
            }
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e A[PHI: r1
      0x003e: PHI (r1v2 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:22:0x003b, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJI(java.lang.String r5, org.json.JSONObject r6) {
        /*
            java.lang.String r0 = "carouselUpdateInfo"
            org.json.JSONObject r1 = r6.optJSONObject(r0)
            if (r1 == 0) goto L40
            java.lang.String r0 = "carousel_label_info"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L40
            java.lang.String r0 = "status_info"
            org.json.JSONObject r4 = r1.optJSONObject(r0)
        L16:
            r3 = 0
            r2 = 1
            if (r4 == 0) goto L39
            java.lang.String r0 = "animation"
            boolean r0 = r4.optBoolean(r0)
            if (r0 != r2) goto L3a
            r1 = 1
        L23:
            java.lang.String r0 = "isShow"
            boolean r0 = r4.optBoolean(r0)
            if (r0 != r2) goto L3e
            r0 = 1
        L2c:
            if (r1 == 0) goto L39
            if (r0 == 0) goto L39
            boolean r0 = kotlin.text.a0.LJJJIL(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L39
            r3 = 1
        L39:
            return r3
        L3a:
            r1 = 0
            if (r4 == 0) goto L3e
            goto L23
        L3e:
            r0 = 0
            goto L2c
        L40:
            r4 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1020890cfn.LJI(java.lang.String, org.json.JSONObject):boolean");
    }
}
