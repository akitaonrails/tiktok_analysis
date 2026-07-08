package Y;

import X.C14J2;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.tako.otherpage.settings.ui.TakoSettingsOperationItemAssem;
import kotlin.jvm.internal.AwS396S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public class AUListenerS232S0200000_30 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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

    public static final void onAnimationUpdate$0(AUListenerS232S0200000_30 aUListenerS232S0200000_30, ValueAnimator valueAnimator) {
        ((C14J2) aUListenerS232S0200000_30.l0).setUI(new AwS396S0200000_30((TakoSettingsOperationItemAssem) aUListenerS232S0200000_30.l1, valueAnimator, 55));
    }

    public static final void onAnimationUpdate$1(AUListenerS232S0200000_30 aUListenerS232S0200000_30, ValueAnimator valueAnimator) {
        ((C14J2) aUListenerS232S0200000_30.l0).setUI(new AwS396S0200000_30((TakoSettingsOperationItemAssem) aUListenerS232S0200000_30.l1, valueAnimator, 56));
    }

    public AUListenerS232S0200000_30(C14J2 c14j2, TakoSettingsOperationItemAssem takoSettingsOperationItemAssem, int i) {
        this.$t = i;
        this.l0 = c14j2;
        this.l1 = takoSettingsOperationItemAssem;
    }
}
