package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownFinishToPunishmentParams_ProtoDecoder implements C0IMD<GuestShowdownFinishToPunishmentParams> {
    @Override // X.C0IMD
    public final GuestShowdownFinishToPunishmentParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownFinishToPunishmentParams guestShowdownFinishToPunishmentParams = new GuestShowdownFinishToPunishmentParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            guestShowdownFinishToPunishmentParams.playId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guestShowdownFinishToPunishmentParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guestShowdownFinishToPunishmentParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownFinishToPunishmentParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestShowdownFinishToPunishmentParams guestShowdownFinishToPunishmentParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownFinishToPunishmentParams guestShowdownFinishToPunishmentParams, List list) {
    }
}
