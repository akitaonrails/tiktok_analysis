package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417330GXz extends FrameLayout {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final TuxTextView LL;
    public final float LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public EnumC428920Grq LLILZLL;
    public int[] LLIZ;
    public final float[] LLIZLLLIL;
    public boolean LLJ;
    public float LLJI;
    public float LLJIJIL;
    public final int LLJILJIL;

    public C417330GXz(Context context) {
        super(context, null, 0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LL = tuxTextView;
        float f = getResources().getDisplayMetrics().density;
        this.LLILLJJLI = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f * f);
        this.LLILZ = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.LLILZIL = paint3;
        EnumC428920Grq enumC428920Grq = EnumC428920Grq.HIGH_CONTRAST;
        this.LLILZLL = enumC428920Grq;
        this.LLIZ = new int[]{-1, -1, -1};
        this.LLIZLLLIL = new float[]{0.0f, 0.744f, 1.0f};
        this.LLJ = true;
        this.LLJI = 5.0f * f;
        this.LLJIJIL = 2.0f * f;
        this.LLJILJIL = 637534208;
        setLayerType(1, null);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        setPaddingRelative((int) (20.0f * f), (int) (15.0f * f), (int) (19.0f * f), (int) (16.0f * f));
        setMinimumHeight((int) (((2 * 10.0f) + 28.0f) * f));
        tuxTextView.setTuxFont(61);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setIncludeFontPadding(false);
        addView(tuxTextView, new FrameLayout.LayoutParams(-2, -2, 8388627));
        LIZ(enumC428920Grq);
    }

    public final void LIZ(EnumC428920Grq enumC428920Grq) {
        int iIntValue;
        int iIntValue2;
        this.LLILZLL = enumC428920Grq;
        int i = C0GY1.LIZ[enumC428920Grq.ordinal()];
        int iIntValue3 = -1;
        if (i != 1) {
            if (i == 2) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.im, getContext());
                if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                } else {
                    iIntValue2 = 0;
                }
                this.LLIZ = new int[]{iIntValue2, iIntValue2, iIntValue2};
                this.LLJ = false;
                this.LLJI = 0.0f;
                this.LLJIJIL = 0.0f;
                TuxTextView tuxTextView = this.LL;
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, getContext());
                if (numLIZJ2 != null) {
                    iIntValue3 = numLIZJ2.intValue();
                }
                tuxTextView.setTextColor(iIntValue3);
            } else {
                throw new C1954807lC();
            }
        } else {
            float f = 255;
            int i2 = (int) (0.79f * f);
            this.LLIZ = new int[]{Color.argb((int) (0.9f * f), 255, 255, 255), Color.argb(i2, 255, 255, 255), Color.argb(i2, 255, 255, 255)};
            this.LLILZ.setColor(-1);
            this.LLJ = true;
            float f2 = this.LLILLJJLI;
            this.LLJI = 8.0f * f2;
            this.LLJIJIL = f2 * 2.0f;
            TuxTextView tuxTextView2 = this.LL;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            } else {
                iIntValue = -16777216;
            }
            tuxTextView2.setTextColor(iIntValue);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        LinearGradient linearGradient;
        float width = getWidth();
        float height = getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f = this.LLILLJJLI;
            float f2 = f * 10.0f;
            float f3 = width - f2;
            float f4 = height - f2;
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            Path pathLIZ = C415670GRp.LIZ(f2, f2, f3, f4, f, z);
            if (this.LLJI >= 1.0f) {
                this.LLILZIL.setColor(this.LLJILJIL);
                this.LLILZIL.setMaskFilter(new BlurMaskFilter(this.LLJI, BlurMaskFilter.Blur.NORMAL));
                canvas.save();
                canvas.translate(0.0f, this.LLJIJIL);
                canvas.drawPath(pathLIZ, this.LLILZIL);
                canvas.restore();
            }
            Paint paint = this.LLILLL;
            if (this.LLILZLL == EnumC428920Grq.HIGH_CONTRAST) {
                float f5 = height / 2.0f;
                linearGradient = new LinearGradient(f2, f5, f3, f5, this.LLIZ, this.LLIZLLLIL, Shader.TileMode.CLAMP);
            } else {
                linearGradient = null;
            }
            paint.setShader(linearGradient);
            if (this.LLILLL.getShader() == null) {
                this.LLILLL.setColor(this.LLIZ[0]);
            }
            canvas.drawPath(pathLIZ, this.LLILLL);
            if (this.LLJ) {
                canvas.drawPath(pathLIZ, this.LLILZ);
            }
            super.onDraw(canvas);
        }
    }

    public final void setText(CharSequence charSequence) {
        LIZIZ(charSequence, false, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) (this.LLILLJJLI * 48.0f);
        if (getMeasuredHeight() < i3) {
            setMeasuredDimension(getMeasuredWidth(), i3);
        }
    }

    public final void LIZIZ(CharSequence charSequence, boolean z, boolean z2) {
        int i;
        String string;
        int i2;
        if (z2) {
            i = 62;
        } else {
            i = 61;
        }
        float f = this.LLILLJJLI * 141.0f;
        if (!z) {
            this.LL.setTuxFont(i);
            this.LL.setMaxLines(1);
            this.LL.setMaxWidth(Integer.MAX_VALUE);
        } else {
            this.LL.setTuxFont(i);
            TextPaint paint = this.LL.getPaint();
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            if (paint.measureText(string) <= f) {
                this.LL.setMaxLines(1);
                this.LL.setMaxWidth(Integer.MAX_VALUE);
            } else {
                TuxTextView tuxTextView = this.LL;
                if (z2) {
                    i2 = 82;
                } else {
                    i2 = 81;
                }
                tuxTextView.setTuxFont(i2);
                this.LL.setMaxLines(2);
                this.LL.setMaxWidth((int) f);
            }
        }
        this.LL.setEllipsize(TextUtils.TruncateAt.END);
        this.LL.setText(charSequence);
        requestLayout();
        invalidate();
    }
}
