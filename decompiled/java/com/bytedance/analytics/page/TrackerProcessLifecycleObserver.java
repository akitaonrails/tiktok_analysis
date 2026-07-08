package com.bytedance.analytics.page;

import X.C2212108lb;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class TrackerProcessLifecycleObserver implements LifecycleEventObserver {
    public static final TrackerProcessLifecycleObserver LL = new TrackerProcessLifecycleObserver();
    public static boolean LLILLJJLI = true;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2212108lb.LIZ[event.ordinal()] == 1 && LLILLJJLI) {
            LLILLJJLI = false;
        }
    }
}
