package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0GY4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GY4 extends FrameLayout {
    public Function0<Unit> LL;
    public final float LLILLJJLI;
    public final ImageView LLILLL;
    public final TuxTextView LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public final Paint LLIZ;
    public EnumC428920Grq LLIZLLLIL;
    public int[] LLJ;
    public final float[] LLJI;
    public boolean LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public final int LLJILLL;

    public final Function0<Unit> getOnTap() {
        return this.LL;
    }

    public C0GY4(Context context) {
        super(context, null, 0);
        float f = getResources().getDisplayMetrics().density;
        this.LLILLJJLI = f;
        ImageView imageView = new ImageView(context);
        this.LLILLL = imageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILZ = tuxTextView;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LLILZIL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f * f);
        this.LLILZLL = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.LLIZ = paint3;
        EnumC428920Grq enumC428920Grq = EnumC428920Grq.HIGH_CONTRAST;
        this.LLIZLLLIL = enumC428920Grq;
        this.LLJ = new int[]{-1, -1, -1};
        this.LLJI = new float[]{0.0f, 0.519f, 1.0f};
        this.LLJIJIL = true;
        this.LLJILJIL = 5.0f * f;
        this.LLJILJILJ = 2.0f * f;
        this.LLJILLL = 637534208;
        setLayerType(1, null);
        setWillNotDraw(false);
        setClipChildren(false);
        int i = (int) (14.0f * f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i, 8388627);
        layoutParams.setMarginStart((int) (20.0f * f));
        addView(imageView, layoutParams);
        tuxTextView.setTuxFont(62);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setText(context.getString(2131846405));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388627);
        layoutParams2.setMarginStart((int) (38.0f * f));
        layoutParams2.setMarginEnd((int) (21.0f * f));
        addView(tuxTextView, layoutParams2);
        setMinimumHeight((int) (((2 * 10.0f) + 28.0f) * f));
        LIZ(enumC428920Grq);
        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(this, 145);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS141S0100000_6) : aCListenerS141S0100000_6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    private final void setIcon(int i) {
        int i2 = (int) (this.LLILLJJLI * 14.0f);
        ImageView imageView = this.LLILLL;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_pen_fill;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        c419910GdJ.LIZLLL = Integer.valueOf(i);
        imageView.setImageDrawable(c419910GdJ.LIZ(getContext()));
    }

    public final void LIZ(EnumC428920Grq enumC428920Grq) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.LLIZLLLIL = enumC428920Grq;
        int i = C0GY2.LIZ[enumC428920Grq.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.im, getContext());
                if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                } else {
                    iIntValue2 = 0;
                }
                this.LLJ = new int[]{iIntValue2, iIntValue2, iIntValue2};
                this.LLJIJIL = false;
                this.LLJILJIL = 0.0f;
                this.LLJILJILJ = 0.0f;
                TuxTextView tuxTextView = this.LLILZ;
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0w, getContext());
                if (numLIZJ2 != null) {
                    iIntValue3 = numLIZJ2.intValue();
                } else {
                    iIntValue3 = -1;
                }
                tuxTextView.setTextColor(iIntValue3);
                setIcon(-1);
            } else {
                throw new C1954807lC();
            }
        } else {
            float f = 255;
            this.LLJ = new int[]{Color.argb((int) (0.9f * f), 255, 255, 255), Color.argb((int) (0.79f * f), 255, 255, 255), Color.argb((int) (0.76f * f), 255, 255, 255)};
            this.LLILZLL.setColor(-1);
            this.LLJIJIL = true;
            float f2 = this.LLILLJJLI;
            this.LLJILJIL = 5.0f * f2;
            this.LLJILJILJ = f2 * 2.0f;
            TuxTextView tuxTextView2 = this.LLILZ;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1j, getContext());
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            } else {
                iIntValue = -16777216;
            }
            tuxTextView2.setTextColor(iIntValue);
            setIcon(-16777216);
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
            if (this.LLJILJIL >= 1.0f) {
                this.LLIZ.setColor(this.LLJILLL);
                this.LLIZ.setMaskFilter(new BlurMaskFilter(this.LLJILJIL, BlurMaskFilter.Blur.NORMAL));
                canvas.save();
                canvas.translate(0.0f, this.LLJILJILJ);
                canvas.drawPath(pathLIZ, this.LLIZ);
                canvas.restore();
            }
            Paint paint = this.LLILZIL;
            if (this.LLIZLLLIL == EnumC428920Grq.HIGH_CONTRAST) {
                float f5 = height / 2.0f;
                linearGradient = new LinearGradient(f2, f5, f3, f5, this.LLJ, this.LLJI, Shader.TileMode.CLAMP);
            } else {
                linearGradient = null;
            }
            paint.setShader(linearGradient);
            if (this.LLILZIL.getShader() == null) {
                this.LLILZIL.setColor(this.LLJ[0]);
            }
            canvas.drawPath(pathLIZ, this.LLILZIL);
            if (this.LLJIJIL) {
                canvas.drawPath(pathLIZ, this.LLILZLL);
            }
            super.onDraw(canvas);
        }
    }

    public final void setOnTap(Function0<Unit> function0) {
        this.LL = function0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) (this.LLILLJJLI * 48.0f);
        if (getMeasuredHeight() < i3) {
            setMeasuredDimension(getMeasuredWidth(), i3);
        }
    }
}
