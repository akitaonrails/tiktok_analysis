package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.absetting.EnableFrontCameraOnlyAigcEffect;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624570sNT {
    public static final Map<String, Boolean> LIZ = new HashMap();

    public static String LIZ(Effect effect) {
        String str;
        if (effect != null && effect.getTags() != null && !effect.getTags().isEmpty()) {
            Iterator<String> it2 = effect.getTags().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (next != null && next.contains("challenge") && next.contains(":")) {
                    String[] strArrSplit = next.split(":");
                    if (strArrSplit.length > 1 && (str = strArrSplit[1]) != null && !str.isEmpty() && strArrSplit[1].matches("[0-9]+")) {
                        return strArrSplit[1];
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList<String> LIZIZ(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static String LIZJ(Effect effect) {
        JSONObject jSONObject;
        String strLJIIJ = "";
        if (effect == null) {
            return "";
        }
        if (!TextUtils.isEmpty(effect.getSdkExtra())) {
            C1446130njf.LIZ.getClass();
            strLJIIJ = C1446130njf.LJIIJ(effect, "tool_music");
        }
        if (TextUtils.isEmpty(strLJIIJ)) {
            String templateEffectExtra = effect.getTemplateEffectExtra();
            if (!TextUtils.isEmpty(templateEffectExtra)) {
                if (!TextUtils.isEmpty(templateEffectExtra)) {
                    try {
                        jSONObject = new JSONObject(templateEffectExtra);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return null;
                }
                return jSONObject.optString("tool_music");
            }
            return strLJIIJ;
        }
        return strLJIIJ;
    }

    public static boolean LIZLLL(Effect effect) {
        boolean z = false;
        if (effect == null || TextUtils.isEmpty(effect.getSdkExtra())) {
            return false;
        }
        HashMap map = (HashMap) LIZ;
        if (map.get(effect.getEffectId()) != null) {
            return ((Boolean) map.get(effect.getEffectId())).booleanValue();
        }
        try {
            C1446130njf.LIZ.getClass();
            z = JSONObjectProtectorUtils.getBoolean(JSONObjectProtectorUtils.getJSONObject(C1446130njf.LJIIIZ(effect), "tool_music"), "has_builtin_audio");
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        ((HashMap) LIZ).put(effect.getEffectId(), Boolean.valueOf(z));
        return z;
    }

    public static boolean LJ(Effect effect) {
        if (effect != null) {
            if ((effect.getTags() != null && effect.getTags().contains("text2d")) || effect.getTypes().contains("Text2D") || effect.getTypes().contains("Text2DV2")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJFF(Effect effect) {
        if (effect != null) {
            if (effect.getTypes() != null && effect.getTypes().contains("AR")) {
                return true;
            }
            if (effect.getRequirements() != null && effect.getRequirements().contains("AR")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJI(Effect effect) {
        if (!LJFF(effect) && !LJJIIJZLJL(effect) && !LJ(effect)) {
            return false;
        }
        return true;
    }

    public static boolean LJII(Effect effect) {
        AudioGraph audioGraph;
        C1446130njf.LIZ.getClass();
        String strLJIIJ = C1446130njf.LJIIJ(effect, "audio_graph");
        if (strLJIIJ != null && (audioGraph = (AudioGraph) GsonProtectorUtils.fromJson(C2219091BtD.LIZJ(), strLJIIJ, AudioGraph.class)) != null && audioGraph.enableMic()) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(Effect effect) {
        if ((effect != null && effect.getParentId() != null && !effect.getParentId().isEmpty()) || LJIJJLI(effect) || ((effect != null && effect.getTypes().contains("Adaptive")) || LJIIJ(effect) || C1624200sMs.LIZ(effect, "video_picker") || C1624610sNX.LIZIZ(effect) || LJIILIIL(effect) || LJIIIZ(effect) || LJIIZILJ(effect) || LJIILLIIL(effect))) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        if (!C1446130njf.LIZIZ(effect, "is_avatar", false) && !C1446130njf.LJIILJJIL(effect, "is_avatar", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(Effect effect) {
        if (!LJJIII(effect, "BackgroundVideo")) {
            C1446130njf.LIZ.getClass();
            if (!C1446130njf.LJIILJJIL(effect, "BackgroundVideo", false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIJJI(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (effect.isBusiness()) {
            return true;
        }
        try {
            if (1 != ((FaceStickerCommerceBean) new Gson().LJII(effect.getExtra(), FaceStickerCommerceBean.class)).commerceStickerType) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LJIIL(Effect effect) {
        if (effect == null) {
            return false;
        }
        return C1449600npG.LIZIZ(effect);
    }

    public static boolean LJIILIIL(Effect effect) {
        if (effect != null && effect.getTypes() != null && effect.getTypes().contains("Composer")) {
            return true;
        }
        return false;
    }

    public static boolean LJIILJJIL(Effect effect) {
        List listAsList = Arrays.asList(1, 6, 101, 102);
        if (effect != null && !TextUtils.isEmpty(effect.getDesignerId()) && listAsList.contains(Integer.valueOf(effect.getSource()))) {
            return true;
        }
        return false;
    }

    public static boolean LJIILL(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        if (!C1446130njf.LIZIZ(effect, "disturbing_effect", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(Effect effect) {
        if (effect != null && effect.getSource() == 10001) {
            return true;
        }
        return false;
    }

    public static boolean LJIIZILJ(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LIZIZ(effect, "half_customized", false);
    }

    public static boolean LJIJ(Effect effect) {
        if (effect == null || !EnableFrontCameraOnlyAigcEffect.isEnabled() || !C1624200sMs.LJ(effect) || !LJJIII(effect, "front_camera_only")) {
            return false;
        }
        return true;
    }

    public static boolean LJIJI(Effect effect) {
        if (effect != null && effect.getSdkExtra().contains("imgK")) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJ(Effect effect) {
        if (LJIIJ(effect) && LJJIII(effect, "MultiScanBgVideo")) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJLI(Effect effect) {
        if (effect != null && effect.getEffectType() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJIL(Effect effect) {
        if (effect != null && effect.getEffectType() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        if (!C1446130njf.LIZIZ(effect, "photosensitive", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJJI(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        return C1446130njf.LIZIZ(effect, "need_effect_to_capture_image", false);
    }

    public static boolean LJJIFFI(Effect effect) {
        if (effect != null && effect.getEffectType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LJJIIJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        Iterator<String> it2 = effect.getTags().iterator();
        while (it2.hasNext()) {
            if (it2.next().contains(":1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJIIJZLJL(Effect effect) {
        if (effect != null) {
            if ((effect.getTags() != null && effect.getTags().contains("TextEdit")) || effect.getTypes().contains("TextEdit")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJJIIZ(Effect effect) {
        if (!LJJIII(effect, "voice_recognization") && !LJII(effect)) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIZI(Effect effect) {
        if (LJJIIJZLJL(effect) || (effect != null && effect.getTags() != null && effect.getTags().contains("textInShoot"))) {
            return true;
        }
        return false;
    }

    public static Pair<String, Double> LJJIJ(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("use_music_ids");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0 || (jSONObject = (JSONObject) jSONArrayOptJSONArray.get(0)) == null) {
                return null;
            }
            String next = jSONObject.keys().next();
            if (TextUtils.isEmpty(next)) {
                return null;
            }
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, next);
            return new Pair<>(next, Double.valueOf(jSONObject2.optDouble(jSONObject2.keys().next(), 0.0d)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LJJII(FaceStickerBean faceStickerBean, String str) {
        if (faceStickerBean != FaceStickerBean.NONE && !C2401009ay.LIZ(faceStickerBean.getTags()) && faceStickerBean.getTags().contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean LJJIII(Effect effect, String str) {
        if (effect == null || C2401009ay.LIZ(effect.getTags()) || !effect.getTags().contains(str)) {
            return false;
        }
        return true;
    }
}
