package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0njf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446130njf {
    public static final C1446130njf LIZ = new C1446130njf();

    public static JSONObject LJI(FaceStickerBean faceStickerBean) {
        boolean z;
        if (faceStickerBean == null || TextUtils.equals(faceStickerBean.getExtra(), "{}")) {
            return null;
        }
        if (((Boolean) C257270A6j.LIZ.getValue()).booleanValue()) {
            return faceStickerBean.getExtraJSONObject();
        }
        String extra = faceStickerBean.getExtra();
        if (extra == null) {
            return null;
        }
        if (extra.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            extra = null;
        }
        if (extra == null) {
            return null;
        }
        try {
            return new JSONObject(extra);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static JSONObject LJII(Effect effect) {
        boolean z;
        if (effect == null || TextUtils.equals(effect.getExtra(), "{}")) {
            return null;
        }
        if (((Boolean) C257270A6j.LIZ.getValue()).booleanValue()) {
            return effect.getExtraJsonObject();
        }
        String extra = effect.getExtra();
        if (extra == null) {
            return null;
        }
        if (extra.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            extra = null;
        }
        if (extra == null) {
            return null;
        }
        try {
            return new JSONObject(extra);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static JSONObject LJIIIIZZ(FaceStickerBean faceStickerBean) {
        boolean z;
        if (faceStickerBean != null && !TextUtils.equals(faceStickerBean.getSdkExtra(), "{}")) {
            if (((Boolean) C257280A6k.LIZ.getValue()).booleanValue()) {
                return faceStickerBean.getSdkExtraJSONObject();
            }
            String sdkExtra = faceStickerBean.getSdkExtra();
            if (sdkExtra != null && sdkExtra.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    return new JSONObject(sdkExtra);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static JSONObject LJIIIZ(Effect effect) {
        boolean z;
        if (effect != null && !TextUtils.equals(effect.getSdkExtra(), "{}")) {
            if (((Boolean) C257280A6k.LIZ.getValue()).booleanValue()) {
                return effect.getSdkExtraJSONObject();
            }
            String sdkExtra = effect.getSdkExtra();
            if (sdkExtra.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    return new JSONObject(sdkExtra);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean LJIIJJI(FaceStickerBean faceStickerBean) {
        JSONObject jSONObjectLJIIIIZZ = LJIIIIZZ(faceStickerBean);
        if (jSONObjectLJIIIIZZ == null) {
            return false;
        }
        return LJIILIIL(jSONObjectLJIIIIZZ);
    }

    public static boolean LJIIL(Effect effect) {
        JSONObject jSONObjectLJIIIZ;
        if (effect != null && (jSONObjectLJIIIZ = LJIIIZ(effect)) != null) {
            return LJIILIIL(jSONObjectLJIIIZ);
        }
        return false;
    }

    public static boolean LJIILIIL(JSONObject jSONObject) {
        if (Intrinsics.LJFF(jSONObject.optString("IsAIGC"), "true") || Intrinsics.LJFF(jSONObject.optString("AIType"), "aigc") || (!a0.LJJJIL(jSONObject.optString("time_consuming_generate_effect")))) {
            return true;
        }
        return false;
    }

    public static String LJ(FaceStickerBean faceStickerBean, String str) {
        JSONObject jSONObjectLJI = LJI(faceStickerBean);
        if (jSONObjectLJI != null) {
            return jSONObjectLJI.optString(str);
        }
        return null;
    }

    public static String LJFF(Effect effect, String str) {
        JSONObject jSONObjectLJII = LJII(effect);
        if (jSONObjectLJII != null) {
            return jSONObjectLJII.optString(str);
        }
        return null;
    }

    public static String LJIIJ(Effect effect, String str) {
        JSONObject jSONObject = (JSONObject) new AwS566S0100000_22(effect, 333).invoke();
        if (jSONObject != null) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static boolean LIZ(FaceStickerBean faceStickerBean, String str, boolean z) {
        JSONObject jSONObjectLJI = LJI(faceStickerBean);
        if (jSONObjectLJI != null) {
            return jSONObjectLJI.optBoolean(str, z);
        }
        return z;
    }

    public static boolean LIZIZ(Effect effect, String str, boolean z) {
        JSONObject jSONObjectLJII = LJII(effect);
        if (jSONObjectLJII != null) {
            return jSONObjectLJII.optBoolean(str, z);
        }
        return z;
    }

    public static boolean LJIILJJIL(Effect effect, String str, boolean z) {
        JSONObject jSONObjectLJIIIZ = LJIIIZ(effect);
        if (jSONObjectLJIIIZ != null) {
            return jSONObjectLJIIIZ.optBoolean(str, z);
        }
        return z;
    }
}
