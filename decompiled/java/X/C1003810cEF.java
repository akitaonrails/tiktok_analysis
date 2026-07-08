package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0cEF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003810cEF extends FrameLayout implements InterfaceC1003820cEG {
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public C1003810cEF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setEnabled(false);
    }
}
