package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SendStageReactionResp_ProtoDecoder implements C0IMD<SendStageReactionResp> {
    @Override // X.C0IMD
    public final void LIZ(SendStageReactionResp sendStageReactionResp) {
    }

    @Override // X.C0IMD
    public final SendStageReactionResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SendStageReactionResp sendStageReactionResp = new SendStageReactionResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    sendStageReactionResp.data = _SendStageReactionResp_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sendStageReactionResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SendStageReactionResp sendStageReactionResp, List list) {
    }
}
