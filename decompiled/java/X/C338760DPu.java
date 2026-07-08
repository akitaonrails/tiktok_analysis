package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: renamed from: X.0DPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338760DPu extends FrameLayout {
    public InterfaceC338730DPr LL;

    public final InterfaceC338730DPr getConstraints() {
        return this.LL;
    }

    public final void setConstraints(InterfaceC338730DPr interfaceC338730DPr) {
        this.LL = interfaceC338730DPr;
        requestLayout();
    }

    public C338760DPu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new InterfaceC338730DPr() { // from class: X.0DPt
            @Override // X.InterfaceC338730DPr
            public final void LIZIZ(int i, int i2, C338760DPu c338760DPu, AwS618S0100000_4 awS618S0100000_4) {
                awS618S0100000_4.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }

            @Override // X.InterfaceC338730DPr
            public final void LIZ(boolean z, int i, int i2, int i3, int i4, C338760DPu c338760DPu, C346580DiK c346580DiK) {
                c346580DiK.invoke(Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        };
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LL.LIZIZ(i, i2, this, new AwS618S0100000_4(this, 6));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LL.LIZ(z, i, i2, i3, i4, this, new C346580DiK(this, 1));
    }
}
