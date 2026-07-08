package X;

import Y.ARunnableS103S0100000_3;
import android.os.AsyncTask;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08UR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08UR extends C822650WOx {
    public static final int LL;
    public static final int LLILLJJLI;
    public static final AnonymousClass0866 LLILLL;
    public static final BlockingQueue<Runnable> LLILZ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0866] */
    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        LL = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        LLILLJJLI = (iAvailableProcessors * 2) + 1;
        LLILLL = new ThreadFactory() { // from class: X.0866
            public final AtomicInteger LL = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                ARunnableS103S0100000_3 aRunnableS103S0100000_3 = new ARunnableS103S0100000_3(runnable, 16);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CrAsyncTask #");
                sbLIZ.append(this.LL.getAndIncrement());
                return new BPEAThread(aRunnableS103S0100000_3, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        LLILZ = new ArrayBlockingQueue(128);
    }

    @Override // X.C822650WOx, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        String string;
        int iIntValue;
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            HashMap map = new HashMap();
            for (Runnable runnable2 : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                Class<?> cls = runnable2.getClass();
                if (cls != C08VG.class) {
                    try {
                        if (cls.getEnclosingClass() == AsyncTask.class) {
                            Field declaredField = cls.getDeclaredField("this$0");
                            declaredField.setAccessible(true);
                            cls = declaredField.get(runnable2).getClass();
                        }
                    } catch (IllegalAccessException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    } catch (NoSuchFieldException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    String name = cls.getName();
                    if (map.containsKey(name)) {
                        iIntValue = ((Integer) map.get(name)).intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map.put(name, Integer.valueOf(iIntValue + 1));
                } else {
                    throw null;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Prominent classes in AsyncTask: ");
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    sb.append((String) entry.getKey());
                    sb.append(' ');
                }
            }
            if (sb.length() == 0) {
                string = "NO CLASSES FOUND";
            } else {
                string = sb.toString();
            }
            sbLIZ.append(string);
            throw new RejectedExecutionException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public C08UR(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, AnonymousClass0866 anonymousClass0866) {
        super(i, i2, 30L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, anonymousClass0866);
        allowCoreThreadTimeOut(true);
    }
}
