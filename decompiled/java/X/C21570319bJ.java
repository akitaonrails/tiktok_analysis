package X;

import Y.ALAdapterS12S0100000_16;
import Y.ALAdapterS27S0100000_33;
import Y.ALAdapterS27S0200000_33;
import Y.ARunnableS1S0600001_33;
import Y.AUListenerS279S0100000_32;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeConverter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19bJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21570319bJ extends AbstractC21570219bI implements InterfaceC568550MRp {
    public static final C2189481AmY LLJJL = new C2189481AmY(0);
    public static final C2189481AmY LLJJLIIIJLLLLLLLZ = new C2189481AmY(PointF.class, 1);
    public C21570619bM LLJILJILJ;
    public InterfaceC21573019bk LLJILLL;
    public RectF LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public Matrix LLJJJ;
    public AnimatorSet LLJJJIL;
    public ARunnableS1S0600001_33 LLJJJJ;
    public C21570719bN LLJJJJJIL;
    public TimeInterpolator LLJJJJLIIL;

    private Animator getAlphaToFullTransparentAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLJJIJIL, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 40));
        return valueAnimatorOfFloat;
    }

    public ValueAnimator getDefaultDisappearFallbackAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(this, 11));
        return valueAnimatorOfFloat;
    }

    @Override // X.InterfaceC568550MRp
    public final void reset() {
    }

    public void setGestureCallback(InterfaceC21571919bZ interfaceC21571919bZ) {
    }

    public RectF getBaseOriginDisplayRect() {
        if (this.LLJJ != null) {
            return new RectF(this.LLJJ);
        }
        return null;
    }

    public TimeInterpolator getInterpolator() {
        return this.LLJJJJLIIL;
    }

    public final void LJII(float f) {
        InterfaceC21573019bk interfaceC21573019bk;
        if (f > 0.0f) {
            if (Math.abs(f) > getHeight() * 0.2f && (interfaceC21573019bk = this.LLJILLL) != null) {
                interfaceC21573019bk.onExit();
                return;
            }
        } else if (f == 0.0f) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C19727612Gk(), new Matrix(this.LLJJJ), new Matrix(new Matrix()));
        valueAnimatorOfObject.addUpdateListener(new AUListenerS280S0100000_33(this, 41));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLJJIJIL, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 40));
        animatorSet.playTogether(valueAnimatorOfObject, valueAnimatorOfFloat);
        animatorSet.addListener(new ALAdapterS27S0100000_33(this, 8));
        animatorSet.start();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21570619bM c21570619bM = this.LLJILJILJ;
        if (c21570619bM != null) {
            if (motionEvent.getActionMasked() == 0) {
                c21570619bM.LIZLLL = false;
                c21570619bM.LJ = false;
            }
            if (c21570619bM.LIZLLL) {
                if (!c21570619bM.LJ) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    c21570619bM.LIZIZ.onTouchEvent(motionEventObtain);
                    c21570619bM.LIZ.onTouchEvent(motionEventObtain);
                    c21570619bM.LJ = true;
                }
            } else {
                boolean zOnTouchEvent = c21570619bM.LIZIZ.onTouchEvent(motionEvent);
                c21570619bM.LJFF = MotionEvent.obtain(motionEvent);
                c21570619bM.LIZ.onTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    C21570319bJ c21570319bJ = ((C21570519bL) c21570619bM.LIZJ).LL;
                    int i = (int) c21570319bJ.LLJJI;
                    c21570319bJ.LLJJI = 0.0f;
                    c21570319bJ.LLJJIII = false;
                    c21570319bJ.LLJJIJI = 0.0f;
                    c21570319bJ.LLJJIJIIJIL = 0.0f;
                    c21570319bJ.LJII(i);
                }
                if (motionEvent.getActionMasked() == 6) {
                    GestureDetectorOnGestureListenerC21571019bQ gestureDetectorOnGestureListenerC21571019bQ = c21570619bM.LIZJ;
                    motionEvent.getPointerId(0);
                    C21570319bJ c21570319bJ2 = ((C21570519bL) gestureDetectorOnGestureListenerC21571019bQ).LL;
                    int i2 = (int) c21570319bJ2.LLJJI;
                    c21570319bJ2.LLJJI = 0.0f;
                    c21570319bJ2.LLJJIII = false;
                    c21570319bJ2.LLJJIJI = 0.0f;
                    c21570319bJ2.LLJJIJIIJIL = 0.0f;
                    C21570619bM c21570619bM2 = c21570319bJ2.LLJILJILJ;
                    if (c21570619bM2 != null) {
                        c21570619bM2.LIZLLL = true;
                    }
                    c21570319bJ2.LJII(i2);
                }
                return zOnTouchEvent;
            }
        }
        return false;
    }

    @Override // X.InterfaceC568550MRp
    public void setGestureListener(InterfaceC21573019bk interfaceC21573019bk) {
        this.LLJILLL = interfaceC21573019bk;
    }

    public void setImageMatrix(Matrix matrix) {
        this.LLJJJ = matrix;
        invalidate();
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.LLJJJJLIIL = timeInterpolator;
    }

    public C21570319bJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJIJIL = 1.0f;
        this.LLJJJ = new Matrix();
        this.LLJJJJLIIL = new C12DM();
        this.LLJILJILJ = new C21570619bM(getContext(), new C21570519bL(this));
    }

    public final Matrix LJFF(Rect rect, InterfaceC21567619as interfaceC21567619as) {
        float f;
        float f2;
        int width = getWidth();
        int height = getHeight();
        int iWidth = (int) this.LLJJ.width();
        int iHeight = (int) this.LLJJ.height();
        if (iWidth != 0 && iHeight != 0 && iHeight / iWidth < height / width) {
            f = width;
            f2 = iWidth;
        } else {
            f = height;
            f2 = iHeight;
        }
        float f3 = f / f2;
        int i = iHeight / 2;
        float f4 = (height / 2) - i;
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3, iWidth / 2, i);
        matrix.postTranslate((width / 2) - r5, f4);
        RectF rectF = new RectF(0.0f, 0.0f, iWidth, iHeight);
        matrix.mapRect(rectF, rectF);
        if (interfaceC21567619as != null) {
            return interfaceC21567619as.LIZ(rect, rectF);
        }
        return new C21567519ar().LIZ(rect, rectF);
    }

    @Override // X.InterfaceC568550MRp
    public final void setVideoSize(int i, int i2) {
        ARunnableS1S0600001_33 aRunnableS1S0600001_33;
        this.LLJJ = new RectF(0.0f, 0.0f, i, i2);
        if (getWidth() > 0 && getHeight() > 0 && (aRunnableS1S0600001_33 = this.LLJJJJ) != null) {
            aRunnableS1S0600001_33.run();
        }
    }

    @Override // X.AbstractC21570219bI
    public final boolean LIZLLL(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.concat(this.LLJJJ);
        boolean zLIZLLL = super.LIZLLL(canvas, view, j);
        canvas.restore();
        return zLIZLLL;
    }

    public final Animator LJI(Matrix matrix, Matrix matrix2, C21570819bO c21570819bO) {
        C21571619bW c21571619bW;
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        this.LLJJJJJIL = new C21570719bN(this, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.LLJJJJJIL, PropertyValuesHolder.ofObject(LLJJL, new C194Y(new float[9]), fArr, fArr2));
        if (c21570819bO != null) {
            objectAnimatorOfPropertyValuesHolder.setDuration(c21570819bO.LJFF);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(c21570819bO.LIZIZ);
        }
        if (c21570819bO == null || (c21571619bW = c21570819bO.LJIIIIZZ) == null) {
            c21571619bW = C21570819bO.LJIIIZ;
        }
        RectF rectF = new RectF(getBaseOriginDisplayRect());
        RectF rectF2 = new RectF();
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF2, rectF);
        matrix2.mapRect(rectF3, rectF);
        float fCenterX = rectF2.centerX();
        float fCenterY = rectF2.centerY();
        float fCenterX2 = rectF3.centerX();
        float fCenterY2 = rectF3.centerY();
        c21571619bW.getClass();
        Path path = new Path();
        path.moveTo(fCenterX, fCenterY);
        path.lineTo(fCenterX2, fCenterY2);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.LLJJJJJIL, PropertyValuesHolder.ofObject(LLJJLIIIJLLLLLLLZ, (TypeConverter) null, path));
        if (c21570819bO != null) {
            objectAnimatorOfPropertyValuesHolder2.setDuration(c21570819bO.LJ);
            objectAnimatorOfPropertyValuesHolder2.setInterpolator(c21570819bO.LIZ);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
        animatorSet.addListener(new ALAdapterS27S0100000_33(this, 9));
        return animatorSet;
    }

    @Override // X.InterfaceC568550MRp
    public final void LIZIZ(Rect rect, Rect rect2, C21567519ar c21567519ar, C21570819bO c21570819bO) {
        this.LLJJJJ = new ARunnableS1S0600001_33(this, rect, rect2, c21567519ar, c21570819bO, 0);
        if (this.LLJJ != null && getWidth() > 0 && getHeight() > 0) {
            this.LLJJJJ.run();
        }
    }

    @Override // X.AbstractC21570219bI, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ARunnableS1S0600001_33 aRunnableS1S0600001_33;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJJ != null && getWidth() > 0 && getHeight() > 0 && (aRunnableS1S0600001_33 = this.LLJJJJ) != null) {
            aRunnableS1S0600001_33.run();
        }
    }

    @Override // X.InterfaceC568550MRp
    public final void LIZ(Rect rect, Rect rect2, C21567519ar c21567519ar, C21570819bO c21570819bO, Function0 function0) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!isAttachedToWindow()) {
            function0.invoke();
            return;
        }
        RectF rectF = this.LLJJ;
        if (rectF != null && !rectF.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (rect != null && !rect.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rect2 != null && !rect2.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z && !z2 && !z3) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            rect.offset(-iArr[0], -iArr[1]);
            rect2.offset(-iArr[0], -iArr[1]);
            Animator animatorLJI = LJI(new Matrix(this.LLJJJ), new Matrix(LJFF(rect, c21567519ar)), c21570819bO);
            Animator animatorLJ = LJ(new Rect(rect), rect2, 0.0f, true);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorLJ);
            animatorSet.setDuration(c21570819bO.LJI);
            animatorSet.setInterpolator(c21570819bO.LIZJ);
            Animator alphaToFullTransparentAnimator = getAlphaToFullTransparentAnimator();
            alphaToFullTransparentAnimator.setDuration(c21570819bO.LJII);
            alphaToFullTransparentAnimator.setInterpolator(c21570819bO.LIZLLL);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.LLJJJIL = animatorSet2;
            animatorSet2.playTogether(animatorLJI, animatorSet, alphaToFullTransparentAnimator);
            this.LLJJJIL.setInterpolator(getInterpolator());
            this.LLJJJIL.addListener(new ALAdapterS27S0200000_33(function0, this, 3));
            this.LLJJJIL.start();
            return;
        }
        ValueAnimator defaultDisappearFallbackAnimator = getDefaultDisappearFallbackAnimator();
        defaultDisappearFallbackAnimator.addListener(new ALAdapterS12S0100000_16(function0, 15));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.LLJJJIL = animatorSet3;
        animatorSet3.addListener(new ALAdapterS27S0100000_33(this, 19));
        this.LLJJJIL.playTogether(defaultDisappearFallbackAnimator, getAlphaToFullTransparentAnimator());
        this.LLJJJIL.setInterpolator(getInterpolator());
        this.LLJJJIL.setDuration(200L);
        this.LLJJJIL.start();
    }
}
