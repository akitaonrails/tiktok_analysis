package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetRecommendRoomResp {

    @C09CT("data")
    public ResponseData data;

    public static final class RecommendRoomInfo {

        @C09CT("user")
        public User user;

        @C09CT("user_id_str")
        public String userIdStr = "";

        @C09CT("room_id_str")
        public String roomIdStr = "";

        @C09CT("room_tag")
        public String roomTag = "";
    }

    public static final class ResponseData {

        @C09CT("recommend_room_info_list")
        public List<RecommendRoomInfo> recommendRoomInfoList = new ArrayList();
    }
}
