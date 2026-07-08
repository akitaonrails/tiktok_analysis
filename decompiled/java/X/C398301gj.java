package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C398301gj {
    public static void LIZ(boolean z) {
        C1323820kYO c1323820kYO = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", 1);
            jSONObject.put("is_confirm_audio", z ? 1 : 0);
            c1323820kYO = new C1323820kYO(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), c1323820kYO, "pcs_course_published"));
    }
}
