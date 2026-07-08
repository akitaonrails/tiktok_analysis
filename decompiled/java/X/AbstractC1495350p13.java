package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0p13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1495350p13 {
    public final Executor mExecutor;

    public abstract void onRequestFinished(AbstractC1494840p0E abstractC1494840p0E);

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public AbstractC1495350p13(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
            return;
        }
        throw new IllegalStateException("Executor must not be null");
    }
}
