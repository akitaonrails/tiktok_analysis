package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.nearby.component.NearbyFeedDetailQuitComponent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205220hT6 extends AbstractC2361009My {
    public final /* synthetic */ NearbyFeedDetailQuitComponent LL;

    @Override // X.AbstractC2361009My
    public final Map<String, String> mobExtraParams() {
        HashMap<String, String> map = new HashMap<>();
        C1205250hT9 c1205250hT9 = C1205250hT9.LIZIZ;
        c1205250hT9.LIZJ("homepage_nearby", map, this.LL.LLILLJJLI, true);
        NearbyFeedDetailQuitComponent nearbyFeedDetailQuitComponent = this.LL;
        C1189060h32.LJJ("enter_from", "homepage_nearby", map);
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        IPoiService iPoiServiceLIZ2 = C1367960lha.LIZ();
        Aweme aweme = nearbyFeedDetailQuitComponent.LLILLJJLI;
        String requestId = null;
        C1189060h32.LJIJJ(map, iPoiServiceLIZ.LJIILJJIL(nearbyFeedDetailQuitComponent.LLILLJJLI, iPoiServiceLIZ2.LJLJL(aweme != null ? aweme.getAid() : null)));
        Aweme aweme2 = nearbyFeedDetailQuitComponent.LLILLJJLI;
        C1189060h32.LJJ("group_id", aweme2 != null ? aweme2.getGroupId() : null, map);
        Aweme aweme3 = nearbyFeedDetailQuitComponent.LLILLJJLI;
        C1189060h32.LJJ("author_id", aweme3 != null ? AwemeExtKt.getAuthorUid(aweme3) : null, map);
        C1189060h32.LJJ("nearby_inner_session_id", String.valueOf(c1205250hT9.LIZLLL()), map);
        Aweme aweme4 = nearbyFeedDetailQuitComponent.LLILLJJLI;
        C1189060h32.LJJ("aweme_type", aweme4 != null ? Integer.valueOf(aweme4.getAwemeType()).toString() : null, map);
        Aweme aweme5 = nearbyFeedDetailQuitComponent.LLILLJJLI;
        boolean zLIZ = C123100dR.LIZ(aweme5 != null ? aweme5.getLogPbString() : null);
        Aweme aweme6 = nearbyFeedDetailQuitComponent.LLILLJJLI;
        if (zLIZ) {
            if (aweme6 != null) {
                requestId = aweme6.getLogPbString();
            }
        } else if (aweme6 != null) {
            requestId = aweme6.getRequestId();
        }
        C1189060h32.LJJ("log_pb", requestId, map);
        return map;
    }

    public C1205220hT6(NearbyFeedDetailQuitComponent nearbyFeedDetailQuitComponent) {
        this.LL = nearbyFeedDetailQuitComponent;
    }
}
