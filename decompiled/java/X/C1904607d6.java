package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07d6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1904607d6 {
    public static final String LIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Double) {
            Number number = (Number) obj;
            long jDoubleValue = (long) number.doubleValue();
            if (number.doubleValue() == jDoubleValue) {
                return String.valueOf(jDoubleValue);
            }
            return String.valueOf(number.doubleValue());
        }
        if (obj instanceof Float) {
            Number number2 = (Number) obj;
            long jFloatValue = (long) number2.floatValue();
            if (number2.floatValue() == jFloatValue) {
                return String.valueOf(jFloatValue);
            }
            return String.valueOf(number2.floatValue());
        }
        if (obj instanceof Long) {
            return String.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Integer) {
            return String.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Short) {
            return String.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Byte) {
            return String.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return String.valueOf(((Boolean) obj).booleanValue());
        }
        if (!(obj instanceof Character)) {
            return null;
        }
        return String.valueOf(((Character) obj).charValue());
    }

    public static final List<Object> LIZIZ(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(LIZJ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(LIZIZ((JSONArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> LIZJ(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                linkedHashMap.put(next, LIZJ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                linkedHashMap.put(next, LIZIZ((JSONArray) obj));
            } else {
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }

    public static final boolean LIZLLL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            if (((CharSequence) obj).length() <= 0) {
                return false;
            }
        } else {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                double dDoubleValue = ((Number) obj).doubleValue();
                if (dDoubleValue == 0.0d || Double.isNaN(dDoubleValue)) {
                    return false;
                }
            }
        }
        return true;
    }
}
