package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: renamed from: X.0PS8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PS8 implements InterfaceC644870PRd, InterfaceC724530SbT {
    public View LL;
    public SearchTopBarAssemViewModel LLILLJJLI;
    public SearchHubNativeViewModel LLILLL;
    public C0ZP4 LLILZ;
    public EntityCardTitle LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(481));
    public Fragment LLIZ;

    @Override // X.InterfaceC644870PRd
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC644870PRd
    public final boolean LJI(boolean z, EntityCardTitle entityCardTitle) {
        return false;
    }

    @Override // X.InterfaceC644870PRd
    public final void LJII() {
        SearchTopBarAssemViewModel searchTopBarAssemViewModel = this.LLILLJJLI;
        this.LLILZ = searchTopBarAssemViewModel != null ? C736680Sv4.LJIIIIZZ(this, searchTopBarAssemViewModel, new C2217381BqS() { // from class: X.0PS9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0PGR) obj).LLILZ;
            }
        }, null, new AwS624S0100000_10(this, 98), 6) : null;
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

    @Override // X.InterfaceC644870PRd
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC644870PRd
    public final void LIZIZ() {
        C0PSA c0psa = (C0PSA) this.LLILZLL.getValue();
        if (c0psa != null) {
            c0psa.LIZ();
        }
    }

    @Override // X.InterfaceC644870PRd
    public final void LIZJ() {
        C0ZP4 c0zp4 = this.LLILZ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLILZ = null;
        C0PSA c0psa = (C0PSA) this.LLILZLL.getValue();
        if (c0psa != null) {
            c0psa.LJFF();
        }
    }

    @Override // X.InterfaceC644870PRd
    public final int getHeight() {
        View view = this.LL;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycleRegistry;
        C01GW c01gw = C07EU.LIZ;
        if (C07EU.LIZIZ) {
            Fragment fragment = this.LLIZ;
            if (fragment != null) {
                lifecycleRegistry = fragment.getLifecycle();
            }
            return C0J3E.LL.getLifecycleRegistry();
        }
        lifecycleRegistry = C0J3E.LL.getLifecycleRegistry();
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        return C0J3E.LL.getLifecycleRegistry();
    }

    @Override // X.InterfaceC644870PRd
    public final View LJ() {
        return this.LL;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC644870PRd
    public final View LIZ(Context context, Fragment fragment, SearchTopBarAssemViewModel searchTopBarAssemViewModel, ViewGroup viewGroup, ViewGroup viewGroup2) {
        View viewLJIIIIZZ;
        this.LLIZ = fragment;
        this.LLILLJJLI = searchTopBarAssemViewModel;
        this.LLILLL = C654040Pl4.LIZ(fragment);
        C0PSA c0psa = (C0PSA) this.LLILZLL.getValue();
        if (c0psa != null) {
            viewLJIIIIZZ = c0psa.LJIIIIZZ(context, fragment, viewGroup2, new AwS589S0100000_10(this, 435));
        } else {
            viewLJIIIIZZ = null;
        }
        this.LL = viewLJIIIIZZ;
        return viewLJIIIIZZ;
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
