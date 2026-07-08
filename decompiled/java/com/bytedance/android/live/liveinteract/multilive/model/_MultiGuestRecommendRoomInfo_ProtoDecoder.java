package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestRecommendRoomInfo_ProtoDecoder implements C0IMD<MultiGuestRecommendRoomInfo> {
    public static MultiGuestRecommendRoomInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo = new MultiGuestRecommendRoomInfo();
        multiGuestRecommendRoomInfo.hostRecoTags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiGuestRecommendRoomInfo.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        multiGuestRecommendRoomInfo.hostInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        multiGuestRecommendRoomInfo.hostRecoTags.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        multiGuestRecommendRoomInfo.guestNum = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        multiGuestRecommendRoomInfo.viewerNum = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        multiGuestRecommendRoomInfo.recoReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        multiGuestRecommendRoomInfo.recoRank = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        multiGuestRecommendRoomInfo.autoPermit = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestRecommendRoomInfo;
            }
        }
    }

    public static void LJ(MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo) {
        User user = multiGuestRecommendRoomInfo.hostInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        if (multiGuestRecommendRoomInfo.hostRecoTags == null) {
            multiGuestRecommendRoomInfo.hostRecoTags = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo) {
        LJ(multiGuestRecommendRoomInfo);
    }

    @Override // X.C0IMD
    public final MultiGuestRecommendRoomInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo, List list) {
    }
}
