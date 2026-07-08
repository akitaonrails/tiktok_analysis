package Y;

import X.C1427030nEr;
import X.C16F5;
import X.C420690GeZ;
import X.C424820GlE;
import X.C430560GuU;
import X.C786410Ut5;
import X.ViewOnClickListenerC986770bml;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public class ALAdapterS1S0110000_6 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                break;
            case 2:
            case 5:
            case 6:
            case 7:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                this.z1 = true;
                break;
            case 4:
                this.z1 = true;
                break;
            case 8:
                onAnimationCancel$3(this, animator);
                break;
        }
    }

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
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 5:
                onAnimationStart$1(this, animator);
                break;
            case 8:
                onAnimationStart$2(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS1S0110000_6(C420690GeZ c420690GeZ, int i) {
        this.$t = i;
        this.l0 = c420690GeZ;
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationCancel(animator);
        if (!aLAdapterS1S0110000_6.z1) {
            ((C424820GlE) aLAdapterS1S0110000_6.l0).dismiss();
        } else {
            C786410Ut5.ed(((C424820GlE) aLAdapterS1S0110000_6.l0).LL, 0.0f);
        }
    }

    public static final void onAnimationCancel$3(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationCancel(animator);
        C430560GuU c430560GuU = (C430560GuU) aLAdapterS1S0110000_6.l0;
        c430560GuU.getClass();
        ViewGroup.LayoutParams layoutParams = c430560GuU.getLayoutParams();
        layoutParams.height = -2;
        C786410Ut5.W5(c430560GuU, layoutParams);
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        if (!aLAdapterS1S0110000_6.z1) {
            C786410Ut5.LJLZ(8, (ViewGroup) aLAdapterS1S0110000_6.l0);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationEnd(animator);
        if (!aLAdapterS1S0110000_6.z1) {
            ((C424820GlE) aLAdapterS1S0110000_6.l0).dismiss();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        int i;
        View view = ((C1427030nEr) aLAdapterS1S0110000_6.l0).mView;
        if (view != null) {
            if (aLAdapterS1S0110000_6.z1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        if (!aLAdapterS1S0110000_6.z1) {
            C420690GeZ c420690GeZ = (C420690GeZ) aLAdapterS1S0110000_6.l0;
            if (c420690GeZ.LLJ == animator) {
                c420690GeZ.LLJ = null;
                c420690GeZ.LIZJ();
            }
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        if (!aLAdapterS1S0110000_6.z1) {
            C420690GeZ c420690GeZ = (C420690GeZ) aLAdapterS1S0110000_6.l0;
            if (c420690GeZ.LLIZLLLIL == animator) {
                c420690GeZ.LLIZLLLIL = null;
                c420690GeZ.LIZLLL();
            }
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationEnd(animator);
        if (aLAdapterS1S0110000_6.z1) {
            ((ViewOnClickListenerC986770bml) aLAdapterS1S0110000_6.l0).getViewScreenShareText().LJJJJIZL();
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationEnd(animator);
        if (aLAdapterS1S0110000_6.z1) {
            C16F5 c16f5 = (C16F5) aLAdapterS1S0110000_6.l0;
            if (c16f5 != null) {
                c16f5.setSelected(true);
            }
            C16F5 c16f52 = (C16F5) aLAdapterS1S0110000_6.l0;
            if (c16f52 != null) {
                c16f52.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            }
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationEnd(animator);
        if (aLAdapterS1S0110000_6.z1) {
            C16F5 c16f5 = (C16F5) aLAdapterS1S0110000_6.l0;
            if (c16f5 != null) {
                c16f5.setSelected(true);
            }
            C16F5 c16f52 = (C16F5) aLAdapterS1S0110000_6.l0;
            if (c16f52 != null) {
                c16f52.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            }
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationEnd(animator);
        C430560GuU c430560GuU = (C430560GuU) aLAdapterS1S0110000_6.l0;
        c430560GuU.getClass();
        ViewGroup.LayoutParams layoutParams = c430560GuU.getLayoutParams();
        layoutParams.height = -2;
        C786410Ut5.W5(c430560GuU, layoutParams);
        ((C430560GuU) aLAdapterS1S0110000_6.l0).requestLayout();
    }

    public static final void onAnimationStart$0(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        if (aLAdapterS1S0110000_6.z1) {
            C786410Ut5.LJLZ(0, (ViewGroup) aLAdapterS1S0110000_6.l0);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationStart(animator);
        if (aLAdapterS1S0110000_6.z1) {
            ((ViewOnClickListenerC986770bml) aLAdapterS1S0110000_6.l0).getViewScreenShareText().LJJJJI();
        }
    }

    public static final void onAnimationStart$2(ALAdapterS1S0110000_6 aLAdapterS1S0110000_6, Animator animator) {
        super.onAnimationStart(animator);
        if (aLAdapterS1S0110000_6.z1) {
            ((C430560GuU) aLAdapterS1S0110000_6.l0).setLimitedMaxLines(100000);
        } else {
            C430560GuU c430560GuU = (C430560GuU) aLAdapterS1S0110000_6.l0;
            c430560GuU.setLimitedMaxLines(c430560GuU.getLimitedMaxLines() + 6);
        }
    }

    public ALAdapterS1S0110000_6(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
