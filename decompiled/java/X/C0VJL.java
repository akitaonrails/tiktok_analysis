package X;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJL {
    public static C0VJL LJ;
    public static volatile boolean LJFF;
    public final JSONObject LIZ;
    public String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public static C0VJL LIZIZ() {
        if (LJ == null) {
            LJ = new C0VJL();
        }
        return LJ;
    }

    public C0VJL() {
        JSONObject jSONObject;
        Context contextLJ;
        try {
            contextLJ = C0VX9.LJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (contextLJ != null) {
            this.LIZIZ = C2204961BRm.LLIIIJ(contextLJ.getContentResolver(), "bytest_automation_info", new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbVwm01vxM3CbanRIw", null));
            jSONObject = new JSONObject(this.LIZIZ);
        } else {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() != 0) {
            this.LIZ = jSONObject.optJSONObject("slardar_filter");
        } else {
            this.LIZ = null;
        }
        JSONObject jSONObject2 = this.LIZ;
        if (jSONObject2 != null) {
            "true".equals(jSONObject2.optString("gwp_asan_switch"));
            "true".equals(this.LIZ.optString("core_dump_switch"));
            this.LIZJ = "true".equals(this.LIZ.optString("is_all_exception_collected"));
            C802300Vdc.LIZJ = true;
        } else {
            this.LIZJ = false;
        }
        String strOptString = jSONObject.optString("bytrace_id_prefix");
        if (TextUtils.isEmpty(strOptString)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(UUID.randomUUID());
            sbLIZ.append("-");
            sbLIZ.append(Process.myPid());
            strOptString = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZLLL = strOptString;
    }

    public static void LIZ(JSONObject jSONObject) {
        JSONObject jSONObject2 = LIZIZ().LIZ;
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            C0VJO.LIZLLL(jSONObject, jSONObject2);
        }
    }

    public static void LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        Object objOpt;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!"slardar_filter".equals(next) && (objOpt = jSONObject.opt(next)) != null) {
                    try {
                        jSONObject2.put(next, objOpt);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
