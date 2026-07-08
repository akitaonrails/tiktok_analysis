package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import avg.f;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.11G4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11G4 extends C127M {
    public final C11G3 LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public CharSequence LJFF;

    @Override // X.C127M
    public final int LIZIZ() {
        if (this.LIZIZ.getWithIcon$tux_theme_release()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        return 0;
    }

    @Override // X.C127M
    public final CharSequence LJ() {
        CharSequence charSequence = this.LJFF;
        return (charSequence == null || charSequence.length() == 0) ? LJIIL() : this.LJFF;
    }

    @Override // X.C127M
    public final void LJIIJ() {
        C11G3 c11g3 = this.LIZIZ;
        C426750GoL.LJIIIZ(c11g3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c11g3.getCustomView$tux_theme_release() == null ? 17 : 15)))), null, null, false, 29);
    }

    public final CharSequence LJIIL() {
        return this.LIZIZ.getLabel();
    }

    @Override // X.C127M
    public final C127C LIZ() {
        return C11G5.LIZIZ;
    }

    @Override // X.C127M
    public final View LJFF() {
        return this.LIZIZ;
    }

    @Override // X.C127M
    public final void LJII(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.LIZIZ.hasOnClickListeners()) {
            accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        }
    }

    @Override // X.C127M
    public final void LJIIIZ(boolean z) {
        if (z) {
            this.LIZIZ.setTextColor(this.LIZJ);
            this.LIZIZ.setIconColor(this.LJ);
        } else {
            this.LIZIZ.setTextColor(this.LIZLLL);
            this.LIZIZ.setIconColor(this.LIZLLL);
        }
        this.LIZIZ.setEnabled(z);
    }

    public final void LJIILIIL(View view) {
        this.LIZIZ.setCustomView(view);
    }

    public final void LJIILJJIL(CharSequence charSequence) {
        this.LIZIZ.setLabel(charSequence);
    }

    public final void LJIILL(View.OnClickListener onClickListener) {
        C11G3 c11g3 = this.LIZIZ;
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c11g3);
        }
        c11g3.setOnClickListener(onClickListener);
    }

    public final void LJIILLIIL(boolean z) {
        this.LIZIZ.setShowArrow(z);
    }

    public C11G4(Context context, AttributeSet attributeSet) {
        C11G3 c11g3 = new C11G3(context);
        this.LIZIZ = c11g3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, R.attr.z2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellLabelColor, 0);
        this.LIZJ = color;
        this.LIZLLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellTextDisableColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellArrowColor, 0);
        this.LJ = color2;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTextCell__tux_textCellDisclosureIcon, 0);
        LJIILJJIL(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell_tux_label));
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell__tux_textCellLabelFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        c11g3.setFont(i);
        c11g3.setTextColor(color);
        c11g3.setIconRes(resourceId);
        c11g3.setIconColor(color2);
    }
}
