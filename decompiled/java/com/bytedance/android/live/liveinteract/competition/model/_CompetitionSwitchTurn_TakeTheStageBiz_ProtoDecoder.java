package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurn;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSwitchTurn_TakeTheStageBiz_ProtoDecoder implements C0IMD<CompetitionSwitchTurn.TakeTheStageBiz> {
    public static CompetitionSwitchTurn.TakeTheStageBiz LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSwitchTurn.TakeTheStageBiz takeTheStageBiz = new CompetitionSwitchTurn.TakeTheStageBiz();
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
                                takeTheStageBiz.initiateAutoFinalCall = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            takeTheStageBiz.plannedPerformanceEndTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        takeTheStageBiz.orderInfo = _TakeTheStageOrderInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    takeTheStageBiz.performanceStartTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return takeTheStageBiz;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionSwitchTurn.TakeTheStageBiz takeTheStageBiz) {
        TakeTheStageOrderInfo takeTheStageOrderInfo = takeTheStageBiz.orderInfo;
        if (takeTheStageOrderInfo != null) {
            _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
        }
    }

    @Override // X.C0IMD
    public final CompetitionSwitchTurn.TakeTheStageBiz LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSwitchTurn.TakeTheStageBiz takeTheStageBiz, List list) {
    }
}
