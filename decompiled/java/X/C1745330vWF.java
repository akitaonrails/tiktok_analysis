package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.InputResultIndicator;

/* JADX INFO: renamed from: X.0vWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745330vWF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(View view) {
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.5f);
            objectAnimatorOfFloat.setRepeatCount(1);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setRepeatMode(2);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public static void LIZ(boolean z, C1745340vWG c1745340vWG, C1745300vWC c1745300vWC) {
        if (C1745310vWD.LIZ(c1745340vWG)) {
            c1745300vWC.LIZIZ();
            return;
        }
        if (z) {
            c1745300vWC.LJFF(c1745340vWG);
            return;
        }
        if (c1745340vWG != null && c1745340vWG.LIZJ) {
            c1745300vWC.LJFF(c1745340vWG);
            return;
        }
        InputResultIndicator inputResultIndicatorFromXml = c1745300vWC.getInputResultIndicatorFromXml();
        if (inputResultIndicatorFromXml == null || inputResultIndicatorFromXml.LLILLJJLI.getVisibility() == 0) {
            return;
        }
        LIZIZ(c1745300vWC.getInputWithIndicatorEditTextFromXml());
        LIZIZ(c1745300vWC.getTitleFromXml());
    }
}
