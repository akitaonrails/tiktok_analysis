package X;

import Y.ACListenerS85S0300000_19;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS297S0300000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258010iqF implements InterfaceC724530SbT {
    public final AwemePagerVM LL;
    public final View LLILLJJLI;
    public final Context LLILLL;
    public final String LLILZ;
    public final User LLILZIL;
    public final Aweme LLILZLL;
    public final Lifecycle LLIZ;
    public C0P0T LLIZLLLIL;

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

    public final boolean LIZJ() {
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLII() && this.LLILLL.getResources().getConfiguration().orientation == 2;
    }

    public final void LIZ() {
        C1257530ipT c1257530ipT;
        EnumC1257740ipo buttonState = null;
        if (LIZJ()) {
            C1391550mJd c1391550mJd = new C1391550mJd(this.LLILLL);
            c1391550mJd.LJII(R.attr.zh);
            View view = this.LLILLJJLI;
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391550mJd.LJIIIZ(true, null);
            c1391550mJd.LLILLJJLI.LJ = 200;
            View viewLIZIZ = LIZIZ(this.LLILLL, this.LL);
            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
            c1391600mJi2.LJIIZILJ = viewLIZIZ;
            c1391600mJi2.LJIJJ = true;
            c1391600mJi2.LJII = -1001L;
            c1391550mJd.LIZJ(new AwS598S0100000_19(this, 860));
            this.LLIZLLLIL = c1391550mJd.LIZIZ();
            if (this.LLILLJJLI.isSelected()) {
                C0P0T c0p0t = this.LLIZLLLIL;
                if (c0p0t != null) {
                    c0p0t.dismiss();
                    return;
                }
                return;
            }
            C0P0T c0p0t2 = this.LLIZLLLIL;
            if (c0p0t2 != null) {
                c0p0t2.show();
            }
            this.LLILLJJLI.setSelected(true);
            return;
        }
        View view2 = this.LLILLJJLI;
        C1257530ipT c1257530ipT2 = view2 instanceof C1257530ipT ? (C1257530ipT) view2 : null;
        C1391550mJd c1391550mJd2 = new C1391550mJd(this.LLILLL);
        c1391550mJd2.LJII(R.attr.zh);
        View view3 = this.LLILLJJLI;
        C1391600mJi c1391600mJi3 = c1391550mJd2.LLILLJJLI;
        c1391600mJi3.LIZIZ = view3;
        c1391600mJi3.LIZLLL = EnumC1235690iGF.BOTTOM;
        c1391550mJd2.LJIIIZ(true, null);
        c1391550mJd2.LLILLJJLI.LJ = 10;
        View viewLIZIZ2 = LIZIZ(this.LLILLL, this.LL);
        C1391600mJi c1391600mJi4 = c1391550mJd2.LLILLJJLI;
        c1391600mJi4.LJIIZILJ = viewLIZIZ2;
        c1391600mJi4.LJIJJ = true;
        c1391600mJi4.LJII = -1001L;
        c1391550mJd2.LIZJ(new AwS598S0100000_19(c1257530ipT2, 861));
        this.LLIZLLLIL = c1391550mJd2.LIZIZ();
        View view4 = this.LLILLJJLI;
        if ((view4 instanceof C1257530ipT) && (c1257530ipT = (C1257530ipT) view4) != null) {
            buttonState = c1257530ipT.getButtonState();
        }
        if (buttonState == EnumC1257740ipo.INITIAL) {
            C0P0T c0p0t3 = this.LLIZLLLIL;
            if (c0p0t3 != null) {
                c0p0t3.show();
                return;
            }
            return;
        }
        C0P0T c0p0t4 = this.LLIZLLLIL;
        if (c0p0t4 != null) {
            c0p0t4.dismiss();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZ;
    }

    public final View LIZIZ(Context context, AwemePagerVM awemePagerVM) {
        int i;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        if (LIZJ()) {
            i = R.layout.ej0;
        } else {
            C267430Adx.LIZ.getClass();
            if (C267430Adx.LIZ()) {
                i = R.layout.eiu;
            } else {
                i = R.layout.eiz;
            }
        }
        View viewSd = C786410Ut5.Sd(i, layoutInflaterNe, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C0H9H.LIZIZ(129), C0H9H.LIZIZ(82));
        C267430Adx.LIZ.getClass();
        if (!C267430Adx.LIZ()) {
            C786410Ut5.W5(viewSd, layoutParams);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        viewSd.setBackground(c384050F3z.LIZ(context));
        ((TextView) viewSd.findViewById(R.id.update_date_text)).setText(2131848602);
        ((TextView) viewSd.findViewById(R.id.oly)).setText(2131848601);
        C267430Adx.LIZ();
        View viewFindViewById = viewSd.findViewById(R.id.update_date_item);
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.update_date_tick);
        C267430Adx.LIZ();
        View viewFindViewById2 = viewSd.findViewById(R.id.olx);
        TuxIconView tuxIconView2 = (TuxIconView) viewSd.findViewById(R.id.olz);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C736680Sv4.LJIIIIZZ(this, awemePagerVM, new C2217381BqS() { // from class: X.0ipx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1158970gGV) obj).LLILLJJLI);
            }
        }, null, new AwS297S0300000_19(tuxIconView, (TuxIconView) c259800zU, (C259800zU<String>) tuxIconView2, (TuxIconView) 18), 6);
        C786410Ut5.I7(new ACListenerS85S0300000_19(awemePagerVM, this, c259800zU, 27), viewFindViewById);
        C786410Ut5.I7(new ACListenerS85S0300000_19(awemePagerVM, this, c259800zU, 28), viewFindViewById2);
        return viewSd;
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

    public C1258010iqF(AwemePagerVM awemePagerVM, View view, Context context, String str, User user, Aweme aweme) {
        Lifecycle lifecycle = awemePagerVM.getLifecycle();
        this.LL = awemePagerVM;
        this.LLILLJJLI = view;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = user;
        this.LLILZLL = aweme;
        this.LLIZ = lifecycle;
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
