package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19480511Jj<T, R> extends AtomicReference<InterfaceC420801kM> implements C11IH<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 4375739915521278546L;
    public final C11IH<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C11ID<? extends R>> LLILLJJLI;
    public InterfaceC420801kM LLILLL;

    @Override // X.C11IH
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
        this.LLILLL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        this.LL.onError(th);
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
        try {
            C11ID<? extends R> c11idApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(c11idApply, "The mapper returned a null MaybeSource");
            C11ID<? extends R> c11id = c11idApply;
            if (!isDisposed()) {
                c11id.LIZ(new C11IH<R>() { // from class: X.11Jl
                    @Override // X.C11IH
                    public final void onComplete() {
                        this.LL.LL.onComplete();
                    }

                    @Override // X.C11IH
                    public final void onError(Throwable th) {
                        this.LL.LL.onError(th);
                    }

                    @Override // X.C11IH
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        C11JE.setOnce(this.LL, interfaceC420801kM);
                    }

                    @Override // X.C11IH
                    public final void onSuccess(R r) {
                        this.LL.LL.onSuccess(r);
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C11SP.LIZ(e);
            this.LL.onError(e);
        }
    }

    public C19480511Jj(C11IH<? super R> c11ih, InterfaceC1487280oo2<? super T, ? extends C11ID<? extends R>> interfaceC1487280oo2) {
        this.LL = c11ih;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
