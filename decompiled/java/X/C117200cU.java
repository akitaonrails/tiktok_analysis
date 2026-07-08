package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C117200cU {
    public static final HashMap<String, Object> LIZIZ(JSONObject jSONObject) {
        HashMap<String, Object> map = new HashMap<>();
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
        Object c098200Yq;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                HashMap<String, Object> map = null;
                if (objOpt instanceof JSONObject) {
                    HashMap<String, Object> mapLIZIZ = LIZIZ((JSONObject) objOpt);
                    if (!mapLIZIZ.isEmpty()) {
                        map = mapLIZIZ;
                    }
                    if (map != null) {
                        arrayList.add(map);
                    }
                } else if (objOpt instanceof String) {
                    try {
                        c098200Yq = new JSONObject(a0.LJLIIIL((String) objOpt).toString());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    JSONObject jSONObject = (JSONObject) c098200Yq;
                    if (jSONObject != null) {
                        HashMap<String, Object> mapLIZIZ2 = LIZIZ(jSONObject);
                        if (!mapLIZIZ2.isEmpty()) {
                            map = mapLIZIZ2;
                        }
                        if (map != null) {
                            arrayList.add(map);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final JSONObject LIZ(String str, String str2) {
        boolean z;
        String string = a0.LJLIIIL(str).toString();
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" is not a json object");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append(" is empty");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
