package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2349409Im {
    public Map<String, int[][]> LIZ = new HashMap();
    public String LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[][]] */
    public static C2349409Im LIZ(String str) {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        C2349409Im c2349409Im = new C2349409Im();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(next)) != null) {
                    Class cls = Integer.TYPE;
                    ?? NewInstance = Array.newInstance((Class<?>) cls, 0, 0);
                    if (jSONArrayOptJSONArray.length() > 0) {
                        NewInstance = (int[][]) Array.newInstance((Class<?>) cls, jSONArrayOptJSONArray.length(), 2);
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() >= 2) {
                                int i2 = 0;
                                do {
                                    NewInstance[i][i2] = jSONArrayOptJSONArray2.optInt(i2);
                                    i2++;
                                } while (i2 < 2);
                            }
                        }
                    }
                    map.put(next, NewInstance);
                }
            }
            c2349409Im.LIZ = map;
            c2349409Im.LIZIZ = str;
        }
        return c2349409Im;
    }
}
