package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09GD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GD {
    public static final HashMap<String, Object> LIZ = new HashMap<>();

    public static Pair LIZ(int i) {
        if (i < 0) {
            return new Pair(-50, 50);
        }
        return new Pair(0, 100);
    }

    public static List LIZIZ(String str) {
        List listLLIIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08F1.LIZIZ(str));
        sbLIZ.append("_Beauty");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Object obj = LIZ.get(strLIZIZ);
        Iterable iterable = null;
        if (obj != null) {
            if (obj instanceof List) {
                iterable = (Iterable) obj;
            }
            if (iterable == null || (listLLIIII = C13LP.LLIIII(iterable)) == null) {
                return C13BV.INSTANCE;
            }
            return listLLIIII;
        }
        ArrayList arrayList = new ArrayList();
        try {
            String strOptString = new JSONObject(str).optString("beauty", null);
            if (strOptString == null) {
                return C13BV.INSTANCE;
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(strOptString).optJSONArray("items");
            if (jSONArrayOptJSONArray == null) {
                return C13BV.INSTANCE;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
                int iOptInt = jSONObject.optInt("min", 0);
                jSONObject.optInt("max", 0);
                Pair pairLIZ = LIZ(iOptInt);
                arrayList.add(new C0EA9(jSONObject.optString("tag", ""), jSONObject.optInt("value", 0), ((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue()));
            }
            LIZ.put(strLIZIZ, C13LP.LLIIII(arrayList));
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public static List LIZJ(String str) {
        List listLLIIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08F1.LIZIZ(str));
        sbLIZ.append("_Beautify");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Object obj = LIZ.get(strLIZIZ);
        Iterable iterable = null;
        if (obj != null) {
            if (obj instanceof List) {
                iterable = (Iterable) obj;
            }
            if (iterable == null || (listLLIIII = C13LP.LLIIII(iterable)) == null) {
                return C13BV.INSTANCE;
            }
            return listLLIIII;
        }
        ArrayList arrayList = new ArrayList();
        try {
            String strOptString = new JSONObject(str).optString("beautify", null);
            if (strOptString == null) {
                return LIZIZ(str);
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(strOptString).optJSONArray("items");
            if (jSONArrayOptJSONArray == null) {
                return C13BV.INSTANCE;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
                int iOptInt = jSONObject.optInt("min", 0);
                jSONObject.optInt("max", 0);
                Pair pairLIZ = LIZ(iOptInt);
                arrayList.add(new C0EA9(jSONObject.optString("tag", ""), jSONObject.optInt("value", 0), ((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue()));
            }
            LIZ.put(strLIZIZ, C13LP.LLIIII(arrayList));
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }
}
