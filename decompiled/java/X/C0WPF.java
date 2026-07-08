package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WPF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPF {
    public final Map<String, WeakReference<ExecutorService>> LIZ = new HashMap();
    public final Map<C0WQX, AtomicInteger> LIZIZ = new HashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            String str = (String) entry.getKey();
            if (((Reference) entry.getValue()).get() != null) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) ((Reference) entry.getValue()).get();
                sb.append("pool=");
                sb.append(str);
                sb.append(", core.size=");
                sb.append(threadPoolExecutor.getCorePoolSize());
                sb.append(", pool.size=");
                sb.append(threadPoolExecutor.getPoolSize());
                sb.append(", largest.pool.size=");
                sb.append(threadPoolExecutor.getLargestPoolSize());
                sb.append(", queue.size=");
                sb.append(threadPoolExecutor.getQueue().size());
                sb.append(", task.count=");
                sb.append(threadPoolExecutor.getTaskCount());
                sb.append(", task.completed.count=");
                sb.append(threadPoolExecutor.getCompletedTaskCount());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
