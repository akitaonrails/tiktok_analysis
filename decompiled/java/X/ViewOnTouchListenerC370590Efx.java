package X;

import Y.ARunnableS105S0100000_5;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS283S0300000_5;

/* JADX INFO: renamed from: X.0Efx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnTouchListenerC370590Efx implements View.OnTouchListener {
    public final InterfaceC370600Efy LL;
    public final Function2<Float, MotionEvent, Unit> LLILLJJLI;
    public final int LLILLL = ViewConfiguration.get(C0EHL.LIZ()).getScaledTouchSlop();
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public final long LLILZIL = ViewConfiguration.getLongPressTimeout();
    public final ARunnableS105S0100000_5 LLILZLL = new ARunnableS105S0100000_5(this, 143);
    public final ARunnableS105S0100000_5 LLIZ = new ARunnableS105S0100000_5(this, 142);
    public float LLIZLLLIL;
    public float LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public float LLJILJIL;
    public MotionEvent LLJILJILJ;

    public ViewOnTouchListenerC370590Efx(C368650Ecp c368650Ecp, AwS283S0300000_5 awS283S0300000_5) {
        this.LL = c368650Ecp;
        this.LLILLJJLI = awS283S0300000_5;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.LLJILJILJ = motionEvent;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (this.LLJIJIL) {
                            this.LL.LIZJ();
                            this.LLJIJIL = false;
                        }
                        if (this.LLJI) {
                            this.LLJI = false;
                        } else {
                            this.LLILZ.removeCallbacks(this.LLILZLL);
                            return true;
                        }
                    }
                    return true;
                }
                float rawX = motionEvent.getRawX() - this.LLIZLLLIL;
                float rawY = motionEvent.getRawY() - this.LLJ;
                if (this.LLJIJIL) {
                    InterfaceC370600Efy interfaceC370600Efy = this.LL;
                    float rawX2 = motionEvent.getRawX();
                    motionEvent.getRawY();
                    interfaceC370600Efy.LIZIZ(rawX2, rawX, rawY);
                }
                if (!this.LLJI) {
                    int i = this.LLILLL;
                    if (i * i <= (rawX * rawX) + (rawY * rawY)) {
                        this.LLILZ.removeCallbacks(this.LLILZLL);
                        this.LLJI = true;
                    }
                }
                this.LLIZLLLIL = motionEvent.getRawX();
                this.LLJ = motionEvent.getRawY();
                return true;
            }
            if (this.LLJIJIL) {
                this.LL.LIZJ();
                this.LLJIJIL = false;
            } else if (!this.LLJI) {
                this.LLILZ.removeCallbacks(this.LLILZLL);
                this.LLJILJIL = motionEvent.getX();
                this.LLIZ.run();
            }
            System.currentTimeMillis();
            this.LLJI = false;
            return true;
        }
        this.LLIZLLLIL = motionEvent.getRawX();
        this.LLJ = motionEvent.getRawY();
        System.currentTimeMillis();
        C786410Ut5.LJLIIL(this.LLILZIL, this.LLILZ, this.LLILZLL);
        return true;
    }
}
