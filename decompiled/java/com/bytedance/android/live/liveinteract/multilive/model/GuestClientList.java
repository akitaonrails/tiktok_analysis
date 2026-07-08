package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GuestClientList {

    @C09CT("link_mic_id")
    public String linkMicId;

    @C09CT("rtc_status")
    public int rtcStatus;

    @C09CT("source")
    public int source;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("uid")
    public long uid;

    public GuestClientList() {
        this(0L, null, 0, 0, 0);
    }

    public GuestClientList(long j, String str, int i, int i2, int i3) {
        this.uid = j;
        this.linkMicId = str;
        this.status = i;
        this.source = i2;
        this.rtcStatus = i3;
    }
}
