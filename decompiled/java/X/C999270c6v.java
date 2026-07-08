package X;

import com.bytedance.android.livesdk.livesetting.feed.LiveCardComponentReversalConfigSetting;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedPreviewCardWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FYPCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.OecLivePreviewRoomData;
import com.ss.android.ugc.aweme.feed.model.live.PreviewPromotionInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0c6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999270c6v {
    public static boolean LIZ(C1ACA c1aca) {
        Aweme aweme;
        LiveRoomStruct liveRoomStruct;
        boolean z;
        FYPCommerceStruct fYPCommerceStruct;
        OecLivePreviewRoomData oecLivePreviewRoomDataObject;
        PreviewPromotionInfo previewPromotionInfo;
        String str;
        if (!(!LiveCardComponentReversalConfigSetting.reversalComponent(EcLiveFeedPreviewCardWidget.LLJILJIL.getComponentName().getValue()))) {
            return false;
        }
        Pair<Boolean, List<String>> pairLJJIL = ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).LJJIL();
        if ((!pairLJJIL.getFirst().booleanValue() || (c1aca != null && (str = c1aca.LIZLLL) != null && pairLJJIL.getSecond().contains(str))) && c1aca != null && (aweme = c1aca.LIZIZ) != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            String str2 = EcLiveFeedPreviewCardWidget.LLJILJILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("liveHolderSelected, isAd = ");
            sbLIZ.append(aweme.isAd());
            sbLIZ.append(" , hasCommerceGoods = ");
            sbLIZ.append(liveRoomStruct.hasCommerceGoods);
            sbLIZ.append(" , commercePermission = ");
            sbLIZ.append(liveRoomStruct.commercePermission);
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            if (liveRoomStruct.hasCommerceGoods && liveRoomStruct.commercePermission > 0) {
                z = true;
            } else {
                z = false;
            }
            if (aweme.isAd()) {
                if (!((Boolean) C0A6M.LIZ.getValue()).booleanValue() || !z) {
                    return false;
                }
            } else if (!z || c1aca == null) {
                return false;
            }
            LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
            if (liveRoomStruct2 != null && (fYPCommerceStruct = liveRoomStruct2.fypCommerceStruct) != null && (oecLivePreviewRoomDataObject = fYPCommerceStruct.getOecLivePreviewRoomDataObject()) != null && (previewPromotionInfo = oecLivePreviewRoomDataObject.previewPromotionInfo) != null) {
                if (previewPromotionInfo.icon != null || previewPromotionInfo.icons != null) {
                    if (previewPromotionInfo.secondLine != null || previewPromotionInfo.previewBenefitLine != null) {
                        if (previewPromotionInfo.firstLine != null || previewPromotionInfo.previewPriceInfo != null) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
