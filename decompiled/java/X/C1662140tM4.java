package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tM4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662140tM4 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public List<String> LIZLLL;

    public final String LIZ() {
        List<String> list = this.LIZLLL;
        if (list == null || list.isEmpty() || TextUtils.isEmpty(this.LIZ)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) ListProtector.get(this.LIZLLL, 0));
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ() {
        List<String> list = this.LIZLLL;
        if ((list == null || list.isEmpty()) || TextUtils.isEmpty(this.LIZIZ)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) ListProtector.get(this.LIZLLL, 0));
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZJ() {
        if (TextUtils.isEmpty(LIZ())) {
            return false;
        }
        return !TextUtils.isEmpty(LIZIZ());
    }

    public final void LIZLLL(Effect effect) {
        String strOptString;
        String strOptString2;
        try {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
            String strOptString3 = null;
            if (jSONObjectLJII != null) {
                strOptString = jSONObjectLJII.optString("aigc_guide_prompt_starling_key");
            } else {
                strOptString = null;
            }
            this.LIZJ = strOptString;
            if (jSONObjectLJII == null) {
                strOptString2 = null;
            } else {
                strOptString2 = jSONObjectLJII.optString("aigc_guide_image");
            }
            this.LIZ = strOptString2;
            if (jSONObjectLJII != null) {
                strOptString3 = jSONObjectLJII.optString("aigc_guide_video");
            }
            this.LIZIZ = strOptString3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
