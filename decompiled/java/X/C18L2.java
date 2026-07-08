package X;

import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: X.18L2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C18L2 extends PthreadThread {
    public static final C18L2 LLILLL;
    public final ArrayBlockingQueue<C18L5> LL;
    public final C1085640eME<C18L5> LLILLJJLI;

    static {
        C18L2 c18l2 = new C18L2();
        LLILLL = c18l2;
        c18l2.start();
    }

    public C18L2() {
        super("AsyncLayoutInflater$InflateThread");
        this.LL = new ArrayBlockingQueue<>(10);
        this.LLILLJJLI = new C1085640eME<>(10);
    }

    public void runInner() {
        try {
            C18L5 c18l5Take = this.LL.take();
            try {
                c18l5Take.LIZLLL = C786410Ut5.Td(c18l5Take.LIZ.LIZ, c18l5Take.LIZJ, c18l5Take.LIZIZ, false);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Message.obtain(c18l5Take.LIZ.LIZIZ, 0, c18l5Take).sendToTarget();
        } catch (InterruptedException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                runInner();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
                return;
            }
        }
    }
}
