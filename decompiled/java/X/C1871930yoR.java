package X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1871930yoR {
    public static final JSONArray LIZ(InterfaceC1871920yoQ interfaceC1871920yoQ) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int size = interfaceC1871920yoQ.size();
        for (int i = 0; i < size; i++) {
            switch (C1323490kXr.LIZ[interfaceC1871920yoQ.getType(i).ordinal()]) {
                case 1:
                    jSONArray.put(interfaceC1871920yoQ.getString(i));
                    break;
                case 2:
                    jSONArray.put(interfaceC1871920yoQ.getDouble(i));
                    break;
                case 3:
                    jSONArray.put(interfaceC1871920yoQ.getBoolean(i));
                    break;
                case 4:
                    jSONArray.put(interfaceC1871920yoQ.getInt(i));
                    break;
                case 5:
                    InterfaceC1107590evd map = interfaceC1871920yoQ.getMap(i);
                    if (map != null) {
                        jSONArray.put(LIZIZ(map));
                    }
                    break;
                case 6:
                    InterfaceC1871920yoQ array = interfaceC1871920yoQ.getArray(i);
                    if (array != null) {
                        jSONArray.put(LIZ(array));
                    }
                    break;
            }
        }
        return jSONArray;
    }

    public static final JSONObject LIZIZ(InterfaceC1107590evd interfaceC1107590evd) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        InterfaceC1107470evR interfaceC1107470evRLIZIZ = interfaceC1107590evd.LIZIZ();
        while (interfaceC1107470evRLIZIZ.hasNextKey()) {
            String strNextKey = interfaceC1107470evRLIZIZ.nextKey();
            switch (C1323490kXr.LIZ[interfaceC1107590evd.getType(strNextKey).ordinal()]) {
                case 1:
                    jSONObject.putOpt(strNextKey, interfaceC1107590evd.getString(strNextKey));
                    break;
                case 2:
                    jSONObject.putOpt(strNextKey, Double.valueOf(interfaceC1107590evd.getDouble(strNextKey)));
                    break;
                case 3:
                    jSONObject.putOpt(strNextKey, Boolean.valueOf(interfaceC1107590evd.getBoolean(strNextKey)));
                    break;
                case 4:
                    jSONObject.putOpt(strNextKey, Integer.valueOf(interfaceC1107590evd.getInt(strNextKey)));
                    break;
                case 5:
                    InterfaceC1107590evd map = interfaceC1107590evd.getMap(strNextKey);
                    if (map != null) {
                        jSONObject.putOpt(strNextKey, LIZIZ(map));
                    }
                    break;
                case 6:
                    InterfaceC1871920yoQ array = interfaceC1107590evd.getArray(strNextKey);
                    if (array != null) {
                        jSONObject.putOpt(strNextKey, LIZ(array));
                    }
                    break;
            }
        }
        return jSONObject;
    }
}
