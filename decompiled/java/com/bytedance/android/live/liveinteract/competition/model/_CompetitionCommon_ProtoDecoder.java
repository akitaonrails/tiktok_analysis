package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionCommon_ProtoDecoder implements C0IMD<CompetitionCommon> {
    public static CompetitionCommon LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionCommon competitionCommon = new CompetitionCommon();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        competitionCommon.type = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        competitionCommon.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        competitionCommon.competitionId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        competitionCommon.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        competitionCommon.competitionIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        competitionCommon.roomIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionCommon;
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionCommon LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CompetitionCommon competitionCommon) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionCommon competitionCommon, List list) {
    }
}
