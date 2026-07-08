package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS401S0200000_35;

/* JADX INFO: renamed from: X.1DEW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEW implements InterfaceC20236714Gf<Unit>, C1DEG {
    public final C2252611DEt<Unit> LL;
    public final Object LLILLJJLI;
    public final /* synthetic */ C1DEV LLILLL;

    @Override // X.C1DEG
    public final void LIZLLL(C1DET<?> c1det, int i) {
        this.LL.LIZLLL(c1det, i);
    }

    @Override // X.InterfaceC20236714Gf
    public final void LJIIL(Object obj) {
        this.LL.LJIIL(obj);
    }

    @Override // X.InterfaceC20236714Gf
    public final void LJJII(Function1<? super Throwable, Unit> function1) {
        this.LL.LJJII(function1);
    }

    @Override // X.InterfaceC20236714Gf
    public final boolean LJJIIZ(Throwable th) {
        return this.LL.LJJIIZ(th);
    }

    @Override // X.InterfaceC20236714Gf
    public final C09AU LJJIJ(Throwable th) {
        return this.LL.LJJIJ(th);
    }

    @Override // X.InterfaceC20236714Gf
    public final boolean isActive() {
        return this.LL.isActive();
    }

    @Override // X.InterfaceC20236714Gf
    public final boolean isCancelled() {
        return this.LL.isCancelled();
    }

    @Override // X.InterfaceC20236714Gf
    public final boolean isCompleted() {
        return this.LL.isCompleted();
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        this.LL.resumeWith(obj);
    }

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return this.LL.LLILZIL;
    }

    @Override // X.InterfaceC20236714Gf
    public final void LJIL(AbstractC2252651DEx abstractC2252651DEx, Unit unit) {
        this.LL.LJIL(abstractC2252651DEx, unit);
    }

    @Override // X.InterfaceC20236714Gf
    public final void LJJIFFI(Function1 function1, Object obj) {
        C1DEV.LJII.set(this.LLILLL, this.LLILLJJLI);
        this.LL.LJJIFFI(new AwS401S0200000_35(this.LLILLL, this, 72), obj);
    }

    @Override // X.InterfaceC20236714Gf
    public final C09AU LJJIIJZLJL(Function1 function1, Object obj) {
        C09AU c09auLJJIJIL = this.LL.LJJIJIL(new AwS401S0200000_35(this.LLILLL, this, 73), obj);
        if (c09auLJJIJIL != null) {
            C1DEV.LJII.set(this.LLILLL, this.LLILLJJLI);
        }
        return c09auLJJIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1DEW(C1DEV c1dev, C2252611DEt<? super Unit> c2252611DEt, Object obj) {
        this.LLILLL = c1dev;
        this.LL = c2252611DEt;
        this.LLILLJJLI = obj;
    }
}
