package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WQS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQS {
    public final C0WPF LIZ = new C0WPF();
    public final C0WQT LIZIZ = new C0WQT();

    public final ExecutorService LIZ(C2123508Tp c2123508Tp, boolean z) {
        ThreadPoolExecutor c0wpm;
        this.LIZIZ.getClass();
        switch (C0WQW.LIZ[c2123508Tp.LIZ.ordinal()]) {
            case 1:
                c0wpm = C0WQT.LIZ(z);
                break;
            case 2:
                if (z && c2123508Tp.LIZJ >= C0WQT.LIZIZ) {
                    C0WQX c0wqx = C0WQX.DEFAULT;
                    int i = c2123508Tp.LIZJ;
                    int i2 = (i * 2) + 1;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    BlockingQueue linkedBlockingQueue = c2123508Tp.LIZLLL;
                    if (linkedBlockingQueue == null) {
                        linkedBlockingQueue = new LinkedBlockingQueue(128);
                    }
                    c0wpm = new C0WPM(c0wqx, i, i2, 30L, timeUnit, linkedBlockingQueue, new C0WQU("tp-default", false, 0), C0WQT.LJIIIIZZ);
                    c0wpm.allowCoreThreadTimeOut(true);
                } else {
                    C0WQX c0wqx2 = C0WQX.DEFAULT;
                    int i3 = C0WQT.LIZIZ;
                    c0wpm = new C0WPM(c0wqx2, i3, (i3 * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new C0WQU("tp-default", false, 0), C0WQT.LJIIIIZZ);
                    c0wpm.allowCoreThreadTimeOut(true);
                }
                break;
            case 3:
                c0wpm = new C0WPM(C0WQX.BACKGROUND, 0, 3, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new C0WQU("tp-background", true, 10), C0WQT.LJIIIIZZ);
                break;
            case 4:
                int i4 = c2123508Tp.LIZJ;
                ThreadFactory c0wqu = c2123508Tp.LJI;
                if (c0wqu == null) {
                    String str = c2123508Tp.LIZIZ;
                    if (str == null) {
                        str = "tp-scheduled";
                    }
                    c0wqu = new C0WQU(str, false, 0);
                }
                c0wpm = new C822660WOy(i4, c0wqu);
                long j = c2123508Tp.LJFF;
                if (j < 0) {
                    j = 15;
                }
                c0wpm.setKeepAliveTime(j, TimeUnit.SECONDS);
                c0wpm.allowCoreThreadTimeOut(true);
                break;
            case 5:
                C0WQX c0wqx3 = C0WQX.SERIAL;
                long j2 = c2123508Tp.LJFF;
                if (j2 < 0) {
                    j2 = 30;
                }
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                BlockingQueue linkedBlockingQueue2 = c2123508Tp.LIZLLL;
                if (linkedBlockingQueue2 == null) {
                    linkedBlockingQueue2 = new LinkedBlockingQueue();
                }
                ThreadFactory c0wqu2 = c2123508Tp.LJI;
                if (c0wqu2 == null) {
                    String str2 = c2123508Tp.LIZIZ;
                    if (str2 == null) {
                        str2 = "tp-serial";
                    }
                    c0wqu2 = new C0WQU(str2, false, 0);
                }
                RejectedExecutionHandler abortPolicy = c2123508Tp.LJ;
                if (abortPolicy == null) {
                    abortPolicy = new ThreadPoolExecutor.AbortPolicy();
                }
                c0wpm = new C0WPM(c0wqx3, 1, 1, j2, timeUnit2, linkedBlockingQueue2, c0wqu2, abortPolicy);
                c0wpm.allowCoreThreadTimeOut(true);
                break;
            case 6:
                C0WQX c0wqx4 = C0WQX.FIXED;
                int i5 = c2123508Tp.LIZJ;
                long j3 = c2123508Tp.LJFF;
                if (j3 < 0) {
                    j3 = 30;
                }
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                BlockingQueue linkedBlockingQueue3 = c2123508Tp.LIZLLL;
                if (linkedBlockingQueue3 == null) {
                    linkedBlockingQueue3 = new LinkedBlockingQueue();
                }
                ThreadFactory c0wqu3 = c2123508Tp.LJI;
                if (c0wqu3 == null) {
                    String str3 = c2123508Tp.LIZIZ;
                    if (str3 == null) {
                        str3 = "tp-fixed";
                    }
                    c0wqu3 = new C0WQU(str3, false, 0);
                }
                RejectedExecutionHandler abortPolicy2 = c2123508Tp.LJ;
                if (abortPolicy2 == null) {
                    abortPolicy2 = new ThreadPoolExecutor.AbortPolicy();
                }
                c0wpm = new C0WPM(c0wqx4, i5, i5, j3, timeUnit3, linkedBlockingQueue3, c0wqu3, abortPolicy2);
                c0wpm.allowCoreThreadTimeOut(true);
                break;
            default:
                c0wpm = C0WQT.LIZ(false);
                break;
        }
        if (C823050WQl.LIZ.LIZ) {
            C0WPF c0wpf = this.LIZ;
            C0WQX c0wqx5 = c2123508Tp.LIZ;
            if (z) {
                ((HashMap) c0wpf.LIZ).put(c0wqx5.name(), new WeakReference(c0wpm));
            } else {
                if (((HashMap) c0wpf.LIZIZ).get(c0wqx5) == null) {
                    ((HashMap) c0wpf.LIZIZ).put(c0wqx5, new AtomicInteger(0));
                }
                Map<String, WeakReference<ExecutorService>> map = c0wpf.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0wqx5.name());
                sbLIZ.append("_");
                sbLIZ.append(((AtomicInteger) ((HashMap) c0wpf.LIZIZ).get(c0wqx5)).incrementAndGet());
                ((HashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), new WeakReference(c0wpm));
                return c0wpm;
            }
        }
        return c0wpm;
    }
}
