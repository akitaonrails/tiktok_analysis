package X;

/* JADX INFO: renamed from: X.1DEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2252601DEs extends AbstractC2252651DEx {
    public boolean shared;
    public C13E8<AbstractC2252631DEv<?>> unconfinedQueue;
    public long useCount;

    private final long delta(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }

    public long getNextTime() {
        C13E8<AbstractC2252631DEv<?>> c13e8 = this.unconfinedQueue;
        return (c13e8 == null || c13e8.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean isActive() {
        return this.useCount > 0;
    }

    public final boolean isUnconfinedLoopActive() {
        return this.useCount >= delta(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        C13E8<AbstractC2252631DEv<?>> c13e8 = this.unconfinedQueue;
        if (c13e8 != null) {
            return c13e8.isEmpty();
        }
        return true;
    }

    public final boolean processUnconfinedEvent() {
        AbstractC2252631DEv<?> abstractC2252631DEvLJIILJJIL;
        C13E8<AbstractC2252631DEv<?>> c13e8 = this.unconfinedQueue;
        if (c13e8 == null || (abstractC2252631DEvLJIILJJIL = c13e8.LJIILJJIL()) == null) {
            return false;
        }
        abstractC2252631DEvLJIILJJIL.run();
        return true;
    }

    public boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    public final void decrementUseCount(boolean z) {
        long jDelta = this.useCount - delta(z);
        this.useCount = jDelta;
        if (jDelta <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(AbstractC2252631DEv<?> abstractC2252631DEv) {
        C13E8<AbstractC2252631DEv<?>> c13e8 = this.unconfinedQueue;
        if (c13e8 == null) {
            c13e8 = new C13E8<>();
            this.unconfinedQueue = c13e8;
        }
        c13e8.addLast(abstractC2252631DEv);
    }

    public final void incrementUseCount(boolean z) {
        this.useCount += delta(z);
        if (!z) {
            this.shared = true;
        }
    }

    @Override // X.AbstractC2252651DEx
    public final AbstractC2252651DEx limitedParallelism(int i) {
        C1917207f8.LIZ(i);
        return this;
    }

    public static /* synthetic */ void decrementUseCount$default(AbstractC2252601DEs abstractC2252601DEs, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC2252601DEs.decrementUseCount(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void incrementUseCount$default(AbstractC2252601DEs abstractC2252601DEs, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC2252601DEs.incrementUseCount(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }
}
