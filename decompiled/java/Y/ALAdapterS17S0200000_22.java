package Y;

import X.C013C;
import X.C1425660nCe;
import X.C1425670nCf;
import X.C1450640nqw;
import X.C1453130nux;
import X.C1453190nv3;
import X.C1464400oD8;
import X.C786410Ut5;
import X.C995240c0Q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.image.desc.DescIdeasModule;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class ALAdapterS17S0200000_22 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
                break;
            case 3:
            default:
                super.onAnimationCancel(animator);
                break;
            case 4:
                onAnimationCancel$1(this, animator);
                break;
            case 5:
                onAnimationCancel$2(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                break;
            case 2:
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                break;
            case 5:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        C1450640nqw c1450640nqw = (C1450640nqw) aLAdapterS17S0200000_22.l1;
        c1450640nqw.LLJLIL = false;
        if (c1450640nqw.LLJL == animator) {
            c1450640nqw.LLJL = null;
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        ((C1464400oD8) aLAdapterS17S0200000_22.l1).LJII = false;
    }

    public static final void onAnimationCancel$2(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        ((C1464400oD8) aLAdapterS17S0200000_22.l1).LJII = true;
    }

    public static final void onAnimationEnd$0(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        View view;
        View view2;
        if (!((C1425660nCe) aLAdapterS17S0200000_22.l0).LLJJL) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS17S0200000_22.l1);
            C786410Ut5.T4((View) aLAdapterS17S0200000_22.l1, 0.0f);
            C1425670nCf c1425670nCf = ((C1425660nCe) aLAdapterS17S0200000_22.l0).LLJJIII;
            if (c1425670nCf != null && (view2 = c1425670nCf.LLJJJIL) != null) {
                view2.setClickable(true);
            }
            C1425670nCf c1425670nCf2 = ((C1425660nCe) aLAdapterS17S0200000_22.l0).LLJJIII;
            if (c1425670nCf2 != null && (view = c1425670nCf2.LLJJJJ) != null) {
                view.setClickable(true);
            }
        }
        ((C1425660nCe) aLAdapterS17S0200000_22.l0).LLJJJJJIL = null;
    }

    public static final void onAnimationEnd$1(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        if (((C013C) aLAdapterS17S0200000_22.l0).element) {
            ((DescIdeasModule) aLAdapterS17S0200000_22.l1).LLJILJILJ.setText("");
            return;
        }
        TuxTextView tuxTextView = ((DescIdeasModule) aLAdapterS17S0200000_22.l1).LLJILJILJ;
        int i = C995240c0Q.LIZ;
        tuxTextView.setText(2131830576);
        tuxTextView.getLayoutParams().width = -2;
    }

    public static final void onAnimationEnd$2(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        C1450640nqw c1450640nqw;
        try {
            ((Function0) aLAdapterS17S0200000_22.l0).invoke();
            c1450640nqw = (C1450640nqw) aLAdapterS17S0200000_22.l1;
            if (c1450640nqw.LLJL != animator) {
                return;
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                c1450640nqw = (C1450640nqw) aLAdapterS17S0200000_22.l1;
                if (c1450640nqw.LLJL != animator) {
                    return;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1450640nqw c1450640nqw2 = (C1450640nqw) aLAdapterS17S0200000_22.l1;
                if (c1450640nqw2.LLJL == animator) {
                    c1450640nqw2.LLJL = null;
                }
                throw th2;
            }
        }
        c1450640nqw.LLJL = null;
    }

    public static final void onAnimationEnd$3(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        ((C1453190nv3) aLAdapterS17S0200000_22.l0).LIZIZ.invoke();
        ((C1453130nux) aLAdapterS17S0200000_22.l1).LJIIIIZZ = null;
    }

    public static final void onAnimationEnd$4(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        C786410Ut5.LJZL(8, (LinearLayout) aLAdapterS17S0200000_22.l0);
        ((C1464400oD8) aLAdapterS17S0200000_22.l1).LJII = true;
    }

    public static final void onAnimationEnd$5(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        ((C1464400oD8) aLAdapterS17S0200000_22.l1).LJII = false;
    }

    public static final void onAnimationStart$0(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        if (!((C013C) aLAdapterS17S0200000_22.l0).element) {
            TuxTextView tuxTextView = ((DescIdeasModule) aLAdapterS17S0200000_22.l1).LLJILJILJ;
            int i = C995240c0Q.LIZ;
            tuxTextView.setText(2131830576);
            tuxTextView.getLayoutParams().width = -2;
        }
    }

    public static final void onAnimationStart$1(ALAdapterS17S0200000_22 aLAdapterS17S0200000_22, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) aLAdapterS17S0200000_22.l0).getLayoutParams();
        layoutParams.height = 0;
        C786410Ut5.d6((LinearLayout) aLAdapterS17S0200000_22.l0, layoutParams);
        C786410Ut5.LJZL(0, (LinearLayout) aLAdapterS17S0200000_22.l0);
    }

    public ALAdapterS17S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
