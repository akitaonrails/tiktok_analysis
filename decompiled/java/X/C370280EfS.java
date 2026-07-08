package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370280EfS extends FrameLayout {
    public final C1295960jpS LL;
    public Animator LLILLJJLI;

    public final void LIZ() {
        this.LL.cancelAnimation();
        this.LL.setProgress(0.0f);
        C786410Ut5.LLD(4, this.LL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Animator animator = this.LLILLJJLI;
        if (animator != null) {
            animator.cancel();
        }
        this.LLILLJJLI = null;
        LIZ();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(1.0f);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        super.onDetachedFromWindow();
    }

    public C370280EfS(final Context context) {
        super(context, null, 0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        addView(new View(context) { // from class: X.0EfR
            public final float LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            public final float LLILLJJLI;
            public final RectF LLILLL;
            public final RectF LLILZ;
            public final Path LLILZIL;
            public final Paint LLILZLL;
            public final Paint LLIZ;

            {
                float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.5d)));
                this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                this.LLILLL = new RectF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(r8)));
                this.LLILZ = new RectF(0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(r8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                Path path = new Path();
                float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(17.75d)));
                Double dValueOf = Double.valueOf(1.75d);
                path.moveTo(fLIZIZ2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
                path.lineTo(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(10.25d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
                float fLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
                float fLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
                Double dValueOf2 = Double.valueOf(18.75d);
                path.arcTo(new RectF(fLIZIZ3, fLIZIZ4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf2))), -90.0f, -90.0f, false);
                path.lineTo(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(r10)));
                this.LLILZIL = path;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(-1);
                paint.setStrokeWidth(fLIZIZ);
                paint.setStrokeCap(Paint.Cap.BUTT);
                paint.setStrokeJoin(Paint.Join.ROUND);
                this.LLILZLL = paint;
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(-1);
                this.LLIZ = paint2;
            }

            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                LIZ(canvas, 0.0f, 0.0f, 0.0f);
                LIZ(canvas, getWidth() - this.LL, 0.0f, 90.0f);
                LIZ(canvas, getWidth() - this.LL, getHeight() - this.LL, 180.0f);
                LIZ(canvas, 0.0f, getHeight() - this.LL, 270.0f);
            }

            public final void LIZ(Canvas canvas, float f, float f2, float f3) {
                canvas.save();
                canvas.translate(f, f2);
                float f4 = this.LL;
                canvas.rotate(f3, f4 / 2.0f, f4 / 2.0f);
                canvas.drawPath(this.LLILZIL, this.LLILZLL);
                RectF rectF = this.LLILLL;
                float f5 = this.LLILLJJLI;
                canvas.drawRoundRect(rectF, f5, f5, this.LLIZ);
                RectF rectF2 = this.LLILZ;
                float f6 = this.LLILLJJLI;
                canvas.drawRoundRect(rectF2, f6, f6, this.LLIZ);
                canvas.restore();
            }
        }, new FrameLayout.LayoutParams(-1, -1));
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.setRepeatCount(-1);
        c1295960jpS.setAnimation(R.raw.tux_lottie_common_search_scan_light);
        C786410Ut5.LLD(4, c1295960jpS);
        this.LL = c1295960jpS;
        addView(c1295960jpS, new FrameLayout.LayoutParams(-1, -1));
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }
}
