package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.IdTabPowerCell;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.MixStudioIdDropdownViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS92S0201000_6;

/* JADX INFO: renamed from: X.0HRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441190HRt extends C1391540mJc implements LifecycleOwner, InterfaceC724530SbT {
    public final LifecycleRegistry LLIZ;
    public final LifecycleRegistry LLIZLLLIL;
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public AnonymousClass0956 LLJIJIL;
    public boolean LLJILJIL;
    public final C441230HRx LLJILJILJ;
    public final C1826520xdC LLJILLL;
    public final ViewOnAttachStateChangeListenerC20604515jv LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public C0HRP LLJJIJI;

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

    public final MixStudioIdDropdownViewModel LJIIL() {
        return (MixStudioIdDropdownViewModel) this.LLJ.getValue();
    }

    @Override // X.C1391540mJc
    public final String LJIIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("min(wrap_content,");
        sbLIZ.append(((Number) this.LLJJIII.getValue()).intValue());
        sbLIZ.append("px)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1391540mJc
    public final String LJIIJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("min(max(");
        sbLIZ.append(((Number) this.LLJJI.getValue()).intValue());
        sbLIZ.append("px,200dp),screen.width-32dp)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C441190HRt(Context context) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        super(context);
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.LLIZ = lifecycleRegistry;
        this.LLIZLLLIL = lifecycleRegistry;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioIdDropdownViewModel.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(320);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
        if (this instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        this.LLJ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS236S0000000_6, null, null, null);
        this.LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(265));
        C441230HRx c441230HRx = new C441230HRx();
        this.LLJILJILJ = c441230HRx;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addOnAttachStateChangeListener(new C0IDR(this, 5));
        C1826520xdC c1826520xdC = new C1826520xdC(context, null, 6);
        c1826520xdC.setOnSelectedChangeListener(new InterfaceC1119310fEX() { // from class: X.0HRQ
            @Override // X.InterfaceC1119310fEX
            public final void LIZ(int i, boolean z) {
                MixStudioIdDropdownViewModel mixStudioIdDropdownViewModelLJIIL;
                C0HRL c0hrl;
                if (z && (c0hrl = (mixStudioIdDropdownViewModelLJIIL = this.LIZ.LJIIL()).LLILLJJLI) != null) {
                    mixStudioIdDropdownViewModelLJIIL.withState(new AwS92S0201000_6(i, c0hrl, mixStudioIdDropdownViewModelLJIIL, 2));
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        layoutParams.gravity = 17;
        linearLayout.addView(c1826520xdC, layoutParams);
        this.LLJILLL = c1826520xdC;
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context, 0, false));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(IdTabPowerCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        final C20635915oz c20635915oz = new C20635915oz();
        c20635915oz.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0HRO
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                RecyclerView.LayoutManager layoutManager;
                View viewLJFF;
                if (i != 0 || (layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()) == null || (viewLJFF = c20635915oz.LJFF(layoutManager)) == null) {
                    return;
                }
                int position = layoutManager.getPosition(viewLJFF);
                MixStudioIdDropdownViewModel mixStudioIdDropdownViewModelLJIIL = this.LJIIL();
                C0HRL c0hrl = mixStudioIdDropdownViewModelLJIIL.LLILLJJLI;
                if (c0hrl != null) {
                    mixStudioIdDropdownViewModelLJIIL.withState(new AwS92S0201000_6(position, c0hrl, mixStudioIdDropdownViewModelLJIIL, 2));
                }
            }
        });
        ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jv.getAdapter()).LLLLII(c441230HRx, C441230HRx.class);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        linearLayout.addView(viewOnAttachStateChangeListenerC20604515jv, layoutParams2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C441200HRu(this, viewOnAttachStateChangeListenerC20604515jv, null), 3);
        this.LLJJ = viewOnAttachStateChangeListenerC20604515jv;
        this.LLJJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(264));
        this.LLJJIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(263));
        this.LLILZIL = linearLayout;
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
