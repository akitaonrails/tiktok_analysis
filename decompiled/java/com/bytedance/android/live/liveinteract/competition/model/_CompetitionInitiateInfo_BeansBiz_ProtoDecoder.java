package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInitiateInfo_BeansBiz_ProtoDecoder implements C0IMD<CompetitionInitiateInfo.BeansBiz> {
    public static CompetitionInitiateInfo.BeansBiz LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInitiateInfo.BeansBiz beansBiz = new CompetitionInitiateInfo.BeansBiz();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    beansBiz.gameVersion = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return beansBiz;
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionInitiateInfo.BeansBiz LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CompetitionInitiateInfo.BeansBiz beansBiz) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInitiateInfo.BeansBiz beansBiz, List list) {
    }
}
