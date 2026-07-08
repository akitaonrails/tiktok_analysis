package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: renamed from: X.06Vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1618706Vl implements LifecycleOwner {
    public final LifecycleRegistry LL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL;
    }

    public C1618706Vl(DialogC1389620mGW dialogC1389620mGW) {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.LL = lifecycleRegistry;
        lifecycleRegistry.setCurrentState(Lifecycle.State.STARTED);
        dialogC1389620mGW.setOnDismissListener(new DialogInterfaceOnDismissListenerC1767806w8(this, 1));
    }
}
