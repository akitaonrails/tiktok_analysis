package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0Hez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractViewOnTouchListenerC446430Hez implements View.OnTouchListener {
    public final int LL;
    public View LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public InterfaceC446420Hey LLIZ;
    public View.OnTouchListener LLIZLLLIL;
    public long LLJ;
    public final ARunnableS106S0100000_6 LLJI = new ARunnableS106S0100000_6(this, 225);

    public abstract void LIZ(boolean z);

    public AbstractViewOnTouchListenerC446430Hez(Context context) {
        this.LL = -1;
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer numValueOf;
        View.OnTouchListener onTouchListener;
        if (view != null) {
            this.LLILLJJLI = view;
            if (!view.isEnabled()) {
                return false;
            }
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILLL = motionEvent.getX();
                    this.LLILZ = motionEvent.getY();
                    this.LLJ = SystemClock.elapsedRealtime();
                    C810560Vqw.LIZLLL(this.LLJI, 500);
                    LIZ(true);
                    View.OnTouchListener onTouchListener2 = this.LLIZLLLIL;
                    if (onTouchListener2 != null) {
                        onTouchListener2.onTouch(this.LLILLJJLI, motionEvent);
                    }
                } else {
                    if (numValueOf.intValue() == 5) {
                        C810560Vqw.LIZ(this.LLJI);
                        LIZ(false);
                        return true;
                    }
                    if (numValueOf.intValue() == 2) {
                        this.LLILZIL = motionEvent.getX();
                        this.LLILZLL = motionEvent.getY();
                        float fAbs = Math.abs(this.LLILLL - this.LLILZIL);
                        float fAbs2 = Math.abs(this.LLILZ - this.LLILZLL);
                        float f = this.LL;
                        if (fAbs > f || fAbs2 > f) {
                            C810560Vqw.LIZ(this.LLJI);
                            LIZ(false);
                        }
                        View.OnTouchListener onTouchListener3 = this.LLIZLLLIL;
                        if (onTouchListener3 != null) {
                            onTouchListener3.onTouch(this.LLILLJJLI, motionEvent);
                            return true;
                        }
                    } else if (numValueOf.intValue() == 3 || numValueOf.intValue() == 1) {
                        C810560Vqw.LIZ(this.LLJI);
                        LIZ(false);
                        if (SystemClock.elapsedRealtime() - this.LLJ < 500 && (onTouchListener = this.LLIZLLLIL) != null) {
                            onTouchListener.onTouch(this.LLILLJJLI, motionEvent);
                            return true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
