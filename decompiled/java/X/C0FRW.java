package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FRW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRW extends ConstraintLayout {
    public final Paint LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLILLJJLI = findViewById(R.id.rqq);
        this.LLILLL = findViewById(R.id.rqp);
        this.LLILZ = findViewById(R.id.rs5);
        this.LLILZIL = findViewById(R.id.rp4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View view = this.LLILLJJLI;
        View view2 = this.LLILLL;
        View view3 = this.LLILZ;
        View view4 = this.LLILZIL;
        float width = getWidth();
        float height = getHeight();
        if (view2 == null || view2.getVisibility() != 0) {
            if (view3 != null && view3.getVisibility() == 0) {
                view2 = view3;
            } else {
                view2 = null;
            }
        }
        if (view != null && view.getVisibility() == 0) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null);
            drawChild(canvas, view, getDrawingTime());
            if (view2 != null) {
                e0(canvas, view2);
            }
            if (view4 != null && view4.getVisibility() == 0) {
                e0(canvas, view4);
            }
            canvas.restoreToCount(iSaveLayer);
        }
        if (view2 != null) {
            int iSaveLayer2 = canvas.saveLayer(0.0f, 0.0f, width, height, null);
            drawChild(canvas, view2, getDrawingTime());
            if (view4 != null && view4.getVisibility() == 0) {
                e0(canvas, view4);
            }
            canvas.restoreToCount(iSaveLayer2);
        }
        if (view4 != null && view4.getVisibility() == 0) {
            drawChild(canvas, view4, getDrawingTime());
        }
    }

    public C0FRW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(Canvas canvas, View view) {
        canvas.drawCircle(view.getLeft() + (view.getWidth() / 2.0f), view.getTop() + (view.getHeight() / 2.0f), view.getWidth() / 2.0f, this.LL);
    }

    public C0FRW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LL = paint;
        setLayerType(2, null);
    }
}
