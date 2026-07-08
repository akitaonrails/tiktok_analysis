package androidx.lifecycle;

import X.C09AE;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes7.dex */
public final class LifecycleController {
    public final DispatchQueue dispatchQueue;
    public final Lifecycle lifecycle;
    public final Lifecycle.State minState;
    public final LifecycleEventObserver observer;

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }

    private final void handleDestroy(C09AE c09ae) {
        c09ae.LIZIZ(null);
        finish();
    }

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, final C09AE c09ae) {
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.0I0n
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.LL, c09ae, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            c09ae.LIZIZ(null);
            finish();
        } else {
            lifecycle.addObserver(lifecycleEventObserver);
        }
    }

    public static final void observer$lambda$0(LifecycleController lifecycleController, C09AE c09ae, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            c09ae.LIZIZ(null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState) < 0) {
            lifecycleController.dispatchQueue.pause();
        } else {
            lifecycleController.dispatchQueue.resume();
        }
    }
}
