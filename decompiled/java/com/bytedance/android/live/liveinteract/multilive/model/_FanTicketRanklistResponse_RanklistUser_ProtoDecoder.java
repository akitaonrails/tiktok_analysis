package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FanTicketRanklistResponse_RanklistUser_ProtoDecoder implements C0IMD<FanTicketRanklistResponse.RanklistUser> {
    public static FanTicketRanklistResponse.RanklistUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FanTicketRanklistResponse.RanklistUser ranklistUser = new FanTicketRanklistResponse.RanklistUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            ranklistUser.index = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        ranklistUser.score = c1516680pZS.LJIIJJI();
                    }
                } else {
                    ranklistUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ranklistUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FanTicketRanklistResponse.RanklistUser ranklistUser) {
        User user = ranklistUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final FanTicketRanklistResponse.RanklistUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FanTicketRanklistResponse.RanklistUser ranklistUser, List list) {
    }
}
