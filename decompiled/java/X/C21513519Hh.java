package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
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

/* JADX INFO: renamed from: X.19Hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21513519Hh extends AppCompatImageView {
    public boolean LL;
    public Rect LLILLJJLI;
    public C167P LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public View.OnClickListener LLILZLL;
    public View.OnLongClickListener LLIZ;
    public final Matrix LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final PointF LLJIJIL;
    public final PointF LLJILJIL;
    public float LLJILJILJ;
    public C21513719Hj LLJILLL;
    public C1843450y4V LLJJ;
    public final GestureDetector LLJJI;

    public final void LIZJ() {
    }

    public RectF getMask() {
        return null;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final void LIZ() {
        C21513719Hj c21513719Hj = this.LLJILLL;
        if (c21513719Hj != null) {
            c21513719Hj.cancel();
            this.LLJILLL = null;
        }
        C1843450y4V c1843450y4V = this.LLJJ;
        if (c1843450y4V != null) {
            c1843450y4V.cancel();
            this.LLJJ = null;
        }
    }

    public final void LJII() {
        this.LLIZLLLIL.reset();
        LIZJ();
        this.LLJ = 0;
        this.LLJIJIL.set(0.0f, 0.0f);
        this.LLJILJIL.set(0.0f, 0.0f);
        this.LLJILJILJ = 0.0f;
        LIZ();
        invalidate();
    }

    private float getMinScale() {
        if (!LJFF() || this.LLILLJJLI == null) {
            return 1.0f;
        }
        float intrinsicWidth = getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight();
        float width = getWidth() / getHeight();
        if (intrinsicWidth >= this.LLILLJJLI.width() / this.LLILLJJLI.height() && intrinsicWidth >= width) {
            return this.LLILLJJLI.height() / (getWidth() / intrinsicWidth);
        }
        return (this.LLILLJJLI.width() / getWidth()) * (getWidth() / (C21513819Hk.LIZ(LJ(null))[0] * getDrawable().getIntrinsicWidth()));
    }

    public final boolean LJFF() {
        return getDrawable() != null && getDrawable().getIntrinsicWidth() > 0 && getDrawable().getIntrinsicHeight() > 0 && getWidth() > 0 && getHeight() > 0;
    }

    public float getMaxScale() {
        float f;
        float height;
        int intrinsicHeight;
        if (LJFF()) {
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

    public int getPinchMode() {
        return this.LLJ;
    }

    public final RectF LIZLLL(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!LJFF()) {
            return rectF;
        }
        Matrix matrixLIZJ = C21513819Hk.LIZJ();
        LJ(matrixLIZJ).postConcat(this.LLIZLLLIL);
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        matrixLIZJ.mapRect(rectF);
        C21513819Hk.LIZIZ(matrixLIZJ);
        return rectF;
    }

    public final Matrix LJ(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (LJFF()) {
            float intrinsicWidth = getDrawable().getIntrinsicWidth();
            float intrinsicHeight = getDrawable().getIntrinsicHeight();
            C21514119Hn c21514119Hn = C21513819Hk.LIZIZ;
            RectF rectFLIZJ = c21514119Hn.LIZJ();
            rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float width = getWidth();
            float height = getHeight();
            RectF rectFLIZJ2 = c21514119Hn.LIZJ();
            rectFLIZJ2.set(0.0f, 0.0f, width, height);
            matrix.setRectToRect(rectFLIZJ, rectFLIZJ2, Matrix.ScaleToFit.CENTER);
            if (((LinkedList) c21514119Hn.LIZIZ).size() < c21514119Hn.LIZ) {
                ((LinkedList) c21514119Hn.LIZIZ).offer(rectFLIZJ2);
            }
            if (((LinkedList) c21514119Hn.LIZIZ).size() < c21514119Hn.LIZ) {
                ((LinkedList) c21514119Hn.LIZIZ).offer(rectFLIZJ);
            }
        }
        return matrix;
    }

    public final void LJI(Matrix matrix) {
        if (matrix == null) {
            return;
        }
        this.LLJ = 0;
        LIZ();
        this.LLIZLLLIL.set(matrix);
        LIZJ();
        invalidate();
    }

    public final void LJIIJJI(Long l) {
        float f;
        int width;
        float f2;
        int height;
        int width2;
        int height2;
        float f3;
        float f4;
        float f5;
        if (!LJFF()) {
            return;
        }
        Matrix matrixLIZJ = C21513819Hk.LIZJ();
        LJ(matrixLIZJ).postConcat(this.LLIZLLLIL);
        boolean z = false;
        float f6 = C21513819Hk.LIZ(matrixLIZJ)[0];
        float f7 = C21513819Hk.LIZ(this.LLIZLLLIL)[0];
        if (this.LL) {
            f = this.LLILLJJLI.left;
            width = this.LLILLJJLI.right;
        } else {
            f = 0.0f;
            width = getWidth();
        }
        float f8 = width;
        if (this.LL) {
            f2 = this.LLILLJJLI.top;
            height = this.LLILLJJLI.bottom;
        } else {
            f2 = 0.0f;
            height = getHeight();
        }
        float f9 = height;
        if (this.LL) {
            width2 = this.LLILLJJLI.width();
        } else {
            width2 = getWidth();
        }
        float f10 = width2;
        if (this.LL) {
            height2 = this.LLILLJJLI.height();
        } else {
            height2 = getHeight();
        }
        float f11 = height2;
        float maxScale = getMaxScale();
        if (f6 > maxScale) {
            f3 = maxScale / f6;
        } else {
            f3 = 1.0f;
        }
        float minScale = getMinScale();
        if (f7 * f3 < minScale) {
            f3 = minScale / f7;
        }
        if (f3 != 1.0f) {
            z = true;
        }
        Matrix matrixLIZLLL = C21513819Hk.LIZLLL(matrixLIZJ);
        PointF pointF = this.LLJIJIL;
        matrixLIZLLL.postScale(f3, f3, pointF.x, pointF.y);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        C21514119Hn c21514119Hn = C21513819Hk.LIZIZ;
        RectF rectFLIZJ = c21514119Hn.LIZJ();
        rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        matrixLIZLLL.mapRect(rectFLIZJ);
        float f12 = rectFLIZJ.right;
        float f13 = rectFLIZJ.left;
        if (f12 - f13 < f10) {
            f4 = ((f + f8) / 2.0f) - ((f12 + f13) / 2.0f);
        } else if (f13 > f) {
            f4 = f - f13;
        } else if (f12 < f8) {
            f4 = f8 - f12;
        } else {
            f4 = 0.0f;
        }
        float f14 = rectFLIZJ.bottom;
        float f15 = rectFLIZJ.top;
        if (f14 - f15 < f11) {
            f5 = ((f2 + f9) / 2.0f) - ((f14 + f15) / 2.0f);
        } else if (f15 > f2) {
            f5 = f2 - f15;
        } else if (f14 < f9) {
            f5 = f9 - f14;
        } else {
            f5 = 0.0f;
        }
        if (f4 != 0.0f || f5 != 0.0f || z) {
            Matrix matrixLIZLLL2 = C21513819Hk.LIZLLL(this.LLIZLLLIL);
            PointF pointF2 = this.LLJIJIL;
            matrixLIZLLL2.postScale(f3, f3, pointF2.x, pointF2.y);
            matrixLIZLLL2.postTranslate(f4, f5);
            LIZ();
            if (l != null) {
                C21513719Hj c21513719Hj = new C21513719Hj(this, this.LLIZLLLIL, matrixLIZLLL2, l.longValue());
                this.LLJILLL = c21513719Hj;
                c21513719Hj.start();
            } else {
                C21513719Hj c21513719Hj2 = new C21513719Hj(this, this.LLIZLLLIL, matrixLIZLLL2);
                this.LLJILLL = c21513719Hj2;
                c21513719Hj2.start();
            }
            C21513819Hk.LIZIZ(matrixLIZLLL2);
        }
        if (((LinkedList) c21514119Hn.LIZIZ).size() < c21514119Hn.LIZ) {
            ((LinkedList) c21514119Hn.LIZIZ).offer(rectFLIZJ);
        }
        C21513819Hk.LIZIZ(matrixLIZLLL);
        C21513819Hk.LIZIZ(matrixLIZJ);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLJ == 2) {
            return true;
        }
        RectF rectFLIZLLL = LIZLLL(null);
        if (rectFLIZLLL.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (rectFLIZLLL.right > getWidth()) {
                return true;
            }
            return false;
        }
        if (rectFLIZLLL.left < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLJ == 2) {
            return true;
        }
        RectF rectFLIZLLL = LIZLLL(null);
        if (rectFLIZLLL.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (rectFLIZLLL.bottom > getHeight()) {
                return true;
            }
            return false;
        }
        if (rectFLIZLLL.top < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            if (LJFF()) {
                Matrix matrixLIZJ = C21513819Hk.LIZJ();
                Matrix matrixLJ = LJ(matrixLIZJ);
                matrixLJ.postConcat(this.LLIZLLLIL);
                setImageMatrix(matrixLJ);
                C21513819Hk.LIZIZ(matrixLIZJ);
                if (!this.LLILZ) {
                    this.LLILZ = true;
                    C167P c167p = this.LLILLL;
                    if (c167p != null) {
                        c167p.LIZ();
                    }
                }
            }
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21513719Hj c21513719Hj;
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 1 && action != 3) {
            if (action == 6) {
                if (this.LLJ == 2 && motionEvent.getPointerCount() > 2) {
                    if ((motionEvent.getAction() >> 8) == 0) {
                        LJIIIIZZ(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                    } else if ((motionEvent.getAction() >> 8) == 1) {
                        LJIIIIZZ(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                    }
                }
            } else if (action == 0) {
                C21513719Hj c21513719Hj2 = this.LLJILLL;
                if (c21513719Hj2 == null || !c21513719Hj2.isRunning()) {
                    LIZ();
                    this.LLJ = 1;
                    this.LLJIJIL.set(motionEvent.getX(), motionEvent.getY());
                }
            } else if (action == 5) {
                LIZ();
                this.LLJ = 2;
                LJIIIIZZ(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            } else if (action == 2 && ((c21513719Hj = this.LLJILLL) == null || !c21513719Hj.isRunning())) {
                int i = this.LLJ;
                if (i == 1) {
                    LJIIL(motionEvent.getX() - this.LLJIJIL.x, motionEvent.getY() - this.LLJIJIL.y);
                    this.LLJIJIL.set(motionEvent.getX(), motionEvent.getY());
                } else if (i == 2 && motionEvent.getPointerCount() > 1) {
                    float x = motionEvent.getX(0);
                    float y = motionEvent.getY(0);
                    float x2 = x - motionEvent.getX(1);
                    float y2 = y - motionEvent.getY(1);
                    float fSqrt = (float) Math.sqrt((x2 * x2) + (y2 * y2));
                    this.LLJIJIL.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
                    LJIIIZ(this.LLJILJIL, this.LLJILJILJ, fSqrt, this.LLJIJIL);
                }
            }
        } else {
            if (this.LLJ == 2) {
                LJIIJJI(null);
            }
            this.LLJ = 0;
        }
        this.LLJJI.onTouchEvent(motionEvent);
        return true;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.LLILLJJLI = rect;
        if (rect != null) {
            this.LL = true;
        }
    }

    public void setEnableDoubleTap(boolean z) {
        this.LLILZIL = z;
    }

    public void setFirstReadyListener(C167P c167p) {
        this.LLILLL = c167p;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LLILZLL = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLIZ = onLongClickListener;
    }

    public C21513519Hh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
        this.LLIZLLLIL = new Matrix();
        this.LLJ = 0;
        this.LLJIJIL = new PointF();
        this.LLJILJIL = new PointF();
        this.LLJILJILJ = 0.0f;
        this.LLJJI = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.19Hi
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                float f;
                int width;
                float f2;
                int height;
                int width2;
                int height2;
                float maxScale;
                float f3;
                C21513519Hh c21513519Hh = this.LL;
                if (c21513519Hh.LLJ == 1) {
                    C21513719Hj c21513719Hj = c21513519Hh.LLJILLL;
                    if (c21513719Hj == null || !c21513719Hj.isRunning()) {
                        C21513519Hh c21513519Hh2 = this.LL;
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (c21513519Hh2.LJFF() && c21513519Hh2.LLILZIL) {
                            Matrix matrixLIZJ = C21513819Hk.LIZJ();
                            c21513519Hh2.LJ(matrixLIZJ);
                            float f4 = C21513819Hk.LIZ(matrixLIZJ)[0];
                            float f5 = C21513819Hk.LIZ(c21513519Hh2.LLIZLLLIL)[0] * f4;
                            float f6 = 0.0f;
                            if (c21513519Hh2.LL) {
                                f = c21513519Hh2.LLILLJJLI.left;
                                width = c21513519Hh2.LLILLJJLI.right;
                            } else {
                                f = 0.0f;
                                width = c21513519Hh2.getWidth();
                            }
                            float f7 = width;
                            if (c21513519Hh2.LL) {
                                f2 = c21513519Hh2.LLILLJJLI.top;
                                height = c21513519Hh2.LLILLJJLI.bottom;
                            } else {
                                f2 = 0.0f;
                                height = c21513519Hh2.getHeight();
                            }
                            float f8 = height;
                            if (c21513519Hh2.LL) {
                                width2 = c21513519Hh2.LLILLJJLI.width();
                            } else {
                                width2 = c21513519Hh2.getWidth();
                            }
                            float f9 = width2;
                            if (c21513519Hh2.LL) {
                                height2 = c21513519Hh2.LLILLJJLI.height();
                            } else {
                                height2 = c21513519Hh2.getHeight();
                            }
                            float f10 = height2;
                            float maxScale2 = c21513519Hh2.getMaxScale();
                            if (f5 < c21513519Hh2.getMaxScale()) {
                                maxScale = c21513519Hh2.getMaxScale();
                            } else {
                                maxScale = f4;
                            }
                            if (maxScale <= maxScale2) {
                                maxScale2 = maxScale;
                            }
                            if (maxScale2 >= f4) {
                                f4 = maxScale2;
                            }
                            Matrix matrixLIZLLL = C21513819Hk.LIZLLL(c21513519Hh2.LLIZLLLIL);
                            float f11 = f4 / f5;
                            matrixLIZLLL.postScale(f11, f11, x, y);
                            float f12 = f9 / 2.0f;
                            float f13 = f10 / 2.0f;
                            matrixLIZLLL.postTranslate(f12 - x, f13 - y);
                            Matrix matrixLIZLLL2 = C21513819Hk.LIZLLL(matrixLIZJ);
                            matrixLIZLLL2.postConcat(matrixLIZLLL);
                            float intrinsicWidth = c21513519Hh2.getDrawable().getIntrinsicWidth();
                            float intrinsicHeight = c21513519Hh2.getDrawable().getIntrinsicHeight();
                            C21514119Hn c21514119Hn = C21513819Hk.LIZIZ;
                            RectF rectFLIZJ = c21514119Hn.LIZJ();
                            rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                            matrixLIZLLL2.mapRect(rectFLIZJ);
                            float f14 = rectFLIZJ.right;
                            float f15 = rectFLIZJ.left;
                            if (f14 - f15 < f9) {
                                f3 = f12 - ((f14 + f15) / 2.0f);
                            } else if (f15 > f) {
                                f3 = f - f15;
                            } else if (f14 < f7) {
                                f3 = f7 - f14;
                            } else {
                                f3 = 0.0f;
                            }
                            float f16 = rectFLIZJ.bottom;
                            float f18 = rectFLIZJ.top;
                            if (f16 - f18 < f10) {
                                f6 = f13 - ((f16 + f18) / 2.0f);
                            } else if (f18 > f2) {
                                f6 = f2 - f18;
                            } else if (f16 < f8) {
                                f6 = f8 - f16;
                            }
                            matrixLIZLLL.postTranslate(f3, f6);
                            c21513519Hh2.LIZ();
                            C21513719Hj c21513719Hj2 = new C21513719Hj(c21513519Hh2, c21513519Hh2.LLIZLLLIL, matrixLIZLLL);
                            c21513519Hh2.LLJILLL = c21513719Hj2;
                            c21513719Hj2.start();
                            if (((LinkedList) c21514119Hn.LIZIZ).size() < c21514119Hn.LIZ) {
                                ((LinkedList) c21514119Hn.LIZIZ).offer(rectFLIZJ);
                            }
                            C21513819Hk.LIZIZ(matrixLIZLLL2);
                            C21513819Hk.LIZIZ(matrixLIZLLL);
                            C21513819Hk.LIZIZ(matrixLIZJ);
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
                C21513519Hh c21513519Hh = this.LL;
                View.OnLongClickListener onLongClickListener = c21513519Hh.LLIZ;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(c21513519Hh);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C21513519Hh c21513519Hh = this.LL;
                View.OnClickListener onClickListener = c21513519Hh.LLILZLL;
                if (onClickListener != null) {
                    onClickListener.onClick(c21513519Hh);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C21513519Hh c21513519Hh = this.LL;
                if (c21513519Hh.LLJ == 0) {
                    C21513719Hj c21513719Hj = c21513519Hh.LLJILLL;
                    if (c21513719Hj == null || !c21513719Hj.isRunning()) {
                        C21513519Hh c21513519Hh2 = this.LL;
                        if (c21513519Hh2.LJFF()) {
                            c21513519Hh2.LIZ();
                            C1843450y4V c1843450y4V = new C1843450y4V(c21513519Hh2, f / 60.0f, f2 / 60.0f);
                            c21513519Hh2.LLJJ = c1843450y4V;
                            c1843450y4V.start();
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

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(float r14, float r15) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21513519Hh.LJIIL(float, float):boolean");
    }

    public final void LJIIIIZZ(float f, float f2, float f3, float f4) {
        float[] fArr;
        float f5 = f - f3;
        float f6 = f2 - f4;
        this.LLJILJILJ = C21513819Hk.LIZ(this.LLIZLLLIL)[0] / ((float) Math.sqrt((f5 * f5) + (f6 * f6)));
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LLIZLLLIL;
        if (matrix != null) {
            fArr = new float[2];
            Matrix matrixLIZJ = C21513819Hk.LIZJ();
            matrix.invert(matrixLIZJ);
            matrixLIZJ.mapPoints(fArr, fArr2);
            C21513819Hk.LIZIZ(matrixLIZJ);
        } else {
            fArr = new float[2];
        }
        this.LLJILJIL.set(fArr[0], fArr[1]);
    }

    public final void LJIIIZ(PointF pointF, float f, float f2, PointF pointF2) {
        if (!LJFF()) {
            return;
        }
        float f3 = f * f2;
        Matrix matrixLIZJ = C21513819Hk.LIZJ();
        matrixLIZJ.postScale(f3, f3, pointF.x, pointF.y);
        matrixLIZJ.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
        this.LLIZLLLIL.set(matrixLIZJ);
        C21513819Hk.LIZIZ(matrixLIZJ);
        LIZJ();
        invalidate();
    }
}
