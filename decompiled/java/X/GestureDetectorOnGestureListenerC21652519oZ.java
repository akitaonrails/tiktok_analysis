package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.ss.android.ugc.cut_ui_impl.process.clip.gesture.Vector2D;

/* JADX INFO: renamed from: X.19oZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class GestureDetectorOnGestureListenerC21652519oZ extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, InterfaceC21653519oj, View.OnTouchListener {
    public C19290410dS LL;
    public C21653019oe LLILLJJLI;
    public C21652919od LLILLL;
    public C21652619oa LLILZ;
    public boolean LLILZIL;

    public final InterfaceC21654019oo getMOnGestureListener() {
        return null;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
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

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public final void setMOnGestureListener(InterfaceC21654019oo interfaceC21654019oo) {
    }

    public final void setOnGestureListener(InterfaceC21654019oo interfaceC21654019oo) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21653019oe c21653019oe = this.LLILLJJLI;
        C19290410dS c19290410dS = null;
        if (c21653019oe == null) {
            c21653019oe = null;
        }
        c21653019oe.getClass();
        C21652919od c21652919od = this.LLILLL;
        if (c21652919od == null) {
            c21652919od = null;
        }
        c21652919od.getClass();
        if ((motionEvent.getAction() & 255) == 0) {
            this.LLILZIL = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.LLILZIL = true;
        }
        C21652619oa c21652619oa = this.LLILZ;
        if (c21652619oa == null) {
            c21652619oa = null;
        }
        c21652619oa.getClass();
        if (!this.LLILZIL) {
            C19290410dS c19290410dS2 = this.LL;
            if (c19290410dS2 != null) {
                c19290410dS = c19290410dS2;
            }
            c19290410dS.LIZ(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19od] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19oa] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.19oe] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.19on] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.19og] */
    public GestureDetectorOnGestureListenerC21652519oZ(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final ?? r2 = new C21653319oh() { // from class: X.19og
        };
        final ?? r1 = new Object() { // from class: X.19on
        };
        this.LLILLL = new AbstractC21652819oc(context, r2) { // from class: X.19od
        };
        this.LLILZ = new AbstractC21652719ob(context, r1) { // from class: X.19oa
            static {
                new PointF();
            }

            {
                new PointF();
                new PointF();
                new PointF();
            }
        };
        C19290410dS c19290410dS = new C19290410dS(context, this, null);
        this.LL = c19290410dS;
        c19290410dS.LIZIZ(this);
        this.LLILLJJLI = new Object(this) { // from class: X.19oe
            {
                new Vector2D();
            }
        };
        ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        setOnTouchListener(this);
    }
}
