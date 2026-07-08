package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendItem {

    @C09CT("guest_apply_info")
    public GuestApplyInfo guestApplyInfo;

    @C09CT("relation_type")
    public int relationType;

    @C09CT("room")
    public Room room;

    @C09CT("skylight_item_type")
    public int skylightItemType;

    @C09CT("user")
    public RecommendShowUser user;

    @C09CT("request_id")
    public String requestId = "";

    @C09CT("recall_reason")
    public String recallReason = "";

    @C09CT("show_user_list")
    public List<RecommendShowUser> showUserList = new ArrayList();
}
