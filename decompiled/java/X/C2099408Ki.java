package X;

import com.bytedance.tt.reliability.queuemonitor.impl.ThreadPoolCollector;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: X.08Ki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2099408Ki {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(ThreadPoolExecutor threadPoolExecutor, Object obj) {
        String name;
        RejectedExecutionHandler rejectedExecutionHandler = threadPoolExecutor.getRejectedExecutionHandler();
        if (rejectedExecutionHandler != null) {
            name = rejectedExecutionHandler.getClass().getName();
        } else {
            name = "";
        }
        ThreadPoolCollector.onRejected(threadPoolExecutor, obj, name);
    }
}
