package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.IDLXDynamic;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2348609Ie {
    public static final Gson LIZ = new Gson();

    public static List LIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (objOpt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (objOpt instanceof Integer) {
                arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(jSONArray, i)));
            } else if (objOpt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (objOpt instanceof JSONObject) {
                arrayList.add(LIZIZ(jSONArray.optJSONObject(i)));
            } else if (objOpt instanceof JSONArray) {
                arrayList.add(LIZ(jSONArray.optJSONArray(i)));
            } else if (objOpt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            } else if (Intrinsics.LJFF(jSONArray.opt(i), JSONObject.NULL)) {
                arrayList.add(null);
            } else {
                arrayList.add(jSONArray.opt(i).toString());
            }
        }
        return arrayList;
    }

    public static Map LIZIZ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof Long) {
                linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (objOpt instanceof Double) {
                linkedHashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (objOpt instanceof Integer) {
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (objOpt instanceof String) {
                linkedHashMap.put(next, jSONObject.optString(next));
            } else if (objOpt instanceof JSONObject) {
                linkedHashMap.put(next, LIZIZ(jSONObject.optJSONObject(next)));
            } else if (objOpt instanceof JSONArray) {
                linkedHashMap.put(next, LIZ(jSONObject.optJSONArray(next)));
            } else if (objOpt instanceof Boolean) {
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            } else {
                String string = null;
                if (Intrinsics.LJFF(jSONObject.opt(next), JSONObject.NULL)) {
                    linkedHashMap.put(next, null);
                } else {
                    Object objOpt2 = jSONObject.opt(next);
                    if (objOpt2 != null) {
                        string = objOpt2.toString();
                    }
                    linkedHashMap.put(next, string);
                }
            }
        }
        return linkedHashMap;
    }

    public static JSONArray LIZJ(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Float) {
                jSONArray.put(((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                jSONArray.put(((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof Map) {
                try {
                    jSONArray.put(LIZLLL((Map) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (obj instanceof List) {
                try {
                    jSONArray.put(LIZJ((List) obj));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else if (obj instanceof IDLXDynamic) {
                jSONArray.put(C1974707oP.LIZ((IDLXDynamic) obj));
            }
        }
        return jSONArray;
    }

    public static JSONObject LIZLLL(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                jSONObject.put(str, ((Number) value).longValue());
            } else if (value instanceof Float) {
                jSONObject.put(str, ((Number) value).floatValue());
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Map) {
                try {
                    jSONObject.put(str, LIZLLL((Map) value));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (value instanceof List) {
                try {
                    jSONObject.put(str, LIZJ((List) value));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else if (value instanceof IDLXDynamic) {
                jSONObject.put(str, C1974707oP.LIZ((IDLXDynamic) value));
            }
        }
        return jSONObject;
    }

    public static String LJ(Object obj) {
        return GsonProtectorUtils.toJson(LIZ, obj);
    }
}
