package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370660Eg4 extends LinearLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public final Rect LLILZ;
    public final RectF LLILZIL;
    public final Paint LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int iIntValue;
        LinearGradient linearGradient;
        if (findViewById(R.id.xo8) != null) {
            this.LLILLL.set(r6.getLeft() + 2.0f, r6.getTop() + 2.0f, r6.getRight() - 2.0f, r6.getBottom() - 2.0f);
            float fHeight = this.LLILLL.height() / 2.0f;
            canvas.drawRoundRect(this.LLILLL, fHeight, fHeight, this.LL);
            View viewFindViewById = findViewById(R.id.nq1);
            if (viewFindViewById != null) {
                viewFindViewById.getDrawingRect(this.LLILZ);
                offsetDescendantRectToMyCoords(viewFindViewById, this.LLILZ);
                this.LLILZIL.set(this.LLILZ);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -1;
                }
                Paint paint = this.LLILZLL;
                if (getLayoutDirection() == 1) {
                    RectF rectF = this.LLILZIL;
                    linearGradient = new LinearGradient(rectF.right, 0.0f, rectF.left, 0.0f, iIntValue, 0, Shader.TileMode.CLAMP);
                } else {
                    RectF rectF2 = this.LLILZIL;
                    linearGradient = new LinearGradient(rectF2.left, 0.0f, rectF2.right, 0.0f, iIntValue, 0, Shader.TileMode.CLAMP);
                }
                paint.setShader(linearGradient);
                canvas.drawRect(this.LLILZIL, this.LLILZLL);
                this.LLILZLL.setShader(null);
            }
            canvas.drawRoundRect(this.LLILLL, fHeight, fHeight, this.LLILLJJLI);
        }
        super.dispatchDraw(canvas);
    }

    public C370660Eg4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LL = paint;
        Paint paint2 = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zb, context);
        paint2.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        paint2.setStyle(Paint.Style.FILL);
        this.LLILLJJLI = paint2;
        this.LLILLL = new RectF();
        this.LLILZ = new Rect();
        this.LLILZIL = new RectF();
        this.LLILZLL = new Paint(1);
        setLayerType(1, null);
    }
}
