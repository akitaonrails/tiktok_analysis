package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1975007oS {
    public static String LIZIZ(Object obj) {
        try {
            Object objLIZ = LIZ(obj, new IdentityHashMap());
            if (objLIZ instanceof JSONObject) {
                return C786410Ut5.J3((JSONObject) objLIZ);
            }
            if (objLIZ instanceof JSONArray) {
                return ((JSONArray) objLIZ).toString();
            }
            return String.valueOf(objLIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static Object LIZ(Object obj, Map<Object, Boolean> map) throws JSONException {
        boolean z;
        if (obj == null) {
            return JSONObject.NULL;
        }
        Class<?> cls = obj.getClass();
        int i = 0;
        if (!cls.isPrimitive() && cls != Byte.class && cls != Short.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != Boolean.class && cls != Character.class) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !(obj instanceof String)) {
            IdentityHashMap identityHashMap = (IdentityHashMap) map;
            if (identityHashMap.containsKey(obj)) {
                return "↩ (already visited)";
            }
            identityHashMap.put(obj, Boolean.TRUE);
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                return obj;
            }
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    jSONArray.put(LIZ(it2.next(), map));
                }
                return jSONArray;
            }
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put(String.valueOf(entry.getKey()), LIZ(entry.getValue(), map));
                }
                return jSONObject;
            }
            if (cls.isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                while (i < length) {
                    jSONArray2.put(LIZ(Array.get(obj, i), map));
                    i++;
                }
                return jSONArray2;
            }
            JSONObject jSONObject2 = new JSONObject();
            Field[] declaredFields = cls.getDeclaredFields();
            int length2 = declaredFields.length;
            while (i < length2) {
                Field field = declaredFields[i];
                field.setAccessible(true);
                try {
                    jSONObject2.put(field.getName(), LIZ(field.get(obj), map));
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                i++;
            }
            return jSONObject2;
        }
        return obj;
    }
}
