package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11Tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19506611Tk extends Lifecycle {
    public final LifecycleRegistry LL;
    public final List<LifecycleObserver> LLILLJJLI = new ArrayList();

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return this.LL.getCurrentState();
    }

    public C19506611Tk(LifecycleRegistry lifecycleRegistry) {
        this.LL = lifecycleRegistry;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver == null) {
            return;
        }
        ((ArrayList) this.LLILLJJLI).add(lifecycleObserver);
        this.LL.addObserver(lifecycleObserver);
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        this.LL.handleLifecycleEvent(event);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver == null) {
            return;
        }
        ((ArrayList) this.LLILLJJLI).remove(lifecycleObserver);
        this.LL.removeObserver(lifecycleObserver);
    }
}
