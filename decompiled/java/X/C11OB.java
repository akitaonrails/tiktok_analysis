package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11OB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11OB<T> extends AtomicReference<Thread> implements C11PF<T>, C11LR, Runnable {
    public static final long serialVersionUID = 8094547886072529208L;
    public final C11M9<? super T> LL;
    public final C11RN LLILLJJLI;
    public final AtomicReference<C11LR> LLILLL = new AtomicReference<>();
    public final AtomicLong LLILZ = new AtomicLong();
    public final boolean LLILZIL;
    public C11LE<T> LLILZLL;

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_operators_flowable_FlowableSubscribeOn$SubscribeOnSubscriber_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // X.C11LR
    public void cancel() {
        C11NC.cancel(this.LLILLL);
        this.LLILLJJLI.dispose();
    }

    @Override // X.C11M9
    public void onComplete() {
        this.LL.onComplete();
        this.LLILLJJLI.dispose();
    }

    public void io_reactivex_internal_operators_flowable_FlowableSubscribeOn$SubscribeOnSubscriber__run$___twin___() {
        lazySet(C786410Ut5.u3());
        C11LE<T> c11le = this.LLILZLL;
        this.LLILZLL = null;
        c11le.subscribe(this);
    }

    public static void io_reactivex_internal_operators_flowable_FlowableSubscribeOn$SubscribeOnSubscriber_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(C11OB c11ob) {
        try {
            c11ob.io_reactivex_internal_operators_flowable_FlowableSubscribeOn$SubscribeOnSubscriber__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.C11M9
    public void onError(Throwable th) {
        this.LL.onError(th);
        this.LLILLJJLI.dispose();
    }

    @Override // X.C11M9
    public void onNext(T t) {
        this.LL.onNext(t);
    }

    @Override // X.C11PF, X.C11M9
    public void onSubscribe(C11LR c11lr) {
        if (C11NC.setOnce(this.LLILLL, c11lr)) {
            long andSet = this.LLILZ.getAndSet(0L);
            if (andSet != 0) {
                LIZ(andSet, c11lr);
            }
        }
    }

    @Override // X.C11LR
    public void request(long j) {
        if (C11NC.validate(j)) {
            C11LR c11lr = this.LLILLL.get();
            if (c11lr != null) {
                LIZ(j, c11lr);
                return;
            }
            C19492311Nx.LIZ(this.LLILZ, j);
            C11LR c11lr2 = this.LLILLL.get();
            if (c11lr2 == null) {
                return;
            }
            long andSet = this.LLILZ.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            LIZ(andSet, c11lr2);
        }
    }

    public final void LIZ(final long j, final C11LR c11lr) {
        if (!this.LLILZIL && C786410Ut5.u3() != get()) {
            this.LLILLJJLI.LIZIZ(new Runnable(j, c11lr) { // from class: X.11OC
                public final C11LR LL;
                public final long LLILLJJLI;

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.LL.request(this.LLILLJJLI);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }

                {
                    this.LL = c11lr;
                    this.LLILLJJLI = j;
                }
            });
        } else {
            c11lr.request(j);
        }
    }

    public C11OB(C11M9 c11m9, C11RN c11rn, C11NN c11nn, boolean z) {
        this.LL = c11m9;
        this.LLILLJJLI = c11rn;
        this.LLILZLL = c11nn;
        this.LLILZIL = !z;
    }
}
