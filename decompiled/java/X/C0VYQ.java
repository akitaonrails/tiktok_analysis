package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VYQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYQ {
    public int LIZ;
    public final LinkedList<C0VYS> LIZIZ = new LinkedList<>();
    public final Map<String, C2031907xd> LIZJ = new ConcurrentHashMap();
    public final ReferenceQueue<Object> LIZLLL = new ReferenceQueue<>();

    public final synchronized C0VYS LIZIZ() {
        int i = this.LIZ;
        if (i < 50) {
            int i2 = i + 1;
            this.LIZ = i2;
            return this.LIZIZ.get(i2 - 1);
        }
        C0VYS c0vysPoll = this.LIZIZ.poll();
        c0vysPoll.LIZ = -1;
        c0vysPoll.LIZJ = 0L;
        c0vysPoll.LIZLLL = 0L;
        c0vysPoll.LIZIZ = 0L;
        c0vysPoll.LJ = "";
        this.LIZIZ.add(c0vysPoll);
        return c0vysPoll;
    }

    public C0VYQ() {
        int i = 0;
        do {
            this.LIZIZ.add(new C0VYS());
            i++;
        } while (i < 100);
    }

    public static void LIZ(JSONObject jSONObject, File file) {
        JSONArray jSONArrayOptJSONArray;
        try {
            String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "leak_object.txt"));
            if (!TextUtils.isEmpty(strLJFF)) {
                try {
                    jSONArrayOptJSONArray = new JSONObject(strLJFF).optJSONArray("leak_objects");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    jSONArrayOptJSONArray = null;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("filters");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                    jSONObject.put("filters", jSONObjectOptJSONObject);
                }
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    jSONObjectOptJSONObject.put("has_leak_objects", "1");
                    JSONObject jSONObject2 = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject2 != null) {
                            String strOptString = jSONObjectOptJSONObject2.optString("leak_object_name", "");
                            if (!TextUtils.isEmpty(strOptString)) {
                                long jOptLong = jSONObjectOptJSONObject2.optLong("leak_duration", 0L);
                                if (jOptLong >= 1000) {
                                    JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject(strOptString);
                                    if (jSONObjectOptJSONObject3 == null) {
                                        jSONObjectOptJSONObject3 = new JSONObject();
                                        jSONObjectOptJSONObject3.put("count", i);
                                        jSONObjectOptJSONObject3.put("total_leak_duration", 0L);
                                        sb.append(strOptString);
                                        sb.append(",");
                                    }
                                    jSONObjectOptJSONObject3.put("count", jSONObjectOptJSONObject3.optLong("count", 0L) + 1);
                                    jSONObjectOptJSONObject3.put("total_leak_duration", Math.max(0L, jOptLong) + jSONObjectOptJSONObject3.optLong("total_leak_duration", 0L));
                                    jSONObject2.put(strOptString, jSONObjectOptJSONObject3);
                                }
                            }
                        }
                        i2++;
                        i = 0;
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("custom");
                    if (jSONObject2.length() > 0 && jSONObjectOptJSONObject4 != null) {
                        jSONObjectOptJSONObject4.put("leak_objects", C786410Ut5.J3(jSONObject2));
                        jSONObjectOptJSONObject.put("leak_object_list", sb.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
