package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestInvitePanelResp_Extra_ProtoDecoder implements C0IMD<GuestInvitePanelResp.Extra> {
    @Override // X.C0IMD
    public final GuestInvitePanelResp.Extra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestInvitePanelResp.Extra extra = new GuestInvitePanelResp.Extra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    extra.now = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestInvitePanelResp.Extra extra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestInvitePanelResp.Extra extra, List list) {
    }
}
