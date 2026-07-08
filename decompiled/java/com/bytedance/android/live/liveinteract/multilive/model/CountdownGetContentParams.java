package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownGetContentParams {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("countdown_ids")
    public List<Long> countdownIds = new ArrayList();

    @C09CT("room_id")
    public long roomId;
}
