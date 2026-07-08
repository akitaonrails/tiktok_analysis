package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801800Vco extends C801830Vcr {
    public static C801800Vco LJ(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4) {
        C801800Vco c801800Vco = new C801800Vco();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        c801800Vco.LIZJ("event_type", "exception");
        c801800Vco.LIZJ("log_type", "core_exception_monitor");
        c801800Vco.LIZJ("timestamp", Long.valueOf(System.currentTimeMillis()));
        c801800Vco.LIZJ("crash_time", Long.valueOf(System.currentTimeMillis()));
        c801800Vco.LIZJ("class_ref", className);
        c801800Vco.LIZJ("method", methodName);
        c801800Vco.LIZJ("line_num", Integer.valueOf(lineNumber));
        c801800Vco.LIZJ("stack", str);
        c801800Vco.LIZJ("exception_type", 1);
        c801800Vco.LIZJ("ensure_type", str4);
        c801800Vco.LIZJ("is_core", Integer.valueOf(z ? 1 : 0));
        c801800Vco.LIZJ("message", str2);
        c801800Vco.LIZJ("process_name", C802270VdZ.LIZJ());
        c801800Vco.LIZJ("crash_thread_name", str3);
        JSONObject jSONObjectOptJSONObject = c801800Vco.LIZ.optJSONObject("filters");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            try {
                c801800Vco.LIZ.put("filters", jSONObjectOptJSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0VJL.LIZ(jSONObjectOptJSONObject);
        return c801800Vco;
    }

    public static C801800Vco LJFF(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C801800Vco c801800Vco = new C801800Vco();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        c801800Vco.LIZJ("event_type", "exception");
        c801800Vco.LIZJ("log_type", str5);
        c801800Vco.LIZJ("timestamp", Long.valueOf(System.currentTimeMillis()));
        c801800Vco.LIZJ("crash_time", Long.valueOf(System.currentTimeMillis()));
        c801800Vco.LIZJ("class_ref", className);
        c801800Vco.LIZJ("method", methodName);
        c801800Vco.LIZJ("line_num", Integer.valueOf(lineNumber));
        c801800Vco.LIZJ("stack", str);
        c801800Vco.LIZJ("crash_md5", C820840WHy.LIZ(str));
        c801800Vco.LIZJ("exception_type", 1);
        c801800Vco.LIZJ("ensure_type", str4);
        c801800Vco.LIZJ("is_core", Integer.valueOf(z ? 1 : 0));
        c801800Vco.LIZJ("message", str2);
        c801800Vco.LIZJ("process_name", C802270VdZ.LIZJ());
        c801800Vco.LIZJ("crash_thread_name", str3);
        JSONObject jSONObjectOptJSONObject = c801800Vco.LIZ.optJSONObject("filters");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            try {
                c801800Vco.LIZ.put("filters", jSONObjectOptJSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0VJL.LIZ(jSONObjectOptJSONObject);
        return c801800Vco;
    }
}
