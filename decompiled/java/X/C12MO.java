package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.12MO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12MO extends C12MM {
    public ScaleGestureDetector LLJJJJ;
    public GestureDetector LLJJJJJIL;
    public float LLJJJJLIIL;
    public int LLJJL;
    public GestureDetector.OnGestureListener LLJJLIIIJLLLLLLLZ;
    public ScaleGestureDetector.OnScaleGestureListener LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public C12MJ LLJLLIL;

    public void setDoubleTapListener(C12MT c12mt) {
    }

    public GestureDetector.OnGestureListener getGestureListener() {
        return new GestureDetector.SimpleOnGestureListener() { // from class: X.12MN
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                C12MO c12mo = this.LL;
                if (c12mo.LLJLIL) {
                    c12mo.LLIZ = true;
                    float scale = c12mo.getScale();
                    C12MO c12mo2 = this.LL;
                    float maxScale = c12mo2.getMaxScale();
                    if (c12mo2.LLJJL == 1) {
                        float f = c12mo2.LLJJJJLIIL;
                        if ((2.0f * f) + scale <= maxScale) {
                            maxScale = scale + f;
                        } else {
                            c12mo2.LLJJL = -1;
                        }
                    } else {
                        c12mo2.LLJJL = 1;
                        maxScale = 1.0f;
                    }
                    this.LL.LJIILJJIL(Math.min(this.LL.getMaxScale(), Math.max(maxScale, this.LL.getMinScale())), motionEvent.getX(), motionEvent.getY(), 200.0f);
                    this.LL.invalidate();
                }
                this.LL.getClass();
                return super.onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                this.LL.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                if (this.LL.isLongClickable() && !this.LL.LLJJJJ.isInProgress()) {
                    this.LL.setPressed(true);
                    this.LL.performLongClick();
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C12ML c12ml;
                C12MJ c12mj = this.LL.LLJLLIL;
                if (c12mj != null && (c12ml = ((C12MI) c12mj).LIZ.LL) != null) {
                    c12ml.LIZIZ();
                }
                this.LL.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                this.LL.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!this.LL.LLJLL || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.LL.LLJJJJ.isInProgress() || this.LL.getScale() == 1.0f) {
                    return false;
                }
                final C12MO c12mo = this.LL;
                c12mo.getClass();
                float x = motionEvent2.getX() - motionEvent.getX();
                float y = motionEvent2.getY() - motionEvent.getY();
                if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
                    return false;
                }
                c12mo.LLIZ = true;
                final double d = x / 2.0f;
                final double d2 = y / 2.0f;
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C786410Ut5.LJJZZIII(c12mo.LLILZIL, new Runnable() { // from class: X.12MP
                    public double LL;
                    public double LLILLJJLI;
                    public final /* synthetic */ double LLILLL = 300.0d;

                    public final void LIZ() {
                        double dMin = Math.min(this.LLILLL, System.currentTimeMillis() - jCurrentTimeMillis);
                        C12MU c12mu = c12mo.LL;
                        double d3 = d;
                        double d4 = this.LLILLL;
                        c12mu.getClass();
                        double d5 = (dMin / d4) - 1.0d;
                        double d6 = (d3 * ((d5 * d5 * d5) + 1.0d)) + 0.0d;
                        C12MU c12mu2 = c12mo.LL;
                        double d7 = d2;
                        double d8 = this.LLILLL;
                        c12mu2.getClass();
                        double d9 = (dMin / d8) - 1.0d;
                        double d10 = (d7 * ((d9 * d9 * d9) + 1.0d)) + 0.0d;
                        c12mo.LJIIIIZZ(d6 - this.LL, d10 - this.LLILLJJLI);
                        this.LL = d6;
                        this.LLILLJJLI = d10;
                        if (dMin < this.LLILLL) {
                            C786410Ut5.LJJZZIII(c12mo.LLILZIL, this);
                            return;
                        }
                        C12MM c12mm = c12mo;
                        RectF rectFLIZLLL = c12mm.LIZLLL(c12mm.LLILLL);
                        float f3 = rectFLIZLLL.left;
                        if (f3 == 0.0f && rectFLIZLLL.top == 0.0f) {
                            return;
                        }
                        c12mo.LJIIIIZZ(f3, rectFLIZLLL.top);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            LIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
                c12mo.invalidate();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!this.LL.LLJLL || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.LL.LLJJJJ.isInProgress()) {
                    return false;
                }
                C12MO c12mo = this.LL;
                if (c12mo.getScale() == 1.0f) {
                    return false;
                }
                c12mo.LLIZ = true;
                c12mo.LJIIIIZZ(-f, -f2);
                c12mo.invalidate();
                return true;
            }
        };
    }

    public ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: X.12MR
            public boolean LL;

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
                float scale = this.LLILLJJLI.getScale() * scaleGestureDetector.getScaleFactor();
                C12MO c12mo = this.LLILLJJLI;
                if (c12mo.LLJLILLLLZIIL) {
                    if (this.LL) {
                        if (currentSpan != 0.0f) {
                            c12mo.LLIZ = true;
                            this.LLILLJJLI.LJIILIIL(Math.min(c12mo.getMaxScale(), Math.max(scale, this.LLILLJJLI.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                            C12MO c12mo2 = this.LLILLJJLI;
                            c12mo2.LLJJL = 1;
                            c12mo2.invalidate();
                            return true;
                        }
                    } else {
                        this.LL = true;
                    }
                }
                return true;
            }
        };
    }

    public boolean getDoubleTapEnabled() {
        return this.LLJLIL;
    }

    @Override // X.C12MM
    public final void LJII(float f) {
        if (f < getMinScale()) {
            float minScale = getMinScale();
            PointF center = getCenter();
            LJIILJJIL(minScale, center.x, center.y, 50.0f);
        }
    }

    @Override // X.C12MM, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LLJJJJ.onTouchEvent(motionEvent);
        if (!this.LLJJJJ.isInProgress()) {
            this.LLJJJJJIL.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1 && getScale() < getMinScale()) {
            float minScale = getMinScale();
            PointF center = getCenter();
            LJIILJJIL(minScale, center.x, center.y, 50.0f);
        }
        return true;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.LLJLIL = z;
    }

    public void setScaleEnabled(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public void setScrollEnabled(boolean z) {
        this.LLJLL = z;
    }

    public void setSingleTapListener(C12MJ c12mj) {
        this.LLJLLIL = c12mj;
    }

    public C12MO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = true;
        this.LLJLL = true;
    }

    @Override // X.C12MM
    public final void LJI(Context context, AttributeSet attributeSet) {
        super.LJI(context, attributeSet);
        ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLJJLIIIJLLLLLLLZ = getGestureListener();
        this.LLJL = getScaleListener();
        this.LLJJJJ = new ScaleGestureDetector(getContext(), this.LLJL);
        this.LLJJJJJIL = new GestureDetector(getContext(), this.LLJJLIIIJLLLLLLLZ, null, true);
        this.LLJJL = 1;
    }

    @Override // X.C12MM
    public final void LIZ(Drawable drawable, Matrix matrix, float f, float f2) {
        super.LIZ(drawable, matrix, f, f2);
        this.LLJJJJLIIL = getMaxScale() / 3.0f;
    }
}
