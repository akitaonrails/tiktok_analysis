package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0RhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceExecutorServiceC702790RhV extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> ListenableFuture<T> submit(Callable<T> callable);
}
