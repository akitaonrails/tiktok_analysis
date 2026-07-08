package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19481111Jp<T> extends AtomicInteger implements C11IH<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 4109457741734051389L;
    public final C11IH<? super T> LL;
    public final InterfaceC781210Ukh LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    public final void LIZ() throws Throwable {
        if (compareAndSet(0, 1)) {
            try {
                this.LLILLJJLI.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                C19489211Ms.LIZIZ(th);
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() throws Throwable {
        this.LLILLL.dispose();
        LIZ();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.C11IH
    public final void onComplete() throws Throwable {
        this.LL.onComplete();
        LIZ();
    }

    @Override // X.C11IH
    public final void onError(Throwable th) throws Throwable {
        this.LL.onError(th);
        LIZ();
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11IH
    public final void onSuccess(T t) throws Throwable {
        this.LL.onSuccess(t);
        LIZ();
    }

    public C19481111Jp(C11IH<? super T> c11ih, InterfaceC781210Ukh interfaceC781210Ukh) {
        this.LL = c11ih;
        this.LLILLJJLI = interfaceC781210Ukh;
    }
}
