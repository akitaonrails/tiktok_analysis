package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Goz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427150Goz extends TuxTextView {
    public boolean LLJJJJ;

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJJJJ) {
            return;
        }
        setSelected(true);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setSelected(false);
    }

    public final void setStoppedMarquee(boolean z) {
        this.LLJJJJ = z;
    }

    public C427150Goz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = true;
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LLJJJJ && ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight() > 0) {
            setSelected(false);
            setSelected(true);
        }
    }
}
