package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19483911Kr<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, InterfaceC420801kM, Runnable {
    public static final long serialVersionUID = 7000911171163930287L;
    public final InterfaceC19474811He<? super T> LL;
    public final C19484811La LLILLJJLI = new C19484811La();
    public final InterfaceC19473011Gm<? extends T> LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LLILLL.LIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
        this.LL.onSuccess(t);
    }

    public RunnableC19483911Kr(InterfaceC19474811He<? super T> interfaceC19474811He, InterfaceC19473011Gm<? extends T> interfaceC19473011Gm) {
        this.LL = interfaceC19474811He;
        this.LLILLL = interfaceC19473011Gm;
    }
}
