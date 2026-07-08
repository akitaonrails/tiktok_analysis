package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2138308Zh {
    public static boolean LIZ() {
        JSONObject jSONObject;
        try {
            C844470XAv.LIZ.getClass();
            C2138208Zg c2138208ZgLIZ = C2138208Zg.LIZ(C844470XAv.LIZ());
            c2138208ZgLIZ.getClass();
            if (TextUtils.isEmpty("enable_region_swtich") || (jSONObject = c2138208ZgLIZ.LIZ) == null) {
                return false;
            }
            return jSONObject.optInt("enable_region_swtich", 0) == 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
