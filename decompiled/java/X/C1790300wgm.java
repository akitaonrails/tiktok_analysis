package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790300wgm {
    public static void LIZ(C1781140wS0 c1781140wS0, AbstractC1790420wgy abstractC1790420wgy) {
        boolean z;
        abstractC1790420wgy.LIZLLL((byte) 123);
        abstractC1790420wgy.LIZ("\"ts\":");
        abstractC1790420wgy.LIZJ(c1781140wS0.LIZ);
        abstractC1790420wgy.LIZ(",\"page\":\"");
        abstractC1790420wgy.LJ(c1781140wS0.LIZIZ);
        byte b = (byte) 34;
        abstractC1790420wgy.LIZLLL(b);
        abstractC1790420wgy.LIZ(",\"state\":\"");
        abstractC1790420wgy.LJ(c1781140wS0.LIZJ);
        abstractC1790420wgy.LIZLLL(b);
        Iterator<Map.Entry<String, Map<String, Object>>> it2 = c1781140wS0.LIZLLL.entrySet().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, Map<String, Object>> next = it2.next();
            String key = next.getKey();
            Map<String, Object> value = next.getValue();
            byte b2 = (byte) 44;
            abstractC1790420wgy.LIZLLL(b2);
            abstractC1790420wgy.LIZLLL(b);
            abstractC1790420wgy.LIZ(key);
            abstractC1790420wgy.LIZ("\":{");
            for (Map.Entry<String, Object> entry : value.entrySet()) {
                String key2 = entry.getKey();
                Object value2 = entry.getValue();
                if (!z) {
                    abstractC1790420wgy.LIZLLL(b2);
                }
                abstractC1790420wgy.LIZLLL(b);
                abstractC1790420wgy.LIZ(key2);
                abstractC1790420wgy.LIZ("\":");
                LIZIZ(value2, abstractC1790420wgy);
                z = false;
            }
            abstractC1790420wgy.LIZLLL((byte) 125);
        }
        Map<String, Object> map = c1781140wS0.LJ;
        if (map != null) {
            abstractC1790420wgy.LIZ(",\"extras\":{");
            for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                String key3 = entry2.getKey();
                Object value3 = entry2.getValue();
                if (!z) {
                    abstractC1790420wgy.LIZLLL((byte) 44);
                }
                abstractC1790420wgy.LIZLLL(b);
                abstractC1790420wgy.LJ(key3);
                abstractC1790420wgy.LIZ("\":");
                LIZIZ(value3, abstractC1790420wgy);
                z = false;
            }
            abstractC1790420wgy.LIZLLL((byte) 125);
        }
        abstractC1790420wgy.LIZLLL((byte) 125);
    }

    public static void LIZIZ(Object obj, AbstractC1790420wgy abstractC1790420wgy) {
        String str;
        if (obj instanceof Long) {
            abstractC1790420wgy.LIZJ(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            abstractC1790420wgy.LIZJ(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Double) {
            abstractC1790420wgy.LIZIZ(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            abstractC1790420wgy.LIZIZ(((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            abstractC1790420wgy.getClass();
            if (zBooleanValue) {
                str = "true";
            } else {
                str = "false";
            }
            abstractC1790420wgy.LIZ(str);
            return;
        }
        if (obj instanceof String) {
            byte b = (byte) 34;
            abstractC1790420wgy.LIZLLL(b);
            abstractC1790420wgy.LJ((String) obj);
            abstractC1790420wgy.LIZLLL(b);
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            abstractC1790420wgy.LIZLLL((byte) 91);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    abstractC1790420wgy.LIZLLL((byte) 44);
                }
                LIZIZ(jSONArray.get(i), abstractC1790420wgy);
            }
            abstractC1790420wgy.LIZLLL((byte) 93);
            return;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            abstractC1790420wgy.LIZLLL((byte) 123);
            Iterator<String> itKeys = jSONObject.keys();
            boolean z = true;
            while (itKeys.hasNext()) {
                if (!z) {
                    abstractC1790420wgy.LIZLLL((byte) 44);
                }
                String next = itKeys.next();
                abstractC1790420wgy.LIZLLL((byte) 34);
                abstractC1790420wgy.LJ(next);
                abstractC1790420wgy.LIZ("\":");
                LIZIZ(jSONObject.get(next), abstractC1790420wgy);
                z = false;
            }
            abstractC1790420wgy.LIZLLL((byte) 125);
            return;
        }
        byte b2 = (byte) 34;
        abstractC1790420wgy.LIZLLL(b2);
        abstractC1790420wgy.LJ(obj.toString());
        abstractC1790420wgy.LIZLLL(b2);
    }
}
