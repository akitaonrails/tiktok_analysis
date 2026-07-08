package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0NgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600160NgM implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        String aid;
        Object obj;
        String str;
        Object obj2;
        String str2;
        Aweme aweme;
        VideoItemParams videoItemParams2 = videoItemParams;
        Map<String, ? extends Object> map2 = map;
        String str3 = "";
        if (videoItemParams2 == null || (aweme = videoItemParams2.getAweme()) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (map2 != null) {
            obj = map2.get("subscribe_state");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "";
        }
        if (map2 != null) {
            obj2 = map2.get("show_entrance");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
            str3 = str2;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("subscribe_state", str);
        c2344009Gk.LJIIIIZZ("show_entrance", str3);
        C20684815ws.LJIILLIIL("livesdk_subscribe_icon_show", c2344009Gk.LIZ);
        return new C1387205bq(null);
    }
}
