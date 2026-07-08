package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0ksU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336280ksU extends C1322110kVd {
    public final Matrix LL;
    public int LLILLJJLI;
    public final PointF LLILLL;
    public final PointF LLILZ;
    public float LLILZIL;
    public ValueAnimator LLILZLL;
    public final GestureDetector LLIZ;

    private final float getOuterScale() {
        float[] fArr = new float[9];
        this.LL.getValues(fArr);
        return fArr[0];
    }

    public final void LIZJ() {
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZLL = null;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        LIZJ();
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final void LIZ(Matrix matrix) {
        LIZJ();
        final float[] fArr = new float[9];
        final float[] fArr2 = new float[9];
        final float[] fArr3 = new float[9];
        this.LL.getValues(fArr);
        matrix.getValues(fArr2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ksW
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i = 0;
                do {
                    float[] fArr4 = fArr3;
                    float f = fArr[i];
                    fArr4[i] = f + ((fArr2[i] - f) * animatedFraction);
                    i++;
                } while (i < 9);
                this.LL.setValues(fArr3);
                this.invalidate();
            }
        });
        valueAnimatorOfFloat.start();
        this.LLILZLL = valueAnimatorOfFloat;
    }

    public final boolean LJI(RectF rectF) {
        rectF.setEmpty();
        C1331070kk5 hierarchy = getHierarchy();
        if (hierarchy == null) {
            return false;
        }
        hierarchy.LJIIJ(rectF);
        return !rectF.isEmpty();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLILLJJLI == 2) {
            return true;
        }
        RectF rectF = new RectF();
        if (LJI(rectF)) {
            this.LL.mapRect(rectF);
            if (!rectF.isEmpty()) {
                if (i > 0) {
                    if (rectF.right > getWidth()) {
                        return true;
                    }
                    return false;
                }
                if (rectF.left < 0.0f) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLILLJJLI == 2) {
            return true;
        }
        RectF rectF = new RectF();
        if (LJI(rectF)) {
            this.LL.mapRect(rectF);
            if (!rectF.isEmpty()) {
                if (i > 0) {
                    if (rectF.bottom > getHeight()) {
                        return true;
                    }
                    return false;
                }
                if (rectF.top < 0.0f) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            canvas.concat(this.LL);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f4  */
    @Override // X.C1322090kVb, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1336280ksU.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C1336280ksU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZLLL(float f, float f2) {
        float f3;
        float outerScale = getOuterScale();
        if (outerScale < 1.0E-4f) {
            outerScale = 1.0E-4f;
        }
        float f4 = 4.0f;
        if (outerScale >= 4.0f) {
            f4 = 1.0f;
        }
        float width = getWidth();
        float height = getHeight();
        Matrix matrix = new Matrix(this.LL);
        float f5 = f4 / outerScale;
        matrix.postScale(f5, f5, f, f2);
        float f6 = width / 2.0f;
        float f7 = height / 2.0f;
        matrix.postTranslate(f6 - f, f7 - f2);
        RectF rectF = new RectF();
        if (!LJI(rectF)) {
            return;
        }
        matrix.mapRect(rectF);
        float f8 = 0.0f;
        if (rectF.width() < width) {
            f3 = f6 - ((rectF.right + rectF.left) / 2.0f);
        } else {
            float f9 = rectF.left;
            if (f9 > 0.0f) {
                f3 = 0.0f - f9;
            } else {
                float f10 = rectF.right;
                if (f10 < width) {
                    f3 = width - f10;
                } else {
                    f3 = 0.0f;
                }
            }
        }
        if (rectF.height() < height) {
            f8 = f7 - ((rectF.bottom + rectF.top) / 2.0f);
        } else {
            float f11 = rectF.top;
            if (f11 > 0.0f) {
                f8 = 0.0f - f11;
            } else {
                float f12 = rectF.bottom;
                if (f12 < height) {
                    f8 = height - f12;
                }
            }
        }
        matrix.postTranslate(f3, f8);
        LIZ(matrix);
    }

    public C1336280ksU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new Matrix();
        this.LLILLL = new PointF();
        this.LLILZ = new PointF();
        this.LLIZ = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.0ksV
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                ValueAnimator valueAnimator;
                C1336280ksU c1336280ksU = this.LL;
                if (c1336280ksU.LLILLJJLI != 1 || ((valueAnimator = c1336280ksU.LLILZLL) != null && valueAnimator.isRunning())) {
                    return true;
                }
                this.LL.LIZLLL(motionEvent.getX(), motionEvent.getY());
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                this.LL.performLongClick();
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                this.LL.performClick();
                return true;
            }
        });
    }

    public final void LJII(float f, float f2, float f3, float f4) {
        float[] fArr;
        float outerScale = getOuterScale();
        float fHypot = (float) Math.hypot(f - f3, f2 - f4);
        if (fHypot <= 0.0f) {
            return;
        }
        this.LLILZIL = outerScale / fHypot;
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        Matrix matrix = this.LL;
        Matrix matrix2 = new Matrix();
        if (!matrix.invert(matrix2)) {
            fArr = new float[]{f5, f6};
        } else {
            fArr = new float[]{f5, f6};
            matrix2.mapPoints(fArr);
        }
        this.LLILZ.set(fArr[0], fArr[1]);
    }
}
