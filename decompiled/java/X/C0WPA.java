package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WPA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WPA extends C822650WOx {
    public final AtomicInteger LL;

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void purge() {
        super.purge();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void setCorePoolSize(int i) {
        if (i >= 0) {
            getCorePoolSize();
            super.setCorePoolSize(i);
        } else {
            "Core pool size must be >= 0".toString();
            throw new IllegalArgumentException("Core pool size must be >= 0");
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void setMaximumPoolSize(int i) {
        if (i > 0) {
            if (i >= getCorePoolSize()) {
                getMaximumPoolSize();
                super.setMaximumPoolSize(i);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Max pool size must be >= core pool size (");
            sbLIZ.append(getCorePoolSize());
            sbLIZ.append(')');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        "Max pool size must be > 0".toString();
        throw new IllegalArgumentException("Max pool size must be > 0");
    }

    public final void LIZ(int i, int i2) {
        if (i2 >= i) {
            if (i2 > getMaximumPoolSize()) {
                setMaximumPoolSize(i2);
                setCorePoolSize(i);
                return;
            } else {
                setCorePoolSize(i);
                setMaximumPoolSize(i2);
                return;
            }
        }
        "Max pool size must be >= core pool size".toString();
        throw new IllegalArgumentException("Max pool size must be >= core pool size");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.LL.incrementAndGet();
    }

    public C0WPA(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, C086B c086b, C0WTT c0wtt) {
        super(i, i2, j, timeUnit, blockingQueue, c086b, c0wtt);
        this.LL = new AtomicInteger(0);
    }
}
