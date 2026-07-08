package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownGetContentParams_ProtoDecoder implements C0IMD<GuestShowdownGetContentParams> {
    @Override // X.C0IMD
    public final GuestShowdownGetContentParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownGetContentParams guestShowdownGetContentParams = new GuestShowdownGetContentParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                guestShowdownGetContentParams.getType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            guestShowdownGetContentParams.playId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guestShowdownGetContentParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guestShowdownGetContentParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownGetContentParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestShowdownGetContentParams guestShowdownGetContentParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownGetContentParams guestShowdownGetContentParams, List list) {
    }
}
