package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252581DEq extends AbstractC2252651DEx implements InterfaceC2239108px {
    public static final AtomicIntegerFieldUpdater LLILZLL = AtomicIntegerFieldUpdater.newUpdater(C2252581DEq.class, "runningWorkers");
    public final AbstractC2252651DEx LL;
    public final int LLILLJJLI;
    public final /* synthetic */ InterfaceC2239108px LLILLL;
    public final C2252481DEg<Runnable> LLILZ;
    public final Object LLILZIL;
    public volatile int runningWorkers;

    @Override // X.InterfaceC2239108px
    public final InterfaceC2238208po invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.LLILLL.invokeOnTimeout(j, runnable, coroutineContext);
    }

    @Override // X.InterfaceC2239108px
    public final void scheduleResumeAfterDelay(long j, InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf) {
        this.LLILLL.scheduleResumeAfterDelay(j, interfaceC20236714Gf);
    }

    public final Runnable LLIILII() {
        while (true) {
            Runnable runnableLIZLLL = this.LLILZ.LIZLLL();
            if (runnableLIZLLL != null) {
                return runnableLIZLLL;
            }
            synchronized (this.LLILZIL) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZLL;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.LLILZ.LIZJ() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // X.AbstractC2252651DEx
    public final AbstractC2252651DEx limitedParallelism(int i) {
        C1917207f8.LIZ(i);
        if (i >= this.LLILLJJLI) {
            return this;
        }
        return super.limitedParallelism(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2252581DEq(AbstractC2252651DEx abstractC2252651DEx, int i) {
        InterfaceC2239108px interfaceC2239108px;
        this.LL = abstractC2252651DEx;
        this.LLILLJJLI = i;
        this.LLILLL = (!(abstractC2252651DEx instanceof InterfaceC2239108px) || (interfaceC2239108px = (InterfaceC2239108px) abstractC2252651DEx) == null) ? C2232608ou.LIZ : interfaceC2239108px;
        this.LLILZ = new C2252481DEg<>();
        this.LLILZIL = new Object();
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.LLILZ.LIZ(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZLL;
        if (atomicIntegerFieldUpdater.get(this) < this.LLILLJJLI) {
            synchronized (this.LLILZIL) {
                if (atomicIntegerFieldUpdater.get(this) >= this.LLILLJJLI) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableLLIILII = LLIILII();
                if (runnableLLIILII != null) {
                    C0WQQ.LIZ(this.LL, this, new RunnableC2252591DEr(this, runnableLLIILII));
                }
            }
        }
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        this.LLILZ.LIZ(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZLL;
        if (atomicIntegerFieldUpdater.get(this) < this.LLILLJJLI) {
            synchronized (this.LLILZIL) {
                if (atomicIntegerFieldUpdater.get(this) >= this.LLILLJJLI) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableLLIILII = LLIILII();
                if (runnableLLIILII != null) {
                    this.LL.dispatchYield(this, new RunnableC2252591DEr(this, runnableLLIILII));
                }
            }
        }
    }
}
