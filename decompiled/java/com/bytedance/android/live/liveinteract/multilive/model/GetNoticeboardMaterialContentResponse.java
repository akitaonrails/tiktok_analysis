package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;

/* JADX INFO: loaded from: classes.dex */
public final class GetNoticeboardMaterialContentResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("convert_noticeboard_material_info")
        public ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo;

        @C09CT("create_time")
        public long createTime;

        @C09CT("media_node_id")
        public String mediaNodeId = "";

        @C09CT("update_time")
        public long updateTime;
    }
}
