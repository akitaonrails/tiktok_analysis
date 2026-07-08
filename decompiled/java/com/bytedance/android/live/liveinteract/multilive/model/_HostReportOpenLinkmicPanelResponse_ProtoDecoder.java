package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.HostReportOpenLinkmicPanelResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HostReportOpenLinkmicPanelResponse_ProtoDecoder implements C0IMD<HostReportOpenLinkmicPanelResponse> {
    @Override // X.C0IMD
    public final void LIZ(HostReportOpenLinkmicPanelResponse hostReportOpenLinkmicPanelResponse) {
    }

    @Override // X.C0IMD
    public final HostReportOpenLinkmicPanelResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HostReportOpenLinkmicPanelResponse hostReportOpenLinkmicPanelResponse = new HostReportOpenLinkmicPanelResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        hostReportOpenLinkmicPanelResponse.extra = _HostReportOpenLinkmicPanelResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    HostReportOpenLinkmicPanelResponse.ResponseData responseData = new HostReportOpenLinkmicPanelResponse.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    hostReportOpenLinkmicPanelResponse.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hostReportOpenLinkmicPanelResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HostReportOpenLinkmicPanelResponse hostReportOpenLinkmicPanelResponse, List list) {
    }
}
