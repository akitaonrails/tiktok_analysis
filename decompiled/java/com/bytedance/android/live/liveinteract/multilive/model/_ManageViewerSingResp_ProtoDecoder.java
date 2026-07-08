package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ManageViewerSingResp_ProtoDecoder implements C0IMD<ManageViewerSingResp> {
    @Override // X.C0IMD
    public final void LIZ(ManageViewerSingResp manageViewerSingResp) {
        ManageViewerSingResp manageViewerSingResp2 = manageViewerSingResp;
        LinkMicCommonResp linkMicCommonResp = manageViewerSingResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        RTCExtraInfo rTCExtraInfo = manageViewerSingResp2.permiterExtInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        if (manageViewerSingResp2.linkedUserUiPositions == null) {
            manageViewerSingResp2.linkedUserUiPositions = new ArrayList();
        }
        List<PosIdentity> list = manageViewerSingResp2.uiPos;
        if (list == null) {
            manageViewerSingResp2.uiPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PosIdentity> it2 = manageViewerSingResp2.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutState layoutState = manageViewerSingResp2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list2 = manageViewerSingResp2.spotList;
        if (list2 == null) {
            manageViewerSingResp2.spotList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SpotInfo spotInfo : manageViewerSingResp2.spotList) {
            if (spotInfo != null) {
                _SpotInfo_ProtoDecoder.LJ(spotInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final ManageViewerSingResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ManageViewerSingResp manageViewerSingResp = new ManageViewerSingResp();
        manageViewerSingResp.linkedUserUiPositions = new ArrayList();
        manageViewerSingResp.uiPos = new ArrayList();
        manageViewerSingResp.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        manageViewerSingResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        manageViewerSingResp.permiterExtInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        manageViewerSingResp.permiterLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        manageViewerSingResp.applierPos = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        manageViewerSingResp.applier = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        manageViewerSingResp.applierLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        manageViewerSingResp.isInvokeLinkmic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        manageViewerSingResp.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        manageViewerSingResp.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        manageViewerSingResp.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        manageViewerSingResp.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return manageViewerSingResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ManageViewerSingResp manageViewerSingResp, List list) {
    }
}
