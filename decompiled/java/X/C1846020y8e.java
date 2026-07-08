package X;

import Y.ALAdapterS4S0101000_27;
import Y.AUListenerS155S0300000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0y8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846020y8e extends LinearLayout {
    public ValueAnimator LL;
    public int LLILLJJLI;
    public float LLILLL;
    public final /* synthetic */ C1846010y8d LLILZ;

    private final int getFirstChildWidth() {
        return getChildAt(0).getMeasuredWidth();
    }

    public final void LIZ() {
        int selectedTabPosition = this.LLILZ.getSelectedTabPosition();
        this.LLILLJJLI = selectedTabPosition;
        View childAt = getChildAt(selectedTabPosition);
        C1846010y8d c1846010y8d = this.LLILZ;
        C1845980y8a c1845980y8a = c1846010y8d.LLILLJJLI;
        if (c1845980y8a != null) {
            Drawable tabSelectedIndicator = c1846010y8d.getTabSelectedIndicator();
            RectF rectFLIZ = C1845920y8U.LIZ(c1846010y8d, childAt, c1845980y8a.LIZ);
            tabSelectedIndicator.setBounds((int) rectFLIZ.left, tabSelectedIndicator.getBounds().top, (int) rectFLIZ.right, tabSelectedIndicator.getBounds().bottom);
        }
    }

    private final int getSupportChildMaxWidth() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return -1;
        }
        if (childCount == 1) {
            return getFirstChildWidth();
        }
        if (childCount != 2) {
            return C814420VxA.LIZIZ(((this.LLILZ.LLJJIJIIJIL - getFirstChildWidth()) - C418440Gaw.LIZIZ(94)) / 1.5f);
        }
        return C814420VxA.LIZ(((double) ((this.LLILZ.LLJJIJIIJIL - getFirstChildWidth()) - C418440Gaw.LIZIZ(78))) * 0.7d);
    }

    public final int getSelectedPosition() {
        return this.LLILLJJLI;
    }

    public final float getSelectionOffset() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int iHeight = this.LLILZ.getTabSelectedIndicator().getBounds().height();
        if (iHeight < 0) {
            iHeight = this.LLILZ.getTabSelectedIndicator().getIntrinsicHeight();
        }
        int height = getHeight() - iHeight;
        int height2 = getHeight();
        if (this.LLILZ.getTabSelectedIndicator().getBounds().width() > 0) {
            Rect bounds = this.LLILZ.getTabSelectedIndicator().getBounds();
            this.LLILZ.getTabSelectedIndicator().setBounds(bounds.left, height, bounds.right, height2);
            this.LLILZ.getTabSelectedIndicator().draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    public final void setSelectedIndicatorHeight(int i) {
        Rect bounds = this.LLILZ.getTabSelectedIndicator().getBounds();
        this.LLILZ.getTabSelectedIndicator().setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void setSelectedPosition(int i) {
        this.LLILLJJLI = i;
    }

    public final void setSelectionOffset(float f) {
        this.LLILLL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1846020y8e(C1846010y8d c1846010y8d, Context context) {
        super(context);
        this.LLILZ = c1846010y8d;
        this.LLILLJJLI = -1;
        new Paint();
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = false;
        if (this.LLILZ.LLJJJJLIIL) {
            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, getChildCount());
            C1846010y8d c1846010y8d = this.LLILZ;
            C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
            while (it2.LLILLL) {
                int iNextInt = it2.nextInt();
                c1846010y8d.getClass();
                LinearLayout.LayoutParams layoutParamsLIZJ = C1846010y8d.LIZJ(iNextInt);
                layoutParamsLIZJ.gravity = 17;
                C786410Ut5.W5(getChildAt(iNextInt), layoutParamsLIZJ);
            }
            this.LLILZ.LLJJJJLIIL = false;
        }
        super.onMeasure(i, i2);
        if (!((Boolean) C0ABA.LIZ.getValue()).booleanValue() && getChildCount() >= 2) {
            int supportChildMaxWidth = getSupportChildMaxWidth();
            C531650Kt9 it3 = C13LZ.LJIILJJIL(1, getChildCount()).iterator();
            while (it3.LLILLL) {
                View childAt = getChildAt(it3.nextInt());
                childAt.getLayoutParams().width = Math.min(childAt.getMeasuredWidth(), supportChildMaxWidth);
                C2153908cD c2153908cD = C2153908cD.LIZ;
            }
            super.onMeasure(i, i2);
        }
        int measuredWidth = (getMeasuredWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        C531650Kt9 it4 = C13LZ.LJIILJJIL(0, childCount).iterator();
        int measuredWidth2 = 0;
        while (it4.LLILLL) {
            measuredWidth2 += getChildAt(it4.nextInt()).getMeasuredWidth();
        }
        C1846010y8d c1846010y8d2 = this.LLILZ;
        if (measuredWidth > (((c1846010y8d2.LLJJIJIIJIL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) {
            z = true;
        }
        c1846010y8d2.LLJJIJIL = z;
        C2153908cD c2153908cD2 = C2153908cD.LIZ;
        String str = "compute onChildMeasure screenWidth: " + this.LLILZ.LLJJIJIIJIL + ", excludeFirstTabByPassScreenWidth: " + this.LLILZ.LLJJIJIL + ", widthSum " + measuredWidth2;
        c2153908cD2.getClass();
        C2153908cD.LIZJ(3, str, "explore_tab_bar");
        if (measuredWidth > measuredWidth2) {
            C2153908cD.LIZJ(3, "compute onChildMeasure thresholdWidthForTabScrollable > widthSum no need adjust", "explore_tab_bar");
        } else {
            View.MeasureSpec.getMode(i);
        }
    }

    public final void LIZIZ(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            C1846010y8d c1846010y8d = this.LLILZ;
            C1845980y8a c1845980y8a = c1846010y8d.LLILLJJLI;
            if (c1845980y8a != null) {
                Drawable tabSelectedIndicator = c1846010y8d.getTabSelectedIndicator();
                RectF rectFLIZ = C1845920y8U.LIZ(c1846010y8d, view, c1845980y8a.LIZ);
                RectF rectFLIZ2 = C1845920y8U.LIZ(c1846010y8d, view2, c1845980y8a.LIZ);
                float f2 = 1.0f - f;
                tabSelectedIndicator.setBounds((int) ((rectFLIZ.left * f2) + (rectFLIZ2.left * f)), tabSelectedIndicator.getBounds().top, (int) ((f2 * rectFLIZ.right) + (f * rectFLIZ2.right)), tabSelectedIndicator.getBounds().bottom);
            }
        } else {
            this.LLILZ.getTabSelectedIndicator().setBounds(-1, this.LLILZ.getTabSelectedIndicator().getBounds().top, -1, this.LLILZ.getTabSelectedIndicator().getBounds().bottom);
        }
        postInvalidateOnAnimation();
    }

    public final void LIZJ(boolean z, int i, int i2) {
        View childAt = getChildAt(this.LLILLJJLI);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            LIZ();
            return;
        }
        AUListenerS155S0300000_27 aUListenerS155S0300000_27 = new AUListenerS155S0300000_27(this, childAt, childAt2, 2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LL = valueAnimator;
            valueAnimator.setInterpolator(new C12DM());
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aUListenerS155S0300000_27);
            valueAnimator.addListener(new ALAdapterS4S0101000_27(this, i, 2));
            valueAnimator.start();
            return;
        }
        ValueAnimator valueAnimator2 = this.LL;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.LL;
        if (valueAnimator3 == null) {
            return;
        }
        valueAnimator3.addUpdateListener(aUListenerS155S0300000_27);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2153908cD.LIZ.getClass();
        C2153908cD.LIZJ(3, "onLayout", "explore_tab_bar");
        this.LLILZ.getClass();
        ValueAnimator valueAnimator = this.LL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            LIZJ(false, this.LLILLJJLI, -1);
        } else {
            LIZ();
        }
    }
}
