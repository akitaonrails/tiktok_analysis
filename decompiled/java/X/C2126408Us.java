package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.08Us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2126408Us extends AbstractC2252651DEx {
    public final ExecutorService LL;

    public C2126408Us(ExecutorService executorService) {
        this.LL = executorService;
    }

    @Override // X.AbstractC23273099z, kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return super.plus(coroutineContext);
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.LL.execute(runnable);
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
