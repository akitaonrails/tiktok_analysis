package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BFA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BFA {
    public static final Map<Class<?>, C1BFG> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put(Boolean.class, new C1BFG() { // from class: X.1BFB
            @Override // X.C1BFG
            public final void LIZ(Bundle bundle, String str, Object obj) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        });
        map.put(Integer.class, new C1BFG() { // from class: X.1BFC
            @Override // X.C1BFG
            public final void LIZ(Bundle bundle, String str, Object obj) {
                bundle.putInt(str, ((Integer) obj).intValue());
            }
        });
        map.put(Long.class, new C1BFG() { // from class: X.1BF9
            @Override // X.C1BFG
            public final void LIZ(Bundle bundle, String str, Object obj) {
                bundle.putLong(str, ((Long) obj).longValue());
            }
        });
        map.put(Double.class, new C1BFG() { // from class: X.1BFD
            @Override // X.C1BFG
            public final void LIZ(Bundle bundle, String str, Object obj) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }
        });
        map.put(String.class, new C1BFG() { // from class: X.1BFE
            @Override // X.C1BFG
            public final void LIZ(Bundle bundle, String str, Object obj) {
                C786410Ut5.LJJJI(str, (String) obj, bundle);
            }
        });
        map.put(String[].class, new C1BFG() { // from class: X.1BFF
            @Override // X.C1BFG
            public final void LIZ(Bundle bundle, String str, Object obj) {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        map.put(JSONArray.class, new C1BFG() { // from class: X.1BF8
            @Override // X.C1BFG
            public final void LIZ(Bundle bundle, String str, Object obj) throws JSONException {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    C786410Ut5.LJJJIL(bundle, str, arrayList);
                    return;
                }
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Object obj2 = jSONArray.get(i);
                        if (obj2 instanceof String) {
                            arrayList.add(obj2);
                            if (i2 >= length) {
                                break;
                            } else {
                                i = i2;
                            }
                        } else {
                            throw new IllegalArgumentException(Intrinsics.LJIIJJI(obj2.getClass(), "Unexpected type in an array: "));
                        }
                    }
                }
                C786410Ut5.LJJJIL(bundle, str, arrayList);
            }
        });
    }

    public static final Bundle LIZ(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    C786410Ut5.LJJIIZI(bundle, LIZ((JSONObject) obj), next);
                } else {
                    C1BFG c1bfg = (C1BFG) ((HashMap) LIZ).get(obj.getClass());
                    if (c1bfg != null) {
                        c1bfg.LIZ(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException(Intrinsics.LJIIJJI(obj.getClass(), "Unsupported type: "));
                    }
                }
            }
        }
        return bundle;
    }
}
