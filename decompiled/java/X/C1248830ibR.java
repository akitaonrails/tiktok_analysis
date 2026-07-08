package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: X.0ibR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248830ibR extends HorizontalScrollView {
    public InterfaceC1248820ibQ LL;

    public C1248830ibR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final InterfaceC1248820ibQ getOnScrollListener() {
        return this.LL;
    }

    public final void setOnScrollListener(InterfaceC1248820ibQ interfaceC1248820ibQ) {
        this.LL = interfaceC1248820ibQ;
    }

    public C1248830ibR(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC1248820ibQ interfaceC1248820ibQ;
        super.onScrollChanged(i, i2, i3, i4);
        if (Math.abs(i - i3) > C339190DRl.LIZ(1) && (interfaceC1248820ibQ = this.LL) != null) {
            interfaceC1248820ibQ.LIZ();
        }
    }
}
