package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.1A76, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A76 extends ViewGroup implements InterfaceC2178711AOn, InterfaceC1474480oTO {
    public C1A77 LL;
    public C1A7B LLILLJJLI;
    public ImageView LLILLL;
    public View LLILZ;

    public InterfaceC1474480oTO getGestureTargetView() {
        return this;
    }

    public View getGestureView() {
        return this;
    }

    @Override // X.InterfaceC2178711AOn
    public ViewGroup getVideoContainer() {
        return this;
    }

    @Override // X.InterfaceC2178711AOn
    public final void LIZJ() {
        if (this.LLILLL.getVisibility() != 8) {
            C786410Ut5.LJZI(8, this.LLILLL);
            this.LLILLL.setImageBitmap(null);
        }
    }

    public float getCenterCropScaleFactor() {
        return this.LL.LIZ();
    }

    public float getCenterInsideScaleFactor() {
        this.LL.getClass();
        return 1.0f;
    }

    @Override // X.InterfaceC2178711AOn
    public int getTextureLayout() {
        return this.LL.LJIIIZ;
    }

    @Override // X.InterfaceC2178711AOn
    public int getVideoHeight() {
        return this.LL.LIZJ;
    }

    @Override // X.InterfaceC2178711AOn
    public int getVideoViewMarginTop() {
        if (this.LLILLJJLI == null) {
            return -1;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return -1;
    }

    @Override // X.InterfaceC2178711AOn
    public int getVideoWidth() {
        return this.LL.LIZIZ;
    }

    public RectF getViewRect() {
        C1A77 c1a77 = this.LL;
        c1a77.getClass();
        return new RectF(c1a77.LIZLLL(), c1a77.LJ(), c1a77.LIZLLL() + (c1a77.LIZ.getWidth() * c1a77.LIZ.getScaleX()), c1a77.LJ() + (c1a77.LIZ.getHeight() * c1a77.LIZ.getScaleY()));
    }

    @Override // X.InterfaceC2178711AOn
    public View getBlackCoverView() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC2178711AOn
    public InterfaceC2178741AOq getVideoView() {
        return this.LLILLJJLI;
    }

    public C1A76(Context context) {
        super(context);
        setClipChildren(false);
        setBackgroundColor(-16777216);
        this.LL = new C1A77(this, this);
        C1A7B c1a7b = new C1A7B(context);
        this.LLILLJJLI = c1a7b;
        c1a7b.getHolder();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.LLILLJJLI, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        View view = new View(context);
        this.LLILZ = view;
        view.setBackgroundColor(-16777216);
        layoutParams2.gravity = 17;
        addView(this.LLILZ, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(context);
        this.LLILLL = imageView;
        layoutParams3.gravity = 17;
        addView(imageView, layoutParams3);
    }

    @Override // X.InterfaceC2178711AOn
    public final void LIZ(int i) {
        this.LL.LJI(i);
    }

    @Override // X.InterfaceC2178711AOn
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap != null) {
            this.LLILLL.setImageBitmap(bitmap);
            C786410Ut5.LJZI(0, this.LLILLL);
        }
    }

    @Override // X.InterfaceC2178711AOn
    public void setCropStrategy(C1474490oTP c1474490oTP) {
        this.LL.getClass();
    }

    public void setMaxScaleFactor(float f) {
        C1A77 c1a77 = this.LL;
        c1a77.getClass();
        if (!Float.isNaN(f) && f >= 0.0f && f <= Float.MAX_VALUE) {
            c1a77.LJII = f;
        }
    }

    public void setMinScaleFactor(float f) {
        C1A77 c1a77 = this.LL;
        c1a77.getClass();
        if (!Float.isNaN(f) && f >= 0.0f && f <= Float.MAX_VALUE) {
            c1a77.LJIIIIZZ = f;
        }
    }

    @Override // X.InterfaceC2178711AOn
    public void setOptimizeBlackSide(boolean z) {
        this.LL.getClass();
    }

    @Override // X.InterfaceC2178711AOn
    public void setOptimizeNormalFillScreen(boolean z) {
        this.LL.LJIIJ = z;
    }

    public void setResizeListener(C1A78 c1a78) {
        this.LL.getClass();
    }

    public void setRotatable(boolean z) {
        this.LL.getClass();
    }

    public void setScalable(boolean z) {
        this.LL.getClass();
    }

    public void setTextureLayout(int i) {
        C1A77 c1a77 = this.LL;
        if (c1a77.LJIIIZ != i) {
            c1a77.LJIIIZ = i;
            c1a77.LIZ.requestLayout();
        }
    }

    public void setTranslatable(boolean z) {
        this.LL.getClass();
    }

    @Override // X.InterfaceC2178711AOn
    public void setZoomingEnabled(boolean z) {
        this.LL.LJIIJJI = z;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widthMeasureSpec:");
        sbLIZ.append(View.MeasureSpec.toString(i));
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("heightMeasureSpec:");
        sbLIZ2.append(View.MeasureSpec.toString(i2));
        C2188811AlT.LIZIZ(sbLIZ2);
        Pair<Integer, Integer> pairLJFF = this.LL.LJFF(i, i2, getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom());
        setMeasuredDimension(((Integer) pairLJFF.first).intValue(), ((Integer) pairLJFF.second).intValue());
    }

    @Override // X.InterfaceC2178711AOn
    public final void setVideoSize(int i, int i2) {
        this.LL.LJII(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
