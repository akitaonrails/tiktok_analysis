package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import tikcast.linkmic.common.MgTraceInfo;
import webcast.data.multi_guest_play.CountdownForAllConfig;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownForAllStartParams {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("mg_trace_info")
    public MgTraceInfo mgTraceInfo;

    @C09CT("play_config")
    public CountdownForAllConfig playConfig;

    @C09CT("room_id")
    public long roomId;
}
