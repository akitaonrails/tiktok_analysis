package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._MgTraceInfo_ProtoDecoder;
import webcast.data.multi_guest_play._GuestShowdownConfig_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownStartParams_ProtoDecoder implements C0IMD<GuestShowdownStartParams> {
    @Override // X.C0IMD
    public final void LIZ(GuestShowdownStartParams guestShowdownStartParams) {
    }

    @Override // X.C0IMD
    public final GuestShowdownStartParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownStartParams guestShowdownStartParams = new GuestShowdownStartParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 101) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        guestShowdownStartParams.mgTraceInfo = _MgTraceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    guestShowdownStartParams.playConfig = _GuestShowdownConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                guestShowdownStartParams.streamId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            guestShowdownStartParams.prePlayId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guestShowdownStartParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guestShowdownStartParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownStartParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownStartParams guestShowdownStartParams, List list) {
    }
}
