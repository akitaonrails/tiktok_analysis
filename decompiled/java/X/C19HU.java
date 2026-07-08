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

/* JADX INFO: renamed from: X.19HU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19HU extends AppCompatImageView {
    public View.OnClickListener LL;
    public View.OnLongClickListener LLILLJJLI;
    public final Matrix LLILLL;
    public int LLILZ;
    public final PointF LLILZIL;
    public final PointF LLILZLL;
    public float LLIZ;
    public C19727512Gj LLIZLLLIL;
    public C1084970eL9 LLJ;
    public final GestureDetector LLJI;

    private float getMinScale() {
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final void LIZ() {
        C19727512Gj c19727512Gj = this.LLIZLLLIL;
        if (c19727512Gj != null) {
            c19727512Gj.cancel();
            this.LLIZLLLIL = null;
        }
        C1084970eL9 c1084970eL9 = this.LLJ;
        if (c1084970eL9 != null) {
            c1084970eL9.cancel();
            this.LLJ = null;
        }
    }

    public final boolean LJ() {
        return getDrawable() != null && getDrawable().getIntrinsicWidth() > 0 && getDrawable().getIntrinsicHeight() > 0 && getWidth() > 0 && getHeight() > 0;
    }

    public float getMaxScale() {
        float f;
        float height;
        int intrinsicHeight;
        if (LJ()) {
            if (getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight() < getWidth() / getHeight()) {
                height = getWidth();
                intrinsicHeight = getDrawable().getIntrinsicWidth();
            } else {
                height = getHeight();
                intrinsicHeight = getDrawable().getIntrinsicHeight();
            }
            f = height / intrinsicHeight;
        } else {
            f = 4.0f;
        }
        return Math.max(f, 4.0f);
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
        Matrix matrixLIZJ = C19HW.LIZJ();
        LIZLLL(matrixLIZJ).postConcat(this.LLILLL);
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        matrixLIZJ.mapRect(rectF);
        C19HW.LIZIZ(matrixLIZJ);
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
            C19HZ c19hz = C19HW.LIZIZ;
            RectF rectFLIZJ = c19hz.LIZJ();
            rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float width = getWidth();
            float height = getHeight();
            RectF rectFLIZJ2 = c19hz.LIZJ();
            rectFLIZJ2.set(0.0f, 0.0f, width, height);
            matrix.setRectToRect(rectFLIZJ, rectFLIZJ2, Matrix.ScaleToFit.CENTER);
            if (((LinkedList) c19hz.LIZIZ).size() < c19hz.LIZ) {
                ((LinkedList) c19hz.LIZIZ).offer(rectFLIZJ2);
            }
            if (((LinkedList) c19hz.LIZIZ).size() < c19hz.LIZ) {
                ((LinkedList) c19hz.LIZIZ).offer(rectFLIZJ);
            }
        }
        return matrix;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLILZ == 2) {
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
        if (this.LLILZ == 2) {
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
                Matrix matrixLIZJ = C19HW.LIZJ();
                Matrix matrixLIZLLL = LIZLLL(matrixLIZJ);
                matrixLIZLLL.postConcat(this.LLILLL);
                setImageMatrix(matrixLIZLLL);
                C19HW.LIZIZ(matrixLIZJ);
            }
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0232  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19HU.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LL = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLILLJJLI = onLongClickListener;
    }

    public C19HU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = new Matrix();
        this.LLILZ = 0;
        this.LLILZIL = new PointF();
        this.LLILZLL = new PointF();
        this.LLIZ = 0.0f;
        this.LLJI = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.19HV
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                float maxScale;
                float f;
                C19HU c19hu = this.LL;
                if (c19hu.LLILZ == 1) {
                    C19727512Gj c19727512Gj = c19hu.LLIZLLLIL;
                    if (c19727512Gj == null || !c19727512Gj.isRunning()) {
                        C19HU c19hu2 = this.LL;
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (c19hu2.LJ()) {
                            Matrix matrixLIZJ = C19HW.LIZJ();
                            c19hu2.LIZLLL(matrixLIZJ);
                            float f2 = C19HW.LIZ(matrixLIZJ)[0];
                            float f3 = C19HW.LIZ(c19hu2.LLILLL)[0] * f2;
                            float width = c19hu2.getWidth();
                            float height = c19hu2.getHeight();
                            float width2 = c19hu2.getWidth();
                            float height2 = c19hu2.getHeight();
                            float maxScale2 = c19hu2.getMaxScale();
                            if (f3 < c19hu2.getMaxScale()) {
                                maxScale = c19hu2.getMaxScale();
                            } else {
                                maxScale = f2;
                            }
                            if (maxScale <= maxScale2) {
                                maxScale2 = maxScale;
                            }
                            if (maxScale2 >= f2) {
                                f2 = maxScale2;
                            }
                            Matrix matrixLIZLLL = C19HW.LIZLLL(c19hu2.LLILLL);
                            float f4 = f2 / f3;
                            matrixLIZLLL.postScale(f4, f4, x, y);
                            float f5 = width2 / 2.0f;
                            float f6 = height2 / 2.0f;
                            matrixLIZLLL.postTranslate(f5 - x, f6 - y);
                            Matrix matrixLIZLLL2 = C19HW.LIZLLL(matrixLIZJ);
                            matrixLIZLLL2.postConcat(matrixLIZLLL);
                            float intrinsicWidth = c19hu2.getDrawable().getIntrinsicWidth();
                            float intrinsicHeight = c19hu2.getDrawable().getIntrinsicHeight();
                            C19HZ c19hz = C19HW.LIZIZ;
                            RectF rectFLIZJ = c19hz.LIZJ();
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
                            c19hu2.LIZ();
                            C19727512Gj c19727512Gj2 = new C19727512Gj(c19hu2, c19hu2.LLILLL, matrixLIZLLL);
                            c19hu2.LLIZLLLIL = c19727512Gj2;
                            c19727512Gj2.start();
                            if (((LinkedList) c19hz.LIZIZ).size() < c19hz.LIZ) {
                                ((LinkedList) c19hz.LIZIZ).offer(rectFLIZJ);
                            }
                            C19HW.LIZIZ(matrixLIZLLL2);
                            C19HW.LIZIZ(matrixLIZLLL);
                            C19HW.LIZIZ(matrixLIZJ);
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
                C19HU c19hu = this.LL;
                View.OnLongClickListener onLongClickListener = c19hu.LLILLJJLI;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(c19hu);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C19HU c19hu = this.LL;
                View.OnClickListener onClickListener = c19hu.LL;
                if (onClickListener != null) {
                    onClickListener.onClick(c19hu);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C19HU c19hu = this.LL;
                if (c19hu.LLILZ == 0) {
                    C19727512Gj c19727512Gj = c19hu.LLIZLLLIL;
                    if (c19727512Gj == null || !c19727512Gj.isRunning()) {
                        C19HU c19hu2 = this.LL;
                        if (c19hu2.LJ()) {
                            c19hu2.LIZ();
                            C1084970eL9 c1084970eL9 = new C1084970eL9(c19hu2, f / 60.0f, f2 / 60.0f);
                            c19hu2.LLJ = c1084970eL9;
                            c1084970eL9.start();
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
            X.19HZ r2 = X.C19HW.LIZIZ
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
            android.graphics.Matrix r0 = r10.LLILLL
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
        throw new UnsupportedOperationException("Method not decompiled: X.C19HU.LJI(float, float):boolean");
    }

    public final void LJFF(float f, float f2, float f3, float f4) {
        float[] fArr;
        float f5 = f - f3;
        float f6 = f2 - f4;
        this.LLIZ = C19HW.LIZ(this.LLILLL)[0] / ((float) Math.sqrt((f5 * f5) + (f6 * f6)));
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LLILLL;
        if (matrix != null) {
            fArr = new float[2];
            Matrix matrixLIZJ = C19HW.LIZJ();
            matrix.invert(matrixLIZJ);
            matrixLIZJ.mapPoints(fArr, fArr2);
            C19HW.LIZIZ(matrixLIZJ);
        } else {
            fArr = new float[2];
        }
        this.LLILZLL.set(fArr[0], fArr[1]);
    }
}
