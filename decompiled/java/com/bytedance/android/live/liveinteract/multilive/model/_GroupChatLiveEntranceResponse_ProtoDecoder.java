package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GroupChatLiveEntranceResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupChatLiveEntranceResponse_ProtoDecoder implements C0IMD<GroupChatLiveEntranceResponse> {
    @Override // X.C0IMD
    public final void LIZ(GroupChatLiveEntranceResponse groupChatLiveEntranceResponse) {
        GroupChatLiveEntranceResponse.ResponseData responseData = groupChatLiveEntranceResponse.data;
        if (responseData != null) {
            _GroupChatLiveEntranceResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final GroupChatLiveEntranceResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GroupChatLiveEntranceResponse groupChatLiveEntranceResponse = new GroupChatLiveEntranceResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    groupChatLiveEntranceResponse.data = _GroupChatLiveEntranceResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupChatLiveEntranceResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupChatLiveEntranceResponse groupChatLiveEntranceResponse, List list) {
    }
}
