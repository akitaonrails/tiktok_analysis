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
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0y90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846240y90 extends LinearLayout {
    public ValueAnimator LL;
    public int LLILLJJLI;
    public float LLILLL;
    public final Paint LLILZ;
    public final /* synthetic */ C1846220y8y LLILZIL;

    public final void LIZ() {
        int selectedTabPosition = this.LLILZIL.getSelectedTabPosition();
        this.LLILLJJLI = selectedTabPosition;
        View childAt = getChildAt(selectedTabPosition);
        C1846220y8y c1846220y8y = this.LLILZIL;
        C1846290y95 c1846290y95 = c1846220y8y.LLILLJJLI;
        if (c1846290y95 != null) {
            Drawable tabSelectedIndicator = c1846220y8y.getTabSelectedIndicator();
            RectF rectFLIZ = C1846250y91.LIZ(c1846220y8y, childAt, c1846290y95.LIZ);
            tabSelectedIndicator.setBounds((int) rectFLIZ.left, tabSelectedIndicator.getBounds().top, (int) rectFLIZ.right, tabSelectedIndicator.getBounds().bottom);
        }
    }

    public final int getSelectedPosition() {
        return this.LLILLJJLI;
    }

    public final float getSelectionOffset() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C1846220y8y c1846220y8y = this.LLILZIL;
        if (c1846220y8y.LLJI) {
            this.LLILZ.setColor(c1846220y8y.LLILZIL);
            canvas.drawLine(0.0f, getHeight() - 1.0f, getWidth() + getPaddingLeft() + getPaddingRight(), getHeight(), this.LLILZ);
        }
        int iHeight = this.LLILZIL.getTabSelectedIndicator().getBounds().height();
        if (iHeight < 0) {
            iHeight = this.LLILZIL.getTabSelectedIndicator().getIntrinsicHeight();
        }
        int height = getHeight() - iHeight;
        int height2 = getHeight();
        if (this.LLILZIL.getTabSelectedIndicator().getBounds().width() > 0) {
            this.LLILZIL.getClass();
            Rect bounds = this.LLILZIL.getTabSelectedIndicator().getBounds();
            this.LLILZIL.getTabSelectedIndicator().setBounds(bounds.left, height, bounds.right, height2);
            this.LLILZIL.getTabSelectedIndicator().draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    public final void setSelectedIndicatorHeight(int i) {
        Rect bounds = this.LLILZIL.getTabSelectedIndicator().getBounds();
        this.LLILZIL.getTabSelectedIndicator().setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void setSelectedPosition(int i) {
        this.LLILLJJLI = i;
    }

    public final void setSelectionOffset(float f) {
        this.LLILLL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1846240y90(C1846220y8y c1846220y8y, Context context) {
        super(context);
        this.LLILZIL = c1846220y8y;
        this.LLILLJJLI = -1;
        this.LLILZ = new Paint();
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        if (this.LLILZIL.LLJL) {
            Iterator<Integer> it2 = C13LZ.LJIILJJIL(0, getChildCount()).iterator();
            while (it2.hasNext()) {
                int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.gravity = 17;
                C786410Ut5.W5(getChildAt(iNextInt), layoutParams);
            }
            this.LLILZIL.LLJL = false;
        }
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C1846220y8y c1846220y8y = this.LLILZIL;
        if (c1846220y8y.LLJ == 1 && c1846220y8y.LLIZLLLIL == 0) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2);
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        if (this.LLILZIL.LLIZLLLIL == 1) {
            measuredWidth = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) * childCount;
        } else {
            Iterator<Integer> it3 = C13LZ.LJIILJJIL(0, childCount).iterator();
            measuredWidth = 0;
            while (it3.hasNext()) {
                measuredWidth += getChildAt(((AbstractC2098408Jy) it3).nextInt()).getMeasuredWidth();
            }
        }
        int i4 = measuredWidth2 - measuredWidth;
        if (i4 < 0) {
            if (this.LLILZIL.LLIZLLLIL == 1) {
                int measuredWidth3 = (int) (((double) (getMeasuredWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)))) / (((double) ((int) (((double) ((getMeasuredWidth() - C418440Gaw.LIZIZ(16)) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)))) - 0.5d))) + 0.5d));
                Iterator<Integer> it4 = C13LZ.LJIILJJIL(0, getChildCount()).iterator();
                while (it4.hasNext()) {
                    getChildAt(((AbstractC2098408Jy) it4).nextInt()).getLayoutParams().width = measuredWidth3;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
                return;
            }
            return;
        }
        int i5 = measuredWidth2 / childCount;
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, childCount);
        ArrayList arrayList = new ArrayList();
        for (Integer num : intRangeLJIILJJIL) {
            if (getChildAt(num.intValue()).getMeasuredWidth() < i5) {
                arrayList.add(num);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = i4 / arrayList.size();
        int size2 = i4 - (arrayList.size() * size);
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            View childAt = getChildAt(((Number) it5.next()).intValue());
            if (size2 > 0) {
                size2--;
                i3 = 1;
            } else {
                i3 = 0;
            }
            childAt.getLayoutParams().width = i3 + size + childAt.getMeasuredWidth();
        }
        super.onMeasure(i, i2);
    }

    public final void LIZIZ(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            C1846220y8y c1846220y8y = this.LLILZIL;
            C1846290y95 c1846290y95 = c1846220y8y.LLILLJJLI;
            if (c1846290y95 != null) {
                Drawable tabSelectedIndicator = c1846220y8y.getTabSelectedIndicator();
                RectF rectFLIZ = C1846250y91.LIZ(c1846220y8y, view, c1846290y95.LIZ);
                RectF rectFLIZ2 = C1846250y91.LIZ(c1846220y8y, view2, c1846290y95.LIZ);
                float f2 = 1.0f - f;
                tabSelectedIndicator.setBounds((int) ((rectFLIZ.left * f2) + (rectFLIZ2.left * f)), tabSelectedIndicator.getBounds().top, (int) ((f2 * rectFLIZ.right) + (f * rectFLIZ2.right)), tabSelectedIndicator.getBounds().bottom);
            }
        } else {
            this.LLILZIL.getTabSelectedIndicator().setBounds(-1, this.LLILZIL.getTabSelectedIndicator().getBounds().top, -1, this.LLILZIL.getTabSelectedIndicator().getBounds().bottom);
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
        AUListenerS155S0300000_27 aUListenerS155S0300000_27 = new AUListenerS155S0300000_27(this, childAt, childAt2, 3);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LL = valueAnimator;
            valueAnimator.setInterpolator(C194V.LIZIZ);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aUListenerS155S0300000_27);
            valueAnimator.addListener(new ALAdapterS4S0101000_27(this, i, 3));
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
        ValueAnimator valueAnimator = this.LL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            LIZJ(false, this.LLILLJJLI, -1);
        } else {
            LIZ();
        }
    }
}
