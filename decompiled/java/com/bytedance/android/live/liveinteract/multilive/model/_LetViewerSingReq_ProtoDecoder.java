package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizApplyParams_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LetViewerSingReq_ProtoDecoder implements C0IMD<LetViewerSingReq> {
    @Override // X.C0IMD
    public final void LIZ(LetViewerSingReq letViewerSingReq) {
        LinkCommon linkCommon = letViewerSingReq.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final LetViewerSingReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LetViewerSingReq letViewerSingReq = new LetViewerSingReq();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 9527) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        letViewerSingReq.multiGuestReqExtra = _BizApplyParams_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    letViewerSingReq.songId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                letViewerSingReq.applierPos = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            letViewerSingReq.applier = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        letViewerSingReq.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    letViewerSingReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return letViewerSingReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LetViewerSingReq letViewerSingReq, List list) {
    }
}
