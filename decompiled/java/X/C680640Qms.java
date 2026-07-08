package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Qms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C680640Qms extends C1322110kVd {
    public InterfaceC680580Qmm LL;
    public ViewOnTouchListenerC680650Qmt LLILLJJLI;

    public InterfaceC680710Qmz getOnPhotoTapListener() {
        return null;
    }

    public InterfaceC680730Qn1 getOnViewTapListener() {
        return null;
    }

    public void setEnableScale(boolean z) {
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
    }

    public void setOnMatrixChangeListener(InterfaceC680700Qmy interfaceC680700Qmy) {
    }

    public void setOnPhotoTapListener(InterfaceC680710Qmz interfaceC680710Qmz) {
    }

    public void setOnScaleChangeListener(InterfaceC680720Qn0 interfaceC680720Qn0) {
    }

    public void setOnViewTapListener(InterfaceC680730Qn1 interfaceC680730Qn1) {
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            return viewOnTouchListenerC680650Qmt.LLIZ;
        }
        return 0.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            return viewOnTouchListenerC680650Qmt.LLILZLL;
        }
        return 0.0f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            return viewOnTouchListenerC680650Qmt.LLILZIL;
        }
        return 0.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            return viewOnTouchListenerC680650Qmt.LLILZ;
        }
        return 0.0f;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt == null || viewOnTouchListenerC680650Qmt.LJFF() == null) {
            this.LLILLJJLI = new ViewOnTouchListenerC680650Qmt(this);
        }
        super.onAttachedToWindow();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final ViewOnTouchListenerC680650Qmt getAttacher() {
        return this.LLILLJJLI;
    }

    public final InterfaceC680580Qmm getBottomPanelViewModel() {
        return this.LL;
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
            if (viewOnTouchListenerC680650Qmt != null) {
                canvas.concat(viewOnTouchListenerC680650Qmt.LLJILLL);
            }
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
        InterfaceC680580Qmm interfaceC680580Qmm;
        InterfaceC680580Qmm interfaceC680580Qmm2;
        InterfaceC680580Qmm interfaceC680580Qmm3;
        InterfaceC680580Qmm interfaceC680580Qmm4 = this.LL;
        if ((interfaceC680580Qmm4 != null && interfaceC680580Qmm4.Hj1() == 3) || ((interfaceC680580Qmm = this.LL) != null && interfaceC680580Qmm.Hj1() == 4)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        if (motionEvent.getAction() == 0 && (interfaceC680580Qmm2 = this.LL) != null && interfaceC680580Qmm2.Hj1() == 5 && (interfaceC680580Qmm3 = this.LL) != null && interfaceC680580Qmm3.p90(getContext(), motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            viewOnTouchListenerC680650Qmt.LLJILJIL = z;
        }
    }

    public final void setBottomPanelViewModel(InterfaceC680580Qmm interfaceC680580Qmm) {
        this.LL = interfaceC680580Qmm;
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            viewOnTouchListenerC680650Qmt.LLJJIJI = interfaceC680580Qmm;
        }
    }

    public final void setCanDrag(boolean z) {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            viewOnTouchListenerC680650Qmt.LLJJJIL = z;
        }
    }

    public void setMaximumScale(float f) {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            ViewOnTouchListenerC680650Qmt.LIZLLL(viewOnTouchListenerC680650Qmt.LLILZIL, viewOnTouchListenerC680650Qmt.LLILZLL, f);
            viewOnTouchListenerC680650Qmt.LLIZ = f;
        }
    }

    public void setMediumScale(float f) {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            ViewOnTouchListenerC680650Qmt.LIZLLL(viewOnTouchListenerC680650Qmt.LLILZIL, f, viewOnTouchListenerC680650Qmt.LLIZ);
            viewOnTouchListenerC680650Qmt.LLILZLL = f;
        }
    }

    public void setMinimumScale(float f) {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            ViewOnTouchListenerC680650Qmt.LIZLLL(f, viewOnTouchListenerC680650Qmt.LLILZLL, viewOnTouchListenerC680650Qmt.LLIZ);
            viewOnTouchListenerC680650Qmt.LLILZIL = f;
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            viewOnTouchListenerC680650Qmt.LLJJIJIIJIL = onLongClickListener;
        }
    }

    public final void setOnViewDragListener(InterfaceC680680Qmw interfaceC680680Qmw) {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            viewOnTouchListenerC680650Qmt.LLJJIJIL = interfaceC680680Qmw;
        }
    }

    public void setScale(float f) {
        C1322090kVb<C1331070kk5> c1322090kVbLJFF;
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null && (c1322090kVbLJFF = viewOnTouchListenerC680650Qmt.LJFF()) != null) {
            float right = c1322090kVbLJFF.getRight() / 2;
            float bottom = c1322090kVbLJFF.getBottom() / 2;
            if (viewOnTouchListenerC680650Qmt.LJFF() != null && f >= viewOnTouchListenerC680650Qmt.LLILZIL && f <= viewOnTouchListenerC680650Qmt.LLIZ) {
                viewOnTouchListenerC680650Qmt.LLJILLL.setScale(f, f, right, bottom);
                viewOnTouchListenerC680650Qmt.LIZIZ();
            }
        }
    }

    public void setZoomTransitionDuration(long j) {
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt != null) {
            if (j < 0) {
                j = 200;
            }
            viewOnTouchListenerC680650Qmt.LLIZLLLIL = j;
        }
    }

    public C680640Qms(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewOnTouchListenerC680650Qmt viewOnTouchListenerC680650Qmt = this.LLILLJJLI;
        if (viewOnTouchListenerC680650Qmt == null || viewOnTouchListenerC680650Qmt.LJFF() == null) {
            this.LLILLJJLI = new ViewOnTouchListenerC680650Qmt(this);
        }
    }
}
