package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10eV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19296910eV {
    public static final HashMap<String, Map<String, Integer>> LIZ = C2097608Jq.LJI(new Pair("im_push_preview_v2", C2097908Jt.LIZJ(new Pair("im_push", 1))), new Pair("im_msg_req_push", C2097608Jq.LJIIIIZZ(new Pair("im_push", 1), new Pair("im_push_select", 0))), new Pair("im_alert_tones", C2097908Jt.LIZJ(new Pair("im_push", 1))), new Pair("in_app_im_msg_sound", C2097908Jt.LIZJ(new Pair("in_app_im_push", 1))), new Pair("in_app_im_msg_vibration", C2097908Jt.LIZJ(new Pair("in_app_im_push", 1))), new Pair("in_app_im_msg_req_push", C2097908Jt.LIZJ(new Pair("in_app_im_push", 1))), new Pair("in_app_vibrate_live_push", C2097908Jt.LIZJ(new Pair("live_inner_push", 1))));

    public static boolean LIZIZ(String str, Map map) {
        int iLIZLLL;
        Integer num;
        Map<String, Integer> map2 = LIZ.get(str);
        if (map2 == null) {
            return false;
        }
        if (!map2.isEmpty()) {
            for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                if (map != null && (num = (Integer) map.get(entry.getKey())) != null) {
                    iLIZLLL = num.intValue();
                } else {
                    iLIZLLL = C19328310jZ.LIZIZ.LIZLLL(entry.getKey());
                }
                if (iLIZLLL != entry.getValue().intValue() || !C824420WVs.LIZ(entry.getKey())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LIZJ(String str, Map map) {
        if ((!LIZ.isEmpty()) && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                Map<String, Integer> map2 = LIZ.get(str);
                if (map2 != null && map2.containsKey(entry.getKey())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LIZ(PushItem pushItem, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if (pushItem.LIZ() || z) {
            C844470XAv.LIZ.getClass();
            if (!C824390WVp.LIZJ(C844470XAv.LIZ())) {
                return false;
            }
        }
        HashMap<String, Map<String, Integer>> map = LIZ;
        if ((!map.isEmpty()) && map.containsKey(pushItem.itemId) && !LIZIZ(pushItem.itemId, null)) {
            return false;
        }
        return true;
    }
}
