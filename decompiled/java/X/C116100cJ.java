package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00cJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C116100cJ {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> itKeys2 = ((JSONObject) objOpt).keys();
                while (itKeys2.hasNext()) {
                    jSONArray.put(itKeys2.next());
                }
                jSONObject2.put(next, jSONArray);
            } else {
                jSONObject2.put(next, new JSONArray());
            }
        }
        return jSONObject2;
    }

    public static JSONObject LIZ(String str, JSONObject jSONObject) throws JSONException {
        int size;
        if (a0.LJJJIL(str)) {
            return null;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || arrayList.size() - 1 < 0) {
            return null;
        }
        Object objOpt = null;
        loop1: while (true) {
            int i = size - 1;
            String str2 = (String) ListProtector.get(arrayList, size);
            if (objOpt == null) {
                if (a0.LJJJIL(str)) {
                    break;
                }
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj2 : listLJJLIIIJILLIZJL2) {
                    if (!a0.LJJJIL((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                objOpt = jSONObject;
                for (String str3 : arrayList2) {
                    if (!(objOpt instanceof JSONObject) || (objOpt = ((JSONObject) objOpt).opt(str3)) == null) {
                        return null;
                    }
                }
                if (objOpt == null) {
                    return null;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str2, objOpt);
            if (i < 0) {
                return jSONObject2;
            }
            size = i;
            objOpt = jSONObject2;
        }
    }

    public static JSONObject LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject(C786410Ut5.J3(jSONObject));
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (jSONObject3.has(next)) {
                Object obj = jSONObject3.get(next);
                Object obj2 = jSONObject2.get(next);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    jSONObject3.put(next, LIZJ((JSONObject) obj, (JSONObject) obj2));
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = (JSONArray) obj;
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        jSONArray.put(jSONArray2.get(i));
                    }
                    JSONArray jSONArray3 = (JSONArray) obj2;
                    int length2 = jSONArray3.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        jSONArray.put(jSONArray3.get(i2));
                    }
                    jSONObject3.put(next, jSONArray);
                } else {
                    jSONObject3.put(next, obj2);
                }
            } else {
                jSONObject3.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject3;
    }
}
