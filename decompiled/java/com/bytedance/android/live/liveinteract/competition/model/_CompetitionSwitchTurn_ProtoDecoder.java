package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurn;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSwitchTurn_ProtoDecoder implements C0IMD<CompetitionSwitchTurn> {
    public static CompetitionSwitchTurn LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSwitchTurn competitionSwitchTurn = new CompetitionSwitchTurn();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionSwitchTurn.takeTheStageBiz = _CompetitionSwitchTurn_TakeTheStageBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionSwitchTurn;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionSwitchTurn competitionSwitchTurn) {
        TakeTheStageOrderInfo takeTheStageOrderInfo;
        CompetitionSwitchTurn.TakeTheStageBiz takeTheStageBiz = competitionSwitchTurn.takeTheStageBiz;
        if (takeTheStageBiz != null && (takeTheStageOrderInfo = takeTheStageBiz.orderInfo) != null) {
            _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
        }
    }

    @Override // X.C0IMD
    public final CompetitionSwitchTurn LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSwitchTurn competitionSwitchTurn, List list) {
    }
}
