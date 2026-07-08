package Y;

import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class AUListenerS2S0203000_11 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS2S0203000_11 aUListenerS2S0203000_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS2S0203000_11.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            VideoShareAssem videoShareAssem = (VideoShareAssem) aUListenerS2S0203000_11.l1;
            int i = aUListenerS2S0203000_11.i2;
            int i2 = aUListenerS2S0203000_11.i3;
            int i3 = aUListenerS2S0203000_11.i4;
            float fFloatValue = f.floatValue();
            RemoteImageView remoteImageView = (RemoteImageView) videoShareAssem.getContentView().findViewById(R.id.uzq);
            float f2 = 1.0f - fFloatValue;
            C786410Ut5.kc(remoteImageView, f2);
            C786410Ut5.Fc(remoteImageView, f2);
            TuxIconView tuxIconView = (TuxIconView) videoShareAssem.getContentView().findViewById(R.id.qvq);
            if (tuxIconView != null) {
                C786410Ut5.Uc(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) - ((i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))) * fFloatValue));
                C786410Ut5.vd(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)) - ((i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))) * fFloatValue));
                float f3 = (i3 * fFloatValue) + 1;
                C786410Ut5.hc(tuxIconView, f3);
                C786410Ut5.Cc(tuxIconView, f3);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS2S0203000_11 aUListenerS2S0203000_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS2S0203000_11.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            VideoShareAssem videoShareAssem = (VideoShareAssem) aUListenerS2S0203000_11.l1;
            int i = aUListenerS2S0203000_11.i2;
            int i2 = aUListenerS2S0203000_11.i3;
            int i3 = aUListenerS2S0203000_11.i4;
            float fFloatValue = f.floatValue();
            RemoteImageView remoteImageView = (RemoteImageView) videoShareAssem.getContentView().findViewById(R.id.uzq);
            float f2 = 1.0f - fFloatValue;
            C786410Ut5.kc(remoteImageView, f2);
            C786410Ut5.Fc(remoteImageView, f2);
            TuxIconView tuxIconView = (TuxIconView) videoShareAssem.getContentView().findViewById(R.id.qvq);
            if (tuxIconView != null) {
                C786410Ut5.Uc(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) - ((i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))) * fFloatValue));
                C786410Ut5.vd(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)) - ((i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))) * fFloatValue));
                float f3 = (i3 * fFloatValue) + 1;
                C786410Ut5.hc(tuxIconView, f3);
                C786410Ut5.Cc(tuxIconView, f3);
            }
        }
    }

    public AUListenerS2S0203000_11(ValueAnimator valueAnimator, VideoShareAssem videoShareAssem, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = valueAnimator;
        this.l1 = videoShareAssem;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
    }
}
