package X;

import Y.ACListenerS151S0100000_16;
import Y.ALAdapterS12S0100000_16;
import Y.ARunnableS116S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS30S0001000_16;

/* JADX INFO: renamed from: X.0c5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998340c5Q implements InterfaceC988870bq9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final InterfaceC990580bsu LL;
    public boolean LLILLJJLI;
    public final C998060c4y LLILZLL;
    public long LLJ;
    public final ARunnableS116S0100000_16 LLJI;
    public final ARunnableS116S0100000_16 LLJIJIL;
    public final Animator LLJILJIL;
    public final Animator LLJILJILJ;
    public final Animator LLJILLL;
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(432));
    public final C997320c3m LLILZ = new C997320c3m(AFwS252S0000000_16.get$arr$(431));
    public final C997320c3m LLILZIL = new C997320c3m(AFwS252S0000000_16.get$arr$(433));
    public final C1000600c94 LLIZ = new C1000600c94(LIZ());
    public final C1000990c9h LLIZLLLIL = new C1000990c9h();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C998340c5Q.class, "container", "getContainer()Landroid/view/ViewGroup;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C998340c5Q.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C998340c5Q.class, "musicCoverDepend", "getMusicCoverDepend()Lcom/ss/android/ugc/aweme/ad/feed/depend/IMusicCoverDepend;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final Aweme LIZ() {
        C997320c3m c997320c3m = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (Aweme) c997320c3m.LIZ(this);
    }

    public final ViewGroup LIZJ() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (ViewGroup) c997320c3m.LIZ(this);
    }

    public final C0T9Q LIZLLL() {
        C997320c3m c997320c3m = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (C0T9Q) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        C998060c4y c998060c4y = this.LLILZLL;
        if (c998060c4y != null) {
            c998060c4y.initialize();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[PHI: r2
      0x0036: PHI (r2v5 int) = (r2v1 int), (r2v6 int) binds: [B:44:0x0075, B:19:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ() {
        /*
            r9 = this;
            int r8 = r9.LJ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.LIZ()
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L78
            boolean r0 = X.C1017070cZd.LLJLL(r0)
            if (r0 != r1) goto L78
            r0 = 1
        L13:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.LIZ()
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.commercialize.model.AdPromptInfoModel r0 = r0.getSlideBackInfoModel()
            if (r0 == 0) goto L33
            com.ss.android.ugc.aweme.commercialize.model.AdButtonStrategyModel r0 = r0.getButtonStrategy()
            if (r0 == 0) goto L33
            int r3 = r0.getShowColorSeconds()
        L33:
            int r2 = r2 * r3
            if (r8 >= r2) goto L37
        L36:
            r8 = r2
        L37:
            long r4 = r9.LLJ
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L50
            long r6 = (long) r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L50
            int r0 = com.ss.android.ugc.aweme.ad.setting.CTAButtonShowAndColorSetting.LIZLLL
            if (r0 < 0) goto L50
            long r0 = (long) r0
            long r4 = r4 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L4f
            r2 = r4
        L4f:
            int r8 = (int) r2
        L50:
            return r8
        L51:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.LIZ()
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L37
            int r1 = r0.getAnimationType()
            r0 = 3
            if (r1 != r0) goto L37
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.LIZ()
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L74
            int r3 = r0.getShowButtonColorSeconds()
        L74:
            int r2 = r2 * r3
            if (r8 >= r2) goto L37
            goto L36
        L78:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C998340c5Q.LIZIZ():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJ() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LIZ()
            r2 = 0
            if (r0 == 0) goto L67
            boolean r1 = X.C1017070cZd.LJLJJI(r0)
            r0 = 1
            if (r1 != r0) goto L67
        Le:
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LIZ()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.commercialize.model.AdPromptInfoModel r0 = r0.getSlideBackInfoModel()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.commercialize.model.AdButtonStrategyModel r0 = r0.getButtonStrategy()
            if (r0 == 0) goto L36
            int r0 = r0.getShowSeconds()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L30:
            if (r0 == 0) goto L36
            int r2 = r0.intValue()
        L36:
            int r1 = r2 * 1000
            long r4 = r8.LLJ
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L51
            long r6 = (long) r1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L51
            int r0 = com.ss.android.ugc.aweme.ad.setting.CTAButtonShowAndColorSetting.LIZJ
            if (r0 < 0) goto L51
            long r0 = (long) r0
            long r4 = r4 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L50
            r2 = r4
        L50:
            int r1 = (int) r2
        L51:
            return r1
        L52:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LIZ()
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L36
            int r0 = r0.getShowButtonSeconds()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L30
        L67:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C998340c5Q.LJ():int");
    }

    public final void LJFF() {
        ViewGroup viewGroupLIZJ = LIZJ();
        if (viewGroupLIZJ != null) {
            HandlerHook.viewRemoveCallbacks(viewGroupLIZJ, this.LLJI);
        }
        ViewGroup viewGroupLIZJ2 = LIZJ();
        if (viewGroupLIZJ2 != null) {
            HandlerHook.viewRemoveCallbacks(viewGroupLIZJ2, this.LLJIJIL);
        }
        if (LJIIIZ()) {
            Animator animator = this.LLJILJIL;
            if (animator != null) {
                animator.cancel();
            }
        } else {
            Animator animator2 = this.LLJILLL;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        Animator animator3 = this.LLJILJILJ;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    public final boolean LJIIIIZZ() {
        Aweme awemeLIZ;
        AwemeRawAd awemeRawAd;
        int iIntValue;
        Aweme awemeLIZ2 = LIZ();
        boolean z = (awemeLIZ2 == null || (awemeRawAd = awemeLIZ2.getAwemeRawAd()) == null || ((iIntValue = Integer.valueOf(awemeRawAd.getAnimationType()).intValue()) != 1 && iIntValue != 3)) ? false : true;
        Aweme awemeLIZ3 = LIZ();
        return (awemeLIZ3 != null && C1017070cZd.LLJLL(awemeLIZ3)) || (((awemeLIZ = LIZ()) == null || !C1017070cZd.LJLJJI(awemeLIZ)) && z);
    }

    public final boolean LJIIIZ() {
        AwemeRawAd awemeRawAd;
        Aweme awemeLIZ = LIZ();
        return (awemeLIZ == null || (awemeRawAd = awemeLIZ.getAwemeRawAd()) == null || !awemeRawAd.isHideMusicDisk()) ? false : true;
    }

    public final boolean LJIIJ() {
        Aweme awemeLIZ = LIZ();
        return awemeLIZ != null && C1017070cZd.LLLLIIL(awemeLIZ);
    }

    @Override // X.InterfaceC987490bnv
    public final void LJJLJLI() {
        if (LJIIJ()) {
            this.LLIZ.LJJIIZ(0);
        }
    }

    @Override // X.InterfaceC987490bnv
    public final void LJL() {
        C998060c4y c998060c4y;
        LJFF();
        this.LLILLJJLI = false;
        if (!LJIIJ()) {
            C998060c4y c998060c4y2 = this.LLILZLL;
            if (c998060c4y2 != null) {
                C997370c3r.LIZJ(c998060c4y2, 8);
            }
            LJI(true);
        }
        if (!LJIIIIZZ() || (c998060c4y = this.LLILZLL) == null) {
            return;
        }
        c998060c4y.setBackgroundColor(654311423);
    }

    @Override // X.InterfaceC987490bnv
    public final void onBind() {
        int iLJI;
        if (LJIIJ()) {
            C998060c4y c998060c4y = this.LLILZLL;
            if (c998060c4y != null) {
                C997370c3r.LIZJ(c998060c4y, 0);
                C997370c3r.LIZ(c998060c4y, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            }
        } else {
            C998060c4y c998060c4y2 = this.LLILZLL;
            if (c998060c4y2 != null) {
                C997370c3r.LIZJ(c998060c4y2, 8);
                C997370c3r.LIZ(c998060c4y2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-40)));
            }
        }
        if (LJIIIIZZ()) {
            iLJI = 654311423;
        } else {
            Aweme awemeLIZ = LIZ();
            ViewGroup viewGroupLIZJ = LIZJ();
            iLJI = C1022030chd.LJI(viewGroupLIZJ != null ? viewGroupLIZJ.getContext() : null, awemeLIZ);
        }
        C998060c4y c998060c4y3 = this.LLILZLL;
        if (c998060c4y3 != null) {
            c998060c4y3.setBackgroundColor(iLJI);
        }
        ViewGroup viewGroupLIZJ2 = LIZJ();
        if (viewGroupLIZJ2 != null) {
            C786410Ut5.K7(viewGroupLIZJ2, new ACListenerS151S0100000_16(this, 73));
        }
    }

    @Override // X.InterfaceC987490bnv
    public final void onUnbind() {
        LJFF();
        C998060c4y c998060c4y = this.LLILZLL;
        if (c998060c4y != null) {
            C997370c3r.LIZJ(c998060c4y, 8);
        }
        LJI(true);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C998340c5Q(C735660StQ c735660StQ) {
        final String buttonIcon;
        Context context;
        final String strLIZIZ;
        C998060c4y c998060c4y;
        ValueAnimator valueAnimatorOfInt;
        ValueAnimator valueAnimatorOfArgb;
        Context context2;
        AwemeRawAd awemeRawAd;
        this.LL = c735660StQ;
        Aweme awemeLIZ = LIZ();
        AnimatorSet animatorSet = null;
        if (awemeLIZ != null && (awemeRawAd = awemeLIZ.getAwemeRawAd()) != null) {
            buttonIcon = awemeRawAd.getButtonIcon();
        } else {
            buttonIcon = null;
        }
        Aweme awemeLIZ2 = LIZ();
        if (awemeLIZ2 != null && C1017070cZd.LLJILJIL(awemeLIZ2)) {
            Aweme awemeLIZ3 = LIZ();
            if (awemeLIZ3 != null) {
                strLIZIZ = C1017070cZd.LJJIIZ(awemeLIZ3);
            } else {
                strLIZIZ = null;
            }
        } else {
            InterfaceC705900RmW interfaceC705900RmWLIZJ = C1029590ctp.LIZJ();
            ViewGroup viewGroupLIZJ = LIZJ();
            if (viewGroupLIZJ != null) {
                context = viewGroupLIZJ.getContext();
            } else {
                context = null;
            }
            Aweme awemeLIZ4 = LIZ();
            interfaceC705900RmWLIZJ.getClass();
            strLIZIZ = C1016550cYn.LIZIZ(context, awemeLIZ4, false);
        }
        final ViewGroup viewGroupLIZJ2 = LIZJ();
        if (viewGroupLIZJ2 != null && strLIZIZ != null) {
            c998060c4y = new C998060c4y(new InterfaceC998070c4z(viewGroupLIZJ2, buttonIcon, strLIZIZ) { // from class: X.0c5S
                public final String LIZ;
                public final String LIZIZ;
                public final ViewGroup LIZJ;

                @Override // X.InterfaceC998070c4z
                public final String LIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC997360c3q
                public final ViewGroup LJIJI() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC998070c4z
                public final String getButtonText() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = buttonIcon;
                    this.LIZIZ = strLIZIZ;
                    this.LIZJ = viewGroupLIZJ2;
                }
            });
            c998060c4y.initialize();
        } else {
            c998060c4y = null;
        }
        this.LLILZLL = c998060c4y;
        this.LLJI = new ARunnableS116S0100000_16(this, 125);
        this.LLJIJIL = new ARunnableS116S0100000_16(this, 123);
        if (c998060c4y != null) {
            valueAnimatorOfInt = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(c998060c4y, 33));
            valueAnimatorOfInt.addListener(new ALAdapterS12S0100000_16(this, 10));
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
        } else {
            valueAnimatorOfInt = null;
        }
        this.LLJILJIL = valueAnimatorOfInt;
        if (c998060c4y != null) {
            Aweme awemeLIZ5 = LIZ();
            ViewGroup viewGroupLIZJ3 = LIZJ();
            if (viewGroupLIZJ3 != null) {
                context2 = viewGroupLIZJ3.getContext();
            } else {
                context2 = null;
            }
            valueAnimatorOfArgb = ValueAnimator.ofArgb(654311423, C1022030chd.LJI(context2, awemeLIZ5));
            valueAnimatorOfArgb.addUpdateListener(new AUListenerS265S0100000_16(c998060c4y, 32));
            valueAnimatorOfArgb.setDuration(300L);
            valueAnimatorOfArgb.setInterpolator(C1619980sG4.LJIIJJI());
        } else {
            valueAnimatorOfArgb = null;
        }
        this.LLJILJILJ = valueAnimatorOfArgb;
        if (valueAnimatorOfInt != null) {
            C01GW<Integer> c01gw = ConstraintSizeVM.LL;
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(LIZLLL().LIZLLL(), ((C693770RJf.LIZIZ() * 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-19))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(95)));
            valueAnimatorOfInt2.setDuration(600L);
            valueAnimatorOfInt2.setInterpolator(C1619980sG4.LJIIJJI());
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS265S0100000_16(this, 30));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIJJI());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(this, 31));
            valueAnimatorOfFloat.addListener(new ALAdapterS12S0100000_16(this, 11));
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfInt2);
            animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
        }
        this.LLJILLL = animatorSet;
    }

    public final void LJI(boolean z) {
        if (LJIIIZ()) {
            return;
        }
        if (z) {
            C0T9Q c0t9qLIZLLL = LIZLLL();
            c0t9qLIZLLL.LIZJ(c0t9qLIZLLL.LIZLLL());
            c0t9qLIZLLL.LIZIZ(1.0f);
            c0t9qLIZLLL.LJFF(0);
            return;
        }
        C0T9Q c0t9qLIZLLL2 = LIZLLL();
        c0t9qLIZLLL2.LIZJ(c0t9qLIZLLL2.LIZLLL() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)));
        c0t9qLIZLLL2.LIZIZ(0.0f);
        c0t9qLIZLLL2.LJFF(4);
    }

    @Override // X.InterfaceC987500bnw
    public final void ME1(long j) {
        Context context;
        this.LLJ = j;
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "commercialize_throughout_button_experiment", true, false)) {
            if (!LJIIJ()) {
                IVideoPlayTaskManager iVideoPlayTaskManagerLIZ = this.LL.LIZ();
                C988300bpE c988300bpE = new C988300bpE("THROUGHOUT_SHOW_BUTTON_TASK_NAME");
                c988300bpE.LIZIZ(j);
                c988300bpE.LIZJ = LJ();
                c988300bpE.LIZLLL = this.LLJI;
                c988300bpE.LJ = false;
                iVideoPlayTaskManagerLIZ.LLIFFJFJJ(c988300bpE.LIZ());
            }
            if (LJIIIIZZ()) {
                IVideoPlayTaskManager iVideoPlayTaskManagerLIZ2 = this.LL.LIZ();
                C988300bpE c988300bpE2 = new C988300bpE("THROUGHOUT_COLOR_CHANGE_TASK_NAME");
                c988300bpE2.LIZIZ(j);
                c988300bpE2.LIZJ = LIZIZ();
                c988300bpE2.LIZLLL = this.LLJIJIL;
                c988300bpE2.LJ = false;
                iVideoPlayTaskManagerLIZ2.LLIFFJFJJ(c988300bpE2.LIZ());
                return;
            }
            return;
        }
        if (!LJIIJ()) {
            int iLJ = LJ();
            ViewGroup viewGroupLIZJ = LIZJ();
            if (viewGroupLIZJ != null) {
                HandlerHook.viewRemoveCallbacks(viewGroupLIZJ, this.LLJI);
            }
            long j2 = iLJ;
            if (0 >= j2) {
                C998060c4y c998060c4y = this.LLILZLL;
                if (c998060c4y != null) {
                    C997370c3r.LIZJ(c998060c4y, 0);
                    C997370c3r.LIZ(c998060c4y, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                }
                LJI(false);
                this.LLIZ.LJJIIZ(0);
            } else {
                ViewGroup viewGroupLIZJ2 = LIZJ();
                if (viewGroupLIZJ2 != null) {
                    HandlerHook.viewPostDelay(viewGroupLIZJ2, this.LLJI, j2 - 0);
                }
            }
        }
        if (!LJIIIIZZ()) {
            return;
        }
        int iLIZIZ = LIZIZ();
        ViewGroup viewGroupLIZJ3 = LIZJ();
        if (viewGroupLIZJ3 != null) {
            HandlerHook.viewRemoveCallbacks(viewGroupLIZJ3, this.LLJIJIL);
        }
        long j3 = iLIZIZ;
        if (0 >= j3) {
            C998060c4y c998060c4y2 = this.LLILZLL;
            if (c998060c4y2 != null) {
                Aweme awemeLIZ = LIZ();
                ViewGroup viewGroupLIZJ4 = LIZJ();
                if (viewGroupLIZJ4 != null) {
                    context = viewGroupLIZJ4.getContext();
                } else {
                    context = null;
                }
                c998060c4y2.setBackgroundColor(C1022030chd.LJI(context, awemeLIZ));
            }
            C1000600c94 c1000600c94 = this.LLIZ;
            c1000600c94.getClass();
            C1000610c95.LIZ.getClass();
            c1000600c94.logAd(C1000610c95.LJ, new AwS30S0001000_16(0, 13));
            return;
        }
        ViewGroup viewGroupLIZJ5 = LIZJ();
        if (viewGroupLIZJ5 == null) {
            return;
        }
        HandlerHook.viewPostDelay(viewGroupLIZJ5, this.LLJIJIL, j3 - 0);
    }
}
