package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sNW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624600sNW {
    public static final boolean LIZ(Effect effect) {
        String strLIZIZ = LIZIZ(effect);
        if (strLIZIZ == null || strLIZIZ.length() == 0 || !new C0VSJ(strLIZIZ).exists()) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(Effect effect) {
        boolean z;
        String extra = effect.getExtra();
        if (extra != null && extra.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return new JSONObject(extra).optString("extra_draft_path");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static final boolean LIZJ(Effect effect) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String strOptString;
        if (!C1624570sNT.LJIIJ(effect) && !C21363018iy.LJI(effect) && !C1624200sMs.LIZ(effect, "photo_picker") && !C1624200sMs.LIZ(effect, "live_photo_picker") && !a0.LJJIIZI(effect.getSdkExtra(), "pl", false)) {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
            if (jSONObjectLJIIIZ == null || (jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("editor")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("annotation")) == null || (strOptString = jSONArrayOptJSONArray.optString(0)) == null || !a0.LJJIIZI(strOptString, ".json", false)) {
                return false;
            }
        }
        return true;
    }
}
