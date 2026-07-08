package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestInvitePanelReq {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("data_types")
    public List<Integer> dataTypes = new ArrayList();

    @C09CT("invite_user_id")
    public long inviteUserId;

    @C09CT("room_id")
    public long roomId;
}
