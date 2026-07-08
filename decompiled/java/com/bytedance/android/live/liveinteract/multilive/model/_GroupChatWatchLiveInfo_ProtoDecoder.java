package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupChatWatchLiveInfo_ProtoDecoder implements C0IMD<GroupChatWatchLiveInfo> {
    public static GroupChatWatchLiveInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupChatWatchLiveInfo groupChatWatchLiveInfo = new GroupChatWatchLiveInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        groupChatWatchLiveInfo.userInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    groupChatWatchLiveInfo.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupChatWatchLiveInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupChatWatchLiveInfo groupChatWatchLiveInfo) {
        User user = groupChatWatchLiveInfo.userInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final GroupChatWatchLiveInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupChatWatchLiveInfo groupChatWatchLiveInfo, List list) {
    }
}
