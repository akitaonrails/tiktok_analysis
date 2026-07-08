package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.19HL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19HL extends AppCompatImageView {
    public Rect LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public View.OnClickListener LLIZ;
    public boolean LLIZLLLIL;
    public final RectF LLJ;
    public final Matrix LLJI;
    public View.OnLongClickListener LLJIJIL;
    public InterfaceC1182630gsf LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public final Matrix LLJJIJI;
    public int LLJJIJIIJIL;
    public List<InterfaceC1192250h8B> LLJJIJIL;
    public List<InterfaceC1192250h8B> LLJJJ;
    public int LLJJJIL;
    public final PointF LLJJJJ;
    public final PointF LLJJJJJIL;
    public float LLJJJJLIIL;
    public C19HO LLJJL;
    public C19HQ LLJJLIIIJLLLLLLLZ;
    public final GestureDetector LLJL;

    public final RectF getMask() {
        return null;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final void LIZLLL() {
        C19HO c19ho = this.LLJJL;
        if (c19ho != null) {
            c19ho.cancel();
            this.LLJJL = null;
        }
        C19HQ c19hq = this.LLJJLIIIJLLLLLLLZ;
        if (c19hq != null) {
            c19hq.cancel();
            this.LLJJLIIIJLLLLLLLZ = null;
        }
    }

    public final void LJFF() {
        List<InterfaceC1192250h8B> list;
        List<InterfaceC1192250h8B> list2 = this.LLJJIJIL;
        if (list2 == null) {
            return;
        }
        this.LLJJJIL++;
        Iterator<InterfaceC1192250h8B> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().ee(this);
        }
        int i = this.LLJJJIL - 1;
        this.LLJJJIL = i;
        if (i != 0 || (list = this.LLJJJ) == null) {
            return;
        }
        this.LLJJIJIL = list;
        this.LLJJJ = null;
    }

    public final void LJIILIIL() {
        this.LLJJIJI.reset();
        LJFF();
        this.LLJJIJIIJIL = 0;
        this.LLJJJJ.set(0.0f, 0.0f);
        this.LLJJJJJIL.set(0.0f, 0.0f);
        this.LLJJJJLIIL = 0.0f;
        LIZLLL();
        invalidate();
    }

    private final float getMinScale() {
        Rect rect;
        if (!LJIIIZ() || (rect = this.LL) == null) {
            return 1.0f;
        }
        float intrinsicWidth = getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight();
        float width = getWidth() / getHeight();
        float fWidth = rect.width();
        Rect rect2 = this.LL;
        return (intrinsicWidth < fWidth / ((float) (rect2 != null ? rect2.height() : 1)) || intrinsicWidth < width) ? (rect.width() / getWidth()) * (getWidth() / (C19HN.LIZ(LJII(null))[0] * getDrawable().getIntrinsicWidth())) : rect.height() / (getWidth() / intrinsicWidth);
    }

    public final boolean LJIIIZ() {
        return getDrawable() != null && getDrawable().getIntrinsicWidth() > 0 && getDrawable().getIntrinsicHeight() > 0 && getWidth() > 0 && getHeight() > 0;
    }

    public final float getMaxScale() {
        float f;
        float height;
        int intrinsicHeight;
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
            f = 6.0f;
        }
        return Math.max(f, 6.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final Matrix getAnimContentMatrix() {
        return this.LLJI;
    }

    public final int getPinchMode() {
        return this.LLJJIJIIJIL;
    }

    public final void LIZ(InterfaceC1192250h8B interfaceC1192250h8B) {
        ArrayList arrayList;
        if (interfaceC1192250h8B == null) {
            return;
        }
        if (this.LLJJJIL == 0) {
            if (this.LLJJIJIL == null) {
                this.LLJJIJIL = new ArrayList();
            }
            List<InterfaceC1192250h8B> list = this.LLJJIJIL;
            if (list != null) {
                list.add(interfaceC1192250h8B);
                return;
            }
            return;
        }
        if (this.LLJJJ == null) {
            if (this.LLJJIJIL != null) {
                arrayList = new ArrayList(this.LLJJIJIL);
            } else {
                arrayList = new ArrayList();
            }
            this.LLJJJ = arrayList;
        }
        List<InterfaceC1192250h8B> list2 = this.LLJJJ;
        if (list2 == null) {
            return;
        }
        list2.add(interfaceC1192250h8B);
    }

    public final boolean LIZJ(int i) {
        RectF rectFLJI = LJI(null);
        if (rectFLJI.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (rectFLJI.bottom <= getHeight()) {
                return false;
            }
        } else if (rectFLJI.top >= 0.0f) {
            return false;
        }
        return true;
    }

    public final void LJ(Canvas canvas) {
        if (this.LLIZLLLIL && getDrawable() != null) {
            canvas.save();
            canvas.clipRect(this.LLJ);
            canvas.concat(this.LLJI);
            getDrawable().draw(canvas);
            canvas.restore();
            return;
        }
        if (LJIIIZ()) {
            Matrix matrixLIZLLL = C19HN.LIZLLL();
            Matrix matrixLJII = LJII(matrixLIZLLL);
            matrixLJII.postConcat(this.LLJJIJI);
            setImageMatrix(matrixLJII);
            C19HN.LIZJ(matrixLIZLLL);
        }
        super.onDraw(canvas);
    }

    public final RectF LJI(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (LJIIIZ()) {
            Matrix matrixLIZLLL = C19HN.LIZLLL();
            LJII(matrixLIZLLL).postConcat(this.LLJJIJI);
            rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
            matrixLIZLLL.mapRect(rectF);
            C19HN.LIZJ(matrixLIZLLL);
        }
        return rectF;
    }

    public final Matrix LJII(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (LJIIIZ()) {
            RectF rectFLJI = C19HN.LJI(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
            RectF rectFLJI2 = C19HN.LJI(getWidth(), getHeight());
            matrix.setRectToRect(rectFLJI, rectFLJI2, Matrix.ScaleToFit.CENTER);
            C19HS c19hs = C19HN.LIZIZ;
            if (((LinkedList) c19hs.LIZIZ).size() < c19hs.LIZ) {
                ((LinkedList) c19hs.LIZIZ).offer(rectFLJI2);
            }
            if (((LinkedList) c19hs.LIZIZ).size() < c19hs.LIZ) {
                ((LinkedList) c19hs.LIZIZ).offer(rectFLJI);
            }
        }
        return matrix;
    }

    public final Matrix LJIIIIZZ(Matrix matrix) {
        if (matrix == null) {
            return new Matrix(this.LLJJIJI);
        }
        matrix.set(this.LLJJIJI);
        return matrix;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLJJIJIIJIL == 2) {
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
        if (this.LLJJ) {
            Matrix matrixLIZLLL = C19HN.LIZLLL();
            float[] fArrLIZ = C19HN.LIZ(LJIIIIZZ(matrixLIZLLL));
            boolean z = false;
            if (Math.abs(fArrLIZ[0] - 1.0f) > 1.0E-4f || Math.abs(fArrLIZ[1] - 1.0f) > 1.0E-4f) {
                z = true;
            }
            C19HN.LIZJ(matrixLIZLLL);
            if (z) {
                return LIZJ(i);
            }
        }
        if (this.LLJJIJIIJIL == 2) {
            return true;
        }
        return LIZJ(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19HL.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAllowParentVerticalScrollWhenScaledAtEdge(boolean z) {
        this.LLJJ = z;
    }

    public final void setAnimClipRect(RectF rectF) {
        this.LLJ.set(rectF);
    }

    public final void setAnimContentMatrix(Matrix matrix) {
        this.LLJI.set(matrix);
        invalidate();
    }

    public final void setDisplayWindowRect(Rect rect) {
        this.LL = rect;
    }

    public final void setDragThreshold(int i) {
        this.LLJJI = i;
    }

    public final void setEnableDragExit(boolean z) {
        this.LLJILJILJ = z;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LLIZ = onClickListener;
    }

    public final void setOnDragOuterWidgetsChangeListener(InterfaceC1182630gsf interfaceC1182630gsf) {
        this.LLJILJIL = interfaceC1182630gsf;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLJIJIL = onLongClickListener;
    }

    public final void setParentDisallowInterceptTouchEvent(boolean z) {
        this.LLJILLL = z;
    }

    public final void setPreferViewPagerOnHorizontalSwipe(boolean z) {
        this.LLJJIII = z;
    }

    public C19HL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = new RectF();
        this.LLJI = new Matrix();
        this.LLJILJILJ = true;
        this.LLJJI = 5;
        this.LLJJIJI = new Matrix();
        this.LLJJJJ = new PointF();
        this.LLJJJJJIL = new PointF();
        this.LLJL = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.19HM
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                int i;
                int width;
                int height;
                int width2;
                int height2;
                float maxScale;
                float f;
                if (this.LL.getPinchMode() == 1 || this.LL.getPinchMode() == 3) {
                    C19HO c19ho = this.LL.LLJJL;
                    int i2 = 0;
                    if (c19ho != null && c19ho.isRunning()) {
                        return true;
                    }
                    C19HL c19hl = this.LL;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (!c19hl.LJIIIZ()) {
                        return true;
                    }
                    Matrix matrixLIZLLL = C19HN.LIZLLL();
                    c19hl.LJII(matrixLIZLLL);
                    float f2 = C19HN.LIZ(matrixLIZLLL)[0];
                    float f3 = C19HN.LIZ(c19hl.LLJJIJI)[0] * f2;
                    Rect rect = c19hl.LL;
                    if (rect != null) {
                        i = rect.left;
                    } else {
                        i = 0;
                    }
                    float f4 = i;
                    if (rect != null) {
                        width = rect.right;
                    } else {
                        width = c19hl.getWidth();
                    }
                    float f5 = width;
                    Rect rect2 = c19hl.LL;
                    if (rect2 != null) {
                        i2 = rect2.top;
                    }
                    float f6 = i2;
                    if (rect2 != null) {
                        height = rect2.bottom;
                    } else {
                        height = c19hl.getHeight();
                    }
                    float f7 = height;
                    Rect rect3 = c19hl.LL;
                    if (rect3 != null) {
                        width2 = rect3.width();
                    } else {
                        width2 = c19hl.getWidth();
                    }
                    float f8 = width2;
                    Rect rect4 = c19hl.LL;
                    if (rect4 != null) {
                        height2 = rect4.height();
                    } else {
                        height2 = c19hl.getHeight();
                    }
                    float f9 = height2;
                    float fMax = Math.max(c19hl.getMaxScale(), 2.0f);
                    if (f3 < c19hl.getMaxScale()) {
                        maxScale = c19hl.getMaxScale();
                    } else {
                        maxScale = f2;
                    }
                    if (maxScale <= fMax) {
                        fMax = maxScale;
                    }
                    if (fMax >= f2) {
                        f2 = fMax;
                    }
                    Matrix matrixLJ = C19HN.LJ(c19hl.LLJJIJI);
                    float f10 = f2 / f3;
                    matrixLJ.postScale(f10, f10, x, y);
                    float f11 = f8 / 2.0f;
                    float f12 = f9 / 2.0f;
                    matrixLJ.postTranslate(f11 - x, f12 - y);
                    Matrix matrixLJ2 = C19HN.LJ(matrixLIZLLL);
                    matrixLJ2.postConcat(matrixLJ);
                    RectF rectFLJI = C19HN.LJI(c19hl.getDrawable().getIntrinsicWidth(), c19hl.getDrawable().getIntrinsicHeight());
                    matrixLJ2.mapRect(rectFLJI);
                    float f13 = rectFLJI.right;
                    float f14 = rectFLJI.left;
                    float f15 = 0.0f;
                    if (f13 - f14 < f8) {
                        f = f11 - ((f13 + f14) / 2.0f);
                    } else if (f14 > f4) {
                        f = f4 - f14;
                    } else if (f13 < f5) {
                        f = f5 - f13;
                    } else {
                        f = 0.0f;
                    }
                    float f16 = rectFLJI.bottom;
                    float f18 = rectFLJI.top;
                    if (f16 - f18 < f9) {
                        f15 = f12 - ((f16 + f18) / 2.0f);
                    } else if (f18 > f6) {
                        f15 = f6 - f18;
                    } else if (f16 < f7) {
                        f15 = f7 - f16;
                    }
                    matrixLJ.postTranslate(f, f15);
                    c19hl.LIZLLL();
                    C19HO c19ho2 = new C19HO(c19hl, c19hl.LLJJIJI, matrixLJ);
                    c19hl.LLJJL = c19ho2;
                    c19ho2.start();
                    C19HS c19hs = C19HN.LIZIZ;
                    if (((LinkedList) c19hs.LIZIZ).size() < c19hs.LIZ) {
                        ((LinkedList) c19hs.LIZIZ).offer(rectFLJI);
                    }
                    C19HN.LIZJ(matrixLJ2);
                    C19HN.LIZJ(matrixLJ);
                    C19HN.LIZJ(matrixLIZLLL);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C19HL c19hl = this.LL;
                View.OnLongClickListener onLongClickListener = c19hl.LLJIJIL;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(c19hl);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C19HL c19hl = this.LL;
                View.OnClickListener onClickListener = c19hl.LLIZ;
                if (onClickListener != null) {
                    onClickListener.onClick(c19hl);
                    return true;
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C19HO c19ho;
                if (this.LL.getPinchMode() == 0 && ((c19ho = this.LL.LLJJL) == null || !c19ho.isRunning())) {
                    C19HL c19hl = this.LL;
                    if (c19hl.LJIIIZ()) {
                        c19hl.LIZLLL();
                        C19HQ c19hq = new C19HQ(c19hl, f / 60.0f, f2 / 60.0f);
                        c19hl.LLJJLIIIJLLLLLLLZ = c19hq;
                        c19hq.start();
                        return true;
                    }
                }
                return true;
            }
        });
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL(float r12, float r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19HL.LJIILLIIL(float, float):boolean");
    }

    public final void LJIIJJI(Matrix matrix, long j, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.LLJJIJIIJIL = 0;
        LIZLLL();
        if (j <= 0) {
            this.LLJJIJI.set(matrix);
            LJFF();
            invalidate();
            return;
        }
        C19HO c19ho = new C19HO(this, this.LLJJIJI, matrix, j);
        if (animatorListener != null) {
            c19ho.addListener(animatorListener);
        }
        if (animatorUpdateListener != null) {
            c19ho.addUpdateListener(animatorUpdateListener);
        }
        c19ho.start();
        this.LLJJL = c19ho;
    }

    public final void LJIILL(float f, float f2, float f3, float f4) {
        float[] fArr;
        float f5 = f - f3;
        float f6 = f2 - f4;
        this.LLJJJJLIIL = C19HN.LIZ(this.LLJJIJI)[0] / ((float) Math.sqrt((f5 * f5) + (f6 * f6)));
        float[] fArr2 = {(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        Matrix matrix = this.LLJJIJI;
        if (matrix != null) {
            fArr = new float[2];
            Matrix matrixLIZLLL = C19HN.LIZLLL();
            matrix.invert(matrixLIZLLL);
            matrixLIZLLL.mapPoints(fArr, fArr2);
            C19HN.LIZJ(matrixLIZLLL);
        } else {
            fArr = new float[2];
        }
        this.LLJJJJJIL.set(fArr[0], fArr[1]);
    }
}
