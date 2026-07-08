package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418950Gbl extends View {
    public boolean LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public Paint LLILZ;
    public Paint LLILZIL;
    public TextPaint LLILZLL;
    public Paint LLIZ;
    public Drawable LLIZLLLIL;
    public float LLJ;
    public Rect LLJI;
    public boolean LLJIJIL;

    private Rect getCheckRect() {
        if (this.LLJI == null) {
            float f = this.LLJ;
            int i = (int) (((f * 48.0f) / 2.0f) - ((f * 16.0f) / 2.0f));
            float f2 = this.LLJ;
            float f3 = i;
            this.LLJI = new Rect(i, i, (int) ((f2 * 48.0f) - f3), (int) ((f2 * 48.0f) - f3));
        }
        return this.LLJI;
    }

    public final void LIZ() {
        if (this.LLILZIL == null) {
            Paint paint = new Paint();
            this.LLILZIL = paint;
            paint.setAntiAlias(true);
            this.LLILZIL.setStyle(Paint.Style.FILL);
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.bz4});
            int color = typedArrayObtainStyledAttributes.getColor(0, C420650GeV.LIZ(getResources(), R.color.acn, getContext().getTheme()));
            typedArrayObtainStyledAttributes.recycle();
            this.LLILZIL.setColor(color);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.LLIZ == null) {
            Paint paint = new Paint();
            this.LLIZ = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.LLIZ;
            float f2 = this.LLJ;
            float f3 = (f2 * 48.0f) / 2.0f;
            paint2.setShader(new RadialGradient(f3, f3, f2 * 19.0f, new int[]{ColorProtector.parseColor("#00000000"), ColorProtector.parseColor("#0D000000"), ColorProtector.parseColor("#0D000000"), ColorProtector.parseColor("#00000000")}, new float[]{0.21052632f, 0.5263158f, 0.68421054f, 1.0f}, Shader.TileMode.CLAMP));
        }
        float f4 = this.LLJ;
        float f5 = (f4 * 48.0f) / 2.0f;
        canvas.drawCircle(f5, f5, f4 * 19.0f, this.LLIZ);
        float f6 = this.LLJ;
        float f7 = (f6 * 48.0f) / 2.0f;
        canvas.drawCircle(f7, f7, f6 * 11.5f, this.LLILZ);
        if (this.LL) {
            if (this.LLILLL != Integer.MIN_VALUE) {
                LIZ();
                float f8 = this.LLJ;
                float f9 = (48.0f * f8) / 2.0f;
                canvas.drawCircle(f9, f9, f8 * 11.0f, this.LLILZIL);
                if (this.LLILZLL == null) {
                    TextPaint textPaint = new TextPaint();
                    this.LLILZLL = textPaint;
                    textPaint.setAntiAlias(true);
                    this.LLILZLL.setColor(-1);
                    this.LLILZLL.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    this.LLILZLL.setTextSize(this.LLJ * 12.0f);
                }
                canvas.drawText(String.valueOf(this.LLILLL), ((int) (canvas.getWidth() - this.LLILZLL.measureText(r5))) / 2, ((int) ((canvas.getHeight() - this.LLILZLL.descent()) - this.LLILZLL.ascent())) / 2, this.LLILZLL);
            }
        } else if (this.LLILLJJLI) {
            LIZ();
            float f10 = this.LLJ;
            float f11 = (48.0f * f10) / 2.0f;
            canvas.drawCircle(f11, f11, f10 * 11.0f, this.LLILZIL);
            this.LLIZLLLIL.setBounds(getCheckRect());
            this.LLIZLLLIL.draw(canvas);
        }
        if (this.LLJIJIL) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
    }

    public void setChecked(boolean z) {
        if (!this.LL) {
            this.LLILLJJLI = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
    }

    public void setCheckedNum(int i) {
        if (this.LL) {
            if (i != Integer.MIN_VALUE && i <= 0) {
                throw new IllegalArgumentException("checked num can't be negative.");
            }
            this.LLILLL = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
    }

    public void setCountable(boolean z) {
        this.LL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.LLJIJIL != z) {
            this.LLJIJIL = z;
            invalidate();
        }
    }

    public C418950Gbl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJIJIL = true;
        this.LLJ = context.getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        this.LLILZ = paint;
        paint.setAntiAlias(true);
        this.LLILZ.setStyle(Paint.Style.STROKE);
        this.LLILZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.LLILZ.setStrokeWidth(this.LLJ * 3.0f);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.bz5});
        int color = typedArrayObtainStyledAttributes.getColor(0, C420650GeV.LIZ(getResources(), R.color.aco, getContext().getTheme()));
        typedArrayObtainStyledAttributes.recycle();
        this.LLILZ.setColor(color);
        this.LLIZLLLIL = C420660GeW.LIZ(context.getResources(), 2130971715, context.getTheme());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (this.LLJ * 48.0f), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
