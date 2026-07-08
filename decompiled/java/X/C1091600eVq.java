package X;

import Y.AAListenerS139S0300000_17;
import Y.AAListenerS328S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveFeedIncentiveInfoConfig;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveFeedShowIncentiveTaskInfoSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091600eVq extends FrameLayout {
    public boolean LL;
    public final C1295960jpS LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;
    public AnimatorSet LLILZIL;

    public final void LIZ(boolean z) {
        View view = this.LLILZ;
        int i = 0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C1295960jpS c1295960jpS = this.LLILLJJLI;
        if (c1295960jpS != null) {
            if (z) {
                i = 8;
            }
            C786410Ut5.LLD(i, c1295960jpS);
        }
        if (z) {
            AnimatorSet animatorSet = this.LLILZIL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(C497740JfY.LJIJI(2131841722));
                return;
            }
            return;
        }
        LIZIZ("tips_show");
    }

    public final void LIZIZ(String str) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ICoinIncentiveService iCoinIncentiveServiceLJIILIIL;
        Boolean boolValueOf;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (iCoinIncentiveServiceLJIILIIL = interfaceC20673515v3K4.LJIILIIL()) != null) {
            iCoinIncentiveServiceLJIILIIL.Eq2();
            int group = LiveFeedShowIncentiveTaskInfoSetting.INSTANCE.getGroup();
            if (group != 0 && group != 1) {
                if (group != 2 && group != 3) {
                    if (group != 4 && group != 5) {
                        return;
                    }
                    AnimatorSet animatorSet = this.LLILZIL;
                    if (animatorSet != null) {
                        boolValueOf = Boolean.valueOf(animatorSet.isRunning());
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        return;
                    }
                    this.LLILZIL = null;
                    final String strLJIJI = C497740JfY.LJIJI(2131836267);
                    final String strLJIJI2 = C497740JfY.LJIJI(2131836268);
                    TuxTextView tuxTextView = this.LLILLL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(strLJIJI);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addListener(new AAListenerS328S0100000_17(this, 18));
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 51));
                    valueAnimatorOfFloat.setDuration(700L);
                    valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f));
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: X.0eVp
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            String str2;
                            TuxTextView tuxTextView2 = this.LL.LLILLL;
                            if (tuxTextView2 != null) {
                                if (Intrinsics.LJFF(String.valueOf(tuxTextView2.getText()), strLJIJI)) {
                                    str2 = strLJIJI2;
                                } else {
                                    str2 = strLJIJI;
                                }
                                tuxTextView2.setText(str2);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            TuxTextView tuxTextView2 = this.LL.LLILLL;
                            if (tuxTextView2 != null) {
                                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                            }
                        }
                    });
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS266S0100000_17(this, 50));
                    valueAnimatorOfFloat2.setDuration(300L);
                    valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f));
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat3.setDuration(LiveFeedIncentiveInfoConfig.INSTANCE.getTipsAnimFirstDelay());
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(valueAnimatorOfFloat3, valueAnimatorOfFloat2, valueAnimatorOfFloat);
                    animatorSet2.addListener(new AAListenerS139S0300000_17(valueAnimatorOfFloat3, animatorSet2, this, 1));
                    this.LLILZIL = animatorSet2;
                    animatorSet2.start();
                    return;
                }
                TuxTextView tuxTextView2 = this.LLILLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(C497740JfY.LJIJI(2131836266));
                }
                TuxTextView tuxTextView3 = this.LLILLL;
                if (tuxTextView3 == null) {
                    return;
                }
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
                return;
            }
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            }
            TuxTextView tuxTextView5 = this.LLILLL;
            if (tuxTextView5 == null) {
                return;
            }
            tuxTextView5.setText(C497740JfY.LJIJI(2131841726));
        }
    }

    public C1091600eVq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.LJLLJ(context, R.layout.dg3, this);
        this.LLILLJJLI = (C1295960jpS) findViewById(R.id.nu2);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.tv_tips);
        this.LLILLL = tuxTextView;
        this.LLILZ = findViewById(R.id.n9k);
        if (tuxTextView != null) {
            tuxTextView.setMaxWidth(C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(100.0f)));
            tuxTextView.setMinTextSize(14.0f);
            tuxTextView.LJJJJI(17.0f);
        }
    }
}
