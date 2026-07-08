package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Space;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class AnimationAnimationListenerC1151560g4Y implements Animation.AnimationListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
    }

    public static final void onAnimationRepeat$2(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
    }

    public static final void onAnimationRepeat$3(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
    }

    public static final void onAnimationStart$3(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
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

    public static final void onAnimationEnd$0(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
        C786410Ut5.LJLLLLLL(8, (View) animationAnimationListenerC1151560g4Y.l0);
        ((Function0) animationAnimationListenerC1151560g4Y.l1).invoke();
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
        int measuredWidth;
        int measuredWidth2;
        int i;
        int measuredWidth3;
        C1091080eV0 c1091080eV0 = (C1091080eV0) animationAnimationListenerC1151560g4Y.l0;
        ImageModel imageModel = (ImageModel) animationAnimationListenerC1151560g4Y.l1;
        if (imageModel != null) {
            c1091080eV0.getClass();
            int i2 = 1;
            if (!imageModel.getUrls().isEmpty()) {
                int measuredWidth4 = imageModel.width;
                if (measuredWidth4 <= 0) {
                    measuredWidth4 = C497740JfY.LJIIIZ(R.dimen.ld);
                }
                AnimationSet animationSet = new AnimationSet(true);
                View view = (View) c1091080eV0.LJ.getValue();
                if (view != null) {
                    measuredWidth = view.getMeasuredWidth();
                } else {
                    measuredWidth = 0;
                }
                if (measuredWidth4 > 0) {
                    measuredWidth2 = measuredWidth4;
                } else {
                    C1324720kZq c1324720kZqLIZJ = c1091080eV0.LIZJ();
                    if (c1324720kZqLIZJ != null) {
                        measuredWidth2 = c1324720kZqLIZJ.getMeasuredWidth();
                    } else {
                        measuredWidth2 = 0;
                    }
                }
                int i3 = measuredWidth - measuredWidth2;
                if (C497740JfY.LJJ()) {
                    i = 1;
                } else {
                    i = -1;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i * i3, 0.0f, 0.0f);
                C2268791DrB c2268791DrB = new C2268791DrB(0.48f, 0.04f, 0.52f, 0.96f);
                translateAnimation.setDuration(1000L);
                translateAnimation.setInterpolator(c2268791DrB);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                alphaAnimation.setInterpolator(c2268791DrB);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(150L);
                alphaAnimation2.setStartOffset(850L);
                alphaAnimation2.setInterpolator(c2268791DrB);
                animationSet.addAnimation(translateAnimation);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(alphaAnimation2);
                animationSet.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(c1091080eV0, 17));
                AnimationSet animationSet2 = new AnimationSet(true);
                C2268791DrB c2268791DrB2 = new C2268791DrB(0.48f, 0.04f, 0.52f, 0.96f);
                View view2 = (View) c1091080eV0.LJ.getValue();
                if (view2 != null) {
                    measuredWidth3 = view2.getMeasuredWidth();
                } else {
                    measuredWidth3 = 0;
                }
                if (measuredWidth4 <= 0) {
                    C1324720kZq c1324720kZqLIZLLL = c1091080eV0.LIZLLL();
                    if (c1324720kZqLIZLLL != null) {
                        measuredWidth4 = c1324720kZqLIZLLL.getMeasuredWidth();
                    } else {
                        measuredWidth4 = 0;
                    }
                }
                int i4 = measuredWidth3 - measuredWidth4;
                if (C497740JfY.LJJ()) {
                    i2 = -1;
                }
                TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, i2 * i4, 0.0f, 0.0f);
                translateAnimation2.setDuration(1000L);
                translateAnimation2.setInterpolator(c2268791DrB2);
                AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation3.setDuration(150L);
                alphaAnimation3.setInterpolator(c2268791DrB2);
                AlphaAnimation alphaAnimation4 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation4.setDuration(150L);
                alphaAnimation4.setStartOffset(850L);
                alphaAnimation4.setInterpolator(c2268791DrB2);
                translateAnimation2.setAnimationListener(new AnimationAnimationListenerC1151560g4Y(c1091080eV0, animationSet, 2));
                animationSet2.addAnimation(translateAnimation2);
                animationSet2.addAnimation(alphaAnimation3);
                animationSet2.addAnimation(alphaAnimation4);
                C1324720kZq c1324720kZqLIZLLL2 = ((C1091080eV0) animationAnimationListenerC1151560g4Y.l0).LIZLLL();
                if (c1324720kZqLIZLLL2 != null) {
                    c1324720kZqLIZLLL2.startAnimation(animationSet2);
                    return;
                }
                return;
            }
        }
        C1324720kZq c1324720kZqLIZLLL3 = c1091080eV0.LIZLLL();
        if (c1324720kZqLIZLLL3 != null) {
            C786410Ut5.LLJJIII(c1324720kZqLIZLLL3, 8);
        }
        C1324720kZq c1324720kZqLIZJ2 = c1091080eV0.LIZJ();
        if (c1324720kZqLIZJ2 != null) {
            C786410Ut5.LLJJIII(c1324720kZqLIZJ2, 8);
        }
        Space space = (Space) c1091080eV0.LIZ.getValue();
        if (space != null) {
            C786410Ut5.LLIIZ(space, 8);
        }
        Space space2 = (Space) c1091080eV0.LIZJ.getValue();
        if (space2 == null) {
            return;
        }
        C786410Ut5.LLIIZ(space2, 8);
    }

    public static final void onAnimationEnd$2(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
        C1324720kZq c1324720kZqLIZLLL = ((C1091080eV0) animationAnimationListenerC1151560g4Y.l0).LIZLLL();
        if (c1324720kZqLIZLLL != null) {
            C786410Ut5.LLJJIII(c1324720kZqLIZLLL, 8);
        }
        Space space = (Space) ((C1091080eV0) animationAnimationListenerC1151560g4Y.l0).LIZ.getValue();
        if (space != null) {
            C786410Ut5.LLIIZ(space, 8);
        }
        C1324720kZq c1324720kZqLIZJ = ((C1091080eV0) animationAnimationListenerC1151560g4Y.l0).LIZJ();
        if (c1324720kZqLIZJ != null) {
            c1324720kZqLIZJ.startAnimation((AnimationSet) animationAnimationListenerC1151560g4Y.l1);
        }
    }

    public static final void onAnimationEnd$3(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
        C500260Jjc.LJIILIIL((View) animationAnimationListenerC1151560g4Y.l0);
        ((Function0) animationAnimationListenerC1151560g4Y.l1).invoke();
    }

    public static final void onAnimationStart$2(AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y, Animation animation) {
        C1324720kZq c1324720kZqLIZLLL = ((C1091080eV0) animationAnimationListenerC1151560g4Y.l0).LIZLLL();
        if (c1324720kZqLIZLLL != null) {
            C786410Ut5.LLJJIII(c1324720kZqLIZLLL, 0);
        }
        C1324720kZq c1324720kZqLIZLLL2 = ((C1091080eV0) animationAnimationListenerC1151560g4Y.l0).LIZLLL();
        if (c1324720kZqLIZLLL2 != null) {
            C786410Ut5.h5(c1324720kZqLIZLLL2, 1.0f);
        }
        Space space = (Space) ((C1091080eV0) animationAnimationListenerC1151560g4Y.l0).LIZ.getValue();
        if (space != null) {
            C786410Ut5.LLIIZ(space, 0);
        }
    }

    public AnimationAnimationListenerC1151560g4Y(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
