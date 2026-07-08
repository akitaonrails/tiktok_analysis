package X;

import Y.ALAdapterS8S0110000_24;
import Y.AUListenerS229S0200000_24;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.experiment.TopTabUiAlignmentConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593710rZh {
    public static final /* synthetic */ int LIZ = 0;

    public static ObjectAnimator LIZ(View view) {
        int i = 0;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.9f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.9f, 1.0f));
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = C1581510rG1.LIZ;
        if (topTabUiAlignmentConfig != null) {
            i = topTabUiAlignmentConfig.tabTopIconAnimatorDuration;
        }
        ObjectAnimator duration = objectAnimatorOfPropertyValuesHolder.setDuration(i);
        duration.setInterpolator(C1619980sG4.LIZLLL());
        return duration;
    }

    public static ObjectAnimator LIZIZ(View view) {
        int i = 0;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.9f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.9f));
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = C1581510rG1.LIZ;
        if (topTabUiAlignmentConfig != null) {
            i = topTabUiAlignmentConfig.tabTopIconAnimatorDuration;
        }
        ObjectAnimator duration = objectAnimatorOfPropertyValuesHolder.setDuration(i);
        duration.setInterpolator(C1619980sG4.LIZLLL());
        return duration;
    }

    public static ValueAnimator LIZJ(Function0 function0) {
        int i;
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = C1581510rG1.LIZ;
        if (topTabUiAlignmentConfig != null) {
            i = topTabUiAlignmentConfig.tabTopIconAnimatorDuration;
        } else {
            i = 0;
        }
        ValueAnimator duration = ValueAnimator.ofInt(0, i).setDuration(i);
        duration.setInterpolator(new LinearInterpolator());
        ALAdapterS8S0110000_24 aLAdapterS8S0110000_24 = new ALAdapterS8S0110000_24(function0, 1);
        duration.addListener(aLAdapterS8S0110000_24);
        duration.addUpdateListener(new AUListenerS229S0200000_24(aLAdapterS8S0110000_24, function0, 3));
        return duration;
    }
}
