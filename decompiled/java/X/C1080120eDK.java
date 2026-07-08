package X;

import Y.AUListenerS224S0200000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.AwS60S0010000_17;

/* JADX INFO: renamed from: X.0eDK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080120eDK extends AnimationInfo {
    public final C1080550eE1 LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShow() {
        super.onShow();
        View viewFindViewById = this.LIZ.getContainer().findViewById(R.id.wkn);
        int iIntValue = ((Number) this.LIZIZ.getValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.rightMargin = iIntValue;
        C786410Ut5.W5(viewFindViewById, marginLayoutParams);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
        C1090450eTz c1090450eTz = (C1090450eTz) this.LIZ.getContainer().findViewById(R.id.wkn);
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZLLL.getValue();
        valueAnimator.addUpdateListener(new AUListenerS224S0200000_17(this, c1090450eTz, 17));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
        C1090450eTz c1090450eTz = (C1090450eTz) this.LIZ.getContainer().findViewById(R.id.wkn);
        ValueAnimator valueAnimator = (ValueAnimator) this.LIZJ.getValue();
        valueAnimator.addUpdateListener(new AUListenerS224S0200000_17(this, c1090450eTz, 18));
        return valueAnimator;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onHideAnimationEnd(ConstraintProperty constraintProperty) {
        constraintProperty.visibility(8);
        notifyHide();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
    public final void onShowAnimationStart(ConstraintProperty constraintProperty) {
        constraintProperty.visibility(0);
        notifyShow();
    }

    public C1080120eDK(int i, C1080550eE1 c1080550eE1, boolean z) {
        super(i, c1080550eE1);
        this.LIZ = c1080550eE1;
        this.LIZIZ = C292401Bi.LIZ(new AwS60S0010000_17(z, 1));
        this.LIZJ = C292401Bi.LIZ(new AwS135S0110000_17(z, this, 8));
        this.LIZLLL = C292401Bi.LIZ(new AwS135S0110000_17(z, this, 7));
    }
}
