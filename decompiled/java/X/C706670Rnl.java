package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.input.TuxTextView;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706670Rnl extends TuxTextView implements InterfaceC20343214is {
    public int LLJJJJ;

    static {
        new Object() { // from class: X.0Rnn
            {
                if (MethodIDManager.LJI(202358)) {
                    MethodIDManager.LJ();
                }
                if (MethodIDManager.LJI(202358)) {
                    MethodIDManager.LJ();
                }
            }
        };
    }

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

    public final int getMode() {
        return this.LLJJJJ;
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

    public final void setMode(int i) {
        this.LLJJJJ = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public C706670Rnl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        if (MethodIDManager.LJI(202358)) {
            MethodIDManager.LJ();
        }
    }

    public C706670Rnl(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        boolean zLJI = MethodIDManager.LJI(202358);
        this.LLJJJJ = 1;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        if (MethodIDManager.LJI(202358)) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams;
        TextPaint paint;
        TextPaint paint2;
        super.onTextChanged(charSequence, i, i2, i3);
        CharSequence text = getText();
        if (text != null && (layoutParams = getLayoutParams()) != null && layoutParams.width != -2) {
            int i4 = this.LLJJJJ;
            if (i4 == 0) {
                if (i2 != i3 && (paint2 = getPaint()) != null) {
                    int iLIZIZ = C814420VxA.LIZIZ(paint2.measureText(text.toString()));
                    getWidth();
                    if (getWidth() < iLIZIZ) {
                        requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i4 != 1 || (paint = getPaint()) == null) {
                return;
            }
            if (getWidth() == C814420VxA.LIZIZ(paint.measureText(text.toString()))) {
                return;
            }
            requestLayout();
        }
    }
}
