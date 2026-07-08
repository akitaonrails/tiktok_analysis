package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Mb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19487511Mb<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final C19487611Mc LLIZLLLIL = new C19487611Mc(null);
    public final C11IY LL;
    public final InterfaceC1487280oo2<? super T, ? extends C11IV> LLILLJJLI;
    public final boolean LLILLL;
    public final C19487711Md LLILZ = new C19487711Md();
    public final AtomicReference<C19487611Mc> LLILZIL = new AtomicReference<>();
    public volatile boolean LLILZLL;
    public InterfaceC420801kM LLIZ;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLILZLL = true;
        if (this.LLILZIL.get() == null) {
            Throwable thTerminate = this.LLILZ.terminate();
            if (thTerminate == null) {
                this.LL.onComplete();
            } else {
                this.LL.onError(thTerminate);
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLIZ.dispose();
        AtomicReference<C19487611Mc> atomicReference = this.LLILZIL;
        C19487611Mc c19487611Mc = LLIZLLLIL;
        C19487611Mc andSet = atomicReference.getAndSet(c19487611Mc);
        if (andSet == null || andSet == c19487611Mc) {
            return;
        }
        C11JE.dispose(andSet);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZIL.get() == LLIZLLLIL;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZ.addThrowable(th)) {
            if (this.LLILLL) {
                onComplete();
                return;
            }
            AtomicReference<C19487611Mc> atomicReference = this.LLILZIL;
            C19487611Mc c19487611Mc = LLIZLLLIL;
            C19487611Mc andSet = atomicReference.getAndSet(c19487611Mc);
            if (andSet != null && andSet != c19487611Mc) {
                C11JE.dispose(andSet);
            }
            Throwable thTerminate = this.LLILZ.terminate();
            if (thTerminate == C11QG.LIZ) {
                return;
            }
            this.LL.onError(thTerminate);
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        try {
            C11IV c11ivApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(c11ivApply, "The mapper returned a null CompletableSource");
            C11IV c11iv = c11ivApply;
            C19487611Mc c19487611Mc = new C19487611Mc(this);
            while (true) {
                C19487611Mc c19487611Mc2 = this.LLILZIL.get();
                if (c19487611Mc2 != LLIZLLLIL) {
                    AtomicReference<C19487611Mc> atomicReference = this.LLILZIL;
                    while (!atomicReference.compareAndSet(c19487611Mc2, c19487611Mc)) {
                        if (atomicReference.get() != c19487611Mc2) {
                            break;
                        }
                    }
                    if (c19487611Mc2 != null) {
                        C11JE.dispose(c19487611Mc2);
                    }
                    c11iv.LIZIZ(c19487611Mc);
                    return;
                }
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LLIZ.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLIZ, interfaceC420801kM)) {
            this.LLIZ = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C19487511Mb(C11IY c11iy, InterfaceC1487280oo2<? super T, ? extends C11IV> interfaceC1487280oo2, boolean z) {
        this.LL = c11iy;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = z;
    }
}
