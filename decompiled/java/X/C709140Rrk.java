package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709140Rrk extends RelativeLayout implements InterfaceC20343214is {
    public final Map<String, View.OnClickListener> LL;

    public C709140Rrk(Context context) {
        this(context, null, 6);
    }

    public C709140Rrk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "FC_COMP/follow_container";
    }

    public void setCustomRiskId(String str) {
    }

    public final void LIZ() {
        ((LinkedHashMap) this.LL).clear();
        setParentClickListener(null);
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setParentClickListener(android.view.View.OnClickListener r3) {
        /*
            r2 = this;
            boolean r0 = X.C1848410yCV.LIZ
            if (r0 == 0) goto L48
            if (r3 == 0) goto L48
            avg.f r1 = new avg.f
            r1.<init>(r3)
        Lb:
            mf.a r0 = new mf.a
            r0.<init>(r1)
            r1 = r0
        L11:
            X.1Bky r0 = X.C2213981Bky.LIZIZ
            boolean r0 = r0.isOffline()
            if (r0 == 0) goto L1e
            X.1Bhg r0 = X.C2211941Bhg.LIZ
            r0.injectViewListener(r2)
        L1e:
            r2.setOnClickListener(r1)
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L32
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            X.C786410Ut5.I7(r3, r0)
        L32:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L47
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L47
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L47
            android.view.View r1 = (android.view.View) r1
            X.C786410Ut5.I7(r3, r1)
        L47:
            return
        L48:
            r1 = r3
            if (r3 == 0) goto L11
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C709140Rrk.setParentClickListener(android.view.View$OnClickListener):void");
    }

    public final void LIZJ(String str) {
        View.OnClickListener onClickListener = (View.OnClickListener) ((LinkedHashMap) this.LL).get(str);
        if (onClickListener != null) {
            setParentClickListener(onClickListener);
        }
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

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public final void LIZIZ(String str, View.OnClickListener onClickListener) {
        this.LL.put(str, onClickListener);
        setParentClickListener(onClickListener);
    }

    public C709140Rrk(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = new LinkedHashMap();
    }
}
