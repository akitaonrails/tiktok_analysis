package X;

import Y.ALAdapterS11S0100000_15;
import Y.AUListenerS264S0100000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAICommentEntranceCheckBugfixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAICommentaryVoiceVisualisationSettings;

/* JADX INFO: renamed from: X.0bmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986580bmS extends FrameLayout {
    public final C1324720kZq LL;
    public final C1324720kZq LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C1324720kZq LLILZ;
    public final C1324720kZq LLILZIL;
    public C1143920fsE LLILZLL;
    public C1143920fsE LLIZ;
    public C1143920fsE LLIZLLLIL;
    public C1143920fsE LLJ;
    public C1143920fsE LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public int LLJJJIL;
    public ValueAnimator LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public EnumC986590bmT LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;

    public final void LIZ() {
        setPivotX(0.0f);
        setPivotY(0.0f);
        float f = this.LLJZ ? this.LLJJJ : this.LLJJIJIL;
        float scaleX = getScaleX();
        if (Math.abs(scaleX - f) < 0.001f) {
            return;
        }
        ValueAnimator valueAnimator = this.LLJJJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(scaleX, f);
        valueAnimatorOfFloat.setDuration(this.LLJJJIL);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS264S0100000_15(this, 2));
        this.LLJJJJ = valueAnimatorOfFloat;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateToTargetScale from=");
        sbLIZ.append(scaleX);
        sbLIZ.append(" to=");
        sbLIZ.append(f);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LLJJJIL);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        ValueAnimator valueAnimator2 = this.LLJJJJ;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    public final void LIZIZ() {
        if (LiveMatchAICommentEntranceCheckBugfixSetting.INSTANCE.isEnabled()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyState desiredTalking=");
            sbLIZ.append(this.LLJZ);
            sbLIZ.append(", smallLoopReady=");
            sbLIZ.append(this.LLJJIII);
            sbLIZ.append(", bigLoopReady=");
            sbLIZ.append(this.LLJJIJI);
            sbLIZ.append(", currentPhase=");
            sbLIZ.append(this.LLJLLL);
            sbLIZ.append(", deferStartUntilVisible=");
            sbLIZ.append(this.LLL);
            sbLIZ.append(", entranceInProgress=");
            sbLIZ.append(this.LLJL);
            sbLIZ.append(", needPlayEntranceOnNextVisible=");
            sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyState desiredTalking=");
            sbLIZ2.append(this.LLJZ);
            sbLIZ2.append(", smallLoopReady=");
            sbLIZ2.append(this.LLJJIII);
            sbLIZ2.append(", bigLoopReady=");
            sbLIZ2.append(this.LLJJIJI);
            sbLIZ2.append(", currentPhase=");
            sbLIZ2.append(this.LLJLLL);
            sbLIZ2.append(", deferStartUntilVisible=");
            sbLIZ2.append(this.LLL);
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!this.LLJJIII && !this.LLJJIJI) {
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "applyState deferred: no loop resource ready yet");
            return;
        }
        if (this.LLL && getVisibility() != 0) {
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "applyState deferred until visible");
            return;
        }
        if (this.LLJL || this.LLJJLIIIJLLLLLLLZ) {
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "applyState deferred: entrance animation pending/in-progress");
            return;
        }
        if (LJ()) {
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "applyState pendingTransition set: will transition at loop boundary");
            this.LLJZIJLIL = true;
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("applyState immediate start -> ");
        sbLIZ3.append(this.LLJZ ? "Big loop" : "Small loop");
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ3));
        LIZ();
        if (this.LLJZ) {
            LJI();
        } else {
            LJIIIIZZ();
        }
    }

    public final boolean LJ() {
        C1143920fsE c1143920fsE;
        if (LiveMatchAICommentEntranceCheckBugfixSetting.INSTANCE.isEnabled() && (this.LLJL || ((c1143920fsE = this.LLJI) != null && c1143920fsE.LIZJ()))) {
            return true;
        }
        int iOrdinal = this.LLJLLL.ordinal();
        if (iOrdinal == 0) {
            C1143920fsE c1143920fsE2 = this.LLILZLL;
            if (c1143920fsE2 == null || !c1143920fsE2.LIZJ()) {
                return false;
            }
        } else if (iOrdinal == 1) {
            C1143920fsE c1143920fsE3 = this.LLJ;
            if (c1143920fsE3 == null || !c1143920fsE3.LIZJ()) {
                return false;
            }
        } else if (iOrdinal == 2) {
            C1143920fsE c1143920fsE4 = this.LLIZ;
            if (c1143920fsE4 == null || !c1143920fsE4.LIZJ()) {
                return false;
            }
        } else {
            if (iOrdinal != 3) {
                throw new C1954807lC();
            }
            C1143920fsE c1143920fsE5 = this.LLIZLLLIL;
            if (c1143920fsE5 == null || !c1143920fsE5.LIZJ()) {
                return false;
            }
        }
        return true;
    }

    public final void LJFF() {
        if (!this.LLJJIJIIJIL) {
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "playEntranceThenContinue aborted: entrance not ready");
            return;
        }
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "playEntranceThenContinue start");
        this.LLJL = true;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
        C1143920fsE c1143920fsE = this.LLILZLL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C1143920fsE c1143920fsE2 = this.LLJ;
        if (c1143920fsE2 != null) {
            c1143920fsE2.LIZ();
        }
        C1143920fsE c1143920fsE3 = this.LLIZ;
        if (c1143920fsE3 != null) {
            c1143920fsE3.LIZ();
        }
        C1143920fsE c1143920fsE4 = this.LLIZLLLIL;
        if (c1143920fsE4 != null) {
            c1143920fsE4.LIZ();
        }
        setOnlyVisible(this.LLILZIL);
        ValueAnimator valueAnimator = this.LLJJJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setPivotX(0.0f);
        setPivotY(0.0f);
        C786410Ut5.cc(this, 0.0f);
        C786410Ut5.zc(this, 0.0f);
        C1143920fsE c1143920fsE5 = this.LLJI;
        if (c1143920fsE5 != null) {
            c1143920fsE5.LJFF();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.2f);
        valueAnimatorOfFloat.setDuration(this.LLJJJJJIL);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS264S0100000_15(this, 13));
        valueAnimatorOfFloat.addListener(new ALAdapterS11S0100000_15(this, 15));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entrance scale animation start: upDuration=");
        sbLIZ.append(this.LLJJJJJIL);
        sbLIZ.append(", holdMs=");
        sbLIZ.append(this.LLJJJJLIIL);
        sbLIZ.append(", downDuration=");
        sbLIZ.append(this.LLJJL);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        valueAnimatorOfFloat.start();
    }

    public final void LJI() {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "startBigLoop");
        C1143920fsE c1143920fsE = this.LLILZLL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C1143920fsE c1143920fsE2 = this.LLIZ;
        if (c1143920fsE2 != null) {
            c1143920fsE2.LIZ();
        }
        C1143920fsE c1143920fsE3 = this.LLIZLLLIL;
        if (c1143920fsE3 != null) {
            c1143920fsE3.LIZ();
        }
        setOnlyVisible(this.LLILZ);
        C1143920fsE c1143920fsE4 = this.LLJ;
        if (c1143920fsE4 != null) {
            c1143920fsE4.LJFF();
        }
        this.LLJLLL = EnumC986590bmT.LLILLJJLI;
    }

    public final void LJII() {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "startInitialLoop");
        if (this.LLJZ) {
            if (this.LLJJIJI) {
                LJI();
            }
        } else if (this.LLJJIII) {
            LJIIIIZZ();
        }
    }

    public final void LJIIIIZZ() {
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "startSmallLoop");
        C1143920fsE c1143920fsE = this.LLJ;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C1143920fsE c1143920fsE2 = this.LLIZ;
        if (c1143920fsE2 != null) {
            c1143920fsE2.LIZ();
        }
        C1143920fsE c1143920fsE3 = this.LLIZLLLIL;
        if (c1143920fsE3 != null) {
            c1143920fsE3.LIZ();
        }
        setOnlyVisible(this.LL);
        C1143920fsE c1143920fsE4 = this.LLILZLL;
        if (c1143920fsE4 != null) {
            c1143920fsE4.LJFF();
        }
        this.LLJLLL = EnumC986590bmT.LL;
    }

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("continueFromEntrance desiredTalking=");
        sbLIZ.append(this.LLJZ);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
        if (this.LLJZ) {
            if (this.LLJJIJI) {
                LJI();
            } else {
                C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Big loop not ready yet; will start when ready");
            }
        } else if (this.LLJJIII) {
            LJIIIIZZ();
        } else {
            C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Small loop not ready yet; will start when ready");
        }
        LIZ();
    }

    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleLoopRepeat pendingTransition=");
        sbLIZ.append(this.LLJZIJLIL);
        sbLIZ.append(", desiredTalking=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(", currentPhase=");
        sbLIZ.append(this.LLJLLL);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJZIJLIL) {
            this.LLJZIJLIL = false;
            if (this.LLJZ) {
                if (this.LLJLLL == EnumC986590bmT.LL) {
                    C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "handleLoopRepeat: play Small->Big then Big loop");
                    LIZ();
                    C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "play Small->Big then Big loop");
                    C1143920fsE c1143920fsE = this.LLILZLL;
                    if (c1143920fsE != null) {
                        c1143920fsE.LIZ();
                    }
                    setOnlyVisible(this.LLILLJJLI);
                    C1143920fsE c1143920fsE2 = this.LLIZ;
                    if (c1143920fsE2 != null) {
                        c1143920fsE2.LJFF();
                    }
                    this.LLJLLL = EnumC986590bmT.LLILLL;
                    return;
                }
                return;
            }
            if (this.LLJLLL == EnumC986590bmT.LLILLJJLI) {
                C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "handleLoopRepeat: play Big->Small then Small loop");
                LIZ();
                C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "play Big->Small then Small loop");
                C1143920fsE c1143920fsE3 = this.LLJ;
                if (c1143920fsE3 != null) {
                    c1143920fsE3.LIZ();
                }
                setOnlyVisible(this.LLILLL);
                C1143920fsE c1143920fsE4 = this.LLIZLLLIL;
                if (c1143920fsE4 != null) {
                    c1143920fsE4.LJFF();
                }
                this.LLJLLL = EnumC986590bmT.LLILZ;
            }
        }
    }

    private final void setOnlyVisible(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        C1324720kZq c1324720kZq = this.LL;
        int i5 = 0;
        if (view == c1324720kZq) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLJJIII(c1324720kZq, i);
        C1324720kZq c1324720kZq2 = this.LLILLJJLI;
        if (view == c1324720kZq2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLJJIII(c1324720kZq2, i2);
        C1324720kZq c1324720kZq3 = this.LLILLL;
        if (view == c1324720kZq3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LLJJIII(c1324720kZq3, i3);
        C1324720kZq c1324720kZq4 = this.LLILZ;
        if (view == c1324720kZq4) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LLJJIII(c1324720kZq4, i4);
        C1324720kZq c1324720kZq5 = this.LLILZIL;
        if (view != c1324720kZq5) {
            i5 = 8;
        }
        C786410Ut5.LLJJIII(c1324720kZq5, i5);
    }

    public final void setTalking(boolean z) {
        boolean z2 = this.LLJLLIL;
        this.LLJLLIL = z;
        this.LLJZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isTalking changed: prev=");
        sbLIZ.append(z2);
        sbLIZ.append(", new=");
        sbLIZ.append(z);
        sbLIZ.append(", currentPhase=");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(", pendingTransition=");
        sbLIZ.append(this.LLJZIJLIL);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ();
    }

    public C986580bmS(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet, 0);
        C1324720kZq c1324720kZq = new C1324720kZq(context);
        C786410Ut5.u6(c1324720kZq, new FrameLayout.LayoutParams(-1, -1));
        C786410Ut5.LLJJIII(c1324720kZq, 0);
        this.LL = c1324720kZq;
        C1324720kZq c1324720kZq2 = new C1324720kZq(context);
        C786410Ut5.u6(c1324720kZq2, new FrameLayout.LayoutParams(-1, -1));
        C786410Ut5.LLJJIII(c1324720kZq2, 0);
        this.LLILLJJLI = c1324720kZq2;
        C1324720kZq c1324720kZq3 = new C1324720kZq(context);
        C786410Ut5.u6(c1324720kZq3, new FrameLayout.LayoutParams(-1, -1));
        C786410Ut5.LLJJIII(c1324720kZq3, 0);
        this.LLILLL = c1324720kZq3;
        C1324720kZq c1324720kZq4 = new C1324720kZq(context);
        C786410Ut5.u6(c1324720kZq4, new FrameLayout.LayoutParams(-1, -1));
        C786410Ut5.LLJJIII(c1324720kZq4, 0);
        this.LLILZ = c1324720kZq4;
        C1324720kZq c1324720kZq5 = new C1324720kZq(context);
        C786410Ut5.u6(c1324720kZq5, new FrameLayout.LayoutParams(-1, -1));
        C786410Ut5.LLJJIII(c1324720kZq5, 0);
        this.LLILZIL = c1324720kZq5;
        LiveMatchAICommentaryVoiceVisualisationSettings liveMatchAICommentaryVoiceVisualisationSettings = LiveMatchAICommentaryVoiceVisualisationSettings.INSTANCE;
        this.LLJJIJIL = liveMatchAICommentaryVoiceVisualisationSettings.getSmallScale();
        this.LLJJJ = liveMatchAICommentaryVoiceVisualisationSettings.getBigScale();
        this.LLJJJIL = liveMatchAICommentaryVoiceVisualisationSettings.getScaleAnimDurationMs();
        this.LLJJJJJIL = liveMatchAICommentaryVoiceVisualisationSettings.getEntranceScaleUpDurationMs();
        this.LLJJJJLIIL = liveMatchAICommentaryVoiceVisualisationSettings.getEntranceHoldAtBigDelayMs();
        this.LLJJL = liveMatchAICommentaryVoiceVisualisationSettings.getEntranceScaleDownDurationMs();
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJLL = true;
        setClipToPadding(false);
        setClipChildren(false);
        addView(c1324720kZq);
        addView(c1324720kZq2);
        addView(c1324720kZq3);
        addView(c1324720kZq4);
        addView(c1324720kZq5);
        C786410Ut5.cc(this, 0.75f);
        C786410Ut5.zc(this, 0.75f);
        setPivotX(0.0f);
        setPivotY(0.0f);
        float smallScale = liveMatchAICommentaryVoiceVisualisationSettings.getSmallScale();
        float bigScale = liveMatchAICommentaryVoiceVisualisationSettings.getBigScale();
        int scaleAnimDurationMs = liveMatchAICommentaryVoiceVisualisationSettings.getScaleAnimDurationMs();
        this.LLJJIJIL = smallScale;
        this.LLJJJ = bigScale;
        this.LLJJJIL = scaleAnimDurationMs;
        if (this.LLJZ) {
            f = bigScale;
        } else {
            f = smallScale;
        }
        C786410Ut5.cc(this, f);
        C786410Ut5.zc(this, f);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSizeScale smallScale=");
        sbLIZ.append(smallScale);
        sbLIZ.append(", bigScale=");
        sbLIZ.append(bigScale);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(scaleAnimDurationMs);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLL = EnumC986590bmT.LL;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVisibilityChanged visibility=");
        sbLIZ.append(i);
        sbLIZ.append(", deferStartUntilVisible=");
        sbLIZ.append(this.LLL);
        sbLIZ.append(", currentPhase=");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(", needPlayEntranceOnNextVisible=");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        sbLIZ.append(", entranceReady=");
        sbLIZ.append(this.LLJJIJIIJIL);
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 0) {
            if (this.LLJJLIIIJLLLLLLLZ) {
                if (this.LLJJIJIIJIL) {
                    LJFF();
                    return;
                } else {
                    C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Entrance not ready yet; will start when ready");
                    return;
                }
            }
            if (this.LLL) {
                this.LLL = false;
                LIZIZ();
                if (!LJ()) {
                    LJII();
                    return;
                }
                return;
            }
            if (LJ()) {
                return;
            }
            LJII();
            return;
        }
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "resetForNextShowWithoutReload");
        C1143920fsE c1143920fsE = this.LLILZLL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C1143920fsE c1143920fsE2 = this.LLIZ;
        if (c1143920fsE2 != null) {
            c1143920fsE2.LIZ();
        }
        C1143920fsE c1143920fsE3 = this.LLIZLLLIL;
        if (c1143920fsE3 != null) {
            c1143920fsE3.LIZ();
        }
        C1143920fsE c1143920fsE4 = this.LLJ;
        if (c1143920fsE4 != null) {
            c1143920fsE4.LIZ();
        }
        C1143920fsE c1143920fsE5 = this.LLJI;
        if (c1143920fsE5 != null) {
            c1143920fsE5.LIZ();
        }
        if (this.LLJLL) {
            this.LLJLL = false;
        } else {
            setOnlyVisible(this.LL);
        }
        this.LLJLLL = EnumC986590bmT.LL;
        this.LLJZIJLIL = false;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = false;
        ValueAnimator valueAnimator = this.LLJJJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C786410Ut5.cc(this, 0.0f);
        C786410Ut5.zc(this, 0.0f);
        this.LLL = true;
    }
}
