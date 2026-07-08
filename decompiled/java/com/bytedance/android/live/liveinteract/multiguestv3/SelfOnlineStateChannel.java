package com.bytedance.android.live.liveinteract.multiguestv3;

import com.bytedance.ies.sdk.datachannel.Channel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class SelfOnlineStateChannel extends Channel<Pair<? extends Boolean, ? extends Integer>> {
    public SelfOnlineStateChannel() {
        super(new Pair(Boolean.FALSE, 0));
    }
}
