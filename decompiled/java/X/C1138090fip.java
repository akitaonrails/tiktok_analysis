package X;

import Y.ALAdapterS13S0100000_17;
import Y.ARunnableS86S0200000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayStuckRecoverySetting;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138090fip {
    public final InterfaceC1138270fj7 LIZ;
    public final InterfaceC1137430fhl LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public C1135810ff9 LJFF;
    public boolean LJI;
    public C1138260fj6 LJIIIIZZ;
    public Animator LJIIIZ;
    public final C1137070fhB LJ = new C1137070fhB();
    public final Set<String> LJII = new LinkedHashSet();
    public AbstractC1138110fir LJIIJ = new C1138250fj5(this);

    public final void LIZ() {
        AnimatorSet animatorSet;
        LIZJ("cancelCurrentAnimation");
        this.LJI = true;
        C1138260fj6 c1138260fj6 = this.LJIIIIZZ;
        if (c1138260fj6 != null && (animatorSet = c1138260fj6.LIZIZ) != null) {
            animatorSet.cancel();
        }
        Animator animator = this.LJIIIZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LJIIIZ = null;
        this.LJIIIIZZ = null;
    }

    public final void LIZIZ(AbstractC1138110fir abstractC1138110fir) {
        if (this.LJIIJ instanceof C1137560fhy) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeState ignored (disposed), from ");
            sbLIZ.append(this.LJIIJ.LIZ());
            sbLIZ.append(" to ");
            sbLIZ.append(abstractC1138110fir.LIZ());
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("changeState from ");
        sbLIZ2.append(this.LJIIJ.LIZ());
        sbLIZ2.append(" to ");
        sbLIZ2.append(abstractC1138110fir.LIZ());
        LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        this.LJIIJ = abstractC1138110fir;
    }

    public final void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" [");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("] [");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("] ");
        sbLIZ.append(str);
        C1138230fj3.LIZJ("GiftTrayAnimationOrchestrator", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(String str) {
        Long lValueOf;
        String string;
        String string2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(':');
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(':');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1135810ff9 c1135810ff9 = this.LJFF;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(hashCode());
        sbLIZ2.append(" tray abnormal: ");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", giftId=");
        if (c1135810ff9 != null) {
            lValueOf = Long.valueOf(c1135810ff9.LJJJJZ);
        } else {
            lValueOf = null;
        }
        sbLIZ2.append(lValueOf);
        C20441214yg.LJ("GiftTrayAnimationOrchestrator", C2188811AlT.LIZIZ(sbLIZ2));
        if (!this.LJII.add(strLIZIZ)) {
            return;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("error_msg", strLIZIZ);
        String str2 = "";
        if (c1135810ff9 == null || (string = Long.valueOf(c1135810ff9.LJJJJZ).toString()) == null) {
            string = "";
        }
        pairArr[1] = new Pair("gift_id", string);
        if (c1135810ff9 != null && (string2 = Integer.valueOf(c1135810ff9.LJI).toString()) != null) {
            str2 = string2;
        }
        pairArr[2] = new Pair("gift_type", str2);
        pairArr[3] = new Pair("tray_position", String.valueOf(this.LIZLLL));
        C1136500fgG.LIZ("gift_tray_state_abnormal", C2097608Jq.LJIIJ(pairArr), null, false);
    }

    public final void LJ(C1138260fj6 c1138260fj6) {
        this.LJI = false;
        this.LJIIIIZZ = c1138260fj6;
        Animator animator = c1138260fj6.LIZJ;
        if (animator != null && this.LJIIIZ == null) {
            this.LJIIIZ = animator;
            animator.addListener(new ALAdapterS13S0100000_17(this, 0));
            Animator animator2 = this.LJIIIZ;
            if (animator2 != null) {
                animator2.start();
            }
        }
        AnimatorSet animatorSet = c1138260fj6.LIZIZ;
        if (LiveGiftTrayStuckRecoverySetting.INSTANCE.progressOnEmptyAnimation() && animatorSet.getChildAnimations().isEmpty()) {
            C473410IhP.LIZIZ(new ARunnableS86S0200000_17(this, c1138260fj6, 0));
        } else {
            animatorSet.addListener(new Animator.AnimatorListener(this) { // from class: X.0fj9
                public final C1138090fip LL;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator3) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator3) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator3) {
                }

                {
                    this.LL = this;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator3) {
                    Function0<Unit> function0;
                    C1138090fip c1138090fip = this.LL;
                    if (!(c1138090fip.LJIIJ instanceof C1137560fhy) && !c1138090fip.LJI) {
                        C1138260fj6 c1138260fj62 = c1138090fip.LJIIIIZZ;
                        if (c1138260fj62 != null && (function0 = c1138260fj62.LIZLLL) != null) {
                            function0.invoke();
                        }
                        C1138090fip c1138090fip2 = this.LL;
                        c1138090fip2.LJIIIIZZ = null;
                        c1138090fip2.LJIIJ.LIZJ();
                    }
                }
            });
            animatorSet.start();
        }
    }

    public final void onEvent(AbstractC1136890fgt abstractC1136890fgt) {
        if (abstractC1136890fgt instanceof C1136680fgY) {
            LIZJ("onEvent=Enter");
            C1135810ff9 c1135810ff9 = ((C1136680fgY) abstractC1136890fgt).LIZ;
            this.LJFF = c1135810ff9;
            this.LJIIJ.LJ(c1135810ff9);
            return;
        }
        if (abstractC1136890fgt instanceof C1136670fgX) {
            LIZJ("onEvent=Combo");
            C1135810ff9 c1135810ff92 = ((C1136670fgX) abstractC1136890fgt).LIZ;
            this.LJFF = c1135810ff92;
            this.LJIIJ.LIZLLL(c1135810ff92);
            return;
        }
        if (abstractC1136890fgt instanceof C1136690fgZ) {
            LIZJ("onEvent=Exit");
            C1135810ff9 c1135810ff93 = ((C1136690fgZ) abstractC1136890fgt).LIZ;
            this.LJFF = c1135810ff93;
            this.LJIIJ.LJFF(c1135810ff93);
            return;
        }
        if (abstractC1136890fgt instanceof C1136660fgW) {
            LIZJ("onEvent=MultiHostExit");
            Function0<Unit> function0 = ((C1136660fgW) abstractC1136890fgt).LIZIZ;
            LIZJ("resetAnimForMultiHostSwitch");
            LIZ();
            AbstractC1138110fir abstractC1138110fir = this.LJIIJ;
            C1138090fip c1138090fip = abstractC1138110fir.LIZ;
            LifecycleCoroutineScope lifecycleCoroutineScope = c1138090fip.LIZ.getLifecycleCoroutineScope();
            if (lifecycleCoroutineScope != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C1138100fiq(c1138090fip, abstractC1138110fir, function0, null), 2);
                return;
            } else {
                c1138090fip.LIZLLL("scope_null:onMultiHostExit");
                c1138090fip.LIZIZ(new C1138250fj5(abstractC1138110fir.LIZ));
                function0.invoke();
                return;
            }
        }
        throw new C1954807lC();
    }

    public C1138090fip(InterfaceC1138270fj7 interfaceC1138270fj7, InterfaceC1137430fhl interfaceC1137430fhl, String str, int i) {
        this.LIZ = interfaceC1138270fj7;
        this.LIZIZ = interfaceC1137430fhl;
        this.LIZJ = str;
        this.LIZLLL = i;
    }
}
