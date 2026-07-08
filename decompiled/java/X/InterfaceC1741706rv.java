package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: renamed from: X.06rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1741706rv extends LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void cancel(boolean z);

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void pause();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void resume();
}
