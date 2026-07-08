package X;

import Y.ARunnableS36S0300000_3;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserPopupVM;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1168350gVd implements InterfaceC1072780e1U, InterfaceC724530SbT, InterfaceC1261750iwH {
    public AbstractC1262620ixg LL;
    public TuxIconView LLILLL;
    public RecUserPopupVM LLILZIL;
    public C19EG LLILZLL;
    public boolean LLIZLLLIL;
    public Function1<? super C1075800e6M, Unit> LLJ;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public boolean LLILZ = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2577));
    public String LLJI = "";
    public final CopyOnWriteArrayList<Function0<Unit>> LLJIJIL = new CopyOnWriteArrayList<>();

    public abstract void LIZ(C19EG c19eg, Bundle bundle);

    @Override // X.InterfaceC1072780e1U
    public final void destroy() {
        this.LLJ = null;
        LJIILIIL(new AwS562S0100000_18(this, 2575));
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final AbstractC1262620ixg LIZIZ() {
        AbstractC1262620ixg abstractC1262620ixg = this.LL;
        if (abstractC1262620ixg != null) {
            return abstractC1262620ixg;
        }
        return null;
    }

    public final RecUserPopupVM LIZJ() {
        RecUserPopupVM recUserPopupVM = this.LLILZIL;
        if (recUserPopupVM != null) {
            return recUserPopupVM;
        }
        return null;
    }

    @Override // X.InterfaceC1072780e1U
    public final void LIZLLL() {
        LJIILIIL(new AwS562S0100000_18(this, 2576));
    }

    @Override // X.InterfaceC1072780e1U
    public final void LJI() {
        LJIILIIL(new AwS562S0100000_18(this, 2578));
    }

    @Override // X.InterfaceC1072780e1U
    public final C1075800e6M LJII() {
        if (this.LL != null) {
            return LIZIZ().getCurrentState();
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        C19EG c19eg = this.LLILZLL;
        if (c19eg == null) {
            c19eg = null;
        }
        return c19eg.getLifecycle();
    }

    @Override // X.InterfaceC1072780e1U
    public final void LJ(InterfaceC1261750iwH interfaceC1261750iwH) {
        LJIILIIL(new AwS419S0200000_18(this, interfaceC1261750iwH, 137));
    }

    @Override // X.InterfaceC1072780e1U
    public final void LJIIIZ(String str) {
        LJIILIIL(new AwS167S1100000_18(this, str, 19));
        this.LLJI = str;
    }

    @Override // X.InterfaceC1072780e1U
    public final void LJIIJJI(Function1<? super C1075800e6M, Unit> function1) {
        this.LLJ = function1;
    }

    public final void LJIILIIL(Function0<Unit> function0) {
        if (this.LLILLJJLI.get()) {
            function0.invoke();
        } else {
            this.LLJIJIL.add(function0);
        }
    }

    @Override // X.InterfaceC1072780e1U
    public final void LJIIJ(C19EG c19eg, Bundle bundle) {
        this.LLILZLL = c19eg;
        this.LLJI = bundle.getString("enter_from", "");
        if (bundle.getBoolean("use_async_init", false)) {
            C823050WQl.LIZJ().execute(new ARunnableS36S0300000_3(this, c19eg, bundle, 7));
        } else {
            LIZ(c19eg, bundle);
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
