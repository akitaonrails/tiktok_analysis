package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReportLinkMessageReq_ProtoDecoder implements C0IMD<ReportLinkMessageReq> {
    @Override // X.C0IMD
    public final void LIZ(ReportLinkMessageReq reportLinkMessageReq) {
        ReportLinkMessageReq reportLinkMessageReq2 = reportLinkMessageReq;
        LinkCommon linkCommon = reportLinkMessageReq2.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
        AnchorClientList anchorClientList = reportLinkMessageReq2.anchorClientList;
        if (anchorClientList != null) {
            _AnchorClientList_ProtoDecoder.LJ(anchorClientList);
        }
    }

    @Override // X.C0IMD
    public final ReportLinkMessageReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ReportLinkMessageReq reportLinkMessageReq = new ReportLinkMessageReq();
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
                                    reportLinkMessageReq.guestClientList = _GuestClientList_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                reportLinkMessageReq.anchorClientList = _AnchorClientList_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            reportLinkMessageReq.channelMessage = _ChannelMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        reportLinkMessageReq.mySelf = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    reportLinkMessageReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reportLinkMessageReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReportLinkMessageReq reportLinkMessageReq, List list) {
    }
}
