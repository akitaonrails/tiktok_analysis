package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0GpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C427330GpH extends C16F5 {
    public boolean LLJJ;
    public int LLJJI;
    public int LLJJIII;

    public final void LJJJJI() {
        this.LLJJ = false;
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setSelected(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public final void LJJJJIZL() {
        this.LLJJ = true;
        setSelected(false);
        setFocusable(false);
        setFocusableInTouchMode(false);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public float getRightFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setSelected(false);
    }

    @Override // android.view.View
    public int getLayoutDirection() {
        return this.LLJJI;
    }

    @Override // android.view.View
    public int getTextDirection() {
        return this.LLJJIII;
    }

    public C427330GpH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJ = true;
        this.LLJJI = 1;
        this.LLJJIII = 4;
        this.LLJJI = C497740JfY.LJJ() ? 1 : 0;
        this.LLJJIII = C497740JfY.LJJ() ? 4 : 3;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LLJJ && ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight() > 0) {
            setSelected(false);
            setEllipsize(TextUtils.TruncateAt.MARQUEE);
            setSelected(true);
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
    }
}
