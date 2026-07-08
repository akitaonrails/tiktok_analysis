package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Qmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnTouchListenerC680650Qmt implements View.OnTouchListener, InterfaceC680690Qmx {
    public final C680660Qmu LLJ;
    public final C19290410dS LLJI;
    public final WeakReference<C1322090kVb<C1331070kk5>> LLJJIII;
    public View.OnLongClickListener LLJJIJIIJIL;
    public InterfaceC680680Qmw LLJJIJIL;
    public boolean LLJJJIL;
    public final float[] LL = new float[9];
    public final RectF LLILLJJLI = new RectF();
    public final Interpolator LLILLL = new AccelerateDecelerateInterpolator();
    public float LLILZ = 0.0f;
    public float LLILZIL = 1.0f;
    public float LLILZLL = 1.75f;
    public float LLIZ = 3.0f;
    public long LLIZLLLIL = 200;
    public boolean LLJIJIL = false;
    public boolean LLJILJIL = true;
    public int LLJILJILJ = 2;
    public final Matrix LLJILLL = new Matrix();
    public int LLJJ = -1;
    public int LLJJI = -1;
    public InterfaceC680580Qmm LLJJIJI = null;
    public final PointF LLJJJ = new PointF();

    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC680650Qmt.LIZJ():boolean");
    }

    public final C1322090kVb<C1331070kk5> LJFF() {
        return this.LLJJIII.get();
    }

    public final float LJI() {
        this.LLJILLL.getValues(this.LL);
        float fPow = (float) Math.pow(this.LL[0], 2.0d);
        this.LLJILLL.getValues(this.LL);
        return (float) Math.sqrt(fPow + ((float) Math.pow(this.LL[3], 2.0d)));
    }

    public final void LIZIZ() {
        C1322090kVb<C1331070kk5> c1322090kVbLJFF = LJFF();
        if (c1322090kVbLJFF != null && LIZJ()) {
            c1322090kVbLJFF.invalidate();
        }
    }

    public ViewOnTouchListenerC680650Qmt(C1322090kVb<C1331070kk5> c1322090kVb) {
        this.LLJJIII = new WeakReference<>(c1322090kVb);
        ((C1331070kk5) c1322090kVb.getHierarchy()).LJIIZILJ(InterfaceC1320380kSq.LIZIZ);
        c1322090kVb.setOnTouchListener(this);
        this.LLJ = new C680660Qmu(c1322090kVb.getContext(), this);
        this.LLJI = new C19290410dS(c1322090kVb.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.0Qmv
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LL;
                View.OnLongClickListener onLongClickListener = viewOnTouchListenerC680650Qmt.LLJJIJIIJIL;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(viewOnTouchListenerC680650Qmt.LJFF());
                }
            }
        }, null);
    }

    @Override // X.InterfaceC680690Qmx
    public final void LIZ(float f) {
        C1322090kVb<C1331070kk5> c1322090kVbLJFF;
        if (this.LLJJJIL && (c1322090kVbLJFF = LJFF()) != null) {
            this.LLJ.getClass();
            this.LLJILLL.postTranslate(0.0f, f);
            LIZIZ();
            InterfaceC680680Qmw interfaceC680680Qmw = this.LLJJIJIL;
            if (interfaceC680680Qmw != null) {
                PointF pointF = this.LLJJJ;
                interfaceC680680Qmw.LIZ(pointF.x + 0.0f, f + pointF.y);
            }
            ViewParent parent = c1322090kVbLJFF.getParent();
            if (parent == null) {
                return;
            }
            if (this.LLJILJIL) {
                this.LLJ.getClass();
                if (!this.LLJIJIL) {
                    if (this.LLJILJILJ == 2) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    return;
                }
            }
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final RectF LJ(Matrix matrix) {
        C1322090kVb<C1331070kk5> c1322090kVbLJFF = LJFF();
        if (c1322090kVbLJFF != null) {
            int i = this.LLJJI;
            if (i == -1 && this.LLJJ == -1) {
                return null;
            }
            this.LLILLJJLI.set(0.0f, 0.0f, i, this.LLJJ);
            ((C1331070kk5) c1322090kVbLJFF.getHierarchy()).LJIIJ(this.LLILLJJLI);
            matrix.mapRect(this.LLILLJJLI);
            return this.LLILLJJLI;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC680650Qmt.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static void LIZLLL(float f, float f2, float f3) {
        if (f < f2) {
            if (f2 < f3) {
                return;
            } else {
                throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
            }
        }
        throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
    }
}
