package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TakeTheStageInfo_VictoryLapInfo_ProtoDecoder implements C0IMD<TakeTheStageInfo.VictoryLapInfo> {
    public static TakeTheStageInfo.VictoryLapInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TakeTheStageInfo.VictoryLapInfo victoryLapInfo = new TakeTheStageInfo.VictoryLapInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    victoryLapInfo.plannedFinishTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return victoryLapInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final TakeTheStageInfo.VictoryLapInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TakeTheStageInfo.VictoryLapInfo victoryLapInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TakeTheStageInfo.VictoryLapInfo victoryLapInfo, List list) {
    }
}
