package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C117300cV {
    public static final HashMap<String, Object> LIZIZ(JSONObject jSONObject) {
        HashMap<String, Object> map = new HashMap<>();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                map.put(next, objOpt);
            }
        }
        return map;
    }

    public static final List<HashMap<String, Object>> LIZJ(JSONArray jSONArray) {
        JSONObject jSONObjectLIZLLL;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                if (objOpt instanceof JSONObject) {
                    HashMap<String, Object> mapLIZIZ = LIZIZ((JSONObject) objOpt);
                    if (!mapLIZIZ.isEmpty()) {
                        arrayList.add(mapLIZIZ);
                    }
                } else if ((objOpt instanceof String) && (jSONObjectLIZLLL = LIZLLL((String) objOpt)) != null) {
                    HashMap<String, Object> mapLIZIZ2 = LIZIZ(jSONObjectLIZLLL);
                    if (!mapLIZIZ2.isEmpty()) {
                        arrayList.add(mapLIZIZ2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final JSONObject LIZLLL(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return new JSONObject(a0.LJLIIIL(str).toString());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final JSONObject LIZ(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof JSONObject) {
            return (JSONObject) objOpt;
        }
        if (!(objOpt instanceof String)) {
            return null;
        }
        return LIZLLL((String) objOpt);
    }
}
