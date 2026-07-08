package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624520sNO {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"lock", "music_beat", "music_bind", "music_lyrics", "ar", "ar_text", "ar_core", "ar_shared", "game", "instrument", "voice_recognize", "voice_change", "slow_motion", "slow_mo_super", "dual_cam", "diy_prop_video", "background_video", "save_photo", "upload_image", "aigc_status", "aigc_offline", "aime_style", "commerce", "green_screen_reuse", "background_video_presenter", "multi_sticker", "schema", "composer", "upload_pic", "audio_graph", "option_list", "notice", "effect_editor", "child_effect", "mobile_effect_edit", "mobile_effect_fix", "always_fetch_challenge", "always_fetch_user", "always_ibe", "always_effect_use", "always_default_sensor", "always_favorite", "always_extra_info", "always_sticker_guide", "always_aigc_album_selection", "always_sticker_mob", "always_effect_channel", "always_effect_message_passthrough", "always_selected_package_download", "always_mobile_effect_export", "always_effect_label", "always_sticker_preview_resolution"});
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"ar_text", "voice_recognize", "audio_graph", "upload_pic", "always_extra_info", "always_favorite", "always_sticker_guide", "always_im_effect_info", "always_effect_channel"});

    public static final C1444570nh9 LIZ(Effect effect, EnumC1448460nnQ enumC1448460nnQ, List<String> list) {
        JSONArray jSONArrayOptJSONArray;
        Set<String> set;
        String strLJJLIIIJ;
        List<String> tags;
        if (effect == null) {
            return new C1444570nh9("none", "none");
        }
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (C1624200sMs.LJIILIIL(effect)) {
            c13dvLIZIZ.add("music_beat");
        }
        if (C1624200sMs.LJIIJ(effect) && !C1624200sMs.LJI(effect)) {
            c13dvLIZIZ.add("lock");
        }
        if (C1624200sMs.LJIILL(effect)) {
            c13dvLIZIZ.add("music_bind");
        }
        String sdkExtra = effect.getSdkExtra();
        if (sdkExtra != null) {
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(sdkExtra).optJSONObject("tool_music");
                if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("required_lyric_formats")) != null) {
                    if (jSONArrayOptJSONArray.length() > 0) {
                        c13dvLIZIZ.add("music_lyrics");
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C1624570sNT.LJFF(effect)) {
            c13dvLIZIZ.add("ar");
        }
        if (C1624570sNT.LJI(effect)) {
            c13dvLIZIZ.add("ar_text");
        }
        if (C1624570sNT.LJFF(effect) && effect.getTypes().contains("ARCore")) {
            c13dvLIZIZ.add("ar_core");
        }
        C1446130njf c1446130njf = C1446130njf.LIZ;
        c1446130njf.getClass();
        if (C1446130njf.LJIILJJIL(effect, "share_ar", false)) {
            c13dvLIZIZ.add("ar_shared");
        }
        if (C1624200sMs.LJIIIIZZ(effect)) {
            c13dvLIZIZ.add("game");
        }
        if (C1624200sMs.LJIIIZ(effect)) {
            c13dvLIZIZ.add("instrument");
        }
        if (C1624570sNT.LJJIIZ(effect)) {
            c13dvLIZIZ.add("voice_recognize");
        }
        if (!C1624570sNT.LJJIIZ(effect) && (tags = effect.getTags()) != null && tags.contains("voice_change")) {
            c13dvLIZIZ.add("voice_change");
        }
        if (C1624200sMs.LJIILJJIL(effect)) {
            c13dvLIZIZ.add("slow_motion");
        }
        if (C1449600npG.LJI(effect)) {
            c13dvLIZIZ.add("slow_mo_super");
        }
        if (C1624200sMs.LJIIJJI(effect)) {
            c13dvLIZIZ.add("dual_cam");
        }
        List<String> tags2 = effect.getTags();
        if (tags2 != null && tags2.contains("DiyPropVideo")) {
            c13dvLIZIZ.add("diy_prop_video");
        }
        if (C1624570sNT.LJIJJ(effect)) {
            c13dvLIZIZ.add("background_video");
        }
        if (C1624570sNT.LJJI(effect)) {
            c13dvLIZIZ.add("save_photo");
            c13dvLIZIZ.add("upload_image");
        }
        if (C1449600npG.LJFF(effect)) {
            c13dvLIZIZ.add("aigc_status");
        }
        if (C1624200sMs.LIZLLL(effect)) {
            c13dvLIZIZ.add("aigc_offline");
        }
        if (C1624550sNR.LIZIZ(effect)) {
            c13dvLIZIZ.add("aime_style");
        }
        if (effect.isBusiness() && !C1624200sMs.LJIIIIZZ(effect)) {
            c13dvLIZIZ.add("commerce");
        }
        if (C1449600npG.LIZJ(effect)) {
            c13dvLIZIZ.add("green_screen_reuse");
        }
        if (C1624570sNT.LJIIJ(effect)) {
            c13dvLIZIZ.add("background_video_presenter");
        }
        if (C1624570sNT.LJIJJLI(effect)) {
            c13dvLIZIZ.add("multi_sticker");
        }
        if (effect.getEffectType() == 2) {
            c13dvLIZIZ.add("schema");
        }
        if (C1624570sNT.LJIILIIL(effect)) {
            c13dvLIZIZ.add("composer");
        }
        if (!C1449600npG.LJIIIIZZ(effect) && !C1624550sNR.LIZLLL(effect) && !C1624570sNT.LJIIZILJ(effect) && C1624610sNX.LIZIZ(effect)) {
            c13dvLIZIZ.add("upload_pic");
        }
        if (C1449600npG.LJ(effect)) {
            c13dvLIZIZ.add("mobile_effect_fix");
        }
        c1446130njf.getClass();
        String strLJIIJ = C1446130njf.LJIIJ(effect, "audio_graph");
        if (strLJIIJ != null && strLJIIJ.length() != 0) {
            c13dvLIZIZ.add("audio_graph");
        }
        if ((C1624550sNR.LIZLLL(effect) || ((C1624550sNR.LJ(effect) && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_add_effect_button", true, false)) || (C1624550sNR.LIZJ(effect) && C1449600npG.LJII(effect)))) && !C1449600npG.LIZJ(effect)) {
            c13dvLIZIZ.add("option_list");
        }
        if (C1624560sNS.LIZ(effect)) {
            c13dvLIZIZ.add("notice");
        }
        c13dvLIZIZ.addAll(list);
        c13dvLIZIZ.add("always_fetch_challenge");
        c13dvLIZIZ.add("always_fetch_user");
        c13dvLIZIZ.add("always_ibe");
        c13dvLIZIZ.add("always_effect_use");
        if (!C1624570sNT.LJFF(effect)) {
            c13dvLIZIZ.add("always_default_sensor");
        }
        c13dvLIZIZ.add("always_favorite");
        c13dvLIZIZ.add("always_extra_info");
        c13dvLIZIZ.add("always_sticker_guide");
        c13dvLIZIZ.add("always_aigc_album_selection");
        c13dvLIZIZ.add("always_sticker_mob");
        c13dvLIZIZ.add("always_effect_channel");
        c13dvLIZIZ.add("always_effect_message_passthrough");
        c13dvLIZIZ.add("always_selected_package_download");
        c13dvLIZIZ.add("always_mobile_effect_export");
        c13dvLIZIZ.add("always_effect_label");
        c13dvLIZIZ.add("always_sticker_preview_resolution");
        c13dvLIZIZ.add("always_im_effect_info");
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        int i = C1448470nnR.LIZ[enumC1448460nnQ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                set = LIZIZ;
            } else {
                throw new C1954807lC();
            }
        } else {
            set = LIZ;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZ) {
            if (set.contains(obj)) {
                arrayList.add(obj);
            }
        }
        String strLJJLIIIJ2 = "default";
        if (listLIZ.isEmpty()) {
            strLJJLIIIJ = "default";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(listLIZ, ",", null, null, 0, null, null, 62);
        }
        if (!arrayList.isEmpty()) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        return new C1444570nh9(strLJJLIIIJ, strLJJLIIIJ2);
    }
}
