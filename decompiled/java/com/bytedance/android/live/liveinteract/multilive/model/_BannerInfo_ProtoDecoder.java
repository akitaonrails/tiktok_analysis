package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class _BannerInfo_ProtoDecoder implements C0IMD<BannerInfo> {
    public static BannerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BannerInfo bannerInfo = new BannerInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bannerInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        bannerInfo.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        bannerInfo.textColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        bannerInfo.leftColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        bannerInfo.rightColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        bannerInfo.coreImageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        bannerInfo.backgroundImageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        bannerInfo.gradientAngle = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        bannerInfo.priority = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        bannerInfo.bannerUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        bannerInfo.bannerId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BannerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BannerInfo bannerInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BannerInfo bannerInfo, List list) {
    }
}
