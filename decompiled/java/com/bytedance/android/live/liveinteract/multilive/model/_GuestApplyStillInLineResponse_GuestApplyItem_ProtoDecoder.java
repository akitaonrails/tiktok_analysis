package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestApplyStillInLineResponse_GuestApplyItem_ProtoDecoder implements C0IMD<GuestApplyStillInLineResponse.GuestApplyItem> {
    public static GuestApplyStillInLineResponse.GuestApplyItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem = new GuestApplyStillInLineResponse.GuestApplyItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestApplyItem.status = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        guestApplyItem.applyTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        guestApplyItem.permitTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        guestApplyItem.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        guestApplyItem.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        guestApplyItem.anchor = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        guestApplyItem.descText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        guestApplyItem.channelApplyGuestCount = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        guestApplyItem.preLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestApplyItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem) {
        User user = guestApplyItem.anchor;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final GuestApplyStillInLineResponse.GuestApplyItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem, List list) {
    }
}
