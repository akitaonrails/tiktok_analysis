package X;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0953, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class AnonymousClass0953<E> extends C099D<Unit> implements C095E<E> {
    public final C095E<E> LLILZ;

    @Override // X.AnonymousClass0955
    public final void LIZJ(Function1<? super Throwable, Unit> function1) {
        this.LLILZ.LIZJ(function1);
    }

    @Override // X.AnonymousClass0955
    public final boolean LJ() {
        return this.LLILZ.LJ();
    }

    @Override // X.AnonymousClass0955
    public final Object LJIIIIZZ(E e) {
        return this.LLILZ.LJIIIIZZ(e);
    }

    @Override // X.AnonymousClass0954
    public final InterfaceC2192541ArU<C094N<E>> LJIIIZ() {
        return this.LLILZ.LJIIIZ();
    }

    @Override // X.AnonymousClass0954
    public final Object LJIIJ() {
        return this.LLILZ.LJIIJ();
    }

    @Override // X.AnonymousClass0955
    public final boolean LJIIJJI(Throwable th) {
        return this.LLILZ.LJIIJJI(th);
    }

    @Override // X.AnonymousClass0954
    public final Object LJIILIIL(InterfaceC1364105Vn<? super E> interfaceC1364105Vn) {
        return this.LLILZ.LJIILIIL(interfaceC1364105Vn);
    }

    @Override // X.AnonymousClass0954
    public final InterfaceC2192541ArU<E> LJIILJJIL() {
        return this.LLILZ.LJIILJJIL();
    }

    @Override // X.AnonymousClass0954
    public final Object LJIJ(InterfaceC1364105Vn<? super C094N<? extends E>> interfaceC1364105Vn) {
        Object objLJIJ = this.LLILZ.LJIJ(interfaceC1364105Vn);
        C099R.LJFF();
        return objLJIJ;
    }

    @Override // X.AnonymousClass0955
    public final Object LJIJI(E e, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return this.LLILZ.LJIJI(e, interfaceC1364105Vn);
    }

    @Override // X.AnonymousClass0954
    public final InterfaceC824740WWy<E> iterator() {
        return this.LLILZ.iterator();
    }

    @Override // kotlinx.coroutines.JobSupport, X.C09AE, X.AnonymousClass0954
    public final void LIZIZ(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C2239308pz(LJJIJIL(), null, this);
        }
        LJJIJIIJI(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void LJJIJIIJI(Throwable th) {
        CancellationException cancellationException = (CancellationException) th;
        this.LLILZ.LIZIZ(cancellationException);
        LJJIIZI(cancellationException);
    }

    public AnonymousClass0953(CoroutineContext coroutineContext, C1DEK c1dek) {
        super(coroutineContext, true, true);
        this.LLILZ = c1dek;
    }
}
