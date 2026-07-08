package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;

/* JADX INFO: loaded from: classes.dex */
public final class ReportLinkMessageResp {

    @C09CT("common_resp")
    public LinkMicCommonResp commonResp;

    @C09CT("interval")
    public long interval;

    public ReportLinkMessageResp() {
        this(null, 0L);
    }

    public ReportLinkMessageResp(LinkMicCommonResp linkMicCommonResp, long j) {
        this.commonResp = linkMicCommonResp;
        this.interval = j;
    }
}
