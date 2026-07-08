package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19Ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21512819Ha extends AppCompatImageView {
    public View.OnClickListener LL;
    public View.OnLongClickListener LLILLJJLI;
    public C0Q0H LLILLL;
    public final Matrix LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public final PointF LLIZ;
    public final PointF LLIZLLLIL;
    public float LLJ;
    public C21513219He LLJI;
    public C1084990eLB LLJIJIL;
    public final GestureDetector LLJILJIL;

    private float getMinScale() {
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final void LIZ() {
        C21513219He c21513219He = this.LLJI;
        if (c21513219He != null) {
            c21513219He.cancel();
            this.LLJI = null;
        }
        C1084990eLB c1084990eLB = this.LLJIJIL;
        if (c1084990eLB != null) {
            c1084990eLB.cancel();
            this.LLJIJIL = null;
        }
    }

    public final boolean LJ() {
        return getDrawable() != null && getDrawable().getIntrinsicWidth() > 0 && getDrawable().getIntrinsicHeight() > 0 && getWidth() > 0 && getHeight() > 0;
    }

    public float getMaxScale() {
        return Math.max(LJ() ? (getWidth() / getDrawable().getIntrinsicWidth()) * 2.0f : 2.0f, 2.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final RectF LIZJ(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!LJ()) {
            return rectF;
        }
        Matrix matrixLIZJ = C21513019Hc.LIZJ();
        LIZLLL(matrixLIZJ).postConcat(this.LLILZ);
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        matrixLIZJ.mapRect(rectF);
        C21513019Hc.LIZIZ(matrixLIZJ);
        return rectF;
    }

    public final Matrix LIZLLL(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (LJ()) {
            float intrinsicWidth = getDrawable().getIntrinsicWidth();
            float intrinsicHeight = getDrawable().getIntrinsicHeight();
            C21513419Hg c21513419Hg = C21513019Hc.LIZIZ;
            RectF rectFLIZJ = c21513419Hg.LIZJ();
            rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float width = getWidth();
            float height = getHeight();
            RectF rectFLIZJ2 = c21513419Hg.LIZJ();
            rectFLIZJ2.set(0.0f, 0.0f, width, height);
            matrix.setRectToRect(rectFLIZJ, rectFLIZJ2, Matrix.ScaleToFit.CENTER);
            if (((LinkedList) c21513419Hg.LIZIZ).size() < c21513419Hg.LIZ) {
                ((LinkedList) c21513419Hg.LIZIZ).offer(rectFLIZJ2);
            }
            if (((LinkedList) c21513419Hg.LIZIZ).size() < c21513419Hg.LIZ) {
                ((LinkedList) c21513419Hg.LIZIZ).offer(rectFLIZJ);
            }
        }
        return matrix;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLILZIL == 2) {
            return true;
        }
        RectF rectFLIZJ = LIZJ(null);
        if (rectFLIZJ.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (rectFLIZJ.right > getWidth()) {
                return true;
            }
            return false;
        }
        if (rectFLIZJ.left < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLILZIL == 2) {
            return true;
        }
        RectF rectFLIZJ = LIZJ(null);
        if (rectFLIZJ.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (rectFLIZJ.bottom > getHeight()) {
                return true;
            }
            return false;
        }
        if (rectFLIZJ.top < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            if (LJ()) {
                Matrix matrixLIZJ = C21513019Hc.LIZJ();
                Matrix matrixLIZLLL = LIZLLL(matrixLIZJ);
                matrixLIZLLL.postConcat(this.LLILZ);
                setImageMatrix(matrixLIZLLL);
                C21513019Hc.LIZIZ(matrixLIZJ);
            }
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0243  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21512819Ha.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setImagePinchListener(C0Q0H c0q0h) {
        this.LLILLL = c0q0h;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LL = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLILLJJLI = onLongClickListener;
    }

    public C21512819Ha(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = new Matrix();
        this.LLILZIL = 0;
        this.LLILZLL = 1.0f;
        this.LLIZ = new PointF();
        this.LLIZLLLIL = new PointF();
        this.LLJ = 0.0f;
        this.LLJILJIL = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.19Hb
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                float maxScale;
                float f;
                C21512819Ha c21512819Ha = this.LL;
                if (c21512819Ha.LLILZIL == 1) {
                    C21513219He c21513219He = c21512819Ha.LLJI;
                    if (c21513219He == null || !c21513219He.isRunning()) {
                        C21512819Ha c21512819Ha2 = this.LL;
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (c21512819Ha2.LJ()) {
                            Matrix matrixLIZJ = C21513019Hc.LIZJ();
                            c21512819Ha2.LIZLLL(matrixLIZJ);
                            float f2 = C21513019Hc.LIZ(matrixLIZJ)[0];
                            float f3 = C21513019Hc.LIZ(c21512819Ha2.LLILZ)[0] * f2;
                            float width = c21512819Ha2.getWidth();
                            float height = c21512819Ha2.getHeight();
                            float width2 = c21512819Ha2.getWidth();
                            float height2 = c21512819Ha2.getHeight();
                            float maxScale2 = c21512819Ha2.getMaxScale();
                            if (f3 < c21512819Ha2.getMaxScale()) {
                                maxScale = c21512819Ha2.getMaxScale();
                            } else {
                                maxScale = f2;
                            }
                            if (maxScale <= maxScale2) {
                                maxScale2 = maxScale;
                            }
                            if (maxScale2 >= f2) {
                                f2 = maxScale2;
                            }
                            Matrix matrixLIZLLL = C21513019Hc.LIZLLL(c21512819Ha2.LLILZ);
                            float f4 = f2 / f3;
                            matrixLIZLLL.postScale(f4, f4, x, y);
                            float f5 = width2 / 2.0f;
                            float f6 = height2 / 2.0f;
                            matrixLIZLLL.postTranslate(f5 - x, f6 - y);
                            Matrix matrixLIZLLL2 = C21513019Hc.LIZLLL(matrixLIZJ);
                            matrixLIZLLL2.postConcat(matrixLIZLLL);
                            float intrinsicWidth = c21512819Ha2.getDrawable().getIntrinsicWidth();
                            float intrinsicHeight = c21512819Ha2.getDrawable().getIntrinsicHeight();
                            C21513419Hg c21513419Hg = C21513019Hc.LIZIZ;
                            RectF rectFLIZJ = c21513419Hg.LIZJ();
                            float f7 = 0.0f;
                            rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                            matrixLIZLLL2.mapRect(rectFLIZJ);
                            float f8 = rectFLIZJ.right;
                            float f9 = rectFLIZJ.left;
                            if (f8 - f9 < width2) {
                                f = f5 - ((f8 + f9) / 2.0f);
                            } else if (f9 > 0.0f) {
                                f = 0.0f - f9;
                            } else if (f8 < width) {
                                f = width - f8;
                            } else {
                                f = 0.0f;
                            }
                            float f10 = rectFLIZJ.bottom;
                            float f11 = rectFLIZJ.top;
                            if (f10 - f11 < height2) {
                                f7 = f6 - ((f10 + f11) / 2.0f);
                            } else if (f11 > 0.0f) {
                                f7 = 0.0f - f11;
                            } else if (f10 < height) {
                                f7 = height - f10;
                            }
                            matrixLIZLLL.postTranslate(f, f7);
                            c21512819Ha2.LIZ();
                            C21513219He c21513219He2 = new C21513219He(c21512819Ha2, c21512819Ha2.LLILZ, matrixLIZLLL);
                            c21512819Ha2.LLJI = c21513219He2;
                            c21513219He2.start();
                            if (((LinkedList) c21513419Hg.LIZIZ).size() < c21513419Hg.LIZ) {
                                ((LinkedList) c21513419Hg.LIZIZ).offer(rectFLIZJ);
                            }
                            C21513019Hc.LIZIZ(matrixLIZLLL2);
                            C21513019Hc.LIZIZ(matrixLIZLLL);
                            C21513019Hc.LIZIZ(matrixLIZJ);
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C21512819Ha c21512819Ha = this.LL;
                View.OnLongClickListener onLongClickListener = c21512819Ha.LLILLJJLI;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(c21512819Ha);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C21512819Ha c21512819Ha = this.LL;
                View.OnClickListener onClickListener = c21512819Ha.LL;
                if (onClickListener != null) {
                    onClickListener.onClick(c21512819Ha);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C21512819Ha c21512819Ha = this.LL;
                if (c21512819Ha.LLILZIL == 0) {
                    C21513219He c21513219He = c21512819Ha.LLJI;
                    if (c21513219He == null || !c21513219He.isRunning()) {
                        C21512819Ha c21512819Ha2 = this.LL;
                        if (c21512819Ha2.LJ()) {
                            c21512819Ha2.LIZ();
                            C1084990eLB c1084990eLB = new C1084990eLB(c21512819Ha2, f / 60.0f, f2 / 60.0f);
                            c21512819Ha2.LLJIJIL = c1084990eLB;
                            c1084990eLB.start();
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(float r11, float r12) {
        /*
            r10 = this;
            boolean r0 = r10.LJ()
            r9 = 0
            if (r0 != 0) goto L8
            return r9
        L8:
            X.19Hg r2 = X.C21513019Hc.LIZIZ
            java.lang.Object r1 = r2.LIZJ()
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            r10.LIZJ(r1)
            int r0 = r10.getWidth()
            float r5 = (float) r0
            int r0 = r10.getHeight()
            float r3 = (float) r0
            int r0 = r10.getWidth()
            float r7 = (float) r0
            int r0 = r10.getHeight()
            float r6 = (float) r0
            float r4 = r1.right
            float r8 = r1.left
            float r0 = r4 - r8
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r7 = 0
            if (r0 < 0) goto L95
            float r0 = r8 + r11
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L88
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 >= 0) goto L95
            float r11 = r7 - r8
        L3e:
            float r5 = r1.bottom
            float r4 = r1.top
            float r0 = r5 - r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L86
            float r0 = r4 + r12
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L79
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L86
            float r12 = r7 - r4
        L54:
            java.util.Queue<T> r0 = r2.LIZIZ
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r3 = r0.size()
            int r0 = r2.LIZ
            if (r3 >= r0) goto L67
            java.util.Queue<T> r0 = r2.LIZIZ
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.offer(r1)
        L67:
            android.graphics.Matrix r0 = r10.LLILZ
            r0.postTranslate(r11, r12)
            r10.invalidate()
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 != 0) goto L77
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 == 0) goto L78
        L77:
            r9 = 1
        L78:
            return r9
        L79:
            float r0 = r5 + r12
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L54
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L86
            float r12 = r3 - r5
            goto L54
        L86:
            r12 = 0
            goto L54
        L88:
            float r0 = r4 + r11
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L3e
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L95
            float r11 = r5 - r4
            goto L3e
        L95:
            r11 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21512819Ha.LJI(float, float):boolean");
    }

    public final void LJFF(float f, float f2, float f3, float f4) {
        float[] fArr;
        float f5 = f - f3;
        float f6 = f2 - f4;
        this.LLJ = C21513019Hc.LIZ(this.LLILZ)[0] / ((float) Math.sqrt((f5 * f5) + (f6 * f6)));
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LLILZ;
        if (matrix != null) {
            fArr = new float[2];
            Matrix matrixLIZJ = C21513019Hc.LIZJ();
            matrix.invert(matrixLIZJ);
            matrixLIZJ.mapPoints(fArr, fArr2);
            C21513019Hc.LIZIZ(matrixLIZJ);
        } else {
            fArr = new float[2];
        }
        this.LLIZLLLIL.set(fArr[0], fArr[1]);
    }
}
