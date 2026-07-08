package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2220221Bv2 {
    public static final /* synthetic */ int LIZJ = 0;
    public final int LIZ;
    public final C2220231Bv3 LIZIZ;

    static {
        new C2220251Bv5();
    }

    public final C2220181Buy LIZ() throws JSONException {
        C1525420pnY c1525420pnY;
        JSONObject jSONObject = new JSONObject();
        C1849450yEB c1849450yEB = this.LIZIZ.LIZIZ;
        if (c1849450yEB != null) {
            JSONObject jSONObjectLIZ = c1849450yEB.LIZ();
            Iterator<String> itKeys = jSONObjectLIZ.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectLIZ.get(next));
            }
        }
        Map<String, Object> map = this.LIZIZ.LIZLLL;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), LIZJ(entry.getValue()));
            }
        }
        C2220241Bv4 c2220241Bv4 = this.LIZIZ.LIZJ;
        if (c2220241Bv4 != null) {
            c1525420pnY = new C1525420pnY(c2220241Bv4.LIZ, c2220241Bv4.LIZIZ);
        } else {
            EnumC2192931As7 enumC2192931As7 = EnumC2192931As7.NONE;
            c1525420pnY = new C1525420pnY(enumC2192931As7.getCode(), enumC2192931As7.getMsg());
        }
        int i = this.LIZ;
        boolean z = this.LIZIZ.LIZ;
        if (!z) {
            jSONObject = null;
        }
        return new C2220181Buy(new C1525410pnX(z, jSONObject, c1525420pnY, null), i);
    }

    public final C2220181Buy LIZIZ() throws JSONException {
        C1525420pnY c1525420pnY;
        JSONObject jSONObject = new JSONObject();
        C1849450yEB c1849450yEB = this.LIZIZ.LIZIZ;
        if (c1849450yEB != null) {
            JSONObject jSONObjectLIZ = c1849450yEB.LIZ();
            Iterator<String> itKeys = jSONObjectLIZ.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectLIZ.get(next));
            }
        }
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.LIZIZ.LIZLLL;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    map.put(key, value);
                } else {
                    jSONObject.put(key, value);
                }
            }
        }
        C2220241Bv4 c2220241Bv4 = this.LIZIZ.LIZJ;
        if (c2220241Bv4 != null) {
            c1525420pnY = new C1525420pnY(c2220241Bv4.LIZ, c2220241Bv4.LIZIZ);
        } else {
            EnumC2192931As7 enumC2192931As7 = EnumC2192931As7.NONE;
            c1525420pnY = new C1525420pnY(enumC2192931As7.getCode(), enumC2192931As7.getMsg());
        }
        int i = this.LIZ;
        boolean z = this.LIZIZ.LIZ;
        if (!z) {
            jSONObject = null;
        }
        return new C2220181Buy(new C1525410pnX(z, jSONObject, c1525420pnY, map), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v10, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v5, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v6, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v7, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v8, types: [org.json.JSONArray] */
    public static Object LIZJ(Object obj) throws JSONException {
        Object jSONArray;
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof byte[]) || (obj instanceof JSONObject) || (obj instanceof JSONArray) || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Map) {
            jSONArray = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key instanceof String) {
                    jSONArray.put((String) key, LIZJ(value));
                }
            }
        } else if (obj instanceof Iterable) {
            jSONArray = new JSONArray();
            Iterator it2 = ((Iterable) obj).iterator();
            while (it2.hasNext()) {
                jSONArray.put(LIZJ(it2.next()));
            }
        } else {
            int i = 0;
            if (obj instanceof Object[]) {
                jSONArray = new JSONArray();
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i < length) {
                    jSONArray.put(LIZJ(objArr[i]));
                    i++;
                }
            } else if (obj instanceof int[]) {
                jSONArray = new JSONArray();
                int[] iArr = (int[]) obj;
                int length2 = iArr.length;
                while (i < length2) {
                    jSONArray.put(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                jSONArray = new JSONArray();
                long[] jArr = (long[]) obj;
                int length3 = jArr.length;
                while (i < length3) {
                    jSONArray.put(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                jSONArray = new JSONArray();
                double[] dArr = (double[]) obj;
                int length4 = dArr.length;
                while (i < length4) {
                    jSONArray.put(dArr[i]);
                    i++;
                }
            } else if (obj instanceof float[]) {
                jSONArray = new JSONArray();
                int length5 = ((float[]) obj).length;
                while (i < length5) {
                    jSONArray.put(r5[i]);
                    i++;
                }
            } else if (obj instanceof short[]) {
                jSONArray = new JSONArray();
                short[] sArr = (short[]) obj;
                int length6 = sArr.length;
                while (i < length6) {
                    jSONArray.put(sArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                jSONArray = new JSONArray();
                boolean[] zArr = (boolean[]) obj;
                int length7 = zArr.length;
                while (i < length7) {
                    jSONArray.put(zArr[i]);
                    i++;
                }
            } else {
                if (!(obj instanceof char[])) {
                    return obj;
                }
                jSONArray = new JSONArray();
                char[] cArr = (char[]) obj;
                int length8 = cArr.length;
                while (i < length8) {
                    jSONArray.put(String.valueOf(cArr[i]));
                    i++;
                }
            }
        }
        return jSONArray;
    }

    public C2220221Bv2(int i, C2220231Bv3 c2220231Bv3) {
        this.LIZ = i;
        this.LIZIZ = c2220231Bv3;
    }
}
