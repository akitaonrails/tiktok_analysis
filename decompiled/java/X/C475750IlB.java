package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0IlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475750IlB {
    public static Map LIZ() {
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C930650aKF.class);
        if (map == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get("related_from_video_id");
        if (obj != null) {
            linkedHashMap.put("related_from_video_id", obj);
        }
        Object obj2 = map.get("related_from_request_id");
        if (obj2 != null) {
            linkedHashMap.put("related_from_request_id", obj2);
        }
        Object obj3 = map.get("related_live_tag");
        if (obj3 != null) {
            linkedHashMap.put("related_live_tag", obj3);
        }
        Object obj4 = map.get("game_bottom_bar_scene");
        if (obj4 != null) {
            linkedHashMap.put("game_bottom_bar_scene", obj4);
        }
        Object obj5 = map.get("search_id");
        if (obj5 != null) {
            linkedHashMap.put("search_id", obj5);
        }
        return linkedHashMap;
    }
}
