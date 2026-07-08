package X;

import Y.AAListenerS139S0300000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.AnimationData;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eV0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091080eV0 implements InterfaceC1091020eUu {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    public final C1324720kZq LIZJ() {
        return (C1324720kZq) this.LIZLLL.getValue();
    }

    public final C1324720kZq LIZLLL() {
        return (C1324720kZq) this.LIZIZ.getValue();
    }

    public final FrameLayout LJ() {
        return (FrameLayout) this.LJFF.getValue();
    }

    public C1091080eV0(View view) {
        this.LIZ = C452501pT.LIZIZ(new AwS561S0100000_17(view, 422));
        this.LIZIZ = C452501pT.LIZIZ(new AwS561S0100000_17(view, 421));
        this.LIZJ = C452501pT.LIZIZ(new AwS561S0100000_17(view, 419));
        this.LIZLLL = C452501pT.LIZIZ(new AwS561S0100000_17(view, 418));
        this.LJ = C452501pT.LIZIZ(new AwS561S0100000_17(view, 424));
        this.LJFF = C452501pT.LIZIZ(new AwS561S0100000_17(view, 426));
        this.LJI = C452501pT.LIZIZ(new AwS561S0100000_17(view, 425));
        this.LJII = C452501pT.LIZIZ(new AwS561S0100000_17(view, 423));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS561S0100000_17(view, 420));
    }

    public final void LIZIZ(InterfaceC1091000eUs interfaceC1091000eUs) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (interfaceC1091000eUs != null) {
            interfaceC1091000eUs.LIZ();
        }
        FrameLayout frameLayoutLJ = LJ();
        if (frameLayoutLJ != null) {
            C786410Ut5.LJZ(8, frameLayoutLJ);
        }
        LinearLayout linearLayout = (LinearLayout) this.LJ.getValue();
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, 1.0f);
        }
        FrameLayout frameLayoutLJ2 = LJ();
        if (frameLayoutLJ2 != null) {
            C786410Ut5.U4(frameLayoutLJ2, 1.0f);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LJII.getValue();
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        View view = (View) this.LJ.getValue();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (view != null) {
            view.setBackground(null);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.LJ.getValue();
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, null);
        }
        C16F5 c16f5 = (C16F5) this.LJIIIIZZ.getValue();
        if (c16f5 != null) {
            View view2 = (View) this.LJIIIIZZ.getValue();
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(0.0f));
                marginLayoutParams2 = marginLayoutParams;
            }
            C786410Ut5.y6(c16f5, marginLayoutParams2);
        }
    }

    @Override // X.InterfaceC1091020eUu
    public final void LIZ(final C1090910eUj c1090910eUj, C1090940eUm c1090940eUm) {
        final InterfaceC1091000eUs interfaceC1091000eUs;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        BarrageMessage barrageMessage = c1090910eUj.LIZJ;
        if (barrageMessage != null) {
            AnimationData animationData = barrageMessage.animationData;
            AnimationSet animationSet = null;
            if (animationData == null) {
                interfaceC1091000eUs = null;
            } else {
                FrameLayout frameLayoutLJ = LJ();
                if (frameLayoutLJ != null) {
                    C786410Ut5.LJZ(0, frameLayoutLJ);
                }
                Space space = (Space) this.LJI.getValue();
                if (space != null) {
                    C786410Ut5.LLIIZ(space, 0);
                }
                C19MB c19mb = new C19MB();
                c19mb.LJII((ConstraintLayout) this.LJII.getValue());
                c19mb.LJIIIIZZ(R.id.l_r, 7, R.id.ty0, 7);
                c19mb.LIZIZ((ConstraintLayout) this.LJII.getValue());
                FrameLayout frameLayoutLJ2 = LJ();
                if (frameLayoutLJ2 != null) {
                    C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(2.5f), frameLayoutLJ2);
                }
                float fLJIIIZ = animationData.width;
                if (fLJIIIZ <= 0.0f) {
                    fLJIIIZ = C497740JfY.LJIIIZ(R.dimen.lf);
                }
                float fLJIIIZ2 = animationData.height;
                if (fLJIIIZ2 <= 0.0f) {
                    fLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.le);
                }
                FrameLayout frameLayoutLJ3 = LJ();
                if (frameLayoutLJ3 != null && (layoutParams2 = frameLayoutLJ3.getLayoutParams()) != null) {
                    layoutParams2.width = (int) C497740JfY.LIZIZ(fLJIIIZ);
                    layoutParams2.height = (int) C497740JfY.LIZIZ(fLJIIIZ2);
                    FrameLayout frameLayoutLJ4 = LJ();
                    if (frameLayoutLJ4 != null) {
                        C786410Ut5.a6(frameLayoutLJ4, layoutParams2);
                    }
                }
                int iLIZIZ = (int) C497740JfY.LIZIZ(animationData.rightOffset);
                View view = (View) this.LJI.getValue();
                if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                    if (iLIZIZ <= 0) {
                        iLIZIZ = C497740JfY.LJIIIZ(R.dimen.lm);
                    }
                    layoutParams.width = iLIZIZ;
                    Space space2 = (Space) this.LJI.getValue();
                    if (space2 != null) {
                        C786410Ut5.f6(space2, layoutParams);
                    }
                }
                InterfaceC1091000eUs interfaceC1091000eUs2 = c1090910eUj.LJFF;
                if (interfaceC1091000eUs2 != null) {
                    interfaceC1091000eUs2.LIZIZ(animationData, c1090910eUj.LIZIZ, LJ());
                }
                interfaceC1091000eUs = c1090910eUj.LJFF;
            }
            c1090940eUm.LIZJ = interfaceC1091000eUs;
            ImageModel imageModel = barrageMessage.ribbonAnimation;
            if (imageModel != null) {
                int iLJIIIZ = imageModel.width;
                if (iLJIIIZ <= 0) {
                    iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ld);
                }
                int iLJIIIZ2 = imageModel.height;
                if (iLJIIIZ2 <= 0) {
                    iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.lc);
                }
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(C842240X2g.LIZ(imageModel));
                c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLIZJ.LJ = iLJIIIZ;
                c1324610kZfLIZJ.LJFF = iLJIIIZ2;
                c1324610kZfLIZJ.LJJI(LIZLLL());
                C1324610kZf c1324610kZfLIZJ2 = C1819620xS4.LIZ().LIZJ(C842240X2g.LIZ(imageModel));
                c1324610kZfLIZJ2.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLIZJ2.LJ = iLJIIIZ;
                c1324610kZfLIZJ2.LJFF = iLJIIIZ2;
                c1324610kZfLIZJ2.LJJI(LIZJ());
            }
            long j = barrageMessage.duration;
            int i = barrageMessage.showType;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    animationSet = new AnimationSet(true);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    C2268791DrB c2268791DrB = new C2268791DrB(0.48f, 0.04f, 0.52f, 0.96f);
                    alphaAnimation.setDuration(125L);
                    alphaAnimation.setInterpolator(c2268791DrB);
                    animationSet.addAnimation(alphaAnimation);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setDuration(125L);
                    alphaAnimation2.setStartOffset(j + 125);
                    alphaAnimation2.setInterpolator(c2268791DrB);
                    animationSet.addAnimation(alphaAnimation2);
                    animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: X.0eUz
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            this.LIZ.LIZIZ(interfaceC1091000eUs);
                            InterfaceC1091060eUy interfaceC1091060eUy = c1090910eUj.LIZ;
                            if (interfaceC1091060eUy != null) {
                                interfaceC1091060eUy.LIZIZ();
                            }
                        }
                    });
                }
            } else {
                AnimationAnimationListenerC1151560g4Y animationAnimationListenerC1151560g4Y = new AnimationAnimationListenerC1151560g4Y(this, imageModel, 1);
                animationSet = new AnimationSet(true);
                C2268791DrB c2268791DrB2 = new C2268791DrB(0.48f, 0.04f, 0.52f, 0.96f);
                animationSet.setFillAfter(true);
                if (C497740JfY.LJJ()) {
                    i2 = -1;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(1, i2 * (-1.0f), 1, 0.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(500L);
                translateAnimation.setInterpolator(new C2268791DrB(0.12f, 0.5f, 0.21f, 1.0f));
                translateAnimation.setAnimationListener(animationAnimationListenerC1151560g4Y);
                animationSet.addAnimation(translateAnimation);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(400L);
                valueAnimatorOfFloat.setStartDelay(j + 500);
                valueAnimatorOfFloat.setInterpolator(c2268791DrB2);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 69));
                valueAnimatorOfFloat.addListener(new AAListenerS139S0300000_17(this, interfaceC1091000eUs, c1090910eUj, 3));
                animationSet.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(valueAnimatorOfFloat, 18));
            }
            c1090940eUm.LIZIZ = animationSet;
        }
    }
}
