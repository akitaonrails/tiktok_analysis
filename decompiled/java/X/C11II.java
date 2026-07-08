package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11II, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11II<T> extends AtomicReference<InterfaceC420801kM> implements C11IH<T>, InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 8571289934935992137L;
    public final C11IH<? super T> LL;
    public final C11RO LLILLJJLI;
    public T LLILLL;
    public Throwable LLILZ;

    @Override // X.C11IH
    public final void onComplete() {
        C11JE.replace(this, this.LLILLJJLI.LIZIZ(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Throwable th = this.LLILZ;
            if (th != null) {
                this.LLILZ = null;
                this.LL.onError(th);
                return;
            }
            T t = this.LLILLL;
            if (t == null) {
                this.LL.onComplete();
            } else {
                this.LLILLL = null;
                this.LL.onSuccess(t);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!C2179971ATj.LIZ(th2)) {
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        this.LLILZ = th;
        C11JE.replace(this, this.LLILLJJLI.LIZIZ(this));
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        this.LLILLL = t;
        C11JE.replace(this, this.LLILLJJLI.LIZIZ(this));
    }

    public C11II(C11IH<? super T> c11ih, C11RO c11ro) {
        this.LL = c11ih;
        this.LLILLJJLI = c11ro;
    }
}
