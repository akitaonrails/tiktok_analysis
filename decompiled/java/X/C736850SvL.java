package X;

import X.InterfaceC0148002o;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736850SvL<S extends InterfaceC0148002o> implements InterfaceC736830SvJ<S> {
    public volatile boolean LIZ;
    public InterfaceC497601wk LIZIZ;
    public S LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1349));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1348));

    public final InterfaceC736830SvJ<S> LIZIZ() {
        return this.LIZ ? (C11H4) this.LJ.getValue() : (C19473711Gt) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJIIJIL() {
        LIZIZ().LJJIJIIJIL();
    }

    @Override // X.InterfaceC736830SvJ
    public final S getState() {
        return (S) LIZIZ().getState();
    }

    @Override // X.InterfaceC736830SvJ
    public final void LIZ(Function1<? super S, ? extends S> function1) {
        LIZIZ().LIZ(function1);
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJIL(Function1<? super S, Unit> function1) {
        LIZIZ().LJJIJIL(function1);
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJL(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIZ(InterfaceC497601wk interfaceC497601wk) {
        this.LIZIZ = interfaceC497601wk;
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJJI(S s) {
        this.LIZJ = s;
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJJJIZL(Function1<? super S, ? extends S> function1) {
        LIZIZ().LJJJJIZL(function1);
    }

    @Override // X.InterfaceC736830SvJ
    public final C0ZP4 LJJJJ(LifecycleOwner lifecycleOwner, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super S, Unit> function12) {
        return LIZIZ().LJJJJ(lifecycleOwner, c1770850wBP, function1, interfaceC1790830whd, function0, function12);
    }

    @Override // X.InterfaceC736830SvJ
    public final <A> C0ZP4 LJJIJLIJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, Function1<? super A, Unit> function12) {
        return LIZIZ().LJJIJLIJ(lifecycleOwner, interfaceC2217241BqE, c1770850wBP, interfaceC1790830whd, function0, function1, function12);
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B> C0ZP4 LJJJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, Function2<? super A, ? super B, Unit> function2) {
        return LIZIZ().LJJJ(lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, c1770850wBP, interfaceC1790830whd, function0, function1, function2);
    }

    @Override // X.InterfaceC736830SvJ
    public final C0ZP4 LJJJJI(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE interfaceC2217241BqE, C1770850wBP c1770850wBP, C736800SvG c736800SvG, Function0 function0, Function1 function1, Function0 function02, Function1 function12) {
        return LIZIZ().LJJJJI(lifecycleOwner, interfaceC2217241BqE, c1770850wBP, c736800SvG, function0, function1, function02, function12);
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C> C0ZP4 LJJIL(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super A, ? super B, ? super C, Unit> interfaceC1631620sYq) {
        return LIZIZ().LJJIL(lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, interfaceC1790830whd, function0, function1, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C, D> C0ZP4 LJJJIL(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super A, ? super B, ? super C, ? super D, Unit> interfaceC1631630sYr) {
        return LIZIZ().LJJJIL(lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, interfaceC1790830whd, function0, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C, D, E> C0ZP4 LJJJJJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685420txc) {
        return LIZIZ().LJJJJJ(lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, interfaceC1790830whd, function0, function1, interfaceC1685420txc);
    }
}
