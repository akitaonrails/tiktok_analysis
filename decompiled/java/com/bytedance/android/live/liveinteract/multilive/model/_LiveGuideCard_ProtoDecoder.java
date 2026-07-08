package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveGuideCard_ProtoDecoder implements C0IMD<LiveGuideCard> {
    public static LiveGuideCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveGuideCard liveGuideCard = new LiveGuideCard();
        liveGuideCard.friendListTop3Avatar = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    liveGuideCard.scene = c1516680pZS.LJIIJ();
                                }
                            } else {
                                liveGuideCard.inRoomFriendTotalCount = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            liveGuideCard.friendListTop3Avatar.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        liveGuideCard.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    liveGuideCard.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveGuideCard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveGuideCard liveGuideCard) {
        LiveGuideCard liveGuideCard2 = liveGuideCard;
        if (liveGuideCard2.friendListTop3Avatar == null) {
            liveGuideCard2.friendListTop3Avatar = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LiveGuideCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveGuideCard liveGuideCard, List list) {
    }
}
