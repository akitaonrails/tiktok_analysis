package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GSF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSF extends View {
    public int LL;
    public EnumC429240GsM LLILLJJLI;
    public final int LLILLL;
    public final Paint LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = C416120GTi.LIZ[this.LLILLJJLI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.LLILZ.setColor(this.LLILZIL);
                        if (C426750GoL.LIZLLL(getContext())) {
                            int i2 = this.LLILLL;
                            canvas.drawRect(i2 - ((this.LL * i2) / 100), 0.0f, i2, getHeight(), this.LLILZ);
                        } else {
                            canvas.drawRect(0.0f, 0.0f, (this.LLILLL * this.LL) / 100, getHeight(), this.LLILZ);
                        }
                        this.LLILZ.setColor(this.LLILZLL);
                        if (C426750GoL.LIZLLL(getContext())) {
                            canvas.drawRect(0.0f, 0.0f, this.LLILLL - ((r1 * this.LL) / 100), getHeight(), this.LLILZ);
                            return;
                        } else {
                            canvas.drawRect((this.LL * r1) / 100, 0.0f, this.LLILLL, getHeight(), this.LLILZ);
                            return;
                        }
                    }
                    throw new C1954807lC();
                }
                this.LLILZ.setColor(this.LLILZIL);
                canvas.drawRect(0.0f, 0.0f, this.LLILLL, getHeight(), this.LLILZ);
                return;
            }
            this.LLILZ.setColor(this.LLIZ);
            canvas.drawRect(0.0f, 0.0f, this.LLILLL, getHeight(), this.LLILZ);
        }
    }

    public final void setProgress(int i) {
        this.LL = i;
        invalidate();
    }

    public final void setStatus(EnumC429240GsM enumC429240GsM) {
        this.LLILLJJLI = enumC429240GsM;
        invalidate();
    }

    public C0GSF(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        super(context, attributeSet, 0);
        this.LLILLJJLI = EnumC429240GsM.PUBLISHING;
        this.LLILLL = C497820Jfg.LIZIZ(context);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LLILZ = paint;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        this.LLILZIL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -7829368;
        }
        this.LLILZLL = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1l, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = -65536;
        }
        this.LLIZ = iIntValue3;
    }
}
