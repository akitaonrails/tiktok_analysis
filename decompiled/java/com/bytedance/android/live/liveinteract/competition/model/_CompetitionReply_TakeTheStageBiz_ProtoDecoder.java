package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionReply_TakeTheStageBiz_ProtoDecoder implements C0IMD<CompetitionReply.TakeTheStageBiz> {
    public static CompetitionReply.TakeTheStageBiz LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionReply.TakeTheStageBiz takeTheStageBiz = new CompetitionReply.TakeTheStageBiz();
        takeTheStageBiz.anchors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                takeTheStageBiz.plannedPerformanceEndTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            takeTheStageBiz.anchors.add(_CompetitionReply_TakeTheStageBiz_AnchorInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        takeTheStageBiz.performanceStartTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    takeTheStageBiz.takeTheStageStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return takeTheStageBiz;
            }
        }
    }

    public static void LJ(CompetitionReply.TakeTheStageBiz takeTheStageBiz) {
        List<CompetitionReply.TakeTheStageBiz.AnchorInfo> list = takeTheStageBiz.anchors;
        if (list == null) {
            takeTheStageBiz.anchors = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<CompetitionReply.TakeTheStageBiz.AnchorInfo> it2 = takeTheStageBiz.anchors.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionReply.TakeTheStageBiz takeTheStageBiz) {
        LJ(takeTheStageBiz);
    }

    @Override // X.C0IMD
    public final CompetitionReply.TakeTheStageBiz LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionReply.TakeTheStageBiz takeTheStageBiz, List list) {
    }
}
