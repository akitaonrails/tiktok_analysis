package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.113q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194396113q {
    public static final String LIZ(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LJFF(effect, "category_name");
    }

    public static final void LIZIZ(Effect effect, String str, String str2, String str3) {
        C1446130njf.LIZ.getClass();
        JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
        if (jSONObjectLJII == null) {
            jSONObjectLJII = new JSONObject();
        }
        if (str != null) {
            jSONObjectLJII.put("category_name", str);
        }
        if (str2 != null) {
            jSONObjectLJII.put("category_id", str2);
        }
        if (str3 != null) {
            jSONObjectLJII.put("category_extra", str3);
        }
        effect.setExtra(C786410Ut5.J3(jSONObjectLJII));
    }
}
