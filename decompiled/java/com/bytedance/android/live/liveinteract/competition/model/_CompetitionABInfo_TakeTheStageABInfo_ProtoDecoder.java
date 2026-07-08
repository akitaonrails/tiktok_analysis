package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionABInfo_TakeTheStageABInfo_ProtoDecoder implements C0IMD<CompetitionABInfo.TakeTheStageABInfo> {
    public static CompetitionABInfo.TakeTheStageABInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionABInfo.TakeTheStageABInfo takeTheStageABInfo = new CompetitionABInfo.TakeTheStageABInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        takeTheStageABInfo.atmosphereDuration = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    takeTheStageABInfo.atmosphereAnimation = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return takeTheStageABInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionABInfo.TakeTheStageABInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CompetitionABInfo.TakeTheStageABInfo takeTheStageABInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionABInfo.TakeTheStageABInfo takeTheStageABInfo, List list) {
    }
}
