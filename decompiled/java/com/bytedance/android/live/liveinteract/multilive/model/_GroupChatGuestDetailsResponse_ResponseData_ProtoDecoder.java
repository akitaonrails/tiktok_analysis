package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GroupChatGuestDetailsResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.GroupChatGuestDetail;
import com.bytedance.android.livesdk.chatroom.model.interact.audience._GroupChatGuestDetail_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupChatGuestDetailsResponse_ResponseData_ProtoDecoder implements C0IMD<GroupChatGuestDetailsResponse.ResponseData> {
    public static GroupChatGuestDetailsResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupChatGuestDetailsResponse.ResponseData responseData = new GroupChatGuestDetailsResponse.ResponseData();
        responseData.guestDetails = new ArrayList();
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
                                responseData.roomCreateGroupCurrentUserNumLimit = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            responseData.roomCreateGroupCurrentUserNum = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        responseData.roomCreateGroupId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    responseData.guestDetails.add(_GroupChatGuestDetail_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(GroupChatGuestDetailsResponse.ResponseData responseData) {
        User user;
        List<GroupChatGuestDetail> list = responseData.guestDetails;
        if (list == null) {
            responseData.guestDetails = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GroupChatGuestDetail groupChatGuestDetail : responseData.guestDetails) {
            if (groupChatGuestDetail != null && (user = groupChatGuestDetail.userInfo) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupChatGuestDetailsResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final GroupChatGuestDetailsResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupChatGuestDetailsResponse.ResponseData responseData, List list) {
    }
}
