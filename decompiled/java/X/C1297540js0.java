package X;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0js0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297540js0 {
    public static JavaOnlyArray LIZ(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONArray) {
                javaOnlyArray.add(LIZ((JSONArray) objOpt));
            } else if (objOpt instanceof JSONObject) {
                javaOnlyArray.add(LIZIZ((JSONObject) objOpt));
            } else {
                javaOnlyArray.add(objOpt);
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap LIZIZ(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                javaOnlyMap.put(next, LIZIZ((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                javaOnlyMap.put(next, LIZ((JSONArray) objOpt));
            } else if (Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                javaOnlyMap.put(next, null);
            } else {
                javaOnlyMap.put(next, objOpt);
            }
        }
        return javaOnlyMap;
    }
}
