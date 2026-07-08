package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public interface LifecycleEventObserver extends LifecycleObserver {
    void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event);
}
