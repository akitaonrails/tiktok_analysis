package X;

import defpackage.Config;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1421105hJ {
    public static final void LIZJ(String str, Map<String, ? extends Object> map) {
        Object objWrap;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && !a0.LJJJIL(key)) {
                Object value = entry.getValue();
                if (value == null || (objWrap = JSONObject.wrap(value)) == null) {
                    objWrap = "";
                }
                jSONObject.put(key, objWrap);
            }
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }

    public static final void LIZLLL(String str, Pair<String, ? extends Object>... pairArr) throws JSONException {
        Object objWrap;
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, ? extends Object> pair : pairArr) {
            String first = pair.getFirst();
            if (first != null && !a0.LJJJIL(first)) {
                Object second = pair.getSecond();
                if (second == null || (objWrap = JSONObject.wrap(second)) == null) {
                    objWrap = "";
                }
                jSONObject.put(first, objWrap);
            }
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }

    public static final <T> void LIZ(Map<String, ? extends T> map, Collection<String> collection, Map<String, ? super T> map2) {
        for (String str : collection) {
            Config config = (Object) ((LinkedHashMap) map).get(str);
            if (config != null) {
                map2.put(str, config);
            }
        }
    }

    public static final <T> void LIZIZ(T t, Function0<Unit> function0, Function1<? super T, Unit> function1) {
        if (t == null) {
            function0.invoke();
        } else {
            function1.invoke(t);
        }
    }
}
