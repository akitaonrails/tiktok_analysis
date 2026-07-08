package androidx.lifecycle;

/* JADX INFO: loaded from: classes32.dex */
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override // androidx.lifecycle.LifecycleOwner
    /* bridge */ /* synthetic */ Lifecycle getLifecycle();

    @Override // androidx.lifecycle.LifecycleOwner
    LifecycleRegistry getLifecycle();
}
