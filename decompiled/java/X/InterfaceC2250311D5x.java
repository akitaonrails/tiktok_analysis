package X;

import java.util.Set;

/* JADX INFO: renamed from: X.1D5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public interface InterfaceC2250311D5x {
    void destroy();

    AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63);

    AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63);

    Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies();

    Set<C1D61> getLifecycleStages();

    int getPriority();
}
