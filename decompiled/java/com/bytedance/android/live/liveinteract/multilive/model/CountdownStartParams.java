package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import tikcast.linkmic.common.MgTraceInfo;
import webcast.data.multi_guest_play.CountdownConfig;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownStartParams {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("countdown_config")
    public CountdownConfig countdownConfig;

    @C09CT("linkmic_id")
    public String linkmicId = "";

    @C09CT("mg_trace_info")
    public MgTraceInfo mgTraceInfo;

    @C09CT("room_id")
    public long roomId;

    @C09CT("user_id")
    public long userId;
}
