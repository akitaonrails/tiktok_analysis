package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1276, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1276 extends C11GO {
    @Override // X.C127M
    public final void LJIIJ() {
        C426750GoL.LJIIIZ(this.LIZIZ.LIZIZ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, null, false, 29);
    }

    @Override // X.C127M
    public final C127C LIZ() {
        return AnonymousClass1277.LIZIZ;
    }

    public AnonymousClass1276(Context context) {
        super(context, null);
    }

    @Override // X.C127M
    public final void LJII(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(true);
        accessibilityNodeInfoCompat.setChecked(LJIILIIL());
        accessibilityNodeInfoCompat.setClassName(CheckBox.class.getName());
        this.LIZIZ.LIZIZ.setImportantForAccessibility(4);
    }

    public final void LJIIZILJ(int i) {
        CompoundButton compoundButton = (CompoundButton) this.LIZIZ.LIZ;
        if (compoundButton instanceof C0HZQ) {
            ((C0HZQ) compoundButton).setShape(i);
        }
    }

    public AnonymousClass1276(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C11GO
    public final CompoundButton LJIIL(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, R.attr.z2, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell_tux_checkBoxShape, 0);
        typedArrayObtainStyledAttributes.recycle();
        C0HZQ c0hzq = new C0HZQ(context, null, 6);
        c0hzq.setShape(i);
        return c0hzq;
    }
}
