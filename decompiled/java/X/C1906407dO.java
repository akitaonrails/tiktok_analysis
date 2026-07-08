package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.IDLXDynamic;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1906407dO {
    public static final JSONArray LIZ(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        List listLJJJJLI = C13LP.LJJJJLI(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
        for (Object objLIZ : listLJJJJLI) {
            if (!(objLIZ instanceof Integer) && !(objLIZ instanceof Long) && !(objLIZ instanceof String) && !(objLIZ instanceof Boolean) && !(objLIZ instanceof Double)) {
                objLIZ = objLIZ instanceof List ? LIZ((List) objLIZ) : objLIZ instanceof Map ? LIZIZ((Map) objLIZ) : objLIZ instanceof IDLXDynamic ? C1974707oP.LIZIZ((IDLXDynamic) objLIZ) : objLIZ instanceof XBaseModel ? ((XBaseModel) objLIZ).toJSON() : null;
            }
            arrayList.add(objLIZ);
        }
        for (Object obj : arrayList) {
            if (obj != null) {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static final JSONObject LIZIZ(Map<?, ?> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList<Pair> arrayList = new ArrayList(map.size());
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (!(value instanceof Integer) && !(value instanceof Long) && !(value instanceof String) && !(value instanceof Boolean) && !(value instanceof Double)) {
                value = value instanceof List ? LIZ((List) value) : value instanceof Map ? LIZIZ((Map) value) : value instanceof IDLXDynamic ? C1974707oP.LIZIZ((IDLXDynamic) value) : value instanceof XBaseModel ? ((XBaseModel) value).toJSON() : null;
            }
            arrayList.add(new Pair(key, value));
        }
        for (Pair pair : arrayList) {
            Object first = pair.getFirst();
            if (first != null && (first instanceof String)) {
                jSONObject.put((String) first, pair.getSecond());
            }
        }
        return jSONObject;
    }
}
