package X;

import android.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: X.0V7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792580V7g extends C822660WOy {
    public final Map<Integer, List<ScheduledFuture<?>>> LL;
    public final Map<ScheduledFuture<?>, Pair<Integer, Boolean>> LLILLJJLI;
    public ExecutorService LLILLL;
    public ThreadPoolExecutor LLILZ;

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void terminated() {
        super.terminated();
    }

    public C792580V7g(C0V4Y c0v4y) {
        super(1, c0v4y);
        this.LL = new ConcurrentHashMap();
        this.LLILLJJLI = new ConcurrentHashMap();
    }

    public final void LIZ(C0V4C c0v4c) {
        boolean z;
        if (c0v4c == null) {
            return;
        }
        int iHashCode = c0v4c.hashCode();
        List<ScheduledFuture> list = (List) ((ConcurrentHashMap) this.LL).get(Integer.valueOf(iHashCode));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("z-debug scheduledFutures in ?");
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (list != null && !list.isEmpty()) {
            for (ScheduledFuture scheduledFuture : list) {
                if (!scheduledFuture.isCancelled()) {
                    scheduledFuture.cancel(true);
                    LIZIZ(Integer.valueOf(iHashCode), scheduledFuture);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        ExecutorService executorService = this.LLILLL;
        if (executorService != null) {
            return executorService.submit(runnable);
        }
        return super.submit(runnable);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        ExecutorService executorService = this.LLILLL;
        if (executorService != null) {
            return executorService.submit(callable);
        }
        return super.submit(callable);
    }

    public final void LIZIZ(Integer num, ScheduledFuture scheduledFuture) {
        List list = (List) ((ConcurrentHashMap) this.LL).get(num);
        if (list != null) {
            list.remove(scheduledFuture);
            if (list.isEmpty()) {
                ((ConcurrentHashMap) this.LL).remove(num);
            }
        }
        ((ConcurrentHashMap) this.LLILLJJLI).remove(scheduledFuture);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        Object obj;
        super.afterExecute(runnable, th);
        if (runnable instanceof ScheduledFuture) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) runnable;
            Pair pair = (Pair) ((ConcurrentHashMap) this.LLILLJJLI).get(scheduledFuture);
            if (pair != null && (obj = pair.first) != null) {
                int iIntValue = ((Integer) obj).intValue();
                Boolean bool = (Boolean) pair.second;
                if (bool != null && !bool.booleanValue()) {
                    LIZIZ(Integer.valueOf(iIntValue), scheduledFuture);
                }
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        ExecutorService executorService = this.LLILLL;
        if (executorService != null) {
            return executorService.submit(runnable, t);
        }
        return super.submit(runnable, t);
    }

    public final void LIZLLL(ScheduledFuture<?> scheduledFuture, int i, boolean z) {
        List copyOnWriteArrayList = (List) ((ConcurrentHashMap) this.LL).get(Integer.valueOf(i));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            ((ConcurrentHashMap) this.LL).put(Integer.valueOf(i), copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(scheduledFuture);
        ((ConcurrentHashMap) this.LLILLJJLI).put(scheduledFuture, new Pair(Integer.valueOf(i), Boolean.valueOf(z)));
    }
}
