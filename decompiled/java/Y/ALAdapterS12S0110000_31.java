package Y;

import X.C118300cf;
import X.C1295960jpS;
import X.C15CQ;
import X.C15CY;
import X.C15IO;
import X.C444960Hcc;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.media.SoundPool;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.footnote.detail.ui.FootNoteRatingCardAssem;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class ALAdapterS12S0110000_31 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (3 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS12S0110000_31 aLAdapterS12S0110000_31, Animator animator) {
        final EndIncentiveSettlementFragment endIncentiveSettlementFragment;
        AnchorFinishEncourageData anchorFinishEncourageData;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo;
        List<AnchorFinishEncourageData.Task> list;
        if (aLAdapterS12S0110000_31.z1) {
            int i = C15CQ.LIZ[((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).LLJJJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (anchorFinishEncourageData = (endIncentiveSettlementFragment = (EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).LLJJJIL) != null && (liveJourneyInfo = anchorFinishEncourageData.liveJourneyInfo) != null && (list = liveJourneyInfo.taskList) != null && list.size() > 0 && endIncentiveSettlementFragment.RR() != null) {
                        final C118300cf c118300cf = new C118300cf();
                        c118300cf.element = 1;
                        final int size = endIncentiveSettlementFragment.LLLII.size();
                        final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(endIncentiveSettlementFragment.RR(), (Property<FrameLayout, Float>) View.SCALE_X, 0.9f, 1.1f);
                        final ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(endIncentiveSettlementFragment.RR(), (Property<FrameLayout, Float>) View.SCALE_Y, 0.9f, 1.1f);
                        final ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(endIncentiveSettlementFragment.RR(), (Property<FrameLayout, Float>) View.SCALE_X, 1.1f, 1.0f);
                        final ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(endIncentiveSettlementFragment.RR(), (Property<FrameLayout, Float>) View.SCALE_Y, 1.1f, 1.0f);
                        objectAnimatorOfFloat.setDuration(100L);
                        objectAnimatorOfFloat2.setDuration(100L);
                        objectAnimatorOfFloat3.setDuration(100L);
                        objectAnimatorOfFloat4.setDuration(100L);
                        objectAnimatorOfFloat.setStartDelay(200L);
                        objectAnimatorOfFloat2.setStartDelay(200L);
                        objectAnimatorOfFloat3.setStartDelay(300L);
                        objectAnimatorOfFloat4.setStartDelay(300L);
                        AnimatorSet animatorSet = new AnimatorSet();
                        endIncentiveSettlementFragment.LLJLILLLLZIIL = animatorSet;
                        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                        AnimatorSet animatorSet2 = endIncentiveSettlementFragment.LLJLILLLLZIIL;
                        if (animatorSet2 != null) {
                            animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.15CO
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator2) {
                                    String str;
                                    AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo2;
                                    AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo;
                                    long jLongValue;
                                    int i2 = c118300cf.element;
                                    if (i2 < size) {
                                        EndIncentiveSettlementFragment endIncentiveSettlementFragment2 = endIncentiveSettlementFragment;
                                        Long l = (Long) C13LP.LJJJLZIJ(i2, endIncentiveSettlementFragment2.LLLII);
                                        if (l != null) {
                                            jLongValue = l.longValue();
                                        } else {
                                            jLongValue = 0;
                                        }
                                        endIncentiveSettlementFragment2.kS(String.valueOf(jLongValue));
                                        if (c118300cf.element == 1) {
                                            objectAnimatorOfFloat.setStartDelay(0L);
                                            objectAnimatorOfFloat2.setStartDelay(0L);
                                            objectAnimatorOfFloat3.setStartDelay(100L);
                                            objectAnimatorOfFloat4.setStartDelay(100L);
                                        } else {
                                            objectAnimatorOfFloat.setStartDelay(100L);
                                            objectAnimatorOfFloat2.setStartDelay(100L);
                                            objectAnimatorOfFloat3.setStartDelay(200L);
                                            objectAnimatorOfFloat4.setStartDelay(200L);
                                        }
                                        AnimatorSet animatorSet3 = endIncentiveSettlementFragment.LLJLILLLLZIIL;
                                        if (animatorSet3 != null) {
                                            animatorSet3.start();
                                        }
                                    } else {
                                        EndIncentiveSettlementFragment endIncentiveSettlementFragment3 = endIncentiveSettlementFragment;
                                        if (endIncentiveSettlementFragment3.LLJJLIIIJLLLLLLLZ) {
                                            FrameLayout frameLayoutRR = endIncentiveSettlementFragment3.RR();
                                            if (frameLayoutRR != null) {
                                                C786410Ut5.LJZ(8, frameLayoutRR);
                                            }
                                            EndIncentiveSettlementFragment endIncentiveSettlementFragment4 = endIncentiveSettlementFragment;
                                            C16F5 c16f5WR = endIncentiveSettlementFragment4.WR();
                                            AnchorFinishEncourageData anchorFinishEncourageData2 = endIncentiveSettlementFragment.LLJJJIL;
                                            if (anchorFinishEncourageData2 != null && (liveJourneyInfo2 = anchorFinishEncourageData2.liveJourneyInfo) != null && (upgradeLevelInfo = liveJourneyInfo2.upgradeLevelInfo) != null) {
                                                str = upgradeLevelInfo.title;
                                            } else {
                                                str = null;
                                            }
                                            endIncentiveSettlementFragment4.Fx(c16f5WR, str);
                                            EndIncentiveSettlementFragment endIncentiveSettlementFragment5 = endIncentiveSettlementFragment;
                                            endIncentiveSettlementFragment5.sf(endIncentiveSettlementFragment5.WR());
                                            endIncentiveSettlementFragment.hS();
                                            endIncentiveSettlementFragment.LLLFF = SystemClock.uptimeMillis();
                                            endIncentiveSettlementFragment.cS(true);
                                        }
                                    }
                                    c118300cf.element++;
                                }
                            });
                        }
                        AnimatorSet animatorSet3 = endIncentiveSettlementFragment.LLJLILLLLZIIL;
                        if (animatorSet3 != null) {
                            animatorSet3.start();
                        }
                        if (endIncentiveSettlementFragment.LLJJLIIIJLLLLLLLZ) {
                            C786410Ut5.LJLIIL(1800L, endIncentiveSettlementFragment.PR(), new Runnable() { // from class: X.0uM7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("EndIncentiveSettlementFragment@1262.playLiveJourneyIntegralBg$2");
                                    try {
                                        C194305110d.LIZJ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("EndIncentiveSettlementFragment@1262.playLiveJourneyIntegralBg$2");
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                ((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).LLLFF = SystemClock.uptimeMillis();
                C1295960jpS c1295960jpSUR = ((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).UR();
                if (c1295960jpSUR != null) {
                    c1295960jpSUR.playAnimation();
                }
                C786410Ut5.LJLIIL(1100L, ((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).PR(), new Runnable() { // from class: X.0uM8
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EndIncentiveSettlementFragment@1262.playAlphaShowAnim$1$1$onAnimationEnd$2");
                        try {
                            C194305110d.LIZJ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EndIncentiveSettlementFragment@1262.playAlphaShowAnim$1$1$onAnimationEnd$2");
                    }
                });
                return;
            }
            ((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).LLLFF = SystemClock.uptimeMillis();
            C1295960jpS c1295960jpSUR2 = ((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).UR();
            if (c1295960jpSUR2 != null) {
                c1295960jpSUR2.playAnimation();
            }
            C786410Ut5.LJLIIL(3000L, ((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).PR(), new Runnable() { // from class: X.0uM9
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EndIncentiveSettlementFragment@1262.playAlphaShowAnim$1$1$onAnimationEnd$1");
                    try {
                        if (C194305110d.LIZLLL == 0) {
                            C194305110d.LIZLLL();
                        }
                        try {
                            SoundPool soundPool = C194305110d.LIZ;
                            if (soundPool != null) {
                                soundPool.play(C194305110d.LIZLLL, 1.0f, 1.0f, 1, 0, 1.0f);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EndIncentiveSettlementFragment@1262.playAlphaShowAnim$1$1$onAnimationEnd$1");
                }
            });
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS12S0110000_31 aLAdapterS12S0110000_31, Animator animator) {
        EndIncentiveSettlementFragment endIncentiveSettlementFragment = (EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0;
        endIncentiveSettlementFragment.LLLFFI = true;
        String str = "auto";
        if (aLAdapterS12S0110000_31.z1) {
            if (!endIncentiveSettlementFragment.LLL && endIncentiveSettlementFragment.LLLI) {
                str = "click";
            }
            C15CY.LJIILIIL(2700L, SystemClock.uptimeMillis() - ((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).LLLFF, "achievement", str);
            return;
        }
        if (!endIncentiveSettlementFragment.LLL && endIncentiveSettlementFragment.LLLI) {
            str = "click";
        }
        C15CY.LJIILIIL(1700L, SystemClock.uptimeMillis() - ((EndIncentiveSettlementFragment) aLAdapterS12S0110000_31.l0).LLLFF, LiveCenterMockToolSwitch.LIVEJOURNEY, str);
    }

    public static final void onAnimationEnd$2(ALAdapterS12S0110000_31 aLAdapterS12S0110000_31, Animator animator) {
        ((C15IO) aLAdapterS12S0110000_31.l0).LLJJI.setClickable(true);
        if (aLAdapterS12S0110000_31.z1) {
            C786410Ut5.LJLZ(8, ((C15IO) aLAdapterS12S0110000_31.l0).LLJI);
            ((C15IO) aLAdapterS12S0110000_31.l0).LLJI.clearAnimation();
            if (C444960Hcc.LIZJ(((C15IO) aLAdapterS12S0110000_31.l0).LLJL)) {
                ((ViewGroup.MarginLayoutParams) ((C15IO) aLAdapterS12S0110000_31.l0).LLJJ.getLayoutParams()).leftMargin = 0;
            } else {
                ((ViewGroup.MarginLayoutParams) ((C15IO) aLAdapterS12S0110000_31.l0).LLJJ.getLayoutParams()).rightMargin = 0;
            }
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS12S0110000_31 aLAdapterS12S0110000_31, Animator animator) {
        if (!aLAdapterS12S0110000_31.z1) {
            ((FootNoteRatingCardAssem) aLAdapterS12S0110000_31.l0).Ep(false);
        }
        TuxTextView tuxTextView = ((FootNoteRatingCardAssem) aLAdapterS12S0110000_31.l0).LLLFF;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS12S0110000_31 aLAdapterS12S0110000_31, Animator animator) {
        if (aLAdapterS12S0110000_31.z1) {
            ((FootNoteRatingCardAssem) aLAdapterS12S0110000_31.l0).Ep(true);
        }
        TuxTextView tuxTextView = ((FootNoteRatingCardAssem) aLAdapterS12S0110000_31.l0).LLLFF;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 4);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS12S0110000_31(com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS12S0110000_31.<init>(com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment, boolean, int):void");
    }

    public ALAdapterS12S0110000_31(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
