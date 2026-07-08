package androidx.lifecycle;

/* JADX INFO: loaded from: classes25.dex */
public final class SharedVMInjector {
    public static final SharedVMInjector INSTANCE = new SharedVMInjector();
    public static boolean optimiseVMLifecycleCounter;

    public final boolean getOptimiseVMLifecycleCounter() {
        return optimiseVMLifecycleCounter;
    }

    public final void setOptimiseVMLifecycleCounter(boolean z) {
        optimiseVMLifecycleCounter = z;
    }
}
