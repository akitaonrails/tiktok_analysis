package com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope;

import X.C1558520qew;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkMicScopeExtKt$bindLinkAbilityInternal$1$1$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1558520qew.LJIIJJI(null, null, null);
        }
    }
}
