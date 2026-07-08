package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0GpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427300GpE extends C427290GpD {
    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(z);
        }
    }

    public C427300GpE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(z, i, rect);
        }
    }
}
