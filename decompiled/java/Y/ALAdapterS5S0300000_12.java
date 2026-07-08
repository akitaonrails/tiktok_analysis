package Y;

import X.C0GY9;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1819620xS4;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.bytedance.android.live.broadcast.model.ActivitiesIconInfo;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCampaignWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewCampaignCenterWidget;

/* JADX INFO: loaded from: classes13.dex */
public class ALAdapterS5S0300000_12 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0300000_12 aLAdapterS5S0300000_12, Animator animator) {
        super.onAnimationEnd(animator);
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(((ActivitiesIconInfo) aLAdapterS5S0300000_12.l1).iconImage);
        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_XY;
        c1324610kZfLJIIIZ.LJJI(((PreviewCampaignCenterWidget) aLAdapterS5S0300000_12.l0).LLIZ);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).scaleX(1.0f);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).scaleY(1.0f);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).setDuration(300L);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).setStartDelay(0L);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).setInterpolator(C0GY9.LIZIZ(0.3f, 1.3f, 0.3f, 1.0f));
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).setListener(new ALAdapterS9S0100000_12((PreviewCampaignCenterWidget) aLAdapterS5S0300000_12.l0, 23));
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).start();
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0300000_12 aLAdapterS5S0300000_12, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1324720kZq) aLAdapterS5S0300000_12.l2).animate().setListener(null);
        PreviewCampaignCenterWidget previewCampaignCenterWidget = (PreviewCampaignCenterWidget) aLAdapterS5S0300000_12.l0;
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(previewCampaignCenterWidget, 263);
        previewCampaignCenterWidget.LLJJIII = aRunnableS112S0100000_12;
        C786410Ut5.LJLIIL(3000L, previewCampaignCenterWidget.LLJILJIL, aRunnableS112S0100000_12);
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0300000_12 aLAdapterS5S0300000_12, Animator animator) {
        super.onAnimationEnd(animator);
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(((ActivitiesIconInfo) aLAdapterS5S0300000_12.l1).iconImage);
        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_XY;
        c1324610kZfLJIIIZ.LJJI(((PreviewCampaignWidget) aLAdapterS5S0300000_12.l0).LLJILJIL);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).scaleX(1.0f);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).scaleY(1.0f);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).setDuration(300L);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).setStartDelay(0L);
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).setInterpolator(C0GY9.LIZIZ(0.3f, 1.3f, 0.3f, 1.0f));
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).setListener(new ALAdapterS9S0100000_12((PreviewCampaignWidget) aLAdapterS5S0300000_12.l0, 42));
        ((ViewPropertyAnimator) aLAdapterS5S0300000_12.l2).start();
    }

    public static final void onAnimationStart$0(ALAdapterS5S0300000_12 aLAdapterS5S0300000_12, Animator animator) {
        ((PreviewCampaignCenterWidget) aLAdapterS5S0300000_12.l0).LLILZ = (ActivitiesIconInfo) aLAdapterS5S0300000_12.l1;
    }

    public static final void onAnimationStart$1(ALAdapterS5S0300000_12 aLAdapterS5S0300000_12, Animator animator) {
        ((PreviewCampaignCenterWidget) aLAdapterS5S0300000_12.l0).LLILZ = (ActivitiesIconInfo) aLAdapterS5S0300000_12.l1;
    }

    public static final void onAnimationStart$2(ALAdapterS5S0300000_12 aLAdapterS5S0300000_12, Animator animator) {
        ((PreviewCampaignWidget) aLAdapterS5S0300000_12.l0).LLIZLLLIL = (ActivitiesIconInfo) aLAdapterS5S0300000_12.l1;
    }

    public ALAdapterS5S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
