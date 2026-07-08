package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.09UU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UU extends C09UV {
    public static <V> void LIZ(ListenableFuture<V> listenableFuture, C11U6<? super V> c11u6, Executor executor) {
        listenableFuture.LJIIJJI(new C135Q(listenableFuture, c11u6), executor);
    }
}
