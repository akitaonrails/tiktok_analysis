package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TakeTheStageInfo_FinalCallInfo_ProtoDecoder implements C0IMD<TakeTheStageInfo.FinalCallInfo> {
    public static TakeTheStageInfo.FinalCallInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TakeTheStageInfo.FinalCallInfo finalCallInfo = new TakeTheStageInfo.FinalCallInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        finalCallInfo.extraTimeInterval = c1516680pZS.LJIIJJI();
                    }
                } else {
                    finalCallInfo.plannedSettlementEndTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return finalCallInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final TakeTheStageInfo.FinalCallInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TakeTheStageInfo.FinalCallInfo finalCallInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TakeTheStageInfo.FinalCallInfo finalCallInfo, List list) {
    }
}
