package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0H5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435470H5t extends FrameLayout {
    public InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> LL;

    public final void setMaxWidth(int i) {
    }

    public final void setOnSizeChangedListener(InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr) {
        this.LL = interfaceC1631630sYr;
    }

    public C435470H5t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr = this.LL;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        String.valueOf(i);
    }
}
