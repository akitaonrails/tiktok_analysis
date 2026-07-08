package androidx.lifecycle;

import X.C197066128i;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes30.dex */
public final class SavedStateHandleController implements LifecycleEventObserver, AutoCloseable {
    public final SavedStateHandle handle;
    public boolean isAttached;
    public final String key;

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    public final SavedStateHandle getHandle() {
        return this.handle;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.key = str;
        this.handle = savedStateHandle;
    }

    public final void attachToLifecycle(C197066128i c197066128i, Lifecycle lifecycle) {
        if (!this.isAttached) {
            this.isAttached = true;
            lifecycle.addObserver(this);
            c197066128i.LIZJ(this.key, this.handle.savedStateProvider());
            return;
        }
        "Already attached to lifecycleOwner".toString();
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
