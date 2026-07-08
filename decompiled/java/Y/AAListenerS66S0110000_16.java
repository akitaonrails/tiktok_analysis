package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.aweme.tako.multipletemplate.album.TakoMediaChooseAlbumAssem;

/* JADX INFO: loaded from: classes17.dex */
public class AAListenerS66S0110000_16 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void onAnimationCancel$0(AAListenerS66S0110000_16 aAListenerS66S0110000_16, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS66S0110000_16 aAListenerS66S0110000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS66S0110000_16 aAListenerS66S0110000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS66S0110000_16 aAListenerS66S0110000_16, Animator animator) {
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

    public static final void onAnimationEnd$0(AAListenerS66S0110000_16 aAListenerS66S0110000_16, Animator animator) {
        int i;
        View view = (View) aAListenerS66S0110000_16.l0;
        if (aAListenerS66S0110000_16.z1) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public static final void onAnimationEnd$1(AAListenerS66S0110000_16 aAListenerS66S0110000_16, Animator animator) {
        if (!aAListenerS66S0110000_16.z1) {
            C786410Ut5.LJLLLLLL(4, ((TakoMediaChooseAlbumAssem) aAListenerS66S0110000_16.l0).LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(0, ((TakoMediaChooseAlbumAssem) aAListenerS66S0110000_16.l0).LJJIJL());
        }
    }

    public static final void onAnimationStart$0(AAListenerS66S0110000_16 aAListenerS66S0110000_16, Animator animator) {
        if (aAListenerS66S0110000_16.z1) {
            C786410Ut5.LJLLLLLL(0, (View) aAListenerS66S0110000_16.l0);
        }
    }

    public static final void onAnimationStart$1(AAListenerS66S0110000_16 aAListenerS66S0110000_16, Animator animator) {
        if (aAListenerS66S0110000_16.z1) {
            C786410Ut5.LJLLLLLL(0, ((TakoMediaChooseAlbumAssem) aAListenerS66S0110000_16.l0).LJJIJL());
        }
    }

    public AAListenerS66S0110000_16(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
