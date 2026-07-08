package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    public final GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.generatedAdapter = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.generatedAdapter.callMethods(lifecycleOwner, event, false, null);
        this.generatedAdapter.callMethods(lifecycleOwner, event, true, null);
    }
}
