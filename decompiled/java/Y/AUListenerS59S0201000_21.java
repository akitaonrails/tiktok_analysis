package Y;

import X.C1351950lHl;
import X.C1353060lJY;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment;

/* JADX INFO: loaded from: classes22.dex */
public class AUListenerS59S0201000_21 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS59S0201000_21 aUListenerS59S0201000_21, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = aUListenerS59S0201000_21.i2;
        }
        C1351950lHl.LJIJI(iIntValue, (ViewGroup) aUListenerS59S0201000_21.l0);
        C1353060lJY c1353060lJY = ((DefaultCommentPageContainerFragment) aUListenerS59S0201000_21.l1).LLJJJJJIL;
        if (c1353060lJY != null) {
            c1353060lJY.LJIIJ();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS59S0201000_21 aUListenerS59S0201000_21, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = aUListenerS59S0201000_21.i2;
        }
        C1351950lHl.LJIJI(iIntValue, (ViewGroup) aUListenerS59S0201000_21.l0);
        C1353060lJY c1353060lJY = ((DefaultCommentPageContainerFragment) aUListenerS59S0201000_21.l1).LLJJJJJIL;
        if (c1353060lJY != null) {
            c1353060lJY.LJIIJ();
        }
    }

    public AUListenerS59S0201000_21(int i, ViewGroup viewGroup, DefaultCommentPageContainerFragment defaultCommentPageContainerFragment, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = viewGroup;
        this.l1 = defaultCommentPageContainerFragment;
    }
}
