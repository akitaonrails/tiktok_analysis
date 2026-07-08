package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0GTX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0GTX extends View {
    public int LL;
    public int LLILLJJLI;
    public final Paint LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    public abstract int LIZIZ();

    public abstract int LIZJ();

    public final float getDensityDpi() {
        return getResources().getDisplayMetrics().densityDpi / 160.0f;
    }

    public final int getContentHeight() {
        return this.LLILZLL;
    }

    public final int getContentWidth() {
        return this.LLILZIL;
    }

    public final int getCurPosition() {
        return this.LLILLJJLI;
    }

    public final int getGravity() {
        return this.LLILZ;
    }

    public final Paint getPaint() {
        return this.LLILLL;
    }

    public final int getTotalCount() {
        return this.LL;
    }

    public final boolean LIZ(int i) {
        if ((this.LLILZ & i) == i) {
            return true;
        }
        return false;
    }

    public void setCurrentPage(int i) {
        this.LLILLJJLI = i;
        requestLayout();
    }

    public final void setGravity(int i) {
        this.LLILZ = i;
    }

    public final void setIndicatorGravity(int i) {
        int i2 = i & 255;
        if ((i2 & 119) == 119) {
            i2 = 51;
        } else if ((i2 & 112) == 112) {
            i2 = 48;
        } else if ((i2 & 7) == 7) {
            i2 = 3;
        }
        this.LLILZ = i2;
    }

    public void setTotalPage(int i) {
        this.LL = i;
    }

    public C0GTX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = 17;
        this.LLILLL = new Paint(1);
        setIndicatorGravity(17);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int iLIZJ = LIZJ();
        this.LLILZIL = iLIZJ;
        int paddingLeft = iLIZJ + getPaddingLeft() + getPaddingRight();
        int iLIZIZ = LIZIZ();
        this.LLILZLL = iLIZIZ;
        int paddingTop = iLIZIZ + getPaddingTop() + getPaddingBottom();
        if (mode != Integer.MIN_VALUE) {
            paddingLeft = View.MeasureSpec.getSize(i);
        }
        if (mode2 != Integer.MIN_VALUE) {
            paddingTop = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }
}
