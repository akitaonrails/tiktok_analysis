package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSettleStart_ProtoDecoder implements C0IMD<CompetitionSettleStart> {
    public static CompetitionSettleStart LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSettleStart competitionSettleStart = new CompetitionSettleStart();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            competitionSettleStart.initiator = _CompetitionUserBase_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        competitionSettleStart.extraTimeInterval = c1516680pZS.LJIIJJI();
                    }
                } else {
                    competitionSettleStart.plannedSettlementEndTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionSettleStart;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionSettleStart competitionSettleStart) {
        CompetitionUserBase competitionUserBase = competitionSettleStart.initiator;
        if (competitionUserBase != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
    }

    @Override // X.C0IMD
    public final CompetitionSettleStart LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSettleStart competitionSettleStart, List list) {
    }
}
