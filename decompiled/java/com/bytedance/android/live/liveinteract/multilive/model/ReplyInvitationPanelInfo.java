package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes16.dex */
public final class ReplyInvitationPanelInfo {

    @C09CT("anchor_setting_info")
    public MultiLiveAnchorPanelSettings anchorSettingInfo;

    @C09CT("invitation_timestamp")
    public long invitationTimestamp;

    @C09CT("inviter_role")
    public int inviterRole;

    @C09CT("layout_id")
    public String layoutId = "";

    @C09CT("user")
    public User user;

    public static final class User {

        @C09CT("avatar")
        public ImageModel avatar;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("nick_name")
        public String nickName = "";
    }
}
