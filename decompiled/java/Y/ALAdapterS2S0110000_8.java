package Y;

import X.C20622515mp;
import X.C560820Lz6;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class ALAdapterS2S0110000_8 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public ALAdapterS2S0110000_8(MvChoosePhotoScene mvChoosePhotoScene, int i) {
        this.$t = i;
        this.l0 = mvChoosePhotoScene;
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0110000_8 aLAdapterS2S0110000_8, Animator animator) {
        if (C20622515mp.LJII() && !aLAdapterS2S0110000_8.z1) {
            aLAdapterS2S0110000_8.z1 = true;
            ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) aLAdapterS2S0110000_8.l0).chooseMediaViewModel;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.yR2(new AwS587S0100000_8((ClosingChooseMediaPageState) ClosingChooseMediaPageState.Closed.INSTANCE, 166));
            }
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0110000_8 aLAdapterS2S0110000_8, Animator animator) {
        if (!aLAdapterS2S0110000_8.z1) {
            aLAdapterS2S0110000_8.z1 = true;
            ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) aLAdapterS2S0110000_8.l0).chooseMediaViewModel;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.yR2(new AwS587S0100000_8((ClosingChooseMediaPageState) ClosingChooseMediaPageState.Closed.INSTANCE, 166));
            }
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0110000_8 aLAdapterS2S0110000_8, Animator animator) {
        int i;
        View view = ((C560820Lz6) aLAdapterS2S0110000_8.l0).mView;
        if (view != null) {
            if (aLAdapterS2S0110000_8.z1) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public ALAdapterS2S0110000_8(C560820Lz6 c560820Lz6, boolean z, int i) {
        this.$t = i;
        this.l0 = c560820Lz6;
        this.z1 = z;
    }
}
