package X;

import Y.ARunnableS4S0100001_16;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002290cBn extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public final int LLILZIL;
    public Function0<C1002300cBo> LLILZLL;
    public C1002300cBo LLIZ;
    public Function2<? super Float, ? super Float, Unit> LLIZLLLIL;

    public C1002290cBn(Context context) {
        super(context, null, 0);
        this.LLILZIL = ViewConfiguration.get(context).getScaledTouchSlop();
        setClickable(true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1002300cBo c1002300cBoInvoke;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && (Math.abs(motionEvent.getRawX() - this.LL) > this.LLILZIL || Math.abs(motionEvent.getRawY() - this.LLILLJJLI) > this.LLILZIL)) {
                return true;
            }
        } else {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.LL = motionEvent.getRawX();
            this.LLILLJJLI = motionEvent.getRawY();
            this.LLILLL = getX();
            this.LLILZ = getY();
            Function0<C1002300cBo> function0 = this.LLILZLL;
            if (function0 != null) {
                c1002300cBoInvoke = function0.invoke();
            } else {
                c1002300cBoInvoke = null;
            }
            this.LLIZ = c1002300cBoInvoke;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        float f;
        int i;
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        int i2 = 0;
        if (view == null) {
            return false;
        }
        int action = motionEvent.getAction();
        float width = 0.0f;
        if (action != 1) {
            if (action != 2) {
                return super.onTouchEvent(motionEvent);
            }
            float rawX = motionEvent.getRawX() - this.LL;
            float rawY = motionEvent.getRawY() - this.LLILLJJLI;
            float f2 = this.LLILLL + rawX;
            C1002300cBo c1002300cBo = this.LLIZ;
            if (c1002300cBo != null) {
                f = c1002300cBo.LIZ;
            } else {
                f = 0.0f;
            }
            int width2 = view.getWidth();
            C1002300cBo c1002300cBo2 = this.LLIZ;
            if (c1002300cBo2 != null) {
                i = c1002300cBo2.LIZJ;
            } else {
                i = 0;
            }
            float fLIZLLL = C13LZ.LIZLLL(f2, f, (width2 - i) - getWidth());
            float f3 = this.LLILZ + rawY;
            C1002300cBo c1002300cBo3 = this.LLIZ;
            if (c1002300cBo3 != null) {
                width = c1002300cBo3.LIZIZ;
            }
            float fLIZJ = width + C497820Jfg.LIZJ(getContext());
            int height = view.getHeight();
            C1002300cBo c1002300cBo4 = this.LLIZ;
            if (c1002300cBo4 != null) {
                i2 = c1002300cBo4.LIZLLL;
            }
            float fLIZLLL2 = C13LZ.LIZLLL(f3, fLIZJ, (height - i2) - getHeight());
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(fLIZLLL);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setY(fLIZLLL2);
            return true;
        }
        if (getX() + (getWidth() / 2) >= view.getWidth() / 2) {
            width = view.getWidth() - getWidth();
        }
        animate().x(width).setDuration(300L).withEndAction(new ARunnableS4S0100001_16(this, width, 0)).start();
        return true;
    }

    public final void setOnDragEndListener(Function2<? super Float, ? super Float, Unit> function2) {
        this.LLIZLLLIL = function2;
    }
}
