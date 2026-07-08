package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10iG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19320210iG extends C127M {
    public final TuxTextView LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    @Override // X.C127M
    public final CharSequence LJ() {
        return this.LIZIZ.getText();
    }

    @Override // X.C127M
    public final void LJIIJ() {
        C426750GoL.LJIIIZ(this.LIZIZ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))), null, null, false, 29);
    }

    @Override // X.C127M
    public final C127C LIZ() {
        return C19320310iH.LIZIZ;
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
        int i;
        TuxTextView tuxTextView = this.LIZIZ;
        if (z) {
            i = this.LIZJ;
        } else {
            i = this.LIZLLL;
        }
        tuxTextView.setTextColor(i);
        this.LIZIZ.setEnabled(z);
    }

    public C19320210iG(Context context, AttributeSet attributeSet) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LIZIZ = tuxTextView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, R.attr.z2, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell__tux_textCellLabelFont, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellLabelColor, 0);
        this.LIZJ = color;
        this.LIZLLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellTextDisableColor, 0);
        tuxTextView.setText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell_tux_label));
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColor(color);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine();
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
    }
}
