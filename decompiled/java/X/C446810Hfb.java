package X;

import Y.ARunnableS106S0100000_6;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Hfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446810Hfb extends View {
    public C20246014Ju LL;
    public final boolean LLILLJJLI;
    public Drawable LLILLL;
    public final ARunnableS106S0100000_6 LLILZ;

    public Drawable getNavigationBarBackgroundDrawable() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C20246014Ju c20246014Ju;
        int iLIZJ;
        super.onDraw(canvas);
        if (this.LLILLJJLI && this.LLILLL != null && (c20246014Ju = this.LL) != null && (iLIZJ = c20246014Ju.LIZJ()) > 0) {
            this.LLILLL.setBounds(0, getHeight() - iLIZJ, getWidth(), getHeight());
            this.LLILLL.draw(canvas);
        }
    }

    public void setNavigationBarBackground(int i) {
        Drawable drawableLIZIZ;
        if (i != 0) {
            drawableLIZIZ = C800330VaR.LIZIZ(getContext(), i);
        } else {
            drawableLIZIZ = null;
        }
        this.LLILLL = drawableLIZIZ;
        invalidate();
    }

    public void setNavigationBarBackgroundColor(int i) {
        this.LLILLL = new ColorDrawable(i);
        invalidate();
    }

    public void setNavigationBarBackground(Drawable drawable) {
        this.LLILLL = drawable;
        invalidate();
    }

    public C446810Hfb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = true;
        this.LLILZ = new ARunnableS106S0100000_6((Object) this, 32);
        C14K9.LJIJJ(this, new C0IE2(this, 1));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.navigationBarColor});
        try {
            this.LLILLL = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C20246014Ju c20246014Ju = this.LL;
        if (c20246014Ju != null) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c20246014Ju.LIZJ(), 1073741824);
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    suggestedMinimumWidth = size;
                }
            } else {
                suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
            }
            int suggestedMinimumHeight = getSuggestedMinimumHeight();
            int mode2 = View.MeasureSpec.getMode(iMakeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(iMakeMeasureSpec);
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    suggestedMinimumHeight = size2;
                }
            } else {
                suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
            }
            setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
            return;
        }
        int suggestedMinimumWidth2 = getSuggestedMinimumWidth();
        int mode3 = View.MeasureSpec.getMode(i);
        int size3 = View.MeasureSpec.getSize(i);
        if (mode3 != Integer.MIN_VALUE) {
            if (mode3 == 1073741824) {
                suggestedMinimumWidth2 = size3;
            }
        } else {
            suggestedMinimumWidth2 = Math.min(suggestedMinimumWidth2, size3);
        }
        int suggestedMinimumHeight2 = getSuggestedMinimumHeight();
        int mode4 = View.MeasureSpec.getMode(i2);
        int size4 = View.MeasureSpec.getSize(i2);
        if (mode4 != Integer.MIN_VALUE) {
            if (mode4 == 1073741824) {
                suggestedMinimumHeight2 = size4;
            }
        } else {
            suggestedMinimumHeight2 = Math.min(suggestedMinimumHeight2, size4);
        }
        setMeasuredDimension(suggestedMinimumWidth2, suggestedMinimumHeight2);
    }
}
