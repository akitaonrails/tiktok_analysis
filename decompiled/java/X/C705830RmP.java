package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import java.util.Map;

/* JADX INFO: renamed from: X.0RmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705830RmP extends C708990RrV implements InterfaceC20343214is, InterfaceC695290RPb {
    public final /* synthetic */ C705870RmT LLILZIL;

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    public void setCustomRiskId(String str) {
    }

    @Override // X.InterfaceC695290RPb
    public void setOnPerfListener(InterfaceC705840RmQ interfaceC705840RmQ) {
        this.LLILZIL.setOnPerfListener(interfaceC705840RmQ);
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        this.LLILZIL.LIZIZ();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLILZIL.LIZJ();
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return getCustomRiskId();
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

    @Override // X.C708990RrV, android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public C705830RmP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C705870RmT c705870RmT = new C705870RmT();
        this.LLILZIL = c705870RmT;
        if (C715260S3w.LIZIZ()) {
            c705870RmT.LL = this;
        }
    }
}
