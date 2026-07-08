package com.appsflyer.internal;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes24.dex */
public final class AFj1rSDK {
    public static final AFj1rSDK INSTANCE = new AFj1rSDK();

    public static final void values(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
