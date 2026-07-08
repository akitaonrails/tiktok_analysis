package Y;

import X.C1099390eiP;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS2S0101000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
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
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0101000_17 aLAdapterS2S0101000_17, Animator animator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = aLAdapterS2S0101000_17.i1;
        ViewGroup viewGroup = (ViewGroup) aLAdapterS2S0101000_17.l0;
        if (i > 0) {
            try {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(i);
                    marginLayoutParams.leftMargin = i;
                }
                viewGroup.requestLayout();
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0101000_17 aLAdapterS2S0101000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1099390eiP) aLAdapterS2S0101000_17.l0).LIZJ(aLAdapterS2S0101000_17.i1);
    }

    public static final void onAnimationStart$0(ALAdapterS2S0101000_17 aLAdapterS2S0101000_17, Animator animator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = aLAdapterS2S0101000_17.i1;
        ViewGroup viewGroup = (ViewGroup) aLAdapterS2S0101000_17.l0;
        if (i > 0) {
            try {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(0);
                    marginLayoutParams.leftMargin = 0;
                }
                viewGroup.requestLayout();
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void onAnimationStart$1(ALAdapterS2S0101000_17 aLAdapterS2S0101000_17, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS2S0101000_17.l0, 0.0f);
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS2S0101000_17.l0);
        C786410Ut5.ed((View) aLAdapterS2S0101000_17.l0, aLAdapterS2S0101000_17.i1);
    }

    public ALAdapterS2S0101000_17(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
