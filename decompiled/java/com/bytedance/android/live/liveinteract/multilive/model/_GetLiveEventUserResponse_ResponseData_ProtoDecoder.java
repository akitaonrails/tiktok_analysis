package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetLiveEventUserResponse_ResponseData_ProtoDecoder implements C0IMD<GetLiveEventUserResponse.ResponseData> {
    public static GetLiveEventUserResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetLiveEventUserResponse.ResponseData responseData = new GetLiveEventUserResponse.ResponseData();
        responseData.registeredUsers = new ArrayList();
        responseData.invitedUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.registeredUsers.add(_GetLiveEventUserResponse_RegisteredListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.invitedUsers.add(_GetLiveEventUserResponse_InvitedListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(GetLiveEventUserResponse.ResponseData responseData) {
        User user;
        User user2;
        List<GetLiveEventUserResponse.InvitedListUser> list = responseData.invitedUsers;
        if (list == null) {
            responseData.invitedUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GetLiveEventUserResponse.InvitedListUser invitedListUser : responseData.invitedUsers) {
                if (invitedListUser != null && (user = invitedListUser.user) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        List<GetLiveEventUserResponse.RegisteredListUser> list2 = responseData.registeredUsers;
        if (list2 == null) {
            responseData.registeredUsers = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (GetLiveEventUserResponse.RegisteredListUser registeredListUser : responseData.registeredUsers) {
            if (registeredListUser != null && (user2 = registeredListUser.user) != null) {
                _User_ProtoDecoder.LJ(user2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetLiveEventUserResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final GetLiveEventUserResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetLiveEventUserResponse.ResponseData responseData, List list) {
    }
}
