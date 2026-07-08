package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import tikcast.linkmic.common.MgTraceInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardCreateParams {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("mg_trace_info")
    public MgTraceInfo mgTraceInfo;

    @C09CT("noticeboard_mode")
    public int noticeboardMode;

    @C09CT("noticeboard_template_id")
    public long noticeboardTemplateId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("linkmic_id")
    public String linkmicId = "";

    @C09CT("stream_id")
    public String streamId = "";

    @C09CT("media_node_id")
    public String mediaNodeId = "";

    @C09CT("image_path")
    public String imagePath = "";
}
