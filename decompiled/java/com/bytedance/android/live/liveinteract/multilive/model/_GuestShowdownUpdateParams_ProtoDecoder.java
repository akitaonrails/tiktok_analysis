package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play._GuestShowdownConfigChange_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownUpdateParams_ProtoDecoder implements C0IMD<GuestShowdownUpdateParams> {
    @Override // X.C0IMD
    public final void LIZ(GuestShowdownUpdateParams guestShowdownUpdateParams) {
    }

    @Override // X.C0IMD
    public final GuestShowdownUpdateParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownUpdateParams guestShowdownUpdateParams = new GuestShowdownUpdateParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    guestShowdownUpdateParams.configChange = _GuestShowdownConfigChange_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                guestShowdownUpdateParams.guestShowdownUpdateScene = c1516680pZS.LJIIJ();
                            }
                        } else {
                            guestShowdownUpdateParams.playId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guestShowdownUpdateParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guestShowdownUpdateParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownUpdateParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownUpdateParams guestShowdownUpdateParams, List list) {
    }
}
