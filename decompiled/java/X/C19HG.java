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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19HG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19HG extends AppCompatImageView {
    public boolean LL;
    public Rect LLILLJJLI;
    public final C1910890zpH LLILLL;
    public View.OnClickListener LLILZ;
    public View.OnLongClickListener LLILZIL;
    public final Matrix LLILZLL;
    public int LLIZ;
    public List<InterfaceC21509919Fx> LLIZLLLIL;
    public List<InterfaceC21509919Fx> LLJ;
    public int LLJI;
    public final PointF LLJIJIL;
    public final PointF LLJILJIL;
    public float LLJILJILJ;
    public C21511419Gm LLJILLL;
    public C1084980eLA LLJJ;
    public final GestureDetector LLJJI;

    public RectF getMask() {
        return null;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final void LIZ() {
        C21511419Gm c21511419Gm = this.LLJILLL;
        if (c21511419Gm != null) {
            c21511419Gm.cancel();
            this.LLJILLL = null;
        }
        C1084980eLA c1084980eLA = this.LLJJ;
        if (c1084980eLA != null) {
            c1084980eLA.cancel();
            this.LLJJ = null;
        }
    }

    public final void LIZJ() {
        List<InterfaceC21509919Fx> list;
        List<InterfaceC21509919Fx> list2 = this.LLIZLLLIL;
        if (list2 == null) {
            return;
        }
        this.LLJI++;
        Iterator<InterfaceC21509919Fx> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this);
        }
        int i = this.LLJI - 1;
        this.LLJI = i;
        if (i != 0 || (list = this.LLJ) == null) {
            return;
        }
        this.LLIZLLLIL = list;
        this.LLJ = null;
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
        return (this.LLILLJJLI.width() / getWidth()) * (getWidth() / (C19HH.LIZ(LJ(null))[0] * getDrawable().getIntrinsicWidth()));
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
        return this.LLIZ;
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
        Matrix matrixLIZJ = C19HH.LIZJ();
        LJ(matrixLIZJ).postConcat(this.LLILZLL);
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        matrixLIZJ.mapRect(rectF);
        C19HH.LIZIZ(matrixLIZJ);
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
            C19HK c19hk = C19HH.LIZIZ;
            RectF rectFLIZJ = c19hk.LIZJ();
            rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float width = getWidth();
            float height = getHeight();
            RectF rectFLIZJ2 = c19hk.LIZJ();
            rectFLIZJ2.set(0.0f, 0.0f, width, height);
            matrix.setRectToRect(rectFLIZJ, rectFLIZJ2, Matrix.ScaleToFit.CENTER);
            C1910890zpH c1910890zpH = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tempSrc:");
            sbLIZ.append(rectFLIZJ);
            sbLIZ.append(", tempDst:");
            sbLIZ.append(rectFLIZJ2);
            c1910890zpH.LIZ("CropActivity", C2188811AlT.LIZIZ(sbLIZ));
            C19HH.LJ(rectFLIZJ2);
            C19HH.LJ(rectFLIZJ);
        }
        return matrix;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLIZ == 2) {
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
        if (this.LLIZ == 2) {
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
                Matrix matrixLIZJ = C19HH.LIZJ();
                Matrix matrixLJ = LJ(matrixLIZJ);
                matrixLJ.postConcat(this.LLILZLL);
                setImageMatrix(matrixLJ);
                C19HH.LIZIZ(matrixLIZJ);
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
        float f;
        int width;
        float f2;
        int height;
        int width2;
        int height2;
        float f3;
        boolean z;
        float f4;
        float f5;
        C21511419Gm c21511419Gm;
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 1 && action != 3) {
            if (action == 6) {
                if (this.LLIZ == 2 && motionEvent.getPointerCount() > 2) {
                    if ((motionEvent.getAction() >> 8) == 0) {
                        LJI(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                    } else if ((motionEvent.getAction() >> 8) == 1) {
                        LJI(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                    }
                }
            } else if (action == 0) {
                C21511419Gm c21511419Gm2 = this.LLJILLL;
                if (c21511419Gm2 == null || !c21511419Gm2.isRunning()) {
                    LIZ();
                    this.LLIZ = 1;
                    this.LLJIJIL.set(motionEvent.getX(), motionEvent.getY());
                }
            } else if (action == 5) {
                LIZ();
                this.LLIZ = 2;
                LJI(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            } else if (action == 2 && ((c21511419Gm = this.LLJILLL) == null || !c21511419Gm.isRunning())) {
                int i = this.LLIZ;
                if (i == 1) {
                    LJII(motionEvent.getX() - this.LLJIJIL.x, motionEvent.getY() - this.LLJIJIL.y);
                    this.LLJIJIL.set(motionEvent.getX(), motionEvent.getY());
                } else if (i == 2 && motionEvent.getPointerCount() > 1) {
                    float x = motionEvent.getX(0);
                    float y = motionEvent.getY(0);
                    float x2 = x - motionEvent.getX(1);
                    float y2 = y - motionEvent.getY(1);
                    float fSqrt = (float) Math.sqrt((x2 * x2) + (y2 * y2));
                    float x3 = motionEvent.getX(0);
                    float y3 = motionEvent.getY(0);
                    this.LLJIJIL.set((x3 + motionEvent.getX(1)) / 2.0f, (y3 + motionEvent.getY(1)) / 2.0f);
                    PointF pointF = this.LLJILJIL;
                    float f6 = this.LLJILJILJ;
                    PointF pointF2 = this.LLJIJIL;
                    if (LJFF()) {
                        float f7 = f6 * fSqrt;
                        Matrix matrixLIZJ = C19HH.LIZJ();
                        matrixLIZJ.postScale(f7, f7, pointF.x, pointF.y);
                        matrixLIZJ.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
                        this.LLILZLL.set(matrixLIZJ);
                        C19HH.LIZIZ(matrixLIZJ);
                        LIZJ();
                        invalidate();
                    }
                }
            }
        } else {
            if (this.LLIZ == 2 && LJFF()) {
                Matrix matrixLIZJ2 = C19HH.LIZJ();
                LJ(matrixLIZJ2).postConcat(this.LLILZLL);
                float f8 = C19HH.LIZ(matrixLIZJ2)[0];
                float f9 = C19HH.LIZ(this.LLILZLL)[0];
                if (this.LL) {
                    f = this.LLILLJJLI.left;
                    width = this.LLILLJJLI.right;
                } else {
                    f = 0.0f;
                    width = getWidth();
                }
                float f10 = width;
                if (this.LL) {
                    f2 = this.LLILLJJLI.top;
                    height = this.LLILLJJLI.bottom;
                } else {
                    f2 = 0.0f;
                    height = getHeight();
                }
                float f11 = height;
                if (this.LL) {
                    width2 = this.LLILLJJLI.width();
                } else {
                    width2 = getWidth();
                }
                float f12 = width2;
                if (this.LL) {
                    height2 = this.LLILLJJLI.height();
                } else {
                    height2 = getHeight();
                }
                float f13 = height2;
                float maxScale = getMaxScale();
                if (f8 > maxScale) {
                    f3 = maxScale / f8;
                } else {
                    f3 = 1.0f;
                }
                float minScale = getMinScale();
                if (f9 * f3 < minScale) {
                    f3 = minScale / f9;
                }
                if (f3 != 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                Matrix matrixLIZLLL = C19HH.LIZLLL(matrixLIZJ2);
                PointF pointF3 = this.LLJIJIL;
                matrixLIZLLL.postScale(f3, f3, pointF3.x, pointF3.y);
                float intrinsicWidth = getDrawable().getIntrinsicWidth();
                float intrinsicHeight = getDrawable().getIntrinsicHeight();
                RectF rectFLIZJ = C19HH.LIZIZ.LIZJ();
                rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                matrixLIZLLL.mapRect(rectFLIZJ);
                float f14 = rectFLIZJ.right;
                float f15 = rectFLIZJ.left;
                if (f14 - f15 < f12) {
                    f4 = ((f + f10) / 2.0f) - ((f14 + f15) / 2.0f);
                } else if (f15 > f) {
                    f4 = f - f15;
                } else if (f14 < f10) {
                    f4 = f10 - f14;
                } else {
                    f4 = 0.0f;
                }
                float f16 = rectFLIZJ.bottom;
                float f18 = rectFLIZJ.top;
                if (f16 - f18 < f13) {
                    f5 = ((f2 + f11) / 2.0f) - ((f16 + f18) / 2.0f);
                } else if (f18 > f2) {
                    f5 = f2 - f18;
                } else if (f16 < f11) {
                    f5 = f11 - f16;
                } else {
                    f5 = 0.0f;
                }
                if (f4 != 0.0f || f5 != 0.0f || z) {
                    Matrix matrixLIZLLL2 = C19HH.LIZLLL(this.LLILZLL);
                    PointF pointF4 = this.LLJIJIL;
                    matrixLIZLLL2.postScale(f3, f3, pointF4.x, pointF4.y);
                    matrixLIZLLL2.postTranslate(f4, f5);
                    LIZ();
                    C21511419Gm c21511419Gm3 = new C21511419Gm(this, this.LLILZLL, matrixLIZLLL2, 0);
                    this.LLJILLL = c21511419Gm3;
                    c21511419Gm3.start();
                    C19HH.LIZIZ(matrixLIZLLL2);
                }
                C19HH.LJ(rectFLIZJ);
                C19HH.LIZIZ(matrixLIZLLL);
                C19HH.LIZIZ(matrixLIZJ2);
            }
            int i2 = 0;
            this.LLIZ = i2;
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

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LLILZ = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLILZIL = onLongClickListener;
    }

    public C19HG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.EDIT_PROFILE);
        this.LLILZLL = new Matrix();
        this.LLIZ = 0;
        this.LLJIJIL = new PointF();
        this.LLJILJIL = new PointF();
        this.LLJILJILJ = 0.0f;
        this.LLJJI = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.19HF
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
                C19HG c19hg = this.LL;
                if (c19hg.LLIZ == 1) {
                    C21511419Gm c21511419Gm = c19hg.LLJILLL;
                    if (c21511419Gm == null || !c21511419Gm.isRunning()) {
                        C19HG c19hg2 = this.LL;
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (c19hg2.LJFF()) {
                            Matrix matrixLIZJ = C19HH.LIZJ();
                            c19hg2.LJ(matrixLIZJ);
                            float f4 = C19HH.LIZ(matrixLIZJ)[0];
                            float f5 = C19HH.LIZ(c19hg2.LLILZLL)[0] * f4;
                            float f6 = 0.0f;
                            if (c19hg2.LL) {
                                f = c19hg2.LLILLJJLI.left;
                                width = c19hg2.LLILLJJLI.right;
                            } else {
                                f = 0.0f;
                                width = c19hg2.getWidth();
                            }
                            float f7 = width;
                            if (c19hg2.LL) {
                                f2 = c19hg2.LLILLJJLI.top;
                                height = c19hg2.LLILLJJLI.bottom;
                            } else {
                                f2 = 0.0f;
                                height = c19hg2.getHeight();
                            }
                            float f8 = height;
                            if (c19hg2.LL) {
                                width2 = c19hg2.LLILLJJLI.width();
                            } else {
                                width2 = c19hg2.getWidth();
                            }
                            float f9 = width2;
                            if (c19hg2.LL) {
                                height2 = c19hg2.LLILLJJLI.height();
                            } else {
                                height2 = c19hg2.getHeight();
                            }
                            float f10 = height2;
                            float maxScale2 = c19hg2.getMaxScale();
                            if (f5 < c19hg2.getMaxScale()) {
                                maxScale = c19hg2.getMaxScale();
                            } else {
                                maxScale = f4;
                            }
                            if (maxScale <= maxScale2) {
                                maxScale2 = maxScale;
                            }
                            if (maxScale2 >= f4) {
                                f4 = maxScale2;
                            }
                            Matrix matrixLIZLLL = C19HH.LIZLLL(c19hg2.LLILZLL);
                            float f11 = f4 / f5;
                            matrixLIZLLL.postScale(f11, f11, x, y);
                            float f12 = f9 / 2.0f;
                            float f13 = f10 / 2.0f;
                            matrixLIZLLL.postTranslate(f12 - x, f13 - y);
                            Matrix matrixLIZLLL2 = C19HH.LIZLLL(matrixLIZJ);
                            matrixLIZLLL2.postConcat(matrixLIZLLL);
                            float intrinsicWidth = c19hg2.getDrawable().getIntrinsicWidth();
                            float intrinsicHeight = c19hg2.getDrawable().getIntrinsicHeight();
                            RectF rectFLIZJ = C19HH.LIZIZ.LIZJ();
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
                            c19hg2.LIZ();
                            C21511419Gm c21511419Gm2 = new C21511419Gm(c19hg2, c19hg2.LLILZLL, matrixLIZLLL, 0);
                            c19hg2.LLJILLL = c21511419Gm2;
                            c21511419Gm2.start();
                            C19HH.LJ(rectFLIZJ);
                            C19HH.LIZIZ(matrixLIZLLL2);
                            C19HH.LIZIZ(matrixLIZLLL);
                            C19HH.LIZIZ(matrixLIZJ);
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
                C19HG c19hg = this.LL;
                View.OnLongClickListener onLongClickListener = c19hg.LLILZIL;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(c19hg);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C19HG c19hg = this.LL;
                View.OnClickListener onClickListener = c19hg.LLILZ;
                if (onClickListener != null) {
                    onClickListener.onClick(c19hg);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C19HG c19hg = this.LL;
                if (c19hg.LLIZ == 0) {
                    C21511419Gm c21511419Gm = c19hg.LLJILLL;
                    if (c21511419Gm == null || !c21511419Gm.isRunning()) {
                        C19HG c19hg2 = this.LL;
                        if (c19hg2.LJFF()) {
                            c19hg2.LIZ();
                            C1084980eLA c1084980eLA = new C1084980eLA(c19hg2, f / 60.0f, f2 / 60.0f);
                            c19hg2.LLJJ = c1084980eLA;
                            c1084980eLA.start();
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(float r13, float r14) {
        /*
            r12 = this;
            boolean r0 = r12.LJFF()
            r11 = 0
            if (r0 != 0) goto L8
            return r11
        L8:
            X.19HK r0 = X.C19HH.LIZIZ
            java.lang.Object r1 = r0.LIZJ()
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            r12.LIZLLL(r1)
            boolean r0 = r12.LL
            r10 = 0
            if (r0 == 0) goto Lb9
            android.graphics.Rect r0 = r12.LLILLJJLI
            int r0 = r0.left
            float r8 = (float) r0
            android.graphics.Rect r0 = r12.LLILLJJLI
            int r0 = r0.right
        L21:
            float r5 = (float) r0
            boolean r0 = r12.LL
            if (r0 == 0) goto Lb2
            android.graphics.Rect r0 = r12.LLILLJJLI
            int r0 = r0.top
            float r3 = (float) r0
            android.graphics.Rect r0 = r12.LLILLJJLI
            int r0 = r0.bottom
        L2f:
            float r2 = (float) r0
            boolean r0 = r12.LL
            if (r0 == 0) goto Lad
            android.graphics.Rect r0 = r12.LLILLJJLI
            int r0 = r0.width()
        L3a:
            float r9 = (float) r0
            boolean r0 = r12.LL
            if (r0 == 0) goto La8
            android.graphics.Rect r0 = r12.LLILLJJLI
            int r0 = r0.height()
        L45:
            float r6 = (float) r0
            float r4 = r1.right
            float r7 = r1.left
            float r0 = r4 - r7
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 < 0) goto La6
            float r0 = r7 + r13
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L99
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto La6
            float r13 = r8 - r7
        L5c:
            float r5 = r1.bottom
            float r4 = r1.top
            float r0 = r5 - r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L97
            float r0 = r4 + r14
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L8a
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L97
            float r14 = r3 - r4
        L72:
            X.C19HH.LJ(r1)
            android.graphics.Matrix r0 = r12.LLILZLL
            r0.postTranslate(r13, r14)
            r12.LIZJ()
            r12.invalidate()
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 != 0) goto L88
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L89
        L88:
            r11 = 1
        L89:
            return r11
        L8a:
            float r0 = r5 + r14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L72
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L97
            float r14 = r2 - r5
            goto L72
        L97:
            r14 = 0
            goto L72
        L99:
            float r0 = r4 + r13
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L5c
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto La6
            float r13 = r5 - r4
            goto L5c
        La6:
            r13 = 0
            goto L5c
        La8:
            int r0 = r12.getHeight()
            goto L45
        Lad:
            int r0 = r12.getWidth()
            goto L3a
        Lb2:
            r3 = 0
            int r0 = r12.getHeight()
            goto L2f
        Lb9:
            r8 = 0
            int r0 = r12.getWidth()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19HG.LJII(float, float):boolean");
    }

    public final void LJI(float f, float f2, float f3, float f4) {
        float[] fArr;
        float f5 = f - f3;
        float f6 = f2 - f4;
        this.LLJILJILJ = C19HH.LIZ(this.LLILZLL)[0] / ((float) Math.sqrt((f5 * f5) + (f6 * f6)));
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LLILZLL;
        if (matrix != null) {
            fArr = new float[2];
            Matrix matrixLIZJ = C19HH.LIZJ();
            matrix.invert(matrixLIZJ);
            matrixLIZJ.mapPoints(fArr, fArr2);
            C19HH.LIZIZ(matrixLIZJ);
        } else {
            fArr = new float[2];
        }
        this.LLJILJIL.set(fArr[0], fArr[1]);
    }
}
