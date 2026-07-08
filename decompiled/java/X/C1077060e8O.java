package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0e8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1077060e8O extends C127M {
    public final C197039127h LIZIZ;
    public View.OnClickListener LIZJ;

    @Override // X.C127M
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C127M
    public final void LJIIJ() {
        C426750GoL.LJIIIZ(this.LIZIZ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, false, 29);
    }

    @Override // X.C127M
    public final C127C LIZ() {
        return C1077070e8P.LIZIZ;
    }

    @Override // X.C127M
    public final View LJFF() {
        return this.LIZIZ;
    }

    @Override // X.C127M
    public final void LJII(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.LIZJ != null) {
            accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        }
    }

    @Override // X.C127M
    public final void LJIIIZ(boolean z) {
        this.LIZIZ.setEnabled(z);
    }

    @Override // X.C127M
    public final void LJIIJJI(boolean z) {
        this.LIZIZ.setLoading(z);
    }

    public final void LJIIL(View.OnClickListener onClickListener) {
        this.LIZJ = onClickListener;
        C786410Ut5.U8(this.LIZIZ, onClickListener);
    }

    public final void LJIILIIL(CharSequence charSequence) {
        this.LIZIZ.setText(charSequence);
    }

    public C1077060e8O(Context context, AttributeSet attributeSet) {
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        this.LIZIZ = c197039127h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, R.attr.z2, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell_tux_buttonVariant, Integer.MIN_VALUE);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell_tux_buttonSize, Integer.MIN_VALUE);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell_tux_buttonText);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellButtonHeight, -1);
        typedArrayObtainStyledAttributes.recycle();
        c197039127h.setButtonVariant(i);
        c197039127h.setButtonSize(i2);
        LJIILIIL(strXd);
        if (dimensionPixelSize > 0) {
            c197039127h.setHeight(dimensionPixelSize);
        }
    }
}
