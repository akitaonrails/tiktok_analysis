package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11CS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11CS extends C21610619ho {
    public View LLLIIII;
    public int LLLIIIIL;
    public boolean LLLIIIL;
    public float LLLIIL;
    public float LLLIILIL;
    public float LLLIL;
    public int LLLILZ;

    @Override // X.C21610619ho, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        try {
            if (this.LLLIIII != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 2) {
                        if (this.LLLIIIL) {
                            return false;
                        }
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.LLLILZ);
                        float x = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x - this.LLLIILIL);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y - this.LLLIL);
                        if (fAbs > this.LLLIIIIL && fAbs * 0.5f > fAbs2 && this.LLLIIII.getBottom() > y) {
                            this.LLLIIIL = true;
                            return false;
                        }
                        if (x - this.LLLIILIL > 0.0f) {
                            f = this.LLLIIL + this.LLLIIIIL;
                        } else {
                            f = this.LLLIIL - this.LLLIIIIL;
                        }
                        this.LLLIILIL = f;
                        this.LLLIL = y;
                    }
                } else {
                    float x2 = motionEvent.getX();
                    this.LLLIIL = x2;
                    this.LLLIILIL = x2;
                    this.LLLIL = motionEvent.getY();
                    this.LLLIIIL = false;
                    this.LLLILZ = motionEvent.getPointerId(0);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public void setHeader(View view) {
        this.LLLIIII = view;
    }

    public C11CS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLIIIIL = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.LLLIIIL = false;
        setDoNotCatchException(true);
    }
}
