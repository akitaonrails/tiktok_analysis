package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17tM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21172617tM {
    public static BPEAHandler LIZ;
    public static HandlerThread LIZIZ;
    public static C822650WOx LJ;
    public static final C21172617tM LJFF = new C21172617tM();
    public static final C687000Qx8 LIZJ = new C687000Qx8();
    public static final ConcurrentHashMap<String, C687000Qx8> LIZLLL = new ConcurrentHashMap<>();

    public final synchronized Executor LIZIZ() {
        C822650WOx c822650WOx;
        if (LJ == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: X.17tK
                public final AtomicInteger LL = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(final Runnable runnable) {
                    Runnable runnable2 = new Runnable() { // from class: X.17tL
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (C20673215v0.LIZ.LJII) {
                                    getClass();
                                    Process.setThreadPriority(-20);
                                }
                                runnable.run();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    };
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AsyncInflate #");
                    sbLIZ.append(this.LL.getAndIncrement());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    BPEAThread bPEAThread = new BPEAThread(runnable2, strLIZIZ);
                    C21172617tM.LIZLLL.put(strLIZIZ, new C687000Qx8());
                    return bPEAThread;
                }
            };
            int i = C20673215v0.LIZ.LIZJ;
            LJ = new C822650WOx(i, i, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue(10000), threadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());
        }
        c822650WOx = LJ;
        if (c822650WOx == null) {
            Intrinsics.LJIIL();
        }
        return c822650WOx;
    }

    public final BPEAHandler LIZ() {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
            C1150504el.LIZ().LIZLLL("method_nita_executor_inflate_handler_duration", false);
        } else {
            z = false;
        }
        if (LIZ == null) {
            synchronized (this) {
                try {
                    if (LIZ == null) {
                        HandlerThread handlerThread = new HandlerThread("NitaMainThread");
                        LIZIZ = handlerThread;
                        handlerThread.start();
                        HandlerThread handlerThread2 = LIZIZ;
                        if (handlerThread2 == null) {
                            Intrinsics.LJIIL();
                        }
                        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread2));
                        LIZ = bPEAHandler;
                        C786410Ut5.LJL(bPEAHandler, new Runnable() { // from class: X.09o8
                            public static void LIZ() {
                                C21172617tM.LJFF.getClass();
                                try {
                                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                                    declaredField.setAccessible(true);
                                    Object obj = declaredField.get(null);
                                    if (obj == null) {
                                        throw new C2482109o3("null cannot be cast to non-null type java.lang.ThreadLocal<android.os.Looper>");
                                    }
                                    ((ThreadLocal) obj).set(Looper.getMainLooper());
                                } catch (IllegalAccessException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                } catch (NoSuchFieldException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    LIZ();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    if (!C2179971ATj.LIZ(th)) {
                                        throw th;
                                    }
                                }
                            }
                        });
                        if (C20673215v0.LIZ.LJII) {
                            HandlerThread handlerThread3 = LIZIZ;
                            if (handlerThread3 == null) {
                                Intrinsics.LJIIL();
                            }
                            Process.setThreadPriority(handlerThread3.getThreadId(), -20);
                        }
                        LIZLLL.put("NitaMainThread", LIZJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        BPEAHandler bPEAHandler2 = LIZ;
        if (bPEAHandler2 == null) {
            Intrinsics.LJIIL();
        }
        if (z) {
            C1150504el.LIZ().LJI("method_nita_executor_inflate_handler_duration", false);
        }
        return bPEAHandler2;
    }
}
