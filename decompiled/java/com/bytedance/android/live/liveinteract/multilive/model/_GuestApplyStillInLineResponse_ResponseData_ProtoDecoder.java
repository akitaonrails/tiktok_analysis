package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestApplyStillInLineResponse_ResponseData_ProtoDecoder implements C0IMD<GuestApplyStillInLineResponse.ResponseData> {
    public static GuestApplyStillInLineResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestApplyStillInLineResponse.ResponseData responseData = new GuestApplyStillInLineResponse.ResponseData();
        responseData.guestApplyList = new ArrayList();
        responseData.guestInvitedList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            responseData.channelApplyGuestCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        responseData.guestInvitedList.add(_GuestApplyStillInLineResponse_GuestInvitedItem_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.guestApplyList.add(_GuestApplyStillInLineResponse_GuestApplyItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(GuestApplyStillInLineResponse.ResponseData responseData) {
        User user;
        User user2;
        List<GuestApplyStillInLineResponse.GuestApplyItem> list = responseData.guestApplyList;
        if (list == null) {
            responseData.guestApplyList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GuestApplyStillInLineResponse.GuestApplyItem guestApplyItem : responseData.guestApplyList) {
                if (guestApplyItem != null && (user = guestApplyItem.anchor) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        List<GuestApplyStillInLineResponse.GuestInvitedItem> list2 = responseData.guestInvitedList;
        if (list2 == null) {
            responseData.guestInvitedList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (GuestApplyStillInLineResponse.GuestInvitedItem guestInvitedItem : responseData.guestInvitedList) {
            if (guestInvitedItem != null && (user2 = guestInvitedItem.anchor) != null) {
                _User_ProtoDecoder.LJ(user2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestApplyStillInLineResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final GuestApplyStillInLineResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestApplyStillInLineResponse.ResponseData responseData, List list) {
    }
}
