package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import java.util.Map;

/* JADX INFO: renamed from: X.0RrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709020RrY extends C708990RrV implements InterfaceC20343214is {
    public final int LLILZIL;
    public final int LLILZLL;
    public InterfaceC709040Rra LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public long LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final int[] LLJJIII;
    public final int[] LLJJIJI;
    public InterfaceC709040Rra LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public View LLJJJJ;

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

    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181  */
    @Override // X.C708990RrV, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C709020RrY.dispatchTouchEvent(android.view.MotionEvent):boolean");
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

    public C709020RrY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = ViewConfiguration.get(context).getScaledTouchSlop();
        int i = (int) (getResources().getDisplayMetrics().density * 80.0f);
        this.LLILZLL = i;
        this.LLIZLLLIL = i;
        this.LLJJIII = new int[2];
        this.LLJJIJI = new int[2];
    }

    public final boolean LIZJ(InterfaceC709040Rra interfaceC709040Rra, MotionEvent motionEvent) {
        C0SLX c0slxTargetView;
        if (interfaceC709040Rra != null && (c0slxTargetView = interfaceC709040Rra.targetView()) != null) {
            return LIZLLL(motionEvent, c0slxTargetView);
        }
        this.LLJILLL = false;
        InterfaceC709040Rra interfaceC709040Rra2 = this.LLJJIJIIJIL;
        this.LLJJIJIIJIL = null;
        if (interfaceC709040Rra2 != null) {
            interfaceC709040Rra2.LIZ();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean LIZLLL(MotionEvent motionEvent, View view) {
        if (!this.LLJJIJIL || this.LLJJJJ != view) {
            getLocationOnScreen(this.LLJJIII);
            view.getLocationOnScreen(this.LLJJIJI);
            int i = this.LLJJIII[0];
            int[] iArr = this.LLJJIJI;
            this.LLJJJ = i - iArr[0];
            this.LLJJJIL = r4[1] - iArr[1];
            this.LLJJJJ = view;
            this.LLJJIJIL = true;
        }
        float f = this.LLJJJ;
        float f2 = this.LLJJJIL;
        motionEvent.offsetLocation(f, f2);
        boolean zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation(-f, -f2);
        return zDispatchTouchEvent;
    }
}
