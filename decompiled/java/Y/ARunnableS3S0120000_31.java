package Y;

import X.C1142950fqf;
import X.C11VU;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C15DF;
import X.C1619980sG4;
import X.C16HO;
import X.C197039127h;
import X.C1C7U;
import X.C20338914iB;
import X.C20441214yg;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C631370Opb;
import X.C631450Opj;
import X.C786410Ut5;
import X.C814420VxA;
import X.C915980Zwa;
import X.C970370bMJ;
import X.EnumC1877260yx2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.match.business.event.ScoreRevealStateChannel;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.matchv2.service.LiveMatchService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.minis.debug.ui.MinisDebugSettingFragment;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS3S0120000_31 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C15DF c15df = (C15DF) this.l0;
        boolean z = this.z1;
        boolean z2 = this.z2;
        AnimatorSet animatorSet = c15df.LLLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        c15df.LLLL = null;
        c15df.LLLJL = z;
        ILiveMatchService iLiveMatchServiceLJFF = C915980Zwa.LJFF();
        LiveMatchService liveMatchService = iLiveMatchServiceLJFF instanceof LiveMatchService ? (LiveMatchService) iLiveMatchServiceLJFF : null;
        if (liveMatchService != null) {
            liveMatchService.LLILLL = z;
            if (!z) {
                liveMatchService.LLILZ = false;
            }
            if (z2) {
                liveMatchService.LLILZ = true;
            }
        }
        DataChannel dataChannel = c15df.LLJJJJLIIL;
        if (dataChannel != null) {
            dataChannel.zW(ScoreRevealStateChannel.class, Boolean.valueOf(z));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleScoreRevealStateChanged: isRevealing=");
        sbLIZ.append(z);
        sbLIZ.append(", skipAnimation=");
        sbLIZ.append(z2);
        sbLIZ.append(", isIndividual=");
        sbLIZ.append(C970370bMJ.LJ());
        sbLIZ.append(", hasFirstRankIndex=");
        sbLIZ.append(c15df.LLJJJIL);
        sbLIZ.append(", hasRivalSmoke=");
        sbLIZ.append(c15df.LLJJIJIL);
        sbLIZ.append(", lastLeftEnigma=");
        sbLIZ.append(c15df.LLJJ);
        sbLIZ.append(", lastRightEnigma=");
        sbLIZ.append(c15df.LLJJI);
        sbLIZ.append(", isUserInEnigma=");
        sbLIZ.append(c15df.LLLILZLLLI);
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            if (!C970370bMJ.LJ() || !c15df.LLLLLJIL) {
                C15DF.LIZLLL(c15df);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleIndividualMatchHide: restoring to originalFirst=");
            sbLIZ2.append(c15df.LLLLLIL);
            C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ2));
            int i = c15df.LLLLLIL;
            c15df.LLLLLJLJLL = true;
            C15DF.LIZLLL(c15df);
            HandlerHook.viewPostDelay(c15df, new ARunnableS42S0101000_31(i, c15df, 7), 750L);
            return;
        }
        c15df.LLLLLJLJLL = false;
        if (!z2) {
            if (!C970370bMJ.LJ() || !c15df.LLJJJIL) {
                c15df.LJ();
                return;
            }
            int i2 = (int) c15df.LLJILJILJ;
            int iLJIIIZ = C15DF.LJIIIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleIndividualMatchReveal: currentFirst=");
            sbLIZ3.append(i2);
            sbLIZ3.append(", trueFirst=");
            sbLIZ3.append(iLJIIIZ);
            C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ3));
            if (iLJIIIZ < 0 || iLJIIIZ == i2) {
                c15df.LLLLLJIL = false;
                c15df.LLLLLIL = -1;
                c15df.LLLLLILLIL = -1;
                c15df.LJ();
                return;
            }
            c15df.LLLLLJIL = true;
            c15df.LLLLLIL = i2;
            c15df.LLLLLILLIL = iLJIIIZ;
            c15df.LJJIJ(iLJIIIZ);
            HandlerHook.viewPost(c15df, new ARunnableS120S0100000_20(c15df, 156));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("applyRevealStateImmediately: isIndividual=");
        sbLIZ4.append(C970370bMJ.LJ());
        sbLIZ4.append(", hasFirstRankIndex=");
        sbLIZ4.append(c15df.LLJJJIL);
        sbLIZ4.append(", leftEnigma=");
        sbLIZ4.append(c15df.LLJJ);
        sbLIZ4.append(", rightEnigma=");
        sbLIZ4.append(c15df.LLJJI);
        sbLIZ4.append(", hasRivalSmoke=");
        sbLIZ4.append(c15df.LLJJIJIL);
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ4));
        if (!C970370bMJ.LJ() || !c15df.LLJJJIL) {
            if (!c15df.LLLILZLLLI && c15df.LLJJ > 0) {
                c15df.LJJIJIL(c15df.LLLLJI, true);
                TuxTextView tuxTextView = c15df.LLLLJI;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    C786410Ut5.B5(tuxTextView, 1.0f);
                }
                C786410Ut5.LL(8, (ConstraintLayout) c15df.findViewById(R.id.mjz));
            }
            if (c15df.LLJJI > 0 && !c15df.LLJJIJIL) {
                c15df.LJJIJIL(c15df.LLLLL, false);
                TuxTextView tuxTextView2 = c15df.LLLLL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    C786410Ut5.B5(tuxTextView2, 1.0f);
                }
                View view = c15df.LLJLL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(4, view);
                }
            }
            C1142950fqf c1142950fqf = c15df.LLJI;
            if (c1142950fqf != null) {
                c1142950fqf.LJIIIZ();
            }
            c15df.LJJIJIIJI();
            return;
        }
        int i3 = (int) c15df.LLJILJILJ;
        int iLJIIIZ2 = C15DF.LJIIIZ();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("applyIndividualRevealImmediately: currentFirst=");
        sbLIZ5.append(i3);
        sbLIZ5.append(", trueFirst=");
        sbLIZ5.append(iLJIIIZ2);
        sbLIZ5.append(", leftEnigma=");
        sbLIZ5.append(c15df.LLJJ);
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ5));
        if (iLJIIIZ2 < 0 || iLJIIIZ2 == i3) {
            c15df.LLLLLJIL = false;
        } else {
            c15df.LLLLLJIL = true;
            c15df.LLLLLIL = i3;
            c15df.LLLLLILLIL = iLJIIIZ2;
            c15df.LJJIJ(iLJIIIZ2);
        }
        if (!c15df.LLLILZLLLI && c15df.LLJJ > 0) {
            c15df.LJJIJIL(c15df.LLLLJI, true);
            TuxTextView tuxTextView3 = c15df.LLLLJI;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
                C786410Ut5.B5(tuxTextView3, 1.0f);
            }
            C786410Ut5.LL(8, (ConstraintLayout) c15df.findViewById(R.id.mjz));
        }
        c15df.LJIIIIZZ();
        C1142950fqf c1142950fqf2 = c15df.LLJI;
        if (c1142950fqf2 != null) {
            c1142950fqf2.LJIIIZ();
        }
        c15df.LJJIJIIJI();
    }

    public final void LIZ$1() {
        boolean z;
        double d;
        final int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (((EarlyFeedbackButtonAssem) this.l0).LJJIJL().getParent() != null) {
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem = (EarlyFeedbackButtonAssem) this.l0;
            earlyFeedbackButtonAssem.LLLFF = earlyFeedbackButtonAssem.LJJIJL().getMeasuredWidth();
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem2 = (EarlyFeedbackButtonAssem) this.l0;
            if (earlyFeedbackButtonAssem2.LLLFF <= 0) {
                earlyFeedbackButtonAssem2.LLLFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(270));
            }
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem3 = (EarlyFeedbackButtonAssem) this.l0;
            earlyFeedbackButtonAssem3.LLLFFI = (earlyFeedbackButtonAssem3.LLLFF - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / 2;
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem4 = (EarlyFeedbackButtonAssem) this.l0;
            C197039127h c197039127h = earlyFeedbackButtonAssem4.LLJLLL;
            if (c197039127h != null) {
                boolean z2 = this.z2;
                ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = earlyFeedbackButtonAssem4.LLLFFI;
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f)));
                C786410Ut5.W5(c197039127h, layoutParams);
                c197039127h.LJJJJL(new AwS610S0100000_31(c197039127h, 533));
                C786410Ut5.w5(c197039127h, 1.0f);
                z = true;
                d = 11.0d;
                C631450Opj.LIZ(c197039127h, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
                C786410Ut5.LLLLLLJ(c197039127h, 0);
                c197039127h.LJJJJLI(true);
                if (z2) {
                    c197039127h.setMinTextSizePx(C11VU.LIZJ(11.0d, c197039127h.getContext()));
                    c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_tick_fill_small));
                    c197039127h.setIconTintColor(-1);
                }
            } else {
                z = true;
                d = 11.0d;
            }
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem5 = (EarlyFeedbackButtonAssem) this.l0;
            C197039127h c197039127h2 = earlyFeedbackButtonAssem5.LLJZ;
            if (c197039127h2 != null) {
                boolean z3 = this.z2;
                ViewGroup.LayoutParams layoutParams2 = c197039127h2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = earlyFeedbackButtonAssem5.LLLFFI;
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f)));
                C786410Ut5.W5(c197039127h2, layoutParams2);
                c197039127h2.LJJJJL(new AwS610S0100000_31(c197039127h2, 534));
                C786410Ut5.w5(c197039127h2, 1.0f);
                C631450Opj.LIZ(c197039127h2, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
                C786410Ut5.LLLLLLJ(c197039127h2, 0);
                c197039127h2.LJJJJLI(z);
                if (z3) {
                    c197039127h2.setMinTextSizePx(C11VU.LIZJ(d, c197039127h2.getContext()));
                    c197039127h2.setButtonStartIcon(Integer.valueOf(R.raw.icon_x_mark_small));
                    c197039127h2.setIconTintColor(-1);
                    C786410Ut5.x3(c197039127h2.getViewTreeObserver(), new C16HO(earlyFeedbackButtonAssem5, c197039127h2, 4));
                }
            }
            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem6 = (EarlyFeedbackButtonAssem) this.l0;
            View view = earlyFeedbackButtonAssem6.LLJLLIL;
            if (view != null) {
                boolean z4 = this.z1;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams3.width = earlyFeedbackButtonAssem6.LLLFF;
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(36.0f)));
                C786410Ut5.W5(view, layoutParams3);
                C786410Ut5.T4(view, z4 ? 0.0f : 1.0f);
                C786410Ut5.LJLLLLLL(0, view);
            }
            C786410Ut5.LJLLLLLL(0, ((EarlyFeedbackButtonAssem) this.l0).LJJIJL());
            if (this.z1) {
                final EarlyFeedbackButtonAssem earlyFeedbackButtonAssem7 = (EarlyFeedbackButtonAssem) this.l0;
                AnimatorSet animatorSet = earlyFeedbackButtonAssem7.LLLIIII;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                View viewLJJIJL = earlyFeedbackButtonAssem7.LLJLLIL;
                if (viewLJJIJL == null) {
                    viewLJJIJL = earlyFeedbackButtonAssem7.LJJIJL();
                }
                final View viewGp = earlyFeedbackButtonAssem7.Gp();
                ArrayList arrayList = new ArrayList();
                Integer num = earlyFeedbackButtonAssem7.LLLIIIIL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    ViewGroup.LayoutParams layoutParams4 = viewGp.getLayoutParams();
                    iIntValue = (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) ? 0 : marginLayoutParams.bottomMargin;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.setInterpolator(C1619980sG4.LIZLLL());
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0T8Z
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Float f;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                            float fFloatValue = f.floatValue();
                            EarlyFeedbackButtonAssem earlyFeedbackButtonAssem8 = earlyFeedbackButtonAssem7;
                            View view2 = viewGp;
                            int iLIZIZ = (int) (C418440Gaw.LIZIZ(Float.valueOf(36.0f)) * fFloatValue);
                            Integer numValueOf = Integer.valueOf((int) (iIntValue * fFloatValue));
                            earlyFeedbackButtonAssem8.getClass();
                            EarlyFeedbackButtonAssem.Xp(view2, iLIZIZ, numValueOf);
                        }
                    }
                });
                duration.addListener(new ALAdapterS9S0200000_12(viewGp, earlyFeedbackButtonAssem7, 9));
                C786410Ut5.T4(viewLJJIJL, 0.0f);
                C786410Ut5.LJLLLLLL(0, viewLJJIJL);
                C786410Ut5.LJLLLLLL(0, viewGp);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLJJIJL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(duration.getInterpolator());
                arrayList.add(objectAnimatorOfFloat);
                arrayList.add(duration);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList);
                animatorSet2.addListener(new ALAdapterS14S0300000_31(earlyFeedbackButtonAssem7, viewLJJIJL, viewGp, 3));
                animatorSet2.start();
                earlyFeedbackButtonAssem7.LLLIIII = animatorSet2;
            }
            String aid = ((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) this.l0)).getAweme().getAid();
            if (aid != null) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = C20338914iB.LIZ;
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(concurrentHashMap.put(aid, bool), bool)) {
                    return;
                }
                EarlyFeedbackVM earlyFeedbackVMIp = ((EarlyFeedbackButtonAssem) this.l0).Ip();
                String aid2 = ((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) this.l0)).getAweme().getAid();
                String groupId = ((VideoItemParams) C631370Opb.LIZ((EarlyFeedbackButtonAssem) this.l0)).getAweme().getGroupId();
                earlyFeedbackVMIp.getClass();
                earlyFeedbackVMIp.LLILLL = System.currentTimeMillis();
                earlyFeedbackVMIp.LLILLJJLI = 0L;
                ((IEarlyFeedbackService) earlyFeedbackVMIp.LL.getValue()).LIZ(aid2, groupId, EnumC1877260yx2.BUTTON);
            }
        }
    }

    public static final void run$0(ARunnableS3S0120000_31 aRunnableS3S0120000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.initScoreRevealManager$1$onScoreRevealStateChanged$1");
        try {
            aRunnableS3S0120000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.initScoreRevealManager$1$onScoreRevealStateChanged$1");
    }

    public static final void run$1(ARunnableS3S0120000_31 aRunnableS3S0120000_31) {
        boolean zLIZ;
        C127M accessory;
        int i;
        C1C7U.LIZ("MinisDebugSettingFragment@caa7.updateDevInfoDebugCellEnableState$1");
        try {
            ConstraintLayout constraintLayout = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLIZLLLIL;
            if (constraintLayout != null) {
                if (aRunnableS3S0120000_31.z1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LL(i, constraintLayout);
            }
            C127K c127k = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLILZLL;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            ((C127A) accessory).LJIILJJIL(aRunnableS3S0120000_31.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisDebugSettingFragment@caa7.updateDevInfoDebugCellEnableState$1");
    }

    public static final void run$2(ARunnableS3S0120000_31 aRunnableS3S0120000_31) {
        boolean zLIZ;
        C127M accessory;
        int i;
        C1C7U.LIZ("MinisDebugSettingFragment@caa7.updateDomainCheckMockCellEnableState$1");
        try {
            ConstraintLayout constraintLayout = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLJ;
            if (constraintLayout != null) {
                if (aRunnableS3S0120000_31.z1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LL(i, constraintLayout);
            }
            C127K c127k = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLILLJJLI;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            ((C127A) accessory).LJIILJJIL(!aRunnableS3S0120000_31.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisDebugSettingFragment@caa7.updateDomainCheckMockCellEnableState$1");
    }

    public static final void run$3(ARunnableS3S0120000_31 aRunnableS3S0120000_31) {
        boolean zLIZ;
        C127M accessory;
        int i;
        C1C7U.LIZ("MinisDebugSettingFragment@caa7.updateIaaMockCellEnableState$1");
        try {
            ConstraintLayout constraintLayout = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLJI;
            if (constraintLayout != null) {
                if (aRunnableS3S0120000_31.z1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LL(i, constraintLayout);
            }
            C127K c127k = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLILLL;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            ((C127A) accessory).LJIILJJIL(aRunnableS3S0120000_31.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisDebugSettingFragment@caa7.updateIaaMockCellEnableState$1");
    }

    public static final void run$4(ARunnableS3S0120000_31 aRunnableS3S0120000_31) {
        boolean zLIZ;
        C127M accessory;
        int i;
        C1C7U.LIZ("MinisDebugSettingFragment@caa7.updateIapMockCellEnableState$1");
        try {
            ConstraintLayout constraintLayout = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLJIJIL;
            if (constraintLayout != null) {
                if (aRunnableS3S0120000_31.z1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LL(i, constraintLayout);
            }
            C127K c127k = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLILZ;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            ((C127A) accessory).LJIILJJIL(aRunnableS3S0120000_31.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisDebugSettingFragment@caa7.updateIapMockCellEnableState$1");
    }

    public static final void run$5(ARunnableS3S0120000_31 aRunnableS3S0120000_31) {
        boolean zLIZ;
        C127M accessory;
        int i;
        C1C7U.LIZ("MinisDebugSettingFragment@caa7.updateSubscriptionMockCellEnableState$1");
        try {
            ConstraintLayout constraintLayout = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLJILJIL;
            if (constraintLayout != null) {
                if (aRunnableS3S0120000_31.z1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LL(i, constraintLayout);
            }
            C127K c127k = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLILZIL;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            ((C127A) accessory).LJIILJJIL(aRunnableS3S0120000_31.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisDebugSettingFragment@caa7.updateSubscriptionMockCellEnableState$1");
    }

    public static final void run$6(ARunnableS3S0120000_31 aRunnableS3S0120000_31) {
        boolean zLIZ;
        C127M accessory;
        int i;
        C1C7U.LIZ("MinisDebugSettingFragment@caa7.updateVconsoleDebugCellEnableState$1");
        try {
            ConstraintLayout constraintLayout = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLJILJILJ;
            if (constraintLayout != null) {
                if (aRunnableS3S0120000_31.z1) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LL(i, constraintLayout);
            }
            C127K c127k = ((MinisDebugSettingFragment) aRunnableS3S0120000_31.l0).LLIZ;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            ((C127A) accessory).LJIILJJIL(aRunnableS3S0120000_31.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisDebugSettingFragment@caa7.updateVconsoleDebugCellEnableState$1");
    }

    public static final void run$7(ARunnableS3S0120000_31 aRunnableS3S0120000_31) {
        boolean zLIZ;
        C1C7U.LIZ("EarlyFeedbackButtonAssem@a5ce.showButtons$5");
        try {
            aRunnableS3S0120000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EarlyFeedbackButtonAssem@a5ce.showButtons$5");
    }

    public ARunnableS3S0120000_31(Object obj, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
        this.z2 = z2;
    }
}
