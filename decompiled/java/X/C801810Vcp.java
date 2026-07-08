package X;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C801810Vcp {
    public final String LIZ;
    public final String LIZIZ;
    public final Throwable LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final Map<String, String> LJI;
    public final long LJFF = System.currentTimeMillis();
    public final boolean LJII = C0VYH.LIZJ();

    public final JSONObject LIZ(Header header) {
        String str;
        JSONObject jSONObject = new JSONObject();
        String strLIZ = C0VY4.LIZ(this.LIZJ);
        try {
            jSONObject.put("event_type", "biz_exception");
            jSONObject.put("crash_time", this.LJFF);
            jSONObject.put("biz_exception_type", this.LIZ);
            jSONObject.put("app_start_time", C0VX9.LIZJ());
            jSONObject.put("timestamp", this.LJFF);
            jSONObject.put("crash_md5", C820840WHy.LIZ(strLIZ));
            jSONObject.put("message", this.LIZLLL);
            jSONObject.put("crash_thread_name", this.LIZIZ);
            jSONObject.put("process_name", C802270VdZ.LIZIZ());
            jSONObject.put("exception_type", 1);
            jSONObject.put("process_name", C802270VdZ.LIZJ());
            jSONObject.put("app_start_time", C0VX9.LIZJ());
            jSONObject.put("pid", Process.myPid());
            StackTraceElement stackTraceElement = this.LIZJ.getStackTrace()[0];
            jSONObject.put("class_ref", stackTraceElement.getClassName());
            jSONObject.put("method", stackTraceElement.getMethodName());
            jSONObject.put("line_num", stackTraceElement.getLineNumber());
            jSONObject.put("stack", strLIZ);
            C0VYH.LJFF(jSONObject);
            C0VYH.LJI(jSONObject);
            jSONObject.put("is_background", this.LJII);
            C801620VcW.LIZIZ(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("filters", jSONObject2);
            Map<String, String> map = this.LJ;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            C0VJO.LJIIIIZZ(jSONObject2, "crash_thread_name", this.LIZIZ);
            C0VJO.LJIIIIZZ(jSONObject2, "is_background", Boolean.valueOf(this.LJII));
            if (NativeBridge.LJJIJIIJI()) {
                str = "true";
            } else {
                str = "false";
            }
            C0VJO.LJIIIIZZ(jSONObject2, "is_64_runtime", str);
            String strOptString = header.LIZ.optString("cpu_abi");
            if (!TextUtils.isEmpty(strOptString)) {
                boolean zContains = strOptString.contains("64");
                C0VJO.LJIIIIZZ(jSONObject2, "is_x86_devices", Boolean.valueOf(strOptString.contains("86")));
                C0VJO.LJIIIIZZ(jSONObject2, "is_64_devices", Boolean.valueOf(zContains));
                C0VJO.LJIIIIZZ(jSONObject2, "crash_thread_name", this.LIZIZ);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("custom");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                jSONObject.put("custom", jSONObjectOptJSONObject);
            }
            Map<String, String> map2 = this.LJI;
            if (map2 != null) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    if (entry2.getKey() != null && entry2.getValue() != null) {
                        jSONObjectOptJSONObject.put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C802790VeP c802790VeP = k.LIZ;
            if (c802790VeP != null) {
                for (Map.Entry entry3 : ((HashMap) c802790VeP.LIZJ.LJ(CrashType.ENSURE)).entrySet()) {
                    jSONObjectOptJSONObject.put((String) entry3.getKey(), entry3.getValue());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public C801810Vcp(String str, Throwable th, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        this.LIZ = str;
        this.LIZJ = th;
        this.LIZLLL = str2;
        this.LJ = map;
        this.LIZIZ = str3;
        this.LJI = map2;
    }
}
