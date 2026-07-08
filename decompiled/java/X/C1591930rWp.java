package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0rWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591930rWp extends AbstractC1591940rWq implements InterfaceC20343114ir, InterfaceC20343214is {
    public InterfaceC1591920rWo LL;

    public C1591930rWp(Context context) {
        this(context, null, 6);
    }

    public C1591930rWp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC20343114ir
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "TAB_BOTTOM/container";
    }

    public void setCustomRiskId(String str) {
    }

    public final void setEnableClick(boolean z) {
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    public final InterfaceC1591920rWo getOnTabVisibilityChangeListener() {
        return this.LL;
    }

    @Override // X.InterfaceC20343114ir
    public final List LIZ(boolean z) {
        ColorDrawable colorDrawable;
        Drawable background = getBackground();
        Integer numValueOf = null;
        if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
            numValueOf = Integer.valueOf(colorDrawable.getColor());
        }
        return Collections.singletonList(String.valueOf(numValueOf));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    public final void setOnTabVisibilityChangeListener(InterfaceC1591920rWo interfaceC1591920rWo) {
        this.LL = interfaceC1591920rWo;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        InterfaceC1591920rWo interfaceC1591920rWo;
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        if (getVisibility() != i && (interfaceC1591920rWo = this.LL) != null) {
            interfaceC1591920rWo.LIZ(i);
        }
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public C1591930rWp(Context context, AttributeSet attributeSet, int i) {
        new LinearLayout(context, (i & 2) != 0 ? null : attributeSet, 0) { // from class: X.0rWq
        };
    }
}
