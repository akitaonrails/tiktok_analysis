package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: X.127A, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127A extends C11GO {
    @Override // X.C127M
    public final void LJIIIIZZ() {
        ((C21411818qq) this.LIZIZ.LIZ).setDisableListener$tux_theme_release(this.LIZ);
    }

    @Override // X.C127M
    public final void LJIIJ() {
        C426750GoL.LJIIIZ(this.LIZIZ.LIZIZ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(13.5d)))), null, null, false, 29);
    }

    @Override // X.C127M
    public final C127C LIZ() {
        return C127B.LIZIZ;
    }

    public C127A(Context context) {
        super(context, null);
    }

    @Override // X.C127M
    public final void LJII(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(true);
        accessibilityNodeInfoCompat.setChecked(LJIILIIL());
        accessibilityNodeInfoCompat.setClassName(Switch.class.getName());
        this.LIZIZ.LIZIZ.setImportantForAccessibility(4);
    }

    public C127A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C11GO
    public final CompoundButton LJIIL(Context context, AttributeSet attributeSet) {
        C21411818qq c21411818qq = new C21411818qq(context, null, 6);
        c21411818qq.setEnableTouch$tux_theme_release(false);
        return c21411818qq;
    }
}
