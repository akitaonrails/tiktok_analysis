package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.social.model.SuggestGuestsResp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SuggestGuestsResp_ResponseData_ProtoDecoder implements C0IMD<SuggestGuestsResp.ResponseData> {
    public static SuggestGuestsResp.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SuggestGuestsResp.ResponseData responseData = new SuggestGuestsResp.ResponseData();
        responseData.suggestedFriends = new ArrayList();
        responseData.suggestedUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.suggestedUsers.add(_SuggestGuestsResp_ResponseData_SuggestUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.suggestedFriends.add(_SuggestGuestsResp_ResponseData_SuggestUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(SuggestGuestsResp.ResponseData responseData) {
        User user;
        User user2;
        List<SuggestGuestsResp.ResponseData.SuggestUser> list = responseData.suggestedFriends;
        if (list == null) {
            responseData.suggestedFriends = new ArrayList();
        } else if (!list.isEmpty()) {
            for (SuggestGuestsResp.ResponseData.SuggestUser suggestUser : responseData.suggestedFriends) {
                if (suggestUser != null && (user = suggestUser.user) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        List<SuggestGuestsResp.ResponseData.SuggestUser> list2 = responseData.suggestedUsers;
        if (list2 == null) {
            responseData.suggestedUsers = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SuggestGuestsResp.ResponseData.SuggestUser suggestUser2 : responseData.suggestedUsers) {
            if (suggestUser2 != null && (user2 = suggestUser2.user) != null) {
                _User_ProtoDecoder.LJ(user2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SuggestGuestsResp.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final SuggestGuestsResp.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SuggestGuestsResp.ResponseData responseData, List list) {
    }
}
