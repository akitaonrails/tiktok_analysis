package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WPI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WPI<V> extends C0WPJ<V> implements ListenableFuture<V> {
    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void LJIIJJI(Runnable runnable, Executor executor) {
        ((C0WPH) this).LL.LJIIJJI(runnable, executor);
    }
}
