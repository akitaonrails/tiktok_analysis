package X;

import android.view.animation.Animation;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;

/* JADX INFO: renamed from: X.0Kd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class AnimationAnimationListenerC521650Kd1 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
    }

    public static final void onAnimationRepeat$2(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
    }

    public static final void onAnimationRepeat$3(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
    }

    public static final void onAnimationStart$2(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
    }

    public static final void onAnimationStart$3(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                break;
            case 1:
                onAnimationEnd$1(this, animation);
                break;
            case 2:
                onAnimationEnd$2(this, animation);
                break;
            case 3:
                onAnimationEnd$3(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                break;
            case 1:
                onAnimationRepeat$1(this, animation);
                break;
            case 2:
                onAnimationRepeat$2(this, animation);
                break;
            case 3:
                onAnimationRepeat$3(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                break;
            case 1:
                onAnimationStart$1(this, animation);
                break;
            case 2:
                onAnimationStart$2(this, animation);
                break;
            case 3:
                onAnimationStart$3(this, animation);
                break;
        }
    }

    public AnimationAnimationListenerC521650Kd1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
        ((SwitchDefinitionTipsWidget) animationAnimationListenerC521650Kd1.l0).hide();
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
        ((C483100Ix2) animationAnimationListenerC521650Kd1.l0).setSecondaryShow(false);
        ((C483100Ix2) animationAnimationListenerC521650Kd1.l0).h0();
    }

    public static final void onAnimationEnd$2(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
        ((C483100Ix2) animationAnimationListenerC521650Kd1.l0).i0();
    }

    public static final void onAnimationEnd$3(AnimationAnimationListenerC521650Kd1 animationAnimationListenerC521650Kd1, Animation animation) {
        ((C483100Ix2) animationAnimationListenerC521650Kd1.l0).i0();
        SurveyViewModel surveyViewModel = ((C483100Ix2) animationAnimationListenerC521650Kd1.l0).LL;
        if (surveyViewModel != null) {
            surveyViewModel.xQ2();
        }
    }
}
