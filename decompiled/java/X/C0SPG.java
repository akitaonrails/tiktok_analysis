package X;

import Y.ACListenerS146S0100000_11;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS80S0200000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SPG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SPG implements C0SPJ, InterfaceC724530SbT {
    public final C0SRL LL;
    public final Lifecycle LLILLJJLI;
    public View LLILLL;

    public int LIZJ() {
        return R.layout.e_z;
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

    public void LIZLLL() {
        C19ME c19me;
        ViewStub viewStub;
        if (this.LLILLL != null) {
            return;
        }
        ViewGroup viewGroup = this.LL.LJFF;
        if (viewGroup != null && (viewStub = (ViewStub) viewGroup.findViewById(R.id.s0x)) != null) {
            C786410Ut5.LJLLLL(viewStub);
        }
        ViewGroup viewGroup2 = this.LL.LJFF;
        this.LLILLL = viewGroup2 != null ? viewGroup2.findViewById(R.id.s0w) : null;
        LJ();
        View view = this.LLILLL;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
            return;
        }
        c19me.endToStart = R.id.ltz;
        c19me.endToEnd = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJ() {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SPG.LJ():void");
    }

    public final void LJI() {
        View viewLIZIZ = C21146717pB.LIZIZ(this.LL.LIZLLL(), LIZJ(), this.LL.LIZLLL, false);
        ViewGroup viewGroup = this.LL.LIZLLL;
        if (viewGroup != null) {
            viewGroup.addView(viewLIZIZ);
        }
        C0SRL c0srl = this.LL;
        c0srl.LJFF = (ViewGroup) viewLIZIZ;
        PostModeDetailParams postModeDetailParams = c0srl.LJII;
        if (postModeDetailParams == null || !postModeDetailParams.quickShowDelayInitView) {
            LJII(viewLIZIZ);
            return;
        }
        View viewFindViewById = viewLIZIZ.findViewById(R.id.w28);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                C721640SSk c721640SSk = C721640SSk.LIZ;
                C19EG c19eg = this.LL.LIZIZ;
                c721640SSk.getClass();
                layoutParams.height = C721640SSk.LJIIIIZZ(c19eg);
            }
            viewFindViewById.requestLayout();
        }
        C10IT c10it = C10IT.LIZ;
        Aweme aweme = this.LL.LIZJ;
        c10it.getClass();
        LIZ(C10IT.LJIILJJIL(aweme));
        HandlerHook.viewPost(viewLIZIZ, new ARunnableS80S0200000_11(this, viewLIZIZ, 58));
    }

    public final void LJIIIIZZ() {
        Fragment fragment;
        View view;
        C0SRL c0srl = this.LL;
        if (c0srl.LIZJ == null || (fragment = c0srl.LIZ) == null || (view = fragment.getView()) == null) {
            return;
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        C0SRL c0srl2 = this.LL;
        Aweme aweme = c0srl2.LIZJ;
        C0SPA c0spa = C0SPA.LIZ;
        PostModeDetailParams postModeDetailParams = c0srl2.LJII;
        c0spa.getClass();
        String strLIZIZ = C0SPA.LIZIZ(postModeDetailParams);
        C0SRL c0srl3 = this.LL;
        PostModeDetailParams postModeDetailParams2 = c0srl3.LJII;
        c1er1.o(fragment, view, aweme, strLIZIZ, postModeDetailParams2 != null ? postModeDetailParams2.tabName : null, c0srl3.LJIIL.NR());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (C720360SNm.LJIIIZ(aweme) || C10IT.LJII(aweme) || !aweme.isCanPlay() || aweme.getMusic() == null) {
            return false;
        }
        return true;
    }

    @Override // X.C0SPJ
    public void LIZ(boolean z) {
        ViewGroup viewGroup;
        int iLIZ;
        int i;
        int i2;
        float f;
        int i3;
        C0SRL c0srl = this.LL;
        if (c0srl != null && (viewGroup = c0srl.LJFF) != null) {
            View view = this.LLILLL;
            int i4 = 8;
            if (view != null) {
                if (z) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                C786410Ut5.LJLLLLLL(i3, view);
            }
            View view2 = this.LLILLL;
            if (view2 != null) {
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                C786410Ut5.T4(view2, f);
            }
            View viewFindViewById = viewGroup.findViewById(R.id.y18);
            if (viewFindViewById != null) {
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                C786410Ut5.LJLLLLLL(i2, viewFindViewById);
            }
            TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.bnc);
            if (tuxIconView != null) {
                if (z) {
                    i = R.attr.ee;
                } else {
                    i = R.attr.a1h;
                }
                tuxIconView.setTintColorRes(i);
            }
            View viewFindViewById2 = viewGroup.findViewById(R.id.jjt);
            if (viewFindViewById2 != null) {
                if (z) {
                    iLIZ = 0;
                } else {
                    iLIZ = C960203pA.LIZ(R.attr.zm, viewGroup.getContext());
                }
                viewFindViewById2.setBackgroundColor(iLIZ);
            }
            if (!z) {
                i4 = 0;
            }
            C786410Ut5.LJLLLLLL(i4, viewGroup);
        }
    }

    public final void LJII(View view) {
        ViewGroup.LayoutParams layoutParams;
        View viewFindViewById = view.findViewById(R.id.w28);
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            C721640SSk c721640SSk = C721640SSk.LIZ;
            C19EG c19eg = this.LL.LIZIZ;
            c721640SSk.getClass();
            layoutParams.height = C721640SSk.LJIIIIZZ(c19eg);
        }
        View viewFindViewById2 = view.findViewById(R.id.w28);
        if (viewFindViewById2 != null) {
            viewFindViewById2.invalidate();
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bnc);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS146S0100000_11(this, 76));
        }
        C0SPA c0spa = C0SPA.LIZ;
        PostModeDetailParams postModeDetailParams = this.LL.LJII;
        c0spa.getClass();
        if (C0SPA.LIZLLL(postModeDetailParams)) {
            LJIIIIZZ();
        } else {
            C786410Ut5.f3(new C717100SAy(new ARunnableS111S0100000_11(this, 157)), C2487409ou.LIZIZ().getLooper().getQueue());
        }
        LIZLLL();
        C10IT c10it = C10IT.LIZ;
        Aweme aweme = this.LL.LIZJ;
        c10it.getClass();
        LIZ(C10IT.LJIILJJIL(aweme));
    }

    public final void LJIIIZ(boolean z) {
        View viewFindViewById;
        int i;
        ViewGroup viewGroup = this.LL.LJFF;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.jje)) == null) {
            return;
        }
        if (z) {
            i = 56;
        } else {
            i = 44;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams != null && layoutParams.height == iLIZIZ) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        layoutParams2.height = iLIZIZ;
        C786410Ut5.W5(viewFindViewById, layoutParams2);
        viewFindViewById.requestLayout();
    }

    public final void LJIIJ(TuxTextView tuxTextView) {
        String customVerify;
        User author;
        User author2;
        Context contextLIZLLL = this.LL.LIZLLL();
        Aweme aweme = this.LL.LIZJ;
        String enterpriseVerifyReason = null;
        if (aweme != null && (author2 = aweme.getAuthor()) != null) {
            customVerify = author2.getCustomVerify();
        } else {
            customVerify = null;
        }
        Aweme aweme2 = this.LL.LIZJ;
        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
            enterpriseVerifyReason = author.getEnterpriseVerifyReason();
        }
        C1908030zkf.LJI(contextLIZLLL, customVerify, enterpriseVerifyReason, tuxTextView);
    }

    public C0SPG(C0SRL c0srl, Lifecycle lifecycle) {
        this.LL = c0srl;
        this.LLILLJJLI = lifecycle;
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
