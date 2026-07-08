package com.bytedance.android.live.base.model.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.model._FeedBannerContainer_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.api.feed.LiveTab;
import webcast.api.feed.LiveTabMG;
import webcast.api.feed.TabMGTopLive;
import webcast.api.feed._LiveTab_ProtoDecoder;
import webcast.api.feed._TabMGTopLive_ProtoDecoder;
import webcast.data._NearbyTabConfig_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _FeedExtra_ProtoDecoder implements C0IMD<FeedExtra> {
    @Override // X.C0IMD
    public final void LIZ(FeedExtra feedExtra) {
        LiveTabMG liveTabMG;
        TabMGTopLive tabMGTopLive;
        FeedExtra feedExtra2 = feedExtra;
        FeedBannerContainer feedBannerContainer = feedExtra2.bannerContainer;
        if (feedBannerContainer != null) {
            _FeedBannerContainer_ProtoDecoder.LJ(feedBannerContainer);
        }
        List<LiveTab> list = feedExtra2.tabs;
        if (list == null) {
            feedExtra2.tabs = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (LiveTab liveTab : feedExtra2.tabs) {
            if (liveTab != null && (liveTabMG = liveTab.liveTabMg) != null && (tabMGTopLive = liveTabMG.topLive) != null) {
                _TabMGTopLive_ProtoDecoder.LJ(tabMGTopLive);
            }
        }
    }

    @Override // X.C0IMD
    public final FeedExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FeedExtra feedExtra = new FeedExtra();
        feedExtra.tabs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        feedExtra.protoLogPb = _FeedExtra_LogPb_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                    case 4:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case 14:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 3:
                        feedExtra.hasMore = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        feedExtra.cost = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        feedExtra.maxTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        feedExtra.minTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        feedExtra.total = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        feedExtra.bannerContainer = _FeedBannerContainer_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        feedExtra.unreadExtra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        feedExtra.style = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        feedExtra.hashtag_text = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        feedExtra.now = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        feedExtra.noResultReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        feedExtra.oceanReqInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        feedExtra.exitGuide = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        feedExtra.exitGuideMusic = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        feedExtra.tabs.add(_LiveTab_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 21:
                        feedExtra.searchId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        feedExtra.requestSource = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 23:
                        feedExtra.nearbyTabConfig = _NearbyTabConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return feedExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeedExtra feedExtra, List list) {
    }
}
