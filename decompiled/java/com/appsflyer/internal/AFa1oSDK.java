package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AFa1oSDK {
    public static AFg1cSDK AFInAppEventParameterName(Context context) {
        if (context instanceof Activity) {
            return AFg1cSDK.activity;
        }
        if (context instanceof Application) {
            return AFg1cSDK.application;
        }
        return AFg1cSDK.other;
    }

    public static Object AFInAppEventType(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    jSONArray.put(AFInAppEventType(it2.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(AFInAppEventType(Array.get(obj, i)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                return AFInAppEventType((Map<String, ?>) obj);
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                return obj.toString();
            }
            return obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return JSONObject.NULL;
        }
    }

    public static JSONObject values(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Map<String, Object> AFInAppEventType(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objAFInAppEventType = jSONObject.get(next);
            if (objAFInAppEventType instanceof JSONArray) {
                objAFInAppEventType = AFInAppEventType((JSONArray) objAFInAppEventType);
            } else if (objAFInAppEventType instanceof JSONObject) {
                objAFInAppEventType = AFInAppEventType((JSONObject) objAFInAppEventType);
            }
            map.put(next, objAFInAppEventType);
        }
        return map;
    }

    public static JSONObject AFInAppEventType(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFInAppEventType(entry.getValue()));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    public static List<Object> AFInAppEventType(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objAFInAppEventType = jSONArray.get(i);
            if (objAFInAppEventType instanceof JSONArray) {
                objAFInAppEventType = AFInAppEventType((JSONArray) objAFInAppEventType);
            } else if (objAFInAppEventType instanceof JSONObject) {
                objAFInAppEventType = AFInAppEventType((JSONObject) objAFInAppEventType);
            }
            arrayList.add(objAFInAppEventType);
        }
        return arrayList;
    }
}
