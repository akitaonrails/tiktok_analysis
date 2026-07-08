package X;

import Y.AUListenerS152S0300000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eEE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080680eEE extends AnimationInfo {
    public ValueAnimator LIZ;
    public ValueAnimator LIZIZ;
    public final int LIZJ;
    public final /* synthetic */ C1080530eDz LIZLLL;

    public final ValueAnimator LIZ(ConstraintProperty constraintProperty) {
        ValueAnimator valueAnimator = new ValueAnimator();
        C1080530eDz c1080530eDz = this.LIZLLL;
        ConstraintProperty constraintPropertyById = c1080530eDz.getConstraintPropertyById(R.id.ebm);
        valueAnimator.setDuration(c1080530eDz.getAnimationDuration());
        valueAnimator.addUpdateListener(new AUListenerS152S0300000_17(constraintPropertyById, constraintProperty, this, 1));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        int iMargin;
        if (this.LIZIZ == null) {
            this.LIZIZ = LIZ(constraintProperty);
        }
        ValueAnimator valueAnimator = this.LIZIZ;
        if (valueAnimator != null) {
            int[] iArr = new int[2];
            ConstraintProperty constraintPropertyById = this.LIZLLL.getConstraintPropertyById(R.id.ebm);
            if (constraintPropertyById != null) {
                iMargin = constraintPropertyById.margin(4);
            } else {
                iMargin = 0;
            }
            iArr[0] = iMargin;
            iArr[1] = 0;
            valueAnimator.setIntValues(iArr);
            return valueAnimator;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        int iMargin;
        if (this.LIZ == null) {
            this.LIZ = LIZ(constraintProperty);
        }
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            C1080530eDz c1080530eDz = this.LIZLLL;
            int[] iArr = new int[2];
            ConstraintProperty constraintPropertyById = c1080530eDz.getConstraintPropertyById(R.id.ebm);
            if (constraintPropertyById != null) {
                iMargin = constraintPropertyById.margin(4);
            } else {
                iMargin = 0;
            }
            iArr[0] = iMargin;
            iArr[1] = c1080530eDz.LJI + c1080530eDz.LIZLLL;
            valueAnimator.setIntValues(iArr);
            return valueAnimator;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        super.onHideAnimationEnd(constraintProperty);
        ConstraintProperty constraintPropertyById = this.LIZLLL.getConstraintPropertyById(R.id.ebm);
        if (constraintPropertyById != null) {
            constraintPropertyById.margin(4, 0);
            constraintPropertyById.apply();
        }
        constraintProperty.alpha(0.0f);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationEnd(ConstraintProperty constraintProperty) {
        super.onShowAnimationEnd(constraintProperty);
        ConstraintProperty constraintPropertyById = this.LIZLLL.getConstraintPropertyById(R.id.ebm);
        if (constraintPropertyById != null) {
            constraintPropertyById.margin(4, this.LIZJ);
            constraintPropertyById.apply();
        }
        constraintProperty.alpha(1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1080680eEE(int i, C1080530eDz c1080530eDz) {
        super(i, c1080530eDz);
        this.LIZLLL = c1080530eDz;
        this.LIZJ = c1080530eDz.LJIILIIL;
    }
}
