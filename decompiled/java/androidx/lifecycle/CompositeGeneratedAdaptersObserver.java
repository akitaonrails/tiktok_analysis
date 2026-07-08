package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {
    public final GeneratedAdapter[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.generatedAdapters = generatedAdapterArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        for (GeneratedAdapter generatedAdapter : this.generatedAdapters) {
            generatedAdapter.callMethods(lifecycleOwner, event, false, methodCallsLogger);
        }
        for (GeneratedAdapter generatedAdapter2 : this.generatedAdapters) {
            generatedAdapter2.callMethods(lifecycleOwner, event, true, methodCallsLogger);
        }
    }
}
