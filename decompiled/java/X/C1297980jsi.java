package X;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297980jsi {
    public static final JavaOnlyArray LIZ(JSONArray jSONArray) throws JSONException {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                javaOnlyArray.pushMap(LIZIZ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyArray.pushArray(LIZ((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyArray.pushDouble(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyArray.pushDouble(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyArray.pushString((String) obj);
            } else if (obj instanceof byte[]) {
                javaOnlyArray.pushByteArray((byte[]) obj);
            } else {
                javaOnlyArray.pushString(obj.toString());
            }
        }
        return javaOnlyArray;
    }

    public static final JavaOnlyMap LIZIZ(JSONObject jSONObject) throws JSONException {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                javaOnlyMap.putMap(next, LIZIZ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                javaOnlyMap.putArray(next, LIZ((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                javaOnlyMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyMap.putDouble(next, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyMap.putDouble(next, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyMap.putString(next, (String) obj);
            } else if (obj instanceof byte[]) {
                javaOnlyMap.putByteArray(next, (byte[]) obj);
            } else {
                javaOnlyMap.putString(next, obj.toString());
            }
        }
        return javaOnlyMap;
    }
}
