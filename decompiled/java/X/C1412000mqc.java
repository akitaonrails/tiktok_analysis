package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412000mqc {
    public static final Map<String, String> LIZ(VideoPublishEditModel videoPublishEditModel) {
        Pair[] pairArr = new Pair[6];
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("shoot_way", str);
        pairArr[1] = new Pair("creation_id", videoPublishEditModel.getCreationId());
        pairArr[2] = new Pair("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        pairArr[3] = new Pair("enter_from", "video_edit_page");
        pairArr[4] = new Pair("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        pairArr[5] = new Pair("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final <T> void LIZIZ(String str, Map<String, ? extends T> map) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            c0lab.LIZLLL(entry.getValue(), entry.getKey());
        }
        C2341909Fp.LIZ(str, c0lab.LIZ);
    }

    public static final void LIZLLL(String str, String str2) {
        LIZIZ("edit_recommend_effect_hit_cache_info", C2097608Jq.LJIIIIZZ(new Pair("effect_id", str), new Pair("from_cache", str2)));
    }

    public static final void LJ(int i, String str) {
        LIZIZ("edit_recommend_effect_request_info", C2097608Jq.LJIIJ(new Pair("duration", Integer.valueOf(i)), new Pair("status_code", str)));
    }

    public static final void LJFF(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action_type", str), new Pair("impr_position", Integer.valueOf(i)));
        mapLJIIJ.putAll(LIZ(videoPublishEditModel));
        LIZIZ("effects_scroll_wheel_icon_fade_out", mapLJIIJ);
    }

    public static final void LIZJ(String str, String str2, int i, int i2, Integer num) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("effect_id", str), new Pair("impr_position", Integer.valueOf(i)), new Pair("error_msg", str2), new Pair("status_code", Integer.valueOf(i2)));
        if (num != null) {
            mapLJIIJ.put("durationMs", num);
        }
        LIZIZ("edit_recommend_effect_apply_info", mapLJIIJ);
    }
}
