package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReportLinkMessageResp_ProtoDecoder implements C0IMD<ReportLinkMessageResp> {
    @Override // X.C0IMD
    public final void LIZ(ReportLinkMessageResp reportLinkMessageResp) {
        LinkMicCommonResp linkMicCommonResp = reportLinkMessageResp.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
    }

    @Override // X.C0IMD
    public final ReportLinkMessageResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ReportLinkMessageResp reportLinkMessageResp = new ReportLinkMessageResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        reportLinkMessageResp.interval = c1516680pZS.LJIIJJI();
                    }
                } else {
                    reportLinkMessageResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reportLinkMessageResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReportLinkMessageResp reportLinkMessageResp, List list) {
    }
}
