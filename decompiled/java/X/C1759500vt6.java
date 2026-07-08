package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0vt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759500vt6 extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public C1759440vt0 LLILLL;

    public final float getInitialY() {
        return this.LL;
    }

    public final C1759440vt0 getPopupMgr() {
        return this.LLILLL;
    }

    public final float getStartY() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float rawY = motionEvent.getRawY() - this.LLILLJJLI;
                        if (rawY < 100.0f) {
                            float f = this.LL + rawY;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                            setY(f);
                        }
                    }
                } else {
                    float rawY2 = motionEvent.getRawY();
                    float f2 = this.LLILLJJLI;
                    if (rawY2 > f2) {
                        float f3 = this.LL;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setY(f3);
                    } else if (f2 - motionEvent.getRawY() > C958103op.LJ) {
                        clearAnimation();
                        C1759440vt0 c1759440vt0 = this.LLILLL;
                        if (c1759440vt0 != null) {
                            C1759440vt0.LJII(c1759440vt0, this, EnumC1759580vtE.TOP, null, null, null, null, 56);
                        }
                    }
                }
            } else {
                this.LL = getY();
                this.LLILLJJLI = motionEvent.getRawY();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setInitialY(float f) {
        this.LL = f;
    }

    public final void setPopupMgr(C1759440vt0 c1759440vt0) {
        this.LLILLL = c1759440vt0;
    }

    public final void setStartY(float f) {
        this.LLILLJJLI = f;
    }

    public C1759500vt6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
