package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionReply_BeansBiz_ProtoDecoder implements C0IMD<CompetitionReply.BeansBiz> {
    public static CompetitionReply.BeansBiz LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionReply.BeansBiz beansBiz = new CompetitionReply.BeansBiz();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    beansBiz.rejectReason = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return beansBiz;
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionReply.BeansBiz LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CompetitionReply.BeansBiz beansBiz) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionReply.BeansBiz beansBiz, List list) {
    }
}
