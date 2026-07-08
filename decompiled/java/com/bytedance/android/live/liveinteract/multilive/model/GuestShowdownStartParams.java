package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import tikcast.linkmic.common.MgTraceInfo;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownStartParams {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("mg_trace_info")
    public MgTraceInfo mgTraceInfo;

    @C09CT("play_config")
    public GuestShowdownConfig playConfig;

    @C09CT("pre_play_id")
    public long prePlayId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("stream_id")
    public String streamId = "";
}
