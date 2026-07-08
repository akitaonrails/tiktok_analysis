package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* JADX INFO: renamed from: X.0hgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213350hgD extends ScrollView {
    public InterfaceC1213360hgE LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnScrollListener(InterfaceC1213360hgE interfaceC1213360hgE) {
        this.LL = interfaceC1213360hgE;
    }

    public C1213350hgD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1213360hgE interfaceC1213360hgE = this.LL;
        if (interfaceC1213360hgE != null) {
            interfaceC1213360hgE.LIZ(i2);
        }
    }
}
