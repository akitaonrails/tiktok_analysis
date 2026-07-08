package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Vlq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807400Vlq {
    public static final /* synthetic */ int LIZ = 0;

    public static final ExecutorService LIZ() {
        return C0WP5.LIZJ() ? new C822650WOx(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue()) : PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("ExecutorsHook$Companion"));
    }

    public static final ExecutorService LIZJ() {
        return C0WP5.LIZJ() ? new C822650WOx(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()) : C786410Ut5.h4();
    }

    public static final ScheduledExecutorService LJ() {
        return C0WP5.LIZJ() ? new C822660WOy(1) : PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("ExecutorsHook$Companion"));
    }

    public static final ScheduledExecutorService LIZIZ(ThreadFactory threadFactory) {
        if (C0WP5.LIZJ()) {
            return new C822660WOy(1, threadFactory);
        }
        return C786410Ut5.g4(1, threadFactory);
    }

    public static final ExecutorService LIZLLL(ThreadFactory threadFactory) {
        if (C0WP5.LIZJ()) {
            return new C822650WOx(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory);
        }
        return C786410Ut5.i4(threadFactory);
    }

    public static final ScheduledExecutorService LJFF(ThreadFactory threadFactory) {
        if (C0WP5.LIZJ()) {
            return new C822660WOy(1, threadFactory);
        }
        return PThreadExecutorsUtils.newSingleThreadScheduledExecutor(threadFactory);
    }
}
