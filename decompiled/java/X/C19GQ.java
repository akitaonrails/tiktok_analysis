package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19GQ {
    public static <I, O> O LIZ(String str, String str2, InterfaceC2287108xh<I, O> interfaceC2287108xh) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        O oApply = interfaceC2287108xh.apply(null);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str2, System.currentTimeMillis() - jCurrentTimeMillis);
                C2212291BiF.LIZLLL().LJI(str, jSONObject, null);
                return oApply;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return oApply;
    }
}
