package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0F9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385400F9e {
    public static final Pair<Boolean, Double> LIZ(Effect effect) {
        double dOptDouble;
        JSONObject jSONObjectOptJSONObject;
        try {
            boolean zOptBoolean = false;
            if (effect.getExtra() != null && (!a0.LJJJIL(r0))) {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
                if (jSONObjectLJIIIZ != null && (jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("transition")) != null) {
                    zOptBoolean = jSONObjectOptJSONObject.optBoolean("isOverlap", false);
                    dOptDouble = jSONObjectOptJSONObject.optDouble("defaultDura", 0.5d);
                } else {
                    dOptDouble = 0.5d;
                }
                return new Pair<>(Boolean.valueOf(zOptBoolean), Double.valueOf(dOptDouble));
            }
            return new Pair<>(Boolean.FALSE, Double.valueOf(0.5d));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new Pair<>(Boolean.FALSE, Double.valueOf(0.5d));
        }
    }

    public static final int LIZIZ(Effect effect) {
        try {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
            if (jSONObjectLJIIIZ != null) {
                return JSONObjectProtectorUtils.getInt(jSONObjectLJIIIZ, "mv_version");
            }
            return 1;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static final boolean LIZJ(Effect effect) {
        if (effect == null || effect.getUnzipPath() == null) {
            return false;
        }
        String unzipPath = effect.getUnzipPath();
        if (!C2354709Kn.LIZIZ(unzipPath)) {
            return false;
        }
        if (LIZIZ(effect) != 2 && TEVideoUtils.nativeCheckMVResourceIntegrity(unzipPath) != 0) {
            return false;
        }
        return true;
    }
}
