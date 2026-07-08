package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19480211Jg<T, R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -5843758257109742742L;
    public final C11IH<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C11ID<? extends R>> LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        this.LL.onError(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) throws Throwable {
        try {
            C11ID<? extends R> c11idApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(c11idApply, "The mapper returned a null MaybeSource");
            C11ID<? extends R> c11id = c11idApply;
            if (!isDisposed()) {
                final C11IH<? super R> c11ih = this.LL;
                c11id.LIZ(new C11IH<R>(this, c11ih) { // from class: X.11Ji
                    public final AtomicReference<InterfaceC420801kM> LL;
                    public final C11IH<? super R> LLILLJJLI;

                    @Override // X.C11IH
                    public final void onComplete() {
                        this.LLILLJJLI.onComplete();
                    }

                    @Override // X.C11IH
                    public final void onError(Throwable th) {
                        this.LLILLJJLI.onError(th);
                    }

                    @Override // X.C11IH
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        C11JE.replace(this.LL, interfaceC420801kM);
                    }

                    @Override // X.C11IH
                    public final void onSuccess(R r) {
                        this.LLILLJJLI.onSuccess(r);
                    }

                    {
                        this.LL = this;
                        this.LLILLJJLI = c11ih;
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            onError(th);
        }
    }

    public C19480211Jg(C11IH<? super R> c11ih, InterfaceC1487280oo2<? super T, ? extends C11ID<? extends R>> interfaceC1487280oo2) {
        this.LL = c11ih;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
