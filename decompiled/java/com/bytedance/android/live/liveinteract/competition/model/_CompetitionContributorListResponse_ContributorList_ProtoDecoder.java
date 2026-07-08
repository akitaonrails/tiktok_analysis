package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorListResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionContributorListResponse_ContributorList_ProtoDecoder implements C0IMD<CompetitionContributorListResponse.ContributorList> {
    public static CompetitionContributorListResponse.ContributorList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionContributorListResponse.ContributorList contributorList = new CompetitionContributorListResponse.ContributorList();
        contributorList.contributors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            contributorList.requesterInfo = _CompetitionContributorListResponse_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        contributorList.anchorInfo = _CompetitionContributorListResponse_AnchorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    contributorList.contributors.add(_CompetitionContributorListResponse_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return contributorList;
            }
        }
    }

    public static void LJ(CompetitionContributorListResponse.ContributorList contributorList) {
        User user;
        User user2;
        User user3;
        List<CompetitionContributorListResponse.UserInfo> list = contributorList.contributors;
        if (list == null) {
            contributorList.contributors = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CompetitionContributorListResponse.UserInfo userInfo : contributorList.contributors) {
                if (userInfo != null && (user = userInfo.user) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        CompetitionContributorListResponse.AnchorInfo anchorInfo = contributorList.anchorInfo;
        if (anchorInfo != null && (user3 = anchorInfo.user) != null) {
            _User_ProtoDecoder.LJ(user3);
        }
        CompetitionContributorListResponse.UserInfo userInfo2 = contributorList.requesterInfo;
        if (userInfo2 != null && (user2 = userInfo2.user) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionContributorListResponse.ContributorList contributorList) {
        LJ(contributorList);
    }

    @Override // X.C0IMD
    public final CompetitionContributorListResponse.ContributorList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionContributorListResponse.ContributorList contributorList, List list) {
    }
}
