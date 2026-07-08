package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageOrderInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TakeTheStageOrderInfo_ProtoDecoder implements C0IMD<TakeTheStageOrderInfo> {
    public static TakeTheStageOrderInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TakeTheStageOrderInfo takeTheStageOrderInfo = new TakeTheStageOrderInfo();
        takeTheStageOrderInfo.anchors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            takeTheStageOrderInfo.switchTurnReason = c1516680pZS.LJIIJ();
                        }
                    } else {
                        takeTheStageOrderInfo.initiator = _CompetitionUserBase_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    takeTheStageOrderInfo.anchors.add(_TakeTheStageOrderInfo_AnchorInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return takeTheStageOrderInfo;
            }
        }
    }

    public static void LJ(TakeTheStageOrderInfo takeTheStageOrderInfo) {
        List<TakeTheStageOrderInfo.AnchorInfo> list = takeTheStageOrderInfo.anchors;
        if (list == null) {
            takeTheStageOrderInfo.anchors = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<TakeTheStageOrderInfo.AnchorInfo> it2 = takeTheStageOrderInfo.anchors.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        CompetitionUserBase competitionUserBase = takeTheStageOrderInfo.initiator;
        if (competitionUserBase != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TakeTheStageOrderInfo takeTheStageOrderInfo) {
        LJ(takeTheStageOrderInfo);
    }

    @Override // X.C0IMD
    public final TakeTheStageOrderInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TakeTheStageOrderInfo takeTheStageOrderInfo, List list) {
    }
}
