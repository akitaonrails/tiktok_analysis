package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GroupChatLiveEntranceResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("entrance_status")
        public int entranceStatus;

        @C09CT("watch_live_infos")
        public List<GroupChatWatchLiveInfo> watchLiveInfos = new ArrayList();
    }
}
