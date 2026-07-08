package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownCloseParams_ProtoDecoder implements C0IMD<GuestShowdownCloseParams> {
    @Override // X.C0IMD
    public final GuestShowdownCloseParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownCloseParams guestShowdownCloseParams = new GuestShowdownCloseParams();
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
                                guestShowdownCloseParams.closeScene = c1516680pZS.LJIIJ();
                            }
                        } else {
                            guestShowdownCloseParams.playId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guestShowdownCloseParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guestShowdownCloseParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownCloseParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestShowdownCloseParams guestShowdownCloseParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownCloseParams guestShowdownCloseParams, List list) {
    }
}
