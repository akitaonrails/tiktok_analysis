package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664460tPo {
    public static final String LIZ(Effect effect) {
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "creator_user_id");
        if (strLJFF == null) {
            return "";
        }
        return strLJFF;
    }

    public static final String LIZIZ(Effect effect) {
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "svc_from");
        if (strLJFF == null) {
            return "";
        }
        return strLJFF;
    }

    public static final boolean LIZJ(Effect effect) {
        if (C2353809Ke.LIZ) {
            return false;
        }
        try {
            if (effect.getExtra() != null) {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
                if (jSONObjectLJII != null) {
                    if (jSONObjectLJII.optInt("voice_use_commercial", 0) == 1) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static final boolean LIZLLL(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LIZIZ(effect, "is_style_conversion", false);
    }

    public static final boolean LJ(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LIZIZ(effect, "is_voice_clone", false);
    }

    public static final boolean LJFF(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LIZIZ(effect, "is_voice_conversion", false);
    }

    public static final String LJII(Effect effect) {
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "speakerID");
        if (strLJFF == null) {
            return "";
        }
        return strLJFF;
    }

    public static final String LJIIIIZZ(Effect effect) {
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "StreamVCSpkID");
        if (strLJFF == null) {
            return "";
        }
        return strLJFF;
    }

    public static final void LJI(Effect effect, String str) {
        try {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
            if (jSONObjectLJII == null) {
                jSONObjectLJII = new JSONObject();
            }
            jSONObjectLJII.put("svc_from", str);
            effect.setExtra(C786410Ut5.J3(jSONObjectLJII));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
