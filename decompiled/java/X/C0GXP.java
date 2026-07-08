package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GXP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXP extends ReplacementSpan {
    public int LL;
    public int LLILLJJLI;
    public Rect LLILLL;
    public final int LLILZ;
    public final Paint.FontMetricsInt LLILZIL = new Paint.FontMetricsInt();
    public final C0GXQ LLILZLL;
    public final C0ZIH LLIZ;

    public final void LIZIZ() {
        C0GXQ c0gxq = this.LLILZLL;
        Rect bounds = c0gxq != null ? c0gxq.getBounds() : null;
        this.LLILLL = bounds;
        this.LL = bounds != null ? bounds.width() : 0;
        Rect rect = this.LLILLL;
        this.LLILLJJLI = rect != null ? rect.height() : 0;
    }

    public final int LIZ(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1 || i != 2) {
                int i2 = this.LLILLJJLI;
                return -i2;
            }
            int i3 = fontMetricsInt.descent;
            int i4 = fontMetricsInt.ascent;
            return i4 + (((i3 - i4) - this.LLILLJJLI) / 2);
        }
        return fontMetricsInt.descent - this.LLILLJJLI;
    }

    public C0GXP(Context context, C0ZIH c0zih) {
        this.LLIZ = c0zih;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxSpinner, R.attr.yt, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSpinner_tux_icon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSpinner_tux_tintColor, 0);
        C0GXQ c0gxq = new C0GXQ(context, resourceId);
        c0gxq.LJFF(color);
        c0gxq.setBounds(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
        this.LLILZLL = c0gxq;
        this.LLILZ = 2;
        LIZIZ();
        c0zih.setLayerType(1, c0zih.getPaint());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        valueAnimatorOfFloat.setDuration(1000L).setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 101));
        c0gxq.setAlpha(255);
        valueAnimatorOfFloat.start();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        LIZIZ();
        if (fontMetricsInt == null) {
            return this.LL;
        }
        int iLIZ = LIZ(fontMetricsInt);
        int i3 = this.LLILLJJLI + iLIZ;
        if (iLIZ < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = iLIZ;
        }
        if (iLIZ < fontMetricsInt.top) {
            fontMetricsInt.top = iLIZ;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
        return this.LL;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iLIZ;
        paint.getFontMetricsInt(this.LLILZIL);
        if (this.LLILZ == 2) {
            iLIZ = ((i5 + i3) - this.LLILLJJLI) / 2;
        } else {
            iLIZ = i4 + LIZ(this.LLILZIL);
        }
        float f2 = f + 0;
        float f3 = iLIZ;
        canvas.translate(f2, f3);
        C0GXQ c0gxq = this.LLILZLL;
        if (c0gxq != null) {
            c0gxq.draw(canvas);
        }
        canvas.translate(-f2, -f3);
    }
}
