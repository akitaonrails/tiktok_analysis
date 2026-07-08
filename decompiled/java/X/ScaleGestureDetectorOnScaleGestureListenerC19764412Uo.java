package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.12Uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class ScaleGestureDetectorOnScaleGestureListenerC19764412Uo extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final Set<InterfaceC576960Mk2> LL;
    public EnumC1779600wPW LLILLJJLI;
    public final ScaleGestureDetector LLILLL;
    public final GestureDetector LLILZ;
    public final int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;
    public float LLJJI;
    public InterfaceC19764512Up LLJJIII;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public ScaleGestureDetectorOnScaleGestureListenerC19764412Uo(Context context) {
        super(context, null, 0);
        this.LL = new CopyOnWriteArraySet();
        this.LLILLJJLI = EnumC1779600wPW.NONE;
        this.LLILLL = new ScaleGestureDetector(getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(getContext(), this);
        this.LLILZ = gestureDetector;
        this.LLILZIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLJILLL = 1.0f;
        this.LLJJI = 10.0f;
        gestureDetector.setOnDoubleTapListener(this);
    }

    public final void LIZ(EnumC1779600wPW enumC1779600wPW) {
        ViewParent parent;
        if (this.LLILLJJLI != enumC1779600wPW) {
            this.LLILLJJLI = enumC1779600wPW;
            if (enumC1779600wPW != EnumC1779600wPW.NONE && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        if (view instanceof InterfaceC576960Mk2) {
            ((CopyOnWriteArraySet) this.LL).add(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC19764512Up interfaceC19764512Up;
        int actionMasked = motionEvent.getActionMasked();
        int childCount = getChildCount();
        if (getChildCount() <= 0 && this.LLJJIII == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (((CopyOnWriteArraySet) this.LL).isEmpty() && this.LLJJIII == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (actionMasked != 0 && !this.LLJJ) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.LLILLL.onTouchEvent(motionEvent);
        this.LLILZ.onTouchEvent(motionEvent);
        this.LLJI = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        this.LLJIJIL = y;
        if (actionMasked == 0) {
            this.LLJILJIL = 0.0f;
            this.LLJILJILJ = 0.0f;
            this.LLIZLLLIL = 0.0f;
            this.LLJ = 0.0f;
            this.LLJJ = false;
            this.LLILLJJLI = EnumC1779600wPW.NONE;
            this.LLJJ = true;
            this.LLJILJIL = this.LLJI;
            this.LLJILJILJ = y;
        } else if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 5) {
                if (this.LLILLJJLI == EnumC1779600wPW.NONE) {
                    LIZ(EnumC1779600wPW.SCALE);
                }
            } else if (actionMasked == 6) {
                if (this.LLILLJJLI == EnumC1779600wPW.SCALE) {
                    LIZ(EnumC1779600wPW.IDLE);
                }
            } else if (actionMasked == 2 && childCount > 0) {
                EnumC1779600wPW enumC1779600wPW = this.LLILLJJLI;
                if (enumC1779600wPW == EnumC1779600wPW.NONE) {
                    if (Math.abs(this.LLJI - this.LLJILJIL) >= this.LLILZIL || Math.abs(this.LLJIJIL - this.LLJILJILJ) >= this.LLILZIL) {
                        LIZ(EnumC1779600wPW.DRAG);
                    }
                } else if (enumC1779600wPW == EnumC1779600wPW.DRAG) {
                    int i = (int) (this.LLJI - this.LLIZLLLIL);
                    this.LLILZLL = i;
                    int i2 = (int) (y - this.LLJ);
                    this.LLIZ = i2;
                    if (i != 0 || i2 != 0) {
                        Iterator it2 = ((CopyOnWriteArraySet) this.LL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC576960Mk2) it2.next()).LJFF(this.LLILZLL, this.LLIZ);
                        }
                        this.LLILZLL = 0;
                        this.LLIZ = 0;
                    }
                }
            }
        } else {
            if (this.LLILLJJLI == EnumC1779600wPW.DRAG && (interfaceC19764512Up = this.LLJJIII) != null) {
                interfaceC19764512Up.LIZJ();
            }
            this.LLJILJIL = 0.0f;
            this.LLJILJILJ = 0.0f;
            this.LLIZLLLIL = 0.0f;
            this.LLJ = 0.0f;
            this.LLJJ = false;
        }
        this.LLIZLLLIL = this.LLJI;
        this.LLJ = this.LLJIJIL;
        if (this.LLILLJJLI == EnumC1779600wPW.NONE) {
            super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        InterfaceC19764512Up interfaceC19764512Up;
        if (this.LLILLJJLI == EnumC1779600wPW.NONE && (interfaceC19764512Up = this.LLJJIII) != null) {
            return interfaceC19764512Up.Ac();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLILLJJLI != EnumC1779600wPW.NONE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[PHI: r1
      0x0039: PHI (r1v6 float) = (r1v5 float), (r1v9 float) binds: [B:11:0x0031, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScale(android.view.ScaleGestureDetector r8) {
        /*
            r7 = this;
            int r6 = r7.getWidth()
            int r2 = r7.getHeight()
            X.0wPW r1 = r7.LLILLJJLI
            X.0wPW r0 = X.EnumC1779600wPW.SCALE
            r5 = 1
            r4 = 0
            if (r1 != r0) goto L49
            r1 = 1
        L11:
            if (r6 <= 0) goto L47
            r0 = 1
        L14:
            r1 = r1 & r0
            if (r1 == 0) goto L6f
            if (r2 <= 0) goto L6f
            float r3 = r8.getCurrentSpan()
            float r0 = r8.getPreviousSpan()
            float r3 = r3 - r0
            float r1 = (float) r6
            float r0 = (float) r2
            float r0 = java.lang.Math.min(r1, r0)
            float r3 = r3 / r0
            float r2 = r7.LLJILLL
            float r3 = r3 * r2
            float r2 = r2 + r3
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L39
            float r1 = r7.LLJJI
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L3a
        L39:
            r2 = r1
        L3a:
            X.12Up r0 = r7.LLJJIII
            if (r0 == 0) goto L4b
            boolean r0 = r0.LIZLLL(r8)
            if (r0 == 0) goto L4b
            r7.LLJILLL = r2
            return r5
        L47:
            r0 = 0
            goto L14
        L49:
            r1 = 0
            goto L11
        L4b:
            float r0 = r7.LLJILLL
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L52
            return r4
        L52:
            r7.LLJILLL = r2
            java.util.Set<X.0Mk2> r0 = r7.LL
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            java.util.Iterator r2 = r0.iterator()
        L5c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r1 = r2.next()
            X.0Mk2 r1 = (X.InterfaceC576960Mk2) r1
            float r0 = r7.LLJILLL
            r1.onScale(r0)
            goto L5c
        L6e:
            return r5
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetectorOnScaleGestureListenerC19764412Uo.onScale(android.view.ScaleGestureDetector):boolean");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.LLILLJJLI == EnumC1779600wPW.SCALE && getWidth() > 0 && getHeight() > 0) {
            if (!((CopyOnWriteArraySet) this.LL).isEmpty() || this.LLJJIII != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        InterfaceC19764512Up interfaceC19764512Up = this.LLJJIII;
        if (interfaceC19764512Up != null) {
            interfaceC19764512Up.LIZIZ();
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC19764512Up interfaceC19764512Up;
        if (this.LLILLJJLI == EnumC1779600wPW.NONE && (interfaceC19764512Up = this.LLJJIII) != null) {
            return interfaceC19764512Up.LIZ();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILLJJLI != EnumC1779600wPW.NONE) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        if (view instanceof InterfaceC576960Mk2) {
            ((CopyOnWriteArraySet) this.LL).remove(view);
        }
    }

    public final void setMaxScale(float f) {
        if (f > 1.0f) {
            this.LLJJI = f;
        }
    }

    public final void setOnGestureInterceptor(InterfaceC19764512Up interfaceC19764512Up) {
        this.LLJJIII = interfaceC19764512Up;
    }
}
