package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.PostSearchInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.feed.model.live.HotReloadFeedParams;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DCD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCD<I> implements InterfaceC2251961DCg {
    public static final C1DCD<I> LIZ = new C1DCD<>();

    @Override // X.InterfaceC2251961DCg
    public final void LIZIZ(C204535151p c204535151p) {
        Aweme aweme;
        boolean z;
        String reqId;
        Long adId;
        int duration;
        AwemeRawAd awemeRawAd;
        EcommerceInfo ecommerceInfo;
        HotReloadFeedParams hotReloadFeedParams;
        SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
        InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
        if (interfaceC582850MtX instanceof C2183911AdZ) {
            aweme = ((C2183911AdZ) interfaceC582850MtX).LIZIZ;
        } else if (interfaceC582850MtX instanceof C582300Mse) {
            aweme = ((C582300Mse) interfaceC582850MtX).LIZ;
        } else {
            return;
        }
        sessionFeatureItem.isAd = Boolean.valueOf(aweme.isAd());
        sessionFeatureItem.awemeType = Integer.valueOf(aweme.getAwemeType());
        Long creativeId = null;
        if (C2252021DCm.LJFF) {
            sessionFeatureItem.LIZ = AwemeExtKt.getAuthorUid(aweme);
        } else {
            sessionFeatureItem.LIZ = null;
        }
        if (C0BTE.LIZ()) {
            LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
            sessionFeatureItem.isLive = Boolean.valueOf(AwemeSaaSExtKt.isLive(aweme));
            if (liveRoomStructLJI != null) {
                hotReloadFeedParams = liveRoomStructLJI.hotReloadFeedParams;
            } else {
                hotReloadFeedParams = null;
            }
            sessionFeatureItem.LIZJ = hotReloadFeedParams;
        }
        sessionFeatureItem.timestamp = System.currentTimeMillis();
        boolean z2 = true;
        if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJZ(aweme) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && Intrinsics.LJFF(ecommerceInfo.isEcom(), Boolean.TRUE))) {
            z = true;
        } else {
            z = false;
        }
        sessionFeatureItem.isEcom = Boolean.valueOf(z);
        if (C2252021DCm.LIZLLL) {
            if (AwemeExtKt.isPhotoMode(aweme)) {
                sessionFeatureItem.videoDuration = Integer.valueOf(C1EE2.LIZIZ.LJJIJIL(aweme));
            } else {
                Video video = aweme.getVideo();
                if (video != null) {
                    duration = video.getDuration();
                } else {
                    duration = -1;
                }
                sessionFeatureItem.videoDuration = Integer.valueOf(duration);
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_feature_gating_add_ecom_item_logid", true) && Intrinsics.LJFF(sessionFeatureItem.isEcom, Boolean.TRUE)) {
            sessionFeatureItem.logId = aweme.getRequestId();
        }
        C275630ArB.LIZ.getClass();
        if (((Boolean) C275630ArB.LIZIZ.getValue()).booleanValue() && aweme.isAd()) {
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ != null) {
                reqId = awemeRawAdLJJIJLIJ.getReqId();
            } else {
                reqId = null;
            }
            sessionFeatureItem.logId = reqId;
            AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ2 != null) {
                adId = awemeRawAdLJJIJLIJ2.getAdId();
            } else {
                adId = null;
            }
            sessionFeatureItem.adId = adId;
            AwemeRawAd awemeRawAdLJJIJLIJ3 = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ3 != null) {
                creativeId = awemeRawAdLJJIJLIJ3.getCreativeId();
            }
            sessionFeatureItem.creativeId = creativeId;
        }
        if (C21141917oP.LIZ()) {
            ArrayList arrayList = new ArrayList();
            List<PostSearchInfo> postSearchInfoList = aweme.getPostSearchInfoList();
            if (postSearchInfoList != null) {
                for (PostSearchInfo postSearchInfo : postSearchInfoList) {
                    arrayList.add(new C558502Fr(postSearchInfo.queryId, postSearchInfo.recalledQuery, postSearchInfo.recalledQuerySearchTS));
                }
            }
            if (!arrayList.isEmpty()) {
                sessionFeatureItem.LIZIZ = arrayList;
            }
        }
        if (C0BPM.LIZ()) {
            sessionFeatureItem.logId = aweme.getRequestId();
        }
        if (((Boolean) C269560AhO.LIZ.getValue()).booleanValue()) {
            if (!Intrinsics.LJFF(sessionFeatureItem.isEcom, Boolean.TRUE)) {
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                if (anchors != null) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AnchorCommonStruct next = it2.next();
                        if (next.getType() == 89) {
                            if (next == null) {
                                break;
                            }
                        }
                    }
                } else {
                    z2 = false;
                }
            }
            sessionFeatureItem.isEcom = Boolean.valueOf(z2);
        }
    }
}
