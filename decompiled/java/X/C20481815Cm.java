package X;

import Y.ALAdapterS25S0100000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Property;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import tikcast.api.anchor_data.FinishEncourageLiveJourney;
import tikcast.api.anchor_data.FinishEncourageTask;

/* JADX INFO: renamed from: X.15Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20481815Cm {
    public final C16F5 LIZ;
    public final C16F5 LIZIZ;
    public final C1295960jpS LIZJ;
    public final C1295960jpS LIZLLL;
    public final C16F5 LJ;
    public final List<C20481615Ck> LJFF;
    public final InterfaceC20482115Cp LJI;

    public static boolean LIZJ(FinishEncourageLiveJourney finishEncourageLiveJourney) {
        List<FinishEncourageTask> list;
        if (finishEncourageLiveJourney != null && (list = finishEncourageLiveJourney.taskList) != null) {
            for (FinishEncourageTask finishEncourageTask : list) {
                if (finishEncourageTask.progress == finishEncourageTask.target) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZIZ(final FinishEncourageLiveJourney finishEncourageLiveJourney) {
        final int i = 0;
        for (C20481615Ck c20481615Ck : this.LJFF) {
            int i2 = i + 1;
            if (i >= 0) {
                c20481615Ck.setOnAnimationEndListener(new C15D3() { // from class: X.15Cl
                    @Override // X.C15D3
                    public final void LIZ() {
                        C20481615Ck c20481615Ck2 = (C20481615Ck) C13LP.LJJJLZIJ(i + 1, this.LIZ.LJFF);
                        if (c20481615Ck2 != null) {
                            c20481615Ck2.play();
                        }
                        if (i == this.LIZ.LJFF.size() - 1) {
                            FinishEncourageLiveJourney finishEncourageLiveJourney2 = finishEncourageLiveJourney;
                            if (finishEncourageLiveJourney2 != null && finishEncourageLiveJourney2.isLevelUp && (!a0.LJJJIL(finishEncourageLiveJourney2.finishTitle))) {
                                C20481815Cm c20481815Cm = this.LIZ;
                                c20481815Cm.LJI.Fx(c20481815Cm.LIZ, finishEncourageLiveJourney.finishTitle);
                                C20481815Cm c20481815Cm2 = this.LIZ;
                                AnimatorSet animatorSetNi = c20481815Cm2.LJI.ni(c20481815Cm2.LIZIZ);
                                if (animatorSetNi != null) {
                                    animatorSetNi.addListener(new ALAdapterS25S0100000_31(this.LIZ, 35));
                                }
                            }
                            C500260Jjc.LJIILIIL(this.LIZ.LIZJ);
                            C500260Jjc.LJIILIIL(this.LIZ.LJ);
                            C500260Jjc.LLFFF(this.LIZ.LIZLLL);
                            C1295960jpS c1295960jpS = this.LIZ.LIZLLL;
                            if (c1295960jpS != null) {
                                c1295960jpS.playAnimation();
                            }
                        }
                    }

                    @Override // X.C15D3
                    public final void LIZIZ() {
                        Iterable iterable;
                        C1295960jpS c1295960jpS = this.LIZ.LIZJ;
                        if (c1295960jpS != null) {
                            c1295960jpS.playAnimation();
                        }
                        C16F5 c16f5 = this.LIZ.LJ;
                        int i3 = i;
                        FinishEncourageLiveJourney finishEncourageLiveJourney2 = finishEncourageLiveJourney;
                        if (finishEncourageLiveJourney2 == null || (iterable = finishEncourageLiveJourney2.taskList) == null) {
                            iterable = C13BV.INSTANCE;
                        }
                        C500260Jjc.LLFFF(c16f5);
                        Iterator it2 = C13LP.LL(iterable, i3 + 1).iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            i4 += ((FinishEncourageTask) it2.next()).rewardNum;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((char) 215);
                        sbLIZ.append(i4);
                        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                        C786410Ut5.p2(spannableString, new StyleSpan(1), 0, 2, 33);
                        C786410Ut5.p2(spannableString, new RelativeSizeSpan(1.2f), 1, 2, 33);
                        if (c16f5 != null) {
                            c16f5.setText(spannableString);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.0f, 1.2f);
                            objectAnimatorOfFloat.setDuration(315L);
                            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.0f, 1.2f);
                            objectAnimatorOfFloat2.setDuration(315L);
                            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.2f, 1.0f);
                            objectAnimatorOfFloat3.setDuration(315L);
                            objectAnimatorOfFloat3.setStartDelay(315L);
                            objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.2f, 1.0f);
                            objectAnimatorOfFloat4.setDuration(315L);
                            objectAnimatorOfFloat4.setStartDelay(315L);
                            objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJI());
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                            animatorSet.start();
                        }
                    }
                });
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15C2] */
    public static C15C2 LIZ(final C1295960jpS c1295960jpS, FinishEncourageLiveJourney finishEncourageLiveJourney) {
        int i;
        int i2 = 0;
        if (finishEncourageLiveJourney != null) {
            i = finishEncourageLiveJourney.level;
        } else {
            i = 0;
        }
        final String strValueOf = String.valueOf(i);
        if (finishEncourageLiveJourney != null) {
            i2 = finishEncourageLiveJourney.level;
        }
        final String strValueOf2 = String.valueOf(i2 - 1);
        return new C1295710jp3(c1295960jpS) { // from class: X.15C2
            @Override // X.C1295710jp3
            public final String LIZIZ(String str, String str2) {
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -126870883) {
                        if (iHashCode != -71668819) {
                            if (iHashCode == 55866006 && str.equals("End nub")) {
                                return strValueOf;
                            }
                            return str2;
                        }
                        if (!str.equals("Levelnumber")) {
                            return str2;
                        }
                        return strValueOf;
                    }
                    if (!str.equals("Start nub")) {
                        return str2;
                    }
                    return strValueOf2;
                }
                return str2;
            }
        };
    }

    public C20481815Cm(C16F5 c16f5, C16F5 c16f52, C1295960jpS c1295960jpS, C1295960jpS c1295960jpS2, C16F5 c16f53, List<C20481615Ck> list, InterfaceC20482115Cp interfaceC20482115Cp) {
        this.LIZ = c16f5;
        this.LIZIZ = c16f52;
        this.LIZJ = c1295960jpS;
        this.LIZLLL = c1295960jpS2;
        this.LJ = c16f53;
        this.LJFF = list;
        this.LJI = interfaceC20482115Cp;
    }
}
