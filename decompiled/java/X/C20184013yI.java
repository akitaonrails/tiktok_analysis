package X;

import Y.AComparatorS49S0000000_30;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13yI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20184013yI {
    public static float LIZ(long j, long j2) {
        if (j2 > 0) {
            return j / j2;
        }
        return 0.0f;
    }

    public static JSONObject LIZIZ(C20184113yJ c20184113yJ) throws JSONException {
        C12EI c12ei = c20184113yJ.LJI;
        C20184813yQ c20184813yQ = c20184113yJ.LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("operation_type", c20184113yJ.LIZJ);
        if (c20184113yJ.LIZJ == EnumC19355810o0.SAVE) {
            jSONObject.put("save_from", c20184113yJ.LIZIZ);
        }
        jSONObject.put("absolute_path", c20184813yQ.LIZ);
        jSONObject.put("creation_id", c20184113yJ.LIZ);
        jSONObject.put("total_size", c20184813yQ.LIZIZ);
        jSONObject.put("file_count", c20184813yQ.LIZJ);
        jSONObject.put("storage_app_percent", Float.valueOf(LIZ(c20184813yQ.LIZIZ, c12ei.LIZJ)));
        jSONObject.put("storage_device_percent", Float.valueOf(LIZ(c20184813yQ.LIZIZ, c12ei.LIZ)));
        jSONObject.put("app_usage", c12ei.LIZJ);
        jSONObject.put("total_disk_usage", c12ei.LIZ);
        jSONObject.put("free_disk_usage", c12ei.LIZIZ);
        return jSONObject;
    }

    public static void LIZLLL(C20184113yJ c20184113yJ) {
        Object c098200Yq;
        try {
            JSONObject jSONObjectLIZIZ = LIZIZ(c20184113yJ);
            JSONArray jSONArray = new JSONArray();
            C20684815ws.LJIJ("studio_draft_track_folder_info", jSONObjectLIZIZ);
            Iterator it2 = C13LP.LJLLLL(new AComparatorS49S0000000_30(14), c20184113yJ.LJ).iterator();
            while (it2.hasNext()) {
                JSONObject jSONObjectLIZJ = LIZJ(c20184113yJ, (C20183913yH) it2.next());
                C20684815ws.LJIJ("studio_draft_track_file_detail", jSONObjectLIZJ);
                jSONArray.put(jSONObjectLIZJ);
            }
            C0CHQ.LIZ().LJIIJJI();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20183113y9.LIZLLL("MonitorDataReporter", "Failed to report monitor data", thM5exceptionOrNullimpl);
        }
    }

    public static JSONObject LIZJ(C20184113yJ c20184113yJ, C20183913yH c20183913yH) throws JSONException {
        C12EI c12ei = c20184113yJ.LJI;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("operation_type", c20184113yJ.LIZJ);
        if (c20184113yJ.LIZJ == EnumC19355810o0.SAVE) {
            jSONObject.put("save_from", c20184113yJ.LIZIZ);
        }
        jSONObject.put("creation_id", c20184113yJ.LIZ);
        jSONObject.put("absolute_path", c20183913yH.LIZ);
        jSONObject.put("relative_path", c20183913yH.LIZIZ);
        jSONObject.put("file_size", c20183913yH.LJ);
        jSONObject.put("file_name", c20183913yH.LIZJ);
        jSONObject.put("file_extension", c20183913yH.LIZLLL);
        jSONObject.put("is_directory", c20183913yH.LJIIL);
        jSONObject.put("storage_app_percent", Float.valueOf(LIZ(c20183913yH.LJ, c12ei.LIZJ)));
        jSONObject.put("storage_device_percent", Float.valueOf(LIZ(c20183913yH.LJ, c12ei.LIZ)));
        jSONObject.put("storage_draft_percent", Float.valueOf(LIZ(c20183913yH.LJ, c20184113yJ.LIZLLL.LIZIZ)));
        jSONObject.put("app_usage", c12ei.LIZJ);
        jSONObject.put("total_disk_usage", c12ei.LIZ - c12ei.LIZIZ);
        jSONObject.put("free_disk_usage", c12ei.LIZIZ);
        jSONObject.put("draft_field_mapping", c20183913yH.LJI);
        jSONObject.put("resource_type", c20183913yH.LJIIIZ);
        jSONObject.put("is_path_valid", c20183913yH.LJIILJJIL);
        jSONObject.put("path_violation_reason", c20183913yH.LJIILL);
        jSONObject.put("file_count", c20183913yH.LJIILIIL);
        jSONObject.put("file_exists", c20183913yH.LJIIJ);
        jSONObject.put("is_in_nle", c20183913yH.LJIIIIZZ);
        jSONObject.put("is_in_draft", c20183913yH.LJII);
        return jSONObject;
    }
}
