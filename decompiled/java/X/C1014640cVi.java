package X;

import Y.ALAdapterS12S0100000_16;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014640cVi {
    public static final void LIZ(C1016040cXy c1016040cXy, AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel, boolean z) {
        View interactContainerView;
        AnoleComponentAnimationModel anoleComponentAnimationModel;
        Double initialOpacityValue;
        Double dValueOf;
        Double dValueOf2;
        List<String> list = anoleComponentBusinessAppearModel.businessComponents;
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                InterfaceC1032120cxu interfaceC1032120cxu = c1016040cXy.LIZIZ;
                if (interfaceC1032120cxu != null && (interactContainerView = interfaceC1032120cxu.getInteractContainerView(str)) != null && (anoleComponentAnimationModel = anoleComponentBusinessAppearModel.animationModels) != null && C1016660cYy.LIZLLL(anoleComponentAnimationModel) && Intrinsics.LJFF(C1014570cVb.LIZIZ, C1014540cVY.LIZ(anoleComponentAnimationModel.type)) && (initialOpacityValue = anoleComponentAnimationModel.getInitialOpacityValue()) != null && (dValueOf = Double.valueOf(initialOpacityValue.doubleValue() / ((double) 100))) != null) {
                    double dDoubleValue = dValueOf.doubleValue();
                    Double finalOpacityValue = anoleComponentAnimationModel.getFinalOpacityValue();
                    if (finalOpacityValue != null && (dValueOf2 = Double.valueOf(finalOpacityValue.doubleValue() / ((double) 100))) != null) {
                        double dDoubleValue2 = dValueOf2.doubleValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getOpacityAnimator\n initialOpacityValue:");
                        sbLIZ.append(dDoubleValue);
                        sbLIZ.append("\nfinalOpacityValue:");
                        sbLIZ.append(dDoubleValue2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        Interpolator interpolatorLIZ = C1016660cYy.LIZ(anoleComponentAnimationModel.curve);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(interactContainerView, "alpha", (float) dDoubleValue, (float) dDoubleValue2);
                        objectAnimatorOfFloat.setDuration(anoleComponentAnimationModel.duration);
                        objectAnimatorOfFloat.setStartDelay(anoleComponentAnimationModel.delay);
                        if (interpolatorLIZ != null) {
                            objectAnimatorOfFloat.setInterpolator(interpolatorLIZ);
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorOfFloat);
                        C786410Ut5.LJLLLLLL(0, interactContainerView);
                        animatorSet.start();
                        if (!z) {
                            animatorSet.addListener(new ALAdapterS12S0100000_16(interactContainerView, 22));
                        }
                    }
                }
            }
        }
    }
}
