package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCancelApplyParams_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CancelViewerSingReq_ProtoDecoder implements C0IMD<CancelViewerSingReq> {
    @Override // X.C0IMD
    public final void LIZ(CancelViewerSingReq cancelViewerSingReq) {
        LinkCommon linkCommon = cancelViewerSingReq.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final CancelViewerSingReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CancelViewerSingReq cancelViewerSingReq = new CancelViewerSingReq();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 9527) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    cancelViewerSingReq.multiGuestReqExtra = _BizCancelApplyParams_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                cancelViewerSingReq.songId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            cancelViewerSingReq.applier = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        cancelViewerSingReq.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    cancelViewerSingReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cancelViewerSingReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CancelViewerSingReq cancelViewerSingReq, List list) {
    }
}
