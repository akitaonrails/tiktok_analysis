package Y;

import X.C1351950lHl;
import X.C20742216Eq;
import X.C426750GoL;
import X.C786410Ut5;
import X.InterfaceC1366280les;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelTitleAssem;

/* JADX INFO: loaded from: classes22.dex */
public class AUListenerS17S0102000_21 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS17S0102000_21 aUListenerS17S0102000_21, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C20742216Eq c20742216Eq = ((CommentLongPressFragment) aUListenerS17S0102000_21.l0).LLJLIL;
        if (c20742216Eq != null) {
            c20742216Eq.setGuidelineEnd(iIntValue);
        }
        int i = iIntValue + aUListenerS17S0102000_21.i1 + aUListenerS17S0102000_21.i2;
        CommentLongPressFragment commentLongPressFragment = (CommentLongPressFragment) aUListenerS17S0102000_21.l0;
        int i2 = commentLongPressFragment.LLJZ;
        if (i > i2) {
            View view = commentLongPressFragment.LLJJL;
            if (view != null) {
                C1351950lHl.LJIJI(i, view);
                return;
            }
            return;
        }
        View view2 = commentLongPressFragment.LLJJL;
        if (view2 == null) {
            return;
        }
        C1351950lHl.LJIJI(i2, view2);
    }

    public static final void onAnimationUpdate$1(AUListenerS17S0102000_21 aUListenerS17S0102000_21, ValueAnimator valueAnimator) {
        int iIntValue;
        View view;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C20742216Eq c20742216Eq = ((CommentLongPressFragment) aUListenerS17S0102000_21.l0).LLJLIL;
        if (c20742216Eq != null) {
            c20742216Eq.setGuidelineEnd(iIntValue);
        }
        int i = iIntValue + aUListenerS17S0102000_21.i1 + aUListenerS17S0102000_21.i2;
        CommentLongPressFragment commentLongPressFragment = (CommentLongPressFragment) aUListenerS17S0102000_21.l0;
        if (i > commentLongPressFragment.LLJZ && (view = commentLongPressFragment.LLJJL) != null) {
            C1351950lHl.LJIJI(i, view);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS17S0102000_21 aUListenerS17S0102000_21, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C20742216Eq c20742216Eq = ((ShareSheetPanelFragment) aUListenerS17S0102000_21.l0).LLJJI;
        if (c20742216Eq != null) {
            c20742216Eq.setGuidelineEnd(iIntValue);
        }
        int i = aUListenerS17S0102000_21.i1 + iIntValue + aUListenerS17S0102000_21.i2;
        ShareSheetPanelFragment shareSheetPanelFragment = (ShareSheetPanelFragment) aUListenerS17S0102000_21.l0;
        int i2 = i + shareSheetPanelFragment.LLJJIJIL;
        int i3 = shareSheetPanelFragment.LLJJJJJIL;
        if (i2 > i3) {
            View view = shareSheetPanelFragment.LLJILJILJ;
            if (view != null) {
                shareSheetPanelFragment.WR(i2, view);
            }
        } else {
            View view2 = shareSheetPanelFragment.LLJILJILJ;
            if (view2 != null) {
                shareSheetPanelFragment.WR(i3, view2);
            }
        }
        if (iIntValue == 0) {
            InterfaceC1366280les interfaceC1366280les = ((ShareSheetPanelFragment) aUListenerS17S0102000_21.l0).LLJILLL;
            if (interfaceC1366280les != null) {
                interfaceC1366280les.LIZJ(true);
            }
            ShareSheetPanelFragment shareSheetPanelFragment2 = (ShareSheetPanelFragment) aUListenerS17S0102000_21.l0;
            FrameLayout frameLayout = shareSheetPanelFragment2.LLJJ;
            if (frameLayout != null) {
                HandlerHook.viewPost(frameLayout, new ARunnableS121S0100000_21(shareSheetPanelFragment2, 79));
            }
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS17S0102000_21 aUListenerS17S0102000_21, ValueAnimator valueAnimator) {
        Integer num;
        Integer num2;
        TuxTextView tuxTextView = ((RepostPanelTitleAssem) aUListenerS17S0102000_21.l0).LLJJI;
        int iIntValue = 0;
        if (tuxTextView != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                num2 = (Integer) animatedValue;
            } else {
                num2 = null;
            }
            C426750GoL.LJIIIZ(tuxTextView, 0, num2, 0, 0, false, 16);
        }
        int i = aUListenerS17S0102000_21.i1;
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        if ((animatedValue2 instanceof Integer) && (num = (Integer) animatedValue2) != null) {
            iIntValue = num.intValue();
        }
        float f = (i - iIntValue) / (aUListenerS17S0102000_21.i1 - aUListenerS17S0102000_21.i2);
        TuxTextView tuxTextView2 = ((RepostPanelTitleAssem) aUListenerS17S0102000_21.l0).LLJJIII;
        if (tuxTextView2 != null) {
            C786410Ut5.B5(tuxTextView2, f);
        }
    }

    public AUListenerS17S0102000_21(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
