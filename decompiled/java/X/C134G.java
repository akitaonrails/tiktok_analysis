package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.134G, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C134G<T> extends AtomicReference<Runnable> implements Runnable {
    public static final C134J LL = new Runnable() { // from class: X.134J
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("InterruptibleTask$DoNothingRunnable@36b.run");
            C1C7U.LIZIZ("InterruptibleTask$DoNothingRunnable@36b.run");
        }
    };
    public static final C134J LLILLJJLI = new Runnable() { // from class: X.134J
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("InterruptibleTask$DoNothingRunnable@36b.run");
            C1C7U.LIZIZ("InterruptibleTask$DoNothingRunnable@36b.run");
        }
    };

    public abstract void LIZ(Throwable th);

    public abstract void LIZIZ(T t);

    public abstract boolean LIZJ();

    public abstract T LIZLLL();

    public abstract String LJ();

    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("InterruptibleTask@285.run");
        com_google_common_util_concurrent_InterruptibleTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("InterruptibleTask@285.run");
    }

    public final void com_google_common_util_concurrent_InterruptibleTask__run$___twin___() {
        Thread threadU3 = C786410Ut5.u3();
        T tLIZLLL = null;
        if (compareAndSet(null, threadU3)) {
            boolean z = !LIZJ();
            C134J c134j = LL;
            if (z) {
                try {
                    tLIZLLL = LIZLLL();
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        if (!compareAndSet(threadU3, c134j)) {
                            LJFF(threadU3);
                        }
                        LIZ(th);
                        return;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        if (!compareAndSet(threadU3, c134j)) {
                            LJFF(threadU3);
                        }
                        LIZIZ(tLIZLLL);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadU3, c134j)) {
                LJFF(threadU3);
            }
            if (z) {
                LIZIZ(tLIZLLL);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == LL) {
            string = "running=[DONE]";
        } else if (runnable instanceof C134I) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append(e3.f);
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strLJ = LJ();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strLJ).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strLJ);
        return sb2.toString();
    }

    public static void com_google_common_util_concurrent_InterruptibleTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(C134G c134g) {
        try {
            c134g.com_google_common_util_concurrent_InterruptibleTask__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public final void LJFF(Thread thread) {
        Runnable runnable = get();
        Runnable runnable2 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof C134I;
            C134J c134j = LLILLJJLI;
            if (!z2) {
                if (runnable != c134j) {
                    break;
                }
            } else {
                runnable2 = runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == c134j || compareAndSet(runnable, c134j)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(runnable2);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }
}
