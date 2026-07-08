package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizPermitParams_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._DSLConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ManageViewerSingReq_ProtoDecoder implements C0IMD<ManageViewerSingReq> {
    @Override // X.C0IMD
    public final void LIZ(ManageViewerSingReq manageViewerSingReq) {
        LinkCommon linkCommon = manageViewerSingReq.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final ManageViewerSingReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ManageViewerSingReq manageViewerSingReq = new ManageViewerSingReq();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            manageViewerSingReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            manageViewerSingReq.channelId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            manageViewerSingReq.permiter = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            manageViewerSingReq.applier = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            manageViewerSingReq.replyStatus = c1516680pZS.LJIIJ();
                            break;
                        case 6:
                            manageViewerSingReq.dsl = _DSLConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            manageViewerSingReq.operator = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            manageViewerSingReq.songId = c1516680pZS.LJIIJJI();
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    manageViewerSingReq.multiGuestReqExtra = _BizPermitParams_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return manageViewerSingReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ManageViewerSingReq manageViewerSingReq, List list) {
    }
}
