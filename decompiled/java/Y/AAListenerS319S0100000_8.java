package Y;

import X.C0MRW;
import X.C20622515mp;
import X.C786410Ut5;
import android.animation.Animator;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class AAListenerS319S0100000_8 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$0(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationCancel$3(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationCancel$4(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationStart$3(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
    }

    public static final void onAnimationStart$4(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
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
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
                break;
            case 4:
                onAnimationCancel$4(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Throwable {
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
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
                break;
            case 4:
                onAnimationRepeat$4(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
        }
    }

    public AAListenerS319S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
        View view;
        ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) aAListenerS319S0100000_8.l0).chooseMediaViewModel;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.yR2(new AwS587S0100000_8(OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE, 187));
        }
        ((MvChoosePhotoScene) aAListenerS319S0100000_8.l0).mobPhotoPanelShow();
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aAListenerS319S0100000_8.l0;
        if (mvChoosePhotoScene.setDimOverlay && (view = mvChoosePhotoScene.dimOverlay) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
        View view = ((MvChoosePhotoScene) aAListenerS319S0100000_8.l0).dimOverlay;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ((MvChoosePhotoScene) aAListenerS319S0100000_8.l0).finishScene(false);
        Activity activity = ((MvChoosePhotoScene) aAListenerS319S0100000_8.l0).mActivity;
        if (activity != null) {
            C20622515mp.LIZ(activity, R.anim.a8);
        }
    }

    public static final void onAnimationEnd$2(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
        C0MRW c0mrw = (C0MRW) aAListenerS319S0100000_8.l0;
        FrameLayout frameLayout = c0mrw.LJIIIZ;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ(c0mrw.LIZJ, frameLayout);
        }
        ((C0MRW) aAListenerS319S0100000_8.l0).LJIIJJI = true;
    }

    public static final void onAnimationEnd$3(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) throws Throwable {
        C0MRW c0mrw = (C0MRW) aAListenerS319S0100000_8.l0;
        c0mrw.LJIIL = 2;
        c0mrw.LJIILLIIL.run();
    }

    public static final void onAnimationEnd$4(AAListenerS319S0100000_8 aAListenerS319S0100000_8, Animator animator) {
        ((Function0) aAListenerS319S0100000_8.l0).invoke();
    }
}
