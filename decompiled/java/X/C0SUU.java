package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.Map;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: renamed from: X.0SUU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUU extends LinearLayout implements InterfaceC20688015xO, InterfaceC20343214is {
    public InterfaceC709010RrX LL;

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    public void setCustomRiskId(String str) {
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

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return getCustomRiskId();
    }

    public InterfaceC709010RrX getGestureInterceptor() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC709010RrX gestureInterceptor = getGestureInterceptor();
        if (gestureInterceptor != null) {
            return gestureInterceptor.LIZ(motionEvent, new AwS412S0200000_11(this, motionEvent, 36));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC709010RrX gestureInterceptor = getGestureInterceptor();
        if (gestureInterceptor != null) {
            return gestureInterceptor.LIZIZ(motionEvent, new AwS412S0200000_11(this, motionEvent, 37));
        }
        return super.onTouchEvent(motionEvent);
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

    @Override // X.InterfaceC20688015xO
    public void setGestureInterceptor(InterfaceC709010RrX interfaceC709010RrX) {
        this.LL = interfaceC709010RrX;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public C0SUU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
