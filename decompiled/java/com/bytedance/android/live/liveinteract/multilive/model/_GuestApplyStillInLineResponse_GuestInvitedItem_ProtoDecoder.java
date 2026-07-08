package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestApplyStillInLineResponse_GuestInvitedItem_ProtoDecoder implements C0IMD<GuestApplyStillInLineResponse.GuestInvitedItem> {
    public static GuestApplyStillInLineResponse.GuestInvitedItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestApplyStillInLineResponse.GuestInvitedItem guestInvitedItem = new GuestApplyStillInLineResponse.GuestInvitedItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                guestInvitedItem.anchor = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            guestInvitedItem.roomId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guestInvitedItem.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guestInvitedItem.inviteTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestInvitedItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestApplyStillInLineResponse.GuestInvitedItem guestInvitedItem) {
        User user = guestInvitedItem.anchor;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final GuestApplyStillInLineResponse.GuestInvitedItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestApplyStillInLineResponse.GuestInvitedItem guestInvitedItem, List list) {
    }
}
