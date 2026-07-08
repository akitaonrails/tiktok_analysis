package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ng6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600000Ng6 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        JSONObject jSONObject = new JSONObject();
        C1194640hC2.LIZ(jSONObject, videoItemParams, map);
        C20684815ws.LJIJ("ttls_poi_explore_btn_click", jSONObject);
        return new C1387205bq(null);
    }
}
