package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0NvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609430NvJ implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        String str;
        String str2;
        String aid;
        Boolean boolValueOf;
        Aweme aweme;
        Aweme aweme2;
        PoiDataStruct poiDataStruct;
        VideoItemParams videoItemParams2 = videoItemParams;
        C609440NvK.LIZ().storeInt("sm_exposure_count", 0);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("button_name", "post_to_earn");
        if (videoItemParams2 != null) {
            str = videoItemParams2.mEventType;
        } else {
            str = null;
        }
        C1189060h32.LJIJJLI(c2344009Gk, "enter_from", str);
        if (videoItemParams2 != null && (aweme2 = videoItemParams2.getAweme()) != null && (poiDataStruct = aweme2.getPoiDataStruct()) != null) {
            str2 = poiDataStruct.poiId;
        } else {
            str2 = null;
        }
        C1189060h32.LJIJJLI(c2344009Gk, "poi_id", str2);
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C1189060h32.LJIJJLI(c2344009Gk, "item_id", aid);
        C1189060h32.LJIJJLI(c2344009Gk, "button_show_order", C2286608xc.LJ(C609440NvK.LIZ().getInt("sm_frequency_exposure_count", 0)));
        if (videoItemParams2 != null) {
            boolValueOf = Boolean.valueOf(C746102vj.LIZ(videoItemParams2));
        } else {
            boolValueOf = null;
        }
        C1189060h32.LJIJJLI(c2344009Gk, "is_joined", C2286608xc.LJ(C1189060h32.LJJIIZ(boolValueOf)));
        C20684815ws.LJIILLIIL("ttls_creator_button_click", c2344009Gk.LIZ);
        return new C1387205bq(null);
    }
}
