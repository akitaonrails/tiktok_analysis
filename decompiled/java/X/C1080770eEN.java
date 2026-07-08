package X;

import Y.AUListenerS14S0100001_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080770eEN extends AnimationInfo {
    public final C1080550eE1 LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZJ.getValue();
        valueAnimator.removeAllUpdateListeners();
        C1080550eE1 c1080550eE1 = this.LIZ;
        int i = c1080550eE1.LIZLLL + c1080550eE1.LJFF;
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ay4);
        int i2 = this.LIZ.LJIIL - iLJIIIZ;
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, 0, 4, i2);
        constraintProperty.apply();
        float fAlpha = constraintProperty.alpha();
        valueAnimator.setIntValues(iLJIIIZ + i2 + i, i2);
        valueAnimator.addUpdateListener(new AUListenerS14S0100001_17(constraintProperty, fAlpha, 0));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZIZ.getValue();
        valueAnimator.removeAllUpdateListeners();
        C1080550eE1 c1080550eE1 = this.LIZ;
        int i = c1080550eE1.LIZLLL + c1080550eE1.LJFF;
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ay4);
        int i2 = this.LIZ.LJIIL - iLJIIIZ;
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, 0, 4, i2);
        constraintProperty.apply();
        constraintProperty.alpha(0.0f);
        valueAnimator.setIntValues(i2, iLJIIIZ + i2 + i);
        valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 104));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        super.onHideAnimationEnd(constraintProperty);
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, R.id.kw5, 3, 0);
        constraintProperty.apply();
        constraintProperty.alpha(1.0f);
        constraintProperty.visibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationStart(ConstraintProperty constraintProperty) {
        super.onHideAnimationStart(constraintProperty);
        constraintProperty.visibility(0);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationEnd(ConstraintProperty constraintProperty) {
        super.onShowAnimationEnd(constraintProperty);
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        constraintProperty.connect(4, R.id.kw5, 3, 0);
        constraintProperty.apply();
        constraintProperty.alpha(1.0f);
        constraintProperty.visibility(0);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationStart(ConstraintProperty constraintProperty) {
        super.onShowAnimationStart(constraintProperty);
        constraintProperty.visibility(0);
    }

    public C1080770eEN(int i, C1080550eE1 c1080550eE1) {
        super(i, c1080550eE1);
        this.LIZ = c1080550eE1;
        this.LIZIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 503));
        this.LIZJ = C292401Bi.LIZ(new AwS561S0100000_17(this, 502));
    }
}
