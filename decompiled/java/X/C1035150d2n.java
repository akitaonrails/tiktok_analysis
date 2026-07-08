package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: X.0d2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035150d2n extends LinearLayout implements InterfaceC1003660cE0 {
    public final Rect LL;
    public float LLILLJJLI;
    public float LLILLL;
    public final int LLILZ;
    public SoftReference<InterfaceC1035160d2o> LLILZIL;
    public boolean LLILZLL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        InterfaceC1035160d2o interfaceC1035160d2o;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLILLJJLI = motionEvent.getRawX();
                this.LLILLL = motionEvent.getRawY();
            } else if (numValueOf.intValue() == 2) {
                SoftReference<InterfaceC1035160d2o> softReference = this.LLILZIL;
                if (softReference != null && (interfaceC1035160d2o = softReference.get()) != null) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    float f = rawY - this.LLILLL;
                    if (Math.abs(f) > Math.abs(rawX - this.LLILLJJLI) && Math.abs(f) > this.LLILZ) {
                        getGlobalVisibleRect(this.LL);
                        Rect rect = this.LL;
                        if (rawY <= rect.bottom && rawY >= rect.top) {
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                        if (interfaceC1035160d2o.LIZIZ(rawX, rawY)) {
                            return true;
                        }
                    } else {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                } else {
                    return super.onInterceptTouchEvent(motionEvent);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1035160d2o interfaceC1035160d2o;
        Integer numValueOf;
        SoftReference<InterfaceC1035160d2o> softReference = this.LLILZIL;
        if (softReference != null && (interfaceC1035160d2o = softReference.get()) != null) {
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILZLL = false;
                } else if (numValueOf != null) {
                    if (numValueOf.intValue() == 2) {
                        if (this.LLILZLL) {
                            return super.onTouchEvent(motionEvent);
                        }
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        if (Math.abs(rawY - this.LLILLL) < this.LLILZ) {
                            return super.onTouchEvent(motionEvent);
                        }
                        if (interfaceC1035160d2o.LJI(this.LLILLL, rawX, rawY)) {
                            this.LLILZLL = true;
                            return true;
                        }
                    } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                        this.LLILZLL = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC1003660cE0
    public void setScrollViewOutListener(InterfaceC1035160d2o interfaceC1035160d2o) {
        if (interfaceC1035160d2o == null) {
            this.LLILZIL = null;
        } else {
            this.LLILZIL = new SoftReference<>(interfaceC1035160d2o);
        }
    }

    public C1035150d2n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Rect();
        this.LLILZ = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
    }
}
