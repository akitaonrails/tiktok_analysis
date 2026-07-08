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

/* JADX INFO: renamed from: X.0stR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644390stR implements GestureLayout$OnGestureListener {
    public final C1644370stP LL;
    public View LLILLJJLI;
    public final boolean LLILLL = false;
    public float LLILZ;
    public boolean LLILZIL;
    public final int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

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
        if (!this.LLIZLLLIL) {
            this.LLIZ = false;
        } else {
            this.LLIZ = true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return;
        }
        this.LLIZLLLIL = false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        C1644120st0 c1644120st0 = this.LL.LJIIIIZZ;
        if (c1644120st0 != null) {
            c1644120st0.LIZIZ(false);
        }
        if (this.LLJ) {
            HandlerHook.viewPostDelay(this.LLILLJJLI, new ARunnableS125S0100000_25(this, 98), 100L);
        }
        if (this.LLILLL) {
            this.LLILLJJLI.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public C1644390stR(C1644370stP c1644370stP, View view) {
        this.LL = c1644370stP;
        this.LLILLJJLI = view;
        C2216191BoX.LIZ.getClass();
        this.LLILZLL = ViewConfiguration.get(C2216191BoX.LIZ()).getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        this.LLIZLLLIL = true;
        return false;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean zLJ = false;
        this.LLJ = false;
        if (this.LLIZ) {
            this.LLIZ = false;
            if (!this.LLILZIL) {
                if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                    zLJ = this.LL.LJ(f, this.LLILZ);
                }
                this.LLILZ = 0.0f;
            }
        }
        return zLJ;
    }

    @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        boolean z2;
        Integer numValueOf;
        float x = motionEvent2.getX() - motionEvent.getX();
        int iAbs = (int) Math.abs(x);
        int iAbs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        int i = this.LLILZLL;
        if (iAbs > i && iAbs > iAbs2) {
            z = true;
        } else {
            z = false;
        }
        this.LLJ = z;
        if (iAbs > i && iAbs > iAbs2 && !this.LLILZIL) {
            C1644370stP c1644370stP = this.LL;
            if (x > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1644120st0 c1644120st0 = c1644370stP.LJIIIIZZ;
            if (c1644120st0 == null || !c1644120st0.LIZ(z2)) {
                C1644120st0 c1644120st02 = this.LL.LJIIIIZZ;
                if (c1644120st02 != null) {
                    c1644120st02.LIZIZ(true);
                }
                float width = this.LLILZ + (f / this.LLILLJJLI.getWidth());
                this.LLILZ = width;
                float fMin = Math.min(width, 1.0f);
                this.LLILZ = fMin;
                this.LLILZ = Math.max(fMin, -1.0f);
                if (this.LLILLL) {
                    this.LLILLJJLI.getParent().requestDisallowInterceptTouchEvent(true);
                }
                C1644370stP c1644370stP2 = this.LL;
                float f3 = this.LLILZ;
                if (!c1644370stP2.LJIIJJI) {
                    return false;
                }
                if (c1644370stP2.LJIIL != -1) {
                    List list = (List) c1644370stP2.LIZLLL.LJJI().LJI().getValue();
                    Integer numValueOf2 = null;
                    if (list != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    List list2 = (List) c1644370stP2.LIZLLL.LJJI().LJFF().getValue();
                    if (list2 != null) {
                        numValueOf2 = Integer.valueOf(list2.size());
                    }
                    if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
                        c1644370stP2.LIZLLL.LJIJI(-1, true);
                    }
                }
                if (C0BYO.LIZ()) {
                    c1644370stP2.LIZIZ.setPreviewFps(c1644370stP2.LJFF, true);
                }
                c1644370stP2.LIZ(f3);
                return true;
            }
        }
        if (this.LLILLL) {
            this.LLILLJJLI.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
