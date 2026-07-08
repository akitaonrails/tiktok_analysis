package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuestApplyStillInLineResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class GuestApplyItem {

        @C09CT("anchor")
        public User anchor;

        @C09CT("apply_time")
        public long applyTime;

        @C09CT("channel_apply_guest_count")
        public long channelApplyGuestCount;

        @C09CT("channel_id")
        public long channelId;

        @C09CT("permit_time")
        public long permitTime;

        @C09CT("room_id")
        public long roomId;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("desc_text")
        public String descText = "";

        @C09CT("pre_linkmic_id")
        public String preLinkmicId = "";
    }

    public static final class GuestInvitedItem {

        @C09CT("anchor")
        public User anchor;

        @C09CT("channel_id")
        public long channelId;

        @C09CT("invite_time")
        public long inviteTime;

        @C09CT("room_id")
        public long roomId;
    }

    public static final class ResponseData {

        @C09CT("channel_apply_guest_count")
        public long channelApplyGuestCount;

        @C09CT("guest_apply_list")
        public List<GuestApplyItem> guestApplyList = new ArrayList();

        @C09CT("guest_invited_list")
        public List<GuestInvitedItem> guestInvitedList = new ArrayList();
    }
}
