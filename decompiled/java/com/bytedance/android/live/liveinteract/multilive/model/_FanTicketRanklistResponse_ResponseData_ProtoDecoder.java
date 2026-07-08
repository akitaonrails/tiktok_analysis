package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FanTicketRanklistResponse_ResponseData_ProtoDecoder implements C0IMD<FanTicketRanklistResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(FanTicketRanklistResponse.ResponseData responseData) {
        User user;
        User user2;
        FanTicketRanklistResponse.ResponseData responseData2 = responseData;
        List<FanTicketRanklistResponse.RanklistUser> list = responseData2.ranklistUsers;
        if (list == null) {
            responseData2.ranklistUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (FanTicketRanklistResponse.RanklistUser ranklistUser : responseData2.ranklistUsers) {
                if (ranklistUser != null && (user = ranklistUser.user) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        FanTicketRanklistResponse.SelfInfo selfInfo = responseData2.selfInfo;
        if (selfInfo != null && (user2 = selfInfo.user) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        User user3 = responseData2.guestUser;
        if (user3 != null) {
            _User_ProtoDecoder.LJ(user3);
        }
    }

    @Override // X.C0IMD
    public final FanTicketRanklistResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FanTicketRanklistResponse.ResponseData responseData = new FanTicketRanklistResponse.ResponseData();
        responseData.ranklistUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.fanTicketTotal = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        responseData.ownIndex = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        responseData.ownScore = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        responseData.ranklistUsers.add(_FanTicketRanklistResponse_RanklistUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        responseData.countdownInfo = _FanTicketRanklistResponse_CountdownInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        responseData.selfInfo = _FanTicketRanklistResponse_SelfInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        responseData.roomResetPointAfterLeave = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        responseData.guestUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FanTicketRanklistResponse.ResponseData responseData, List list) {
    }
}
