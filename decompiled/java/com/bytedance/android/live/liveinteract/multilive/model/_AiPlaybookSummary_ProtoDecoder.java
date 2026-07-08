package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AiPlaybookSummary_ProtoDecoder implements C0IMD<AiPlaybookSummary> {
    public static AiPlaybookSummary LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AiPlaybookSummary aiPlaybookSummary = new AiPlaybookSummary();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        aiPlaybookSummary.playbookId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        aiPlaybookSummary.playbookContentId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        aiPlaybookSummary.originalPlaybookContentId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        aiPlaybookSummary.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        aiPlaybookSummary.roomTitleDescription = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        aiPlaybookSummary.liveCreateTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        aiPlaybookSummary.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aiPlaybookSummary;
            }
        }
    }

    @Override // X.C0IMD
    public final AiPlaybookSummary LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AiPlaybookSummary aiPlaybookSummary) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AiPlaybookSummary aiPlaybookSummary, List list) {
    }
}
