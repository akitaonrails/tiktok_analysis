package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416330GUd extends View {
    public RectF LL;
    public float LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;

    public C416330GUd(Context context) {
        int iIntValue;
        super(context);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.agi, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        this.LLILZIL = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LLILZLL = paint2;
        setLayerType(1, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPaint(this.LLILZIL);
        RectF rectF = this.LL;
        if (rectF != null) {
            float f = this.LLILLJJLI;
            canvas.drawRoundRect(rectF, f, f, this.LLILZLL);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            RectF rectF = this.LL;
            if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                Function0<Unit> function0 = this.LLILZ;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                Function0<Unit> function02 = this.LLILLL;
                if (function02 != null) {
                    function02.invoke();
                    return true;
                }
            }
        }
        return true;
    }
}
