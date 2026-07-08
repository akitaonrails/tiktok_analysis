package X;

import Y.AAListenerS322S0100000_11;
import Y.AObserverS215S0100000_11;
import Y.ARunnableS111S0100000_11;
import Y.AUListenerS253S0100000_2;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.ExploreToFullPageAnimationParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS64S0210000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SQR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQR implements InterfaceC724530SbT {
    public final C0SRL LL;
    public final VideoItemParams LLILLJJLI;
    public int LLILLL;
    public AnimatorSet LLILZ;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public ARunnableS111S0100000_11 LLJILJIL;
    public final boolean LLJILJILJ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1572));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1570));
    public final long LLJ = 150;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1571));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1573));

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
        View view;
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = this.LL.LJIILLIIL();
        if (sAFTikTokFragmentLJIILLIIL != null && (view = sAFTikTokFragmentLJIILLIIL.getView()) != null) {
            view.requestLayout();
            view.invalidate();
        }
        C0SOM c0somLJFF = this.LL.LJFF();
        if (c0somLJFF != null) {
            c0somLJFF.requestLayout();
        }
        C0SOM c0somLJFF2 = this.LL.LJFF();
        if (c0somLJFF2 != null) {
            c0somLJFF2.invalidate();
        }
    }

    public final boolean LIZJ() {
        C0SRL c0srl;
        PostModeDetailParams postModeDetailParams;
        if (this.LLJILJILJ && (((postModeDetailParams = (c0srl = this.LL).LJII) != null && postModeDetailParams.enableAnimSimple) || c0srl.LJIIZILJ())) {
            LJIIJJI();
            return true;
        }
        C0SRL c0srl2 = this.LL;
        PostModeDetailParams postModeDetailParams2 = c0srl2.LJII;
        if (postModeDetailParams2 == null || !postModeDetailParams2.enableAnimSimple) {
            if (!c0srl2.LJIIZILJ()) {
                return false;
            }
            LJIIJJI();
            return true;
        }
        boolean zJT0 = c0srl2.LJIIL.jT0();
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = this.LL.LJIILLIIL();
        View view = null;
        if ((sAFTikTokFragmentLJIILLIIL instanceof PostModeDetailRootFragment) && sAFTikTokFragmentLJIILLIIL != null) {
            view = sAFTikTokFragmentLJIILLIIL.getView();
        }
        if (!zJT0 || view == null) {
            LJIIJJI();
            return true;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new AAListenerS322S0100000_11(this, 22));
        AnimatorSet animatorSet = this.LLILZ;
        if (animatorSet != null) {
            animatorSet.play(objectAnimatorOfFloat);
        }
        AnimatorSet animatorSet2 = this.LLILZ;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new DecelerateInterpolator(2.0f));
        }
        AnimatorSet animatorSet3 = this.LLILZ;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        return true;
    }

    public final LinearLayout LIZLLL() {
        ViewGroup viewGroup = this.LL.LIZLLL;
        if (viewGroup != null) {
            return (LinearLayout) viewGroup.findViewById(R.id.ccd);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ() {
        EnumC721170SQp enumC721170SQp;
        EnumC721170SQp enumC721170SQp2 = (EnumC721170SQp) this.LL.LJIIIIZZ.LLILZLL.getValue();
        if (enumC721170SQp2 == null) {
            enumC721170SQp2 = EnumC721170SQp.BACK;
        }
        String mobValue = enumC721170SQp2.getMobValue();
        if (C255680A0g.LIZ() && (enumC721170SQp = this.LL.LJIIIIZZ.LL) != null) {
            mobValue = enumC721170SQp.getMobValue();
        }
        VideoItemParams videoItemParams = this.LLILLJJLI;
        String str = videoItemParams != null ? videoItemParams.mEventType : null;
        C0SQL.LIZJ = "";
        C0SQL.LIZIZ = "";
        C0SQL.LIZLLL = 0L;
        C0SQL.LJ = 0L;
        C0SQL.LJFF = 0L;
        C0SQL.LJI = 0L;
        C0SQL.LIZLLL = System.currentTimeMillis();
        C0SQL.LIZIZ = str;
        C0SQL.LIZJ = mobValue;
        PostModeFullPageViewModel postModeFullPageViewModel = this.LL.LJIIIZ;
        if (postModeFullPageViewModel == null) {
            return;
        }
        boolean z = ((C0S9P) postModeFullPageViewModel.getState()).LLILLL;
        postModeFullPageViewModel.wQ2();
        C736680Sv4.LJIJJLI(postModeFullPageViewModel, new AwS64S0210000_11(this, enumC721170SQp2, z, 3));
    }

    public final int LJIIIZ() {
        Context contextLIZLLL = this.LL.LIZLLL();
        if (C960203pA.LIZIZ(contextLIZLLL) && C0SO2.LIZLLL()) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, contextLIZLLL);
            if (numLIZJ != null) {
                return numLIZJ.intValue();
            }
            return -16777216;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, contextLIZLLL);
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        return -1;
    }

    public final View LJIIJ() {
        return this.LLJILJILJ ? this.LL.LJIIIZ() : this.LL.LJFF();
    }

    public final void LJIIJJI() {
        ARunnableS111S0100000_11 aRunnableS111S0100000_11 = new ARunnableS111S0100000_11(this, 163);
        this.LLJILJIL = aRunnableS111S0100000_11;
        if (this.LL.LJIIL.jT0()) {
            C707090RoR.LIZIZ(aRunnableS111S0100000_11);
        } else {
            C786410Ut5.LJLIIL(100L, C707090RoR.LIZ(), aRunnableS111S0100000_11);
        }
        C720620SOm.LIZ.setValue(null);
        this.LL.LJIIIIZZ.LLLFFI.setValue(Boolean.FALSE);
    }

    public final boolean LJIIL() {
        C0SRL c0srl;
        PostModeDetailParams postModeDetailParams;
        PostModeDetailParams postModeDetailParams2 = this.LL.LJII;
        if (postModeDetailParams2 == null || !postModeDetailParams2.useSwipeEnterAnim) {
            C721640SSk.LIZ.getClass();
            if (!C721640SSk.LJIILJJIL(postModeDetailParams2)) {
                C0SPA c0spa = C0SPA.LIZ;
                PostModeDetailParams postModeDetailParams3 = this.LL.LJII;
                c0spa.getClass();
                if (!C0SPA.LIZJ(postModeDetailParams3) && (((postModeDetailParams = (c0srl = this.LL).LJII) == null || !postModeDetailParams.enableScale) && !c0srl.LJIIZILJ())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LJIILIIL() {
        View view;
        PostModePageViewModel postModePageViewModel = this.LL.LJIIIIZZ;
        Boolean value = postModePageViewModel.LLJLLL.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool) && Intrinsics.LJFF(postModePageViewModel.LLJZ.getValue(), bool) && this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = this.LL.LJIILLIIL();
            if (sAFTikTokFragmentLJIILLIIL == null || (view = sAFTikTokFragmentLJIILLIIL.getView()) == null) {
                LIZIZ();
            } else {
                HandlerHook.viewPost(view, new ARunnableS111S0100000_11(this, 164));
            }
        }
    }

    public final boolean LJIILL() {
        C721640SSk c721640SSk = C721640SSk.LIZ;
        PostModeDetailParams postModeDetailParams = this.LL.LJII;
        c721640SSk.getClass();
        if (C721640SSk.LJIILJJIL(postModeDetailParams)) {
            return true;
        }
        C0SPA c0spa = C0SPA.LIZ;
        PostModeDetailParams postModeDetailParams2 = this.LL.LJII;
        c0spa.getClass();
        return C0SPA.LIZJ(postModeDetailParams2);
    }

    public final boolean LJIIZILJ() {
        return this.LL.LJIIL.jT0() && C304280BwI.LIZJ() && LJIILL();
    }

    public final boolean LJIJ() {
        return this.LL.LJIIL.jT0() && C304280BwI.LIZLLL() && LJIILL();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.LJIIL();
    }

    public static void LIZ(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(250L);
        valueAnimator.setStartDelay(50L);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Float, java.lang.Float> LJII(boolean r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SQR.LJII(boolean):kotlin.Pair");
    }

    public final boolean LJIILLIIL(EnumC721170SQp enumC721170SQp) {
        PostModeDetailParams postModeDetailParams;
        ExploreToFullPageAnimationParam exploreToFullPageAnimationParam;
        if (!LJIILL() || (((postModeDetailParams = this.LL.LJII) != null && (exploreToFullPageAnimationParam = postModeDetailParams.exploreToFullPageAnimationParam) != null && exploreToFullPageAnimationParam.isRefreshing) || enumC721170SQp == EnumC721170SQp.NOT_INTERESTED)) {
            return false;
        }
        return true;
    }

    public C0SQR(C0SRL c0srl, VideoItemParams videoItemParams) {
        this.LL = c0srl;
        this.LLILLJJLI = videoItemParams;
        this.LLJILJILJ = c0srl.LJIIZILJ;
        C0SRK.LIZJ("init_animation");
        LJII(false);
        float fFloatValue = LJII(false).getSecond().floatValue();
        View viewLJIIJ = LJIIJ();
        if (viewLJIIJ != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLJIIJ.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.height = (int) fFloatValue;
            }
            C786410Ut5.W5(viewLJIIJ, marginLayoutParams);
        }
        LifecycleOwner lifecycleOwnerLJIILIIL = c0srl.LJIILIIL();
        c0srl.LJIIIIZZ.LLILZLL.observe(lifecycleOwnerLJIILIIL, new AObserverS215S0100000_11(this, 49));
        c0srl.LJIIIIZZ.LLJLLIL.observe(lifecycleOwnerLJIILIIL, new Observer() { // from class: X.0SQS
            /* JADX WARN: Code restructure failed: missing block: B:314:0x060e, code lost:
            
                if (r0.enableScale != true) goto L423;
             */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0238  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x0281  */
            /* JADX WARN: Removed duplicated region for block: B:129:0x02c3  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x02e1  */
            /* JADX WARN: Removed duplicated region for block: B:341:0x06b9  */
            /* JADX WARN: Removed duplicated region for block: B:351:0x070c  */
            /* JADX WARN: Removed duplicated region for block: B:352:0x070f  */
            /* JADX WARN: Removed duplicated region for block: B:359:0x072a  */
            /* JADX WARN: Removed duplicated region for block: B:369:0x0759  */
            /* JADX WARN: Removed duplicated region for block: B:372:0x0765  */
            /* JADX WARN: Removed duplicated region for block: B:375:0x0775  */
            /* JADX WARN: Removed duplicated region for block: B:381:0x07b3 A[PHI: r15
              0x07b3: PHI (r15v2 float) = (r15v1 float), (r15v8 float) binds: [B:379:0x07b0, B:365:0x074b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:384:0x07b7 A[PHI: r14 r15
              0x07b7: PHI (r14v1 float) = (r14v0 float), (r14v5 float) binds: [B:382:0x07b4, B:368:0x0757] A[DONT_GENERATE, DONT_INLINE]
              0x07b7: PHI (r15v3 float) = (r15v2 float), (r15v7 float) binds: [B:382:0x07b4, B:368:0x0757] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:387:0x07bb A[PHI: r13 r14 r15
              0x07bb: PHI (r13v5 float) = (r13v4 float), (r13v7 float) binds: [B:385:0x07b8, B:371:0x0763] A[DONT_GENERATE, DONT_INLINE]
              0x07bb: PHI (r14v2 float) = (r14v1 float), (r14v4 float) binds: [B:385:0x07b8, B:371:0x0763] A[DONT_GENERATE, DONT_INLINE]
              0x07bb: PHI (r15v4 float) = (r15v3 float), (r15v6 float) binds: [B:385:0x07b8, B:371:0x0763] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:388:0x07bd  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0154  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 2242
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0SQS.onChanged(java.lang.Object):void");
            }
        });
        PostModeFullPageViewModel postModeFullPageViewModel = c0srl.LJIIIZ;
        if (postModeFullPageViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, postModeFullPageViewModel, new C2217381BqS() { // from class: X.0RHJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C0S9P) obj).LL);
                }
            }, null, new AwS625S0100000_11(this, 140), 6);
        }
        if (LJIJ()) {
            c0srl.LJIIIIZZ.LLJLLL.observe(lifecycleOwnerLJIILIIL, new AObserverS215S0100000_11(this, 53));
            c0srl.LJIIIIZZ.LLJZ.observe(lifecycleOwnerLJIILIIL, new AObserverS215S0100000_11(this, 56));
        }
        if (LJIJ() || LJIIZILJ()) {
            c0srl.LJIIIIZZ.LLJZIJLIL.observe(lifecycleOwnerLJIILIIL, new AObserverS215S0100000_11(this, 57));
        }
        PostModeDetailParams postModeDetailParams = c0srl.LJII;
        if (postModeDetailParams != null && postModeDetailParams.quickShowHoldCover) {
            c0srl.LJIIIIZZ.LLJZ.observe(lifecycleOwnerLJIILIIL, new AObserverS215S0100000_11(this, 58));
        }
    }

    public final void LJIILJJIL(int i, int i2) {
        if (this.LL.LJIIL.jT0()) {
            this.LL.LJIJJ(i, i2);
            this.LL.LIZIZ();
        } else {
            this.LL.LIZIZ();
            this.LL.LJIJJ(i, i2);
        }
    }

    public final ValueAnimator LJ(int i, int i2, View view) {
        if (LJIIL()) {
            view.setBackgroundColor(i2);
            return null;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6(view, 147));
        return valueAnimatorOfObject;
    }

    public final ValueAnimator LJI(View view, float f, float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (LJIIL()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.height = (int) f2;
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.W5(view, marginLayoutParams);
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS253S0100000_2(view, 33));
        return valueAnimatorOfFloat;
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
