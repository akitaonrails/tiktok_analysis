package com.bytedance.android.live.effect.api;

import X.C08CX;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.Channel;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AllEffectFetchSuccessChannel extends Channel<Set<? extends LiveEffect>> {
    public AllEffectFetchSuccessChannel() {
        super(C08CX.INSTANCE);
    }
}
