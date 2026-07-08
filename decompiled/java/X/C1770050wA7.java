package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wA7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770050wA7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1770080wAA c1770080wAA) {
        String str;
        Map<String, Object> map;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("stage", EnumC1770070wA9.REQUEST_REACH_CFG.getValue());
        if (c1770080wAA == null || (str = c1770080wAA.LIZ) == null) {
            str = "";
        }
        pairArr[1] = new Pair("video_id", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (c1770080wAA != null && (map = c1770080wAA.LJIIIZ) != null) {
            mapLJIIJ.putAll(map);
        }
        C1421105hJ.LIZJ("rd_tiktokec_shop_video_guide", mapLJIIJ);
    }

    public static void LIZIZ(EnumC1770130wAF enumC1770130wAF, int i, boolean z) {
        C1421105hJ.LIZJ("rd_tiktokec_shop_video_guide", C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, Integer.valueOf(i)), new Pair("stage", EnumC1770070wA9.VIDEO_GUIDE_DISMISS.getValue()), new Pair("action_type", enumC1770130wAF.getValue()), new Pair("is_from_pitaya", Boolean.valueOf(z))));
    }

    public static void LIZJ(C1770080wAA c1770080wAA, String str, String str2) {
        String str3;
        Map<String, Object> map;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, 1);
        pairArr[1] = new Pair("stage", EnumC1770070wA9.VIDEO_GUIDE_SHOW_FAIL.getValue());
        if (c1770080wAA == null || (str3 = c1770080wAA.LIZ) == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("video_id", str3);
        pairArr[3] = new Pair("err_msg", str);
        pairArr[4] = new Pair("is_from_pitaya", Boolean.FALSE);
        pairArr[5] = new Pair("trigger_type", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (c1770080wAA != null && (map = c1770080wAA.LJIIIZ) != null) {
            mapLJIIJ.putAll(map);
        }
        C1421105hJ.LIZJ("rd_tiktokec_shop_video_guide", mapLJIIJ);
    }

    public static void LIZLLL(C1770080wAA c1770080wAA, Map map, String str, String str2) {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("stage", EnumC1770070wA9.VIDEO_GUIDE_SHOW_SUCCESS.getValue());
        String str3 = c1770080wAA.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("video_id", str3);
        pairArr[2] = new Pair("is_from_pitaya", Boolean.FALSE);
        pairArr[3] = new Pair("trigger_type", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, Object> map2 = c1770080wAA.LJIIIZ;
        if (map2 != null) {
            mapLJIIJ.putAll(map2);
        }
        mapLJIIJ.putAll(map);
        if (str != null) {
            mapLJIIJ.put("search_guide_req_params", str);
        }
        C1421105hJ.LIZJ("rd_tiktokec_shop_video_guide", mapLJIIJ);
    }
}
