package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1278, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1278 extends C11GO {
    public CharSequence LIZLLL;

    @Override // X.C127M
    public final void LJIIIIZZ() {
        ((C1841350y17) this.LIZIZ.LIZ).setDisableListener$tux_theme_release(this.LIZ);
    }

    @Override // X.C127M
    public final void LJIIJ() {
        C426750GoL.LJIIIZ(this.LIZIZ.LIZIZ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, null, false, 29);
    }

    @Override // X.C127M
    public final C127C LIZ() {
        return AnonymousClass1279.LIZIZ;
    }

    public AnonymousClass1278(Context context) {
        super(context, null);
    }

    @Override // X.C127M
    public final void LJII(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(true);
        accessibilityNodeInfoCompat.setChecked(LJIILIIL());
        accessibilityNodeInfoCompat.setRoleDescription(this.LIZLLL);
        this.LIZIZ.LIZIZ.setImportantForAccessibility(4);
    }

    public AnonymousClass1278(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C11GO
    public final CompoundButton LJIIL(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, R.attr.z2, 0);
        this.LIZLLL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell__tux_textCellRadioButton);
        typedArrayObtainStyledAttributes.recycle();
        return new C1841350y17(context, null, 6);
    }
}
