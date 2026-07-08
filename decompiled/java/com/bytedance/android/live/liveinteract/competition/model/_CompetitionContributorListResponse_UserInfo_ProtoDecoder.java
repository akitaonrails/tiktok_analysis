package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorListResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionContributorListResponse_UserInfo_ProtoDecoder implements C0IMD<CompetitionContributorListResponse.UserInfo> {
    public static CompetitionContributorListResponse.UserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionContributorListResponse.UserInfo userInfo = new CompetitionContributorListResponse.UserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        userInfo.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        userInfo.score = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        userInfo.formattedScore = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        userInfo.commentScore = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        userInfo.formattedCommentScore = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        userInfo.diamondScore = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        userInfo.formattedDiamondScore = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        userInfo.diamondBeansScore = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        userInfo.formattedDiamondBeansScore = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        userInfo.taskContributionStatus = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        userInfo.contributorRank = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        userInfo.contributorRankStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionContributorListResponse.UserInfo userInfo) {
        User user = userInfo.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final CompetitionContributorListResponse.UserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionContributorListResponse.UserInfo userInfo, List list) {
    }
}
