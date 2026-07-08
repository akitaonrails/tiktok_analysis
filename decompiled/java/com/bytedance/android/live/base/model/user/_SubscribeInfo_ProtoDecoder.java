package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import webcast.data._SubSplitStatus_ProtoDecoder;

/* JADX INFO: loaded from: classes36.dex */
public final class _SubscribeInfo_ProtoDecoder implements C0IMD<SubscribeInfo> {
    public static SubscribeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubscribeInfo subscribeInfo = new SubscribeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 101) {
                    switch (iLJI) {
                        case 1:
                            subscribeInfo.isAnchorQualified = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 2:
                            subscribeInfo.isSubscribed = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 3:
                            subscribeInfo.subscribeBadge = _SubscribeBadge_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            subscribeInfo.anchorEnableSubscription = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 5:
                            subscribeInfo.subscriberCount = (int) c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            subscribeInfo.isInGracePeriod = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 7:
                            subscribeInfo.isSubscribedToCurrentAnchor = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 8:
                            subscribeInfo.timerDetail = _TimerDetail_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            subscribeInfo.userGiftSubAuth = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            subscribeInfo.anchorGiftSubAuth = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            subscribeInfo.status = c1516680pZS.LJIIJ();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            subscribeInfo.subEndTime = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            subscribeInfo.packageId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 14:
                            subscribeInfo.solRoomDisplayText = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 15:
                            subscribeInfo.isSolEligible = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    subscribeInfo.subSplitStatus = _SubSplitStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subscribeInfo;
            }
        }
    }

    public static void LJ(SubscribeInfo subscribeInfo) {
        SubscribeBadge subscribeBadge = subscribeInfo.subscribeBadge;
        if (subscribeBadge != null) {
            ImageModel imageModel = subscribeBadge.originImage;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            ImageModel imageModel2 = subscribeBadge.previewImage;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubscribeInfo subscribeInfo) {
        LJ(subscribeInfo);
    }

    @Override // X.C0IMD
    public final SubscribeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubscribeInfo subscribeInfo, List list) {
    }
}
