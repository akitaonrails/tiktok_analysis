package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.List;
import tikcast.linkmic.controller.AnchorMessage;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorClientList {

    @C09CT("anchor_message")
    public AnchorMessage anchorMessage;

    @C09CT("apply_users")
    public List<WaitUser> applyUsers;

    @C09CT("invite_users")
    public List<WaitUser> inviteUsers;

    @C09CT("link_users")
    public List<LinkedUser> linkUsers;

    @C09CT("ready_users")
    public List<WaitUser> readyUsers;

    @C09CT("rtc_users")
    public List<WaitUser> rtcUsers;

    public AnchorClientList() {
        this(null, null, null, null, null, null);
    }

    public AnchorClientList(List<WaitUser> list, List<WaitUser> list2, List<WaitUser> list3, List<WaitUser> list4, List<LinkedUser> list5, AnchorMessage anchorMessage) {
        this.rtcUsers = list;
        this.applyUsers = list2;
        this.inviteUsers = list3;
        this.readyUsers = list4;
        this.linkUsers = list5;
        this.anchorMessage = anchorMessage;
    }
}
