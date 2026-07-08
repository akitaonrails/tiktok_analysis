package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19Sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21543019Sq extends View {
    public ValueAnimator LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public final int LLILZLL;
    public final List<InterfaceC21542819So> LLIZ;
    public final int LLIZLLLIL;
    public final float LLJ;
    public final Paint LLJI;
    public final RectF LLJIJIL;
    public final int LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;
    public InterfaceC21543219Ss LLJJ;
    public double LLJJI;
    public int LLJJIII;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.LLJJIII * ((float) Math.cos(this.LLJJI))) + width;
        float f = height;
        float fSin = (this.LLJJIII * ((float) Math.sin(this.LLJJI))) + f;
        this.LLJI.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.LLIZLLLIL, this.LLJI);
        double dSin = Math.sin(this.LLJJI);
        double dCos = Math.cos(this.LLJJI);
        this.LLJI.setStrokeWidth(this.LLJILJIL);
        canvas.drawLine(width, f, r5 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.LLJI);
        canvas.drawCircle(width, f, this.LLJ, this.LLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21543019Sq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C21543019Sq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f3s);
        this.LLIZ = new ArrayList();
        Paint paint = new Paint();
        this.LLJI = paint;
        this.LLJIJIL = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, R.attr.f3s, R.style.a6g);
        this.LLJJIII = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_materialCircleRadius, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_selectorSize, 0);
        this.LLJILJIL = getResources().getDimensionPixelSize(R.dimen.a6g);
        this.LLJ = r1.getDimensionPixelSize(R.dimen.a6e);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        LIZIZ(0.0f, false);
        this.LLILZLL = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int LIZ(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    public final void LIZIZ(float f, boolean z) {
        ValueAnimator valueAnimator = this.LL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            LIZJ(f, false);
            return;
        }
        float f2 = this.LLJILJILJ;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.LL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.LL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19Sr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.LL.LIZJ(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        this.LL.addListener(new AnimatorListenerAdapter() { // from class: X.19Sp
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.LL.start();
    }

    public final void LIZJ(float f, boolean z) {
        float f2 = f % 360.0f;
        this.LLJILJILJ = f2;
        this.LLJJI = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.LLJJIII * ((float) Math.cos(this.LLJJI)));
        float fSin = height + (this.LLJJIII * ((float) Math.sin(this.LLJJI)));
        RectF rectF = this.LLJIJIL;
        int i = this.LLIZLLLIL;
        rectF.set(width - i, fSin - i, width + i, fSin + i);
        Iterator<InterfaceC21542819So> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LLZZJLIL(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LIZIZ(this.LLJILJILJ, false);
    }
}
