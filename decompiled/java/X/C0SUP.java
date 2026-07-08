package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0SUP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUP extends LinearLayout implements InterfaceC1594350raj, InterfaceC20343214is {
    public final Set<C0SUS> LL;

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "TAB_TOP/title_bar_container";
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

    public C0SUP(Context context) {
        super(context);
        this.LL = new HashSet();
    }

    @Override // X.InterfaceC1594350raj
    public final void LIZ(C0SUS c0sus) {
        this.LL.remove(c0sus);
    }

    @Override // X.InterfaceC1594350raj
    public final void LIZIZ(C0SUS c0sus) {
        this.LL.add(c0sus);
    }

    public final void LIZJ(String str) {
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

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        Iterator<C0SUS> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(i / 255.0f);
        }
        return super.onSetAlpha(i);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            Iterator it2 = ((HashSet) this.LL).iterator();
            while (it2.hasNext()) {
                ((C0SUS) it2.next()).LIZIZ(f);
            }
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        Iterator it3 = ((HashSet) this.LL).iterator();
        while (it3.hasNext()) {
            ((C0SUS) it3.next()).LIZIZ(f);
        }
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(EnumC2180541AVo.V_VISIBLITY, this, Integer.valueOf(i));
        super.setVisibility(i);
        Iterator it2 = ((HashSet) this.LL).iterator();
        while (it2.hasNext()) {
            ((C0SUS) it2.next()).LIZ(i);
        }
        C01GW c01gw = C0BIQ.LIZ;
        boolean z = true;
        if (((Number) C0BIQ.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (z && i == 8) {
            C1AF0.LIZJ("TabLinearLayout setVisibility Gone");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TabLinearLayout setVisibility: ");
            sbLIZ.append(i);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        } else if (C308240C6k.LIZIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TabLinearLayout setVisibility: ");
            sbLIZ2.append(i);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map2 = C2180551AVp.LIZ;
        C2180551AVp.LIZ(EnumC2180541AVo.V_VISIBLITY, this, Integer.valueOf(i));
    }

    public C0SUP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new HashSet();
    }
}
