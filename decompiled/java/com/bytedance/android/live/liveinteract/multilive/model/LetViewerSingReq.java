package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class LetViewerSingReq {

    @C09CT("applier")
    public Player applier;

    @C09CT("applier_pos")
    public MicPositionData applierPos;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("multi_guest_req_extra")
    public BizApplyParams multiGuestReqExtra;

    @C09CT("song_id")
    public long songId;
}
