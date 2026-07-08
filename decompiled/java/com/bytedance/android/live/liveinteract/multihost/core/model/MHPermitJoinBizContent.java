package com.bytedance.android.live.liveinteract.multihost.core.model;

import X.C09CT;
import webcast.im.PermitJoinGroupBizContent;

/* JADX INFO: loaded from: classes.dex */
public final class MHPermitJoinBizContent {

    @C09CT("matched_preference_tag")
    public int matchedPreferenceTag;

    @C09CT("quick_cohost_invitee_user_info")
    public PermitJoinGroupBizContent.QuickCohostInviteeUserInfo quickCohostInviteeUserInfo;

    @C09CT("reply_status")
    public int replyStatus;

    @C09CT("skip_cancel_match")
    public boolean skipCancelMatch;

    @C09CT("source_type")
    public int sourceType;
}
