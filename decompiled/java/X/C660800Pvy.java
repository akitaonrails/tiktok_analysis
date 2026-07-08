package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.config.SearchVideoPOIAnchorData;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Pvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660800Pvy {
    public static final C660800Pvy LIZ = new C660800Pvy();

    public static PoiDataStruct LIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getSearchPoiDataStruct() != null) {
            return aweme.getSearchPoiDataStruct();
        }
        if (!((SearchVideoPOIAnchorData) C0BRS.LIZIZ.getValue()).showSearchPoiAnchor) {
            return null;
        }
        return aweme.getRawPoiDataStruct();
    }

    public static void LIZIZ(InterfaceC214902198i interfaceC214902198i, C19EG c19eg, Aweme aweme, String str, String str2) {
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        String aid;
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorInfo poiAnchorInfo2;
        List<PoiSubTag> list;
        String str7;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        PoiDataStruct poiDataStructLIZ = LIZ(aweme);
        SAFHelper.LIZ.getClass();
        ISearchContextAbility iSearchContextAbilityLJJIZ = SAFHelper.LJJIZ(c19eg, interfaceC214902198i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iSearchContextAbilityLJJIZ != null && (c0pcyPh12 = iSearchContextAbilityLJJIZ.Ph1()) != null && (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) != null) {
            linkedHashMap.put("search_id", c0prc2.LLILLL);
        }
        C651970Phj.LLILLL.getClass();
        C651980Phk.LJFF(linkedHashMap, false);
        String aid2 = null;
        if (iSearchContextAbilityLJJIZ != null && (c0pcyPh1 = iSearchContextAbilityLJJIZ.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            str3 = c0prc.LLLLIILLL;
        } else {
            str3 = null;
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PageFinder pageFinderVia = PageFinder.via(str3);
        BcmParams bcmParams = new BcmParams();
        String strLIZ = C436190H8n.LIZ(aweme);
        String str8 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        bcmParams.put("aweme_id", strLIZ);
        if (poiDataStructLIZ == null || (str4 = poiDataStructLIZ.poiId) == null) {
            str4 = "";
        }
        bcmParams.put("poi_id", str4);
        String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken("c78057.d14691", pageFinderVia, bcmParams);
        C647450PaR.LIZ.getClass();
        String strLIZ2 = C647450PaR.LIZ(iSearchContextAbilityLJJIZ, aweme);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://poi/detail");
        if (poiDataStructLIZ != null && (str7 = poiDataStructLIZ.poiId) != null) {
            str8 = str7;
        }
        smartRouteBuildRoute.withParam("poi_id", str8);
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("enter_method", str2);
        if (poiDataStructLIZ != null) {
            str5 = poiDataStructLIZ.collectInfo;
        } else {
            str5 = null;
        }
        smartRouteBuildRoute.withParam("collect_info", str5);
        if (poiDataStructLIZ != null && (poiAnchorInfo2 = poiDataStructLIZ.videoAnchor) != null && (list = poiAnchorInfo2.subTags) != null && C13LP.LJJJLL(list) != null) {
            i = 1;
        } else {
            i = 0;
        }
        smartRouteBuildRoute.withParam("expand", i);
        if (poiDataStructLIZ != null && (poiAnchorInfo = poiDataStructLIZ.videoAnchor) != null) {
            str6 = poiAnchorInfo.trackInfo;
        } else {
            str6 = null;
        }
        smartRouteBuildRoute.withParam("track_info", str6);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        smartRouteBuildRoute.withParam("group_id", aid);
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        smartRouteBuildRoute.withParam("from_group_id", aid2);
        smartRouteBuildRoute.withParam("source_btm_token", strCreateJumpSourceBtmToken);
        if (strLIZ2 != null) {
            smartRouteBuildRoute.withParam("local_service_passthrough_params", strLIZ2);
        }
        smartRouteBuildRoute.open();
    }
}
