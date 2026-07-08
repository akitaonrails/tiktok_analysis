package X;

import Y.ARunnableS109S0100000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588220N5g {
    public long LIZ;
    public int LIZIZ;
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";

    public static void LIZIZ(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                itKeys.remove();
            }
        }
    }

    public final void LIZ(String str, String str2) {
        Map mapLIZJ;
        if (Intrinsics.LJFF(this, C588240N5i.LIZ) || this.LIZ == 0) {
            return;
        }
        Map<String, C588220N5g> map = C588230N5h.LIZ;
        try {
            if (((HashMap) map).get(str) == null) {
                return;
            }
            try {
                this.LIZIZ = (int) (System.currentTimeMillis() - this.LIZ);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cost", this.LIZIZ);
                jSONObject.put("type", this.LJ);
                jSONObject.put("end_reason", str2);
                jSONObject.put("enter_method", this.LIZJ);
                jSONObject.put("enter_from", this.LIZLLL);
                LIZIZ(jSONObject);
                C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(jSONObject, 155));
                this.LIZ = 0L;
                C786410Ut5.J3(jSONObject);
                mapLIZJ = C19719512Dh.LIZJ(map);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                mapLIZJ = C19719512Dh.LIZJ(C588230N5h.LIZ);
            }
            mapLIZJ.remove(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C19719512Dh.LIZJ(C588230N5h.LIZ).remove(str);
            throw th;
        }
    }
}
