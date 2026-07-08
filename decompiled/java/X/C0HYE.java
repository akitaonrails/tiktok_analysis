package X;

import Y.ACListenerS110S0200000_6;
import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HYE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYE implements InterfaceC724530SbT {
    public final C442430HWn LL;
    public final Lifecycle LLILLJJLI;
    public View LLILLL;

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

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    public final void LIZ(EnumC1356100lOS enumC1356100lOS) {
        String str;
        User author;
        String nickname;
        C1356140lOW c1356140lOW = C1356140lOW.LIZ;
        C442430HWn c442430HWn = this.LL;
        C19EG c19eg = c442430HWn.LIZIZ;
        Aweme aweme = c442430HWn.LIZJ;
        EnumC1341630l17 enumC1341630l17 = EnumC1341630l17.PROFILE;
        Pair[] pairArr = new Pair[2];
        PostModeDetailParams postModeDetailParams = c442430HWn.LJI;
        String str2 = "";
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        Aweme aweme2 = this.LL.LIZJ;
        if (aweme2 != null && (author = aweme2.getAuthor()) != null && (nickname = author.getNickname()) != null) {
            str2 = nickname;
        }
        pairArr[1] = new Pair("user_name", str2);
        C1356140lOW.LIZIZ(c1356140lOW, c19eg, aweme, null, enumC1341630l17, enumC1356100lOS, C2097608Jq.LJIIIIZZ(pairArr), 100);
    }

    public C0HYE(C442430HWn c442430HWn, Lifecycle lifecycle) {
        View viewFindViewById;
        C19ME c19me;
        User author;
        C427660Gpo c427660Gpo;
        TuxTextView tuxTextView;
        String customVerify;
        String verifyInfo;
        User author2;
        User author3;
        ViewStub viewStub;
        Fragment fragment;
        View view;
        String str;
        String str2;
        this.LL = c442430HWn;
        this.LLILLJJLI = lifecycle;
        View viewLIZIZ = C21146717pB.LIZIZ(c442430HWn.LIZIZ, R.layout.daf, c442430HWn.LIZLLL, false);
        ViewGroup viewGroup = c442430HWn.LIZLLL;
        if (viewGroup != null) {
            viewGroup.addView(viewLIZIZ);
        }
        c442430HWn.LJFF = (ViewGroup) viewLIZIZ;
        View viewFindViewById2 = viewLIZIZ.findViewById(R.id.w28);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C443940Hay.LIZ(c442430HWn.LIZIZ);
            }
            viewFindViewById2.invalidate();
        }
        TuxIconView tuxIconView = (TuxIconView) viewLIZIZ.findViewById(R.id.bnc);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 157));
        }
        if (c442430HWn.LIZJ != null && (fragment = c442430HWn.LIZ) != null && (view = fragment.getView()) != null) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            Fragment fragment2 = c442430HWn.LIZ;
            Aweme aweme = c442430HWn.LIZJ;
            PostModeDetailParams postModeDetailParams = c442430HWn.LJI;
            if (postModeDetailParams != null) {
                str = postModeDetailParams.tabName;
                str2 = postModeDetailParams.tabName;
            } else {
                str = null;
                str2 = null;
            }
            c1er1.o(fragment2, view, aweme, str, str2, 0);
        }
        if (this.LLILLL == null) {
            ViewGroup viewGroup2 = c442430HWn.LJFF;
            if (viewGroup2 != null && (viewStub = (ViewStub) viewGroup2.findViewById(R.id.s0x)) != null) {
                C786410Ut5.LJLLLL(viewStub);
            }
            ViewGroup viewGroup3 = c442430HWn.LJFF;
            if (viewGroup3 != null) {
                viewFindViewById = viewGroup3.findViewById(R.id.s0w);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = viewFindViewById;
            Aweme aweme2 = c442430HWn.LIZJ;
            if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                View view2 = this.LLILLL;
                if (view2 != null) {
                    c427660Gpo = (C427660Gpo) view2.findViewById(R.id.jig);
                } else {
                    c427660Gpo = null;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                int iLIZJ = (int) C12ES.LIZJ(28.0f, c442430HWn.LIZIZ);
                int iLIZJ2 = (int) C12ES.LIZJ(28.0f, c442430HWn.LIZIZ);
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZJ;
                c1331670kl3LJIIIIZZ.LJIIIZ = iLIZJ2;
                c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
                c1331670kl3LJIIIIZZ.LJJ(c427660Gpo);
                c1331670kl3LJIIIIZZ.LJIIJJI();
                View view3 = this.LLILLL;
                if (view3 != null) {
                    tuxTextView = (TuxTextView) view3.findViewById(R.id.jk2);
                    if (tuxTextView != null) {
                        tuxTextView.setText(author.getNickname());
                        C19EG c19eg = c442430HWn.LIZIZ;
                        Aweme aweme3 = c442430HWn.LIZJ;
                        if (aweme3 != null && (author3 = aweme3.getAuthor()) != null) {
                            customVerify = author3.getCustomVerify();
                        } else {
                            customVerify = null;
                        }
                        Aweme aweme4 = c442430HWn.LIZJ;
                        if (aweme4 != null && (author2 = aweme4.getAuthor()) != null) {
                            verifyInfo = author2.getVerifyInfo();
                        } else {
                            verifyInfo = null;
                        }
                        C1908030zkf.LJI(c19eg, customVerify, verifyInfo, tuxTextView);
                    }
                } else {
                    tuxTextView = null;
                }
                if (c427660Gpo != null) {
                    C786410Ut5.T8(c427660Gpo, new ACListenerS110S0200000_6(this, author, 51));
                }
                if (tuxTextView != null) {
                    C786410Ut5.h9(tuxTextView, new ACListenerS110S0200000_6(this, author, 52));
                }
            }
            View view4 = this.LLILLL;
            ViewGroup.LayoutParams layoutParams2 = view4 != null ? view4.getLayoutParams() : null;
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                c19me.endToStart = R.id.ltz;
                c19me.endToEnd = -1;
            }
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
