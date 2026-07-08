package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21462318yz extends ViewGroup {
    public static final /* synthetic */ int LLILZIL = 0;
    public final View LL;
    public int LLILLJJLI;
    public Matrix LLILLL;
    public final ViewTreeObserverOnPreDrawListenerC21523719Lf LLILZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C786410Ut5.D3(this.LL.getViewTreeObserver(), this.LLILZ);
        C21461818yu.LIZ.LIZ(0, this.LL);
        this.LL.setTag(R.id.iv_, null);
        if (this.LL.getParent() != null) {
            ((View) this.LL.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL.setTag(R.id.iv_, this);
        C786410Ut5.y3(this.LL.getViewTreeObserver(), this.LLILZ);
        C21461818yu.LIZ.LIZ(4, this.LL);
        if (this.LL.getParent() != null) {
            ((View) this.LL.getParent()).invalidate();
        }
    }

    public C21462318yz(View view) {
        super(view.getContext());
        this.LLILZ = new ViewTreeObserverOnPreDrawListenerC21523719Lf(this, 0);
        this.LL = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1319940kS8.LIZ(canvas, true);
        canvas.setMatrix(this.LLILLL);
        View view = this.LL;
        C21462018yw c21462018yw = C21461818yu.LIZ;
        c21462018yw.LIZ(0, view);
        this.LL.invalidate();
        c21462018yw.LIZ(4, this.LL);
        drawChild(canvas, this.LL, getDrawingTime());
        C1319940kS8.LIZ(canvas, false);
    }

    public void setMatrix(Matrix matrix) {
        this.LLILLL = matrix;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (this.LL.getTag(R.id.iv_) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            C21461818yu.LIZ.LIZ(i2, this.LL);
        }
    }

    public static void LIZ(View view, View view2) {
        C21461818yu.LIZ.LJFF(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }
}
