package androidx.lifecycle;

/* JADX INFO: loaded from: classes5.dex */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
