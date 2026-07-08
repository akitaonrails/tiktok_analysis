package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GroupChatLiveEntranceResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupChatLiveEntranceResponse_ResponseData_ProtoDecoder implements C0IMD<GroupChatLiveEntranceResponse.ResponseData> {
    public static GroupChatLiveEntranceResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupChatLiveEntranceResponse.ResponseData responseData = new GroupChatLiveEntranceResponse.ResponseData();
        responseData.watchLiveInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.watchLiveInfos.add(_GroupChatWatchLiveInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.entranceStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(GroupChatLiveEntranceResponse.ResponseData responseData) {
        User user;
        List<GroupChatWatchLiveInfo> list = responseData.watchLiveInfos;
        if (list == null) {
            responseData.watchLiveInfos = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GroupChatWatchLiveInfo groupChatWatchLiveInfo : responseData.watchLiveInfos) {
            if (groupChatWatchLiveInfo != null && (user = groupChatWatchLiveInfo.userInfo) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupChatLiveEntranceResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final GroupChatLiveEntranceResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupChatLiveEntranceResponse.ResponseData responseData, List list) {
    }
}
