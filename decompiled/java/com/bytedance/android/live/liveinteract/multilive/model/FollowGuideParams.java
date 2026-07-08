package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FollowGuideParams {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("trigger_type")
    public int triggerType;

    @C09CT("follow_guide_info_list")
    public List<FollowGuideInfo> followGuideInfoList = new ArrayList();

    @C09CT("trigger_params_json_str")
    public String triggerParamsJsonStr = "";

    public static final class FollowGuideInfo {

        @C09CT("guide_follow_status")
        public int guideFollowStatus;

        @C09CT("guide_user_id")
        public long guideUserId;

        @C09CT("guide_user_identity")
        public int guideUserIdentity;
    }
}
