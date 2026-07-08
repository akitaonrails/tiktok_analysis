package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UpdateShowContentParams_ProtoDecoder implements C0IMD<UpdateShowContentParams> {
    @Override // X.C0IMD
    public final UpdateShowContentParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UpdateShowContentParams updateShowContentParams = new UpdateShowContentParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        updateShowContentParams.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        updateShowContentParams.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        updateShowContentParams.showId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        updateShowContentParams.updateType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        updateShowContentParams.allowOpenMicFreely = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        updateShowContentParams.targetUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        updateShowContentParams.preUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        updateShowContentParams.nextUserId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        updateShowContentParams.transitionDurationOfConfig = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updateShowContentParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UpdateShowContentParams updateShowContentParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateShowContentParams updateShowContentParams, List list) {
    }
}
