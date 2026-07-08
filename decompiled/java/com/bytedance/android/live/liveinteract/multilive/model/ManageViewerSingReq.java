package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class ManageViewerSingReq {

    @C09CT("applier")
    public Player applier;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("dsl")
    public DSLConfig dsl;

    @C09CT("multi_guest_req_extra")
    public BizPermitParams multiGuestReqExtra;

    @C09CT("operator")
    public Player operator;

    @C09CT("permiter")
    public Player permiter;

    @C09CT("reply_status")
    public int replyStatus;

    @C09CT("song_id")
    public long songId;
}
