package Y;

import X.C1860520yW2;
import X.C786410Ut5;
import X.C915980Zwa;
import X.InterfaceC1844900y6q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionGuideLayout;
import com.ss.android.ugc.aweme.tako.botpage.toptitle.TopTitleAssem;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.SevenSheetTopTitleAssem;

/* JADX INFO: loaded from: classes28.dex */
public class ALAdapterS12S0300000_27 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (2 - this.$t != 0) {
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (2 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS12S0300000_27 aLAdapterS12S0300000_27, Animator animator) {
        super.onAnimationCancel(animator);
        ((InterfaceC1844900y6q) aLAdapterS12S0300000_27.l1).LIZLLL();
    }

    public static final void onAnimationEnd$0(ALAdapterS12S0300000_27 aLAdapterS12S0300000_27, Animator animator) {
        super.onAnimationEnd(animator);
        Bitmap bitmap = (Bitmap) aLAdapterS12S0300000_27.l0;
        if (bitmap != null) {
            ((TopTitleAssem) aLAdapterS12S0300000_27.l1).tp(bitmap, (Integer) aLAdapterS12S0300000_27.l2);
        }
        C1860520yW2.LIZ.getClass();
        C1860520yW2.LJIIL().storeInt("tako_key_top_title_square_entrance_anim_show_times", C1860520yW2.LJIIL().getInt("tako_key_top_title_square_entrance_anim_show_times", 0) + 1);
    }

    public static final void onAnimationEnd$1(ALAdapterS12S0300000_27 aLAdapterS12S0300000_27, Animator animator) {
        super.onAnimationEnd(animator);
        Bitmap bitmap = (Bitmap) aLAdapterS12S0300000_27.l0;
        if (bitmap != null) {
            ((SevenSheetTopTitleAssem) aLAdapterS12S0300000_27.l1).tp(bitmap, (Integer) aLAdapterS12S0300000_27.l2);
        }
        C1860520yW2.LIZ.getClass();
        C1860520yW2.LJIIL().storeInt("tako_key_top_title_square_entrance_anim_show_times", C1860520yW2.LJIIL().getInt("tako_key_top_title_square_entrance_anim_show_times", 0) + 1);
    }

    public static final void onAnimationEnd$2(ALAdapterS12S0300000_27 aLAdapterS12S0300000_27, Animator animator) {
        super.onAnimationEnd(animator);
        ((InteractionGuideLayout) aLAdapterS12S0300000_27.l0).ip(8);
        ConstraintLayout constraintLayout = ((InteractionGuideLayout) aLAdapterS12S0300000_27.l0).LLJJI;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.c5(constraintLayout, 1.0f);
        if (!animator.isRunning() && !animator.isStarted()) {
            ((InterfaceC1844900y6q) aLAdapterS12S0300000_27.l1).onFail();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS12S0300000_27 aLAdapterS12S0300000_27, Animator animator) {
        super.onAnimationStart(animator);
        ((InteractionGuideLayout) aLAdapterS12S0300000_27.l0).ip(0);
        ConstraintLayout constraintLayout = ((InteractionGuideLayout) aLAdapterS12S0300000_27.l0).LLJJJ;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(8, constraintLayout);
        ((InterfaceC1844900y6q) aLAdapterS12S0300000_27.l1).onStart();
        if (C915980Zwa.LJFF().co0()) {
            C786410Ut5.Pd((ObjectAnimator) aLAdapterS12S0300000_27.l2);
        }
    }

    public ALAdapterS12S0300000_27(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
