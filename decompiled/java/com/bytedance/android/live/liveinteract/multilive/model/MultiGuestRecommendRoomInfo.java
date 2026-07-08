package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestRecommendRoomInfo {

    @C09CT("auto_permit")
    public long autoPermit;

    @C09CT("guest_num")
    public long guestNum;

    @C09CT("host_info")
    public User hostInfo;

    @C09CT("reco_rank")
    public long recoRank;

    @C09CT("room_id")
    public long roomId;

    @C09CT("viewer_num")
    public long viewerNum;

    @C09CT("host_reco_tags")
    public List<String> hostRecoTags = new ArrayList();

    @C09CT("reco_reason")
    public String recoReason = "";
}
