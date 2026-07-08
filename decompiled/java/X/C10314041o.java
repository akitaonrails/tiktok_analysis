package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: X.041o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10314041o extends HorizontalScrollView {
    public InterfaceC10318041s LL;

    public final void setScrollViewListener(InterfaceC10318041s interfaceC10318041s) {
        this.LL = interfaceC10318041s;
    }

    public C10314041o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC10318041s interfaceC10318041s = this.LL;
        if (interfaceC10318041s != null) {
            interfaceC10318041s.LIZ(i, i3);
        }
    }
}
