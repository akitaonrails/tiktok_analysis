package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._GuestApplyInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendItem_ProtoDecoder implements C0IMD<RecommendItem> {
    public static RecommendItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RecommendItem recommendItem = new RecommendItem();
        recommendItem.showUserList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        recommendItem.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        recommendItem.requestId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        recommendItem.recallReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        recommendItem.relationType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        recommendItem.skylightItemType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        recommendItem.user = _RecommendShowUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        recommendItem.showUserList.add(_RecommendShowUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        recommendItem.guestApplyInfo = _GuestApplyInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return recommendItem;
            }
        }
    }

    public static void LJ(RecommendItem recommendItem) {
        User user;
        User user2;
        Room room = recommendItem.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
        RecommendShowUser recommendShowUser = recommendItem.user;
        if (recommendShowUser != null && (user2 = recommendShowUser.user) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        List<RecommendShowUser> list = recommendItem.showUserList;
        if (list == null) {
            recommendItem.showUserList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RecommendShowUser recommendShowUser2 : recommendItem.showUserList) {
            if (recommendShowUser2 != null && (user = recommendShowUser2.user) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RecommendItem recommendItem) {
        LJ(recommendItem);
    }

    @Override // X.C0IMD
    public final RecommendItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendItem recommendItem, List list) {
    }
}
