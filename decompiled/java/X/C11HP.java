package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: renamed from: X.11HP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11HP implements LifecycleOwner {
    public final LifecycleRegistry LL = new LifecycleRegistry(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL;
    }
}
