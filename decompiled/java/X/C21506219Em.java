package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

/* JADX INFO: renamed from: X.19Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21506219Em {
    public final Lifecycle LIZ;
    public LifecycleEventObserver LIZIZ;

    public C21506219Em(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.LIZ = lifecycle;
        this.LIZIZ = lifecycleEventObserver;
        lifecycle.addObserver(lifecycleEventObserver);
    }
}
