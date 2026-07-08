package com.bytedance.android.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.Channel;

/* JADX INFO: loaded from: classes13.dex */
public final class SwitchLiveModeChannel extends Channel<LiveMode> {
    public SwitchLiveModeChannel() {
        super(LiveMode.VIDEO);
    }
}
