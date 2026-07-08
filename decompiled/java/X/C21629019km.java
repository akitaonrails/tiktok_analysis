package X;

import Y.AAListenerS343S0100000_33;
import Y.ACListenerS167S0100000_33;
import Y.ALAdapterS3S0100000_6;
import Y.ARunnableS132S0100000_32;
import Y.AUListenerS1S0200001_6;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.exp.LivePreviewLivingIconAnimatorOptConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21629019km extends FrameLayout {
    public View LL;
    public View LLILLJJLI;
    public ViewGroup LLILLL;
    public C19631511rN LLILZ;
    public ViewGroup LLILZIL;
    public TuxIconView LLILZLL;
    public C434000H0c LLIZ;
    public LinearLayout LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C1ACA LLJIJIL;
    public LinearLayout LLJILJIL;
    public C21415018rM LLJILJILJ;
    public TuxTextView LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public ValueAnimator LLJJIII;
    public InterfaceC21566419ag LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public final Map<EnumC1106640eu6, C09AE> LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;

    public static /* synthetic */ void getCurrentLivingIconState$annotations() {
    }

    public final void LJFF() {
        this.LLJLILLLLZIIL = true;
        Iterator it2 = ((LinkedHashMap) this.LLJLLIL).entrySet().iterator();
        while (it2.hasNext()) {
            ((C09AE) ((Map.Entry) it2.next()).getValue()).LIZIZ(null);
        }
        ((LinkedHashMap) this.LLJLLIL).clear();
        getFadeInPartialAnimator().cancel();
        getFadeInFullAnimator().cancel();
        getScalingAnimator().cancel();
        C434000H0c tvLiveTipsFromXml = getTvLiveTipsFromXml();
        if (tvLiveTipsFromXml != null) {
            tvLiveTipsFromXml.LJJJJJ();
        }
    }

    private final View getAutoEnterCancel() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final float getCurRefreshRate() {
        return ((Number) this.LLJJIJIIJIL.getValue()).floatValue();
    }

    private final int getDropFrameInterval() {
        return ((Number) this.LLJJJ.getValue()).intValue();
    }

    private final int getLavLivingAnimDegradeState() {
        C302020Bse.LIZ.getClass();
        return ((Boolean) C302020Bse.LIZIZ.getValue()).booleanValue() ? 2 : 1;
    }

    private final View getLeftLine() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.mk9);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    private final C21629119kn getLiveHighlightAnimHelper() {
        return (C21629119kn) this.LLJJJJ.getValue();
    }

    private final View getRightLine() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.tll);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    private final ObjectAnimator getScalingAnimator() {
        return (ObjectAnimator) this.LLJZIJLIL.getValue();
    }

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LLJJIII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new AAListenerS343S0100000_33(this, 2));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 20));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.LLJJIII = valueAnimatorOfFloat;
    }

    public final void LIZIZ() {
        C1106570etz.LIZ.getClass();
        if (C1106570etz.LIZ()) {
            for (View view : getFadeView()) {
                if (view != null) {
                    C786410Ut5.T4(view, 0.0f);
                }
            }
        }
    }

    public final void LJ() {
        C20441214yg.LJIIIZ("BottomTipsWidget", "initRealTimeLiveCTAView");
        C339190DRl.LIZLLL(getRealTimeLiveCTAContainer());
        C339190DRl.LIZIZ(getTvLiveHighlightContainer());
        C1106570etz.LIZ.getClass();
        if (!C1106570etz.LIZ()) {
            LJIIIZ(EnumC21165617sE.SHOW_LIVE_GUIDE);
            return;
        }
        LIZIZ();
        if (C1106570etz.LIZJ().style == EnumC1106580eu0.BUTTON.getValue()) {
            LinearLayout realTimeLiveCTAContainer = getRealTimeLiveCTAContainer();
            if (realTimeLiveCTAContainer != null) {
                realTimeLiveCTAContainer.setBackground(C800330VaR.LIZIZ(C1834150xpV.LJII(getContext()), R.drawable.cgu));
            }
            LinearLayout realTimeLiveCTAContainer2 = getRealTimeLiveCTAContainer();
            if (realTimeLiveCTAContainer2 != null) {
                C426750GoL.LJIIL(realTimeLiveCTAContainer2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 16);
            }
            C339190DRl.LIZIZ(getLeftLine());
            C339190DRl.LIZIZ(getRightLine());
        }
    }

    public final void LJI() {
        C1106570etz.LIZ.getClass();
        if (C1106570etz.LIZJ().style == EnumC1106580eu0.BUTTON.getValue()) {
            LinearLayout realTimeLiveCTAContainer = getRealTimeLiveCTAContainer();
            if (realTimeLiveCTAContainer != null) {
                realTimeLiveCTAContainer.setBackground(null);
            }
            LinearLayout realTimeLiveCTAContainer2 = getRealTimeLiveCTAContainer();
            if (realTimeLiveCTAContainer2 != null) {
                C426750GoL.LJIIL(realTimeLiveCTAContainer2, 0, 0, 0, 0, 16);
            }
            if (!C21630019kw.LIZ.applyStyleOptimization || this.LLJLL) {
                C339190DRl.LIZLLL(getLeftLine());
                C339190DRl.LIZLLL(getRightLine());
            }
        }
    }

    public final void LJIIJ() {
        C1106570etz.LIZ.getClass();
        if (C1106570etz.LIZ()) {
            for (View view : getFadeView()) {
                if (view != null) {
                    C786410Ut5.T4(view, 1.0f);
                }
            }
        }
    }

    public final void LJIIJJI() {
        if (this.LLJJJJLIIL) {
            return;
        }
        C20441214yg.LJIIIZ("BottomTipsWidget", "showHighlightCTA");
        LJIIJ();
        LJII();
        final boolean z = true;
        this.LLJJJJLIIL = true;
        if (C20448214zo.LIZ == 2 || ((Keva) C20448214zo.LIZIZ.getValue()).getInt(C20448214zo.LIZJ(), 0) >= 3) {
            z = false;
            C339190DRl.LIZIZ(getTvHighlightLiveSubTips());
        } else {
            TuxTextView tvHighlightLiveSubTips = getTvHighlightLiveSubTips();
            if (tvHighlightLiveSubTips != null) {
                C21629119kn liveHighlightAnimHelper = getLiveHighlightAnimHelper();
                RunnableC514801zW runnableC514801zW = liveHighlightAnimHelper.LIZLLL;
                if (runnableC514801zW != null) {
                    C473410IhP.LIZ().removeCallbacks(runnableC514801zW);
                }
                RunnableC514801zW runnableC514801zW2 = new RunnableC514801zW(tvHighlightLiveSubTips, 28);
                liveHighlightAnimHelper.LIZLLL = runnableC514801zW2;
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C473410IhP.LIZ(), runnableC514801zW2);
            }
        }
        C21415018rM tvLiveHighlightTips = getTvLiveHighlightTips();
        int height = tvLiveHighlightTips != null ? tvLiveHighlightTips.getHeight() : 0;
        final C21415018rM tvLiveHighlightTips2 = getTvLiveHighlightTips();
        if (tvLiveHighlightTips2 != null) {
            C21629119kn liveHighlightAnimHelper2 = getLiveHighlightAnimHelper();
            final TuxTextView tvHighlightLiveSubTips2 = getTvHighlightLiveSubTips();
            final float f = height;
            liveHighlightAnimHelper2.getClass();
            if (C0BTA.LIZ()) {
                if (z) {
                    if (tvHighlightLiveSubTips2 != null) {
                        C786410Ut5.T4(tvHighlightLiveSubTips2, 1.0f);
                    }
                    C339190DRl.LIZLLL(tvHighlightLiveSubTips2);
                }
                C786410Ut5.T4(tvLiveHighlightTips2, 1.0f);
                C339190DRl.LIZLLL(tvLiveHighlightTips2);
                C786410Ut5.ed(tvLiveHighlightTips2, 0.0f);
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(371L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS1S0200001_6(tvLiveHighlightTips2, tvHighlightLiveSubTips2, f, 1));
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.19kp
                    public final /* synthetic */ AbstractC21629819ku LLILZIL = null;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        if (z) {
                            View view = tvHighlightLiveSubTips2;
                            if (view != null) {
                                C786410Ut5.T4(view, 0.0f);
                            }
                            C339190DRl.LIZLLL(tvHighlightLiveSubTips2);
                        }
                        C786410Ut5.ed(tvLiveHighlightTips2, f);
                        C786410Ut5.T4(tvLiveHighlightTips2, 1.0f);
                        C339190DRl.LIZLLL(tvLiveHighlightTips2);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator, boolean z2) {
                        View view;
                        AbstractC21629819ku abstractC21629819ku = this.LLILZIL;
                        if (abstractC21629819ku != null) {
                            abstractC21629819ku.LIZ();
                        }
                        if (z && (view = tvHighlightLiveSubTips2) != null) {
                            C786410Ut5.T4(view, 1.0f);
                        }
                        C786410Ut5.ed(tvLiveHighlightTips2, 0.0f);
                    }
                });
                valueAnimatorOfFloat.start();
                liveHighlightAnimHelper2.LIZ = valueAnimatorOfFloat;
            }
        }
        C20448214zo.LJ(false);
    }

    public final void LJIILJJIL() {
        C1106570etz.LIZ.getClass();
        int i = C1106570etz.LIZJ().style;
        if (i != EnumC1106580eu0.GLINT.getValue()) {
            if (i == EnumC1106580eu0.SCALING.getValue()) {
                C786410Ut5.Pd(getScalingAnimator());
                return;
            }
            return;
        }
        C434000H0c tvLiveTipsFromXml = getTvLiveTipsFromXml();
        if (tvLiveTipsFromXml != null) {
            ALAdapterS3S0100000_6 aLAdapterS3S0100000_6 = new ALAdapterS3S0100000_6(this, 8);
            tvLiveTipsFromXml.LLJLLIL = true;
            ((ArrayList) tvLiveTipsFromXml.LLJZ).add(aLAdapterS3S0100000_6);
            Animator animator = tvLiveTipsFromXml.LLJLLL;
            if (animator != null) {
                animator.start();
            }
        }
    }

    public final LinearLayout getAutoEnter() {
        return (LinearLayout) this.LLJJJJJIL.getValue();
    }

    public final C21566119ad getAutoEnterProgress() {
        return (C21566119ad) this.LLJL.getValue();
    }

    public final ViewStub getAutoEnterStub() {
        return (ViewStub) this.LLJJJIL.getValue();
    }

    public final ViewGroup getCtaTextContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fam);
            this.LLILLL = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    public final Animator getFadeInFullAnimator() {
        return (Animator) this.LLJZ.getValue();
    }

    public final Animator getFadeInPartialAnimator() {
        return (Animator) this.LLJLLL.getValue();
    }

    public final List<View> getFadeView() {
        C1106570etz.LIZ.getClass();
        return C1106570etz.LIZJ().style == EnumC1106580eu0.GLINT.getValue() ? C1697810uHb.LJIIJJI(getLeftLine(), getLivingIconAnimationViewFromXml(), getIconLivePlayingFromXml(), getTvLiveTipsFromXml(), getPreviewLiveSubTips(), getRightLine()) : C1697810uHb.LJIIJJI(getLivingFromXml(), getPreviewLiveSubTips());
    }

    public final TuxIconView getIconLivePlayingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k1q);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final ViewGroup getLivingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n9k);
            this.LLILZIL = (ViewGroup) callbackFindViewById;
        }
        return (ViewGroup) callbackFindViewById;
    }

    public final C19631511rN getLivingIconAnimationViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n9n);
            this.LLILZ = (C19631511rN) callbackFindViewById;
        }
        return (C19631511rN) callbackFindViewById;
    }

    public final TuxTextView getPreviewLiveSubTips() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rrb);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getRealTimeLiveCTAContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.suo);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1AAF getSubTitleHelper() {
        return (C1AAF) this.LLJJIJIL.getValue();
    }

    public final TuxTextView getTvHighlightLiveSubTips() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zpe);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getTvLiveHighlightContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jmr);
            this.LLJILJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTvLiveHighlightCountDown() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zpd);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C21415018rM getTvLiveHighlightTips() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zpg);
            this.LLJILJILJ = (C21415018rM) callbackFindViewById;
        }
        return (C21415018rM) callbackFindViewById;
    }

    public final C434000H0c getTvLiveTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zvq);
            this.LLIZ = (C434000H0c) callbackFindViewById;
        }
        return (C434000H0c) callbackFindViewById;
    }

    public final void LJII() {
        TuxTextView tvHighlightLiveSubTips = getTvHighlightLiveSubTips();
        if (tvHighlightLiveSubTips != null) {
            C786410Ut5.B5(tvHighlightLiveSubTips, 0.0f);
        }
        C21415018rM tvLiveHighlightTips = getTvLiveHighlightTips();
        if (tvLiveHighlightTips != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tvLiveHighlightTips);
            tvLiveHighlightTips.setTranslationY(0.0f);
        }
        TuxTextView tvLiveHighlightCountDown = getTvLiveHighlightCountDown();
        if (tvLiveHighlightCountDown != null) {
            C786410Ut5.wd(tvLiveHighlightCountDown, 0.0f);
        }
        LinearLayout realTimeLiveCTAContainer = getRealTimeLiveCTAContainer();
        if (realTimeLiveCTAContainer != null) {
            C786410Ut5.hd(realTimeLiveCTAContainer, 0.0f);
        }
        this.LLJJJJLIIL = false;
        C339190DRl.LIZIZ(getTvLiveHighlightTips());
        C339190DRl.LIZIZ(getTvHighlightLiveSubTips());
        C339190DRl.LIZIZ(getTvLiveHighlightCountDown());
        getLiveHighlightAnimHelper().LIZIZ();
    }

    public final void LJIILIIL() {
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 42), getAutoEnterCancel());
        ValueAnimator valueAnimator = this.LLJJIII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new AAListenerS343S0100000_33(this, 3));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 21));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.LLJJIII = valueAnimatorOfFloat;
    }

    public final void LJIILLIIL() {
        int lavLivingAnimDegradeState = getLavLivingAnimDegradeState();
        if (lavLivingAnimDegradeState != this.LLJLIL) {
            if (lavLivingAnimDegradeState == 1) {
                C786410Ut5.LLLLLLZZ(getIconLivePlayingFromXml(), 8);
                C786410Ut5.LLJJIJIIJIL(getLivingIconAnimationViewFromXml(), 0);
                getLivingIconAnimationViewFromXml().setRenderInterval(getDropFrameInterval());
                getLivingIconAnimationViewFromXml().LJFF();
            } else if (lavLivingAnimDegradeState == 2) {
                C786410Ut5.LLJJIJIIJIL(getLivingIconAnimationViewFromXml(), 8);
                C786410Ut5.LLLLLLZZ(getIconLivePlayingFromXml(), 0);
            } else if (lavLivingAnimDegradeState == 4) {
                C786410Ut5.LLJJIJIIJIL(getLivingIconAnimationViewFromXml(), 8);
                C786410Ut5.LLLLLLZZ(getIconLivePlayingFromXml(), 8);
            }
            this.LLJLIL = lavLivingAnimDegradeState;
        }
        if (lavLivingAnimDegradeState != 2) {
            getLivingIconAnimationViewFromXml().LJFF();
        }
    }

    public final int getLivingIconAnimatorDropFrameInterval() {
        if (getCurRefreshRate() <= 0.0f) {
            return 1;
        }
        C01GW c01gw = C21629919kv.LIZIZ;
        int i = ((LivePreviewLivingIconAnimatorOptConfig) c01gw.getValue()).refreshFrameInterval;
        return getCurRefreshRate() / ((float) i) > ((float) ((LivePreviewLivingIconAnimatorOptConfig) c01gw.getValue()).minFrameRate) ? i : (int) (getCurRefreshRate() / ((LivePreviewLivingIconAnimatorOptConfig) c01gw.getValue()).minFrameRate);
    }

    public final C1ACA getPreviewContextData() {
        return this.LLJIJIL;
    }

    public final void LIZJ(float f) {
        getLiveHighlightAnimHelper().LIZ(f, getRealTimeLiveCTAContainer(), getTvLiveHighlightContainer(), new AbstractC21629819ku() { // from class: X.19ko
            @Override // X.AbstractC21629819ku
            public final void LIZIZ() {
                this.LIZ.LJIIIZ(EnumC21165617sE.SHOW_LIVE_GUIDE);
                this.LIZ.LJIILLIIL();
                this.LIZ.getSubTitleHelper().LIZ(this.LIZ.getPreviewLiveSubTips(), this.LIZ.getPreviewContextData());
            }
        });
    }

    public final void LIZLLL(String str) {
        int iIntValue;
        C20441214yg.LJIIIZ("BottomTipsWidget", "initLiveHighlightCTAView");
        LJII();
        C339190DRl.LIZIZ(getRealTimeLiveCTAContainer());
        C339190DRl.LIZLLL(getTvLiveHighlightContainer());
        C339190DRl.LIZLLL(getTvLiveHighlightTips());
        C21415018rM tvLiveHighlightTips = getTvLiveHighlightTips();
        if (tvLiveHighlightTips != null) {
            C786410Ut5.A5(tvLiveHighlightTips, 0.0f);
        }
        TuxTextView tvHighlightLiveSubTips = getTvHighlightLiveSubTips();
        if (tvHighlightLiveSubTips != null) {
            C786410Ut5.B5(tvHighlightLiveSubTips, 0.0f);
        }
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(str);
        c444830HcP.LJII(33);
        c444830HcP.LIZIZ.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(304));
        c444830HcP.LJIIIZ(1);
        c444830HcP.LIZIZ.LJI = Layout.Alignment.ALIGN_NORMAL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        c444830HcP.LJIILJJIL(iIntValue);
        Layout layoutLIZJ = C444830HcP.LIZJ(c444830HcP, 1.0f, false, Collections.singletonList(new Pair(15, 17)), 24);
        C21415018rM tvLiveHighlightTips2 = getTvLiveHighlightTips();
        if (tvLiveHighlightTips2 != null) {
            tvLiveHighlightTips2.setTextLayout(layoutLIZJ);
        }
        C339190DRl.LIZIZ(getTvLiveHighlightCountDown());
    }

    public final void LJIIIIZZ(boolean z) {
        LinearLayout realTimeLiveCTAContainer = getRealTimeLiveCTAContainer();
        if (realTimeLiveCTAContainer != null && realTimeLiveCTAContainer.getVisibility() == 0) {
            LJIIL(z);
        }
    }

    public final void LJIIIZ(EnumC21165617sE enumC21165617sE) {
        C21415018rM tvLiveHighlightTips;
        final int height;
        C466310IQj c466310IQj;
        int i = C21165717sF.LIZ[enumC21165617sE.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && (c466310IQj = getLiveHighlightAnimHelper().LIZIZ) != null) {
                            c466310IQj.LIZLLL();
                            return;
                        }
                        return;
                    }
                    C466310IQj c466310IQj2 = getLiveHighlightAnimHelper().LIZIZ;
                    if (c466310IQj2 == null) {
                        return;
                    }
                    c466310IQj2.LIZJ();
                    return;
                }
                C20441214yg.LJIIIZ("BottomTipsWidget", "startHighlightChange2Live");
                getLiveHighlightAnimHelper().LIZIZ();
                TuxTextView tvHighlightLiveSubTips = getTvHighlightLiveSubTips();
                if (tvHighlightLiveSubTips != null) {
                    C786410Ut5.B5(tvHighlightLiveSubTips, 0.0f);
                }
                C21415018rM tvLiveHighlightTips2 = getTvLiveHighlightTips();
                if (tvLiveHighlightTips2 != null) {
                    height = tvLiveHighlightTips2.getHeight();
                } else {
                    height = 0;
                }
                TuxTextView tvLiveHighlightCountDown = getTvLiveHighlightCountDown();
                if (tvLiveHighlightCountDown != null) {
                    tvLiveHighlightCountDown.setText(C497740JfY.LJIJJ(2131855401, "3"));
                }
                getLiveHighlightAnimHelper().LIZ(height, getTvLiveHighlightCountDown(), getTvLiveHighlightTips(), new AbstractC21629819ku() { // from class: X.19kt
                    @Override // X.AbstractC21629819ku
                    public final void LIZ() {
                        this.LIZ.LJIILL(height);
                    }
                });
                return;
            }
            LJIIL(false);
            return;
        }
        if (getTvLiveHighlightTips() != null && (tvLiveHighlightTips = getTvLiveHighlightTips()) != null && tvLiveHighlightTips.getHeight() > 0) {
            LJIIJJI();
        } else {
            HandlerHook.viewPost(this, new ARunnableS132S0100000_32(this, 32));
        }
    }

    public final void LJIIL(boolean z) {
        String strLJI;
        C339190DRl.LIZLLL(getLivingFromXml());
        int i = 8;
        if (this.LLJJL != 8) {
            setVisibilityOfAutoEnter(8);
        }
        int lavLivingAnimDegradeState = getLavLivingAnimDegradeState();
        int i2 = 0;
        if (lavLivingAnimDegradeState != 2) {
            if (lavLivingAnimDegradeState != 4) {
                C19631511rN livingIconAnimationViewFromXml = getLivingIconAnimationViewFromXml();
                if (z) {
                    i2 = 8;
                }
                C786410Ut5.LLJJIJIIJIL(livingIconAnimationViewFromXml, i2);
                C786410Ut5.LLLLLLZZ(getIconLivePlayingFromXml(), 8);
            } else {
                C786410Ut5.LLJJIJIIJIL(getLivingIconAnimationViewFromXml(), 8);
                C786410Ut5.LLLLLLZZ(getIconLivePlayingFromXml(), 8);
            }
        } else {
            C786410Ut5.LLJJIJIIJIL(getLivingIconAnimationViewFromXml(), 8);
            TuxIconView iconLivePlayingFromXml = getIconLivePlayingFromXml();
            if (!z) {
                i = 0;
            }
            C786410Ut5.LLLLLLZZ(iconLivePlayingFromXml, i);
        }
        if (this.LLJIJIL != null) {
            strLJI = C1ABT.LJI(getContext(), z);
        } else {
            strLJI = null;
        }
        getTvLiveTipsFromXml().setText(strLJI);
        C1ACA c1aca = this.LLJIJIL;
        if (c1aca != null) {
            c1aca.LJIILL = strLJI;
        }
        if (this.LLJJI) {
            C500260Jjc.LJJLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(57)), getLivingFromXml());
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.19ks] */
    public final void LJIILL(final float f) {
        C21629119kn liveHighlightAnimHelper = getLiveHighlightAnimHelper();
        final TuxTextView tvLiveHighlightCountDown = getTvLiveHighlightCountDown();
        final ?? r2 = new AbstractC21629819ku() { // from class: X.19ks
            @Override // X.AbstractC21629819ku
            public final void LIZ() {
                this.LIZ.LIZJ(f);
            }
        };
        C466310IQj c466310IQj = liveHighlightAnimHelper.LIZIZ;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
        C466310IQj c466310IQj2 = new C466310IQj(((long) 3) * 1000, 1000L, new InterfaceC466320IQk() { // from class: X.19kq
            @Override // X.InterfaceC466320IQk
            public final void onStart() {
            }

            @Override // X.InterfaceC466320IQk
            public final void LIZLLL() {
                r2.LIZ();
            }

            @Override // X.InterfaceC466320IQk
            public final void LJJI(long j) {
                TuxTextView tuxTextView = tvLiveHighlightCountDown;
                if (tuxTextView != null) {
                    tuxTextView.setText(C497740JfY.LJIJJ(2131855401, Long.valueOf((j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1)));
                }
            }
        });
        liveHighlightAnimHelper.LIZIZ = c466310IQj2;
        c466310IQj2.LJ();
    }

    public final void setAutoEnterListener(InterfaceC21566419ag interfaceC21566419ag) {
        this.LLJJIJI = interfaceC21566419ag;
    }

    public final void setIconLivePlayingFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setLivingFromXml(ViewGroup viewGroup) {
        this.LLILZIL = viewGroup;
    }

    public final void setLivingIconAnimationViewFromXml(C19631511rN c19631511rN) {
        this.LLILZ = c19631511rN;
    }

    public final void setPreviewContextData(C1ACA c1aca) {
        this.LLJIJIL = c1aca;
    }

    public final void setPreviewLiveSubTips(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setRealTimeLiveCTAContainer(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setTvHighlightLiveSubTips(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setTvLiveHighlightContainer(LinearLayout linearLayout) {
        this.LLJILJIL = linearLayout;
    }

    public final void setTvLiveHighlightCountDown(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setTvLiveHighlightTips(C21415018rM c21415018rM) {
        this.LLJILJILJ = c21415018rM;
    }

    public final void setTvLiveTipsFromXml(C434000H0c c434000H0c) {
        this.LLIZ = c434000H0c;
    }

    public final void setVisibilityOfAutoEnter(int i) {
        C786410Ut5.LJZL(i, getAutoEnter());
        this.LLJJL = i;
    }

    public C21629019km(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(240));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(551));
        this.LLJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 468));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3837));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(550));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3834));
        this.LLJJL = 8;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3835));
        this.LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3836));
        this.LLJLL = true;
        this.LLJLLIL = new LinkedHashMap();
        this.LLJLLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 306));
        this.LLJZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1070));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1071));
        C786410Ut5.LJLLJ(context, R.layout.dg4, this);
        ViewStub viewStub = (ViewStub) findViewById(R.id.chk);
        if (viewStub != null) {
            C786410Ut5.LJLLLL(viewStub);
        }
        getLivingIconAnimationViewFromXml().LIZJ(EnumC21569519bB.LIVE_PREVIEW_LIVING_ICON_NEW);
        getLivingIconAnimationViewFromXml().setRenderInterval(getDropFrameInterval());
    }
}
