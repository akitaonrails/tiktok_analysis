package Y;

import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMAwemeSideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveReactionVideoAssem;

/* JADX INFO: loaded from: classes15.dex */
public class AUListenerS57S0201000_14 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS57S0201000_14 aUListenerS57S0201000_14, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int iLIZIZ = aUListenerS57S0201000_14.i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(82));
        QuickLiveReactionVideoAssem quickLiveReactionVideoAssem = (QuickLiveReactionVideoAssem) aUListenerS57S0201000_14.l0;
        int i = aUListenerS57S0201000_14.i2;
        quickLiveReactionVideoAssem.getClass();
        int i2 = (int) (i + ((iLIZIZ - i) * animatedFraction));
        QuickLiveReactionVideoAssem quickLiveReactionVideoAssem2 = (QuickLiveReactionVideoAssem) aUListenerS57S0201000_14.l0;
        int i3 = aUListenerS57S0201000_14.i2;
        quickLiveReactionVideoAssem2.getClass();
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) aUListenerS57S0201000_14.l1).getLayoutParams();
        layoutParams.height = (int) (i3 + ((iLIZIZ - i3) * animatedFraction));
        layoutParams.width = i2;
        C786410Ut5.d6((LinearLayout) aUListenerS57S0201000_14.l1, layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS57S0201000_14 aUListenerS57S0201000_14, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int iLIZIZ = aUListenerS57S0201000_14.i2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(82));
        QuickLiveReactionVideoAssem quickLiveReactionVideoAssem = (QuickLiveReactionVideoAssem) aUListenerS57S0201000_14.l0;
        int i = aUListenerS57S0201000_14.i2;
        quickLiveReactionVideoAssem.getClass();
        int i2 = (int) (i + ((iLIZIZ - i) * animatedFraction));
        QuickLiveReactionVideoAssem quickLiveReactionVideoAssem2 = (QuickLiveReactionVideoAssem) aUListenerS57S0201000_14.l0;
        int i3 = aUListenerS57S0201000_14.i2;
        quickLiveReactionVideoAssem2.getClass();
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) aUListenerS57S0201000_14.l1).getLayoutParams();
        layoutParams.height = (int) (i3 + ((iLIZIZ - i3) * animatedFraction));
        layoutParams.width = i2;
        C786410Ut5.d6((LinearLayout) aUListenerS57S0201000_14.l1, layoutParams);
    }

    public static final void onAnimationUpdate$2(AUListenerS57S0201000_14 aUListenerS57S0201000_14, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int width = ((View) aUListenerS57S0201000_14.l0).getWidth();
        DMAwemeSideMessageStatusReusedSkeletonUISlot dMAwemeSideMessageStatusReusedSkeletonUISlot = (DMAwemeSideMessageStatusReusedSkeletonUISlot) aUListenerS57S0201000_14.l1;
        int i = aUListenerS57S0201000_14.i2;
        dMAwemeSideMessageStatusReusedSkeletonUISlot.getClass();
        ViewGroup.LayoutParams layoutParams = ((DMAwemeSideMessageStatusReusedSkeletonUISlot) aUListenerS57S0201000_14.l1).Jp().getLayoutParams();
        layoutParams.width = (int) (i + ((width - i) * animatedFraction));
        C786410Ut5.W5(((DMAwemeSideMessageStatusReusedSkeletonUISlot) aUListenerS57S0201000_14.l1).Jp(), layoutParams);
    }

    public static final void onAnimationUpdate$3(AUListenerS57S0201000_14 aUListenerS57S0201000_14, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int width = ((View) aUListenerS57S0201000_14.l0).getWidth();
        DMAwemeSideMessageStatusReusedSkeletonUISlot dMAwemeSideMessageStatusReusedSkeletonUISlot = (DMAwemeSideMessageStatusReusedSkeletonUISlot) aUListenerS57S0201000_14.l1;
        int i = aUListenerS57S0201000_14.i2;
        dMAwemeSideMessageStatusReusedSkeletonUISlot.getClass();
        ViewGroup.LayoutParams layoutParams = ((DMAwemeSideMessageStatusReusedSkeletonUISlot) aUListenerS57S0201000_14.l1).Jp().getLayoutParams();
        layoutParams.width = (int) (width + ((i - width) * animatedFraction));
        C786410Ut5.W5(((DMAwemeSideMessageStatusReusedSkeletonUISlot) aUListenerS57S0201000_14.l1).Jp(), layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS57S0201000_14(int i, int i2, QuickLiveReactionVideoAssem<T, RECEIVER> quickLiveReactionVideoAssem, LinearLayout linearLayout) {
        this.$t = linearLayout;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = quickLiveReactionVideoAssem;
    }
}
