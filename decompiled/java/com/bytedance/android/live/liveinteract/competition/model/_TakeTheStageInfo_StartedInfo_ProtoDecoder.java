package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TakeTheStageInfo_StartedInfo_ProtoDecoder implements C0IMD<TakeTheStageInfo.StartedInfo> {
    public static TakeTheStageInfo.StartedInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TakeTheStageInfo.StartedInfo startedInfo = new TakeTheStageInfo.StartedInfo();
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
                                startedInfo.initiateAutoFinalCall = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            startedInfo.plannedPerformanceEndTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        startedInfo.orderInfo = _TakeTheStageOrderInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    startedInfo.performanceStartTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return startedInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TakeTheStageInfo.StartedInfo startedInfo) {
        TakeTheStageOrderInfo takeTheStageOrderInfo = startedInfo.orderInfo;
        if (takeTheStageOrderInfo != null) {
            _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
        }
    }

    @Override // X.C0IMD
    public final TakeTheStageInfo.StartedInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TakeTheStageInfo.StartedInfo startedInfo, List list) {
    }
}
