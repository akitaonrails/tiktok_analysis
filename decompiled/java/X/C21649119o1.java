package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.19o1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21649119o1 extends C1322100kVc implements InterfaceC1354050lL9 {
    public final RectF LL;
    public final RectF LLILLJJLI;
    public final C21649019o0 LLILLL;
    public final GestureDetector LLILZ;
    public final C21648819ny LLILZIL;
    public C1320700kTM<Object> LLILZLL;
    public final C21649919o9 LLIZ;

    public C21649019o0 LIZ() {
        return new C21649019o0(new C21649319o3(), getContext());
    }

    public C21648919nz LIZJ() {
        return new C21648919nz(this.LLILLL);
    }

    public final void LIZLLL() {
        getHierarchy().LJIIJ(this.LL);
        this.LLILLJJLI.set(0.0f, 0.0f, getWidth(), getHeight());
        C21649019o0 c21649019o0 = this.LLILLL;
        RectF rectF = this.LL;
        if (!rectF.equals(c21649019o0.LLJ)) {
            c21649019o0.LLJ.set(rectF);
            c21649019o0.LJII();
            c21649019o0.LJFF();
        }
        C21649019o0 c21649019o02 = this.LLILLL;
        c21649019o02.LLIZLLLIL.set(this.LLILLJJLI);
        c21649019o02.LJII();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return (int) this.LLILLL.LLIZLLLIL.width();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        C21649019o0 c21649019o0 = this.LLILLL;
        return (int) (c21649019o0.LLIZLLLIL.left - c21649019o0.LLJI.left);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return (int) this.LLILLL.LLJI.width();
    }

    @Override // android.view.View
    public final void computeScroll() {
        C21649019o0 c21649019o0 = this.LLILLL;
        if (c21649019o0.LLJJL.computeScrollOffset()) {
            int currX = c21649019o0.LLJJL.getCurrX();
            int currY = c21649019o0.LLJJL.getCurrY();
            c21649019o0.LLJJIII.set(c21649019o0.LLJJIJIIJIL);
            Matrix matrix = c21649019o0.LLJJIII;
            matrix.postTranslate(currX, currY);
            c21649019o0.LJIIL(matrix);
            Matrix matrix2 = c21649019o0.LLJJIII;
            if (c21649019o0.LLJJJJ.isRunning()) {
                c21649019o0.LJIJ();
            }
            c21649019o0.LLJJIJI.set(matrix2);
            c21649019o0.LLJIJIL.set(matrix2);
            c21649019o0.LJFF();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return (int) this.LLILLL.LLIZLLLIL.height();
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public final int computeVerticalScrollOffset() {
        C21649019o0 c21649019o0 = this.LLILLL;
        return (int) (c21649019o0.LLIZLLLIL.top - c21649019o0.LLJI.top);
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public final int computeVerticalScrollRange() {
        return (int) this.LLILLL.LLJI.height();
    }

    public final RectF getImageBounds() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return super.canScrollVertically(i);
    }

    @Override // X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            canvas.concat(this.LLILLL.LLJIJIL);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.C1322090kVb, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        this.LLILZ.onTouchEvent(motionEvent);
        if (this.LLILLL.LJIILLIIL(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        this.LLILZ.onTouchEvent(motionEventObtain);
        this.LLILLL.LJIILLIIL(motionEventObtain);
        motionEventObtain.recycle();
        return false;
    }

    public final void setAnimationDuration(long j) {
        this.LLILLL.LLJJJJJIL = j;
    }

    @Override // X.C1322090kVb
    public void setController(InterfaceC1320850kTb interfaceC1320850kTb) {
        InterfaceC1320850kTb controller = getController();
        if (controller instanceof AbstractC1320710kTN) {
            ((AbstractC1320710kTN) controller).LJIL(this.LLIZ);
        }
        if (interfaceC1320850kTb instanceof AbstractC1320710kTN) {
            ((AbstractC1320710kTN) interfaceC1320850kTb).LJ(this.LLIZ);
        }
        super.setController(interfaceC1320850kTb);
    }

    public final void setControllerListener(C1320700kTM<Object> c1320700kTM) {
        this.LLILZLL = c1320700kTM;
    }

    public final void setHorizontalNestedScrollEnabled(boolean z) {
        this.LLILLL.LLJJJ = z;
    }

    public final void setMaxScaleFactor(float f) {
        C21649019o0 c21649019o0 = this.LLILLL;
        c21649019o0.getClass();
        if (f >= 1.0f) {
            c21649019o0.LLILZLL = f;
        }
    }

    public final void setScaleFactorRetriever(InterfaceC1765520w2o interfaceC1765520w2o) {
        this.LLILLL.LLJJIJIL = interfaceC1765520w2o;
    }

    public final void setTapListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.LLILZIL.LLILLJJLI = simpleOnGestureListener;
    }

    public final void setTranslationEnabled(boolean z) {
        this.LLILLL.LLILZIL = z;
    }

    public final void setVerticalNestedScrollEnabled(boolean z) {
        this.LLILLL.LLJJJIL = z;
    }

    public final void setZoomingEnabled(boolean z) {
        this.LLILLL.LLILZ = z;
    }

    public C21649119o1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C1322100kVc
    public final void inflateHierarchy(Context context, AttributeSet attributeSet) throws Throwable {
        C1331090kk7 c1331090kk7 = new C1331090kk7(context, context.getResources());
        c1331090kk7.LJIIL = InterfaceC1320380kSq.LIZJ;
        C1335990ks1.LJ(c1331090kk7, context, attributeSet);
        setAspectRatio(c1331090kk7.LIZLLL);
        setHierarchy(c1331090kk7.LIZ());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19o9] */
    public C21649119o1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new RectF();
        this.LLILLJJLI = new RectF();
        this.LLIZ = new C1320700kTM<Object>() { // from class: X.19o9
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZIZ(String str) {
                this.LIZIZ.LLILLL.LJI(false);
                C1320700kTM<Object> c1320700kTM = this.LIZIZ.LLILZLL;
                if (c1320700kTM != null) {
                    c1320700kTM.LIZIZ(str);
                }
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZJ(Object obj, String str) {
                C1320700kTM<Object> c1320700kTM = this.LIZIZ.LLILZLL;
                if (c1320700kTM != null) {
                    c1320700kTM.LIZJ(obj, str);
                }
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str, Object obj, Animatable animatable) {
                C21649119o1 c21649119o1 = this.LIZIZ;
                C21649019o0 c21649019o0 = c21649119o1.LLILLL;
                if (!c21649019o0.LLILLL) {
                    c21649019o0.LJI(true);
                    c21649119o1.LIZLLL();
                }
                C1320700kTM<Object> c1320700kTM = this.LIZIZ.LLILZLL;
                if (c1320700kTM != null) {
                    c1320700kTM.LJ(str, obj, animatable);
                }
            }
        };
        InterfaceC21650719oH interfaceC21650719oH = new InterfaceC21650719oH() { // from class: X.19oB
            @Override // X.InterfaceC21650719oH
            public final void LIZ() {
                this.LIZ.invalidate();
            }
        };
        C21649019o0 c21649019o0LIZ = LIZ();
        this.LLILLL = c21649019o0LIZ;
        c21649019o0LIZ.LLILLJJLI = interfaceC21650719oH;
        C21648819ny c21648819ny = new C21648819ny(LIZJ());
        this.LLILZIL = c21648819ny;
        GestureDetector gestureDetector = new GestureDetector(context, c21648819ny);
        this.LLILZ = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LIZLLL();
    }
}
