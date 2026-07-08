package Y;

import X.C0IH6;
import X.C0III;
import X.C1324720kZq;
import X.C13LP;
import X.C417850GZz;
import X.C497740JfY;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import com.bytedance.tux.input.TuxTextView;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: loaded from: classes8.dex */
public class ALAdapterS0S0201000_7 extends AnimatorListenerAdapter {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0201000_7 aLAdapterS0S0201000_7, Animator animator) {
        super.onAnimationCancel(animator);
        LiveEndCardWidget liveEndCardWidget = (LiveEndCardWidget) aLAdapterS0S0201000_7.l0;
        liveEndCardWidget.LLILZLL = null;
        liveEndCardWidget.LLIZ = false;
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0201000_7 aLAdapterS0S0201000_7, Animator animator) {
        super.onAnimationEnd(animator);
        ((LiveEndCardWidget) aLAdapterS0S0201000_7.l0).LLILZLL = null;
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS0S0201000_7.l1).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = aLAdapterS0S0201000_7.i2;
            C786410Ut5.W5((View) aLAdapterS0S0201000_7.l1, layoutParams);
        }
        ((LiveEndCardWidget) aLAdapterS0S0201000_7.l0).y1("anim_end");
        LiveEndCardWidget liveEndCardWidget = (LiveEndCardWidget) aLAdapterS0S0201000_7.l0;
        View view = liveEndCardWidget.LLJJJJJIL;
        if (view != null) {
            C786410Ut5.ed(view, liveEndCardWidget.LLJJ + LiveEndCardWidget.LLLFZ);
        }
        C1324720kZq c1324720kZq = ((LiveEndCardWidget) aLAdapterS0S0201000_7.l0).LLJJI;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        }
        View view2 = ((LiveEndCardWidget) aLAdapterS0S0201000_7.l0).LLJJJJJIL;
        if (view2 != null) {
            view2.setClipToOutline(true);
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(16.0f), view2);
            view2.invalidateOutline();
        }
        C1324720kZq c1324720kZq2 = ((LiveEndCardWidget) aLAdapterS0S0201000_7.l0).LLJJI;
        if (c1324720kZq2 != null) {
            c1324720kZq2.setClipToOutline(true);
            C417850GZz.LIZ((int) C497740JfY.LIZIZ(16.0f), c1324720kZq2);
            c1324720kZq2.invalidateOutline();
        }
        C0IH6.LIZ(C0III.FINISH_CARD_ANIM_END);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0201000_7 aLAdapterS0S0201000_7, Animator animator) {
        String str;
        TuxTextView tuxTextView = (TuxTextView) aLAdapterS0S0201000_7.l0;
        GoLiveCardPicture goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLZIJ(aLAdapterS0S0201000_7.i2, ((EncourageGoLiveCard) aLAdapterS0S0201000_7.l1).pictures);
        if (goLiveCardPicture != null) {
            str = goLiveCardPicture.text;
        } else {
            str = null;
        }
        tuxTextView.setText(str);
    }

    public ALAdapterS0S0201000_7(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
