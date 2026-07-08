package com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel;

import com.bytedance.ies.sdk.datachannel.Channel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class CurrentRealDisplayChannel extends Channel<Pair<? extends String, ? extends Integer>> {
    public static final int $stable = 8;

    public CurrentRealDisplayChannel() {
        super(new Pair("", 1));
    }
}
