package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS10S1100000_4;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0CFN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFN {
    public static BPEAHandler LIZIZ;
    public static BPEAHandler LIZJ;
    public static HandlerThread LIZLLL;
    public static Choreographer LJ;
    public static boolean LJI;
    public static boolean LJII;
    public static final C0CFN LIZ = new C0CFN();
    public static final Map<String, Runnable> LJFF = Collections.synchronizedMap(new LinkedHashMap());

    public final void LIZLLL() {
        if (LJI) {
            return;
        }
        synchronized (this) {
            try {
                if (LJI) {
                    return;
                }
                LIZJ = new BPEAHandler(Looper.getMainLooper());
                if (!LJII) {
                    HandlerThread handlerThread = new HandlerThread("FakeMainThread");
                    LIZLLL = handlerThread;
                    handlerThread.start();
                }
                HandlerThread handlerThread2 = LIZLLL;
                if (handlerThread2 == null) {
                    handlerThread2 = null;
                }
                BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread2));
                LIZIZ = bPEAHandler;
                C786410Ut5.LJL(bPEAHandler, new Runnable() { // from class: X.086u
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FakeMainThreadHandler@ca0.init$1$1");
                        try {
                            try {
                                Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                                declaredField.setAccessible(true);
                                ((ThreadLocal) declaredField.get(null)).set(Looper.getMainLooper());
                            } catch (IllegalAccessException e) {
                                TryCatchGuardChecker.doCheck(e);
                            } catch (NoSuchFieldException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FakeMainThreadHandler@ca0.init$1$1");
                    }
                });
                HandlerThread handlerThread3 = LIZLLL;
                Process.setThreadPriority((handlerThread3 != null ? handlerThread3 : null).getThreadId(), -20);
                LJI = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ() {
        if (!C0B2H.LIZ || LJII || LJI) {
            return;
        }
        synchronized (this) {
            try {
                if (LJII || LJI) {
                    return;
                }
                HandlerThread handlerThread = new HandlerThread("FakeMainThread");
                LIZLLL = handlerThread;
                handlerThread.start();
                LJII = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ(String str) {
        Map<String, Runnable> map = LJFF;
        Runnable runnable = map.get(str);
        if (runnable != null) {
            synchronized (runnable) {
                try {
                    if (map.get(str) == null) {
                        return;
                    }
                    runnable.run();
                    map.remove(str);
                    LIZ.LIZLLL();
                    BPEAHandler bPEAHandler = LIZIZ;
                    if (bPEAHandler == null) {
                        bPEAHandler = null;
                    }
                    bPEAHandler.removeCallbacks(runnable);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZIZ(Runnable runnable) {
        LIZLLL();
        BPEAHandler bPEAHandler = LIZIZ;
        if (bPEAHandler == null) {
            bPEAHandler = null;
        }
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS104S0100000_4(runnable, 53));
    }

    public static final void LIZJ(final Runnable runnable, final String str, boolean z) {
        if (z) {
            C0CFN c0cfn = LIZ;
            Map<String, Runnable> map = LJFF;
            if (map.get(str) == null) {
                map.put(str, runnable);
                c0cfn.LIZLLL();
                BPEAHandler bPEAHandler = LIZIZ;
                if (bPEAHandler == null) {
                    bPEAHandler = null;
                }
                C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0CFO
                    public final void LIZ() {
                        Runnable runnable2 = runnable;
                        String str2 = str;
                        synchronized (runnable2) {
                            try {
                                try {
                                    Map<String, Runnable> map2 = C0CFN.LJFF;
                                    if (map2.get(str2) != null) {
                                        runnable2.run();
                                        map2.remove(str2);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    BPEAHandler bPEAHandler2 = C0CFN.LIZJ;
                                    if (bPEAHandler2 == null) {
                                        bPEAHandler2 = null;
                                    }
                                    C786410Ut5.LJJZZIII(bPEAHandler2, new ARunnableS10S1100000_4(runnable2, str2, 1));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FakeMainThreadHandler@ca0.excuteRunnable$3");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FakeMainThreadHandler@ca0.excuteRunnable$3");
                    }
                });
                return;
            }
            throw new RuntimeException("The tag already exists, please do not execute runnable repeatedly");
        }
        runnable.run();
    }
}
