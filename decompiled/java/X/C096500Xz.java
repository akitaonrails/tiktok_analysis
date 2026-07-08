package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00Xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C096500Xz {
    public static C00Y0 LIZ(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                C00Y0 c00y0 = new C00Y0();
                if (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next) && next.hashCode() == 1481071862 && next.equals("country_code")) {
                        jSONObject.optInt(next);
                    }
                }
                return c00y0;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
