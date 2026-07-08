package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.absetting.AigcArchAttachCountdownVideoExperiment;
import com.ss.android.ugc.aweme.absetting.AigcArchI2IMigrationExperiment;
import com.ss.android.ugc.aweme.shortvideo.sticker.DisableStickerUnlockTypeParseExperiment;
import com.ss.android.ugc.aweme.shortvideo.sticker.FullWidthHorizontalCarouselGetUnlockTypeSafeParseConfig;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import kotlin.jvm.internal.AwS569S0100000_25;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624200sMs {
    public static boolean LIZIZ(Effect effect) {
        if (!AigcArchAttachCountdownVideoExperiment.isEnabled() || effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        String strLJIIJ = C1446130njf.LJIIJ(effect, "AttachCountdown");
        if (!LIZLLL(effect)) {
            return false;
        }
        if (strLJIIJ != null && strLJIIJ.equals("false")) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Effect effect) {
        if (!AigcArchI2IMigrationExperiment.isEnabled() || effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        String strLJIIJ = C1446130njf.LJIIJ(effect, "AIGCSubType");
        if (strLJIIJ == null || !strLJIIJ.equals("i2i")) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        String strLJIIJ = C1446130njf.LJIIJ(effect, "IsAIGC");
        String strLJIIJ2 = C1446130njf.LJIIJ(effect, "AICanAsync");
        if (strLJIIJ == null || strLJIIJ2 == null || !strLJIIJ.equals("true") || !strLJIIJ2.equals("true")) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        String strLJIIJ = C1446130njf.LJIIJ(effect, "IsAIGC");
        if (strLJIIJ != null && strLJIIJ.equals("true")) {
            return true;
        }
        String strLJIIJ2 = C1446130njf.LJIIJ(effect, "AIType");
        if (strLJIIJ2 == null) {
            return false;
        }
        return strLJIIJ2.equals("aigc");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(com.ss.android.ugc.effectmanager.effect.model.Effect r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L1d
            java.lang.String r1 = r4.getPanel()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1e
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "effecttooltemplate"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L47
            if (r4 != 0) goto L1e
        L1d:
            return r3
        L1e:
            java.lang.String r2 = r4.getExtra()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1d
            java.lang.String r1 = "mobile_tool_template_biz_type"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L1d
            X.0njf r0 = X.C1446130njf.LIZ     // Catch: java.lang.Exception -> L49
            r0.getClass()     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = X.C1446130njf.LJFF(r4, r1)     // Catch: java.lang.Exception -> L49
            java.lang.String r1 = "ame"
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L49
            java.lang.String r0 = r2.toLowerCase(r0)     // Catch: java.lang.Exception -> L49
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L1d
        L47:
            r3 = 1
            return r3
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1624200sMs.LJFF(com.ss.android.ugc.effectmanager.effect.model.Effect):boolean");
    }

    public static boolean LJI(Effect effect) {
        int iOptInt;
        String effectId;
        if (!DisableStickerUnlockTypeParseExperiment.isEnabled()) {
            try {
                C1446130njf.LIZ.getClass();
                JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
                if (jSONObjectLJII != null) {
                    if (FullWidthHorizontalCarouselGetUnlockTypeSafeParseConfig.isEnabled()) {
                        iOptInt = jSONObjectLJII.optInt("lock_type", -1);
                    } else {
                        iOptInt = JSONObjectProtectorUtils.getInt(jSONObjectLJII, "lock_type");
                    }
                    if (iOptInt != -1) {
                        if (effect == null) {
                            effectId = "";
                        } else {
                            effectId = effect.getEffectId();
                        }
                        InterfaceC2140108Zz interfaceC2140108ZzLJ = C2219091BtD.LJ();
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("effect_id", effectId);
                        c0lab.LIZ(iOptInt, "lock_type");
                        interfaceC2140108ZzLJ.LIZ("studio_sticker_commerce_lock_type_hit", c0lab.LIZ);
                        if (iOptInt == 1) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                FullWidthHorizontalCarouselGetUnlockTypeSafeParseConfig.isEnabled();
                return false;
            }
        }
        return false;
    }

    public static boolean LJII(FaceStickerBean faceStickerBean) {
        String strOptString;
        C1446130njf.LIZ.getClass();
        JSONObject jSONObject = (JSONObject) new AwS569S0100000_25(faceStickerBean, 313).invoke();
        if (jSONObject != null) {
            strOptString = jSONObject.optString("type");
        } else {
            strOptString = null;
        }
        return "effectControlGame".equals(strOptString);
    }

    public static boolean LJIIIIZZ(Effect effect) {
        C1446130njf.LIZ.getClass();
        return "effectControlGame".equals(C1446130njf.LJIIJ(effect, "type"));
    }

    public static boolean LJIIIZ(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        if (!effect.getTags().contains("instrument") && !effect.getTypes().contains("Instrument")) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        Iterator<String> it2 = effect.getTags().iterator();
        while (it2.hasNext()) {
            if (it2.next().contains("lock")) {
                return true;
            }
        }
        return LJI(effect);
    }

    public static boolean LJIIJJI(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LJIILJJIL(effect, "use_multi_camera", false);
    }

    public static boolean LJIIL(FaceStickerBean faceStickerBean) {
        String strOptString;
        if (faceStickerBean != null) {
            C1446130njf.LIZ.getClass();
            if (!C1446130njf.LIZ(faceStickerBean, "is_music_beat", false)) {
                JSONObject jSONObject = (JSONObject) new AwS569S0100000_25(faceStickerBean, 313).invoke();
                if (jSONObject != null && (strOptString = jSONObject.optString("audio_graph")) != null && strOptString.length() != 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILIIL(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        if (!C1446130njf.LIZIZ(effect, "is_music_beat", false) && !C1622800sKc.LIZIZ(effect)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LJIILJJIL(effect, "triggered_slow_motion", false);
    }

    public static boolean LJIILL(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (LJIILIIL(effect)) {
            return true;
        }
        C1446130njf.LIZ.getClass();
        return C1446130njf.LIZIZ(effect, "music_is_force_bind", false);
    }

    public static boolean LJIILLIIL(Effect effect) {
        if (effect != null) {
            C1446130njf.LIZ.getClass();
            if (!TextUtils.isEmpty(C1446130njf.LJFF(effect, "template_id"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZ(Effect effect, String str) {
        C1446130njf.LIZ.getClass();
        return !TextUtils.isEmpty(C1446130njf.LJIIJ(effect, str));
    }
}
