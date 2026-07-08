package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.12Y9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Y9 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationRepeat$1(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationRepeat$2(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationRepeat$3(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationRepeat$4(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationStart$0(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationStart$1(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationStart$2(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationStart$3(C12Y9 c12y9, Animation animation) {
    }

    public static final void onAnimationStart$4(C12Y9 c12y9, Animation animation) {
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
        }
    }

    public C12Y9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(C12Y9 c12y9, Animation animation) {
        C19419410yG c19419410yG = ((C1401730ma3) c12y9.l0).LIZLLL;
        if (c19419410yG != null) {
            c19419410yG.LIZ(AFwS218S0000000_29.get$arr$(403));
        }
        C19419410yG c19419410yG2 = ((C1401730ma3) c12y9.l0).LJ;
        if (c19419410yG2 != null) {
            c19419410yG2.LIZ(AFwS218S0000000_29.get$arr$(403));
        }
        C19419410yG c19419410yG3 = ((C1401730ma3) c12y9.l0).LIZLLL;
        if (c19419410yG3 != null) {
            c19419410yG3.LIZIZ(AFwS218S0000000_29.get$arr$(402));
        }
        C19419410yG c19419410yG4 = ((C1401730ma3) c12y9.l0).LJ;
        if (c19419410yG4 != null) {
            c19419410yG4.LIZIZ(AFwS218S0000000_29.get$arr$(402));
        }
    }

    public static final void onAnimationEnd$1(C12Y9 c12y9, Animation animation) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) c12y9.l0;
        C1749280vcc c1749280vcc = stickerPropDetailFragment.LLJJJ;
        if (c1749280vcc == null) {
            C786410Ut5.LLIIIJ(stickerPropDetailFragment.LLLLIILLL, 8);
            C786410Ut5.LLIIL(stickerPropDetailFragment.LLJJJJ, 0);
            ViewGroup viewGroup = stickerPropDetailFragment.LLJJJJJIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            stickerPropDetailFragment.sS(null);
            C786410Ut5.LJLLLLLL(0, stickerPropDetailFragment.LLIZLLLIL);
            C786410Ut5.LJLLLLLL(0, stickerPropDetailFragment.LLJJIJIL);
            stickerPropDetailFragment.LLZLLLL.LIZIZ();
            stickerPropDetailFragment.mScrollableLayout.scrollTo(0, 0);
            return;
        }
        c1749280vcc.LJ();
        C786410Ut5.LLLZLZ(stickerPropDetailFragment.LLJJJ, 0);
        throw null;
    }

    public static final void onAnimationEnd$2(C12Y9 c12y9, Animation animation) {
        if (C19420110yN.LIZIZ()) {
            C19420310yP c19420310yP = (C19420310yP) c12y9.l0;
            if (!c19420310yP.LJIIIZ) {
                c19420310yP.LJFF.LIZIZ(AFwS218S0000000_29.get$arr$(402));
            }
        }
    }

    public static final void onAnimationEnd$3(C12Y9 c12y9, Animation animation) {
        ((Function0) c12y9.l0).invoke();
    }

    public static final void onAnimationEnd$4(C12Y9 c12y9, Animation animation) {
        ((C19457811Aq) c12y9.l0).LJJJJLL(true);
    }
}
