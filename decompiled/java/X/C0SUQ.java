package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS412S0200000_11;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0SUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUQ extends FrameLayout implements InterfaceC1594350raj, InterfaceC20688015xO, InterfaceC20343214is {
    public InterfaceC709010RrX LL;
    public final Set<C0SUS> LLILLJJLI;

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "TAB_TOP/tab_root";
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

    public InterfaceC709010RrX getGestureInterceptor() {
        return this.LL;
    }

    public C0SUQ(Context context) {
        super(context);
        this.LLILLJJLI = new HashSet();
    }

    @Override // X.InterfaceC1594350raj
    public final void LIZ(C0SUS c0sus) {
        this.LLILLJJLI.remove(c0sus);
    }

    @Override // X.InterfaceC1594350raj
    public final void LIZIZ(C0SUS c0sus) {
        this.LLILLJJLI.add(c0sus);
    }

    public final void LJ(float f) {
        super.setAlpha(f);
        Iterator it2 = ((HashSet) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C0SUS) it2.next()).LIZIZ(f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAlpha: ");
        sbLIZ.append(f);
        C2344809Gs.LIZLLL(3, "TabVisibility", C2188811AlT.LIZIZ(sbLIZ));
        if (C308240C6k.LIZIZ()) {
            if (Math.abs(f - 0.0f) < 1.0E-6d || Math.abs(f - 1.0f) < 1.0E-6d) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setAlpha:");
                sbLIZ2.append(f);
                LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public final void LJFF(String str) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        StringBuilder sb = new StringBuilder(str);
        sb.append("\n");
        int length = stackTrace.length;
        if (length > 8) {
            length = 8;
        }
        for (int i = 0; i < length; i++) {
            sb.append(stackTrace[i].getClassName());
            sb.append(e3.d);
            sb.append(stackTrace[i].getMethodName());
            sb.append(" ");
            sb.append(stackTrace[i].getLineNumber());
            sb.append("\n");
        }
        C2344809Gs.LIZLLL(3, "TabVisibility", sb.toString());
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC709010RrX gestureInterceptor = getGestureInterceptor();
        if (gestureInterceptor != null) {
            return gestureInterceptor.LIZ(motionEvent, new AwS412S0200000_11(this, motionEvent, 24));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        Iterator<C0SUS> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(i / 255.0f);
        }
        return super.onSetAlpha(i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC709010RrX gestureInterceptor = getGestureInterceptor();
        if (gestureInterceptor != null) {
            return gestureInterceptor.LIZIZ(motionEvent, new AwS412S0200000_11(this, motionEvent, 25));
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            LJ(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        LJ(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    @Override // X.InterfaceC20688015xO
    public void setGestureInterceptor(InterfaceC709010RrX interfaceC709010RrX) {
        this.LL = interfaceC709010RrX;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(EnumC2180541AVo.V_VISIBLITY, this, Integer.valueOf(i));
        super.setVisibility(i);
        Iterator it2 = ((HashSet) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((C0SUS) it2.next()).LIZ(i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVisibility: ");
        sbLIZ.append(i);
        C2344809Gs.LIZLLL(3, "TabVisibility", C2188811AlT.LIZIZ(sbLIZ));
        C01GW c01gw = C0BIQ.LIZ;
        boolean z = true;
        if (((Number) C0BIQ.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (z && i == 8) {
            C1AF0.LIZJ("TabFrameLayout setVisibility Gone");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TabFrameLayout setVisibility: ");
            sbLIZ2.append(i);
            LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        } else if (C308240C6k.LIZIZ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TabFrameLayout setVisibility: ");
            sbLIZ3.append(i);
            LJFF(C2188811AlT.LIZIZ(sbLIZ3));
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map2 = C2180551AVp.LIZ;
        C2180551AVp.LIZ(EnumC2180541AVo.V_VISIBLITY, this, Integer.valueOf(i));
    }

    public C0SUQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new HashSet();
    }
}
