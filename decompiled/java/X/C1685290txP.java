package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: renamed from: X.0txP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685290txP implements LifecycleOwner {
    public final LifecycleRegistry LL;

    public C1685290txP() {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.LL = lifecycleRegistry;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return this.LL;
    }
}
