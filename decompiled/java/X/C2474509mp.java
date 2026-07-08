package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.09mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2474509mp {
    public static final ExecutorService LIZ = (ExecutorService) C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2);

    public static final void LIZ(Runnable runnable) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
    }
}
