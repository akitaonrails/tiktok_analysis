package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ejA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099860ejA extends C1083100eI8 {
    public ConstraintLayout mContainer;
    public int mDefaultIndicatorColor;
    public final Paint mPaint;

    public C1099860ejA(Context context) {
        this(context, null);
    }

    @Override // X.C19MX, android.view.View
    public void onDraw(Canvas canvas) {
        C1090450eTz c1090450eTz;
        Integer indicatorColor$live_widget_release;
        super.onDraw(canvas);
        int i = this.mCount;
        for (int i2 = 0; i2 < i; i2++) {
            View view = getViews(this.mContainer)[i2];
            if (view != null && view.getVisibility() != 8) {
                if ((view instanceof C1090450eTz) && (c1090450eTz = (C1090450eTz) view) != null && (indicatorColor$live_widget_release = c1090450eTz.getIndicatorColor$live_widget_release()) != null) {
                    this.mPaint.setColor(indicatorColor$live_widget_release.intValue());
                } else {
                    this.mPaint.setColor(this.mDefaultIndicatorColor);
                }
                if (view.getHeight() > 0) {
                    canvas.drawLine(view.getLeft(), view.getTop(), view.getLeft(), view.getBottom(), this.mPaint);
                }
                if (view.getWidth() > 0) {
                    canvas.drawLine(view.getLeft(), view.getTop(), view.getRight(), view.getTop(), this.mPaint);
                }
            }
        }
    }

    @Override // X.C19MX
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        super.updatePostLayout(constraintLayout);
        invalidate();
    }

    @Override // X.C1083100eI8, X.C19MX
    public void updatePreDraw(ConstraintLayout constraintLayout) {
        super.updatePreDraw(constraintLayout);
        this.mContainer = constraintLayout;
    }

    public C1099860ejA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDefaultIndicatorColor = -65536;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.mDefaultIndicatorColor);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.asd));
        paint.setPathEffect(new DashPathEffect(new float[]{context.getResources().getDimensionPixelSize(R.dimen.asc), context.getResources().getDimensionPixelSize(R.dimen.asb)}, 0.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint = paint;
    }
}
