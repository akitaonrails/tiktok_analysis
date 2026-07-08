package X;

import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012280cRu {
    public static final List<InterfaceC1012270cRt> LIZ = C1697810uHb.LJIIJJI(new InterfaceC1012270cRt() { // from class: X.0cRr
        @Override // X.InterfaceC1012270cRt
        public final boolean LIZ(Object obj, Object obj2, C1012260cRs c1012260cRs, Map<String, String> map) throws JSONException {
            if (c1012260cRs.LIZIZ()) {
                return false;
            }
            if (obj instanceof JSONObject) {
                if (obj2 instanceof String) {
                    Object obj3 = map.get(obj2);
                    if (obj3 == null) {
                        obj3 = obj2;
                    }
                    ((JSONObject) obj).putOpt(c1012260cRs.LIZ(), obj3);
                    return true;
                }
                throw new IllegalStateException("child element must be a string");
            }
            throw new IllegalStateException("parent element must be a json object");
        }
    }, new InterfaceC1012270cRt() { // from class: X.0cRq
        @Override // X.InterfaceC1012270cRt
        public final boolean LIZ(Object obj, Object obj2, C1012260cRs c1012260cRs, Map<String, String> map) throws JSONException {
            if (!c1012260cRs.LIZIZ()) {
                return false;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object objOpt = jSONArray.opt(i);
                    if (objOpt != null) {
                        if (objOpt instanceof String) {
                            Object obj3 = map.get(objOpt);
                            if (obj3 == null) {
                                obj3 = objOpt;
                            }
                            jSONArray.put(i, obj3);
                        } else {
                            throw new IllegalStateException("all elements in the json array must be a string");
                        }
                    }
                }
                return true;
            }
            throw new IllegalStateException("child must be a json array");
        }
    });
}
