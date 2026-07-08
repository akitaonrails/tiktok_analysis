package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizApplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LetViewerSingResp_ProtoDecoder implements C0IMD<LetViewerSingResp> {
    @Override // X.C0IMD
    public final void LIZ(LetViewerSingResp letViewerSingResp) {
        BizApplyResponseData bizApplyResponseData;
        LetViewerSingResp letViewerSingResp2 = letViewerSingResp;
        LinkMicCommonResp linkMicCommonResp = letViewerSingResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        RTCExtraInfo rTCExtraInfo = letViewerSingResp2.applierExtInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        BizApplyResponse bizApplyResponse = letViewerSingResp2.multiGuestRespExtra;
        if (bizApplyResponse != null && (bizApplyResponseData = bizApplyResponse.responseData) != null) {
            PerceptionMessage perceptionMessage = bizApplyResponseData.perceptionInfo;
            if (perceptionMessage != null) {
                _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
            }
            PerceptionMessage perceptionMessage2 = bizApplyResponseData.hostPerceptionInfo;
            if (perceptionMessage2 != null) {
                _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage2);
            }
        }
    }

    @Override // X.C0IMD
    public final LetViewerSingResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LetViewerSingResp letViewerSingResp = new LetViewerSingResp();
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
                                    letViewerSingResp.multiGuestRespExtra = _BizApplyResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                letViewerSingResp.isOnlyAddSong = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            letViewerSingResp.applierLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        letViewerSingResp.applierExtInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    letViewerSingResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return letViewerSingResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LetViewerSingResp letViewerSingResp, List list) {
    }
}
