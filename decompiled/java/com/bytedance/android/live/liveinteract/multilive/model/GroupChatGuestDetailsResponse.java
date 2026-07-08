package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.GroupChatGuestDetail;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GroupChatGuestDetailsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("guest_details")
        public List<GroupChatGuestDetail> guestDetails = new ArrayList();

        @C09CT("room_create_group_current_user_num")
        public long roomCreateGroupCurrentUserNum;

        @C09CT("room_create_group_current_user_num_limit")
        public long roomCreateGroupCurrentUserNumLimit;

        @C09CT("room_create_group_id")
        public long roomCreateGroupId;
    }
}
