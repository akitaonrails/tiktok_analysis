package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class ReportLinkMessageReq {

    @C09CT("anchor_client_list")
    public AnchorClientList anchorClientList;

    @C09CT("channel_message")
    public ChannelMessage channelMessage;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("guest_client_list")
    public GuestClientList guestClientList;

    @C09CT("myself")
    public Player mySelf;

    public ReportLinkMessageReq() {
        this(null, null, null, null, null);
    }

    public ReportLinkMessageReq(LinkCommon linkCommon, Player player, ChannelMessage channelMessage, AnchorClientList anchorClientList, GuestClientList guestClientList) {
        this.common = linkCommon;
        this.mySelf = player;
        this.channelMessage = channelMessage;
        this.anchorClientList = anchorClientList;
        this.guestClientList = guestClientList;
    }
}
