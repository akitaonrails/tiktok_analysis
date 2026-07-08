package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: renamed from: X.16Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20736016Cg implements LifecycleOwner {
    public LifecycleRegistry LL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        if (this.LL == null) {
            this.LL = new LifecycleRegistry(this);
        }
        return this.LL;
    }

    public final void LIZ(Lifecycle.Event event) {
        if (this.LL == null) {
            this.LL = new LifecycleRegistry(this);
        }
        this.LL.handleLifecycleEvent(event);
    }
}
