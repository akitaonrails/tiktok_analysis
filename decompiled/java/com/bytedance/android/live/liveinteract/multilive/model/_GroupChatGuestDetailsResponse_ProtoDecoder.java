package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GroupChatGuestDetailsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupChatGuestDetailsResponse_ProtoDecoder implements C0IMD<GroupChatGuestDetailsResponse> {
    @Override // X.C0IMD
    public final void LIZ(GroupChatGuestDetailsResponse groupChatGuestDetailsResponse) {
        GroupChatGuestDetailsResponse.ResponseData responseData = groupChatGuestDetailsResponse.data;
        if (responseData != null) {
            _GroupChatGuestDetailsResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final GroupChatGuestDetailsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GroupChatGuestDetailsResponse groupChatGuestDetailsResponse = new GroupChatGuestDetailsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    groupChatGuestDetailsResponse.data = _GroupChatGuestDetailsResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupChatGuestDetailsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupChatGuestDetailsResponse groupChatGuestDetailsResponse, List list) {
    }
}
