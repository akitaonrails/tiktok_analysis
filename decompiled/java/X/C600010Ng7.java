package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ng7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600010Ng7 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        String groupId;
        Aweme aweme;
        VideoItemParams videoItemParams2 = videoItemParams;
        Map<String, ? extends Object> map2 = map;
        if (videoItemParams2 == null || (aweme = videoItemParams2.getAweme()) == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        C0TX1.LIZLLL = new Pair<>(groupId, true);
        JSONObject jSONObject = new JSONObject();
        C1194640hC2.LIZ(jSONObject, videoItemParams2, map2);
        C20684815ws.LJIJ("ttls_poi_explore_btn_show", jSONObject);
        return new C1387205bq(null);
    }
}
