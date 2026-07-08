package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0dr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1066300dr2 extends FrameLayout {
    public InterfaceC1066340dr6 LL;

    public C1066300dr2(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        InterfaceC1066340dr6 interfaceC1066340dr6;
        boolean z2 = true;
        if (getVisibility() != i) {
            z = true;
        } else {
            z = false;
        }
        super.setVisibility(i);
        if (z && (interfaceC1066340dr6 = this.LL) != null) {
            if (i != 0) {
                z2 = false;
            }
            interfaceC1066340dr6.LJ(this, z2);
        }
    }

    public final void setVisibilityChangeListener(InterfaceC1066340dr6 interfaceC1066340dr6) {
        this.LL = interfaceC1066340dr6;
    }

    public C1066300dr2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
