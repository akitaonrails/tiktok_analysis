package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class GetSharedInviteePanelResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("invitee_panel_type")
        public int inviteePanelType;

        @C09CT("reply_invitation_panel_info")
        public ReplyInvitationPanelInfo replyInvitationPanelInfo;

        @C09CT("share_revenue_setting")
        public int shareRevenueSetting;
    }
}
