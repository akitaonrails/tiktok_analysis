package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LeavePanelRecommendRoomInfo {

    @C09CT("cover_image")
    public ImageModel coverImage;

    @C09CT("guest_num")
    public long guestNum;

    @C09CT("host_info")
    public User hostInfo;

    @C09CT("reco_rank")
    public long recoRank;

    @C09CT("viewer_num")
    public long viewerNum;

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("host_reco_tags")
    public List<String> hostRecoTags = new ArrayList();

    @C09CT("reco_reason")
    public String recoReason = "";
}
