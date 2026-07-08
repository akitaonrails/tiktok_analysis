package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194640hC2 {
    public static void LIZ(JSONObject jSONObject, VideoItemParams videoItemParams, Map map) {
        String groupId;
        Map map2;
        String str;
        Aweme aweme;
        C2365509Or.LIZLLL(jSONObject, "btm", "a2270.b2001.c33745.d0");
        C2365509Or.LIZLLL(jSONObject, "current_page", "homepage_hot");
        C2365509Or.LIZLLL(jSONObject, "enable_location", Boolean.valueOf(C1207450hWh.LIZ.LJII(0, C1BWL.LIZ())));
        C2365509Or.LIZLLL(jSONObject, "from_gps_card_type", Integer.valueOf(C297490BlL.LIZ()));
        String str2 = "";
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        C2365509Or.LIZLLL(jSONObject, "group_id", groupId);
        Object obj = null;
        if (map != null) {
            obj = map.get("event_params");
        }
        if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (str = (String) key) != null) {
                    C2365509Or.LIZLLL(jSONObject, str, value);
                }
            }
        }
        String str3 = C0TX1.LIZJ;
        if (str3 != null) {
            str2 = str3;
        }
        C2365509Or.LIZLLL(jSONObject, "creation_id", str2);
    }
}
