package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zOO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894220zOO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, String str2) {
        String strLJIJJ;
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            if (str2 != null) {
                jSONObject.put("errMsg", str2);
            }
            jSONObject.put("scheme", str);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("incentive_lynx_feed_insert_monitor", jSONObject);
        }
    }

    public static void LIZIZ(int i, String str, long j, String str2) {
        String strLJIJJ;
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            if (str2 != null) {
                jSONObject.put("errMsg", str2);
            }
            jSONObject.put("scheme", str);
            jSONObject.put("duration", j);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("incentive_lynx_feed_load_monitor", jSONObject);
        }
    }
}
