package Y;

import X.C2262991Dhp;
import X.C2277781EDo;
import X.C786410Ut5;
import android.animation.Animator;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.us.view.UsOspBottomWidget;

/* JADX INFO: loaded from: classes36.dex */
public class AAListenerS280S0200000_35 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS280S0200000_35 aAListenerS280S0200000_35, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS280S0200000_35 aAListenerS280S0200000_35, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS280S0200000_35 aAListenerS280S0200000_35, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS280S0200000_35 aAListenerS280S0200000_35, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS280S0200000_35 aAListenerS280S0200000_35, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS280S0200000_35 aAListenerS280S0200000_35, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationStart$0(AAListenerS280S0200000_35 aAListenerS280S0200000_35, Animator animator) {
        TuxTextView emojiAnim7 = ((C2277781EDo) aAListenerS280S0200000_35.l0).getEmojiAnim7();
        C786410Ut5.B5(emojiAnim7, 0.85f);
        C786410Ut5.ic(emojiAnim7, 1.08f);
        C786410Ut5.Dc(emojiAnim7, 1.08f);
        ((Animator) aAListenerS280S0200000_35.l1).addListener(new AAListenerS344S0100000_35((C2277781EDo) aAListenerS280S0200000_35.l0, 18));
    }

    public static final void onAnimationStart$1(AAListenerS280S0200000_35 aAListenerS280S0200000_35, Animator animator) {
        TuxTextView tuxTextView = ((UsOspBottomWidget) aAListenerS280S0200000_35.l0).LLJJJJLIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(((C2262991Dhp) aAListenerS280S0200000_35.l1).LIZ);
        }
    }

    public AAListenerS280S0200000_35(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
