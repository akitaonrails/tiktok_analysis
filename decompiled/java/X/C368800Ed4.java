package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ed4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C368800Ed4 extends View {
    public InterfaceC369160Ede LL;
    public float LLILLJJLI;
    public float LLILLL;
    public RectF LLILZ;
    public final C01GW LLILZIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public final int getMinTitleWidth() {
        return this.LL.LIZIZ();
    }

    public final float getDrawLeftBounds() {
        return this.LLILLJJLI;
    }

    public final float getDrawRightBounds() {
        return this.LLILLL;
    }

    public final InterfaceC369160Ede getNullTrackPainter$editor_trackpanel_release() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float f = this.LLILLJJLI;
            float f2 = this.LLILLL;
            float x = motionEvent.getX();
            if (f <= x && x <= f2) {
                if (motionEvent.getAction() == 1) {
                    performClick();
                }
                return true;
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDrawLeftBounds(float f) {
        this.LLILLJJLI = f;
    }

    public final void setDrawRightBounds(float f) {
        this.LLILLL = f;
    }

    public final void setNullTrackPainter$editor_trackpanel_release(InterfaceC369160Ede interfaceC369160Ede) {
        this.LL = interfaceC369160Ede;
    }

    public C368800Ed4(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new InterfaceC369160Ede(context) { // from class: X.0Ed5
            public final Context LIZ;
            public final Paint LIZIZ;
            public final TextPaint LIZJ;
            public final float LIZLLL;
            public final Drawable LJ;
            public final int LJFF;
            public final int LJI;
            public final int LJII;
            public final int LJIIIIZZ;
            public final int LJIIIZ;

            @Override // X.InterfaceC369160Ede
            public final int LIZIZ() {
                return 0;
            }

            {
                this.LIZ = context;
                Paint paint = new Paint();
                this.LIZIZ = paint;
                TextPaint textPaint = new TextPaint();
                this.LIZJ = textPaint;
                this.LIZLLL = C0FU0.LIZ(1.0f);
                this.LJ = C800330VaR.LIZIZ(context, R.drawable.c0m);
                this.LJFF = C0FU0.LIZ(4.0f);
                this.LJI = C0FU0.LIZ(8.0f);
                this.LJII = C0FU0.LIZ(2.0f);
                this.LJIIIIZZ = C0FU0.LIZ(10.0f);
                this.LJIIIZ = C0FU0.LIZ(16.0f);
                paint.setAntiAlias(true);
                paint.setColor(ColorProtector.parseColor("#202020"));
                textPaint.setAntiAlias(true);
                textPaint.setTextSize(C0FU0.LIZ(10.0f));
                textPaint.setStrokeWidth(C0FU0.LIZ(1.0f));
                textPaint.setStyle(Paint.Style.FILL);
                textPaint.setColor(ColorProtector.parseColor("#80FFFFFF"));
            }

            @Override // X.InterfaceC369160Ede
            public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4) {
                float f5 = this.LIZLLL;
                canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.LIZIZ);
                Drawable drawable = this.LJ;
                if (drawable != null) {
                    int i2 = ((int) f) + this.LJFF;
                    int i3 = ((int) f2) + this.LJI;
                    int i4 = this.LJIIIZ;
                    drawable.setBounds(i2, i3, i2 + i4, i4 + i3);
                    drawable.draw(canvas);
                    canvas.drawText(this.LIZ.getString(2131833406), f + this.LJFF + this.LJIIIZ + this.LJII, f2 + this.LJIIIIZZ + this.LIZJ.getTextSize(), this.LIZJ);
                }
            }
        };
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 6));
        setContentDescription(context.getString(2131833406));
    }

    public void LIZ(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (((Boolean) this.LLILZIL.getValue()).booleanValue()) {
            int measuredWidth = getMeasuredWidth();
            int i2 = C368630Ecn.LLLLJI;
            getContext();
            this.LLILLJJLI = (measuredWidth - C369020EdQ.LIZ()) + f;
            int measuredWidth2 = getMeasuredWidth();
            getContext();
            this.LLILLL = (measuredWidth2 - C369020EdQ.LIZ()) + f3;
        } else {
            float f5 = i;
            this.LLILLJJLI = f - f5;
            this.LLILLL = f3 - f5;
        }
        if (this.LLILZ == null) {
            this.LLILZ = new RectF(f, f2, f3, f4);
        }
        if (f > f3) {
            if (this.LLILZ != null) {
                this.LL.LIZ(canvas, f, f2, f3, f4);
            }
        } else {
            this.LL.LIZ(canvas, f, f2, f3, f4);
            RectF rectF = this.LLILZ;
            if (rectF == null) {
                return;
            }
            rectF.set(f, f2, f3, f4);
        }
    }
}
