package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.FacebookMaFCell;
import com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074580e4O extends AbstractC1074460e4C implements InterfaceC724530SbT, InterfaceC19341710lj {
    public C03DU LL;
    public View LLILLJJLI;
    public C481090Itn LLILLL;
    public C1749280vcc LLILZ;
    public C1749280vcc LLILZIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C1074450e4B LLJIJIL;
    public FacebookMaFWidgetVM LLJILJILJ;
    public Function0<Boolean> LLJILLL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 487));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(237));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 485));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 486));
    public final C1074550e4L LLJILJIL = new C1074550e4L(FacebookMaFCell.class);

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

    public final void LIZIZ() {
        C1749280vcc c1749280vcc = this.LLILZ;
        if (c1749280vcc != null) {
            C1074450e4B c1074450e4B = this.LLJIJIL;
            if (c1074450e4B == null) {
                c1074450e4B = null;
            }
            C1722300uv6 c1722300uv6 = c1074450e4B.LJI;
            if (c1722300uv6 == null) {
                c1722300uv6 = new C1722300uv6();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_facebook_circle;
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                c1722300uv6.LIZLLL = iLIZIZ;
                c1722300uv6.LJ = iLIZIZ2;
                c1722300uv6.LJI = C20642515q3.LJI(2131834676);
                c1722300uv6.LJIIIIZZ = C20642515q3.LJI(2131834675);
                c1722300uv6.LJIIIZ = new AwS595S0100000_16(this, 126);
            }
            c1749280vcc.setStatus(c1722300uv6);
            C786410Ut5.LJLLLLLL(0, c1749280vcc);
            C481090Itn c481090Itn = this.LLILLL;
            if (c481090Itn != null) {
                C786410Ut5.LJLLLLLL(8, c481090Itn);
            }
        }
    }

    public final void LIZJ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1074450e4B c1074450e4B = this.LLJIJIL;
        if (c1074450e4B == null) {
            c1074450e4B = null;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1074450e4B.LJIIIIZZ ? 79 : 96)));
        C1074450e4B c1074450e4B2 = this.LLJIJIL;
        if (c1074450e4B2 == null) {
            c1074450e4B2 = null;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1074450e4B2.LJIIIIZZ ? 107 : 130)));
        C1074450e4B c1074450e4B3 = this.LLJIJIL;
        if (c1074450e4B3 == null) {
            c1074450e4B3 = null;
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1074450e4B3.LJIIIIZZ ? 124 : 157)));
        C1749280vcc c1749280vcc = this.LLILZIL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n7;
            C1074450e4B c1074450e4B4 = this.LLJIJIL;
            if (c1074450e4B4 == null) {
                c1074450e4B4 = null;
            }
            Drawable drawableLIZ = c0hti.LIZ(c1074450e4B4.LIZ);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LIZLLL = iLIZIZ2;
            c1722300uv6.LJ = iLIZIZ;
            C1074450e4B c1074450e4B5 = this.LLJIJIL;
            if (c1074450e4B5 == null) {
                c1074450e4B5 = null;
            }
            c1722300uv6.LJIIIIZZ = c1074450e4B5.LIZ.getString(2131839069);
            c1749280vcc.setStatus(c1722300uv6);
            c1749280vcc.setLayoutVariant(1);
            c1749280vcc.setTopMargin(C418440Gaw.LIZIZ(0));
            c1749280vcc.getLayoutParams().height = iLIZIZ3;
            ViewGroup.LayoutParams layoutParams = c1749280vcc.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMargins(0, (int) (((double) ((Number) this.LLILZLL.getValue()).intValue()) * 0.07d), 0, (int) (((double) ((Number) this.LLILZLL.getValue()).intValue()) * 0.09d));
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
    }

    @Override // X.InterfaceC19341710lj
    public final void LJFF() {
        Function0<Boolean> function0 = this.LLJILLL;
        if (function0 == null || !function0.invoke().booleanValue()) {
            FacebookMaFWidgetVM facebookMaFWidgetVM = this.LLJILJILJ;
            if (facebookMaFWidgetVM == null) {
                facebookMaFWidgetVM = null;
            }
            if (facebookMaFWidgetVM.getState().LL instanceof C1623706Xj) {
                return;
            }
            facebookMaFWidgetVM.setState(AFwS252S0000000_16.get$arr$(3));
            C23250099c.LIZLLL(facebookMaFWidgetVM.getAssemVMScope(), facebookMaFWidgetVM.LLILLL, null, new C1074440e4A(facebookMaFWidgetVM, null), 2);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        FacebookMaFWidgetVM facebookMaFWidgetVM = this.LLJILJILJ;
        if (facebookMaFWidgetVM == null) {
            facebookMaFWidgetVM = null;
        }
        return facebookMaFWidgetVM.getLifecycle();
    }

    public final void LIZ(C1074450e4B c1074450e4B) {
        if (c1074450e4B.LJ) {
            C1074550e4L c1074550e4L = this.LLJILJIL;
            View view = this.LLILLJJLI;
            c1074550e4L.getClass();
            if (view != null && Intrinsics.LJFF(view.getTag(-1001), Boolean.TRUE)) {
                return;
            }
            if (c1074550e4L.LLILLL) {
                c1074550e4L.LIZ(view);
            } else {
                c1074550e4L.LLJIJIL = view;
            }
            if (view == null) {
                return;
            }
            view.setTag(-1001, Boolean.TRUE);
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
