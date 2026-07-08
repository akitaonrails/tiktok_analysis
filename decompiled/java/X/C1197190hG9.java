package X;

import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0hG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197190hG9 extends LinearLayout {
    public final int LL;
    public int LLILLJJLI;
    public InterfaceC1197180hG8 LLILLL;
    public final OverScroller LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;

    public final void LIZ() {
        this.LLILZ.forceFinished(true);
        this.LLILZ.startScroll(getScrollX(), 0, -getScrollX(), 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        invalidate();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLILZ.computeScrollOffset()) {
            scrollTo(this.LLILZ.getCurrX(), this.LLILZ.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLIZLLLIL = motionEvent.getX();
                this.LLJ = motionEvent.getX();
                this.LLJI = motionEvent.getY();
            } else if (numValueOf.intValue() == 2) {
                boolean z = true;
                if (C426750GoL.LIZLLL(getContext()) ? this.LLJ - motionEvent.getX() >= 0.0f : this.LLJ - motionEvent.getX() <= 0.0f) {
                    z = false;
                }
                this.LLILZIL = z;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 2) {
                return this.LLILZLL;
            }
            if (numValueOf != null) {
                if ((numValueOf.intValue() == 1 || numValueOf.intValue() == 3) && Math.abs(this.LLJ - motionEvent.getX()) < Math.abs(this.LLJI - motionEvent.getY())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 2) {
                float x = (this.LLIZLLLIL - motionEvent.getX()) / 2;
                if (!C426750GoL.LIZLLL(getContext())) {
                    if (x > 0.0f) {
                        if (x >= this.LL || getScrollX() + x >= this.LL) {
                            scrollTo(this.LL, 0);
                            return super.onTouchEvent(motionEvent);
                        }
                    } else if (x < 0.0f && getScrollX() + x <= 0.0f) {
                        scrollTo(0, 0);
                        return super.onTouchEvent(motionEvent);
                    }
                } else if (x < 0.0f) {
                    if (x <= (-this.LL) || getScrollX() + x <= (-this.LL)) {
                        scrollTo(-this.LL, 0);
                        return super.onTouchEvent(motionEvent);
                    }
                } else if (x > 0.0f && getScrollX() + x >= 0.0f) {
                    scrollTo(0, 0);
                    return super.onTouchEvent(motionEvent);
                }
                scrollBy((int) x, 0);
                this.LLIZLLLIL = motionEvent.getX();
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                if (!this.LLILZLL) {
                    return super.onTouchEvent(motionEvent);
                }
                this.LLILZLL = false;
                this.LLILZIL = false;
                float x2 = (this.LLIZLLLIL - motionEvent.getX()) / 2;
                if (!C426750GoL.LIZLLL(getContext())) {
                    if (getScrollX() + x2 >= this.LLILLJJLI) {
                        InterfaceC1197180hG8 interfaceC1197180hG8 = this.LLILLL;
                        if (interfaceC1197180hG8 != null) {
                            interfaceC1197180hG8.LIZIZ();
                        }
                        HandlerHook.viewPostDelay(this, new ARunnableS118S0100000_18(this, 46), 500L);
                    } else {
                        InterfaceC1197180hG8 interfaceC1197180hG82 = this.LLILLL;
                        if (interfaceC1197180hG82 != null) {
                            interfaceC1197180hG82.LIZ();
                        }
                        LIZ();
                    }
                } else if (getScrollX() + x2 <= (-this.LLILLJJLI)) {
                    InterfaceC1197180hG8 interfaceC1197180hG83 = this.LLILLL;
                    if (interfaceC1197180hG83 != null) {
                        interfaceC1197180hG83.LIZIZ();
                    }
                    HandlerHook.viewPostDelay(this, new ARunnableS118S0100000_18(this, 47), 500L);
                } else {
                    InterfaceC1197180hG8 interfaceC1197180hG84 = this.LLILLL;
                    if (interfaceC1197180hG84 != null) {
                        interfaceC1197180hG84.LIZ();
                    }
                    LIZ();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setPager(ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD) {
        viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new C1208680hYg(viewOnAttachStateChangeListenerC20631115oD, this, 1));
    }

    public final void setScrollAction(InterfaceC1197180hG8 interfaceC1197180hG8) {
        this.LLILLL = interfaceC1197180hG8;
    }

    public final void setTriggerLength(int i) {
        if (i > 0) {
            this.LLILLJJLI = Math.abs(i);
        }
    }

    public C1197190hG9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int iLIZIZ = C497820Jfg.LIZIZ(context) / 5;
        this.LL = iLIZIZ;
        this.LLILLJJLI = iLIZIZ;
        this.LLILZ = new OverScroller(context);
    }
}
