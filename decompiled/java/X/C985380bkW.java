package X;

import Y.AAListenerS326S0100000_15;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0bkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985380bkW {
    public static final /* synthetic */ int LIZJ = 0;
    public C1295960jpS LIZ;
    public ValueAnimator LIZIZ;

    public static void LIZ(long j, View view) {
        String str;
        int i;
        double d;
        double d2;
        if (j == 1) {
            str = "ttlive_icon_take_stage_animation_1st.png";
        } else if (j == 2) {
            str = "ttlive_icon_take_stage_animation_2nd.png";
        } else if (j == 3) {
            str = "ttlive_icon_take_stage_animation_3rd.png";
        } else if (j == 4) {
            str = "ttlive_icon_take_stage_animation_4th.png";
        } else {
            str = "";
        }
        C1143680frq.LJ(view, "tiktok_live_interaction_demand_1", str, ImageView.ScaleType.FIT_XY);
        int iLIZ = C439101nJ.LIZ(45);
        if (view != null) {
            if (j == 1) {
                d = iLIZ;
                d2 = 2.83d;
            } else if (j == 2) {
                d = iLIZ;
                d2 = 1.645d;
            } else if (j == 3) {
                d = iLIZ;
                d2 = 1.548d;
            } else if (j == 4) {
                d = iLIZ;
                d2 = 1.483d;
            } else {
                i = -2;
                C500260Jjc.LJLL(i, iLIZ, view);
            }
            i = (int) (d * d2);
            C500260Jjc.LJLL(i, iLIZ, view);
        }
    }

    public final void LIZJ(final View view, final boolean z, final InterfaceC985590bkr interfaceC985590bkr) {
        ValueAnimator valueAnimator = this.LIZIZ;
        if (valueAnimator != null) {
            C962250b9D.LIZLLL(valueAnimator);
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (!z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        this.LIZIZ = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0bkZ
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (!z) {
                        C500260Jjc.LJIILIIL(view);
                    }
                    InterfaceC985590bkr interfaceC985590bkr2 = interfaceC985590bkr;
                    if (interfaceC985590bkr2 != null) {
                        interfaceC985590bkr2.LIZ();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    C500260Jjc.LLFFF(view);
                }
            });
        }
        ValueAnimator valueAnimator2 = this.LIZIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(200L);
        }
        ValueAnimator valueAnimator3 = this.LIZIZ;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void LIZIZ(C1295960jpS c1295960jpS, String str, int i, InterfaceC985590bkr interfaceC985590bkr) {
        if (c1295960jpS == null) {
            return;
        }
        C962250b9D.LJIIJ(this.LIZ);
        C500260Jjc.LJIILIIL(this.LIZ);
        this.LIZ = c1295960jpS;
        C962250b9D.LJIIJ(c1295960jpS);
        C500260Jjc.LLFFF(c1295960jpS);
        c1295960jpS.setRepeatCount(i);
        c1295960jpS.addAnimatorListener(new AAListenerS326S0100000_15(interfaceC985590bkr, 7));
        C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_demand_9", str, "images", true, null, Boolean.FALSE, null);
    }
}
