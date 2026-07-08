package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionABInfo_ProtoDecoder implements C0IMD<CompetitionABInfo> {
    public static CompetitionABInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionABInfo competitionABInfo = new CompetitionABInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionABInfo.tts = _CompetitionABInfo_TakeTheStageABInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionABInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionABInfo competitionABInfo) {
    }

    @Override // X.C0IMD
    public final CompetitionABInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionABInfo competitionABInfo, List list) {
    }
}
