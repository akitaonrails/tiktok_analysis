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
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;

/* JADX INFO: renamed from: X.12Ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19726612Ga extends C1322110kVd {
    public boolean LL;
    public Rect LLILLJJLI;
    public final float LLILLL;
    public final boolean LLILZ;
    public View.OnClickListener LLILZIL;
    public final Matrix LLILZLL;
    public int LLIZ;
    public InterfaceC1447270nlV LLIZLLLIL;
    public int LLJ;
    public final PointF LLJI;
    public final PointF LLJIJIL;
    public float LLJILJIL;
    public C19727012Ge LLJILJILJ;
    public C1084960eL8 LLJILLL;
    public final GestureDetector LLJJ;

    public final void LIZLLL() {
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final void LIZ() {
        C19727012Ge c19727012Ge = this.LLJILJILJ;
        if (c19727012Ge != null) {
            c19727012Ge.cancel();
            this.LLJILJILJ = null;
        }
        C1084960eL8 c1084960eL8 = this.LLJILLL;
        if (c1084960eL8 != null) {
            c1084960eL8.cancel();
            this.LLJILLL = null;
        }
    }

    public final Matrix LJIIIIZZ() {
        return new Matrix(this.LLILZLL);
    }

    public final void LJIIJ() {
        this.LLILZLL.reset();
        LIZLLL();
        this.LLIZ = 0;
        this.LLJI.set(0.0f, 0.0f);
        this.LLJIJIL.set(0.0f, 0.0f);
        this.LLJILJIL = 0.0f;
        LIZ();
        invalidate();
    }

    public float getPreviewAreaMaxScale() {
        float f;
        float height;
        int intrinsicHeight;
        float f2 = this.LLILLL;
        if (f2 != -1.0f) {
            return f2 * getMinPreviewAreaScale();
        }
        if (LJIIIZ()) {
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

    private float getMinPreviewAreaScale() {
        if (!LJIIIZ() || this.LLILLJJLI == null) {
            return 1.0f;
        }
        return C19726712Gb.LIZ(LJII(null))[0];
    }

    public final boolean LJIIIZ() {
        return getDrawable() != null && getDrawable().getIntrinsicWidth() > 0 && getDrawable().getIntrinsicHeight() > 0 && getWidth() > 0 && getHeight() > 0;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZJ(Canvas canvas) {
        if (LJIIIZ()) {
            Matrix matrixLIZLLL = C19726712Gb.LIZLLL();
            Matrix matrixLJII = LJII(matrixLIZLLL);
            matrixLJII.postConcat(this.LLILZLL);
            setImageMatrix(matrixLJII);
            C19726712Gb.LIZJ(matrixLIZLLL);
        }
        super.onDraw(canvas);
    }

    public final RectF LJI(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!LJIIIZ()) {
            return rectF;
        }
        Matrix matrixLIZLLL = C19726712Gb.LIZLLL();
        LJII(matrixLIZLLL).postConcat(this.LLILZLL);
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        matrixLIZLLL.mapRect(rectF);
        C19726712Gb.LIZJ(matrixLIZLLL);
        return rectF;
    }

    public final Matrix LJII(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (LJIIIZ()) {
            float intrinsicWidth = getDrawable().getIntrinsicWidth();
            float intrinsicHeight = getDrawable().getIntrinsicHeight();
            C19727212Gg c19727212Gg = C19726712Gb.LIZIZ;
            RectF rectFLIZJ = c19727212Gg.LIZJ();
            rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float width = getWidth();
            float height = getHeight();
            RectF rectFLIZJ2 = c19727212Gg.LIZJ();
            rectFLIZJ2.set(0.0f, 0.0f, width, height);
            Rect rect = this.LLILLJJLI;
            if (rect != null && !rect.isEmpty()) {
                RectF rectFLIZJ3 = c19727212Gg.LIZJ();
                rectFLIZJ3.set(0.0f, 0.0f, this.LLILLJJLI.width(), this.LLILLJJLI.height());
                C19726712Gb.LIZIZ(matrix, rectFLIZJ, rectFLIZJ3);
                Rect rect2 = this.LLILLJJLI;
                matrix.postTranslate(rect2.left, rect2.top);
                C19726712Gb.LJ(rectFLIZJ3);
            } else {
                C19726712Gb.LIZIZ(matrix, rectFLIZJ, rectFLIZJ2);
            }
            C19726712Gb.LJ(rectFLIZJ2);
            C19726712Gb.LJ(rectFLIZJ);
        }
        return matrix;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLIZ == 2) {
            return true;
        }
        RectF rectFLJI = LJI(null);
        if (rectFLJI.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (rectFLJI.right > getWidth()) {
                return true;
            }
            return false;
        }
        if (rectFLJI.left < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLIZ == 2) {
            return true;
        }
        RectF rectFLJI = LJI(null);
        if (rectFLJI.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (rectFLJI.bottom > getHeight()) {
                return true;
            }
            return false;
        }
        if (rectFLJI.top < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1322090kVb, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        String contentSource;
        float f;
        int width;
        float f2;
        int height;
        int width2;
        int height2;
        float f3;
        boolean z2;
        float f4;
        float f5;
        C19727012Ge c19727012Ge;
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 1 && action != 3) {
            if (action == 6) {
                if (this.LLIZ == 2 && motionEvent.getPointerCount() > 2) {
                    if ((motionEvent.getAction() >> 8) == 0) {
                        LJIIJJI(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                    } else if ((motionEvent.getAction() >> 8) == 1) {
                        LJIIJJI(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                    }
                }
            } else if (action == 0) {
                C19727012Ge c19727012Ge2 = this.LLJILJILJ;
                if (c19727012Ge2 == null || !c19727012Ge2.isRunning()) {
                    LIZ();
                    this.LLIZ = 1;
                    this.LLJI.set(motionEvent.getX(), motionEvent.getY());
                }
            } else if (action == 5) {
                LIZ();
                this.LLIZ = 2;
                LJIIJJI(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            } else if (action == 2 && ((c19727012Ge = this.LLJILJILJ) == null || !c19727012Ge.isRunning())) {
                int i = this.LLIZ;
                if (i == 1) {
                    LJIIL(motionEvent.getX() - this.LLJI.x, motionEvent.getY() - this.LLJI.y);
                    this.LLJI.set(motionEvent.getX(), motionEvent.getY());
                } else if (i == 2 && motionEvent.getPointerCount() > 1) {
                    float x = motionEvent.getX(0);
                    float y = motionEvent.getY(0);
                    float x2 = x - motionEvent.getX(1);
                    float y2 = y - motionEvent.getY(1);
                    float fSqrt = (float) Math.sqrt((x2 * x2) + (y2 * y2));
                    float x3 = motionEvent.getX(0);
                    float y3 = motionEvent.getY(0);
                    this.LLJI.set((x3 + motionEvent.getX(1)) / 2.0f, (y3 + motionEvent.getY(1)) / 2.0f);
                    PointF pointF = this.LLJIJIL;
                    float f6 = this.LLJILJIL;
                    PointF pointF2 = this.LLJI;
                    if (LJIIIZ() && this.LLILZ) {
                        float f7 = f6 * fSqrt;
                        Matrix matrixLIZLLL = C19726712Gb.LIZLLL();
                        matrixLIZLLL.postScale(f7, f7, pointF.x, pointF.y);
                        matrixLIZLLL.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
                        this.LLILZLL.set(matrixLIZLLL);
                        C19726712Gb.LIZJ(matrixLIZLLL);
                        LIZLLL();
                        invalidate();
                    }
                }
            }
        } else {
            if (this.LLIZ == 2 && LJIIIZ()) {
                Matrix matrixLIZLLL2 = C19726712Gb.LIZLLL();
                LJII(matrixLIZLLL2).postConcat(this.LLILZLL);
                float f8 = C19726712Gb.LIZ(matrixLIZLLL2)[0];
                C19726712Gb.LIZ(this.LLILZLL);
                if (this.LL) {
                    f = this.LLILLJJLI.left;
                    width = this.LLILLJJLI.right;
                } else {
                    f = 0.0f;
                    width = getWidth();
                }
                float f9 = width;
                if (this.LL) {
                    f2 = this.LLILLJJLI.top;
                    height = this.LLILLJJLI.bottom;
                } else {
                    f2 = 0.0f;
                    height = getHeight();
                }
                float f10 = height;
                if (this.LL) {
                    width2 = this.LLILLJJLI.width();
                } else {
                    width2 = getWidth();
                }
                float f11 = width2;
                if (this.LL) {
                    height2 = this.LLILLJJLI.height();
                } else {
                    height2 = getHeight();
                }
                float f12 = height2;
                float previewAreaMaxScale = getPreviewAreaMaxScale();
                if (f8 > previewAreaMaxScale) {
                    f3 = previewAreaMaxScale / f8;
                } else {
                    f3 = 1.0f;
                }
                float minPreviewAreaScale = getMinPreviewAreaScale();
                if (f8 * f3 < minPreviewAreaScale) {
                    f3 = minPreviewAreaScale / f8;
                }
                if (f3 != 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C19727112Gf c19727112Gf = C19726712Gb.LIZ;
                Matrix matrixLIZJ = c19727112Gf.LIZJ();
                if (matrixLIZLLL2 != null) {
                    matrixLIZJ.set(matrixLIZLLL2);
                }
                PointF pointF3 = this.LLJI;
                matrixLIZJ.postScale(f3, f3, pointF3.x, pointF3.y);
                float intrinsicWidth = getDrawable().getIntrinsicWidth();
                float intrinsicHeight = getDrawable().getIntrinsicHeight();
                RectF rectFLIZJ = C19726712Gb.LIZIZ.LIZJ();
                rectFLIZJ.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
                matrixLIZJ.mapRect(rectFLIZJ);
                float f13 = rectFLIZJ.right;
                float f14 = rectFLIZJ.left;
                if (f13 - f14 < f11) {
                    f4 = ((f + f9) / 2.0f) - ((f13 + f14) / 2.0f);
                } else if (f14 > f) {
                    f4 = f - f14;
                } else if (f13 < f9) {
                    f4 = f9 - f13;
                } else {
                    f4 = 0.0f;
                }
                float f15 = rectFLIZJ.bottom;
                float f16 = rectFLIZJ.top;
                if (f15 - f16 < f12) {
                    f5 = ((f2 + f10) / 2.0f) - ((f15 + f16) / 2.0f);
                } else if (f16 > f2) {
                    f5 = f2 - f16;
                } else if (f15 < f10) {
                    f5 = f10 - f15;
                } else {
                    f5 = 0.0f;
                }
                if (f4 != 0.0f || f5 != 0.0f || z2) {
                    Matrix matrix = this.LLILZLL;
                    Matrix matrixLIZJ2 = c19727112Gf.LIZJ();
                    if (matrix != null) {
                        matrixLIZJ2.set(matrix);
                    }
                    PointF pointF4 = this.LLJI;
                    matrixLIZJ2.postScale(f3, f3, pointF4.x, pointF4.y);
                    matrixLIZJ2.postTranslate(f4, f5);
                    LIZ();
                    C19727012Ge c19727012Ge3 = new C19727012Ge(this, this.LLILZLL, matrixLIZJ2);
                    this.LLJILJILJ = c19727012Ge3;
                    c19727012Ge3.start();
                    C19726712Gb.LIZJ(matrixLIZJ2);
                }
                C19726712Gb.LJ(rectFLIZJ);
                C19726712Gb.LIZJ(matrixLIZJ);
                C19726712Gb.LIZJ(matrixLIZLLL2);
            }
            if (this.LLIZ == 1) {
                LJIIIZ();
            }
            this.LLIZ = 0;
            InterfaceC1447270nlV interfaceC1447270nlV = this.LLIZLLLIL;
            if (interfaceC1447270nlV != null) {
                C1447230nlR c1447230nlR = (C1447230nlR) interfaceC1447270nlV;
                C196925122x c196925122x = c1447230nlR.LIZ.LLJJJ;
                if (c196925122x != null && c196925122x.getVisibility() != 0) {
                    C196925122x c196925122x2 = c1447230nlR.LIZ.LLJJJ;
                    int visibility = c196925122x2.getVisibility();
                    z = false;
                    c196925122x2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c196925122x2);
                    c1447230nlR.LIZ.LLJJJJ.LJI().LJIIL().setEnable(true);
                    c1447230nlR.LIZ.LLJJJJJIL = true;
                } else {
                    z = false;
                }
                VEChooseVideoCoverFragment vEChooseVideoCoverFragment = c1447230nlR.LIZ;
                VideoPublishEditModel videoPublishEditModelLJI = vEChooseVideoCoverFragment.LLJLL.LJI();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis - vEChooseVideoCoverFragment.LLLIL;
                vEChooseVideoCoverFragment.LLLIL = jCurrentTimeMillis;
                if (j > 600 && vEChooseVideoCoverFragment.SR()) {
                    AnonymousClass1231 anonymousClass1231 = vEChooseVideoCoverFragment.LLJJJJ;
                    int iLJJJ = z;
                    if (anonymousClass1231 != null) {
                        iLJJJ = anonymousClass1231.LJI().LJJJ();
                    }
                    C1443990ngD.LIZ.getClass();
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", videoPublishEditModelLJI.getCreationId());
                    String str = "";
                    C580270MpN.LIZ(videoPublishEditModelLJI, c0lab, "");
                    c0lab.LJ("shoot_way", videoPublishEditModelLJI.mShootWay);
                    c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelLJI));
                    AVETParameter avetParameter = videoPublishEditModelLJI.getAvetParameter();
                    if (avetParameter != null && (contentSource = avetParameter.getContentSource()) != null) {
                        str = contentSource;
                    }
                    c0lab.LJ("content_source", str);
                    c0lab.LIZ(iLJJJ, "is_cover_add_text");
                    c0lab.LJ("enter_from", "edit_cover_page");
                    C20684815ws.LJIILLIIL("cover_crop", c0lab.LIZ);
                }
            }
        }
        this.LLJJ.onTouchEvent(motionEvent);
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
        this.LLILZIL = onClickListener;
    }

    public void setPreviewAreaOutMatrix(Matrix matrix) {
        this.LLILZLL.reset();
        this.LLILZLL.set(matrix);
        invalidate();
    }

    public void setTouchChangedListeners(InterfaceC1447270nlV interfaceC1447270nlV) {
        this.LLIZLLLIL = interfaceC1447270nlV;
    }

    public C19726612Ga(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = -1.0f;
        this.LLILZ = true;
        this.LLILZLL = new Matrix();
        this.LLIZ = 0;
        this.LLJI = new PointF();
        this.LLJIJIL = new PointF();
        this.LLJILJIL = 0.0f;
        this.LLJJ = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.12Gc
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C19726612Ga c19726612Ga = this.LL;
                View.OnClickListener onClickListener = c19726612Ga.LLILZIL;
                if (onClickListener != null) {
                    onClickListener.onClick(c19726612Ga);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C19726712Gb.LIZ(this.LL.LLILZLL);
                C19726612Ga c19726612Ga = this.LL;
                if (c19726612Ga.LLIZ == 0) {
                    c19726612Ga.getClass();
                }
                C19726612Ga c19726612Ga2 = this.LL;
                if (c19726612Ga2.LLIZ == 0) {
                    C19727012Ge c19727012Ge = c19726612Ga2.LLJILJILJ;
                    if (c19727012Ge == null || !c19727012Ge.isRunning()) {
                        this.LL.getClass();
                        C19726612Ga c19726612Ga3 = this.LL;
                        if (c19726612Ga3.LJIIIZ()) {
                            c19726612Ga3.LIZ();
                            C1084960eL8 c1084960eL8 = new C1084960eL8(c19726612Ga3, f / 60.0f, f2 / 60.0f);
                            c19726612Ga3.LLJILLL = c1084960eL8;
                            c1084960eL8.start();
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
        C12ES.LIZJ(30.0f, getContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(float r13, float r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19726612Ga.LJIIL(float, float):boolean");
    }

    public final void LJIIJJI(float f, float f2, float f3, float f4) {
        float[] fArr;
        float f5 = f - f3;
        float f6 = f2 - f4;
        this.LLJILJIL = C19726712Gb.LIZ(this.LLILZLL)[0] / ((float) Math.sqrt((f5 * f5) + (f6 * f6)));
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LLILZLL;
        if (matrix != null) {
            fArr = new float[2];
            Matrix matrixLIZLLL = C19726712Gb.LIZLLL();
            matrix.invert(matrixLIZLLL);
            matrixLIZLLL.mapPoints(fArr, fArr2);
            C19726712Gb.LIZJ(matrixLIZLLL);
        } else {
            fArr = new float[2];
        }
        this.LLJIJIL.set(fArr[0], fArr[1]);
    }
}
