package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: renamed from: X.0lZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363110lZl implements LifecycleOwner {
    public final LifecycleRegistry LL = new LifecycleRegistry(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL;
    }
}
