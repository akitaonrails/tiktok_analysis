package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestInvitePanelResp_ResponseData_ProtoDecoder implements C0IMD<GuestInvitePanelResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(GuestInvitePanelResp.ResponseData responseData) {
        GuestInvitePanelResp.ResponseData responseData2 = responseData;
        List<GuestInvitePanelResp.ListUser> list = responseData2.guestInviteFriends;
        if (list == null) {
            responseData2.guestInviteFriends = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GuestInvitePanelResp.ListUser listUser : responseData2.guestInviteFriends) {
                if (listUser != null) {
                    _GuestInvitePanelResp_ListUser_ProtoDecoder.LJ(listUser);
                }
            }
        }
        List<GuestInvitePanelResp.ListUser> list2 = responseData2.guestInviteSuggestUsers;
        if (list2 == null) {
            responseData2.guestInviteSuggestUsers = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (GuestInvitePanelResp.ListUser listUser2 : responseData2.guestInviteSuggestUsers) {
            if (listUser2 != null) {
                _GuestInvitePanelResp_ListUser_ProtoDecoder.LJ(listUser2);
            }
        }
    }

    @Override // X.C0IMD
    public final GuestInvitePanelResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestInvitePanelResp.ResponseData responseData = new GuestInvitePanelResp.ResponseData();
        responseData.guestInviteFriends = new ArrayList();
        responseData.guestInviteSuggestUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            responseData.guestInviteSuggestUsers.add(_GuestInvitePanelResp_ListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        responseData.guestInviteFriends.add(_GuestInvitePanelResp_ListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.anchorRegion = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestInvitePanelResp.ResponseData responseData, List list) {
    }
}
