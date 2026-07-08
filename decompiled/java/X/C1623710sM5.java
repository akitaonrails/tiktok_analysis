package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623710sM5 {
    public static String LIZ(Effect effect) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = null;
        if (effect.getSdkExtra() != null) {
            try {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
                if (jSONObjectLJIIIZ != null) {
                    jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("vl");
                } else {
                    jSONObjectOptJSONObject = null;
                }
                if (jSONObjectOptJSONObject == null) {
                    return null;
                }
                strOptString = jSONObjectOptJSONObject.optString("imgK");
                return strOptString;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strOptString;
    }
}
