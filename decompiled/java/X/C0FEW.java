package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import zoo.b;

/* JADX INFO: renamed from: X.0FEW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FEW extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public GestureLayout$OnGestureListener LL;
    public C0FBX LLILLJJLI;
    public C19290410dS LLILLL;
    public ScaleGestureDetector LLILZ;
    public C21645419nQ LLILZIL;
    public b LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public GestureLayout$OnGestureListener getOnGestureListener() {
        return this.LL;
    }

    public float getProtectY() {
        return this.LLJILJIL;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.LLILZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C0FBX c0fbx = this.LLILLJJLI;
        if (c0fbx != null) {
            c0fbx.LIZ(canvas);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        if (this.LL == null) {
            return false;
        }
        float x = motionEvent.getX() - this.LLJ;
        float y = motionEvent.getY() - this.LLJI;
        if ((x * x) + (y * y) >= this.LLIZLLLIL) {
            return false;
        }
        float f = i;
        if (motionEvent.getX() >= f && measuredWidth - motionEvent.getX() >= f) {
            float f2 = i2;
            if (motionEvent.getY() >= f2 && measuredHeight - motionEvent.getY() >= f2) {
                return this.LL.LIZIZ(motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL;
        if (gestureLayout$OnGestureListener != null) {
            boolean zOnScale = gestureLayout$OnGestureListener.onScale(scaleGestureDetector);
            if (zOnScale) {
                this.LLIZ = scaleGestureDetector.getScaleFactor();
            }
            return zOnScale;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL;
        if (gestureLayout$OnGestureListener != null && gestureLayout$OnGestureListener.onScaleBegin(scaleGestureDetector)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL;
        if (gestureLayout$OnGestureListener != null) {
            gestureLayout$OnGestureListener.LLLLJI(this.LLIZ);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL;
        if (gestureLayout$OnGestureListener != null && gestureLayout$OnGestureListener.onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LLJ = motionEvent.getX();
        this.LLJI = motionEvent.getY();
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL;
        if (gestureLayout$OnGestureListener != null && gestureLayout$OnGestureListener.onSingleTapUp(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLJILJILJ) {
            return false;
        }
        this.LLILZ.onTouchEvent(motionEvent);
        this.LLILZIL.LIZJ(motionEvent);
        this.LLILZLL.LIZJ(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.LLJIJIL = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.LLJIJIL = true;
        }
        if (!this.LLJIJIL) {
            this.LLILLL.LIZ(motionEvent);
        }
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL;
        if (gestureLayout$OnGestureListener != null) {
            gestureLayout$OnGestureListener.LJIJJ(motionEvent);
        }
        return true;
    }

    public void setEnableTouchEvent(boolean z) {
        this.LLJILJILJ = z;
    }

    public void setIsLongPressEnabled(boolean z) {
        this.LLILLL.LIZ.setIsLongpressEnabled(z);
    }

    public void setMoveSlop(int i) {
        this.LLILZLL.LJIIJ = i;
    }

    public void setOnDispatchDrawListener(C0FBX c0fbx) {
        this.LLILLJJLI = c0fbx;
    }

    public void setOnGestureListener(GestureLayout$OnGestureListener gestureLayout$OnGestureListener) {
        this.LL = gestureLayout$OnGestureListener;
    }

    public void setProtectY(float f) {
        this.LLJILJIL = (f * 17.0f) / 20.0f;
    }

    public void setSloppyExtra(int i) {
        this.LLILZIL.LJIIJJI = i;
    }

    public C0FEW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = 1.0f;
        this.LLJILJIL = 1000.0f;
        this.LLJILJILJ = true;
        C0FEV c0fev = new C0FEV() { // from class: X.0FEU
            @Override // X.C0FEV, X.InterfaceC21645519nR
            public final void LIZ(C21645419nQ c21645419nQ) {
                float fLJI = c21645419nQ.LJI();
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LL;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LJIIIZ(fLJI);
                }
            }

            @Override // X.InterfaceC21645519nR
            public final boolean LIZIZ(C21645419nQ c21645419nQ) {
                float fLJI = c21645419nQ.LJI();
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LL;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LJJLIIIJLJLI(fLJI);
                    return true;
                }
                return true;
            }

            @Override // X.C0FEV, X.InterfaceC21645519nR
            public final void LIZJ(C21645419nQ c21645419nQ) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LL;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.E2(c21645419nQ);
                }
            }
        };
        InterfaceC21645219nO interfaceC21645219nO = new InterfaceC21645219nO() { // from class: X.0FEK
            @Override // X.InterfaceC21645219nO
            public final void LJFF(b bVar) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LL;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LJFF(bVar);
                }
            }

            @Override // X.InterfaceC21645219nO
            public final boolean LLLZLZ(b bVar) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LL;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LLLZLZ(bVar);
                    return true;
                }
                return true;
            }

            @Override // X.InterfaceC21645219nO
            public final void LLLLLLLLL(b bVar, float f, float f2) {
                GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LIZ.LL;
                if (gestureLayout$OnGestureListener != null) {
                    gestureLayout$OnGestureListener.LLLLLLLLL(bVar, f, f2);
                }
            }
        };
        Context contextN3 = C786410Ut5.N3(context);
        this.LLILZIL = new C21645419nQ(contextN3, c0fev);
        this.LLILZLL = new b(contextN3, interfaceC21645219nO);
        C19290410dS c19290410dS = new C19290410dS(contextN3, this, null);
        this.LLILLL = c19290410dS;
        c19290410dS.LIZ.setIsLongpressEnabled(false);
        this.LLILLL.LIZIZ(this);
        this.LLILZ = new ScaleGestureDetector(contextN3, this);
        float scaledDoubleTapSlop = ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.LLIZLLLIL = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.LLILZ.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(this.LLILZ)).intValue();
            Field declaredField2 = this.LLILZ.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.LLILZ, Integer.valueOf(iIntValue * 6));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener;
        if (!this.LLJILJILJ || (gestureLayout$OnGestureListener = this.LL) == null) {
            return false;
        }
        gestureLayout$OnGestureListener.LJJIJIIJIL(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action != 5) {
                    if (action == 6) {
                        this.LL.LIZLLL();
                    }
                } else {
                    this.LL.LJ();
                }
            } else {
                this.LL.onUp(motionEvent);
            }
        } else {
            this.LL.onDown(motionEvent);
        }
        this.LL.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = this.LL;
        if (gestureLayout$OnGestureListener != null && gestureLayout$OnGestureListener.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener;
        if (motionEvent == null || motionEvent2 == null || (gestureLayout$OnGestureListener = this.LL) == null) {
            return false;
        }
        gestureLayout$OnGestureListener.onScroll(motionEvent, motionEvent2, f, f2);
        return true;
    }
}
