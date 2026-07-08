package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QF2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QF2 {
    public static final C0QF2 LIZ = new C0QF2();

    public static void LIZ(HashMap map) throws JSONException {
        JSONObject jSONObject;
        String strLJJLIIIJ;
        Type type;
        Iterable iterable;
        if (map.containsKey("entrance_info")) {
            jSONObject = new JSONObject(String.valueOf(map.get("entrance_info")));
        } else {
            jSONObject = null;
        }
        C1766860w4y c1766860w4y = C1766860w4y.LIZ;
        String[] strArrLIZ = C1018203yW.LIZ();
        String[] strArr = (String[]) Arrays.copyOf(strArrLIZ, strArrLIZ.length);
        c1766860w4y.getClass();
        Map mapLIZJ = C1766860w4y.LIZJ(strArr);
        if (mapLIZJ != null) {
            for (Map.Entry entry : mapLIZJ.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "search_pre_product_id")) {
                    String str = (String) entry.getValue();
                    if (str != null && str.length() > 0 && jSONObject != null) {
                        String str2 = (String) entry.getKey();
                        try {
                            Gson gsonLJFF = C1741890vQh.LJFF();
                            C1120604Zw.LIZ.getClass();
                            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                C13JX c13jx = KTypeProjection.LIZJ;
                                C13JW c13jwLJII = C13LE.LJII(String.class);
                                c13jx.getClass();
                                type = C2371409Qy.LIZJ(C13LE.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(c13jwLJII))));
                            } else {
                                type = new TypeToken<List<String>>() { // from class: X.0QF3
                                }.getType();
                            }
                            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                            if (!C19719512Dh.LJI(objFromJson)) {
                                objFromJson = null;
                            }
                            iterable = (Iterable) objFromJson;
                        } catch (s e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (iterable == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, null, 62)) == null) {
                            strLJJLIIIJ = "";
                        }
                        jSONObject.put(str2, strLJJLIIIJ);
                    }
                } else if (C293680BfC.LIZ() && (Intrinsics.LJFF(entry.getKey(), "search_id") || Intrinsics.LJFF(entry.getKey(), "search_result_id"))) {
                    if (jSONObject != null) {
                        C0QF2 c0qf2 = LIZ;
                        String str3 = (String) entry.getKey();
                        c0qf2.getClass();
                        if (jSONObject.has(str3)) {
                            String string = JSONObjectProtectorUtils.getString(jSONObject, str3);
                            if (string.length() <= 0 || string.length() == 0 || Intrinsics.LJFF(string, "null")) {
                            }
                        }
                    }
                    String str4 = (String) entry.getValue();
                    if (str4 != null && str4.length() > 0 && jSONObject != null) {
                        jSONObject.put((String) entry.getKey(), str4);
                    }
                } else {
                    String str5 = (String) entry.getValue();
                    if (str5 != null && str5.length() > 0 && jSONObject != null) {
                        jSONObject.put((String) entry.getKey(), str5);
                    }
                }
            }
        }
        C1766860w4y.LIZ.getClass();
        String strLIZIZ = C1766860w4y.LIZIZ("jump_search_id");
        if (C123100dR.LIZ(strLIZIZ) && strLIZIZ != null && ((Boolean) C134800fK.LIZ.getValue()).booleanValue()) {
            if (jSONObject != null) {
                jSONObject.put("search_id", strLIZIZ);
            } else {
                return;
            }
        } else if (jSONObject == null) {
            return;
        }
        map.put("entrance_info", jSONObject);
    }

    public static int LIZIZ(JSONObject jSONObject, String str, Map map) throws JSONException {
        String str2;
        String str3;
        Object obj = map.get(str);
        String str4 = null;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        Object obj2 = map.get("entrance_info");
        if ((obj2 instanceof String) && (str3 = (String) obj2) != null) {
            try {
                Object obj3 = new JSONObject(str3).get(str);
                if (obj3 instanceof String) {
                    str4 = (String) obj3;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        jSONObject.put(str, str4);
        if (str2 != null && str2.length() != 0) {
            if (str4 != null && str4.length() != 0) {
                if (Intrinsics.LJFF(str2, str4)) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }
}
