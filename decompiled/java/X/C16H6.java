package X;

import android.view.animation.Animation;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;

/* JADX INFO: renamed from: X.16H6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H6 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationEnd$1(C16H6 c16h6, Animation animation) {
    }

    public static final void onAnimationEnd$2(C16H6 c16h6, Animation animation) {
    }

    public static final void onAnimationRepeat$0(C16H6 c16h6, Animation animation) {
    }

    public static final void onAnimationRepeat$1(C16H6 c16h6, Animation animation) {
    }

    public static final void onAnimationRepeat$2(C16H6 c16h6, Animation animation) {
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
        }
    }

    public C16H6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(C16H6 c16h6, Animation animation) {
        ((VideoUserCardAssem) c16h6.l0).up(true, false);
    }

    public static final void onAnimationStart$0(C16H6 c16h6, Animation animation) {
        ((VideoUserCardAssem) c16h6.l0).up(true, true);
    }

    public static final void onAnimationStart$1(C16H6 c16h6, Animation animation) {
        C786410Ut5.LJZ(0, ((C20625115nF) c16h6.l0).LLILLJJLI);
    }

    public static final void onAnimationStart$2(C16H6 c16h6, Animation animation) {
        C786410Ut5.LLLLZLL(((C20625115nF) c16h6.l0).LL, 0);
    }
}
