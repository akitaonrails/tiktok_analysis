package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelMessage {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("layout_id")
    public String layoutId;

    @C09CT("layout_version")
    public int layout_version;

    @C09CT("report_type")
    public int reportType;

    public ChannelMessage() {
        this(0L, 0, null, 0);
    }

    public ChannelMessage(long j, int i, String str, int i2) {
        this.channelId = j;
        this.reportType = i;
        this.layoutId = str;
        this.layout_version = i2;
    }
}
