package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0xwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838750xwv extends AbstractC2252651DEx {
    public static final C01GW<CoroutineContext> LLJIJIL = C452501pT.LIZIZ(new C2151608bq());
    public static final C2151708br LLJILJIL = new ThreadLocal<CoroutineContext>() { // from class: X.08br
        @Override // java.lang.ThreadLocal
        public final CoroutineContext initialValue() {
            Choreographer choreographerV2 = C786410Ut5.v2();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                C1838750xwv c1838750xwv = new C1838750xwv(choreographerV2, C08D5.LIZ(looperMyLooper));
                return c1838750xwv.plus(c1838750xwv.LLJI);
            }
            "no Looper on this thread".toString();
            throw new IllegalStateException("no Looper on this thread");
        }
    };
    public final Choreographer LL;
    public final Handler LLILLJJLI;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C1838740xwu LLJI;
    public final Object LLILLL = new Object();
    public final C13E8<Runnable> LLILZ = new C13E8<>();
    public List<Choreographer.FrameCallback> LLILZIL = new ArrayList();
    public List<Choreographer.FrameCallback> LLILZLL = new ArrayList();
    public final ChoreographerFrameCallbackC1838760xww LLJ = new ChoreographerFrameCallbackC1838760xww(this);

    public final Runnable LLIILZL() {
        Runnable runnableLJIILJJIL;
        synchronized (this.LLILLL) {
            try {
                runnableLJIILJJIL = this.LLILZ.LJIILJJIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return runnableLJIILJJIL;
    }

    public static final void LLIILII(C1838750xwv c1838750xwv) {
        boolean z;
        do {
            Runnable runnableLLIILZL = c1838750xwv.LLIILZL();
            while (runnableLLIILZL != null) {
                runnableLLIILZL.run();
                runnableLLIILZL = c1838750xwv.LLIILZL();
            }
            synchronized (c1838750xwv.LLILLL) {
                try {
                    if (c1838750xwv.LLILZ.isEmpty()) {
                        z = false;
                        c1838750xwv.LLIZ = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } while (z);
    }

    public C1838750xwv(Choreographer choreographer, Handler handler) {
        this.LL = choreographer;
        this.LLILLJJLI = handler;
        this.LLJI = new C1838740xwu(choreographer, this);
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.LLILLL) {
            try {
                this.LLILZ.addLast(runnable);
                if (!this.LLIZ) {
                    this.LLIZ = true;
                    C786410Ut5.LJJZZIII(this.LLILLJJLI, this.LLJ);
                    if (!this.LLIZLLLIL) {
                        this.LLIZLLLIL = true;
                        this.LL.postFrameCallback(this.LLJ);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
