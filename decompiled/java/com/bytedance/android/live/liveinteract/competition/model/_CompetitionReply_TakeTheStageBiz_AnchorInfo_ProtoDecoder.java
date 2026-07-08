package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionReply_TakeTheStageBiz_AnchorInfo_ProtoDecoder implements C0IMD<CompetitionReply.TakeTheStageBiz.AnchorInfo> {
    public static CompetitionReply.TakeTheStageBiz.AnchorInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionReply.TakeTheStageBiz.AnchorInfo anchorInfo = new CompetitionReply.TakeTheStageBiz.AnchorInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorInfo.defaultOrder = c1516680pZS.LJIIJJI();
                    }
                } else {
                    anchorInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionReply.TakeTheStageBiz.AnchorInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CompetitionReply.TakeTheStageBiz.AnchorInfo anchorInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionReply.TakeTheStageBiz.AnchorInfo anchorInfo, List list) {
    }
}
