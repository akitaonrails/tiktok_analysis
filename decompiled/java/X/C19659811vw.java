package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19659811vw extends View {
    public static final int[] LLILZIL = {R.attr.biq};
    public C20246014Ju LL;
    public final boolean LLILLJJLI;
    public Drawable LLILLL;
    public final ARunnableS112S0100000_12 LLILZ;

    public Drawable getStatusBarBackgroundDrawable() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C20246014Ju c20246014Ju;
        int iLJFF;
        super.onDraw(canvas);
        if (this.LLILLJJLI && this.LLILLL != null && (c20246014Ju = this.LL) != null && (iLJFF = c20246014Ju.LJFF()) > 0) {
            this.LLILLL.setBounds(0, 0, getWidth(), iLJFF);
            this.LLILLL.draw(canvas);
        }
    }

    public void setStatusBarBackground(int i) {
        Drawable drawableLIZIZ;
        if (i != 0) {
            drawableLIZIZ = C800330VaR.LIZIZ(getContext(), i);
        } else {
            drawableLIZIZ = null;
        }
        this.LLILLL = drawableLIZIZ;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.LLILLL = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.LLILLL = drawable;
        invalidate();
    }

    public C19659811vw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = true;
        this.LLILZ = new ARunnableS112S0100000_12(this, 150);
        C14K9.LJIJJ(this, new C19775312Yt(this, 1));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(LLILZIL);
        try {
            this.LLILLL = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            C14K9.LJIJ(this, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
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
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c20246014Ju.LJFF(), 1073741824);
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
