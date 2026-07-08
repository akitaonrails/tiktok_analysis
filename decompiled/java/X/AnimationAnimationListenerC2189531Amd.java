package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: X.1Amd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class AnimationAnimationListenerC2189531Amd implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationRepeat$2(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationRepeat$3(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationRepeat$4(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationRepeat$5(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationStart$2(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationStart$3(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationStart$4(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
    }

    public static final void onAnimationStart$5(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
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
            case 4:
                onAnimationEnd$4(this, animation);
                break;
            case 5:
                onAnimationEnd$5(this, animation);
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
            case 4:
                onAnimationRepeat$4(this, animation);
                break;
            case 5:
                onAnimationRepeat$5(this, animation);
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
            case 4:
                onAnimationStart$4(this, animation);
                break;
            case 5:
                onAnimationStart$5(this, animation);
                break;
        }
    }

    public AnimationAnimationListenerC2189531Amd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
        InterfaceC1572870r25 interfaceC1572870r25;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) animationAnimationListenerC2189531Amd.l0;
        if (swipeRefreshLayout.LLILLL) {
            swipeRefreshLayout.LLJJJJLIIL.setAlpha(255);
            ((SwipeRefreshLayout) animationAnimationListenerC2189531Amd.l0).LLJJJJLIIL.start();
            SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) animationAnimationListenerC2189531Amd.l0;
            if (swipeRefreshLayout2.LLJLILLLLZIIL && (interfaceC1572870r25 = swipeRefreshLayout2.LLILLJJLI) != null) {
                interfaceC1572870r25.LJFF();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) animationAnimationListenerC2189531Amd.l0;
            swipeRefreshLayout3.LLJILJILJ = swipeRefreshLayout3.LLJJIJIIJIL.getTop();
            return;
        }
        swipeRefreshLayout.LJFF();
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
        ((SwipeRefreshLayout) animationAnimationListenerC2189531Amd.l0).getClass();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) animationAnimationListenerC2189531Amd.l0;
        swipeRefreshLayout.getClass();
        C21582819dK c21582819dK = new C21582819dK(swipeRefreshLayout);
        swipeRefreshLayout.LLJJLIIIJLLLLLLLZ = c21582819dK;
        c21582819dK.setDuration(150L);
        C20745316Fv c20745316Fv = swipeRefreshLayout.LLJJIJIIJIL;
        c20745316Fv.LL = null;
        c20745316Fv.clearAnimation();
        swipeRefreshLayout.LLJJIJIIJIL.startAnimation(swipeRefreshLayout.LLJJLIIIJLLLLLLLZ);
    }

    public static final void onAnimationEnd$2(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
        ((C21610619ho) ((AnimationAnimationListenerC2189531Amd) animationAnimationListenerC2189531Amd.l0).l0).LJI(false);
        C20745216Fu c20745216Fu = ((C21610619ho) ((AnimationAnimationListenerC2189531Amd) animationAnimationListenerC2189531Amd.l0).l0).LLJJJIL;
        int visibility = c20745216Fu.getVisibility();
        c20745216Fu.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c20745216Fu);
    }

    public static final void onAnimationEnd$3(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
        C21610619ho c21610619ho = (C21610619ho) animationAnimationListenerC2189531Amd.l0;
        if (!c21610619ho.LLJJIJIL) {
            AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd2 = new AnimationAnimationListenerC2189531Amd(animationAnimationListenerC2189531Amd, 2);
            C21611719hz c21611719hz = new C21611719hz(c21610619ho);
            c21610619ho.LLJLILLLLZIIL = c21611719hz;
            c21611719hz.setDuration(150L);
            C20745216Fu c20745216Fu = c21610619ho.LLJJJIL;
            c20745216Fu.LL = animationAnimationListenerC2189531Amd2;
            c20745216Fu.clearAnimation();
            c21610619ho.LLJJJIL.startAnimation(c21610619ho.LLJLILLLLZIIL);
        }
    }

    public static final void onAnimationEnd$4(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
        C21609119hZ c21609119hZ = (C21609119hZ) animationAnimationListenerC2189531Amd.l0;
        if (c21609119hZ.LLILZ) {
            c21609119hZ.LLLFFI.LIZIZ(false);
            C21609119hZ c21609119hZ2 = (C21609119hZ) animationAnimationListenerC2189531Amd.l0;
            c21609119hZ2.LLJLIL.LLILLJJLI.LJIJJ = 255;
            if (c21609119hZ2.LLJLLL) {
                InterfaceC1581920rGg interfaceC1581920rGg = c21609119hZ2.LLIZ;
                if (interfaceC1581920rGg != null) {
                    interfaceC1581920rGg.LJFF();
                }
                InterfaceC21610119hj interfaceC21610119hj = ((C21609119hZ) animationAnimationListenerC2189531Amd.l0).LLJ;
                if (interfaceC21610119hj != null) {
                    interfaceC21610119hj.LJFF();
                }
            }
            ((C21609119hZ) animationAnimationListenerC2189531Amd.l0).LLIZLLLIL = false;
            return;
        }
        c21609119hZ.LJ();
    }

    public static final void onAnimationEnd$5(AnimationAnimationListenerC2189531Amd animationAnimationListenerC2189531Amd, Animation animation) {
        final C21609119hZ c21609119hZ = (C21609119hZ) animationAnimationListenerC2189531Amd.l0;
        if (!c21609119hZ.LLJJJ) {
            Animation animation2 = new Animation() { // from class: X.19hg
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
                    c21609119hZ.setAnimationProgress(1.0f - f);
                }
            };
            c21609119hZ.getClass();
            animation2.setDuration(150L);
        }
    }
}
