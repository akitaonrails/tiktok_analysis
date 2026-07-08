package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11O4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11O4<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<T>, InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 786994795061867455L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RN LLILZ;
    public InterfaceC420801kM LLILZIL;
    public volatile boolean LLILZLL;
    public boolean LLIZ;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLILZLL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZIL.dispose();
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ.isDisposed();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        this.LL.onComplete();
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLIZ) {
            C19489211Ms.LIZIZ(th);
            return;
        }
        this.LLIZ = true;
        this.LL.onError(th);
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (!this.LLILZLL && !this.LLIZ) {
            this.LLILZLL = true;
            this.LL.onNext(t);
            InterfaceC420801kM interfaceC420801kM = get();
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            C11JE.replace(this, this.LLILZ.LIZJ(this, this.LLILLJJLI, this.LLILLL));
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILZIL, interfaceC420801kM)) {
            this.LLILZIL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11O4(C11PI c11pi, long j, TimeUnit timeUnit, C11RN c11rn) {
        this.LL = c11pi;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11rn;
    }
}
