package X;

import Y.ACListenerS146S0100000_11;
import Y.AObserverS176S0200000_11;
import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SOO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SOO extends ConstraintLayout implements InterfaceC724530SbT {
    public final C0SRL LL;
    public final C0N0Y LLILLJJLI;

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LL.LJIIL();
    }

    public TuxIconView h0() {
        return this.LL.LJI();
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final C0SRL getPostModeModel() {
        return this.LL;
    }

    public final void e0(View view) {
        if (C10IT.LJIIIZ(this.LL.LIZJ)) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131839802);
            c1389890mGx.LJIIJJI();
        } else {
            PostModeFullPageViewModel postModeFullPageViewModel = this.LL.LJIIIZ;
            if (postModeFullPageViewModel != null) {
                C736680Sv4.LJIJJLI(postModeFullPageViewModel, new AwS377S0200000_11(this, view, 145));
            }
        }
    }

    public final void i0(View view, boolean z) {
        String str;
        TuxIconView tuxIconView = (TuxIconView) view;
        PostModeDetailParams postModeDetailParams = this.LL.LJII;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        boolean z2 = false;
        if (Intrinsics.LJFF(str, "homepage_explore") && ((Boolean) C04V1.LIZ.getValue()).booleanValue()) {
            z2 = true;
        }
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
            c419910GdJ.LJ = numValueOf;
            if (z2) {
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            tuxIconView.setTuxIcon(c419910GdJ);
        } else {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_speaker_2_fill_ltr;
            c419910GdJ2.LJ = numValueOf;
            if (z2) {
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            tuxIconView.setTuxIcon(c419910GdJ2);
            if (this.LL.LIZJ()) {
                C1065320dpS.LIZ.getClass();
                Context contextLIZLLL = this.LL.LIZLLL();
                if (C0SCA.LIZ == null) {
                    C0SCA.LIZ = new C1AMU(contextLIZLLL);
                }
                C1AMU c1amu = C0SCA.LIZ;
                if (c1amu != null) {
                    c1amu.LIZIZ(contextLIZLLL);
                }
                this.LL.LJIJJLI();
            }
        }
        if (z2) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zf);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            return;
        }
        tuxIconView.setBackgroundResource(R.drawable.cwg);
    }

    public C0SOO(Context context, C0SRL c0srl, C0N0Y c0n0y) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        Boolean boolLIZ;
        super(context);
        this.LL = c0srl;
        this.LLILLJJLI = c0n0y;
        PostModeDetailParams postModeDetailParams = c0srl.LJII;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "homepage_explore") && C04WA.LIZ() && (boolLIZ = C1322805Fq.LIZ()) != null) {
            PostModePageViewModel postModePageViewModel = c0srl.LJIIIIZZ;
            postModePageViewModel.LLLLIILL = false;
            postModePageViewModel.AQ2(boolLIZ.booleanValue());
        }
        TuxIconView tuxIconViewH0 = h0();
        Aweme aweme = c0srl.LIZJ;
        if (aweme != null && C720360SNm.LJIIIZ(aweme)) {
            if (tuxIconViewH0 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewH0, 8);
                return;
            }
            return;
        }
        if (tuxIconViewH0 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconViewH0, 0);
            layoutParams = tuxIconViewH0.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
        } else {
            marginLayoutParams = null;
        }
        if (tuxIconViewH0 != null) {
            C786410Ut5.M6(tuxIconViewH0, marginLayoutParams);
            if (isRtl()) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.hc(tuxIconViewH0, f);
            C786410Ut5.a9(tuxIconViewH0, new ACListenerS146S0100000_11(this, 80));
        }
        boolean zLJIIIZ = C10IT.LJIIIZ(c0srl.LIZJ);
        if (!c0srl.LJIIIIZZ.LLLLIILLL && !zLJIIIZ) {
            if (tuxIconViewH0 != null) {
                i0(tuxIconViewH0, false);
            }
        } else if (tuxIconViewH0 != null) {
            i0(tuxIconViewH0, true);
        }
        c0srl.LJIIIIZZ.LLJJJJ.observe(this, new AObserverS176S0200000_11(tuxIconViewH0, this, 7));
        PostModeDetailParams postModeDetailParams2 = c0srl.LJII;
        if (!Intrinsics.LJFF(postModeDetailParams2 != null ? postModeDetailParams2.eventType : null, "homepage_explore") || !((Boolean) C04V1.LIZ.getValue()).booleanValue() || tuxIconViewH0 == null) {
            return;
        }
        HandlerHook.viewPost(tuxIconViewH0, new ARunnableS78S0200000_9(tuxIconViewH0, this, 92));
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
