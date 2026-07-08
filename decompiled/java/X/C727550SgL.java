package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0SgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727550SgL extends Lifecycle {
    public final ConcurrentLinkedQueue<LifecycleObserver> LL = new ConcurrentLinkedQueue<>();

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return Lifecycle.State.CREATED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver lifecycleObserver) {
        this.LL.offer(lifecycleObserver);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver lifecycleObserver) {
        this.LL.remove(lifecycleObserver);
    }
}
