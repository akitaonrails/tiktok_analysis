package X;

import Y.ARunnableS125S0100000_25;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.0stS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644400stS implements GestureLayout$OnGestureListener {
    public final C1644380stQ LL;
    public final View LLILLJJLI;
    public float LLILLL;
    public boolean LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZLLL() {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJ() {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJIJJ(MotionEvent motionEvent) {
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJJIJIIJIL(MotionEvent motionEvent) {
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLZLZ(b bVar) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLIZ) {
            this.LLILZLL = false;
        } else {
            this.LLILZLL = true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return;
        }
        this.LLIZ = false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        if (this.LLIZLLLIL) {
            HandlerHook.viewPostDelay(this.LLILLJJLI, new ARunnableS125S0100000_25(this, 82), 100L);
            return false;
        }
        return false;
    }

    public C1644400stS(C1644380stQ c1644380stQ, View view) {
        this.LL = c1644380stQ;
        this.LLILLJJLI = view;
        C2216191BoX.LIZ.getClass();
        this.LLILZIL = ViewConfiguration.get(C2216191BoX.LIZ()).getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        this.LLIZ = true;
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean zLIZLLL = false;
        this.LLIZLLLIL = false;
        if (this.LLILZLL) {
            this.LLILZLL = false;
            if (!this.LLILZ) {
                if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                    zLIZLLL = this.LL.LIZLLL(f, this.LLILLL);
                }
                this.LLILLL = 0.0f;
            }
        }
        return zLIZLLL;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        Integer numValueOf;
        int iAbs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int iAbs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        int i = this.LLILZIL;
        if (iAbs > i && iAbs > iAbs2) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        if (iAbs <= i || iAbs <= iAbs2 || this.LLILZ) {
            return false;
        }
        float width = this.LLILLL + (f / this.LLILLJJLI.getWidth());
        this.LLILLL = width;
        float fMin = Math.min(width, 1.0f);
        this.LLILLL = fMin;
        float fMax = Math.max(fMin, -1.0f);
        this.LLILLL = fMax;
        C1644380stQ c1644380stQ = this.LL;
        if (!c1644380stQ.LJIIJ) {
            return false;
        }
        if (c1644380stQ.LJIIJJI != -1) {
            List list = (List) c1644380stQ.LIZLLL.LJJI().LJI().getValue();
            Integer numValueOf2 = null;
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            List list2 = (List) c1644380stQ.LIZLLL.LJJI().LJFF().getValue();
            if (list2 != null) {
                numValueOf2 = Integer.valueOf(list2.size());
            }
            if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
                c1644380stQ.LIZLLL.LJIJI(-1, true);
            }
        }
        if (C0BYO.LIZ()) {
            c1644380stQ.LIZIZ.setPreviewFps(c1644380stQ.LJFF, true);
        }
        c1644380stQ.LIZ(fMax);
        return true;
    }
}
